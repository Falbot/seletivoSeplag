import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/{autenticacao :(?i)autenticacao}")
public final  class autenticacao_services_rest extends GxRestService
{
   public static  class Gxep_tokenparm
   {
      public String  Usuario ;
      public String  Senha ;
   }

   @jakarta.ws.rs.Path("/{token :(?i)token}")
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_token( autenticacao_token_RESTInterfaceIN gxep_tokenparm ) throws Exception
   {
      super.init( "POST" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("autenticacao",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      String AV5Usuario;
      AV5Usuario = gxep_tokenparm.getUsuario() ;
      String AV6Senha;
      AV6Senha = gxep_tokenparm.getSenha() ;
      String [] AV12Token = new String[] { "" };
      boolean [] AV15Success = new boolean[] { false };
      try
      {
         autenticacao worker = new autenticacao(remoteHandle, context);
         worker.gxep_token(AV5Usuario,AV6Senha,AV12Token,AV15Success );
         autenticacao_token_RESTInterfaceOUT data = new autenticacao_token_RESTInterfaceOUT();
         data.setToken(AV12Token[0]);
         data.setSuccess(AV15Success[0]);
         builder = Response.okWrapped(data);
         if ( worker.getrestcode() != 0 )
         {
            builder = builder.status(worker.getrestcode());
         }
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @jakarta.ws.rs.Path("/{token :(?i)token}")
   @jakarta.ws.rs.OPTIONS
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response GetOptionsToken( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,POST");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   public static  class Gxep_refreshtokenparm
   {
      public String  Token ;
   }

   @jakarta.ws.rs.Path("/{refreshtoken :(?i)refreshtoken}")
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_refreshtoken( autenticacao_refreshtoken_RESTInterfaceIN gxep_refreshtokenparm ) throws Exception
   {
      super.init( "POST" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("autenticacao",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      String AV12Token;
      AV12Token = gxep_refreshtokenparm.getToken() ;
      String [] AV14RefreshToken = new String[] { "" };
      boolean [] AV15Success = new boolean[] { false };
      try
      {
         autenticacao worker = new autenticacao(remoteHandle, context);
         worker.gxep_refreshtoken(AV12Token,AV14RefreshToken,AV15Success );
         autenticacao_refreshtoken_RESTInterfaceOUT data = new autenticacao_refreshtoken_RESTInterfaceOUT();
         data.setRefreshToken(AV14RefreshToken[0]);
         data.setSuccess(AV15Success[0]);
         builder = Response.okWrapped(data);
         if ( worker.getrestcode() != 0 )
         {
            builder = builder.status(worker.getrestcode());
         }
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @jakarta.ws.rs.Path("/{refreshtoken :(?i)refreshtoken}")
   @jakarta.ws.rs.OPTIONS
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response GetOptionsRefreshToken( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,POST");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

}

