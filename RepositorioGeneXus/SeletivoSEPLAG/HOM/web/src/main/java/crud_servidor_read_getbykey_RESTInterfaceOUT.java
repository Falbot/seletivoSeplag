import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_servidor_read_getbykey_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_servidor_read_getbykey_RESTInterfaceOUT
{
   SdtsdtListaServidor_RESTInterface AV27ListaServidor;
   @JsonProperty("ListaServidor")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtListaServidor_RESTInterface getListaServidor( )
   {
      return AV27ListaServidor ;
   }

   @JsonProperty("ListaServidor")
   public void setListaServidor(  SdtsdtListaServidor_RESTInterface Value )
   {
      AV27ListaServidor= Value;
   }


   Vector<com.genexus.SdtMessages_Message_RESTInterface> AV6Messages ;
   @JsonProperty("Messages")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.genexus.SdtMessages_Message_RESTInterface> getMessages( )
   {
      return AV6Messages ;
   }

   @JsonProperty("Messages")
   public void setMessages(  Vector<com.genexus.SdtMessages_Message_RESTInterface> Value )
   {
      AV6Messages= Value;
   }


}

