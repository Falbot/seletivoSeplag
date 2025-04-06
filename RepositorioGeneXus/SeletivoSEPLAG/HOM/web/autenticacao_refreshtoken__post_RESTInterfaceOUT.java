import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "autenticacao_refreshtoken__post_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class autenticacao_refreshtoken__post_RESTInterfaceOUT
{
   String AV14RefreshToken;
   @JsonProperty("RefreshToken")
   public String getRefreshToken( )
   {
      return AV14RefreshToken ;
   }

   @JsonProperty("RefreshToken")
   public void setRefreshToken(  String Value )
   {
      AV14RefreshToken= Value;
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

