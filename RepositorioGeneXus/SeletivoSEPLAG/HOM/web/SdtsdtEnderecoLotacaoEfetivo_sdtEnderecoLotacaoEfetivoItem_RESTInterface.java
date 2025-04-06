import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtEnderecoLotacaoEfetivo.sdtEnderecoLotacaoEfetivoItem", namespace ="SeletivoSEPLAG")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_RESTInterface extends GxGenericCollectionItem<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem>
{
   public SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_RESTInterface( )
   {
      super(new SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem ());
   }

   public SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_RESTInterface( SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("end_tipo_logradouro")
   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_tipo_logradouro( )
   {
      return GXutil.rtrim(((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)getSdt()).getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_tipo_logradouro()) ;
   }

   @JsonProperty("end_tipo_logradouro")
   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_tipo_logradouro(  String Value )
   {
      ((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)getSdt()).setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_tipo_logradouro(Value);
   }


   @JsonProperty("end_logradouro")
   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_logradouro( )
   {
      return GXutil.rtrim(((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)getSdt()).getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_logradouro()) ;
   }

   @JsonProperty("end_logradouro")
   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_logradouro(  String Value )
   {
      ((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)getSdt()).setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_logradouro(Value);
   }


   @JsonProperty("end_numero")
   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_numero( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_numero(), 10, 0)) ;
   }

   @JsonProperty("end_numero")
   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_numero(  String Value )
   {
      sdt.setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_numero( GXutil.lval( Value) );
   }


   @JsonProperty("end_bairro")
   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_bairro( )
   {
      return GXutil.rtrim(((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)getSdt()).getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_bairro()) ;
   }

   @JsonProperty("end_bairro")
   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_bairro(  String Value )
   {
      ((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)getSdt()).setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_bairro(Value);
   }


   @JsonProperty("cid_nome")
   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_nome( )
   {
      return GXutil.rtrim(((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)getSdt()).getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_nome()) ;
   }

   @JsonProperty("cid_nome")
   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_nome(  String Value )
   {
      ((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)getSdt()).setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_nome(Value);
   }


   @JsonProperty("cid_uf")
   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_uf( )
   {
      return GXutil.rtrim(((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)getSdt()).getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_uf()) ;
   }

   @JsonProperty("cid_uf")
   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_uf(  String Value )
   {
      ((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)getSdt()).setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_uf(Value);
   }


   @JsonProperty("pes_nome")
   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Pes_nome( )
   {
      return GXutil.rtrim(((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)getSdt()).getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Pes_nome()) ;
   }

   @JsonProperty("pes_nome")
   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Pes_nome(  String Value )
   {
      ((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)getSdt()).setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Pes_nome(Value);
   }


   @JsonProperty("unid_nome")
   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_nome( )
   {
      return GXutil.rtrim(((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)getSdt()).getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_nome()) ;
   }

   @JsonProperty("unid_nome")
   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_nome(  String Value )
   {
      ((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)getSdt()).setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_nome(Value);
   }


   @JsonProperty("unid_sigla")
   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_sigla( )
   {
      return GXutil.rtrim(((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)getSdt()).getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_sigla()) ;
   }

   @JsonProperty("unid_sigla")
   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_sigla(  String Value )
   {
      ((SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)getSdt()).setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_sigla(Value);
   }


   int remoteHandle = -1;
}

