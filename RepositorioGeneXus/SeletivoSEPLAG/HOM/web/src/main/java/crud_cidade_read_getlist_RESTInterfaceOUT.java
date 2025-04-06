import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_cidade_read_getlist_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_cidade_read_getlist_RESTInterfaceOUT
{
   Vector<SdtsdtListaCidades_sdtListaCidadesItem_RESTInterface> AV9ListaDadosCidade ;
   @JsonProperty("ListaDadosCidade")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtListaCidades_sdtListaCidadesItem_RESTInterface> getListaDadosCidade( )
   {
      return AV9ListaDadosCidade ;
   }

   @JsonProperty("ListaDadosCidade")
   public void setListaDadosCidade(  Vector<SdtsdtListaCidades_sdtListaCidadesItem_RESTInterface> Value )
   {
      AV9ListaDadosCidade= Value;
   }


}

