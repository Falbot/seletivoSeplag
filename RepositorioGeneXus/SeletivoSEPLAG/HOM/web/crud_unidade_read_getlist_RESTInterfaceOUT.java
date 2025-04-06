import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_unidade_read_getlist_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_unidade_read_getlist_RESTInterfaceOUT
{
   Vector<SdtsdtListaUnidades_sdtListaUnidadesItem_RESTInterface> AV9ListaDadosUnidade ;
   @JsonProperty("ListaDadosUnidade")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtListaUnidades_sdtListaUnidadesItem_RESTInterface> getListaDadosUnidade( )
   {
      return AV9ListaDadosUnidade ;
   }

   @JsonProperty("ListaDadosUnidade")
   public void setListaDadosUnidade(  Vector<SdtsdtListaUnidades_sdtListaUnidadesItem_RESTInterface> Value )
   {
      AV9ListaDadosUnidade= Value;
   }


}

