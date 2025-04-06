import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_cidade_read_getbykey_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_cidade_read_getbykey_RESTInterfaceIN
{
   short AV5codgCidade;
   @JsonProperty("codgCidade")
   public short getcodgCidade( )
   {
      return AV5codgCidade ;
   }

   @JsonProperty("codgCidade")
   public void setcodgCidade(  short Value )
   {
      AV5codgCidade= Value;
   }


}

