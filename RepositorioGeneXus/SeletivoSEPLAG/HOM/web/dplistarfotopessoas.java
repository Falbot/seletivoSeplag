import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dplistarfotopessoas extends GXProcedure
{
   public dplistarfotopessoas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dplistarfotopessoas.class ), "" );
   }

   public dplistarfotopessoas( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem> executeUdp( long aP0 ,
                                                                                       long aP1 )
   {
      dplistarfotopessoas.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        GXBaseCollection<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             GXBaseCollection<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem>[] aP2 )
   {
      dplistarfotopessoas.this.AV5PageNumber = aP0;
      dplistarfotopessoas.this.AV6PageSize = aP1;
      dplistarfotopessoas.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXPagingFrom2 = (int)((AV5PageNumber-1)*AV6PageSize) ;
      GXPagingTo2 = (int)(AV6PageSize) ;
      /* Using cursor P000B2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7pes_id = P000B2_A7pes_id[0] ;
         A8pes_nome = P000B2_A8pes_nome[0] ;
         Gxm1sdtlistafotopessoas = (SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem)new SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtlistafotopessoas, 0);
         Gxm1sdtlistafotopessoas.setgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id( A7pes_id );
         Gxm1sdtlistafotopessoas.setgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome( A8pes_nome );
         GXt_objcol_SdtsdtURLFoto1 = new GXBaseCollection<SdtsdtURLFoto>() ;
         GXv_objcol_SdtsdtURLFoto2[0] = GXt_objcol_SdtsdtURLFoto1 ;
         new pbuscarfotopessoa(remoteHandle, context).execute( A7pes_id, GXv_objcol_SdtsdtURLFoto2) ;
         GXt_objcol_SdtsdtURLFoto1 = GXv_objcol_SdtsdtURLFoto2[0] ;
         Gxm1sdtlistafotopessoas.setgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto( GXt_objcol_SdtsdtURLFoto1 );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dplistarfotopessoas.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem>(SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem.class, "sdtListaFotoPessoasItem", "SeletivoSEPLAG", remoteHandle);
      scmdbuf = "" ;
      P000B2_A7pes_id = new short[1] ;
      P000B2_A8pes_nome = new String[] {""} ;
      A8pes_nome = "" ;
      Gxm1sdtlistafotopessoas = new SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem(remoteHandle, context);
      GXt_objcol_SdtsdtURLFoto1 = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
      GXv_objcol_SdtsdtURLFoto2 = new GXBaseCollection[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new dplistarfotopessoas__default(),
         new Object[] {
             new Object[] {
            P000B2_A7pes_id, P000B2_A8pes_nome
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A7pes_id ;
   private short Gx_err ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private long AV5PageNumber ;
   private long AV6PageSize ;
   private String scmdbuf ;
   private String A8pes_nome ;
   private GXBaseCollection<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P000B2_A7pes_id ;
   private String[] P000B2_A8pes_nome ;
   private GXBaseCollection<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem> Gxm2rootcol ;
   private GXBaseCollection<SdtsdtURLFoto> GXt_objcol_SdtsdtURLFoto1 ;
   private GXBaseCollection<SdtsdtURLFoto> GXv_objcol_SdtsdtURLFoto2[] ;
   private SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem Gxm1sdtlistafotopessoas ;
}

final  class dplistarfotopessoas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000B2", "SELECT pes_id, pes_nome FROM pessoa ORDER BY pes_id  OFFSET ? LIMIT CASE WHEN ? > 0 THEN ? ELSE 1e9 END",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

