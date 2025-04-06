import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_endereco_update_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_endereco_update_RESTInterfaceIN
{
   SdtsdtListaEndereco_RESTInterface AV13ListaEndereco;
   @JsonProperty("ListaEndereco")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtListaEndereco_RESTInterface getListaEndereco( )
   {
      return AV13ListaEndereco ;
   }

   @JsonProperty("ListaEndereco")
   public void setListaEndereco(  SdtsdtListaEndereco_RESTInterface Value )
   {
      AV13ListaEndereco= Value;
   }


}

