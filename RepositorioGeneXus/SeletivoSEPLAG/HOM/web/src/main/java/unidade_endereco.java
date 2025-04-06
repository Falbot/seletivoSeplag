import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/unidade_endereco", "/unidade_endereco"})
@jakarta.servlet.annotation.MultipartConfig
public final  class unidade_endereco extends GXWebPanelStub
{
   public unidade_endereco( )
   {
   }

   public unidade_endereco( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( unidade_endereco.class ));
   }

   public unidade_endereco( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new unidade_endereco_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new unidade_endereco_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "unidade_endereco";
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

