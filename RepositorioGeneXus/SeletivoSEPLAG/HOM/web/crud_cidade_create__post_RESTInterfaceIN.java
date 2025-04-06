import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_cidade_create__post_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_cidade_create__post_RESTInterfaceIN
{
   SdtsdtCidade_RESTInterface AV8DadosCidade;
   @JsonProperty("DadosCidade")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtCidade_RESTInterface getDadosCidade( )
   {
      return AV8DadosCidade ;
   }

   @JsonProperty("DadosCidade")
   public void setDadosCidade(  SdtsdtCidade_RESTInterface Value )
   {
      AV8DadosCidade= Value;
   }


}

