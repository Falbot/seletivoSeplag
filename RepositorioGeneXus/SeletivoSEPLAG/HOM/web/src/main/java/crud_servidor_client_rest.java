import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class crud_servidor_client_rest extends GXProcedure
{
   public crud_servidor_client_rest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crud_servidor_client_rest.class ), "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public crud_servidor_client_rest( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public crud_servidor_client_rest( int remoteHandle ,
                                     ModelContext context ,
                                     com.genexus.properties.GXObjectProperties objectProperties )
   {
      super( remoteHandle , context, "" );
      initialize();
      this.setObjProperties(objectProperties);
      restLocation = gxProperties.getLocation();
   }

   public void execute( )
   {
      cleanup();
   }

   public void InitLocation( )
   {
      restLocation = new com.genexus.internet.Location() ;
      restLocation.setHost( "localhost" );
      restLocation.setPort( 8080 );
      restLocation.setBaseURL( "SeletivoSEPLAGHOM/servidor" );
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public com.genexus.properties.GXObjectProperties getObjProperties( )
   {
      return gxProperties ;
   }

   public void setObjProperties(  com.genexus.properties.GXObjectProperties Value )
   {
      gxProperties = Value ;
   }


   public void gxep_create_servidorefetivo( SdtsdtServidor in_AV7DadosServidor ,
                                            String in_AV9NumeroMatricula ,
                                            GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      restCliCreate_ServidorEfetivo = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Create_ServidorEfetivo" );
      restCliCreate_ServidorEfetivo.setLocation( restLocation );
      restCliCreate_ServidorEfetivo.setHttpMethod( "POST" );
      restCliCreate_ServidorEfetivo.addBodyVar("DadosServidor", in_AV7DadosServidor);
      restCliCreate_ServidorEfetivo.addBodyVar("NumeroMatricula", in_AV9NumeroMatricula);
      restCliCreate_ServidorEfetivo.RestExecute();
      if ( restCliCreate_ServidorEfetivo.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliCreate_ServidorEfetivo.getErrorCode() );
         gxProperties.setErrorMessage( restCliCreate_ServidorEfetivo.getErrorMessage() );
         gxProperties.setStatusCode( restCliCreate_ServidorEfetivo.getStatusCode() );
      }
      else
      {
         arr_AV6Messages[0] = restCliCreate_ServidorEfetivo.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Create_ServidorEfetivo Constructor */
   }

   public void gxep_create_servidortemporario( SdtsdtServidor in_AV7DadosServidor ,
                                               String in_AV10DataAdmissao ,
                                               String in_AV11DataDemissao ,
                                               GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      restCliCreate_ServidorTemporario = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Create_ServidorTemporario" );
      restCliCreate_ServidorTemporario.setLocation( restLocation );
      restCliCreate_ServidorTemporario.setHttpMethod( "POST" );
      restCliCreate_ServidorTemporario.addBodyVar("DadosServidor", in_AV7DadosServidor);
      restCliCreate_ServidorTemporario.addBodyVar("DataAdmissao", in_AV10DataAdmissao);
      restCliCreate_ServidorTemporario.addBodyVar("DataDemissao", in_AV11DataDemissao);
      restCliCreate_ServidorTemporario.RestExecute();
      if ( restCliCreate_ServidorTemporario.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliCreate_ServidorTemporario.getErrorCode() );
         gxProperties.setErrorMessage( restCliCreate_ServidorTemporario.getErrorMessage() );
         gxProperties.setStatusCode( restCliCreate_ServidorTemporario.getStatusCode() );
      }
      else
      {
         arr_AV6Messages[0] = restCliCreate_ServidorTemporario.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Create_ServidorTemporario Constructor */
   }

   public void gxep_read_getlist_servidor( long in_AV24PageNumber ,
                                           long in_AV25PageSize ,
                                           GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem> [] arr_AV17ListaDadosServidores )
   {
      restCliRead_GetList_Servidor = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Read_GetList_Servidor" );
      restCliRead_GetList_Servidor.setLocation( restLocation );
      restCliRead_GetList_Servidor.setHttpMethod( "GET" );
      restCliRead_GetList_Servidor.addQueryVar("Pagenumber", in_AV24PageNumber);
      restCliRead_GetList_Servidor.addQueryVar("Pagesize", in_AV25PageSize);
      restCliRead_GetList_Servidor.RestExecute();
      if ( restCliRead_GetList_Servidor.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliRead_GetList_Servidor.getErrorCode() );
         gxProperties.setErrorMessage( restCliRead_GetList_Servidor.getErrorMessage() );
         gxProperties.setStatusCode( restCliRead_GetList_Servidor.getStatusCode() );
      }
      else
      {
         arr_AV17ListaDadosServidores[0] = restCliRead_GetList_Servidor.getBodyObjCollection("ListaDadosServidores",SdtsdtListaServidores_sdtListaServidoresItem.class );
      }
      /* Read_GetList_Servidor Constructor */
   }

   public void gxep_read_getbykey_servidorefetivoporunidade( short in_AV18codgUnidade ,
                                                             long in_AV24PageNumber ,
                                                             long in_AV25PageSize ,
                                                             GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem> [] arr_AV21ListaDadosServidoresEfetivos )
   {
      restCliRead_GetByKey_ServidorEfetivoPorUnidade = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Read_GetByKey_ServidorEfetivoPorUnidade" );
      restCliRead_GetByKey_ServidorEfetivoPorUnidade.setLocation( restLocation );
      restCliRead_GetByKey_ServidorEfetivoPorUnidade.setHttpMethod( "GET" );
      restCliRead_GetByKey_ServidorEfetivoPorUnidade.addQueryVar("Codgunidade", in_AV18codgUnidade);
      restCliRead_GetByKey_ServidorEfetivoPorUnidade.addQueryVar("Pagenumber", in_AV24PageNumber);
      restCliRead_GetByKey_ServidorEfetivoPorUnidade.addQueryVar("Pagesize", in_AV25PageSize);
      restCliRead_GetByKey_ServidorEfetivoPorUnidade.RestExecute();
      if ( restCliRead_GetByKey_ServidorEfetivoPorUnidade.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliRead_GetByKey_ServidorEfetivoPorUnidade.getErrorCode() );
         gxProperties.setErrorMessage( restCliRead_GetByKey_ServidorEfetivoPorUnidade.getErrorMessage() );
         gxProperties.setStatusCode( restCliRead_GetByKey_ServidorEfetivoPorUnidade.getStatusCode() );
      }
      else
      {
         arr_AV21ListaDadosServidoresEfetivos[0] = restCliRead_GetByKey_ServidorEfetivoPorUnidade.getBodyObjCollection("ListaDadosServidoresEfetivos",SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem.class );
      }
      /* Read_GetByKey_ServidorEfetivoPorUnidade Constructor */
   }

   public void gxep_read_getbyname_enderecofuncional( String in_AV22NomePessoa ,
                                                      long in_AV24PageNumber ,
                                                      long in_AV25PageSize ,
                                                      GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem> [] arr_AV23ListaEnderecoFuncional )
   {
      restCliRead_GetByName_EnderecoFuncional = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Read_GetByName_EnderecoFuncional" );
      restCliRead_GetByName_EnderecoFuncional.setLocation( restLocation );
      restCliRead_GetByName_EnderecoFuncional.setHttpMethod( "GET" );
      restCliRead_GetByName_EnderecoFuncional.addQueryVar("Nomepessoa", in_AV22NomePessoa);
      restCliRead_GetByName_EnderecoFuncional.addQueryVar("Pagenumber", in_AV24PageNumber);
      restCliRead_GetByName_EnderecoFuncional.addQueryVar("Pagesize", in_AV25PageSize);
      restCliRead_GetByName_EnderecoFuncional.RestExecute();
      if ( restCliRead_GetByName_EnderecoFuncional.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliRead_GetByName_EnderecoFuncional.getErrorCode() );
         gxProperties.setErrorMessage( restCliRead_GetByName_EnderecoFuncional.getErrorMessage() );
         gxProperties.setStatusCode( restCliRead_GetByName_EnderecoFuncional.getStatusCode() );
      }
      else
      {
         arr_AV23ListaEnderecoFuncional[0] = restCliRead_GetByName_EnderecoFuncional.getBodyObjCollection("ListaEnderecoFuncional",SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem.class );
      }
      /* Read_GetByName_EnderecoFuncional Constructor */
   }

   public void gxep_read_getbykey( short in_AV26CodgPessoa ,
                                   SdtsdtListaServidor [] arr_AV27ListaServidor ,
                                   GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      restCliRead_GetByKey = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Read_GetByKey" );
      restCliRead_GetByKey.setLocation( restLocation );
      restCliRead_GetByKey.setHttpMethod( "GET" );
      restCliRead_GetByKey.addQueryVar("Codgpessoa", in_AV26CodgPessoa);
      restCliRead_GetByKey.RestExecute();
      if ( restCliRead_GetByKey.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliRead_GetByKey.getErrorCode() );
         gxProperties.setErrorMessage( restCliRead_GetByKey.getErrorMessage() );
         gxProperties.setStatusCode( restCliRead_GetByKey.getStatusCode() );
      }
      else
      {
         arr_AV27ListaServidor[0] = restCliRead_GetByKey.getBodyObj("ListaServidor",SdtsdtListaServidor.class );
         arr_AV6Messages[0] = restCliRead_GetByKey.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Read_GetByKey Constructor */
   }

   public void gxep_update_demissaoservidortemporario( short in_AV26CodgPessoa ,
                                                       String in_AV10DataAdmissao ,
                                                       String in_AV11DataDemissao ,
                                                       GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      restCliUpdate_DemissaoServidorTemporario = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Update_DemissaoServidorTemporario" );
      restCliUpdate_DemissaoServidorTemporario.setLocation( restLocation );
      restCliUpdate_DemissaoServidorTemporario.setHttpMethod( "PUT" );
      restCliUpdate_DemissaoServidorTemporario.addBodyVar("CodgPessoa", in_AV26CodgPessoa);
      restCliUpdate_DemissaoServidorTemporario.addBodyVar("DataAdmissao", in_AV10DataAdmissao);
      restCliUpdate_DemissaoServidorTemporario.addBodyVar("DataDemissao", in_AV11DataDemissao);
      restCliUpdate_DemissaoServidorTemporario.RestExecute();
      if ( restCliUpdate_DemissaoServidorTemporario.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliUpdate_DemissaoServidorTemporario.getErrorCode() );
         gxProperties.setErrorMessage( restCliUpdate_DemissaoServidorTemporario.getErrorMessage() );
         gxProperties.setStatusCode( restCliUpdate_DemissaoServidorTemporario.getStatusCode() );
      }
      else
      {
         arr_AV6Messages[0] = restCliUpdate_DemissaoServidorTemporario.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Update_DemissaoServidorTemporario Constructor */
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
      gxProperties = new com.genexus.properties.GXObjectProperties();
      restCliCreate_ServidorEfetivo = new com.genexus.internet.GXRestAPIClient();
      restCliCreate_ServidorTemporario = new com.genexus.internet.GXRestAPIClient();
      restCliRead_GetList_Servidor = new com.genexus.internet.GXRestAPIClient();
      restCliRead_GetByKey_ServidorEfetivoPorUnidade = new com.genexus.internet.GXRestAPIClient();
      restCliRead_GetByName_EnderecoFuncional = new com.genexus.internet.GXRestAPIClient();
      restCliRead_GetByKey = new com.genexus.internet.GXRestAPIClient();
      restCliUpdate_DemissaoServidorTemporario = new com.genexus.internet.GXRestAPIClient();
   }

   protected short initialized ;
   protected com.genexus.internet.Location restLocation ;
   protected com.genexus.internet.GXRestAPIClient restCliCreate_ServidorEfetivo ;
   protected com.genexus.internet.GXRestAPIClient restCliCreate_ServidorTemporario ;
   protected com.genexus.internet.GXRestAPIClient restCliRead_GetList_Servidor ;
   protected com.genexus.internet.GXRestAPIClient restCliRead_GetByKey_ServidorEfetivoPorUnidade ;
   protected com.genexus.internet.GXRestAPIClient restCliRead_GetByName_EnderecoFuncional ;
   protected com.genexus.internet.GXRestAPIClient restCliRead_GetByKey ;
   protected com.genexus.internet.GXRestAPIClient restCliUpdate_DemissaoServidorTemporario ;
   protected com.genexus.properties.GXObjectProperties gxProperties ;
}

