import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plistarpessoa extends GXProcedure
{
   public plistarpessoa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plistarpessoa.class ), "" );
   }

   public plistarpessoa( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( short aP0 ,
                                                                        SdtsdtListaPessoa[] aP1 )
   {
      plistarpessoa.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( short aP0 ,
                        SdtsdtListaPessoa[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( short aP0 ,
                             SdtsdtListaPessoa[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      plistarpessoa.this.AV9pes_id = aP0;
      plistarpessoa.this.aP1 = aP1;
      plistarpessoa.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV8pessoa.Load(AV9pes_id);
      if ( AV8pessoa.Fail() )
      {
      }
      else
      {
         AV12ListaPessoa.setgxTv_SdtsdtListaPessoa_Pes_id( AV8pessoa.getgxTv_Sdtpessoa_Pes_id() );
         AV12ListaPessoa.setgxTv_SdtsdtListaPessoa_Pes_nome( AV8pessoa.getgxTv_Sdtpessoa_Pes_nome() );
         AV12ListaPessoa.setgxTv_SdtsdtListaPessoa_Pes_data_nascimento( localUtil.format( AV8pessoa.getgxTv_Sdtpessoa_Pes_data_nascimento(), "99/99/9999") );
         AV12ListaPessoa.setgxTv_SdtsdtListaPessoa_Pes_sexo( AV8pessoa.getgxTv_Sdtpessoa_Pes_sexo() );
         AV12ListaPessoa.setgxTv_SdtsdtListaPessoa_Pes_mae( AV8pessoa.getgxTv_Sdtpessoa_Pes_mae() );
         AV12ListaPessoa.setgxTv_SdtsdtListaPessoa_Pes_pai( AV8pessoa.getgxTv_Sdtpessoa_Pes_pai() );
      }
      AV13Messages = AV8pessoa.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = plistarpessoa.this.AV12ListaPessoa;
      this.aP2[0] = plistarpessoa.this.AV13Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12ListaPessoa = new SdtsdtListaPessoa(remoteHandle, context);
      AV13Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV8pessoa = new Sdtpessoa(remoteHandle);
      /* GeneXus formulas. */
   }

   private short AV9pes_id ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private SdtsdtListaPessoa[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV13Messages ;
   private Sdtpessoa AV8pessoa ;
   private SdtsdtListaPessoa AV12ListaPessoa ;
}

