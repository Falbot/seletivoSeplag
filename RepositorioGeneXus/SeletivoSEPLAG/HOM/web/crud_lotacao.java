import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class crud_lotacao extends GXProcedure
{
   public crud_lotacao( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crud_lotacao.class ), "" );
   }

   public crud_lotacao( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e11082( )
   {
      /* Before Routine */
      returnInSub = false ;
      AV13Retorno = AV14HttpRequest.getHeader("Authorization") ;
      if ( ! (GXutil.strcmp("", AV13Retorno)==0) )
      {
         if ( GXutil.startsWith( AV13Retorno, "Bearer ") )
         {
            AV15Token = GXutil.strReplace( AV13Retorno, "Bearer ", "") ;
            GXt_boolean1 = AV16IsValid ;
            GXv_boolean2[0] = GXt_boolean1 ;
            new pvalidarjwt(remoteHandle, context).execute( AV15Token, GXv_boolean2) ;
            this.GXt_boolean1 = GXv_boolean2[0] ;
            AV16IsValid = GXt_boolean1 ;
         }
      }
      if ( ! AV16IsValid )
      {
         Gx_restcode = (short)(401) ;
         returnInSub = true;
         return;
      }
   }

   public void gxep_create__post( SdtsdtLotacaoV2 in_AV6DadosLotacao ,
                                  GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV6DadosLotacao = in_AV6DadosLotacao;
      initialize();
      initialized = (short)(1) ;
      arr_AV5Messages[0] = this.AV5Messages;
      /* Execute user event: Before */
      e11082 ();
      if ( returnInSub )
      {
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      /* Create__post Constructor */
      GXv_objcol_SdtMessages_Message3[0] = AV5Messages ;
      new pcriarlotacao(remoteHandle, context).execute( AV6DadosLotacao, GXv_objcol_SdtMessages_Message3) ;
      AV5Messages = GXv_objcol_SdtMessages_Message3[0] ;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_read_getlist( long in_AV17PageNumber ,
                                  long in_AV18PageSize ,
                                  GXBaseCollection<SdtsdtListaLotacoes_sdtListaLotacoesItem> [] arr_AV8ListaDadosLotacao )
   {
      this.AV17PageNumber = in_AV17PageNumber;
      this.AV18PageSize = in_AV18PageSize;
      initialize();
      initialized = (short)(1) ;
      arr_AV8ListaDadosLotacao[0] = this.AV8ListaDadosLotacao;
      /* Execute user event: Before */
      e11082 ();
      if ( returnInSub )
      {
         arr_AV8ListaDadosLotacao[0] = this.AV8ListaDadosLotacao;
         return;
      }
      /* Read_GetList Constructor */
      GXv_objcol_SdtsdtListaLotacoes_sdtListaLotacoesItem4[0] = AV8ListaDadosLotacao ;
      new dplistarlotacoes(remoteHandle, context).execute( AV17PageNumber, AV18PageSize, GXv_objcol_SdtsdtListaLotacoes_sdtListaLotacoesItem4) ;
      AV8ListaDadosLotacao = GXv_objcol_SdtsdtListaLotacoes_sdtListaLotacoesItem4[0] ;
      arr_AV8ListaDadosLotacao[0] = this.AV8ListaDadosLotacao;
   }

   public void gxep_read_getbykey( short in_AV9codgLotacao ,
                                   SdtsdtListaLotacao [] arr_AV11ListaLotacao ,
                                   GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV9codgLotacao = in_AV9codgLotacao;
      initialize();
      initialized = (short)(1) ;
      arr_AV11ListaLotacao[0] = this.AV11ListaLotacao;
      arr_AV5Messages[0] = this.AV5Messages;
      /* Execute user event: Before */
      e11082 ();
      if ( returnInSub )
      {
         arr_AV11ListaLotacao[0] = this.AV11ListaLotacao;
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      /* Read_GetByKey Constructor */
      GXv_SdtsdtListaLotacao5[0] = AV11ListaLotacao;
      GXv_objcol_SdtMessages_Message3[0] = AV5Messages ;
      new plistarlotacao(remoteHandle, context).execute( AV9codgLotacao, GXv_SdtsdtListaLotacao5, GXv_objcol_SdtMessages_Message3) ;
      AV11ListaLotacao = GXv_SdtsdtListaLotacao5[0] ;
      AV5Messages = GXv_objcol_SdtMessages_Message3[0] ;
      arr_AV11ListaLotacao[0] = this.AV11ListaLotacao;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_update__put( short in_AV9codgLotacao ,
                                 SdtsdtLotacao in_AV12InfoLotacao ,
                                 GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV9codgLotacao = in_AV9codgLotacao;
      this.AV12InfoLotacao = in_AV12InfoLotacao;
      initialize();
      initialized = (short)(1) ;
      arr_AV5Messages[0] = this.AV5Messages;
      /* Execute user event: Before */
      e11082 ();
      if ( returnInSub )
      {
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      /* Update__put Constructor */
      GXv_objcol_SdtMessages_Message3[0] = AV5Messages ;
      new patualizarlotacao(remoteHandle, context).execute( AV9codgLotacao, AV12InfoLotacao, GXv_objcol_SdtMessages_Message3) ;
      AV5Messages = GXv_objcol_SdtMessages_Message3[0] ;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_delete__delete( short in_AV9codgLotacao ,
                                    GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV9codgLotacao = in_AV9codgLotacao;
      initialize();
      initialized = (short)(1) ;
      arr_AV5Messages[0] = this.AV5Messages;
      /* Execute user event: Before */
      e11082 ();
      if ( returnInSub )
      {
         arr_AV5Messages[0] = this.AV5Messages;
         return;
      }
      /* Delete__delete Constructor */
      GXv_objcol_SdtMessages_Message3[0] = AV5Messages ;
      new pexcluirlotacao(remoteHandle, context).execute( AV9codgLotacao, GXv_objcol_SdtMessages_Message3) ;
      AV5Messages = GXv_objcol_SdtMessages_Message3[0] ;
      arr_AV5Messages[0] = this.AV5Messages;
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
      AV13Retorno = "" ;
      AV14HttpRequest = httpContext.getHttpRequest();
      AV15Token = "" ;
      GXv_boolean2 = new boolean[1] ;
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV8ListaDadosLotacao = new GXBaseCollection<SdtsdtListaLotacoes_sdtListaLotacoesItem>(SdtsdtListaLotacoes_sdtListaLotacoesItem.class, "sdtListaLotacoesItem", "SeletivoSEPLAG", remoteHandle);
      GXv_objcol_SdtsdtListaLotacoes_sdtListaLotacoesItem4 = new GXBaseCollection[1] ;
      AV11ListaLotacao = new SdtsdtListaLotacao(remoteHandle, context);
      GXv_SdtsdtListaLotacao5 = new SdtsdtListaLotacao[1] ;
      GXv_objcol_SdtMessages_Message3 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   protected short Gx_restcode ;
   protected short initialized ;
   protected short AV9codgLotacao ;
   protected short Gx_err ;
   protected long AV17PageNumber ;
   protected long AV18PageSize ;
   protected boolean returnInSub ;
   protected boolean AV16IsValid ;
   protected boolean GXt_boolean1 ;
   protected boolean GXv_boolean2[] ;
   protected String AV15Token ;
   protected String AV13Retorno ;
   protected com.genexus.internet.HttpRequest AV14HttpRequest ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV5Messages ;
   protected GXBaseCollection<SdtsdtListaLotacoes_sdtListaLotacoesItem>[] arr_AV8ListaDadosLotacao ;
   protected SdtsdtListaLotacao[] arr_AV11ListaLotacao ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV5Messages ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message3[] ;
   protected GXBaseCollection<SdtsdtListaLotacoes_sdtListaLotacoesItem> AV8ListaDadosLotacao ;
   protected GXBaseCollection<SdtsdtListaLotacoes_sdtListaLotacoesItem> GXv_objcol_SdtsdtListaLotacoes_sdtListaLotacoesItem4[] ;
   protected SdtsdtLotacaoV2 AV6DadosLotacao ;
   protected SdtsdtListaLotacao AV11ListaLotacao ;
   protected SdtsdtListaLotacao GXv_SdtsdtListaLotacao5[] ;
   protected SdtsdtLotacao AV12InfoLotacao ;
}

