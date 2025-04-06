import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaUnidades.sdtListaUnidadesItem", namespace ="SeletivoSEPLAG", propOrder={"unid_id", "unid_nome", "unid_sigla"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtListaUnidades_sdtListaUnidadesItem_RESTInterface extends GxGenericCollectionItem<SdtsdtListaUnidades_sdtListaUnidadesItem>
{
   public SdtsdtListaUnidades_sdtListaUnidadesItem_RESTInterface( )
   {
      super(new SdtsdtListaUnidades_sdtListaUnidadesItem ());
   }

   public SdtsdtListaUnidades_sdtListaUnidadesItem_RESTInterface( SdtsdtListaUnidades_sdtListaUnidadesItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("unid_id")
   public Short getgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id( )
   {
      return ((SdtsdtListaUnidades_sdtListaUnidadesItem)getSdt()).getgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id() ;
   }

   @JsonProperty("unid_id")
   public void setgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id(  Short Value )
   {
      ((SdtsdtListaUnidades_sdtListaUnidadesItem)getSdt()).setgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id(Value);
   }


   @JsonProperty("unid_nome")
   public String getgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome( )
   {
      return GXutil.rtrim(((SdtsdtListaUnidades_sdtListaUnidadesItem)getSdt()).getgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome()) ;
   }

   @JsonProperty("unid_nome")
   public void setgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome(  String Value )
   {
      ((SdtsdtListaUnidades_sdtListaUnidadesItem)getSdt()).setgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome(Value);
   }


   @JsonProperty("unid_sigla")
   public String getgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla( )
   {
      return GXutil.rtrim(((SdtsdtListaUnidades_sdtListaUnidadesItem)getSdt()).getgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla()) ;
   }

   @JsonProperty("unid_sigla")
   public void setgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla(  String Value )
   {
      ((SdtsdtListaUnidades_sdtListaUnidadesItem)getSdt()).setgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla(Value);
   }


   int remoteHandle = -1;
}

