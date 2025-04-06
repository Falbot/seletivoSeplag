import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_foto_pessoa_read_getbykey_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_foto_pessoa_read_getbykey_RESTInterfaceOUT
{
   SdtsdtListaFotoPessoa_RESTInterface AV21ListaFotos;
   @JsonProperty("ListaFotos")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtListaFotoPessoa_RESTInterface getListaFotos( )
   {
      return AV21ListaFotos ;
   }

   @JsonProperty("ListaFotos")
   public void setListaFotos(  SdtsdtListaFotoPessoa_RESTInterface Value )
   {
      AV21ListaFotos= Value;
   }


   Vector<com.genexus.SdtMessages_Message_RESTInterface> AV7Messages ;
   @JsonProperty("Messages")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.genexus.SdtMessages_Message_RESTInterface> getMessages( )
   {
      return AV7Messages ;
   }

   @JsonProperty("Messages")
   public void setMessages(  Vector<com.genexus.SdtMessages_Message_RESTInterface> Value )
   {
      AV7Messages= Value;
   }


}

