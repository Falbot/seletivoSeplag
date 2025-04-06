import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plistarcidade extends GXProcedure
{
   public plistarcidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plistarcidade.class ), "" );
   }

   public plistarcidade( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( short aP0 ,
                                                                        SdtsdtListaCidade[] aP1 )
   {
      plistarcidade.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( short aP0 ,
                        SdtsdtListaCidade[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( short aP0 ,
                             SdtsdtListaCidade[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      plistarcidade.this.AV10cid_id = aP0;
      plistarcidade.this.aP1 = aP1;
      plistarcidade.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12cidade.Load(AV10cid_id);
      if ( AV13unidade.Fail() )
      {
      }
      else
      {
         AV11ListaCidade.setgxTv_SdtsdtListaCidade_Cid_id( AV12cidade.getgxTv_Sdtcidade_Cid_id() );
         AV11ListaCidade.setgxTv_SdtsdtListaCidade_Cid_nome( AV12cidade.getgxTv_Sdtcidade_Cid_nome() );
         AV11ListaCidade.setgxTv_SdtsdtListaCidade_Cid_uf( AV12cidade.getgxTv_Sdtcidade_Cid_uf() );
      }
      AV9Messages = AV12cidade.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = plistarcidade.this.AV11ListaCidade;
      this.aP2[0] = plistarcidade.this.AV9Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11ListaCidade = new SdtsdtListaCidade(remoteHandle, context);
      AV9Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV12cidade = new Sdtcidade(remoteHandle);
      AV13unidade = new Sdtunidade(remoteHandle);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10cid_id ;
   private short Gx_err ;
   private Sdtunidade AV13unidade ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private SdtsdtListaCidade[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private SdtsdtListaCidade AV11ListaCidade ;
   private Sdtcidade AV12cidade ;
}

