import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtFoto", namespace ="SeletivoSEPLAG")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtFoto_RESTInterface extends GxGenericCollectionItem<SdtsdtFoto>
{
   public SdtsdtFoto_RESTInterface( )
   {
      super(new SdtsdtFoto ());
   }

   public SdtsdtFoto_RESTInterface( SdtsdtFoto psdt )
   {
      super(psdt);
   }

   @JsonProperty("arquivoBase64")
   public String getgxTv_SdtsdtFoto_Arquivobase64( )
   {
      return ((SdtsdtFoto)getSdt()).getgxTv_SdtsdtFoto_Arquivobase64() ;
   }

   @JsonProperty("arquivoBase64")
   public void setgxTv_SdtsdtFoto_Arquivobase64(  String Value )
   {
      ((SdtsdtFoto)getSdt()).setgxTv_SdtsdtFoto_Arquivobase64(Value);
   }


   int remoteHandle = -1;
}

