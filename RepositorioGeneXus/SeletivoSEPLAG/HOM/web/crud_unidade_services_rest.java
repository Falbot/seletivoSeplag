import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/{unidade :(?i)unidade}")
public final  class crud_unidade_services_rest extends GxRestService
{
   public static  class Gxep_create__postparm
   {
      public String  DadosUnidade ;
   }

   @jakarta.ws.rs.Path("/{create :(?i)create}")
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_create__post( crud_unidade_create__post_RESTInterfaceIN gxep_create__postparm ) throws Exception
   {
      super.init( "POST" );
      if ( ! processHeaders("crud_unidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      SdtsdtUnidade AV6DadosUnidade = new SdtsdtUnidade(remoteHandle, context);
      AV6DadosUnidade = (SdtsdtUnidade)gxep_create__postparm.getDadosUnidade().getSdt();
      short [] AV15RetornoPK = new short[] { 0 };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV7Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_unidade worker = new crud_unidade(remoteHandle, context);
         worker.gxep_create__post(AV6DadosUnidade,AV15RetornoPK,AV7Messages );
         crud_unidade_create__post_RESTInterfaceOUT data = new crud_unidade_create__post_RESTInterfaceOUT();
         data.setRetornoPK(AV15RetornoPK[0]);
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV7Messages[0]));
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
   public jakarta.ws.rs.core.Response gxep_read_getlist( @jakarta.ws.rs.QueryParam("Pagenumber") @jakarta.ws.rs.DefaultValue("") String sAV25PageNumber ,
                                                         @jakarta.ws.rs.QueryParam("Pagesize") @jakarta.ws.rs.DefaultValue("") String sAV26PageSize ) throws Exception
   {
      super.init( "GET" );
      if ( ! processHeaders("crud_unidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      long AV25PageNumber;
      AV25PageNumber = GXutil.lval( sAV25PageNumber) ;
      long AV26PageSize;
      AV26PageSize = GXutil.lval( sAV26PageSize) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<SdtsdtListaUnidades_sdtListaUnidadesItem> [] AV9ListaDadosUnidade = new GXBaseCollection[] { new GXBaseCollection<SdtsdtListaUnidades_sdtListaUnidadesItem>() };
      try
      {
         crud_unidade worker = new crud_unidade(remoteHandle, context);
         worker.gxep_read_getlist(AV25PageNumber,AV26PageSize,AV9ListaDadosUnidade );
         crud_unidade_read_getlist_RESTInterfaceOUT data = new crud_unidade_read_getlist_RESTInterfaceOUT();
         data.setListaDadosUnidade(SdtsdtListaUnidades_sdtListaUnidadesItem_RESTInterfacefromGXObjectCollection(AV9ListaDadosUnidade[0]));
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

   private Vector<SdtsdtListaUnidades_sdtListaUnidadesItem_RESTInterface> SdtsdtListaUnidades_sdtListaUnidadesItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtListaUnidades_sdtListaUnidadesItem> collection )
   {
      Vector<SdtsdtListaUnidades_sdtListaUnidadesItem_RESTInterface> result = new Vector<SdtsdtListaUnidades_sdtListaUnidadesItem_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new SdtsdtListaUnidades_sdtListaUnidadesItem_RESTInterface((SdtsdtListaUnidades_sdtListaUnidadesItem)collection.elementAt(i)));
      }
      return result ;
   }

   @jakarta.ws.rs.Path("/{read_getbykey :(?i)read_getbykey}")
   @jakarta.ws.rs.GET
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_read_getbykey( @jakarta.ws.rs.QueryParam("Codgunidade") @jakarta.ws.rs.DefaultValue("") String sAV10codgUnidade ) throws Exception
   {
      super.init( "GET" );
      if ( ! processHeaders("crud_unidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      short AV10codgUnidade;
      AV10codgUnidade = (short)(GXutil.lval( sAV10codgUnidade)) ;
      SdtsdtListaUnidade [] AV12ListaUnidade = new SdtsdtListaUnidade[] { new SdtsdtListaUnidade() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV7Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_unidade worker = new crud_unidade(remoteHandle, context);
         worker.gxep_read_getbykey(AV10codgUnidade,AV12ListaUnidade,AV7Messages );
         crud_unidade_read_getbykey_RESTInterfaceOUT data = new crud_unidade_read_getbykey_RESTInterfaceOUT();
         if ( AV12ListaUnidade[0].isNull() == 0 )
         {
            data.setListaUnidade(new SdtsdtListaUnidade_RESTInterface(AV12ListaUnidade[0]));
         }
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV7Messages[0]));
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
      public String  ListaUnidade ;
   }

   @jakarta.ws.rs.Path("/{update :(?i)update}")
   @jakarta.ws.rs.PUT
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_update__put( crud_unidade_update__put_RESTInterfaceIN gxep_update__putparm ) throws Exception
   {
      super.init( "PUT" );
      if ( ! processHeaders("crud_unidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      SdtsdtListaUnidade AV12ListaUnidade = new SdtsdtListaUnidade(remoteHandle, context);
      AV12ListaUnidade = (SdtsdtListaUnidade)gxep_update__putparm.getListaUnidade().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV7Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_unidade worker = new crud_unidade(remoteHandle, context);
         worker.gxep_update__put(AV12ListaUnidade,AV7Messages );
         crud_unidade_update__put_RESTInterfaceOUT data = new crud_unidade_update__put_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV7Messages[0]));
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
   public jakarta.ws.rs.core.Response gxep_delete__delete( @jakarta.ws.rs.QueryParam("Codgunidade") @jakarta.ws.rs.DefaultValue("") String sAV10codgUnidade ) throws Exception
   {
      super.init( "DELETE" );
      if ( ! processHeaders("crud_unidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      short AV10codgUnidade;
      AV10codgUnidade = (short)(GXutil.lval( sAV10codgUnidade)) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV7Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_unidade worker = new crud_unidade(remoteHandle, context);
         worker.gxep_delete__delete(AV10codgUnidade,AV7Messages );
         crud_unidade_delete__delete_RESTInterfaceOUT data = new crud_unidade_delete__delete_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV7Messages[0]));
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

   @jakarta.ws.rs.Path("/{delete_endereco :(?i)delete_endereco}")
   @jakarta.ws.rs.DELETE
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_delete_endereco__delete( @jakarta.ws.rs.QueryParam("Codgunidade") @jakarta.ws.rs.DefaultValue("") String sAV10codgUnidade ,
                                                                    @jakarta.ws.rs.QueryParam("Codendereco") @jakarta.ws.rs.DefaultValue("") String sAV16codEndereco ) throws Exception
   {
      super.init( "DELETE" );
      if ( ! processHeaders("crud_unidade",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      short AV10codgUnidade;
      AV10codgUnidade = (short)(GXutil.lval( sAV10codgUnidade)) ;
      short AV16codEndereco;
      AV16codEndereco = (short)(GXutil.lval( sAV16codEndereco)) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV7Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_unidade worker = new crud_unidade(remoteHandle, context);
         worker.gxep_delete_endereco__delete(AV10codgUnidade,AV16codEndereco,AV7Messages );
         crud_unidade_delete_endereco__delete_RESTInterfaceOUT data = new crud_unidade_delete_endereco__delete_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV7Messages[0]));
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
   public jakarta.ws.rs.core.Response GetOptionsDelete_Endereco__delete( ) throws Exception
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

