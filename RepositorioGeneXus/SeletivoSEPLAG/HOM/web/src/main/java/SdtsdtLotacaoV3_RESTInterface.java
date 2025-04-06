import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtLotacaoV3", namespace ="SeletivoSEPLAG", propOrder={"unid_nome", "unid_sigla", "lot_data_lotacao", "lot_data_remocao", "lot_portaria"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtLotacaoV3_RESTInterface extends GxGenericCollectionItem<SdtsdtLotacaoV3>
{
   public SdtsdtLotacaoV3_RESTInterface( )
   {
      super(new SdtsdtLotacaoV3 ());
   }

   public SdtsdtLotacaoV3_RESTInterface( SdtsdtLotacaoV3 psdt )
   {
      super(psdt);
   }

   @JsonProperty("unid_nome")
   public String getgxTv_SdtsdtLotacaoV3_Unid_nome( )
   {
      return GXutil.rtrim(((SdtsdtLotacaoV3)getSdt()).getgxTv_SdtsdtLotacaoV3_Unid_nome()) ;
   }

   @JsonProperty("unid_nome")
   public void setgxTv_SdtsdtLotacaoV3_Unid_nome(  String Value )
   {
      ((SdtsdtLotacaoV3)getSdt()).setgxTv_SdtsdtLotacaoV3_Unid_nome(Value);
   }


   @JsonProperty("unid_sigla")
   public String getgxTv_SdtsdtLotacaoV3_Unid_sigla( )
   {
      return GXutil.rtrim(((SdtsdtLotacaoV3)getSdt()).getgxTv_SdtsdtLotacaoV3_Unid_sigla()) ;
   }

   @JsonProperty("unid_sigla")
   public void setgxTv_SdtsdtLotacaoV3_Unid_sigla(  String Value )
   {
      ((SdtsdtLotacaoV3)getSdt()).setgxTv_SdtsdtLotacaoV3_Unid_sigla(Value);
   }


   @JsonProperty("lot_data_lotacao")
   public String getgxTv_SdtsdtLotacaoV3_Lot_data_lotacao( )
   {
      return GXutil.rtrim(((SdtsdtLotacaoV3)getSdt()).getgxTv_SdtsdtLotacaoV3_Lot_data_lotacao()) ;
   }

   @JsonProperty("lot_data_lotacao")
   public void setgxTv_SdtsdtLotacaoV3_Lot_data_lotacao(  String Value )
   {
      ((SdtsdtLotacaoV3)getSdt()).setgxTv_SdtsdtLotacaoV3_Lot_data_lotacao(Value);
   }


   @JsonProperty("lot_data_remocao")
   public String getgxTv_SdtsdtLotacaoV3_Lot_data_remocao( )
   {
      return GXutil.rtrim(((SdtsdtLotacaoV3)getSdt()).getgxTv_SdtsdtLotacaoV3_Lot_data_remocao()) ;
   }

   @JsonProperty("lot_data_remocao")
   public void setgxTv_SdtsdtLotacaoV3_Lot_data_remocao(  String Value )
   {
      ((SdtsdtLotacaoV3)getSdt()).setgxTv_SdtsdtLotacaoV3_Lot_data_remocao(Value);
   }


   @JsonProperty("lot_portaria")
   public String getgxTv_SdtsdtLotacaoV3_Lot_portaria( )
   {
      return GXutil.rtrim(((SdtsdtLotacaoV3)getSdt()).getgxTv_SdtsdtLotacaoV3_Lot_portaria()) ;
   }

   @JsonProperty("lot_portaria")
   public void setgxTv_SdtsdtLotacaoV3_Lot_portaria(  String Value )
   {
      ((SdtsdtLotacaoV3)getSdt()).setgxTv_SdtsdtLotacaoV3_Lot_portaria(Value);
   }


   int remoteHandle = -1;
}

