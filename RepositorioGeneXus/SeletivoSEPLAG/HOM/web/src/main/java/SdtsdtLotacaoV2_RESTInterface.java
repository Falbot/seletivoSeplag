import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtLotacaoV2", namespace ="SeletivoSEPLAG", propOrder={"pes_id", "unid_id", "lot_data_lotacao", "lot_data_remocao", "lot_portaria"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtLotacaoV2_RESTInterface extends GxGenericCollectionItem<SdtsdtLotacaoV2>
{
   public SdtsdtLotacaoV2_RESTInterface( )
   {
      super(new SdtsdtLotacaoV2 ());
   }

   public SdtsdtLotacaoV2_RESTInterface( SdtsdtLotacaoV2 psdt )
   {
      super(psdt);
   }

   @JsonProperty("pes_id")
   public Short getgxTv_SdtsdtLotacaoV2_Pes_id( )
   {
      return ((SdtsdtLotacaoV2)getSdt()).getgxTv_SdtsdtLotacaoV2_Pes_id() ;
   }

   @JsonProperty("pes_id")
   public void setgxTv_SdtsdtLotacaoV2_Pes_id(  Short Value )
   {
      ((SdtsdtLotacaoV2)getSdt()).setgxTv_SdtsdtLotacaoV2_Pes_id(Value);
   }


   @JsonProperty("unid_id")
   public Short getgxTv_SdtsdtLotacaoV2_Unid_id( )
   {
      return ((SdtsdtLotacaoV2)getSdt()).getgxTv_SdtsdtLotacaoV2_Unid_id() ;
   }

   @JsonProperty("unid_id")
   public void setgxTv_SdtsdtLotacaoV2_Unid_id(  Short Value )
   {
      ((SdtsdtLotacaoV2)getSdt()).setgxTv_SdtsdtLotacaoV2_Unid_id(Value);
   }


   @JsonProperty("lot_data_lotacao")
   public String getgxTv_SdtsdtLotacaoV2_Lot_data_lotacao( )
   {
      return GXutil.rtrim(((SdtsdtLotacaoV2)getSdt()).getgxTv_SdtsdtLotacaoV2_Lot_data_lotacao()) ;
   }

   @JsonProperty("lot_data_lotacao")
   public void setgxTv_SdtsdtLotacaoV2_Lot_data_lotacao(  String Value )
   {
      ((SdtsdtLotacaoV2)getSdt()).setgxTv_SdtsdtLotacaoV2_Lot_data_lotacao(Value);
   }


   @JsonProperty("lot_data_remocao")
   public String getgxTv_SdtsdtLotacaoV2_Lot_data_remocao( )
   {
      return GXutil.rtrim(((SdtsdtLotacaoV2)getSdt()).getgxTv_SdtsdtLotacaoV2_Lot_data_remocao()) ;
   }

   @JsonProperty("lot_data_remocao")
   public void setgxTv_SdtsdtLotacaoV2_Lot_data_remocao(  String Value )
   {
      ((SdtsdtLotacaoV2)getSdt()).setgxTv_SdtsdtLotacaoV2_Lot_data_remocao(Value);
   }


   @JsonProperty("lot_portaria")
   public String getgxTv_SdtsdtLotacaoV2_Lot_portaria( )
   {
      return GXutil.rtrim(((SdtsdtLotacaoV2)getSdt()).getgxTv_SdtsdtLotacaoV2_Lot_portaria()) ;
   }

   @JsonProperty("lot_portaria")
   public void setgxTv_SdtsdtLotacaoV2_Lot_portaria(  String Value )
   {
      ((SdtsdtLotacaoV2)getSdt()).setgxTv_SdtsdtLotacaoV2_Lot_portaria(Value);
   }


   int remoteHandle = -1;
}

