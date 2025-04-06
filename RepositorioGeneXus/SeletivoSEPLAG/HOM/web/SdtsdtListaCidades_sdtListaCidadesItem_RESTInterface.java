import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaCidades.sdtListaCidadesItem", namespace ="SeletivoSEPLAG")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtListaCidades_sdtListaCidadesItem_RESTInterface extends GxGenericCollectionItem<SdtsdtListaCidades_sdtListaCidadesItem>
{
   public SdtsdtListaCidades_sdtListaCidadesItem_RESTInterface( )
   {
      super(new SdtsdtListaCidades_sdtListaCidadesItem ());
   }

   public SdtsdtListaCidades_sdtListaCidadesItem_RESTInterface( SdtsdtListaCidades_sdtListaCidadesItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("cid_id")
   public Short getgxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_id( )
   {
      return ((SdtsdtListaCidades_sdtListaCidadesItem)getSdt()).getgxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_id() ;
   }

   @JsonProperty("cid_id")
   public void setgxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_id(  Short Value )
   {
      ((SdtsdtListaCidades_sdtListaCidadesItem)getSdt()).setgxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_id(Value);
   }


   @JsonProperty("cid_nome")
   public String getgxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_nome( )
   {
      return GXutil.rtrim(((SdtsdtListaCidades_sdtListaCidadesItem)getSdt()).getgxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_nome()) ;
   }

   @JsonProperty("cid_nome")
   public void setgxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_nome(  String Value )
   {
      ((SdtsdtListaCidades_sdtListaCidadesItem)getSdt()).setgxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_nome(Value);
   }


   @JsonProperty("cid_uf")
   public String getgxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_uf( )
   {
      return GXutil.rtrim(((SdtsdtListaCidades_sdtListaCidadesItem)getSdt()).getgxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_uf()) ;
   }

   @JsonProperty("cid_uf")
   public void setgxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_uf(  String Value )
   {
      ((SdtsdtListaCidades_sdtListaCidadesItem)getSdt()).setgxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_uf(Value);
   }


   int remoteHandle = -1;
}

