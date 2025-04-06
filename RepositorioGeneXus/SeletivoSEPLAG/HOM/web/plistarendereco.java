import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plistarendereco extends GXProcedure
{
   public plistarendereco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plistarendereco.class ), "" );
   }

   public plistarendereco( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( short aP0 ,
                                                                        SdtsdtListaEndereco[] aP1 )
   {
      plistarendereco.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( short aP0 ,
                        SdtsdtListaEndereco[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( short aP0 ,
                             SdtsdtListaEndereco[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      plistarendereco.this.AV9end_id = aP0;
      plistarendereco.this.aP1 = aP1;
      plistarendereco.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11endereco.Load(AV9end_id);
      if ( AV11endereco.Fail() )
      {
      }
      else
      {
         AV10ListaEndereco.setgxTv_SdtsdtListaEndereco_End_id( AV11endereco.getgxTv_Sdtendereco_End_id() );
         AV10ListaEndereco.setgxTv_SdtsdtListaEndereco_End_tipo_logradouro( AV11endereco.getgxTv_Sdtendereco_End_tipo_logradouro() );
         AV10ListaEndereco.setgxTv_SdtsdtListaEndereco_End_logradouro( AV11endereco.getgxTv_Sdtendereco_End_logradouro() );
         AV10ListaEndereco.setgxTv_SdtsdtListaEndereco_End_numero( AV11endereco.getgxTv_Sdtendereco_End_numero() );
         AV10ListaEndereco.setgxTv_SdtsdtListaEndereco_End_bairro( AV11endereco.getgxTv_Sdtendereco_End_bairro() );
         AV10ListaEndereco.setgxTv_SdtsdtListaEndereco_Cid_id( AV11endereco.getgxTv_Sdtendereco_Cid_id() );
         AV10ListaEndereco.setgxTv_SdtsdtListaEndereco_Cid_nome( AV11endereco.getgxTv_Sdtendereco_Cid_nome() );
         AV10ListaEndereco.setgxTv_SdtsdtListaEndereco_Cid_uf( AV11endereco.getgxTv_Sdtendereco_Cid_uf() );
      }
      AV8Messages = AV11endereco.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = plistarendereco.this.AV10ListaEndereco;
      this.aP2[0] = plistarendereco.this.AV8Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10ListaEndereco = new SdtsdtListaEndereco(remoteHandle, context);
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV11endereco = new Sdtendereco(remoteHandle);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9end_id ;
   private short Gx_err ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private SdtsdtListaEndereco[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private SdtsdtListaEndereco AV10ListaEndereco ;
   private Sdtendereco AV11endereco ;
}

