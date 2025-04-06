import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class autenticacao_client_rest extends GXProcedure
{
   public autenticacao_client_rest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( autenticacao_client_rest.class ), "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public autenticacao_client_rest( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public autenticacao_client_rest( int remoteHandle ,
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
      restLocation.setBaseURL( "SeletivoSEPLAGHOM/autenticacao" );
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


   public void gxep_token( String in_AV5Usuario ,
                           String in_AV6Senha ,
                           String [] arr_AV12Token ,
                           boolean [] arr_AV15Success )
   {
      restCliToken = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Token" );
      restCliToken.setLocation( restLocation );
      restCliToken.setHttpMethod( "POST" );
      restCliToken.addBodyVar("Usuario", in_AV5Usuario);
      restCliToken.addBodyVar("Senha", in_AV6Senha);
      restCliToken.RestExecute();
      if ( restCliToken.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliToken.getErrorCode() );
         gxProperties.setErrorMessage( restCliToken.getErrorMessage() );
         gxProperties.setStatusCode( restCliToken.getStatusCode() );
      }
      else
      {
         arr_AV12Token[0] = restCliToken.getBodyString("Token");
         arr_AV15Success[0] = restCliToken.getBodyBool("Success");
      }
      /* Token Constructor */
   }

   public void gxep_refreshtoken( String in_AV12Token ,
                                  String [] arr_AV14RefreshToken ,
                                  boolean [] arr_AV15Success )
   {
      restCliRefreshToken = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "RefreshToken" );
      restCliRefreshToken.setLocation( restLocation );
      restCliRefreshToken.setHttpMethod( "POST" );
      restCliRefreshToken.addBodyVar("Token", in_AV12Token);
      restCliRefreshToken.RestExecute();
      if ( restCliRefreshToken.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliRefreshToken.getErrorCode() );
         gxProperties.setErrorMessage( restCliRefreshToken.getErrorMessage() );
         gxProperties.setStatusCode( restCliRefreshToken.getStatusCode() );
      }
      else
      {
         arr_AV14RefreshToken[0] = restCliRefreshToken.getBodyString("RefreshToken");
         arr_AV15Success[0] = restCliRefreshToken.getBodyBool("Success");
      }
      /* RefreshToken Constructor */
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
      restCliToken = new com.genexus.internet.GXRestAPIClient();
      restCliRefreshToken = new com.genexus.internet.GXRestAPIClient();
   }

   protected short initialized ;
   protected com.genexus.internet.Location restLocation ;
   protected com.genexus.internet.GXRestAPIClient restCliToken ;
   protected com.genexus.internet.GXRestAPIClient restCliRefreshToken ;
   protected com.genexus.properties.GXObjectProperties gxProperties ;
}

