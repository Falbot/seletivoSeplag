import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_servidor_read_getbykey_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_servidor_read_getbykey_RESTInterfaceIN
{
   short AV26CodgPessoa;
   @JsonProperty("CodgPessoa")
   public short getCodgPessoa( )
   {
      return AV26CodgPessoa ;
   }

   @JsonProperty("CodgPessoa")
   public void setCodgPessoa(  short Value )
   {
      AV26CodgPessoa= Value;
   }


}

