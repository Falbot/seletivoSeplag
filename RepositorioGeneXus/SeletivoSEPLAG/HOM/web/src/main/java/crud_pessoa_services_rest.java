import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/{pessoa :(?i)pessoa}")
public final  class crud_pessoa_services_rest extends GxRestService
{
   public static  class Gxep_createparm
   {
      public String  DadosPessoa ;
   }

   @jakarta.ws.rs.Path("/{create :(?i)create}")
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_create( crud_pessoa_create_RESTInterfaceIN gxep_createparm ) throws Exception
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
      if ( ! processHeaders("crud_pessoa",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      SdtsdtPessoa AV5DadosPessoa = new SdtsdtPessoa(remoteHandle, context);
      AV5DadosPessoa = (SdtsdtPessoa)gxep_createparm.getDadosPessoa().getSdt();
      short [] AV15RetornoPK = new short[] { 0 };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_pessoa worker = new crud_pessoa(remoteHandle, context);
         worker.gxep_create(AV5DadosPessoa,AV15RetornoPK,AV6Messages );
         crud_pessoa_create_RESTInterfaceOUT data = new crud_pessoa_create_RESTInterfaceOUT();
         data.setRetornoPK(AV15RetornoPK[0]);
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV6Messages[0]));
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

   @jakarta.ws.rs.Path("/{create :(?i)create}")
   @jakarta.ws.rs.OPTIONS
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response GetOptionsCreate( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,POST");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   private Vector<com.genexus.SdtMessages_Message_RESTInterface> SdtMessages_Message_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.genexus.SdtMessages_Message> collection )
   {
      Vector<com.genexus.SdtMessages_Message_RESTInterface> result = new Vector<com.genexus.SdtMessages_Message_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new com.genexus.SdtMessages_Message_RESTInterface((com.genexus.SdtMessages_Message)collection.elementAt(i)));
      }
      return result ;
   }

   @jakarta.ws.rs.Path("/{read_getlist :(?i)read_getlist}")
   @jakarta.ws.rs.GET
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_read_getlist( @jakarta.ws.rs.QueryParam("Pagenumber") @jakarta.ws.rs.DefaultValue("") String sAV21PageNumber ,
                                                         @jakarta.ws.rs.QueryParam("Pagesize") @jakarta.ws.rs.DefaultValue("") String sAV20PageSize ) throws Exception
   {
      super.init( "GET" );
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
      if ( ! processHeaders("crud_pessoa",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      long AV21PageNumber;
      AV21PageNumber = GXutil.lval( sAV21PageNumber) ;
      long AV20PageSize;
      AV20PageSize = GXutil.lval( sAV20PageSize) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<SdtsdtListaPessoas_sdtListaPessoasItem> [] AV7ListaDadosPessoa = new GXBaseCollection[] { new GXBaseCollection<SdtsdtListaPessoas_sdtListaPessoasItem>() };
      try
      {
         crud_pessoa worker = new crud_pessoa(remoteHandle, context);
         worker.gxep_read_getlist(AV21PageNumber,AV20PageSize,AV7ListaDadosPessoa );
         crud_pessoa_read_getlist_RESTInterfaceOUT data = new crud_pessoa_read_getlist_RESTInterfaceOUT();
         data.setListaDadosPessoa(SdtsdtListaPessoas_sdtListaPessoasItem_RESTInterfacefromGXObjectCollection(AV7ListaDadosPessoa[0]));
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

   @jakarta.ws.rs.Path("/{read_getlist :(?i)read_getlist}")
   @jakarta.ws.rs.OPTIONS
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response GetOptionsRead_GetList( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,GET");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   private Vector<SdtsdtListaPessoas_sdtListaPessoasItem_RESTInterface> SdtsdtListaPessoas_sdtListaPessoasItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtListaPessoas_sdtListaPessoasItem> collection )
   {
      Vector<SdtsdtListaPessoas_sdtListaPessoasItem_RESTInterface> result = new Vector<SdtsdtListaPessoas_sdtListaPessoasItem_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new SdtsdtListaPessoas_sdtListaPessoasItem_RESTInterface((SdtsdtListaPessoas_sdtListaPessoasItem)collection.elementAt(i)));
      }
      return result ;
   }

   @jakarta.ws.rs.Path("/{read_getbykey :(?i)read_getbykey}")
   @jakarta.ws.rs.GET
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_read_getbykey( @jakarta.ws.rs.QueryParam("Codgpessoa") @jakarta.ws.rs.DefaultValue("") String sAV12codgPessoa ) throws Exception
   {
      super.init( "GET" );
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
      if ( ! processHeaders("crud_pessoa",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      short AV12codgPessoa;
      AV12codgPessoa = (short)(GXutil.lval( sAV12codgPessoa)) ;
      SdtsdtListaPessoa [] AV13ListaPessoa = new SdtsdtListaPessoa[] { new SdtsdtListaPessoa() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_pessoa worker = new crud_pessoa(remoteHandle, context);
         worker.gxep_read_getbykey(AV12codgPessoa,AV13ListaPessoa,AV6Messages );
         crud_pessoa_read_getbykey_RESTInterfaceOUT data = new crud_pessoa_read_getbykey_RESTInterfaceOUT();
         if ( AV13ListaPessoa[0].isNull() == 0 )
         {
            data.setListaPessoa(new SdtsdtListaPessoa_RESTInterface(AV13ListaPessoa[0]));
         }
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV6Messages[0]));
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

   @jakarta.ws.rs.Path("/{read_getbykey :(?i)read_getbykey}")
   @jakarta.ws.rs.OPTIONS
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response GetOptionsRead_GetByKey( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,GET");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   public static  class Gxep_updateparm
   {
      public String  ListaPessoa ;
   }

   @jakarta.ws.rs.Path("/{update :(?i)update}")
   @jakarta.ws.rs.PUT
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_update( crud_pessoa_update_RESTInterfaceIN gxep_updateparm ) throws Exception
   {
      super.init( "PUT" );
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
      if ( ! processHeaders("crud_pessoa",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      SdtsdtListaPessoa AV13ListaPessoa = new SdtsdtListaPessoa(remoteHandle, context);
      AV13ListaPessoa = (SdtsdtListaPessoa)gxep_updateparm.getListaPessoa().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_pessoa worker = new crud_pessoa(remoteHandle, context);
         worker.gxep_update(AV13ListaPessoa,AV6Messages );
         crud_pessoa_update_RESTInterfaceOUT data = new crud_pessoa_update_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV6Messages[0]));
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

   @jakarta.ws.rs.Path("/{update :(?i)update}")
   @jakarta.ws.rs.OPTIONS
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response GetOptionsUpdate( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,PUT");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   @jakarta.ws.rs.Path("/{delete :(?i)delete}")
   @jakarta.ws.rs.DELETE
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_delete( @jakarta.ws.rs.QueryParam("Codgpessoa") @jakarta.ws.rs.DefaultValue("") String sAV12codgPessoa ) throws Exception
   {
      super.init( "DELETE" );
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
      if ( ! processHeaders("crud_pessoa",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      short AV12codgPessoa;
      AV12codgPessoa = (short)(GXutil.lval( sAV12codgPessoa)) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_pessoa worker = new crud_pessoa(remoteHandle, context);
         worker.gxep_delete(AV12codgPessoa,AV6Messages );
         crud_pessoa_delete_RESTInterfaceOUT data = new crud_pessoa_delete_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV6Messages[0]));
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

   @jakarta.ws.rs.Path("/{delete :(?i)delete}")
   @jakarta.ws.rs.OPTIONS
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response GetOptionsDelete( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,DELETE");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   @jakarta.ws.rs.Path("/{delete_endereco :(?i)delete_endereco}")
   @jakarta.ws.rs.DELETE
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_delete_endereco( @jakarta.ws.rs.QueryParam("Codgpessoa") @jakarta.ws.rs.DefaultValue("") String sAV12codgPessoa ,
                                                            @jakarta.ws.rs.QueryParam("Codendereco") @jakarta.ws.rs.DefaultValue("") String sAV22codEndereco ) throws Exception
   {
      super.init( "DELETE" );
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
      if ( ! processHeaders("crud_pessoa",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      short AV12codgPessoa;
      AV12codgPessoa = (short)(GXutil.lval( sAV12codgPessoa)) ;
      short AV22codEndereco;
      AV22codEndereco = (short)(GXutil.lval( sAV22codEndereco)) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_pessoa worker = new crud_pessoa(remoteHandle, context);
         worker.gxep_delete_endereco(AV12codgPessoa,AV22codEndereco,AV6Messages );
         crud_pessoa_delete_endereco_RESTInterfaceOUT data = new crud_pessoa_delete_endereco_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV6Messages[0]));
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

   @jakarta.ws.rs.Path("/{delete_endereco :(?i)delete_endereco}")
   @jakarta.ws.rs.OPTIONS
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response GetOptionsDelete_Endereco( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,DELETE");
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

