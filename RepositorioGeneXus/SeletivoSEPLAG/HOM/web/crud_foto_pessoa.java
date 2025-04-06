import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class crud_foto_pessoa extends GXProcedure
{
   public crud_foto_pessoa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crud_foto_pessoa.class ), "" );
   }

   public crud_foto_pessoa( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e11052( )
   {
      /* Before Routine */
      returnInSub = false ;
      AV8Retorno = AV9HttpRequest.getHeader("Authorization") ;
      if ( ! (GXutil.strcmp("", AV8Retorno)==0) )
      {
         if ( GXutil.startsWith( AV8Retorno, "Bearer ") )
         {
            AV10Token = GXutil.strReplace( AV8Retorno, "Bearer ", "") ;
            GXt_boolean1 = AV11IsValid ;
            GXv_boolean2[0] = GXt_boolean1 ;
            new pvalidarjwt(remoteHandle, context).execute( AV10Token, GXv_boolean2) ;
            this.GXt_boolean1 = GXv_boolean2[0] ;
            AV11IsValid = GXt_boolean1 ;
         }
      }
      if ( ! AV11IsValid )
      {
         Gx_restcode = (short)(401) ;
         returnInSub = true;
         return;
      }
   }

   public void gxep_create__post( SdtsdtFotoPessoa in_AV6DadosFotoPessoa ,
                                  GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV7Messages )
   {
      this.AV6DadosFotoPessoa = in_AV6DadosFotoPessoa;
      initialize();
      initialized = (short)(1) ;
      arr_AV7Messages[0] = this.AV7Messages;
      /* Execute user event: Before */
      e11052 ();
      if ( returnInSub )
      {
         arr_AV7Messages[0] = this.AV7Messages;
         return;
      }
      /* Create__post Constructor */
      GXv_objcol_SdtMessages_Message3[0] = AV7Messages ;
      new pcriarfotopessoa(remoteHandle, context).execute( AV6DadosFotoPessoa, GXv_objcol_SdtMessages_Message3) ;
      AV7Messages = GXv_objcol_SdtMessages_Message3[0] ;
      arr_AV7Messages[0] = this.AV7Messages;
   }

   public void gxep_read_getlist( long in_AV12PageNumber ,
                                  long in_AV13PageSize ,
                                  GXBaseCollection<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem> [] arr_AV15ListaFotoPessoas )
   {
      this.AV12PageNumber = in_AV12PageNumber;
      this.AV13PageSize = in_AV13PageSize;
      initialize();
      initialized = (short)(1) ;
      arr_AV15ListaFotoPessoas[0] = this.AV15ListaFotoPessoas;
      /* Execute user event: Before */
      e11052 ();
      if ( returnInSub )
      {
         arr_AV15ListaFotoPessoas[0] = this.AV15ListaFotoPessoas;
         return;
      }
      /* Read_GetList Constructor */
      GXv_objcol_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem4[0] = AV15ListaFotoPessoas ;
      new dplistarfotopessoas(remoteHandle, context).execute( AV12PageNumber, AV13PageSize, GXv_objcol_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem4) ;
      AV15ListaFotoPessoas = GXv_objcol_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem4[0] ;
      arr_AV15ListaFotoPessoas[0] = this.AV15ListaFotoPessoas;
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
      AV8Retorno = "" ;
      AV9HttpRequest = httpContext.getHttpRequest();
      AV10Token = "" ;
      GXv_boolean2 = new boolean[1] ;
      AV7Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message3 = new GXBaseCollection[1] ;
      AV15ListaFotoPessoas = new GXBaseCollection<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem>(SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem.class, "sdtListaFotoPessoasItem", "SeletivoSEPLAG", remoteHandle);
      GXv_objcol_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem4 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   protected short Gx_restcode ;
   protected short initialized ;
   protected short Gx_err ;
   protected long AV12PageNumber ;
   protected long AV13PageSize ;
   protected boolean returnInSub ;
   protected boolean AV11IsValid ;
   protected boolean GXt_boolean1 ;
   protected boolean GXv_boolean2[] ;
   protected String AV10Token ;
   protected String AV8Retorno ;
   protected com.genexus.internet.HttpRequest AV9HttpRequest ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV7Messages ;
   protected GXBaseCollection<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem>[] arr_AV15ListaFotoPessoas ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV7Messages ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message3[] ;
   protected GXBaseCollection<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem> AV15ListaFotoPessoas ;
   protected GXBaseCollection<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem> GXv_objcol_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem4[] ;
   protected SdtsdtFotoPessoa AV6DadosFotoPessoa ;
}

