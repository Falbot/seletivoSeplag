import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_foto_pessoa_read_getlist_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_foto_pessoa_read_getlist_RESTInterfaceOUT
{
   Vector<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_RESTInterface> AV15ListaFotoPessoas ;
   @JsonProperty("ListaFotoPessoas")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_RESTInterface> getListaFotoPessoas( )
   {
      return AV15ListaFotoPessoas ;
   }

   @JsonProperty("ListaFotoPessoas")
   public void setListaFotoPessoas(  Vector<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_RESTInterface> Value )
   {
      AV15ListaFotoPessoas= Value;
   }


}

