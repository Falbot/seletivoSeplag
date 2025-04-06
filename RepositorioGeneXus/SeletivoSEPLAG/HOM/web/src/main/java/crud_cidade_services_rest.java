import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/{cidade :(?i)cidade}")
public final  class crud_cidade_services_rest extends GxRestService
{
   public static  class Gxep_createparm
   {
      public String  DadosCidade ;
   }

   @jakarta.ws.rs.Path("/{create :(?i)create}")
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_create( crud_cidade_create_RESTInterfaceIN gxep_createparm ) throws Exception
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
      if ( ! processHeaders("crud_cidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      SdtsdtCidade AV8DadosCidade = new SdtsdtCidade(remoteHandle, context);
      AV8DadosCidade = (SdtsdtCidade)gxep_createparm.getDadosCidade().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_cidade worker = new crud_cidade(remoteHandle, context);
         worker.gxep_create(AV8DadosCidade,AV6Messages );
         crud_cidade_create_RESTInterfaceOUT data = new crud_cidade_create_RESTInterfaceOUT();
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
   public jakarta.ws.rs.core.Response gxep_read_getlist( @jakarta.ws.rs.QueryParam("Pagenumber") @jakarta.ws.rs.DefaultValue("") String sAV16PageNumber ,
                                                         @jakarta.ws.rs.QueryParam("Pagesize") @jakarta.ws.rs.DefaultValue("") String sAV15PageSize ) throws Exception
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
      if ( ! processHeaders("crud_cidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      long AV16PageNumber;
      AV16PageNumber = GXutil.lval( sAV16PageNumber) ;
      long AV15PageSize;
      AV15PageSize = GXutil.lval( sAV15PageSize) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<SdtsdtListaCidades_sdtListaCidadesItem> [] AV9ListaDadosCidade = new GXBaseCollection[] { new GXBaseCollection<SdtsdtListaCidades_sdtListaCidadesItem>() };
      try
      {
         crud_cidade worker = new crud_cidade(remoteHandle, context);
         worker.gxep_read_getlist(AV16PageNumber,AV15PageSize,AV9ListaDadosCidade );
         crud_cidade_read_getlist_RESTInterfaceOUT data = new crud_cidade_read_getlist_RESTInterfaceOUT();
         data.setListaDadosCidade(SdtsdtListaCidades_sdtListaCidadesItem_RESTInterfacefromGXObjectCollection(AV9ListaDadosCidade[0]));
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

   private Vector<SdtsdtListaCidades_sdtListaCidadesItem_RESTInterface> SdtsdtListaCidades_sdtListaCidadesItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtListaCidades_sdtListaCidadesItem> collection )
   {
      Vector<SdtsdtListaCidades_sdtListaCidadesItem_RESTInterface> result = new Vector<SdtsdtListaCidades_sdtListaCidadesItem_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new SdtsdtListaCidades_sdtListaCidadesItem_RESTInterface((SdtsdtListaCidades_sdtListaCidadesItem)collection.elementAt(i)));
      }
      return result ;
   }

   @jakarta.ws.rs.Path("/{read_getbykey :(?i)read_getbykey}")
   @jakarta.ws.rs.GET
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_read_getbykey( @jakarta.ws.rs.QueryParam("Codgcidade") @jakarta.ws.rs.DefaultValue("") String sAV5codgCidade ) throws Exception
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
      if ( ! processHeaders("crud_cidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      short AV5codgCidade;
      AV5codgCidade = (short)(GXutil.lval( sAV5codgCidade)) ;
      SdtsdtListaCidade [] AV10ListaCidade = new SdtsdtListaCidade[] { new SdtsdtListaCidade() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_cidade worker = new crud_cidade(remoteHandle, context);
         worker.gxep_read_getbykey(AV5codgCidade,AV10ListaCidade,AV6Messages );
         crud_cidade_read_getbykey_RESTInterfaceOUT data = new crud_cidade_read_getbykey_RESTInterfaceOUT();
         if ( AV10ListaCidade[0].isNull() == 0 )
         {
            data.setListaCidade(new SdtsdtListaCidade_RESTInterface(AV10ListaCidade[0]));
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
      public String  ListaCidade ;
   }

   @jakarta.ws.rs.Path("/{update :(?i)update}")
   @jakarta.ws.rs.PUT
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_update( crud_cidade_update_RESTInterfaceIN gxep_updateparm ) throws Exception
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
      if ( ! processHeaders("crud_cidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      SdtsdtListaCidade AV10ListaCidade = new SdtsdtListaCidade(remoteHandle, context);
      AV10ListaCidade = (SdtsdtListaCidade)gxep_updateparm.getListaCidade().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_cidade worker = new crud_cidade(remoteHandle, context);
         worker.gxep_update(AV10ListaCidade,AV6Messages );
         crud_cidade_update_RESTInterfaceOUT data = new crud_cidade_update_RESTInterfaceOUT();
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
   public jakarta.ws.rs.core.Response gxep_delete( @jakarta.ws.rs.QueryParam("Codgcidade") @jakarta.ws.rs.DefaultValue("") String sAV5codgCidade ) throws Exception
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
      if ( ! processHeaders("crud_cidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      short AV5codgCidade;
      AV5codgCidade = (short)(GXutil.lval( sAV5codgCidade)) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_cidade worker = new crud_cidade(remoteHandle, context);
         worker.gxep_delete(AV5codgCidade,AV6Messages );
         crud_cidade_delete_RESTInterfaceOUT data = new crud_cidade_delete_RESTInterfaceOUT();
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

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

}

