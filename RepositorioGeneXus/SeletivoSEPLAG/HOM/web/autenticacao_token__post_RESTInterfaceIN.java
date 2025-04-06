import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "autenticacao_token__post_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class autenticacao_token__post_RESTInterfaceIN
{
   String AV5Usuario;
   @JsonProperty("Usuario")
   public String getUsuario( )
   {
      if ( GXutil.strcmp(AV5Usuario, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV5Usuario ;
      }
   }

   @JsonProperty("Usuario")
   public void setUsuario(  String Value )
   {
      if ( Value == null )
      {
         AV5Usuario = "" ;
      }
      else
      {
         AV5Usuario= Value;
      }
   }


   String AV6Senha;
   @JsonProperty("Senha")
   public String getSenha( )
   {
      if ( GXutil.strcmp(AV6Senha, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV6Senha ;
      }
   }

   @JsonProperty("Senha")
   public void setSenha(  String Value )
   {
      if ( Value == null )
      {
         AV6Senha = "" ;
      }
      else
      {
         AV6Senha= Value;
      }
   }


}

