import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_servidor_create_servidortemporario__post_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_servidor_create_servidortemporario__post_RESTInterfaceIN
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


   String AV10DataAdmissao;
   @JsonProperty("DataAdmissao")
   public String getDataAdmissao( )
   {
      if ( GXutil.strcmp(AV10DataAdmissao, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV10DataAdmissao ;
      }
   }

   @JsonProperty("DataAdmissao")
   public void setDataAdmissao(  String Value )
   {
      if ( Value == null )
      {
         AV10DataAdmissao = "" ;
      }
      else
      {
         AV10DataAdmissao= Value;
      }
   }


   String AV11DataDemissao;
   @JsonProperty("DataDemissao")
   public String getDataDemissao( )
   {
      if ( GXutil.strcmp(AV11DataDemissao, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV11DataDemissao ;
      }
   }

   @JsonProperty("DataDemissao")
   public void setDataDemissao(  String Value )
   {
      if ( Value == null )
      {
         AV11DataDemissao = "" ;
      }
      else
      {
         AV11DataDemissao= Value;
      }
   }


}

