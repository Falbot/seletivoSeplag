import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class crud_foto_pessoa_client_rest extends GXProcedure
{
   public crud_foto_pessoa_client_rest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crud_foto_pessoa_client_rest.class ), "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public crud_foto_pessoa_client_rest( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public crud_foto_pessoa_client_rest( int remoteHandle ,
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
      restLocation.setBaseURL( "SeletivoSEPLAGHOM/foto_pessoa" );
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


   public void gxep_create( SdtsdtFotoPessoa in_AV6DadosFotoPessoa ,
                            GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV7Messages )
   {
      restCliCreate = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Create" );
      restCliCreate.setLocation( restLocation );
      restCliCreate.setHttpMethod( "POST" );
      restCliCreate.addBodyVar("DadosFotoPessoa", in_AV6DadosFotoPessoa);
      restCliCreate.RestExecute();
      if ( restCliCreate.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliCreate.getErrorCode() );
         gxProperties.setErrorMessage( restCliCreate.getErrorMessage() );
         gxProperties.setStatusCode( restCliCreate.getStatusCode() );
      }
      else
      {
         arr_AV7Messages[0] = restCliCreate.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Create Constructor */
   }

   public void gxep_read_getlist( long in_AV12PageNumber ,
                                  long in_AV13PageSize ,
                                  GXBaseCollection<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem> [] arr_AV15ListaFotoPessoas )
   {
      restCliRead_GetList = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Read_GetList" );
      restCliRead_GetList.setLocation( restLocation );
      restCliRead_GetList.setHttpMethod( "GET" );
      restCliRead_GetList.addQueryVar("Pagenumber", in_AV12PageNumber);
      restCliRead_GetList.addQueryVar("Pagesize", in_AV13PageSize);
      restCliRead_GetList.RestExecute();
      if ( restCliRead_GetList.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliRead_GetList.getErrorCode() );
         gxProperties.setErrorMessage( restCliRead_GetList.getErrorMessage() );
         gxProperties.setStatusCode( restCliRead_GetList.getStatusCode() );
      }
      else
      {
         arr_AV15ListaFotoPessoas[0] = restCliRead_GetList.getBodyObjCollection("ListaFotoPessoas",SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem.class );
      }
      /* Read_GetList Constructor */
   }

   public void gxep_read_getbykey( short in_AV19codgPessoa ,
                                   SdtsdtListaFotoPessoa [] arr_AV21ListaFotos ,
                                   GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV7Messages )
   {
      restCliRead_GetByKey = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Read_GetByKey" );
      restCliRead_GetByKey.setLocation( restLocation );
      restCliRead_GetByKey.setHttpMethod( "GET" );
      restCliRead_GetByKey.addQueryVar("Codgpessoa", in_AV19codgPessoa);
      restCliRead_GetByKey.RestExecute();
      if ( restCliRead_GetByKey.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliRead_GetByKey.getErrorCode() );
         gxProperties.setErrorMessage( restCliRead_GetByKey.getErrorMessage() );
         gxProperties.setStatusCode( restCliRead_GetByKey.getStatusCode() );
      }
      else
      {
         arr_AV21ListaFotos[0] = restCliRead_GetByKey.getBodyObj("ListaFotos",SdtsdtListaFotoPessoa.class );
         arr_AV7Messages[0] = restCliRead_GetByKey.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Read_GetByKey Constructor */
   }

   public void gxep_update( SdtsdtAtualizarFotoPessoa in_AV16ListaFotoPessoa ,
                            GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV7Messages )
   {
      restCliUpdate = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Update" );
      restCliUpdate.setLocation( restLocation );
      restCliUpdate.setHttpMethod( "PUT" );
      restCliUpdate.addBodyVar("ListaFotoPessoa", in_AV16ListaFotoPessoa);
      restCliUpdate.RestExecute();
      if ( restCliUpdate.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliUpdate.getErrorCode() );
         gxProperties.setErrorMessage( restCliUpdate.getErrorMessage() );
         gxProperties.setStatusCode( restCliUpdate.getStatusCode() );
      }
      else
      {
         arr_AV7Messages[0] = restCliUpdate.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Update Constructor */
   }

   public void gxep_delete( short in_AV22codFotoPessoa ,
                            GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV7Messages )
   {
      restCliDelete = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Delete" );
      restCliDelete.setLocation( restLocation );
      restCliDelete.setHttpMethod( "DELETE" );
      restCliDelete.addQueryVar("Codfotopessoa", in_AV22codFotoPessoa);
      restCliDelete.RestExecute();
      if ( restCliDelete.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliDelete.getErrorCode() );
         gxProperties.setErrorMessage( restCliDelete.getErrorMessage() );
         gxProperties.setStatusCode( restCliDelete.getStatusCode() );
      }
      else
      {
         arr_AV7Messages[0] = restCliDelete.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Delete Constructor */
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
      restCliCreate = new com.genexus.internet.GXRestAPIClient();
      restCliRead_GetList = new com.genexus.internet.GXRestAPIClient();
      restCliRead_GetByKey = new com.genexus.internet.GXRestAPIClient();
      restCliUpdate = new com.genexus.internet.GXRestAPIClient();
      restCliDelete = new com.genexus.internet.GXRestAPIClient();
   }

   protected short initialized ;
   protected com.genexus.internet.Location restLocation ;
   protected com.genexus.internet.GXRestAPIClient restCliCreate ;
   protected com.genexus.internet.GXRestAPIClient restCliRead_GetList ;
   protected com.genexus.internet.GXRestAPIClient restCliRead_GetByKey ;
   protected com.genexus.internet.GXRestAPIClient restCliUpdate ;
   protected com.genexus.internet.GXRestAPIClient restCliDelete ;
   protected com.genexus.properties.GXObjectProperties gxProperties ;
}

