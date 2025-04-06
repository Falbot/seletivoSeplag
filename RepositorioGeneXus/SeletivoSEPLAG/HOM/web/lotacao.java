import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/lotacao", "/lotacao"})
@jakarta.servlet.annotation.MultipartConfig
public final  class lotacao extends GXWebObjectStub
{
   public lotacao( )
   {
   }

   public lotacao( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( lotacao.class ));
   }

   public lotacao( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new lotacao_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new lotacao_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "lotacao";
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

