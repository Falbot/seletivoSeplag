import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/{endereco :(?i)endereco}")
public final  class crud_endereco_services_rest extends GxRestService
{
   public static  class Gxep_create__postparm
   {
      public String  DadosEndereco ;
   }

   @jakarta.ws.rs.Path("/{create :(?i)create}")
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_create__post( crud_endereco_create__post_RESTInterfaceIN gxep_create__postparm ) throws Exception
   {
      super.init( "POST" );
      if ( ! processHeaders("crud_endereco",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      SdtsdtEndereco AV11DadosEndereco = new SdtsdtEndereco(remoteHandle, context);
      AV11DadosEndereco = (SdtsdtEndereco)gxep_create__postparm.getDadosEndereco().getSdt();
      short [] AV14RetornoPK = new short[] { 0 };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV7Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_endereco worker = new crud_endereco(remoteHandle, context);
         worker.gxep_create__post(AV11DadosEndereco,AV14RetornoPK,AV7Messages );
         crud_endereco_create__post_RESTInterfaceOUT data = new crud_endereco_create__post_RESTInterfaceOUT();
         data.setRetornoPK(AV14RetornoPK[0]);
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
   public jakarta.ws.rs.core.Response gxep_read_getlist( @jakarta.ws.rs.QueryParam("Pagenumber") @jakarta.ws.rs.DefaultValue("") String sAV19PageNumber ,
                                                         @jakarta.ws.rs.QueryParam("Pagesize") @jakarta.ws.rs.DefaultValue("") String sAV20PageSize ) throws Exception
   {
      super.init( "GET" );
      if ( ! processHeaders("crud_endereco",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      long AV19PageNumber;
      AV19PageNumber = GXutil.lval( sAV19PageNumber) ;
      long AV20PageSize;
      AV20PageSize = GXutil.lval( sAV20PageSize) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<SdtsdtListaEnderecos_sdtListaEnderecosItem> [] AV6ListaDadosEndereco = new GXBaseCollection[] { new GXBaseCollection<SdtsdtListaEnderecos_sdtListaEnderecosItem>() };
      try
      {
         crud_endereco worker = new crud_endereco(remoteHandle, context);
         worker.gxep_read_getlist(AV19PageNumber,AV20PageSize,AV6ListaDadosEndereco );
         crud_endereco_read_getlist_RESTInterfaceOUT data = new crud_endereco_read_getlist_RESTInterfaceOUT();
         data.setListaDadosEndereco(SdtsdtListaEnderecos_sdtListaEnderecosItem_RESTInterfacefromGXObjectCollection(AV6ListaDadosEndereco[0]));
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

   private Vector<SdtsdtListaEnderecos_sdtListaEnderecosItem_RESTInterface> SdtsdtListaEnderecos_sdtListaEnderecosItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtListaEnderecos_sdtListaEnderecosItem> collection )
   {
      Vector<SdtsdtListaEnderecos_sdtListaEnderecosItem_RESTInterface> result = new Vector<SdtsdtListaEnderecos_sdtListaEnderecosItem_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new SdtsdtListaEnderecos_sdtListaEnderecosItem_RESTInterface((SdtsdtListaEnderecos_sdtListaEnderecosItem)collection.elementAt(i)));
      }
      return result ;
   }

   @jakarta.ws.rs.Path("/{read_getbykey :(?i)read_getbykey}")
   @jakarta.ws.rs.GET
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_read_getbykey( @jakarta.ws.rs.QueryParam("Codgendereco") @jakarta.ws.rs.DefaultValue("") String sAV9codgEndereco ) throws Exception
   {
      super.init( "GET" );
      if ( ! processHeaders("crud_endereco",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      short AV9codgEndereco;
      AV9codgEndereco = (short)(GXutil.lval( sAV9codgEndereco)) ;
      SdtsdtListaEndereco [] AV13ListaEndereco = new SdtsdtListaEndereco[] { new SdtsdtListaEndereco() };
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV7Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_endereco worker = new crud_endereco(remoteHandle, context);
         worker.gxep_read_getbykey(AV9codgEndereco,AV13ListaEndereco,AV7Messages );
         crud_endereco_read_getbykey_RESTInterfaceOUT data = new crud_endereco_read_getbykey_RESTInterfaceOUT();
         if ( AV13ListaEndereco[0].isNull() == 0 )
         {
            data.setListaEndereco(new SdtsdtListaEndereco_RESTInterface(AV13ListaEndereco[0]));
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
      public String  ListaEndereco ;
   }

   @jakarta.ws.rs.Path("/{update :(?i)update}")
   @jakarta.ws.rs.PUT
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_update__put( crud_endereco_update__put_RESTInterfaceIN gxep_update__putparm ) throws Exception
   {
      super.init( "PUT" );
      if ( ! processHeaders("crud_endereco",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      SdtsdtListaEndereco AV13ListaEndereco = new SdtsdtListaEndereco(remoteHandle, context);
      AV13ListaEndereco = (SdtsdtListaEndereco)gxep_update__putparm.getListaEndereco().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV7Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_endereco worker = new crud_endereco(remoteHandle, context);
         worker.gxep_update__put(AV13ListaEndereco,AV7Messages );
         crud_endereco_update__put_RESTInterfaceOUT data = new crud_endereco_update__put_RESTInterfaceOUT();
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
   public jakarta.ws.rs.core.Response gxep_delete__delete( @jakarta.ws.rs.QueryParam("Codgendereco") @jakarta.ws.rs.DefaultValue("") String sAV9codgEndereco ) throws Exception
   {
      super.init( "DELETE" );
      if ( ! processHeaders("crud_endereco",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      short AV9codgEndereco;
      AV9codgEndereco = (short)(GXutil.lval( sAV9codgEndereco)) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV7Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_endereco worker = new crud_endereco(remoteHandle, context);
         worker.gxep_delete__delete(AV9codgEndereco,AV7Messages );
         crud_endereco_delete__delete_RESTInterfaceOUT data = new crud_endereco_delete__delete_RESTInterfaceOUT();
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

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

}

