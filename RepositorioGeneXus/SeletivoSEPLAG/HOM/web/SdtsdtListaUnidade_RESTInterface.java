import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaUnidade", namespace ="SeletivoSEPLAG")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtListaUnidade_RESTInterface extends GxGenericCollectionItem<SdtsdtListaUnidade>
{
   public SdtsdtListaUnidade_RESTInterface( )
   {
      super(new SdtsdtListaUnidade ());
   }

   public SdtsdtListaUnidade_RESTInterface( SdtsdtListaUnidade psdt )
   {
      super(psdt);
   }

   @JsonProperty("unid_id")
   public Short getgxTv_SdtsdtListaUnidade_Unid_id( )
   {
      return ((SdtsdtListaUnidade)getSdt()).getgxTv_SdtsdtListaUnidade_Unid_id() ;
   }

   @JsonProperty("unid_id")
   public void setgxTv_SdtsdtListaUnidade_Unid_id(  Short Value )
   {
      ((SdtsdtListaUnidade)getSdt()).setgxTv_SdtsdtListaUnidade_Unid_id(Value);
   }


   @JsonProperty("unid_nome")
   public String getgxTv_SdtsdtListaUnidade_Unid_nome( )
   {
      return GXutil.rtrim(((SdtsdtListaUnidade)getSdt()).getgxTv_SdtsdtListaUnidade_Unid_nome()) ;
   }

   @JsonProperty("unid_nome")
   public void setgxTv_SdtsdtListaUnidade_Unid_nome(  String Value )
   {
      ((SdtsdtListaUnidade)getSdt()).setgxTv_SdtsdtListaUnidade_Unid_nome(Value);
   }


   @JsonProperty("unid_sigla")
   public String getgxTv_SdtsdtListaUnidade_Unid_sigla( )
   {
      return GXutil.rtrim(((SdtsdtListaUnidade)getSdt()).getgxTv_SdtsdtListaUnidade_Unid_sigla()) ;
   }

   @JsonProperty("unid_sigla")
   public void setgxTv_SdtsdtListaUnidade_Unid_sigla(  String Value )
   {
      ((SdtsdtListaUnidade)getSdt()).setgxTv_SdtsdtListaUnidade_Unid_sigla(Value);
   }


   int remoteHandle = -1;
}

