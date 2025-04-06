import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_foto_pessoa_delete_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_foto_pessoa_delete_RESTInterfaceIN
{
   short AV22codFotoPessoa;
   @JsonProperty("codFotoPessoa")
   public short getcodFotoPessoa( )
   {
      return AV22codFotoPessoa ;
   }

   @JsonProperty("codFotoPessoa")
   public void setcodFotoPessoa(  short Value )
   {
      AV22codFotoPessoa= Value;
   }


}

