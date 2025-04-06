import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plistarfotopessoa extends GXProcedure
{
   public plistarfotopessoa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plistarfotopessoa.class ), "" );
   }

   public plistarfotopessoa( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( short aP0 ,
                                                                        SdtsdtListaFotoPessoa[] aP1 )
   {
      plistarfotopessoa.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( short aP0 ,
                        SdtsdtListaFotoPessoa[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( short aP0 ,
                             SdtsdtListaFotoPessoa[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      plistarfotopessoa.this.AV8pes_id = aP0;
      plistarfotopessoa.this.aP1 = aP1;
      plistarfotopessoa.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV11pessoa.Load(AV8pes_id);
      if ( AV11pessoa.Fail() )
      {
      }
      else
      {
         AV9ListaFotoPessoa.setgxTv_SdtsdtListaFotoPessoa_Pes_id( AV11pessoa.getgxTv_Sdtpessoa_Pes_id() );
         AV9ListaFotoPessoa.setgxTv_SdtsdtListaFotoPessoa_Pes_nome( AV11pessoa.getgxTv_Sdtpessoa_Pes_nome() );
         GXt_objcol_SdtsdtURLFoto1 = new GXBaseCollection<SdtsdtURLFoto>() ;
         GXv_objcol_SdtsdtURLFoto2[0] = GXt_objcol_SdtsdtURLFoto1 ;
         new pbuscarfotopessoa(remoteHandle, context).execute( AV8pes_id, GXv_objcol_SdtsdtURLFoto2) ;
         GXt_objcol_SdtsdtURLFoto1 = GXv_objcol_SdtsdtURLFoto2[0] ;
         AV9ListaFotoPessoa.setgxTv_SdtsdtListaFotoPessoa_Foto( GXt_objcol_SdtsdtURLFoto1 );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = plistarfotopessoa.this.AV9ListaFotoPessoa;
      this.aP2[0] = plistarfotopessoa.this.AV10Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9ListaFotoPessoa = new SdtsdtListaFotoPessoa(remoteHandle, context);
      AV10Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV11pessoa = new Sdtpessoa(remoteHandle);
      GXt_objcol_SdtsdtURLFoto1 = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtsdtURLFoto2 = new GXBaseCollection[1] ;
   }

   private short AV8pes_id ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private SdtsdtListaFotoPessoa[] aP1 ;
   private GXBaseCollection<SdtsdtURLFoto> GXt_objcol_SdtsdtURLFoto1 ;
   private GXBaseCollection<SdtsdtURLFoto> GXv_objcol_SdtsdtURLFoto2[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private SdtsdtListaFotoPessoa AV9ListaFotoPessoa ;
   private Sdtpessoa AV11pessoa ;
}

