import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/{autenticacao :(?i)autenticacao}")
public final  class autenticacao_services_rest extends GxRestService
{
   public static  class Gxep_token__postparm
   {
      public String  Usuario ;
      public String  Senha ;
   }

   @jakarta.ws.rs.Path("/{token :(?i)token}")
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_token__post( autenticacao_token__post_RESTInterfaceIN gxep_token__postparm ) throws Exception
   {
      super.init( "POST" );
      if ( ! processHeaders("autenticacao",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      String AV5Usuario;
      AV5Usuario = gxep_token__postparm.getUsuario() ;
      String AV6Senha;
      AV6Senha = gxep_token__postparm.getSenha() ;
      String [] AV12Token = new String[] { "" };
      boolean [] AV15Success = new boolean[] { false };
      try
      {
         autenticacao worker = new autenticacao(remoteHandle, context);
         worker.gxep_token__post(AV5Usuario,AV6Senha,AV12Token,AV15Success );
         autenticacao_token__post_RESTInterfaceOUT data = new autenticacao_token__post_RESTInterfaceOUT();
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
   public jakarta.ws.rs.core.Response GetOptionsToken__post( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.okWrapped();
      builder.header("Access-Control-Request-Headers", "Content-Type");
      builder.header("Access-Control-Allow-Methods", "OPTIONS,HEAD,POST");
      builder.header( "Access-Control-Allow-Origin",  "*");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   public static  class Gxep_refreshtoken__postparm
   {
      public String  Token ;
   }

   @jakarta.ws.rs.Path("/{refreshtoken :(?i)refreshtoken}")
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_refreshtoken__post( autenticacao_refreshtoken__post_RESTInterfaceIN gxep_refreshtoken__postparm ) throws Exception
   {
      super.init( "POST" );
      if ( ! processHeaders("autenticacao",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      String AV12Token;
      AV12Token = gxep_refreshtoken__postparm.getToken() ;
      String [] AV14RefreshToken = new String[] { "" };
      boolean [] AV15Success = new boolean[] { false };
      try
      {
         autenticacao worker = new autenticacao(remoteHandle, context);
         worker.gxep_refreshtoken__post(AV12Token,AV14RefreshToken,AV15Success );
         autenticacao_refreshtoken__post_RESTInterfaceOUT data = new autenticacao_refreshtoken__post_RESTInterfaceOUT();
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
   public jakarta.ws.rs.core.Response GetOptionsRefreshToken__post( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.okWrapped();
      builder.header("Access-Control-Request-Headers", "Content-Type");
      builder.header("Access-Control-Allow-Methods", "OPTIONS,HEAD,POST");
      builder.header( "Access-Control-Allow-Origin",  "*");
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

