import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class crud_endereco extends GXProcedure
{
   public crud_endereco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crud_endereco.class ), "" );
   }

   public crud_endereco( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e11042( )
   {
      /* Before Routine */
      returnInSub = false ;
      AV16Retorno = AV15HttpRequest.getHeader("Authorization") ;
      if ( ! (GXutil.strcmp("", AV16Retorno)==0) )
      {
         if ( GXutil.startsWith( AV16Retorno, "Bearer ") )
         {
            AV17Token = GXutil.strReplace( AV16Retorno, "Bearer ", "") ;
            GXt_boolean1 = AV18IsValid ;
            GXv_boolean2[0] = GXt_boolean1 ;
            new pvalidarjwt(remoteHandle, context).execute( AV17Token, GXv_boolean2) ;
            this.GXt_boolean1 = GXv_boolean2[0] ;
            AV18IsValid = GXt_boolean1 ;
         }
      }
      if ( ! AV18IsValid )
      {
         Gx_restcode = (short)(401) ;
         returnInSub = true;
         return;
      }
   }

   public void gxep_create( SdtsdtEndereco in_AV11DadosEndereco ,
                            short [] arr_AV14RetornoPK ,
                            GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV7Messages )
   {
      this.AV11DadosEndereco = in_AV11DadosEndereco;
      AV7Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV14RetornoPK[0] = this.AV14RetornoPK;
      arr_AV7Messages[0] = this.AV7Messages;
      /* Execute user event: Before */
      e11042 ();
      if ( returnInSub )
      {
         arr_AV14RetornoPK[0] = this.AV14RetornoPK;
         arr_AV7Messages[0] = this.AV7Messages;
         return;
      }
      /* Create Constructor */
      GXv_int3[0] = AV14RetornoPK ;
      GXv_objcol_SdtMessages_Message4[0] = AV7Messages ;
      new pcriarendereco(remoteHandle, context).execute( AV11DadosEndereco, GXv_int3, GXv_objcol_SdtMessages_Message4) ;
      this.AV14RetornoPK = GXv_int3[0] ;
      AV7Messages = GXv_objcol_SdtMessages_Message4[0] ;
      arr_AV14RetornoPK[0] = this.AV14RetornoPK;
      arr_AV7Messages[0] = this.AV7Messages;
   }

   public void gxep_read_getlist( long in_AV19PageNumber ,
                                  long in_AV20PageSize ,
                                  GXBaseCollection<SdtsdtListaEnderecos_sdtListaEnderecosItem> [] arr_AV6ListaDadosEndereco )
   {
      this.AV19PageNumber = in_AV19PageNumber;
      this.AV20PageSize = in_AV20PageSize;
      AV6ListaDadosEndereco = new GXBaseCollection<SdtsdtListaEnderecos_sdtListaEnderecosItem>(SdtsdtListaEnderecos_sdtListaEnderecosItem.class, "sdtListaEnderecosItem", "SeletivoSEPLAG", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV6ListaDadosEndereco[0] = this.AV6ListaDadosEndereco;
      /* Execute user event: Before */
      e11042 ();
      if ( returnInSub )
      {
         arr_AV6ListaDadosEndereco[0] = this.AV6ListaDadosEndereco;
         return;
      }
      /* Read_GetList Constructor */
      GXv_objcol_SdtsdtListaEnderecos_sdtListaEnderecosItem5[0] = AV6ListaDadosEndereco ;
      new dplistarenderecos(remoteHandle, context).execute( AV19PageNumber, AV20PageSize, GXv_objcol_SdtsdtListaEnderecos_sdtListaEnderecosItem5) ;
      AV6ListaDadosEndereco = GXv_objcol_SdtsdtListaEnderecos_sdtListaEnderecosItem5[0] ;
      arr_AV6ListaDadosEndereco[0] = this.AV6ListaDadosEndereco;
   }

   public void gxep_read_getbykey( short in_AV9codgEndereco ,
                                   SdtsdtListaEndereco [] arr_AV13ListaEndereco ,
                                   GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV7Messages )
   {
      this.AV9codgEndereco = in_AV9codgEndereco;
      AV13ListaEndereco = new SdtsdtListaEndereco(remoteHandle, context);
      AV7Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV13ListaEndereco[0] = this.AV13ListaEndereco;
      arr_AV7Messages[0] = this.AV7Messages;
      /* Execute user event: Before */
      e11042 ();
      if ( returnInSub )
      {
         arr_AV13ListaEndereco[0] = this.AV13ListaEndereco;
         arr_AV7Messages[0] = this.AV7Messages;
         return;
      }
      /* Read_GetByKey Constructor */
      GXv_SdtsdtListaEndereco6[0] = AV13ListaEndereco;
      GXv_objcol_SdtMessages_Message4[0] = AV7Messages ;
      new plistarendereco(remoteHandle, context).execute( AV9codgEndereco, GXv_SdtsdtListaEndereco6, GXv_objcol_SdtMessages_Message4) ;
      AV13ListaEndereco = GXv_SdtsdtListaEndereco6[0];
      AV7Messages = GXv_objcol_SdtMessages_Message4[0] ;
      arr_AV13ListaEndereco[0] = this.AV13ListaEndereco;
      arr_AV7Messages[0] = this.AV7Messages;
   }

   public void gxep_update( SdtsdtListaEndereco in_AV13ListaEndereco ,
                            GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV7Messages )
   {
      this.AV13ListaEndereco = in_AV13ListaEndereco;
      AV7Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV7Messages[0] = this.AV7Messages;
      /* Execute user event: Before */
      e11042 ();
      if ( returnInSub )
      {
         arr_AV7Messages[0] = this.AV7Messages;
         return;
      }
      /* Update Constructor */
      GXv_objcol_SdtMessages_Message4[0] = AV7Messages ;
      new patualizarendereco(remoteHandle, context).execute( AV13ListaEndereco, GXv_objcol_SdtMessages_Message4) ;
      AV7Messages = GXv_objcol_SdtMessages_Message4[0] ;
      arr_AV7Messages[0] = this.AV7Messages;
   }

   public void gxep_delete( short in_AV9codgEndereco ,
                            GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV7Messages )
   {
      this.AV9codgEndereco = in_AV9codgEndereco;
      AV7Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV7Messages[0] = this.AV7Messages;
      /* Execute user event: Before */
      e11042 ();
      if ( returnInSub )
      {
         arr_AV7Messages[0] = this.AV7Messages;
         return;
      }
      /* Delete Constructor */
      GXv_objcol_SdtMessages_Message4[0] = AV7Messages ;
      new pexcluirendereco(remoteHandle, context).execute( AV9codgEndereco, GXv_objcol_SdtMessages_Message4) ;
      AV7Messages = GXv_objcol_SdtMessages_Message4[0] ;
      arr_AV7Messages[0] = this.AV7Messages;
   }

   public short getrestcode( )
   {
      return Gx_restcode ;
   }

   protected void cleanup( )
   {
      if ( initialized != 1 )
      {
      }
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Retorno = "" ;
      AV15HttpRequest = httpContext.getHttpRequest();
      AV17Token = "" ;
      GXv_boolean2 = new boolean[1] ;
      AV7Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_int3 = new short[1] ;
      AV6ListaDadosEndereco = new GXBaseCollection<SdtsdtListaEnderecos_sdtListaEnderecosItem>(SdtsdtListaEnderecos_sdtListaEnderecosItem.class, "sdtListaEnderecosItem", "SeletivoSEPLAG", remoteHandle);
      GXv_SdtsdtListaEndereco6 = new SdtsdtListaEndereco[1] ;
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtsdtListaEnderecos_sdtListaEnderecosItem5 = new GXBaseCollection[1] ;
      GXv_objcol_SdtMessages_Message4 = new GXBaseCollection[1] ;
   }

   protected short Gx_restcode ;
   protected short initialized ;
   protected short AV14RetornoPK ;
   protected short GXv_int3[] ;
   protected short AV9codgEndereco ;
   protected long AV19PageNumber ;
   protected long AV20PageSize ;
   protected boolean returnInSub ;
   protected boolean AV18IsValid ;
   protected boolean GXt_boolean1 ;
   protected boolean GXv_boolean2[] ;
   protected String AV17Token ;
   protected String AV16Retorno ;
   protected com.genexus.internet.HttpRequest AV15HttpRequest ;
   protected short[] arr_AV14RetornoPK ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV7Messages ;
   protected GXBaseCollection<SdtsdtListaEnderecos_sdtListaEnderecosItem>[] arr_AV6ListaDadosEndereco ;
   protected SdtsdtListaEndereco[] arr_AV13ListaEndereco ;
   protected GXBaseCollection<SdtsdtListaEnderecos_sdtListaEnderecosItem> AV6ListaDadosEndereco ;
   protected GXBaseCollection<SdtsdtListaEnderecos_sdtListaEnderecosItem> GXv_objcol_SdtsdtListaEnderecos_sdtListaEnderecosItem5[] ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV7Messages ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message4[] ;
   protected SdtsdtEndereco AV11DadosEndereco ;
   protected SdtsdtListaEndereco GXv_SdtsdtListaEndereco6[] ;
   protected SdtsdtListaEndereco AV13ListaEndereco ;
}

