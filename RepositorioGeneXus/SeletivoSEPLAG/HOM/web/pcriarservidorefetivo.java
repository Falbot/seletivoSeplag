import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcriarservidorefetivo extends GXProcedure
{
   public pcriarservidorefetivo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcriarservidorefetivo.class ), "" );
   }

   public pcriarservidorefetivo( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( SdtsdtServidor aP0 ,
                                                                        String aP1 )
   {
      pcriarservidorefetivo.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( SdtsdtServidor aP0 ,
                        String aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( SdtsdtServidor aP0 ,
                             String aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      pcriarservidorefetivo.this.AV12DadosServidor = aP0;
      pcriarservidorefetivo.this.AV15NumeroMatricula = aP1;
      pcriarservidorefetivo.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8unidade.Load(AV12DadosServidor.getgxTv_SdtsdtServidor_Unid_id());
      if ( AV8unidade.Fail() )
      {
         AV10Message.setgxTv_SdtMessages_Message_Description( "A unidade informada para a lotação não existe." );
         AV11Messages.add(AV10Message, 0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         GXv_int1[0] = AV14pes_id ;
         GXv_objcol_SdtMessages_Message2[0] = AV11Messages ;
         new pcriarpessoa(remoteHandle, context).execute( AV12DadosServidor.getgxTv_SdtsdtServidor_Dadospessoa(), GXv_int1, GXv_objcol_SdtMessages_Message2) ;
         pcriarservidorefetivo.this.AV14pes_id = GXv_int1[0] ;
         AV11Messages = GXv_objcol_SdtMessages_Message2[0] ;
         AV16DadosFotoPessoa.setgxTv_SdtsdtFotoPessoa_Pes_id( AV14pes_id );
         AV16DadosFotoPessoa.setgxTv_SdtsdtFotoPessoa_Foto( AV12DadosServidor.getgxTv_SdtsdtServidor_Foto() );
         GXv_objcol_SdtMessages_Message2[0] = AV11Messages ;
         new pcriarfotopessoa(remoteHandle, context).execute( AV16DadosFotoPessoa, GXv_objcol_SdtMessages_Message2) ;
         AV11Messages = GXv_objcol_SdtMessages_Message2[0] ;
         GXv_int1[0] = AV21end_id ;
         GXv_objcol_SdtMessages_Message2[0] = AV11Messages ;
         new pcriarendereco(remoteHandle, context).execute( AV12DadosServidor.getgxTv_SdtsdtServidor_Dadosendereco(), GXv_int1, GXv_objcol_SdtMessages_Message2) ;
         pcriarservidorefetivo.this.AV21end_id = GXv_int1[0] ;
         AV11Messages = GXv_objcol_SdtMessages_Message2[0] ;
         AV20DadosPessoaEndereco.setgxTv_SdtsdtPessoaEndereco_Pes_id( AV14pes_id );
         AV20DadosPessoaEndereco.setgxTv_SdtsdtPessoaEndereco_End_id( AV21end_id );
         GXv_objcol_SdtMessages_Message2[0] = AV11Messages ;
         new pcriarpessoaendereco(remoteHandle, context).execute( AV20DadosPessoaEndereco, GXv_objcol_SdtMessages_Message2) ;
         AV11Messages = GXv_objcol_SdtMessages_Message2[0] ;
         AV23lotacao.setgxTv_Sdtlotacao_Pes_id( AV14pes_id );
         AV23lotacao.setgxTv_Sdtlotacao_Unid_id( AV12DadosServidor.getgxTv_SdtsdtServidor_Unid_id() );
         AV23lotacao.setgxTv_Sdtlotacao_Lot_data_lotacao( localUtil.ctod( AV12DadosServidor.getgxTv_SdtsdtServidor_Dadoslotacao().getgxTv_SdtsdtLotacao_Lot_data_lotacao(), 3) );
         AV23lotacao.setgxTv_Sdtlotacao_Lot_data_remocao( localUtil.ctod( AV12DadosServidor.getgxTv_SdtsdtServidor_Dadoslotacao().getgxTv_SdtsdtLotacao_Lot_data_remocao(), 3) );
         AV23lotacao.setgxTv_Sdtlotacao_Lot_portaria( AV12DadosServidor.getgxTv_SdtsdtServidor_Dadoslotacao().getgxTv_SdtsdtLotacao_Lot_portaria() );
         AV23lotacao.Save();
         if ( AV23lotacao.Success() )
         {
            Application.commitDataStores(context, remoteHandle, pr_default, "pcriarservidorefetivo");
         }
         else
         {
            Application.rollbackDataStores(context, remoteHandle, pr_default, "pcriarservidorefetivo");
         }
         AV11Messages = AV23lotacao.GetMessages() ;
         System.out.println( AV11Messages.toJSonString(false) );
         AV22servidor_efetivo.setgxTv_Sdtservidor_efetivo_Pes_id( AV14pes_id );
         AV22servidor_efetivo.setgxTv_Sdtservidor_efetivo_Se_matricula( AV15NumeroMatricula );
         AV22servidor_efetivo.Save();
         if ( AV22servidor_efetivo.Success() )
         {
            Application.commitDataStores(context, remoteHandle, pr_default, "pcriarservidorefetivo");
         }
         else
         {
            Application.rollbackDataStores(context, remoteHandle, pr_default, "pcriarservidorefetivo");
         }
         AV11Messages = AV22servidor_efetivo.GetMessages() ;
         System.out.println( AV11Messages.toJSonString(false) );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pcriarservidorefetivo.this.AV11Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV8unidade = new Sdtunidade(remoteHandle);
      AV10Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV16DadosFotoPessoa = new SdtsdtFotoPessoa(remoteHandle, context);
      GXv_int1 = new short[1] ;
      AV20DadosPessoaEndereco = new SdtsdtPessoaEndereco(remoteHandle, context);
      GXv_objcol_SdtMessages_Message2 = new GXBaseCollection[1] ;
      AV23lotacao = new Sdtlotacao(remoteHandle);
      AV22servidor_efetivo = new Sdtservidor_efetivo(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new pcriarservidorefetivo__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV14pes_id ;
   private short AV21end_id ;
   private short GXv_int1[] ;
   private short Gx_err ;
   private boolean returnInSub ;
   private String AV15NumeroMatricula ;
   private com.genexus.SdtMessages_Message AV10Message ;
   private SdtsdtFotoPessoa AV16DadosFotoPessoa ;
   private SdtsdtPessoaEndereco AV20DadosPessoaEndereco ;
   private Sdtservidor_efetivo AV22servidor_efetivo ;
   private Sdtlotacao AV23lotacao ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV11Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message2[] ;
   private SdtsdtServidor AV12DadosServidor ;
   private Sdtunidade AV8unidade ;
}

final  class pcriarservidorefetivo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

