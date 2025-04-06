import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtURLFoto", namespace ="SeletivoSEPLAG")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtURLFoto_RESTInterface extends GxGenericCollectionItem<SdtsdtURLFoto>
{
   public SdtsdtURLFoto_RESTInterface( )
   {
      super(new SdtsdtURLFoto ());
   }

   public SdtsdtURLFoto_RESTInterface( SdtsdtURLFoto psdt )
   {
      super(psdt);
   }

   @JsonProperty("LinkExp5Minutos")
   public String getgxTv_SdtsdtURLFoto_Linkexp5minutos( )
   {
      return ((SdtsdtURLFoto)getSdt()).getgxTv_SdtsdtURLFoto_Linkexp5minutos() ;
   }

   @JsonProperty("LinkExp5Minutos")
   public void setgxTv_SdtsdtURLFoto_Linkexp5minutos(  String Value )
   {
      ((SdtsdtURLFoto)getSdt()).setgxTv_SdtsdtURLFoto_Linkexp5minutos(Value);
   }


   int remoteHandle = -1;
}

