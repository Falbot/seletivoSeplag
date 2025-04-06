import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plistarunidade extends GXProcedure
{
   public plistarunidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plistarunidade.class ), "" );
   }

   public plistarunidade( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( short aP0 ,
                                                                        SdtsdtListaUnidade[] aP1 )
   {
      plistarunidade.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( short aP0 ,
                        SdtsdtListaUnidade[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( short aP0 ,
                             SdtsdtListaUnidade[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      plistarunidade.this.AV9unid_id = aP0;
      plistarunidade.this.aP1 = aP1;
      plistarunidade.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV12unidade.Load(AV9unid_id);
      if ( AV12unidade.Fail() )
      {
      }
      else
      {
         AV11ListaUnidade.setgxTv_SdtsdtListaUnidade_Unid_id( AV12unidade.getgxTv_Sdtunidade_Unid_id() );
         AV11ListaUnidade.setgxTv_SdtsdtListaUnidade_Unid_nome( AV12unidade.getgxTv_Sdtunidade_Unid_nome() );
         AV11ListaUnidade.setgxTv_SdtsdtListaUnidade_Unid_sigla( AV12unidade.getgxTv_Sdtunidade_Unid_sigla() );
      }
      AV10Messages = AV12unidade.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = plistarunidade.this.AV11ListaUnidade;
      this.aP2[0] = plistarunidade.this.AV10Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11ListaUnidade = new SdtsdtListaUnidade(remoteHandle, context);
      AV10Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV12unidade = new Sdtunidade(remoteHandle);
      /* GeneXus formulas. */
   }

   private short AV9unid_id ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private SdtsdtListaUnidade[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private SdtsdtListaUnidade AV11ListaUnidade ;
   private Sdtunidade AV12unidade ;
}

