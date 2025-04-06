import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/pessoa_endereco", "/pessoa_endereco"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pessoa_endereco extends GXWebObjectStub
{
   public pessoa_endereco( )
   {
   }

   public pessoa_endereco( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pessoa_endereco.class ));
   }

   public pessoa_endereco( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pessoa_endereco_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pessoa_endereco_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "pessoa_endereco";
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

