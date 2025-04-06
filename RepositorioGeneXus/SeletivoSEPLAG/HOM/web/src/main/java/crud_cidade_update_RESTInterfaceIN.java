import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_cidade_update_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_cidade_update_RESTInterfaceIN
{
   SdtsdtListaCidade_RESTInterface AV10ListaCidade;
   @JsonProperty("ListaCidade")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtListaCidade_RESTInterface getListaCidade( )
   {
      return AV10ListaCidade ;
   }

   @JsonProperty("ListaCidade")
   public void setListaCidade(  SdtsdtListaCidade_RESTInterface Value )
   {
      AV10ListaCidade= Value;
   }


}

