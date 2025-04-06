import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "autenticacao_token__post_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class autenticacao_token__post_RESTInterfaceOUT
{
   String AV12Token;
   @JsonProperty("Token")
   public String getToken( )
   {
      return AV12Token ;
   }

   @JsonProperty("Token")
   public void setToken(  String Value )
   {
      AV12Token= Value;
   }


   boolean AV15Success;
   @JsonProperty("Success")
   public boolean getSuccess( )
   {
      return AV15Success ;
   }

   @JsonProperty("Success")
   public void setSuccess(  boolean Value )
   {
      AV15Success= Value;
   }


}

