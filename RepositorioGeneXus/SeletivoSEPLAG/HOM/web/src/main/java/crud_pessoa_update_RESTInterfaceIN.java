import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_pessoa_update_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_pessoa_update_RESTInterfaceIN
{
   SdtsdtListaPessoa_RESTInterface AV13ListaPessoa;
   @JsonProperty("ListaPessoa")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtListaPessoa_RESTInterface getListaPessoa( )
   {
      return AV13ListaPessoa ;
   }

   @JsonProperty("ListaPessoa")
   public void setListaPessoa(  SdtsdtListaPessoa_RESTInterface Value )
   {
      AV13ListaPessoa= Value;
   }


}

