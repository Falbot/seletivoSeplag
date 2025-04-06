import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/{foto_pessoa :(?i)foto_pessoa}")
public final  class crud_foto_pessoa_services_rest extends GxRestService
{
   public static  class Gxep_create__postparm
   {
      public String  DadosFotoPessoa ;
   }

   @jakarta.ws.rs.Path("/{create :(?i)create}")
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_create__post( crud_foto_pessoa_create__post_RESTInterfaceIN gxep_create__postparm ) throws Exception
   {
      super.init( "POST" );
      if ( ! processHeaders("crud_foto_pessoa",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      SdtsdtFotoPessoa AV6DadosFotoPessoa = new SdtsdtFotoPessoa(remoteHandle, context);
      AV6DadosFotoPessoa = (SdtsdtFotoPessoa)gxep_create__postparm.getDadosFotoPessoa().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV7Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_foto_pessoa worker = new crud_foto_pessoa(remoteHandle, context);
         worker.gxep_create__post(AV6DadosFotoPessoa,AV7Messages );
         crud_foto_pessoa_create__post_RESTInterfaceOUT data = new crud_foto_pessoa_create__post_RESTInterfaceOUT();
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
   public jakarta.ws.rs.core.Response gxep_read_getlist( @jakarta.ws.rs.QueryParam("Pagenumber") @jakarta.ws.rs.DefaultValue("") String sAV12PageNumber ,
                                                         @jakarta.ws.rs.QueryParam("Pagesize") @jakarta.ws.rs.DefaultValue("") String sAV13PageSize ) throws Exception
   {
      super.init( "GET" );
      if ( ! processHeaders("crud_foto_pessoa",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      long AV12PageNumber;
      AV12PageNumber = GXutil.lval( sAV12PageNumber) ;
      long AV13PageSize;
      AV13PageSize = GXutil.lval( sAV13PageSize) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem> [] AV15ListaFotoPessoas = new GXBaseCollection[] { new GXBaseCollection<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem>() };
      try
      {
         crud_foto_pessoa worker = new crud_foto_pessoa(remoteHandle, context);
         worker.gxep_read_getlist(AV12PageNumber,AV13PageSize,AV15ListaFotoPessoas );
         crud_foto_pessoa_read_getlist_RESTInterfaceOUT data = new crud_foto_pessoa_read_getlist_RESTInterfaceOUT();
         data.setListaFotoPessoas(SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_RESTInterfacefromGXObjectCollection(AV15ListaFotoPessoas[0]));
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

   private Vector<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_RESTInterface> SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem> collection )
   {
      Vector<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_RESTInterface> result = new Vector<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_RESTInterface((SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem)collection.elementAt(i)));
      }
      return result ;
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

