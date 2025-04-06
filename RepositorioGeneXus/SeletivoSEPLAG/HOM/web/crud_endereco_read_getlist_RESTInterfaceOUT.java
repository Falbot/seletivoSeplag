import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_endereco_read_getlist_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_endereco_read_getlist_RESTInterfaceOUT
{
   Vector<SdtsdtListaEnderecos_sdtListaEnderecosItem_RESTInterface> AV6ListaDadosEndereco ;
   @JsonProperty("ListaDadosEndereco")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtListaEnderecos_sdtListaEnderecosItem_RESTInterface> getListaDadosEndereco( )
   {
      return AV6ListaDadosEndereco ;
   }

   @JsonProperty("ListaDadosEndereco")
   public void setListaDadosEndereco(  Vector<SdtsdtListaEnderecos_sdtListaEnderecosItem_RESTInterface> Value )
   {
      AV6ListaDadosEndereco= Value;
   }


}

