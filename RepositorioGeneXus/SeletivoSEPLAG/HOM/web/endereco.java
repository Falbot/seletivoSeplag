import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/endereco", "/endereco"})
@jakarta.servlet.annotation.MultipartConfig
public final  class endereco extends GXWebObjectStub
{
   public endereco( )
   {
   }

   public endereco( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( endereco.class ));
   }

   public endereco( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new endereco_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new endereco_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "endereco";
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

