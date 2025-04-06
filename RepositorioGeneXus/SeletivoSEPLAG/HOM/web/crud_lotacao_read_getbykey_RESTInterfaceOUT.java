import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_lotacao_read_getbykey_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_lotacao_read_getbykey_RESTInterfaceOUT
{
   SdtsdtListaLotacao_RESTInterface AV11ListaLotacao;
   @JsonProperty("ListaLotacao")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtListaLotacao_RESTInterface getListaLotacao( )
   {
      return AV11ListaLotacao ;
   }

   @JsonProperty("ListaLotacao")
   public void setListaLotacao(  SdtsdtListaLotacao_RESTInterface Value )
   {
      AV11ListaLotacao= Value;
   }


   Vector<com.genexus.SdtMessages_Message_RESTInterface> AV5Messages ;
   @JsonProperty("Messages")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.genexus.SdtMessages_Message_RESTInterface> getMessages( )
   {
      return AV5Messages ;
   }

   @JsonProperty("Messages")
   public void setMessages(  Vector<com.genexus.SdtMessages_Message_RESTInterface> Value )
   {
      AV5Messages= Value;
   }


}

