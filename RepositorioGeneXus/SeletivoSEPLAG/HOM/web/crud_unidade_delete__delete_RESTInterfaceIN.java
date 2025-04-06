import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_unidade_delete__delete_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_unidade_delete__delete_RESTInterfaceIN
{
   short AV10codgUnidade;
   @JsonProperty("codgUnidade")
   public short getcodgUnidade( )
   {
      return AV10codgUnidade ;
   }

   @JsonProperty("codgUnidade")
   public void setcodgUnidade(  short Value )
   {
      AV10codgUnidade= Value;
   }


}

