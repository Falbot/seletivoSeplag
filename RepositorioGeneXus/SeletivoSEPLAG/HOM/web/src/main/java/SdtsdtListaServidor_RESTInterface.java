import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaServidor", namespace ="SeletivoSEPLAG", propOrder={"tiposervidor", "dadospessoa", "dadosendereco", "dadoslotacao", "foto"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtListaServidor_RESTInterface extends GxGenericCollectionItem<SdtsdtListaServidor>
{
   public SdtsdtListaServidor_RESTInterface( )
   {
      super(new SdtsdtListaServidor ());
   }

   public SdtsdtListaServidor_RESTInterface( SdtsdtListaServidor psdt )
   {
      super(psdt);
   }

   @JsonProperty("TipoServidor")
   public String getgxTv_SdtsdtListaServidor_Tiposervidor( )
   {
      return GXutil.rtrim(((SdtsdtListaServidor)getSdt()).getgxTv_SdtsdtListaServidor_Tiposervidor()) ;
   }

   @JsonProperty("TipoServidor")
   public void setgxTv_SdtsdtListaServidor_Tiposervidor(  String Value )
   {
      ((SdtsdtListaServidor)getSdt()).setgxTv_SdtsdtListaServidor_Tiposervidor(Value);
   }


   @JsonProperty("DadosPessoa")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtPessoa_RESTInterface getgxTv_SdtsdtListaServidor_Dadospessoa( )
   {
      if ( ((SdtsdtListaServidor)getSdt()).getgxTv_SdtsdtListaServidor_Dadospessoa_N() != 1 )
      {
         return new SdtsdtPessoa_RESTInterface(((SdtsdtListaServidor)getSdt()).getgxTv_SdtsdtListaServidor_Dadospessoa()) ;
      }
      else
      {
         return null ;
      }
   }

   @JsonProperty("DadosPessoa")
   public void setgxTv_SdtsdtListaServidor_Dadospessoa(  SdtsdtPessoa_RESTInterface Value )
   {
      ((SdtsdtListaServidor)getSdt()).setgxTv_SdtsdtListaServidor_Dadospessoa((SdtsdtPessoa)Value.getSdt());
   }


   @JsonProperty("DadosEndereco")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtEndereco_RESTInterface> getgxTv_SdtsdtListaServidor_Dadosendereco( )
   {
      return SdtsdtEndereco_RESTInterfacefromGXObjectCollection(((SdtsdtListaServidor)getSdt()).getgxTv_SdtsdtListaServidor_Dadosendereco()) ;
   }

   @JsonProperty("DadosEndereco")
   public void setgxTv_SdtsdtListaServidor_Dadosendereco(  Vector<SdtsdtEndereco_RESTInterface> Value )
   {
      ((SdtsdtListaServidor)getSdt()).setgxTv_SdtsdtListaServidor_Dadosendereco(SdtsdtEndereco_RESTInterfacetoGXObjectCollection(Value));
   }


   @JsonProperty("DadosLotacao")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtLotacaoV3_RESTInterface> getgxTv_SdtsdtListaServidor_Dadoslotacao( )
   {
      return SdtsdtLotacaoV3_RESTInterfacefromGXObjectCollection(((SdtsdtListaServidor)getSdt()).getgxTv_SdtsdtListaServidor_Dadoslotacao()) ;
   }

   @JsonProperty("DadosLotacao")
   public void setgxTv_SdtsdtListaServidor_Dadoslotacao(  Vector<SdtsdtLotacaoV3_RESTInterface> Value )
   {
      ((SdtsdtListaServidor)getSdt()).setgxTv_SdtsdtListaServidor_Dadoslotacao(SdtsdtLotacaoV3_RESTInterfacetoGXObjectCollection(Value));
   }


   @JsonProperty("Foto")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtURLFoto_RESTInterface> getgxTv_SdtsdtListaServidor_Foto( )
   {
      return SdtsdtURLFoto_RESTInterfacefromGXObjectCollection(((SdtsdtListaServidor)getSdt()).getgxTv_SdtsdtListaServidor_Foto()) ;
   }

   @JsonProperty("Foto")
   public void setgxTv_SdtsdtListaServidor_Foto(  Vector<SdtsdtURLFoto_RESTInterface> Value )
   {
      ((SdtsdtListaServidor)getSdt()).setgxTv_SdtsdtListaServidor_Foto(SdtsdtURLFoto_RESTInterfacetoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<SdtsdtEndereco> SdtsdtEndereco_RESTInterfacetoGXObjectCollection( Vector<SdtsdtEndereco_RESTInterface> collection )
   {
      GXBaseCollection<SdtsdtEndereco> result = new GXBaseCollection<SdtsdtEndereco>(SdtsdtEndereco.class, "sdtEndereco", "SeletivoSEPLAG", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((SdtsdtEndereco)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private GXBaseCollection<SdtsdtLotacaoV3> SdtsdtLotacaoV3_RESTInterfacetoGXObjectCollection( Vector<SdtsdtLotacaoV3_RESTInterface> collection )
   {
      GXBaseCollection<SdtsdtLotacaoV3> result = new GXBaseCollection<SdtsdtLotacaoV3>(SdtsdtLotacaoV3.class, "sdtLotacaoV3", "SeletivoSEPLAG", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((SdtsdtLotacaoV3)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private GXBaseCollection<SdtsdtURLFoto> SdtsdtURLFoto_RESTInterfacetoGXObjectCollection( Vector<SdtsdtURLFoto_RESTInterface> collection )
   {
      GXBaseCollection<SdtsdtURLFoto> result = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((SdtsdtURLFoto)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<SdtsdtEndereco_RESTInterface> SdtsdtEndereco_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtEndereco> collection )
   {
      Vector<SdtsdtEndereco_RESTInterface> result = new Vector<SdtsdtEndereco_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new SdtsdtEndereco_RESTInterface((SdtsdtEndereco)collection.elementAt(i)));
      }
      return result ;
   }

   private Vector<SdtsdtLotacaoV3_RESTInterface> SdtsdtLotacaoV3_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtLotacaoV3> collection )
   {
      Vector<SdtsdtLotacaoV3_RESTInterface> result = new Vector<SdtsdtLotacaoV3_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new SdtsdtLotacaoV3_RESTInterface((SdtsdtLotacaoV3)collection.elementAt(i)));
      }
      return result ;
   }

   private Vector<SdtsdtURLFoto_RESTInterface> SdtsdtURLFoto_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtURLFoto> collection )
   {
      Vector<SdtsdtURLFoto_RESTInterface> result = new Vector<SdtsdtURLFoto_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new SdtsdtURLFoto_RESTInterface((SdtsdtURLFoto)collection.elementAt(i)));
      }
      return result ;
   }

}

