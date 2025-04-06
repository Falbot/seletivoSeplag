import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class crud_cidade extends GXProcedure
{
   public crud_cidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crud_cidade.class ), "" );
   }

   public crud_cidade( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e11032( )
   {
      /* Before Routine */
      returnInSub = false ;
      AV11Retorno = AV12HttpRequest.getHeader("Authorization") ;
      if ( ! (GXutil.strcmp("", AV11Retorno)==0) )
      {
         if ( GXutil.startsWith( AV11Retorno, "Bearer ") )
         {
            AV13Token = GXutil.strReplace( AV11Retorno, "Bearer ", "") ;
            GXt_boolean1 = AV14IsValid ;
            GXv_boolean2[0] = GXt_boolean1 ;
            new pvalidarjwt(remoteHandle, context).execute( AV13Token, GXv_boolean2) ;
            this.GXt_boolean1 = GXv_boolean2[0] ;
            AV14IsValid = GXt_boolean1 ;
         }
      }
      if ( ! AV14IsValid )
      {
         Gx_restcode = (short)(401) ;
         returnInSub = true;
         return;
      }
   }

   public void gxep_create__post( SdtsdtCidade in_AV8DadosCidade ,
                                  GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV8DadosCidade = in_AV8DadosCidade;
      initialize();
      initialized = (short)(1) ;
      arr_AV6Messages[0] = this.AV6Messages;
      /* Execute user event: Before */
      e11032 ();
      if ( returnInSub )
      {
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* Create__post Constructor */
      GXv_objcol_SdtMessages_Message3[0] = AV6Messages ;
      new pcriarcidade(remoteHandle, context).execute( AV8DadosCidade, GXv_objcol_SdtMessages_Message3) ;
      AV6Messages = GXv_objcol_SdtMessages_Message3[0] ;
      arr_AV6Messages[0] = this.AV6Messages;
   }

   public void gxep_read_getlist( long in_AV16PageNumber ,
                                  long in_AV15PageSize ,
                                  GXBaseCollection<SdtsdtListaCidades_sdtListaCidadesItem> [] arr_AV9ListaDadosCidade )
   {
      this.AV16PageNumber = in_AV16PageNumber;
      this.AV15PageSize = in_AV15PageSize;
      initialize();
      initialized = (short)(1) ;
      arr_AV9ListaDadosCidade[0] = this.AV9ListaDadosCidade;
      /* Execute user event: Before */
      e11032 ();
      if ( returnInSub )
      {
         arr_AV9ListaDadosCidade[0] = this.AV9ListaDadosCidade;
         return;
      }
      /* Read_GetList Constructor */
      GXv_objcol_SdtsdtListaCidades_sdtListaCidadesItem4[0] = AV9ListaDadosCidade ;
      new dplistarcidades(remoteHandle, context).execute( AV16PageNumber, AV15PageSize, GXv_objcol_SdtsdtListaCidades_sdtListaCidadesItem4) ;
      AV9ListaDadosCidade = GXv_objcol_SdtsdtListaCidades_sdtListaCidadesItem4[0] ;
      arr_AV9ListaDadosCidade[0] = this.AV9ListaDadosCidade;
   }

   public void gxep_read_getbykey( short in_AV5codgCidade ,
                                   SdtsdtListaCidade [] arr_AV10ListaCidade ,
                                   GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV5codgCidade = in_AV5codgCidade;
      initialize();
      initialized = (short)(1) ;
      arr_AV10ListaCidade[0] = this.AV10ListaCidade;
      arr_AV6Messages[0] = this.AV6Messages;
      /* Execute user event: Before */
      e11032 ();
      if ( returnInSub )
      {
         arr_AV10ListaCidade[0] = this.AV10ListaCidade;
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* Read_GetByKey Constructor */
      GXv_SdtsdtListaCidade5[0] = AV10ListaCidade;
      GXv_objcol_SdtMessages_Message3[0] = AV6Messages ;
      new plistarcidade(remoteHandle, context).execute( AV5codgCidade, GXv_SdtsdtListaCidade5, GXv_objcol_SdtMessages_Message3) ;
      AV10ListaCidade = GXv_SdtsdtListaCidade5[0] ;
      AV6Messages = GXv_objcol_SdtMessages_Message3[0] ;
      arr_AV10ListaCidade[0] = this.AV10ListaCidade;
      arr_AV6Messages[0] = this.AV6Messages;
   }

   public void gxep_update__put( SdtsdtListaCidade in_AV10ListaCidade ,
                                 GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV10ListaCidade = in_AV10ListaCidade;
      initialize();
      initialized = (short)(1) ;
      arr_AV6Messages[0] = this.AV6Messages;
      /* Execute user event: Before */
      e11032 ();
      if ( returnInSub )
      {
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* Update__put Constructor */
      GXv_objcol_SdtMessages_Message3[0] = AV6Messages ;
      new patualizarcidade(remoteHandle, context).execute( AV10ListaCidade, GXv_objcol_SdtMessages_Message3) ;
      AV6Messages = GXv_objcol_SdtMessages_Message3[0] ;
      arr_AV6Messages[0] = this.AV6Messages;
   }

   public void gxep_delete__delete( short in_AV5codgCidade ,
                                    GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV5codgCidade = in_AV5codgCidade;
      initialize();
      initialized = (short)(1) ;
      arr_AV6Messages[0] = this.AV6Messages;
      /* Execute user event: Before */
      e11032 ();
      if ( returnInSub )
      {
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* Delete__delete Constructor */
      GXv_objcol_SdtMessages_Message3[0] = AV6Messages ;
      new pexcluircidade(remoteHandle, context).execute( AV5codgCidade, GXv_objcol_SdtMessages_Message3) ;
      AV6Messages = GXv_objcol_SdtMessages_Message3[0] ;
      arr_AV6Messages[0] = this.AV6Messages;
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
      AV11Retorno = "" ;
      AV12HttpRequest = httpContext.getHttpRequest();
      AV13Token = "" ;
      GXv_boolean2 = new boolean[1] ;
      AV6Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV9ListaDadosCidade = new GXBaseCollection<SdtsdtListaCidades_sdtListaCidadesItem>(SdtsdtListaCidades_sdtListaCidadesItem.class, "sdtListaCidadesItem", "SeletivoSEPLAG", remoteHandle);
      GXv_objcol_SdtsdtListaCidades_sdtListaCidadesItem4 = new GXBaseCollection[1] ;
      GXv_SdtsdtListaCidade5 = new SdtsdtListaCidade[1] ;
      GXv_objcol_SdtMessages_Message3 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   protected short Gx_restcode ;
   protected short initialized ;
   protected short AV5codgCidade ;
   protected short Gx_err ;
   protected long AV16PageNumber ;
   protected long AV15PageSize ;
   protected boolean returnInSub ;
   protected boolean AV14IsValid ;
   protected boolean GXt_boolean1 ;
   protected boolean GXv_boolean2[] ;
   protected String AV13Token ;
   protected String AV11Retorno ;
   protected com.genexus.internet.HttpRequest AV12HttpRequest ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV6Messages ;
   protected GXBaseCollection<SdtsdtListaCidades_sdtListaCidadesItem>[] arr_AV9ListaDadosCidade ;
   protected SdtsdtListaCidade[] arr_AV10ListaCidade ;
   protected GXBaseCollection<SdtsdtListaCidades_sdtListaCidadesItem> AV9ListaDadosCidade ;
   protected GXBaseCollection<SdtsdtListaCidades_sdtListaCidadesItem> GXv_objcol_SdtsdtListaCidades_sdtListaCidadesItem4[] ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV6Messages ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message3[] ;
   protected SdtsdtCidade AV8DadosCidade ;
   protected SdtsdtListaCidade GXv_SdtsdtListaCidade5[] ;
   protected SdtsdtListaCidade AV10ListaCidade ;
}

