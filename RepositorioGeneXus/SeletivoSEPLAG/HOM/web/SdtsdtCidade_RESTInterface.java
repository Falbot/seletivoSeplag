import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtCidade", namespace ="SeletivoSEPLAG")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtCidade_RESTInterface extends GxGenericCollectionItem<SdtsdtCidade>
{
   public SdtsdtCidade_RESTInterface( )
   {
      super(new SdtsdtCidade ());
   }

   public SdtsdtCidade_RESTInterface( SdtsdtCidade psdt )
   {
      super(psdt);
   }

   @JsonProperty("cid_nome")
   public String getgxTv_SdtsdtCidade_Cid_nome( )
   {
      return GXutil.rtrim(((SdtsdtCidade)getSdt()).getgxTv_SdtsdtCidade_Cid_nome()) ;
   }

   @JsonProperty("cid_nome")
   public void setgxTv_SdtsdtCidade_Cid_nome(  String Value )
   {
      ((SdtsdtCidade)getSdt()).setgxTv_SdtsdtCidade_Cid_nome(Value);
   }


   @JsonProperty("cid_uf")
   public String getgxTv_SdtsdtCidade_Cid_uf( )
   {
      return GXutil.rtrim(((SdtsdtCidade)getSdt()).getgxTv_SdtsdtCidade_Cid_uf()) ;
   }

   @JsonProperty("cid_uf")
   public void setgxTv_SdtsdtCidade_Cid_uf(  String Value )
   {
      ((SdtsdtCidade)getSdt()).setgxTv_SdtsdtCidade_Cid_uf(Value);
   }


   int remoteHandle = -1;
}

