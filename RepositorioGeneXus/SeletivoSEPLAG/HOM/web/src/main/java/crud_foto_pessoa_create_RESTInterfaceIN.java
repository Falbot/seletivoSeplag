import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_foto_pessoa_create_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_foto_pessoa_create_RESTInterfaceIN
{
   SdtsdtFotoPessoa_RESTInterface AV6DadosFotoPessoa;
   @JsonProperty("DadosFotoPessoa")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtFotoPessoa_RESTInterface getDadosFotoPessoa( )
   {
      return AV6DadosFotoPessoa ;
   }

   @JsonProperty("DadosFotoPessoa")
   public void setDadosFotoPessoa(  SdtsdtFotoPessoa_RESTInterface Value )
   {
      AV6DadosFotoPessoa= Value;
   }


}

