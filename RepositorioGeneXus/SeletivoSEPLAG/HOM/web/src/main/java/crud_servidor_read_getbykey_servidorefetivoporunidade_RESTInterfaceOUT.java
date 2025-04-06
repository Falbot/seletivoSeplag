import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_servidor_read_getbykey_servidorefetivoporunidade_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_servidor_read_getbykey_servidorefetivoporunidade_RESTInterfaceOUT
{
   Vector<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_RESTInterface> AV21ListaDadosServidoresEfetivos ;
   @JsonProperty("ListaDadosServidoresEfetivos")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_RESTInterface> getListaDadosServidoresEfetivos( )
   {
      return AV21ListaDadosServidoresEfetivos ;
   }

   @JsonProperty("ListaDadosServidoresEfetivos")
   public void setListaDadosServidoresEfetivos(  Vector<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_RESTInterface> Value )
   {
      AV21ListaDadosServidoresEfetivos= Value;
   }


}

