import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_endereco_read_getbykey_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_endereco_read_getbykey_RESTInterfaceIN
{
   short AV9codgEndereco;
   @JsonProperty("codgEndereco")
   public short getcodgEndereco( )
   {
      return AV9codgEndereco ;
   }

   @JsonProperty("codgEndereco")
   public void setcodgEndereco(  short Value )
   {
      AV9codgEndereco= Value;
   }


}

