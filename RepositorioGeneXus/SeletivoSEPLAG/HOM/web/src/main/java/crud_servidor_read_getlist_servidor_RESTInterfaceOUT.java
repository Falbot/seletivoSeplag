import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_servidor_read_getlist_servidor_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_servidor_read_getlist_servidor_RESTInterfaceOUT
{
   Vector<SdtsdtListaServidores_sdtListaServidoresItem_RESTInterface> AV17ListaDadosServidores ;
   @JsonProperty("ListaDadosServidores")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtListaServidores_sdtListaServidoresItem_RESTInterface> getListaDadosServidores( )
   {
      return AV17ListaDadosServidores ;
   }

   @JsonProperty("ListaDadosServidores")
   public void setListaDadosServidores(  Vector<SdtsdtListaServidores_sdtListaServidoresItem_RESTInterface> Value )
   {
      AV17ListaDadosServidores= Value;
   }


}

