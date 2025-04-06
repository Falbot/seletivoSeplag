import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_unidade_create_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_unidade_create_RESTInterfaceIN
{
   SdtsdtUnidade_RESTInterface AV6DadosUnidade;
   @JsonProperty("DadosUnidade")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtUnidade_RESTInterface getDadosUnidade( )
   {
      return AV6DadosUnidade ;
   }

   @JsonProperty("DadosUnidade")
   public void setDadosUnidade(  SdtsdtUnidade_RESTInterface Value )
   {
      AV6DadosUnidade= Value;
   }


}

