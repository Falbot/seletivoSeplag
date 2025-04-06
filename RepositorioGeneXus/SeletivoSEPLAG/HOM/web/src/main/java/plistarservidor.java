import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plistarservidor extends GXProcedure
{
   public plistarservidor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plistarservidor.class ), "" );
   }

   public plistarservidor( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( short aP0 ,
                                                                        SdtsdtListaServidor[] aP1 )
   {
      plistarservidor.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( short aP0 ,
                        SdtsdtListaServidor[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( short aP0 ,
                             SdtsdtListaServidor[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      plistarservidor.this.AV8pes_id = aP0;
      plistarservidor.this.aP1 = aP1;
      plistarservidor.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      GXt_objcol_SdtsdtURLFoto1 = new GXBaseCollection<SdtsdtURLFoto>() ;
      GXv_objcol_SdtsdtURLFoto2[0] = GXt_objcol_SdtsdtURLFoto1 ;
      new pbuscarfotopessoa(remoteHandle, context).execute( AV8pes_id, GXv_objcol_SdtsdtURLFoto2) ;
      GXt_objcol_SdtsdtURLFoto1 = GXv_objcol_SdtsdtURLFoto2[0] ;
      AV10ListaServidor.setgxTv_SdtsdtListaServidor_Foto( GXt_objcol_SdtsdtURLFoto1 );
      GXt_char3 = "" ;
      GXv_char4[0] = GXt_char3 ;
      new pbuscartiposervidor(remoteHandle, context).execute( AV8pes_id, GXv_char4) ;
      plistarservidor.this.GXt_char3 = GXv_char4[0] ;
      AV10ListaServidor.setgxTv_SdtsdtListaServidor_Tiposervidor( GXt_char3 );
      AV11pessoa.Load(AV8pes_id);
      AV10ListaServidor.getgxTv_SdtsdtListaServidor_Dadospessoa().setgxTv_SdtsdtPessoa_Pes_nome( AV11pessoa.getgxTv_Sdtpessoa_Pes_nome() );
      AV10ListaServidor.getgxTv_SdtsdtListaServidor_Dadospessoa().setgxTv_SdtsdtPessoa_Pes_data_nascimento( localUtil.format( AV11pessoa.getgxTv_Sdtpessoa_Pes_data_nascimento(), "99/99/9999") );
      AV10ListaServidor.getgxTv_SdtsdtListaServidor_Dadospessoa().setgxTv_SdtsdtPessoa_Pes_sexo( AV11pessoa.getgxTv_Sdtpessoa_Pes_sexo() );
      AV10ListaServidor.getgxTv_SdtsdtListaServidor_Dadospessoa().setgxTv_SdtsdtPessoa_Pes_mae( AV11pessoa.getgxTv_Sdtpessoa_Pes_mae() );
      AV10ListaServidor.getgxTv_SdtsdtListaServidor_Dadospessoa().setgxTv_SdtsdtPessoa_Pes_pai( AV11pessoa.getgxTv_Sdtpessoa_Pes_pai() );
      AV9Messages = AV11pessoa.GetMessages() ;
      /* Using cursor P001F2 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV8pes_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7pes_id = P001F2_A7pes_id[0] ;
         A13end_id = P001F2_A13end_id[0] ;
         AV14end_id = A13end_id ;
         AV13DadosEndereco = (SdtsdtEndereco)new SdtsdtEndereco(remoteHandle, context);
         /* Execute user subroutine: 'DADOSENDERECO' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV10ListaServidor.getgxTv_SdtsdtListaServidor_Dadosendereco().add(AV13DadosEndereco, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P001F3 */
      pr_default.execute(1, new Object[] {Short.valueOf(AV8pes_id)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4unid_id = P001F3_A4unid_id[0] ;
         A7pes_id = P001F3_A7pes_id[0] ;
         A5unid_nome = P001F3_A5unid_nome[0] ;
         A6unid_sigla = P001F3_A6unid_sigla[0] ;
         A23lot_data_lotacao = P001F3_A23lot_data_lotacao[0] ;
         A24lot_data_remocao = P001F3_A24lot_data_remocao[0] ;
         A25lot_portaria = P001F3_A25lot_portaria[0] ;
         A22lot_id = P001F3_A22lot_id[0] ;
         A5unid_nome = P001F3_A5unid_nome[0] ;
         A6unid_sigla = P001F3_A6unid_sigla[0] ;
         AV16DadosLotacao = (SdtsdtLotacaoV3)new SdtsdtLotacaoV3(remoteHandle, context);
         AV16DadosLotacao.setgxTv_SdtsdtLotacaoV3_Unid_nome( A5unid_nome );
         AV16DadosLotacao.setgxTv_SdtsdtLotacaoV3_Unid_sigla( A6unid_sigla );
         AV16DadosLotacao.setgxTv_SdtsdtLotacaoV3_Lot_data_lotacao( localUtil.format( A23lot_data_lotacao, "99/99/9999") );
         AV16DadosLotacao.setgxTv_SdtsdtLotacaoV3_Lot_data_remocao( localUtil.format( A24lot_data_remocao, "99/99/9999") );
         AV16DadosLotacao.setgxTv_SdtsdtLotacaoV3_Lot_portaria( A25lot_portaria );
         AV10ListaServidor.getgxTv_SdtsdtListaServidor_Dadoslotacao().add(AV16DadosLotacao, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'DADOSENDERECO' Routine */
      returnInSub = false ;
      /* Using cursor P001F4 */
      pr_default.execute(2, new Object[] {Short.valueOf(AV14end_id)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13end_id = P001F4_A13end_id[0] ;
         A14end_tipo_logradouro = P001F4_A14end_tipo_logradouro[0] ;
         A15end_logradouro = P001F4_A15end_logradouro[0] ;
         A16end_numero = P001F4_A16end_numero[0] ;
         A17end_bairro = P001F4_A17end_bairro[0] ;
         A1cid_id = P001F4_A1cid_id[0] ;
         AV13DadosEndereco.setgxTv_SdtsdtEndereco_End_tipo_logradouro( A14end_tipo_logradouro );
         AV13DadosEndereco.setgxTv_SdtsdtEndereco_End_logradouro( A15end_logradouro );
         AV13DadosEndereco.setgxTv_SdtsdtEndereco_End_numero( A16end_numero );
         AV13DadosEndereco.setgxTv_SdtsdtEndereco_End_bairro( A17end_bairro );
         AV13DadosEndereco.setgxTv_SdtsdtEndereco_Cid_id( A1cid_id );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP1[0] = plistarservidor.this.AV10ListaServidor;
      this.aP2[0] = plistarservidor.this.AV9Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10ListaServidor = new SdtsdtListaServidor(remoteHandle, context);
      AV9Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXt_objcol_SdtsdtURLFoto1 = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV11pessoa = new Sdtpessoa(remoteHandle);
      P001F2_A7pes_id = new short[1] ;
      P001F2_A13end_id = new short[1] ;
      AV13DadosEndereco = new SdtsdtEndereco(remoteHandle, context);
      P001F3_A4unid_id = new short[1] ;
      P001F3_A7pes_id = new short[1] ;
      P001F3_A5unid_nome = new String[] {""} ;
      P001F3_A6unid_sigla = new String[] {""} ;
      P001F3_A23lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      P001F3_A24lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      P001F3_A25lot_portaria = new String[] {""} ;
      P001F3_A22lot_id = new short[1] ;
      A5unid_nome = "" ;
      A6unid_sigla = "" ;
      A23lot_data_lotacao = GXutil.nullDate() ;
      A24lot_data_remocao = GXutil.nullDate() ;
      A25lot_portaria = "" ;
      AV16DadosLotacao = new SdtsdtLotacaoV3(remoteHandle, context);
      P001F4_A13end_id = new short[1] ;
      P001F4_A14end_tipo_logradouro = new String[] {""} ;
      P001F4_A15end_logradouro = new String[] {""} ;
      P001F4_A16end_numero = new long[1] ;
      P001F4_A17end_bairro = new String[] {""} ;
      P001F4_A1cid_id = new short[1] ;
      A14end_tipo_logradouro = "" ;
      A15end_logradouro = "" ;
      A17end_bairro = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new plistarservidor__default(),
         new Object[] {
             new Object[] {
            P001F2_A7pes_id, P001F2_A13end_id
            }
            , new Object[] {
            P001F3_A4unid_id, P001F3_A7pes_id, P001F3_A5unid_nome, P001F3_A6unid_sigla, P001F3_A23lot_data_lotacao, P001F3_A24lot_data_remocao, P001F3_A25lot_portaria, P001F3_A22lot_id
            }
            , new Object[] {
            P001F4_A13end_id, P001F4_A14end_tipo_logradouro, P001F4_A15end_logradouro, P001F4_A16end_numero, P001F4_A17end_bairro, P001F4_A1cid_id
            }
         }
      );
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtsdtURLFoto2 = new GXBaseCollection[1] ;
   }

   private short AV8pes_id ;
   private short A7pes_id ;
   private short A13end_id ;
   private short AV14end_id ;
   private short A4unid_id ;
   private short A22lot_id ;
   private short A1cid_id ;
   private long A16end_numero ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private java.util.Date A23lot_data_lotacao ;
   private java.util.Date A24lot_data_remocao ;
   private boolean returnInSub ;
   private String A5unid_nome ;
   private String A6unid_sigla ;
   private String A25lot_portaria ;
   private String A14end_tipo_logradouro ;
   private String A15end_logradouro ;
   private String A17end_bairro ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private SdtsdtListaServidor[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P001F2_A7pes_id ;
   private short[] P001F2_A13end_id ;
   private short[] P001F3_A4unid_id ;
   private short[] P001F3_A7pes_id ;
   private String[] P001F3_A5unid_nome ;
   private String[] P001F3_A6unid_sigla ;
   private java.util.Date[] P001F3_A23lot_data_lotacao ;
   private java.util.Date[] P001F3_A24lot_data_remocao ;
   private String[] P001F3_A25lot_portaria ;
   private short[] P001F3_A22lot_id ;
   private short[] P001F4_A13end_id ;
   private String[] P001F4_A14end_tipo_logradouro ;
   private String[] P001F4_A15end_logradouro ;
   private long[] P001F4_A16end_numero ;
   private String[] P001F4_A17end_bairro ;
   private short[] P001F4_A1cid_id ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private GXBaseCollection<SdtsdtURLFoto> GXt_objcol_SdtsdtURLFoto1 ;
   private GXBaseCollection<SdtsdtURLFoto> GXv_objcol_SdtsdtURLFoto2[] ;
   private SdtsdtListaServidor AV10ListaServidor ;
   private SdtsdtEndereco AV13DadosEndereco ;
   private SdtsdtLotacaoV3 AV16DadosLotacao ;
   private Sdtpessoa AV11pessoa ;
}

final  class plistarservidor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001F2", "SELECT pes_id, end_id FROM pessoa_endereco WHERE pes_id = ? ORDER BY pes_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P001F3", "SELECT T1.unid_id, T1.pes_id, T2.unid_nome, T2.unid_sigla, T1.lot_data_lotacao, T1.lot_data_remocao, T1.lot_portaria, T1.lot_id FROM (lotacao T1 INNER JOIN unidade T2 ON T2.unid_id = T1.unid_id) WHERE T1.pes_id = ? ORDER BY T1.pes_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P001F4", "SELECT end_id, end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id FROM endereco WHERE end_id = ? ORDER BY end_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

