import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_pessoa_create_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_pessoa_create_RESTInterfaceIN
{
   SdtsdtPessoa_RESTInterface AV5DadosPessoa;
   @JsonProperty("DadosPessoa")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtPessoa_RESTInterface getDadosPessoa( )
   {
      return AV5DadosPessoa ;
   }

   @JsonProperty("DadosPessoa")
   public void setDadosPessoa(  SdtsdtPessoa_RESTInterface Value )
   {
      AV5DadosPessoa= Value;
   }


}

