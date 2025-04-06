import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaCidade", namespace ="SeletivoSEPLAG", propOrder={"cid_id", "cid_nome", "cid_uf"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtListaCidade_RESTInterface extends GxGenericCollectionItem<SdtsdtListaCidade>
{
   public SdtsdtListaCidade_RESTInterface( )
   {
      super(new SdtsdtListaCidade ());
   }

   public SdtsdtListaCidade_RESTInterface( SdtsdtListaCidade psdt )
   {
      super(psdt);
   }

   @JsonProperty("cid_id")
   public Short getgxTv_SdtsdtListaCidade_Cid_id( )
   {
      return ((SdtsdtListaCidade)getSdt()).getgxTv_SdtsdtListaCidade_Cid_id() ;
   }

   @JsonProperty("cid_id")
   public void setgxTv_SdtsdtListaCidade_Cid_id(  Short Value )
   {
      ((SdtsdtListaCidade)getSdt()).setgxTv_SdtsdtListaCidade_Cid_id(Value);
   }


   @JsonProperty("cid_nome")
   public String getgxTv_SdtsdtListaCidade_Cid_nome( )
   {
      return GXutil.rtrim(((SdtsdtListaCidade)getSdt()).getgxTv_SdtsdtListaCidade_Cid_nome()) ;
   }

   @JsonProperty("cid_nome")
   public void setgxTv_SdtsdtListaCidade_Cid_nome(  String Value )
   {
      ((SdtsdtListaCidade)getSdt()).setgxTv_SdtsdtListaCidade_Cid_nome(Value);
   }


   @JsonProperty("cid_uf")
   public String getgxTv_SdtsdtListaCidade_Cid_uf( )
   {
      return GXutil.rtrim(((SdtsdtListaCidade)getSdt()).getgxTv_SdtsdtListaCidade_Cid_uf()) ;
   }

   @JsonProperty("cid_uf")
   public void setgxTv_SdtsdtListaCidade_Cid_uf(  String Value )
   {
      ((SdtsdtListaCidade)getSdt()).setgxTv_SdtsdtListaCidade_Cid_uf(Value);
   }


   int remoteHandle = -1;
}

