import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_servidor_read_getbyname_enderecofuncional_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_servidor_read_getbyname_enderecofuncional_RESTInterfaceOUT
{
   Vector<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_RESTInterface> AV23ListaEnderecoFuncional ;
   @JsonProperty("ListaEnderecoFuncional")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_RESTInterface> getListaEnderecoFuncional( )
   {
      return AV23ListaEnderecoFuncional ;
   }

   @JsonProperty("ListaEnderecoFuncional")
   public void setListaEnderecoFuncional(  Vector<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_RESTInterface> Value )
   {
      AV23ListaEnderecoFuncional= Value;
   }


}

