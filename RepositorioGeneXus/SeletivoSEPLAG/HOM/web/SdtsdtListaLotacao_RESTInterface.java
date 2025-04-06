import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaLotacao", namespace ="SeletivoSEPLAG")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtListaLotacao_RESTInterface extends GxGenericCollectionItem<SdtsdtListaLotacao>
{
   public SdtsdtListaLotacao_RESTInterface( )
   {
      super(new SdtsdtListaLotacao ());
   }

   public SdtsdtListaLotacao_RESTInterface( SdtsdtListaLotacao psdt )
   {
      super(psdt);
   }

   @JsonProperty("lot_id")
   public Short getgxTv_SdtsdtListaLotacao_Lot_id( )
   {
      return ((SdtsdtListaLotacao)getSdt()).getgxTv_SdtsdtListaLotacao_Lot_id() ;
   }

   @JsonProperty("lot_id")
   public void setgxTv_SdtsdtListaLotacao_Lot_id(  Short Value )
   {
      ((SdtsdtListaLotacao)getSdt()).setgxTv_SdtsdtListaLotacao_Lot_id(Value);
   }


   @JsonProperty("pes_id")
   public Short getgxTv_SdtsdtListaLotacao_Pes_id( )
   {
      return ((SdtsdtListaLotacao)getSdt()).getgxTv_SdtsdtListaLotacao_Pes_id() ;
   }

   @JsonProperty("pes_id")
   public void setgxTv_SdtsdtListaLotacao_Pes_id(  Short Value )
   {
      ((SdtsdtListaLotacao)getSdt()).setgxTv_SdtsdtListaLotacao_Pes_id(Value);
   }


   @JsonProperty("pes_nome")
   public String getgxTv_SdtsdtListaLotacao_Pes_nome( )
   {
      return GXutil.rtrim(((SdtsdtListaLotacao)getSdt()).getgxTv_SdtsdtListaLotacao_Pes_nome()) ;
   }

   @JsonProperty("pes_nome")
   public void setgxTv_SdtsdtListaLotacao_Pes_nome(  String Value )
   {
      ((SdtsdtListaLotacao)getSdt()).setgxTv_SdtsdtListaLotacao_Pes_nome(Value);
   }


   @JsonProperty("unid_id")
   public Short getgxTv_SdtsdtListaLotacao_Unid_id( )
   {
      return ((SdtsdtListaLotacao)getSdt()).getgxTv_SdtsdtListaLotacao_Unid_id() ;
   }

   @JsonProperty("unid_id")
   public void setgxTv_SdtsdtListaLotacao_Unid_id(  Short Value )
   {
      ((SdtsdtListaLotacao)getSdt()).setgxTv_SdtsdtListaLotacao_Unid_id(Value);
   }


   @JsonProperty("unid_nome")
   public String getgxTv_SdtsdtListaLotacao_Unid_nome( )
   {
      return GXutil.rtrim(((SdtsdtListaLotacao)getSdt()).getgxTv_SdtsdtListaLotacao_Unid_nome()) ;
   }

   @JsonProperty("unid_nome")
   public void setgxTv_SdtsdtListaLotacao_Unid_nome(  String Value )
   {
      ((SdtsdtListaLotacao)getSdt()).setgxTv_SdtsdtListaLotacao_Unid_nome(Value);
   }


   @JsonProperty("unid_sigla")
   public String getgxTv_SdtsdtListaLotacao_Unid_sigla( )
   {
      return GXutil.rtrim(((SdtsdtListaLotacao)getSdt()).getgxTv_SdtsdtListaLotacao_Unid_sigla()) ;
   }

   @JsonProperty("unid_sigla")
   public void setgxTv_SdtsdtListaLotacao_Unid_sigla(  String Value )
   {
      ((SdtsdtListaLotacao)getSdt()).setgxTv_SdtsdtListaLotacao_Unid_sigla(Value);
   }


   @JsonProperty("lot_data_lotacao")
   public String getgxTv_SdtsdtListaLotacao_Lot_data_lotacao( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtsdtListaLotacao_Lot_data_lotacao()) ;
   }

   @JsonProperty("lot_data_lotacao")
   public void setgxTv_SdtsdtListaLotacao_Lot_data_lotacao(  String Value )
   {
      sdt.setgxTv_SdtsdtListaLotacao_Lot_data_lotacao( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("lot_data_remocao")
   public String getgxTv_SdtsdtListaLotacao_Lot_data_remocao( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtsdtListaLotacao_Lot_data_remocao()) ;
   }

   @JsonProperty("lot_data_remocao")
   public void setgxTv_SdtsdtListaLotacao_Lot_data_remocao(  String Value )
   {
      sdt.setgxTv_SdtsdtListaLotacao_Lot_data_remocao( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("lot_portaria")
   public String getgxTv_SdtsdtListaLotacao_Lot_portaria( )
   {
      return GXutil.rtrim(((SdtsdtListaLotacao)getSdt()).getgxTv_SdtsdtListaLotacao_Lot_portaria()) ;
   }

   @JsonProperty("lot_portaria")
   public void setgxTv_SdtsdtListaLotacao_Lot_portaria(  String Value )
   {
      ((SdtsdtListaLotacao)getSdt()).setgxTv_SdtsdtListaLotacao_Lot_portaria(Value);
   }


   int remoteHandle = -1;
}

