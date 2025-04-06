import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/servidor_temporario", "/servidor_temporario"})
@jakarta.servlet.annotation.MultipartConfig
public final  class servidor_temporario extends GXWebObjectStub
{
   public servidor_temporario( )
   {
   }

   public servidor_temporario( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( servidor_temporario.class ));
   }

   public servidor_temporario( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new servidor_temporario_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new servidor_temporario_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "servidor_temporario";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

