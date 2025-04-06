import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtLotacao", namespace ="SeletivoSEPLAG", propOrder={"lot_data_lotacao", "lot_data_remocao", "lot_portaria"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtLotacao_RESTInterface extends GxGenericCollectionItem<SdtsdtLotacao>
{
   public SdtsdtLotacao_RESTInterface( )
   {
      super(new SdtsdtLotacao ());
   }

   public SdtsdtLotacao_RESTInterface( SdtsdtLotacao psdt )
   {
      super(psdt);
   }

   @JsonProperty("lot_data_lotacao")
   public String getgxTv_SdtsdtLotacao_Lot_data_lotacao( )
   {
      return GXutil.rtrim(((SdtsdtLotacao)getSdt()).getgxTv_SdtsdtLotacao_Lot_data_lotacao()) ;
   }

   @JsonProperty("lot_data_lotacao")
   public void setgxTv_SdtsdtLotacao_Lot_data_lotacao(  String Value )
   {
      ((SdtsdtLotacao)getSdt()).setgxTv_SdtsdtLotacao_Lot_data_lotacao(Value);
   }


   @JsonProperty("lot_data_remocao")
   public String getgxTv_SdtsdtLotacao_Lot_data_remocao( )
   {
      return GXutil.rtrim(((SdtsdtLotacao)getSdt()).getgxTv_SdtsdtLotacao_Lot_data_remocao()) ;
   }

   @JsonProperty("lot_data_remocao")
   public void setgxTv_SdtsdtLotacao_Lot_data_remocao(  String Value )
   {
      ((SdtsdtLotacao)getSdt()).setgxTv_SdtsdtLotacao_Lot_data_remocao(Value);
   }


   @JsonProperty("lot_portaria")
   public String getgxTv_SdtsdtLotacao_Lot_portaria( )
   {
      return GXutil.rtrim(((SdtsdtLotacao)getSdt()).getgxTv_SdtsdtLotacao_Lot_portaria()) ;
   }

   @JsonProperty("lot_portaria")
   public void setgxTv_SdtsdtLotacao_Lot_portaria(  String Value )
   {
      ((SdtsdtLotacao)getSdt()).setgxTv_SdtsdtLotacao_Lot_portaria(Value);
   }


   int remoteHandle = -1;
}

