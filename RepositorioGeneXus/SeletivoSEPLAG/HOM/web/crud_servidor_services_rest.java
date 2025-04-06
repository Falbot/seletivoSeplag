import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/{servidor :(?i)servidor}")
public final  class crud_servidor_services_rest extends GxRestService
{
   public static  class Gxep_create_servidorefetivo__postparm
   {
      public String  DadosServidor ;
      public String  NumeroMatricula ;
   }

   @jakarta.ws.rs.Path("/{create_servidorefetivo :(?i)create_servidorefetivo}")
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_create_servidorefetivo__post( crud_servidor_create_servidorefetivo__post_RESTInterfaceIN gxep_create_servidorefetivo__postparm ) throws Exception
   {
      super.init( "POST" );
      if ( ! processHeaders("crud_servidor",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      SdtsdtServidor AV7DadosServidor = new SdtsdtServidor(remoteHandle, context);
      AV7DadosServidor = (SdtsdtServidor)gxep_create_servidorefetivo__postparm.getDadosServidor().getSdt();
      String AV9NumeroMatricula;
      AV9NumeroMatricula = gxep_create_servidorefetivo__postparm.getNumeroMatricula() ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_servidor worker = new crud_servidor(remoteHandle, context);
         worker.gxep_create_servidorefetivo__post(AV7DadosServidor,AV9NumeroMatricula,AV6Messages );
         crud_servidor_create_servidorefetivo__post_RESTInterfaceOUT data = new crud_servidor_create_servidorefetivo__post_RESTInterfaceOUT();
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

   @jakarta.ws.rs.Path("/{create_servidorefetivo :(?i)create_servidorefetivo}")
   @jakarta.ws.rs.OPTIONS
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response GetOptionsCreate_ServidorEfetivo__post( ) throws Exception
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

   public static  class Gxep_create_servidortemporario__postparm
   {
      public String  DadosServidor ;
      public String  DataAdmissao ;
      public String  DataDemissao ;
   }

   @jakarta.ws.rs.Path("/{create_servidortemporario :(?i)create_servidortemporario}")
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_create_servidortemporario__post( crud_servidor_create_servidortemporario__post_RESTInterfaceIN gxep_create_servidortemporario__postparm ) throws Exception
   {
      super.init( "POST" );
      if ( ! processHeaders("crud_servidor",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      SdtsdtServidor AV7DadosServidor = new SdtsdtServidor(remoteHandle, context);
      AV7DadosServidor = (SdtsdtServidor)gxep_create_servidortemporario__postparm.getDadosServidor().getSdt();
      String AV10DataAdmissao;
      AV10DataAdmissao = gxep_create_servidortemporario__postparm.getDataAdmissao() ;
      String AV11DataDemissao;
      AV11DataDemissao = gxep_create_servidortemporario__postparm.getDataDemissao() ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV6Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         crud_servidor worker = new crud_servidor(remoteHandle, context);
         worker.gxep_create_servidortemporario__post(AV7DadosServidor,AV10DataAdmissao,AV11DataDemissao,AV6Messages );
         crud_servidor_create_servidortemporario__post_RESTInterfaceOUT data = new crud_servidor_create_servidortemporario__post_RESTInterfaceOUT();
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

   @jakarta.ws.rs.Path("/{create_servidortemporario :(?i)create_servidortemporario}")
   @jakarta.ws.rs.OPTIONS
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response GetOptionsCreate_ServidorTemporario__post( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.okWrapped();
      builder.header("Access-Control-Request-Headers", "Content-Type");
      builder.header("Access-Control-Allow-Methods", "OPTIONS,HEAD,POST");
      builder.header( "Access-Control-Allow-Origin",  "*");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   @jakarta.ws.rs.Path("/{read_getlist_servidor :(?i)read_getlist_servidor}")
   @jakarta.ws.rs.GET
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_read_getlist_servidor( @jakarta.ws.rs.QueryParam("Pagenumber") @jakarta.ws.rs.DefaultValue("") String sAV24PageNumber ,
                                                                  @jakarta.ws.rs.QueryParam("Pagesize") @jakarta.ws.rs.DefaultValue("") String sAV25PageSize ) throws Exception
   {
      super.init( "GET" );
      if ( ! processHeaders("crud_servidor",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      long AV24PageNumber;
      AV24PageNumber = GXutil.lval( sAV24PageNumber) ;
      long AV25PageSize;
      AV25PageSize = GXutil.lval( sAV25PageSize) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem> [] AV17ListaDadosServidores = new GXBaseCollection[] { new GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem>() };
      try
      {
         crud_servidor worker = new crud_servidor(remoteHandle, context);
         worker.gxep_read_getlist_servidor(AV24PageNumber,AV25PageSize,AV17ListaDadosServidores );
         crud_servidor_read_getlist_servidor_RESTInterfaceOUT data = new crud_servidor_read_getlist_servidor_RESTInterfaceOUT();
         data.setListaDadosServidores(SdtsdtListaServidores_sdtListaServidoresItem_RESTInterfacefromGXObjectCollection(AV17ListaDadosServidores[0]));
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

   @jakarta.ws.rs.Path("/{read_getlist_servidor :(?i)read_getlist_servidor}")
   @jakarta.ws.rs.OPTIONS
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response GetOptionsRead_GetList_Servidor( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.okWrapped();
      builder.header("Access-Control-Request-Headers", "Content-Type");
      builder.header("Access-Control-Allow-Methods", "OPTIONS,HEAD,GET");
      builder.header( "Access-Control-Allow-Origin",  "*");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   private Vector<SdtsdtListaServidores_sdtListaServidoresItem_RESTInterface> SdtsdtListaServidores_sdtListaServidoresItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtListaServidores_sdtListaServidoresItem> collection )
   {
      Vector<SdtsdtListaServidores_sdtListaServidoresItem_RESTInterface> result = new Vector<SdtsdtListaServidores_sdtListaServidoresItem_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new SdtsdtListaServidores_sdtListaServidoresItem_RESTInterface((SdtsdtListaServidores_sdtListaServidoresItem)collection.elementAt(i)));
      }
      return result ;
   }

   @jakarta.ws.rs.Path("/{read_getbykey_servidorefetivoporunidade :(?i)read_getbykey_servidorefetivoporunidade}")
   @jakarta.ws.rs.GET
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_read_getbykey_servidorefetivoporunidade( @jakarta.ws.rs.QueryParam("Codgunidade") @jakarta.ws.rs.DefaultValue("") String sAV18codgUnidade ,
                                                                                    @jakarta.ws.rs.QueryParam("Pagenumber") @jakarta.ws.rs.DefaultValue("") String sAV24PageNumber ,
                                                                                    @jakarta.ws.rs.QueryParam("Pagesize") @jakarta.ws.rs.DefaultValue("") String sAV25PageSize ) throws Exception
   {
      super.init( "GET" );
      if ( ! processHeaders("crud_servidor",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      short AV18codgUnidade;
      AV18codgUnidade = (short)(GXutil.lval( sAV18codgUnidade)) ;
      long AV24PageNumber;
      AV24PageNumber = GXutil.lval( sAV24PageNumber) ;
      long AV25PageSize;
      AV25PageSize = GXutil.lval( sAV25PageSize) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem> [] AV21ListaDadosServidoresEfetivos = new GXBaseCollection[] { new GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem>() };
      try
      {
         crud_servidor worker = new crud_servidor(remoteHandle, context);
         worker.gxep_read_getbykey_servidorefetivoporunidade(AV18codgUnidade,AV24PageNumber,AV25PageSize,AV21ListaDadosServidoresEfetivos );
         crud_servidor_read_getbykey_servidorefetivoporunidade_RESTInterfaceOUT data = new crud_servidor_read_getbykey_servidorefetivoporunidade_RESTInterfaceOUT();
         data.setListaDadosServidoresEfetivos(SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_RESTInterfacefromGXObjectCollection(AV21ListaDadosServidoresEfetivos[0]));
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

   @jakarta.ws.rs.Path("/{read_getbykey_servidorefetivoporunidade :(?i)read_getbykey_servidorefetivoporunidade}")
   @jakarta.ws.rs.OPTIONS
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response GetOptionsRead_GetByKey_ServidorEfetivoPorUnidade( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.okWrapped();
      builder.header("Access-Control-Request-Headers", "Content-Type");
      builder.header("Access-Control-Allow-Methods", "OPTIONS,HEAD,GET");
      builder.header( "Access-Control-Allow-Origin",  "*");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   private Vector<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_RESTInterface> SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem> collection )
   {
      Vector<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_RESTInterface> result = new Vector<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_RESTInterface((SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem)collection.elementAt(i)));
      }
      return result ;
   }

   @jakarta.ws.rs.Path("/{read_getbyname_enderecofuncional :(?i)read_getbyname_enderecofuncional}")
   @jakarta.ws.rs.GET
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_read_getbyname_enderecofuncional( @jakarta.ws.rs.QueryParam("Nomepessoa") @jakarta.ws.rs.DefaultValue("") String sAV22NomePessoa ,
                                                                             @jakarta.ws.rs.QueryParam("Pagenumber") @jakarta.ws.rs.DefaultValue("") String sAV24PageNumber ,
                                                                             @jakarta.ws.rs.QueryParam("Pagesize") @jakarta.ws.rs.DefaultValue("") String sAV25PageSize ) throws Exception
   {
      super.init( "GET" );
      if ( ! processHeaders("crud_servidor",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      String AV22NomePessoa;
      AV22NomePessoa = sAV22NomePessoa ;
      long AV24PageNumber;
      AV24PageNumber = GXutil.lval( sAV24PageNumber) ;
      long AV25PageSize;
      AV25PageSize = GXutil.lval( sAV25PageSize) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem> [] AV23ListaEnderecoFuncional = new GXBaseCollection[] { new GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem>() };
      try
      {
         crud_servidor worker = new crud_servidor(remoteHandle, context);
         worker.gxep_read_getbyname_enderecofuncional(AV22NomePessoa,AV24PageNumber,AV25PageSize,AV23ListaEnderecoFuncional );
         crud_servidor_read_getbyname_enderecofuncional_RESTInterfaceOUT data = new crud_servidor_read_getbyname_enderecofuncional_RESTInterfaceOUT();
         data.setListaEnderecoFuncional(SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_RESTInterfacefromGXObjectCollection(AV23ListaEnderecoFuncional[0]));
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

   @jakarta.ws.rs.Path("/{read_getbyname_enderecofuncional :(?i)read_getbyname_enderecofuncional}")
   @jakarta.ws.rs.OPTIONS
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response GetOptionsRead_GetByName_EnderecoFuncional( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.okWrapped();
      builder.header("Access-Control-Request-Headers", "Content-Type");
      builder.header("Access-Control-Allow-Methods", "OPTIONS,HEAD,GET");
      builder.header( "Access-Control-Allow-Origin",  "*");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   private Vector<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_RESTInterface> SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem> collection )
   {
      Vector<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_RESTInterface> result = new Vector<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_RESTInterface((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)collection.elementAt(i)));
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

