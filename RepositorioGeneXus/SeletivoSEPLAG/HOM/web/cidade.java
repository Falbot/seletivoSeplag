import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/cidade", "/cidade"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cidade extends GXWebObjectStub
{
   public cidade( )
   {
   }

   public cidade( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cidade.class ));
   }

   public cidade( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cidade_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cidade_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "cidade";
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

