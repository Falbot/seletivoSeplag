import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_servidor_create_servidorefetivo_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_servidor_create_servidorefetivo_RESTInterfaceIN
{
   SdtsdtServidor_RESTInterface AV7DadosServidor;
   @JsonProperty("DadosServidor")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtServidor_RESTInterface getDadosServidor( )
   {
      return AV7DadosServidor ;
   }

   @JsonProperty("DadosServidor")
   public void setDadosServidor(  SdtsdtServidor_RESTInterface Value )
   {
      AV7DadosServidor= Value;
   }


   String AV9NumeroMatricula;
   @JsonProperty("NumeroMatricula")
   public String getNumeroMatricula( )
   {
      if ( GXutil.strcmp(AV9NumeroMatricula, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV9NumeroMatricula ;
      }
   }

   @JsonProperty("NumeroMatricula")
   public void setNumeroMatricula(  String Value )
   {
      if ( Value == null )
      {
         AV9NumeroMatricula = "" ;
      }
      else
      {
         AV9NumeroMatricula= Value;
      }
   }


}

