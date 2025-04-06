import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dplistarservidores extends GXProcedure
{
   public dplistarservidores( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dplistarservidores.class ), "" );
   }

   public dplistarservidores( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem> executeUdp( long aP0 ,
                                                                                     long aP1 )
   {
      dplistarservidores.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem>[] aP2 )
   {
      dplistarservidores.this.AV5PageNumber = aP0;
      dplistarservidores.this.AV6PageSize = aP1;
      dplistarservidores.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXPagingFrom2 = (int)((AV5PageNumber-1)*AV6PageSize) ;
      GXPagingTo2 = (int)(AV6PageSize) ;
      /* Using cursor P00082 */
      pr_default.execute(0, new Object[] {Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4unid_id = P00082_A4unid_id[0] ;
         A7pes_id = P00082_A7pes_id[0] ;
         A8pes_nome = P00082_A8pes_nome[0] ;
         A9pes_data_nascimento = P00082_A9pes_data_nascimento[0] ;
         A10pes_sexo = P00082_A10pes_sexo[0] ;
         A5unid_nome = P00082_A5unid_nome[0] ;
         A6unid_sigla = P00082_A6unid_sigla[0] ;
         A23lot_data_lotacao = P00082_A23lot_data_lotacao[0] ;
         A25lot_portaria = P00082_A25lot_portaria[0] ;
         A22lot_id = P00082_A22lot_id[0] ;
         A5unid_nome = P00082_A5unid_nome[0] ;
         A6unid_sigla = P00082_A6unid_sigla[0] ;
         A8pes_nome = P00082_A8pes_nome[0] ;
         A9pes_data_nascimento = P00082_A9pes_data_nascimento[0] ;
         A10pes_sexo = P00082_A10pes_sexo[0] ;
         Gxm1sdtlistaservidores = (SdtsdtListaServidores_sdtListaServidoresItem)new SdtsdtListaServidores_sdtListaServidoresItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtlistaservidores, 0);
         Gxm1sdtlistaservidores.setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id( A7pes_id );
         Gxm1sdtlistaservidores.setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome( A8pes_nome );
         Gxm1sdtlistaservidores.setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento( A9pes_data_nascimento );
         Gxm1sdtlistaservidores.setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo( A10pes_sexo );
         Gxm1sdtlistaservidores.setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome( A5unid_nome );
         Gxm1sdtlistaservidores.setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla( A6unid_sigla );
         Gxm1sdtlistaservidores.setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao( A23lot_data_lotacao );
         Gxm1sdtlistaservidores.setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria( A25lot_portaria );
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new pbuscartiposervidor(remoteHandle, context).execute( A7pes_id, GXv_char2) ;
         dplistarservidores.this.GXt_char1 = GXv_char2[0] ;
         Gxm1sdtlistaservidores.setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor( GXt_char1 );
         GXt_objcol_SdtsdtURLFoto3 = new GXBaseCollection<SdtsdtURLFoto>() ;
         GXv_objcol_SdtsdtURLFoto4[0] = GXt_objcol_SdtsdtURLFoto3 ;
         new pbuscarfotopessoa(remoteHandle, context).execute( A7pes_id, GXv_objcol_SdtsdtURLFoto4) ;
         GXt_objcol_SdtsdtURLFoto3 = GXv_objcol_SdtsdtURLFoto4[0] ;
         Gxm1sdtlistaservidores.setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto( GXt_objcol_SdtsdtURLFoto3 );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dplistarservidores.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem>(SdtsdtListaServidores_sdtListaServidoresItem.class, "sdtListaServidoresItem", "SeletivoSEPLAG", remoteHandle);
      scmdbuf = "" ;
      P00082_A4unid_id = new short[1] ;
      P00082_A7pes_id = new short[1] ;
      P00082_A8pes_nome = new String[] {""} ;
      P00082_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      P00082_A10pes_sexo = new String[] {""} ;
      P00082_A5unid_nome = new String[] {""} ;
      P00082_A6unid_sigla = new String[] {""} ;
      P00082_A23lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      P00082_A25lot_portaria = new String[] {""} ;
      P00082_A22lot_id = new short[1] ;
      A8pes_nome = "" ;
      A9pes_data_nascimento = GXutil.nullDate() ;
      A10pes_sexo = "" ;
      A5unid_nome = "" ;
      A6unid_sigla = "" ;
      A23lot_data_lotacao = GXutil.nullDate() ;
      A25lot_portaria = "" ;
      Gxm1sdtlistaservidores = new SdtsdtListaServidores_sdtListaServidoresItem(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_objcol_SdtsdtURLFoto3 = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
      GXv_objcol_SdtsdtURLFoto4 = new GXBaseCollection[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new dplistarservidores__default(),
         new Object[] {
             new Object[] {
            P00082_A4unid_id, P00082_A7pes_id, P00082_A8pes_nome, P00082_A9pes_data_nascimento, P00082_A10pes_sexo, P00082_A5unid_nome, P00082_A6unid_sigla, P00082_A23lot_data_lotacao, P00082_A25lot_portaria, P00082_A22lot_id
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4unid_id ;
   private short A7pes_id ;
   private short A22lot_id ;
   private short Gx_err ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private long AV5PageNumber ;
   private long AV6PageSize ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date A9pes_data_nascimento ;
   private java.util.Date A23lot_data_lotacao ;
   private String A8pes_nome ;
   private String A10pes_sexo ;
   private String A5unid_nome ;
   private String A6unid_sigla ;
   private String A25lot_portaria ;
   private GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P00082_A4unid_id ;
   private short[] P00082_A7pes_id ;
   private String[] P00082_A8pes_nome ;
   private java.util.Date[] P00082_A9pes_data_nascimento ;
   private String[] P00082_A10pes_sexo ;
   private String[] P00082_A5unid_nome ;
   private String[] P00082_A6unid_sigla ;
   private java.util.Date[] P00082_A23lot_data_lotacao ;
   private String[] P00082_A25lot_portaria ;
   private short[] P00082_A22lot_id ;
   private GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem> Gxm2rootcol ;
   private GXBaseCollection<SdtsdtURLFoto> GXt_objcol_SdtsdtURLFoto3 ;
   private GXBaseCollection<SdtsdtURLFoto> GXv_objcol_SdtsdtURLFoto4[] ;
   private SdtsdtListaServidores_sdtListaServidoresItem Gxm1sdtlistaservidores ;
}

final  class dplistarservidores__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00082", "SELECT T1.unid_id, T1.pes_id, T3.pes_nome, T3.pes_data_nascimento, T3.pes_sexo, T2.unid_nome, T2.unid_sigla, T1.lot_data_lotacao, T1.lot_portaria, T1.lot_id FROM ((lotacao T1 INNER JOIN unidade T2 ON T2.unid_id = T1.unid_id) INNER JOIN pessoa T3 ON T3.pes_id = T1.pes_id) ORDER BY T1.lot_id  OFFSET ? LIMIT CASE WHEN ? > 0 THEN ? ELSE 1e9 END",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
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

