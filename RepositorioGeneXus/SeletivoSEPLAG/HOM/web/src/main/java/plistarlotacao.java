import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plistarlotacao extends GXProcedure
{
   public plistarlotacao( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plistarlotacao.class ), "" );
   }

   public plistarlotacao( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( short aP0 ,
                                                                        SdtsdtListaLotacao[] aP1 )
   {
      plistarlotacao.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( short aP0 ,
                        SdtsdtListaLotacao[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( short aP0 ,
                             SdtsdtListaLotacao[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      plistarlotacao.this.AV10lot_id = aP0;
      plistarlotacao.this.aP1 = aP1;
      plistarlotacao.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV12lotacao.Load(AV10lot_id);
      if ( AV12lotacao.Fail() )
      {
      }
      else
      {
         AV11ListaLotacao.setgxTv_SdtsdtListaLotacao_Lot_id( AV12lotacao.getgxTv_Sdtlotacao_Lot_id() );
         AV11ListaLotacao.setgxTv_SdtsdtListaLotacao_Pes_id( AV12lotacao.getgxTv_Sdtlotacao_Pes_id() );
         AV11ListaLotacao.setgxTv_SdtsdtListaLotacao_Pes_nome( AV12lotacao.getgxTv_Sdtlotacao_Pes_nome() );
         AV11ListaLotacao.setgxTv_SdtsdtListaLotacao_Unid_id( AV12lotacao.getgxTv_Sdtlotacao_Unid_id() );
         AV11ListaLotacao.setgxTv_SdtsdtListaLotacao_Unid_nome( AV12lotacao.getgxTv_Sdtlotacao_Unid_nome() );
         AV11ListaLotacao.setgxTv_SdtsdtListaLotacao_Unid_sigla( AV12lotacao.getgxTv_Sdtlotacao_Unid_sigla() );
         AV11ListaLotacao.setgxTv_SdtsdtListaLotacao_Lot_data_lotacao( AV12lotacao.getgxTv_Sdtlotacao_Lot_data_lotacao() );
         AV11ListaLotacao.setgxTv_SdtsdtListaLotacao_Lot_data_remocao( AV12lotacao.getgxTv_Sdtlotacao_Lot_data_remocao() );
         AV11ListaLotacao.setgxTv_SdtsdtListaLotacao_Lot_portaria( AV12lotacao.getgxTv_Sdtlotacao_Lot_portaria() );
      }
      AV8Messages = AV12lotacao.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = plistarlotacao.this.AV11ListaLotacao;
      this.aP2[0] = plistarlotacao.this.AV8Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11ListaLotacao = new SdtsdtListaLotacao(remoteHandle, context);
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV12lotacao = new Sdtlotacao(remoteHandle);
      /* GeneXus formulas. */
   }

   private short AV10lot_id ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private SdtsdtListaLotacao[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private SdtsdtListaLotacao AV11ListaLotacao ;
   private Sdtlotacao AV12lotacao ;
}

