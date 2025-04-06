import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_endereco_read_getlist_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_endereco_read_getlist_RESTInterfaceIN
{
   String AV19PageNumber;
   @JsonProperty("PageNumber")
   public String getPageNumber( )
   {
      return AV19PageNumber ;
   }

   @JsonProperty("PageNumber")
   public void setPageNumber(  String Value )
   {
      AV19PageNumber= Value;
   }


   String AV20PageSize;
   @JsonProperty("PageSize")
   public String getPageSize( )
   {
      return AV20PageSize ;
   }

   @JsonProperty("PageSize")
   public void setPageSize(  String Value )
   {
      AV20PageSize= Value;
   }


}

