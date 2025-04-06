import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dplistarunidades extends GXProcedure
{
   public dplistarunidades( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dplistarunidades.class ), "" );
   }

   public dplistarunidades( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<SdtsdtListaUnidades_sdtListaUnidadesItem> executeUdp( long aP0 ,
                                                                                 long aP1 )
   {
      dplistarunidades.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<SdtsdtListaUnidades_sdtListaUnidadesItem>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        GXBaseCollection<SdtsdtListaUnidades_sdtListaUnidadesItem>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             GXBaseCollection<SdtsdtListaUnidades_sdtListaUnidadesItem>[] aP2 )
   {
      dplistarunidades.this.AV7PageNumber = aP0;
      dplistarunidades.this.AV6PageSize = aP1;
      dplistarunidades.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXPagingFrom2 = (int)((AV7PageNumber-1)*AV6PageSize) ;
      GXPagingTo2 = (int)(AV6PageSize) ;
      /* Using cursor P00042 */
      pr_default.execute(0, new Object[] {Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4unid_id = P00042_A4unid_id[0] ;
         A5unid_nome = P00042_A5unid_nome[0] ;
         A6unid_sigla = P00042_A6unid_sigla[0] ;
         Gxm1sdtlistaunidades = (SdtsdtListaUnidades_sdtListaUnidadesItem)new SdtsdtListaUnidades_sdtListaUnidadesItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtlistaunidades, 0);
         Gxm1sdtlistaunidades.setgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id( A4unid_id );
         Gxm1sdtlistaunidades.setgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome( A5unid_nome );
         Gxm1sdtlistaunidades.setgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla( A6unid_sigla );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dplistarunidades.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<SdtsdtListaUnidades_sdtListaUnidadesItem>(SdtsdtListaUnidades_sdtListaUnidadesItem.class, "sdtListaUnidadesItem", "SeletivoSEPLAG", remoteHandle);
      scmdbuf = "" ;
      P00042_A4unid_id = new short[1] ;
      P00042_A5unid_nome = new String[] {""} ;
      P00042_A6unid_sigla = new String[] {""} ;
      A5unid_nome = "" ;
      A6unid_sigla = "" ;
      Gxm1sdtlistaunidades = new SdtsdtListaUnidades_sdtListaUnidadesItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new dplistarunidades__default(),
         new Object[] {
             new Object[] {
            P00042_A4unid_id, P00042_A5unid_nome, P00042_A6unid_sigla
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4unid_id ;
   private short Gx_err ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private long AV7PageNumber ;
   private long AV6PageSize ;
   private String scmdbuf ;
   private String A5unid_nome ;
   private String A6unid_sigla ;
   private GXBaseCollection<SdtsdtListaUnidades_sdtListaUnidadesItem>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P00042_A4unid_id ;
   private String[] P00042_A5unid_nome ;
   private String[] P00042_A6unid_sigla ;
   private GXBaseCollection<SdtsdtListaUnidades_sdtListaUnidadesItem> Gxm2rootcol ;
   private SdtsdtListaUnidades_sdtListaUnidadesItem Gxm1sdtlistaunidades ;
}

final  class dplistarunidades__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00042", "SELECT unid_id, unid_nome, unid_sigla FROM unidade ORDER BY unid_id  OFFSET ? LIMIT CASE WHEN ? > 0 THEN ? ELSE 1e9 END",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

