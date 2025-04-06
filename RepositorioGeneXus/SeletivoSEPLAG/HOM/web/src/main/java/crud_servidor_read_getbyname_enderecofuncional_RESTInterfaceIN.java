import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_servidor_read_getbyname_enderecofuncional_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_servidor_read_getbyname_enderecofuncional_RESTInterfaceIN
{
   String AV22NomePessoa;
   @JsonProperty("NomePessoa")
   public String getNomePessoa( )
   {
      if ( GXutil.strcmp(AV22NomePessoa, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV22NomePessoa ;
      }
   }

   @JsonProperty("NomePessoa")
   public void setNomePessoa(  String Value )
   {
      if ( Value == null )
      {
         AV22NomePessoa = "" ;
      }
      else
      {
         AV22NomePessoa= Value;
      }
   }


   String AV24PageNumber;
   @JsonProperty("PageNumber")
   public String getPageNumber( )
   {
      return AV24PageNumber ;
   }

   @JsonProperty("PageNumber")
   public void setPageNumber(  String Value )
   {
      AV24PageNumber= Value;
   }


   String AV25PageSize;
   @JsonProperty("PageSize")
   public String getPageSize( )
   {
      return AV25PageSize ;
   }

   @JsonProperty("PageSize")
   public void setPageSize(  String Value )
   {
      AV25PageSize= Value;
   }


}

