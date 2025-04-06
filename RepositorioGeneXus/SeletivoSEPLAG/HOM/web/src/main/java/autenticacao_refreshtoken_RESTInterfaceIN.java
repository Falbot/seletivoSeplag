import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "autenticacao_refreshtoken_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class autenticacao_refreshtoken_RESTInterfaceIN
{
   String AV12Token;
   @JsonProperty("Token")
   public String getToken( )
   {
      if ( GXutil.strcmp(AV12Token, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV12Token ;
      }
   }

   @JsonProperty("Token")
   public void setToken(  String Value )
   {
      if ( Value == null )
      {
         AV12Token = "" ;
      }
      else
      {
         AV12Token= Value;
      }
   }


}

