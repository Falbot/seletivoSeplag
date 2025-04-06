import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/rwdpromptmasterpage", "/rwdpromptmasterpage"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rwdpromptmasterpage extends GXWebPanelStub
{
   public rwdpromptmasterpage( )
   {
   }

   public rwdpromptmasterpage( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rwdpromptmasterpage.class ));
   }

   public rwdpromptmasterpage( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rwdpromptmasterpage_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rwdpromptmasterpage_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Rwd Prompt Master Page";
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

