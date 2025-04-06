import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class crud_servidor extends GXProcedure
{
   public crud_servidor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crud_servidor.class ), "" );
   }

   public crud_servidor( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e11062( )
   {
      /* Before Routine */
      returnInSub = false ;
      AV12Retorno = AV15HttpRequest.getHeader("Authorization") ;
      if ( ! (GXutil.strcmp("", AV12Retorno)==0) )
      {
         if ( GXutil.startsWith( AV12Retorno, "Bearer ") )
         {
            AV13Token = GXutil.strReplace( AV12Retorno, "Bearer ", "") ;
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

   public void gxep_create_servidorefetivo( SdtsdtServidor in_AV7DadosServidor ,
                                            String in_AV9NumeroMatricula ,
                                            GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV7DadosServidor = in_AV7DadosServidor;
      this.AV9NumeroMatricula = in_AV9NumeroMatricula;
      AV6Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV6Messages[0] = this.AV6Messages;
      /* Execute user event: Before */
      e11062 ();
      if ( returnInSub )
      {
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* Create_ServidorEfetivo Constructor */
      GXv_objcol_SdtMessages_Message3[0] = AV6Messages ;
      new pcriarservidorefetivo(remoteHandle, context).execute( AV7DadosServidor, AV9NumeroMatricula, GXv_objcol_SdtMessages_Message3) ;
      AV6Messages = GXv_objcol_SdtMessages_Message3[0] ;
      arr_AV6Messages[0] = this.AV6Messages;
   }

   public void gxep_create_servidortemporario( SdtsdtServidor in_AV7DadosServidor ,
                                               String in_AV10DataAdmissao ,
                                               String in_AV11DataDemissao ,
                                               GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV7DadosServidor = in_AV7DadosServidor;
      this.AV10DataAdmissao = in_AV10DataAdmissao;
      this.AV11DataDemissao = in_AV11DataDemissao;
      AV6Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV6Messages[0] = this.AV6Messages;
      /* Execute user event: Before */
      e11062 ();
      if ( returnInSub )
      {
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* Create_ServidorTemporario Constructor */
      GXv_objcol_SdtMessages_Message3[0] = AV6Messages ;
      new pcriarservidortemporario(remoteHandle, context).execute( AV7DadosServidor, AV10DataAdmissao, AV11DataDemissao, GXv_objcol_SdtMessages_Message3) ;
      AV6Messages = GXv_objcol_SdtMessages_Message3[0] ;
      arr_AV6Messages[0] = this.AV6Messages;
   }

   public void gxep_read_getlist_servidor( long in_AV24PageNumber ,
                                           long in_AV25PageSize ,
                                           GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem> [] arr_AV17ListaDadosServidores )
   {
      this.AV24PageNumber = in_AV24PageNumber;
      this.AV25PageSize = in_AV25PageSize;
      AV17ListaDadosServidores = new GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem>(SdtsdtListaServidores_sdtListaServidoresItem.class, "sdtListaServidoresItem", "SeletivoSEPLAG", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV17ListaDadosServidores[0] = this.AV17ListaDadosServidores;
      /* Execute user event: Before */
      e11062 ();
      if ( returnInSub )
      {
         arr_AV17ListaDadosServidores[0] = this.AV17ListaDadosServidores;
         return;
      }
      /* Read_GetList_Servidor Constructor */
      GXv_objcol_SdtsdtListaServidores_sdtListaServidoresItem4[0] = AV17ListaDadosServidores ;
      new dplistarservidores(remoteHandle, context).execute( AV24PageNumber, AV25PageSize, GXv_objcol_SdtsdtListaServidores_sdtListaServidoresItem4) ;
      AV17ListaDadosServidores = GXv_objcol_SdtsdtListaServidores_sdtListaServidoresItem4[0] ;
      arr_AV17ListaDadosServidores[0] = this.AV17ListaDadosServidores;
   }

   public void gxep_read_getbykey_servidorefetivoporunidade( short in_AV18codgUnidade ,
                                                             long in_AV24PageNumber ,
                                                             long in_AV25PageSize ,
                                                             GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem> [] arr_AV21ListaDadosServidoresEfetivos )
   {
      this.AV18codgUnidade = in_AV18codgUnidade;
      this.AV24PageNumber = in_AV24PageNumber;
      this.AV25PageSize = in_AV25PageSize;
      AV21ListaDadosServidoresEfetivos = new GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem>(SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem.class, "sdtEfetivoPorUnidadeItem", "SeletivoSEPLAG", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV21ListaDadosServidoresEfetivos[0] = this.AV21ListaDadosServidoresEfetivos;
      /* Execute user event: Before */
      e11062 ();
      if ( returnInSub )
      {
         arr_AV21ListaDadosServidoresEfetivos[0] = this.AV21ListaDadosServidoresEfetivos;
         return;
      }
      /* Read_GetByKey_ServidorEfetivoPorUnidade Constructor */
      GXv_objcol_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem5[0] = AV21ListaDadosServidoresEfetivos ;
      new dplistarservidoresefetivosporunidade(remoteHandle, context).execute( AV18codgUnidade, AV24PageNumber, AV25PageSize, GXv_objcol_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem5) ;
      AV21ListaDadosServidoresEfetivos = GXv_objcol_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem5[0] ;
      arr_AV21ListaDadosServidoresEfetivos[0] = this.AV21ListaDadosServidoresEfetivos;
   }

   public void gxep_read_getbyname_enderecofuncional( String in_AV22NomePessoa ,
                                                      long in_AV24PageNumber ,
                                                      long in_AV25PageSize ,
                                                      GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem> [] arr_AV23ListaEnderecoFuncional )
   {
      this.AV22NomePessoa = in_AV22NomePessoa;
      this.AV24PageNumber = in_AV24PageNumber;
      this.AV25PageSize = in_AV25PageSize;
      AV23ListaEnderecoFuncional = new GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem>(SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem.class, "sdtEnderecoLotacaoEfetivoItem", "SeletivoSEPLAG", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV23ListaEnderecoFuncional[0] = this.AV23ListaEnderecoFuncional;
      /* Execute user event: Before */
      e11062 ();
      if ( returnInSub )
      {
         arr_AV23ListaEnderecoFuncional[0] = this.AV23ListaEnderecoFuncional;
         return;
      }
      /* Read_GetByName_EnderecoFuncional Constructor */
      GXv_objcol_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem6[0] = AV23ListaEnderecoFuncional ;
      new penderecolotacaoefetivo(remoteHandle, context).execute( AV22NomePessoa, AV24PageNumber, AV25PageSize, GXv_objcol_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem6) ;
      AV23ListaEnderecoFuncional = GXv_objcol_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem6[0] ;
      arr_AV23ListaEnderecoFuncional[0] = this.AV23ListaEnderecoFuncional;
   }

   public void gxep_read_getbykey( short in_AV26CodgPessoa ,
                                   SdtsdtListaServidor [] arr_AV27ListaServidor ,
                                   GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV26CodgPessoa = in_AV26CodgPessoa;
      AV27ListaServidor = new SdtsdtListaServidor(remoteHandle, context);
      AV6Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV27ListaServidor[0] = this.AV27ListaServidor;
      arr_AV6Messages[0] = this.AV6Messages;
      /* Execute user event: Before */
      e11062 ();
      if ( returnInSub )
      {
         arr_AV27ListaServidor[0] = this.AV27ListaServidor;
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* Read_GetByKey Constructor */
      GXv_SdtsdtListaServidor7[0] = AV27ListaServidor;
      GXv_objcol_SdtMessages_Message3[0] = AV6Messages ;
      new plistarservidor(remoteHandle, context).execute( AV26CodgPessoa, GXv_SdtsdtListaServidor7, GXv_objcol_SdtMessages_Message3) ;
      AV27ListaServidor = GXv_SdtsdtListaServidor7[0];
      AV6Messages = GXv_objcol_SdtMessages_Message3[0] ;
      arr_AV27ListaServidor[0] = this.AV27ListaServidor;
      arr_AV6Messages[0] = this.AV6Messages;
   }

   public void gxep_update_demissaoservidortemporario( short in_AV26CodgPessoa ,
                                                       String in_AV10DataAdmissao ,
                                                       String in_AV11DataDemissao ,
                                                       GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV26CodgPessoa = in_AV26CodgPessoa;
      this.AV10DataAdmissao = in_AV10DataAdmissao;
      this.AV11DataDemissao = in_AV11DataDemissao;
      AV6Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV6Messages[0] = this.AV6Messages;
      /* Execute user event: Before */
      e11062 ();
      if ( returnInSub )
      {
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* Update_DemissaoServidorTemporario Constructor */
      GXv_objcol_SdtMessages_Message3[0] = AV6Messages ;
      new patualizarservidortemporario(remoteHandle, context).execute( AV26CodgPessoa, AV10DataAdmissao, AV11DataDemissao, GXv_objcol_SdtMessages_Message3) ;
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
      AV12Retorno = "" ;
      AV15HttpRequest = httpContext.getHttpRequest();
      AV13Token = "" ;
      GXv_boolean2 = new boolean[1] ;
      AV6Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV17ListaDadosServidores = new GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem>(SdtsdtListaServidores_sdtListaServidoresItem.class, "sdtListaServidoresItem", "SeletivoSEPLAG", remoteHandle);
      AV21ListaDadosServidoresEfetivos = new GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem>(SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem.class, "sdtEfetivoPorUnidadeItem", "SeletivoSEPLAG", remoteHandle);
      AV23ListaEnderecoFuncional = new GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem>(SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem.class, "sdtEnderecoLotacaoEfetivoItem", "SeletivoSEPLAG", remoteHandle);
      AV27ListaServidor = new SdtsdtListaServidor(remoteHandle, context);
      GXv_SdtsdtListaServidor7 = new SdtsdtListaServidor[1] ;
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtsdtListaServidores_sdtListaServidoresItem4 = new GXBaseCollection[1] ;
      GXv_objcol_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem5 = new GXBaseCollection[1] ;
      GXv_objcol_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem6 = new GXBaseCollection[1] ;
      GXv_objcol_SdtMessages_Message3 = new GXBaseCollection[1] ;
   }

   protected short Gx_restcode ;
   protected short initialized ;
   protected short AV18codgUnidade ;
   protected short AV26CodgPessoa ;
   protected long AV24PageNumber ;
   protected long AV25PageSize ;
   protected boolean returnInSub ;
   protected boolean AV14IsValid ;
   protected boolean GXt_boolean1 ;
   protected boolean GXv_boolean2[] ;
   protected String AV13Token ;
   protected String AV12Retorno ;
   protected String AV9NumeroMatricula ;
   protected String AV10DataAdmissao ;
   protected String AV11DataDemissao ;
   protected String AV22NomePessoa ;
   protected com.genexus.internet.HttpRequest AV15HttpRequest ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV6Messages ;
   protected GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem>[] arr_AV17ListaDadosServidores ;
   protected GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem>[] arr_AV21ListaDadosServidoresEfetivos ;
   protected GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem>[] arr_AV23ListaEnderecoFuncional ;
   protected SdtsdtListaServidor[] arr_AV27ListaServidor ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV6Messages ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message3[] ;
   protected GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem> AV17ListaDadosServidores ;
   protected GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem> GXv_objcol_SdtsdtListaServidores_sdtListaServidoresItem4[] ;
   protected GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem> AV21ListaDadosServidoresEfetivos ;
   protected GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem> GXv_objcol_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem5[] ;
   protected GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem> AV23ListaEnderecoFuncional ;
   protected GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem> GXv_objcol_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem6[] ;
   protected SdtsdtServidor AV7DadosServidor ;
   protected SdtsdtListaServidor AV27ListaServidor ;
   protected SdtsdtListaServidor GXv_SdtsdtListaServidor7[] ;
}

