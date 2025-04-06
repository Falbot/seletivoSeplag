import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_unidade_update__put_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_unidade_update__put_RESTInterfaceIN
{
   SdtsdtListaUnidade_RESTInterface AV12ListaUnidade;
   @JsonProperty("ListaUnidade")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtListaUnidade_RESTInterface getListaUnidade( )
   {
      return AV12ListaUnidade ;
   }

   @JsonProperty("ListaUnidade")
   public void setListaUnidade(  SdtsdtListaUnidade_RESTInterface Value )
   {
      AV12ListaUnidade= Value;
   }


}

