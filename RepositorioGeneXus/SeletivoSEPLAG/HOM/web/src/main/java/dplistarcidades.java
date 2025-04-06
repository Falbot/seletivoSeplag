import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dplistarcidades extends GXProcedure
{
   public dplistarcidades( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dplistarcidades.class ), "" );
   }

   public dplistarcidades( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<SdtsdtListaCidades_sdtListaCidadesItem> executeUdp( long aP0 ,
                                                                               long aP1 )
   {
      dplistarcidades.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<SdtsdtListaCidades_sdtListaCidadesItem>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        GXBaseCollection<SdtsdtListaCidades_sdtListaCidadesItem>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             GXBaseCollection<SdtsdtListaCidades_sdtListaCidadesItem>[] aP2 )
   {
      dplistarcidades.this.AV6PageNumber = aP0;
      dplistarcidades.this.AV5PageSize = aP1;
      dplistarcidades.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      GXPagingFrom2 = (int)((AV6PageNumber-1)*AV5PageSize) ;
      GXPagingTo2 = (int)(AV5PageSize) ;
      /* Using cursor P00052 */
      pr_default.execute(0, new Object[] {Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1cid_id = P00052_A1cid_id[0] ;
         A2cid_nome = P00052_A2cid_nome[0] ;
         A3cid_uf = P00052_A3cid_uf[0] ;
         Gxm1sdtlistacidades = (SdtsdtListaCidades_sdtListaCidadesItem)new SdtsdtListaCidades_sdtListaCidadesItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtlistacidades, 0);
         Gxm1sdtlistacidades.setgxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_id( A1cid_id );
         Gxm1sdtlistacidades.setgxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_nome( A2cid_nome );
         Gxm1sdtlistacidades.setgxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_uf( A3cid_uf );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dplistarcidades.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<SdtsdtListaCidades_sdtListaCidadesItem>(SdtsdtListaCidades_sdtListaCidadesItem.class, "sdtListaCidadesItem", "SeletivoSEPLAG", remoteHandle);
      P00052_A1cid_id = new short[1] ;
      P00052_A2cid_nome = new String[] {""} ;
      P00052_A3cid_uf = new String[] {""} ;
      A2cid_nome = "" ;
      A3cid_uf = "" ;
      Gxm1sdtlistacidades = new SdtsdtListaCidades_sdtListaCidadesItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new dplistarcidades__default(),
         new Object[] {
             new Object[] {
            P00052_A1cid_id, P00052_A2cid_nome, P00052_A3cid_uf
            }
         }
      );
      /* GeneXus formulas. */
   }

   private short A1cid_id ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private long AV6PageNumber ;
   private long AV5PageSize ;
   private String A3cid_uf ;
   private String A2cid_nome ;
   private GXBaseCollection<SdtsdtListaCidades_sdtListaCidadesItem>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P00052_A1cid_id ;
   private String[] P00052_A2cid_nome ;
   private String[] P00052_A3cid_uf ;
   private GXBaseCollection<SdtsdtListaCidades_sdtListaCidadesItem> Gxm2rootcol ;
   private SdtsdtListaCidades_sdtListaCidadesItem Gxm1sdtlistacidades ;
}

final  class dplistarcidades__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00052", "SELECT cid_id, cid_nome, cid_uf FROM cidade ORDER BY cid_id  OFFSET ? LIMIT CASE WHEN ? > 0 THEN ? ELSE 1e9 END",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
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

