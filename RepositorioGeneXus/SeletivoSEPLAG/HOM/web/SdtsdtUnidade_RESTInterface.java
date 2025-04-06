import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtUnidade", namespace ="SeletivoSEPLAG")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtUnidade_RESTInterface extends GxGenericCollectionItem<SdtsdtUnidade>
{
   public SdtsdtUnidade_RESTInterface( )
   {
      super(new SdtsdtUnidade ());
   }

   public SdtsdtUnidade_RESTInterface( SdtsdtUnidade psdt )
   {
      super(psdt);
   }

   @JsonProperty("unid_nome")
   public String getgxTv_SdtsdtUnidade_Unid_nome( )
   {
      return GXutil.rtrim(((SdtsdtUnidade)getSdt()).getgxTv_SdtsdtUnidade_Unid_nome()) ;
   }

   @JsonProperty("unid_nome")
   public void setgxTv_SdtsdtUnidade_Unid_nome(  String Value )
   {
      ((SdtsdtUnidade)getSdt()).setgxTv_SdtsdtUnidade_Unid_nome(Value);
   }


   @JsonProperty("unid_sigla")
   public String getgxTv_SdtsdtUnidade_Unid_sigla( )
   {
      return GXutil.rtrim(((SdtsdtUnidade)getSdt()).getgxTv_SdtsdtUnidade_Unid_sigla()) ;
   }

   @JsonProperty("unid_sigla")
   public void setgxTv_SdtsdtUnidade_Unid_sigla(  String Value )
   {
      ((SdtsdtUnidade)getSdt()).setgxTv_SdtsdtUnidade_Unid_sigla(Value);
   }


   @JsonProperty("DadosEndereco")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public SdtsdtEndereco_RESTInterface getgxTv_SdtsdtUnidade_Dadosendereco( )
   {
      if ( ((SdtsdtUnidade)getSdt()).getgxTv_SdtsdtUnidade_Dadosendereco_N() != 1 )
      {
         return new SdtsdtEndereco_RESTInterface(((SdtsdtUnidade)getSdt()).getgxTv_SdtsdtUnidade_Dadosendereco()) ;
      }
      else
      {
         return null ;
      }
   }

   @JsonProperty("DadosEndereco")
   public void setgxTv_SdtsdtUnidade_Dadosendereco(  SdtsdtEndereco_RESTInterface Value )
   {
      ((SdtsdtUnidade)getSdt()).setgxTv_SdtsdtUnidade_Dadosendereco((SdtsdtEndereco)Value.getSdt());
   }


   int remoteHandle = -1;
}

