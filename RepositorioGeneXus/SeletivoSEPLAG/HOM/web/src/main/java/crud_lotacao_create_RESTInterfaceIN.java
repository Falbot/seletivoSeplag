import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_lotacao_create_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_lotacao_create_RESTInterfaceIN
{
   SdtsdtLotacaoV2_RESTInterface AV6DadosLotacao;
   @JsonProperty("DadosLotacao")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtLotacaoV2_RESTInterface getDadosLotacao( )
   {
      return AV6DadosLotacao ;
   }

   @JsonProperty("DadosLotacao")
   public void setDadosLotacao(  SdtsdtLotacaoV2_RESTInterface Value )
   {
      AV6DadosLotacao= Value;
   }


}

