import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/{cidade :(?i)cidade}")
public final  class crud_cidade_services_rest extends GxRestService
{
   public static  class Gxep_create__postparm
   {
      public String  DadosCidade ;
   }

   @jakarta.ws.rs.Path("/{create :(?i)create}")
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_create__post( crud_cidade_create__post_RESTInterfaceIN gxep_create__postparm ) throws Exception
   {
      super.init( "POST" );
      if ( ! processHeaders("crud_cidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      SdtsdtCidade AV8DadosCidade = new SdtsdtCidade(remoteHandle, context);
      AV8DadosCidade = (SdtsdtCidade)gxep_create__postparm.getDadosCidade().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_cidade worker = new crud_cidade(remoteHandle, context);
         worker.gxep_create__post(AV8DadosCidade,AV6Messages );
         crud_cidade_create__post_RESTInterfaceOUT data = new crud_cidade_create__post_RESTInterfaceOUT();
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
   public jakarta.ws.rs.core.Response GetOptionsCreate__post( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.okWrapped();
      builder.header("Access-Control-Request-Headers", "Content-Type");
      builder.header("Access-Control-Allow-Methods", "OPTIONS,HEAD,POST");
      builder.header( "Access-Control-Allow-Origin",  "*");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   private Vector<com.genexus.SdtMessages_Message_RESTInterface> SdtMessages_Message_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.genexus.SdtMessages_Message> collection )
   {
      Vector<com.genexus.SdtMessages_Message_RESTInterface> result = new Vector<com.genexus.SdtMessages_Message_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
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
      builder = Response.okWrapped();
      builder.header("Access-Control-Request-Headers", "Content-Type");
      builder.header("Access-Control-Allow-Methods", "OPTIONS,HEAD,GET");
      builder.header( "Access-Control-Allow-Origin",  "*");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   private Vector<SdtsdtListaCidades_sdtListaCidadesItem_RESTInterface> SdtsdtListaCidades_sdtListaCidadesItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtListaCidades_sdtListaCidadesItem> collection )
   {
      Vector<SdtsdtListaCidades_sdtListaCidadesItem_RESTInterface> result = new Vector<SdtsdtListaCidades_sdtListaCidadesItem_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
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
      builder = Response.okWrapped();
      builder.header("Access-Control-Request-Headers", "Content-Type");
      builder.header("Access-Control-Allow-Methods", "OPTIONS,HEAD,GET");
      builder.header( "Access-Control-Allow-Origin",  "*");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   public static  class Gxep_update__putparm
   {
      public String  ListaCidade ;
   }

   @jakarta.ws.rs.Path("/{update :(?i)update}")
   @jakarta.ws.rs.PUT
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_update__put( crud_cidade_update__put_RESTInterfaceIN gxep_update__putparm ) throws Exception
   {
      super.init( "PUT" );
      if ( ! processHeaders("crud_cidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      SdtsdtListaCidade AV10ListaCidade = new SdtsdtListaCidade(remoteHandle, context);
      AV10ListaCidade = (SdtsdtListaCidade)gxep_update__putparm.getListaCidade().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_cidade worker = new crud_cidade(remoteHandle, context);
         worker.gxep_update__put(AV10ListaCidade,AV6Messages );
         crud_cidade_update__put_RESTInterfaceOUT data = new crud_cidade_update__put_RESTInterfaceOUT();
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
   public jakarta.ws.rs.core.Response GetOptionsUpdate__put( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.okWrapped();
      builder.header("Access-Control-Request-Headers", "Content-Type");
      builder.header("Access-Control-Allow-Methods", "OPTIONS,HEAD,PUT");
      builder.header( "Access-Control-Allow-Origin",  "*");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   @jakarta.ws.rs.Path("/{delete :(?i)delete}")
   @jakarta.ws.rs.DELETE
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_delete__delete( @jakarta.ws.rs.QueryParam("Codgcidade") @jakarta.ws.rs.DefaultValue("") String sAV5codgCidade ) throws Exception
   {
      super.init( "DELETE" );
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
         worker.gxep_delete__delete(AV5codgCidade,AV6Messages );
         crud_cidade_delete__delete_RESTInterfaceOUT data = new crud_cidade_delete__delete_RESTInterfaceOUT();
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
   public jakarta.ws.rs.core.Response GetOptionsDelete__delete( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.okWrapped();
      builder.header("Access-Control-Request-Headers", "Content-Type");
      builder.header("Access-Control-Allow-Methods", "OPTIONS,HEAD,DELETE");
      builder.header( "Access-Control-Allow-Origin",  "*");
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

