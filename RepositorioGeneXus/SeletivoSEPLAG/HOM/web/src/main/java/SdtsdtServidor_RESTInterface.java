import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtServidor", namespace ="SeletivoSEPLAG", propOrder={"unid_id", "dadospessoa", "dadosendereco", "dadoslotacao", "foto"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtServidor_RESTInterface extends GxGenericCollectionItem<SdtsdtServidor>
{
   public SdtsdtServidor_RESTInterface( )
   {
      super(new SdtsdtServidor ());
   }

   public SdtsdtServidor_RESTInterface( SdtsdtServidor psdt )
   {
      super(psdt);
   }

   @JsonProperty("unid_id")
   public Short getgxTv_SdtsdtServidor_Unid_id( )
   {
      return ((SdtsdtServidor)getSdt()).getgxTv_SdtsdtServidor_Unid_id() ;
   }

   @JsonProperty("unid_id")
   public void setgxTv_SdtsdtServidor_Unid_id(  Short Value )
   {
      ((SdtsdtServidor)getSdt()).setgxTv_SdtsdtServidor_Unid_id(Value);
   }


   @JsonProperty("DadosPessoa")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtPessoa_RESTInterface getgxTv_SdtsdtServidor_Dadospessoa( )
   {
      if ( ((SdtsdtServidor)getSdt()).getgxTv_SdtsdtServidor_Dadospessoa_N() != 1 )
      {
         return new SdtsdtPessoa_RESTInterface(((SdtsdtServidor)getSdt()).getgxTv_SdtsdtServidor_Dadospessoa()) ;
      }
      else
      {
         return null ;
      }
   }

   @JsonProperty("DadosPessoa")
   public void setgxTv_SdtsdtServidor_Dadospessoa(  SdtsdtPessoa_RESTInterface Value )
   {
      ((SdtsdtServidor)getSdt()).setgxTv_SdtsdtServidor_Dadospessoa((SdtsdtPessoa)Value.getSdt());
   }


   @JsonProperty("DadosEndereco")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtEndereco_RESTInterface getgxTv_SdtsdtServidor_Dadosendereco( )
   {
      if ( ((SdtsdtServidor)getSdt()).getgxTv_SdtsdtServidor_Dadosendereco_N() != 1 )
      {
         return new SdtsdtEndereco_RESTInterface(((SdtsdtServidor)getSdt()).getgxTv_SdtsdtServidor_Dadosendereco()) ;
      }
      else
      {
         return null ;
      }
   }

   @JsonProperty("DadosEndereco")
   public void setgxTv_SdtsdtServidor_Dadosendereco(  SdtsdtEndereco_RESTInterface Value )
   {
      ((SdtsdtServidor)getSdt()).setgxTv_SdtsdtServidor_Dadosendereco((SdtsdtEndereco)Value.getSdt());
   }


   @JsonProperty("DadosLotacao")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtLotacao_RESTInterface getgxTv_SdtsdtServidor_Dadoslotacao( )
   {
      if ( ((SdtsdtServidor)getSdt()).getgxTv_SdtsdtServidor_Dadoslotacao_N() != 1 )
      {
         return new SdtsdtLotacao_RESTInterface(((SdtsdtServidor)getSdt()).getgxTv_SdtsdtServidor_Dadoslotacao()) ;
      }
      else
      {
         return null ;
      }
   }

   @JsonProperty("DadosLotacao")
   public void setgxTv_SdtsdtServidor_Dadoslotacao(  SdtsdtLotacao_RESTInterface Value )
   {
      ((SdtsdtServidor)getSdt()).setgxTv_SdtsdtServidor_Dadoslotacao((SdtsdtLotacao)Value.getSdt());
   }


   @JsonProperty("foto")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtFoto_RESTInterface> getgxTv_SdtsdtServidor_Foto( )
   {
      return SdtsdtFoto_RESTInterfacefromGXObjectCollection(((SdtsdtServidor)getSdt()).getgxTv_SdtsdtServidor_Foto()) ;
   }

   @JsonProperty("foto")
   public void setgxTv_SdtsdtServidor_Foto(  Vector<SdtsdtFoto_RESTInterface> Value )
   {
      ((SdtsdtServidor)getSdt()).setgxTv_SdtsdtServidor_Foto(SdtsdtFoto_RESTInterfacetoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<SdtsdtFoto> SdtsdtFoto_RESTInterfacetoGXObjectCollection( Vector<SdtsdtFoto_RESTInterface> collection )
   {
      GXBaseCollection<SdtsdtFoto> result = new GXBaseCollection<SdtsdtFoto>(SdtsdtFoto.class, "sdtFoto", "SeletivoSEPLAG", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((SdtsdtFoto)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<SdtsdtFoto_RESTInterface> SdtsdtFoto_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtFoto> collection )
   {
      Vector<SdtsdtFoto_RESTInterface> result = new Vector<SdtsdtFoto_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new SdtsdtFoto_RESTInterface((SdtsdtFoto)collection.elementAt(i)));
      }
      return result ;
   }

}

