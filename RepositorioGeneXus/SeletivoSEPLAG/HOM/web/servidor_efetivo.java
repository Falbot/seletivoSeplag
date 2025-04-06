import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/servidor_efetivo", "/servidor_efetivo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class servidor_efetivo extends GXWebObjectStub
{
   public servidor_efetivo( )
   {
   }

   public servidor_efetivo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( servidor_efetivo.class ));
   }

   public servidor_efetivo( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new servidor_efetivo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new servidor_efetivo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "servidor_efetivo";
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

