import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcriarservidortemporario extends GXProcedure
{
   public pcriarservidortemporario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcriarservidortemporario.class ), "" );
   }

   public pcriarservidortemporario( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( SdtsdtServidor aP0 ,
                                                                        String aP1 ,
                                                                        String aP2 )
   {
      pcriarservidortemporario.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( SdtsdtServidor aP0 ,
                        String aP1 ,
                        String aP2 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( SdtsdtServidor aP0 ,
                             String aP1 ,
                             String aP2 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      pcriarservidortemporario.this.AV9DadosServidor = aP0;
      pcriarservidortemporario.this.AV10DataAdmissao = aP1;
      pcriarservidortemporario.this.AV11DataDemissao = aP2;
      pcriarservidortemporario.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV12unidade.Load(AV9DadosServidor.getgxTv_SdtsdtServidor_Unid_id());
      if ( AV12unidade.Fail() )
      {
         AV13Message.setgxTv_SdtMessages_Message_Description( "A unidade informada para a lotação não existe." );
         AV8Messages.add(AV13Message, 0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         GXv_int1[0] = AV14pes_id ;
         GXv_objcol_SdtMessages_Message2[0] = AV8Messages ;
         new pcriarpessoa(remoteHandle, context).execute( AV9DadosServidor.getgxTv_SdtsdtServidor_Dadospessoa(), GXv_int1, GXv_objcol_SdtMessages_Message2) ;
         pcriarservidortemporario.this.AV14pes_id = GXv_int1[0] ;
         AV8Messages = GXv_objcol_SdtMessages_Message2[0] ;
         AV15DadosFotoPessoa.setgxTv_SdtsdtFotoPessoa_Pes_id( AV14pes_id );
         AV15DadosFotoPessoa.setgxTv_SdtsdtFotoPessoa_Foto( AV9DadosServidor.getgxTv_SdtsdtServidor_Foto() );
         GXv_objcol_SdtMessages_Message2[0] = AV8Messages ;
         new pcriarfotopessoa(remoteHandle, context).execute( AV15DadosFotoPessoa, GXv_objcol_SdtMessages_Message2) ;
         AV8Messages = GXv_objcol_SdtMessages_Message2[0] ;
         GXv_int1[0] = AV16end_id ;
         GXv_objcol_SdtMessages_Message2[0] = AV8Messages ;
         new pcriarendereco(remoteHandle, context).execute( AV9DadosServidor.getgxTv_SdtsdtServidor_Dadosendereco(), GXv_int1, GXv_objcol_SdtMessages_Message2) ;
         pcriarservidortemporario.this.AV16end_id = GXv_int1[0] ;
         AV8Messages = GXv_objcol_SdtMessages_Message2[0] ;
         AV17DadosPessoaEndereco.setgxTv_SdtsdtPessoaEndereco_Pes_id( AV14pes_id );
         AV17DadosPessoaEndereco.setgxTv_SdtsdtPessoaEndereco_End_id( AV16end_id );
         GXv_objcol_SdtMessages_Message2[0] = AV8Messages ;
         new pcriarpessoaendereco(remoteHandle, context).execute( AV17DadosPessoaEndereco, GXv_objcol_SdtMessages_Message2) ;
         AV8Messages = GXv_objcol_SdtMessages_Message2[0] ;
         AV18lotacao.setgxTv_Sdtlotacao_Pes_id( AV14pes_id );
         AV18lotacao.setgxTv_Sdtlotacao_Unid_id( AV9DadosServidor.getgxTv_SdtsdtServidor_Unid_id() );
         AV18lotacao.setgxTv_Sdtlotacao_Lot_data_lotacao( localUtil.ctod( AV9DadosServidor.getgxTv_SdtsdtServidor_Dadoslotacao().getgxTv_SdtsdtLotacao_Lot_data_lotacao(), 3) );
         AV18lotacao.setgxTv_Sdtlotacao_Lot_data_remocao( localUtil.ctod( AV9DadosServidor.getgxTv_SdtsdtServidor_Dadoslotacao().getgxTv_SdtsdtLotacao_Lot_data_remocao(), 3) );
         AV18lotacao.setgxTv_Sdtlotacao_Lot_portaria( AV9DadosServidor.getgxTv_SdtsdtServidor_Dadoslotacao().getgxTv_SdtsdtLotacao_Lot_portaria() );
         AV18lotacao.Save();
         if ( AV18lotacao.Success() )
         {
            Application.commitDataStores(context, remoteHandle, pr_default, "pcriarservidortemporario");
         }
         else
         {
            Application.rollbackDataStores(context, remoteHandle, pr_default, "pcriarservidortemporario");
         }
         AV8Messages = AV18lotacao.GetMessages() ;
         System.out.println( AV8Messages.toJSonString(false) );
         AV20servidor_temporario.setgxTv_Sdtservidor_temporario_Pes_id( AV14pes_id );
         AV20servidor_temporario.setgxTv_Sdtservidor_temporario_St_data_admissao( localUtil.ctod( AV10DataAdmissao, 3) );
         AV20servidor_temporario.setgxTv_Sdtservidor_temporario_St_data_demissao( localUtil.ctod( AV11DataDemissao, 3) );
         AV20servidor_temporario.Save();
         if ( AV20servidor_temporario.Success() )
         {
            Application.commitDataStores(context, remoteHandle, pr_default, "pcriarservidortemporario");
         }
         else
         {
            Application.rollbackDataStores(context, remoteHandle, pr_default, "pcriarservidortemporario");
         }
         AV8Messages = AV20servidor_temporario.GetMessages() ;
         System.out.println( AV8Messages.toJSonString(false) );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pcriarservidortemporario.this.AV8Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV12unidade = new Sdtunidade(remoteHandle);
      AV13Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV15DadosFotoPessoa = new SdtsdtFotoPessoa(remoteHandle, context);
      GXv_int1 = new short[1] ;
      AV17DadosPessoaEndereco = new SdtsdtPessoaEndereco(remoteHandle, context);
      AV18lotacao = new Sdtlotacao(remoteHandle);
      AV20servidor_temporario = new Sdtservidor_temporario(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new pcriarservidortemporario__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message2 = new GXBaseCollection[1] ;
   }

   private short AV14pes_id ;
   private short AV16end_id ;
   private short GXv_int1[] ;
   private boolean returnInSub ;
   private String AV10DataAdmissao ;
   private String AV11DataDemissao ;
   private com.genexus.SdtMessages_Message AV13Message ;
   private SdtsdtFotoPessoa AV15DadosFotoPessoa ;
   private SdtsdtPessoaEndereco AV17DadosPessoaEndereco ;
   private Sdtlotacao AV18lotacao ;
   private Sdtservidor_temporario AV20servidor_temporario ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message2[] ;
   private SdtsdtServidor AV9DadosServidor ;
   private Sdtunidade AV12unidade ;
}

final  class pcriarservidortemporario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

