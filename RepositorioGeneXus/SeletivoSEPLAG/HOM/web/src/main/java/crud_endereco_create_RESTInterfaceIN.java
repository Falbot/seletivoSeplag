import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_endereco_create_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_endereco_create_RESTInterfaceIN
{
   SdtsdtEndereco_RESTInterface AV11DadosEndereco;
   @JsonProperty("DadosEndereco")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtEndereco_RESTInterface getDadosEndereco( )
   {
      return AV11DadosEndereco ;
   }

   @JsonProperty("DadosEndereco")
   public void setDadosEndereco(  SdtsdtEndereco_RESTInterface Value )
   {
      AV11DadosEndereco= Value;
   }


}

