import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_foto_pessoa_update_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_foto_pessoa_update_RESTInterfaceIN
{
   SdtsdtAtualizarFotoPessoa_RESTInterface AV16ListaFotoPessoa;
   @JsonProperty("ListaFotoPessoa")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtAtualizarFotoPessoa_RESTInterface getListaFotoPessoa( )
   {
      return AV16ListaFotoPessoa ;
   }

   @JsonProperty("ListaFotoPessoa")
   public void setListaFotoPessoa(  SdtsdtAtualizarFotoPessoa_RESTInterface Value )
   {
      AV16ListaFotoPessoa= Value;
   }


}

