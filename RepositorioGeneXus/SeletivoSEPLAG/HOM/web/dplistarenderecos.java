import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dplistarenderecos extends GXProcedure
{
   public dplistarenderecos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dplistarenderecos.class ), "" );
   }

   public dplistarenderecos( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<SdtsdtListaEnderecos_sdtListaEnderecosItem> executeUdp( long aP0 ,
                                                                                   long aP1 )
   {
      dplistarenderecos.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<SdtsdtListaEnderecos_sdtListaEnderecosItem>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        GXBaseCollection<SdtsdtListaEnderecos_sdtListaEnderecosItem>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             GXBaseCollection<SdtsdtListaEnderecos_sdtListaEnderecosItem>[] aP2 )
   {
      dplistarenderecos.this.AV5PageNumber = aP0;
      dplistarenderecos.this.AV6PageSize = aP1;
      dplistarenderecos.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXPagingFrom2 = (int)((AV5PageNumber-1)*AV6PageSize) ;
      GXPagingTo2 = (int)(AV6PageSize) ;
      /* Using cursor P00062 */
      pr_default.execute(0, new Object[] {Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13end_id = P00062_A13end_id[0] ;
         A14end_tipo_logradouro = P00062_A14end_tipo_logradouro[0] ;
         A15end_logradouro = P00062_A15end_logradouro[0] ;
         A16end_numero = P00062_A16end_numero[0] ;
         A17end_bairro = P00062_A17end_bairro[0] ;
         A1cid_id = P00062_A1cid_id[0] ;
         A2cid_nome = P00062_A2cid_nome[0] ;
         A3cid_uf = P00062_A3cid_uf[0] ;
         A2cid_nome = P00062_A2cid_nome[0] ;
         A3cid_uf = P00062_A3cid_uf[0] ;
         Gxm1sdtlistaenderecos = (SdtsdtListaEnderecos_sdtListaEnderecosItem)new SdtsdtListaEnderecos_sdtListaEnderecosItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtlistaenderecos, 0);
         Gxm1sdtlistaenderecos.setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_id( A13end_id );
         Gxm1sdtlistaenderecos.setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_tipo_logradouro( A14end_tipo_logradouro );
         Gxm1sdtlistaenderecos.setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_logradouro( A15end_logradouro );
         Gxm1sdtlistaenderecos.setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_numero( A16end_numero );
         Gxm1sdtlistaenderecos.setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_bairro( A17end_bairro );
         Gxm1sdtlistaenderecos.setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_id( A1cid_id );
         Gxm1sdtlistaenderecos.setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_nome( A2cid_nome );
         Gxm1sdtlistaenderecos.setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_uf( A3cid_uf );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dplistarenderecos.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<SdtsdtListaEnderecos_sdtListaEnderecosItem>(SdtsdtListaEnderecos_sdtListaEnderecosItem.class, "sdtListaEnderecosItem", "SeletivoSEPLAG", remoteHandle);
      scmdbuf = "" ;
      P00062_A13end_id = new short[1] ;
      P00062_A14end_tipo_logradouro = new String[] {""} ;
      P00062_A15end_logradouro = new String[] {""} ;
      P00062_A16end_numero = new long[1] ;
      P00062_A17end_bairro = new String[] {""} ;
      P00062_A1cid_id = new short[1] ;
      P00062_A2cid_nome = new String[] {""} ;
      P00062_A3cid_uf = new String[] {""} ;
      A14end_tipo_logradouro = "" ;
      A15end_logradouro = "" ;
      A17end_bairro = "" ;
      A2cid_nome = "" ;
      A3cid_uf = "" ;
      Gxm1sdtlistaenderecos = new SdtsdtListaEnderecos_sdtListaEnderecosItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new dplistarenderecos__default(),
         new Object[] {
             new Object[] {
            P00062_A13end_id, P00062_A14end_tipo_logradouro, P00062_A15end_logradouro, P00062_A16end_numero, P00062_A17end_bairro, P00062_A1cid_id, P00062_A2cid_nome, P00062_A3cid_uf
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A13end_id ;
   private short A1cid_id ;
   private short Gx_err ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private long AV5PageNumber ;
   private long AV6PageSize ;
   private long A16end_numero ;
   private String scmdbuf ;
   private String A3cid_uf ;
   private String A14end_tipo_logradouro ;
   private String A15end_logradouro ;
   private String A17end_bairro ;
   private String A2cid_nome ;
   private GXBaseCollection<SdtsdtListaEnderecos_sdtListaEnderecosItem>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P00062_A13end_id ;
   private String[] P00062_A14end_tipo_logradouro ;
   private String[] P00062_A15end_logradouro ;
   private long[] P00062_A16end_numero ;
   private String[] P00062_A17end_bairro ;
   private short[] P00062_A1cid_id ;
   private String[] P00062_A2cid_nome ;
   private String[] P00062_A3cid_uf ;
   private GXBaseCollection<SdtsdtListaEnderecos_sdtListaEnderecosItem> Gxm2rootcol ;
   private SdtsdtListaEnderecos_sdtListaEnderecosItem Gxm1sdtlistaenderecos ;
}

final  class dplistarenderecos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00062", "SELECT T1.end_id, T1.end_tipo_logradouro, T1.end_logradouro, T1.end_numero, T1.end_bairro, T1.cid_id, T2.cid_nome, T2.cid_uf FROM (endereco T1 INNER JOIN cidade T2 ON T2.cid_id = T1.cid_id) ORDER BY T1.end_id  OFFSET ? LIMIT CASE WHEN ? > 0 THEN ? ELSE 1e9 END",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 2);
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

