import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_pessoa_read_getlist_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_pessoa_read_getlist_RESTInterfaceOUT
{
   Vector<SdtsdtListaPessoas_sdtListaPessoasItem_RESTInterface> AV7ListaDadosPessoa ;
   @JsonProperty("ListaDadosPessoa")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtListaPessoas_sdtListaPessoasItem_RESTInterface> getListaDadosPessoa( )
   {
      return AV7ListaDadosPessoa ;
   }

   @JsonProperty("ListaDadosPessoa")
   public void setListaDadosPessoa(  Vector<SdtsdtListaPessoas_sdtListaPessoasItem_RESTInterface> Value )
   {
      AV7ListaDadosPessoa= Value;
   }


}

