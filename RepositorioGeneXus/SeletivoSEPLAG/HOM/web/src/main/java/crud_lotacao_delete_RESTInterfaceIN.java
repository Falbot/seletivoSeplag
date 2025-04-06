import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_lotacao_delete_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_lotacao_delete_RESTInterfaceIN
{
   short AV9codgLotacao;
   @JsonProperty("codgLotacao")
   public short getcodgLotacao( )
   {
      return AV9codgLotacao ;
   }

   @JsonProperty("codgLotacao")
   public void setcodgLotacao(  short Value )
   {
      AV9codgLotacao= Value;
   }


}

