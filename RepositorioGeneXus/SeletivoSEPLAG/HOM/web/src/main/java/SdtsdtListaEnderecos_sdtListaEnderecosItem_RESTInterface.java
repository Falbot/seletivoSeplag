import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaEnderecos.sdtListaEnderecosItem", namespace ="SeletivoSEPLAG", propOrder={"end_id", "end_tipo_logradouro", "end_logradouro", "end_numero", "end_bairro", "cid_id", "cid_nome", "cid_uf"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtListaEnderecos_sdtListaEnderecosItem_RESTInterface extends GxGenericCollectionItem<SdtsdtListaEnderecos_sdtListaEnderecosItem>
{
   public SdtsdtListaEnderecos_sdtListaEnderecosItem_RESTInterface( )
   {
      super(new SdtsdtListaEnderecos_sdtListaEnderecosItem ());
   }

   public SdtsdtListaEnderecos_sdtListaEnderecosItem_RESTInterface( SdtsdtListaEnderecos_sdtListaEnderecosItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("end_id")
   public Short getgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_id( )
   {
      return ((SdtsdtListaEnderecos_sdtListaEnderecosItem)getSdt()).getgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_id() ;
   }

   @JsonProperty("end_id")
   public void setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_id(  Short Value )
   {
      ((SdtsdtListaEnderecos_sdtListaEnderecosItem)getSdt()).setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_id(Value);
   }


   @JsonProperty("end_tipo_logradouro")
   public String getgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_tipo_logradouro( )
   {
      return GXutil.rtrim(((SdtsdtListaEnderecos_sdtListaEnderecosItem)getSdt()).getgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_tipo_logradouro()) ;
   }

   @JsonProperty("end_tipo_logradouro")
   public void setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_tipo_logradouro(  String Value )
   {
      ((SdtsdtListaEnderecos_sdtListaEnderecosItem)getSdt()).setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_tipo_logradouro(Value);
   }


   @JsonProperty("end_logradouro")
   public String getgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_logradouro( )
   {
      return GXutil.rtrim(((SdtsdtListaEnderecos_sdtListaEnderecosItem)getSdt()).getgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_logradouro()) ;
   }

   @JsonProperty("end_logradouro")
   public void setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_logradouro(  String Value )
   {
      ((SdtsdtListaEnderecos_sdtListaEnderecosItem)getSdt()).setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_logradouro(Value);
   }


   @JsonProperty("end_numero")
   public String getgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_numero( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_numero(), 10, 0)) ;
   }

   @JsonProperty("end_numero")
   public void setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_numero(  String Value )
   {
      sdt.setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_numero( GXutil.lval( Value) );
   }


   @JsonProperty("end_bairro")
   public String getgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_bairro( )
   {
      return GXutil.rtrim(((SdtsdtListaEnderecos_sdtListaEnderecosItem)getSdt()).getgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_bairro()) ;
   }

   @JsonProperty("end_bairro")
   public void setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_bairro(  String Value )
   {
      ((SdtsdtListaEnderecos_sdtListaEnderecosItem)getSdt()).setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_bairro(Value);
   }


   @JsonProperty("cid_id")
   public Short getgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_id( )
   {
      return ((SdtsdtListaEnderecos_sdtListaEnderecosItem)getSdt()).getgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_id() ;
   }

   @JsonProperty("cid_id")
   public void setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_id(  Short Value )
   {
      ((SdtsdtListaEnderecos_sdtListaEnderecosItem)getSdt()).setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_id(Value);
   }


   @JsonProperty("cid_nome")
   public String getgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_nome( )
   {
      return GXutil.rtrim(((SdtsdtListaEnderecos_sdtListaEnderecosItem)getSdt()).getgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_nome()) ;
   }

   @JsonProperty("cid_nome")
   public void setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_nome(  String Value )
   {
      ((SdtsdtListaEnderecos_sdtListaEnderecosItem)getSdt()).setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_nome(Value);
   }


   @JsonProperty("cid_uf")
   public String getgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_uf( )
   {
      return GXutil.rtrim(((SdtsdtListaEnderecos_sdtListaEnderecosItem)getSdt()).getgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_uf()) ;
   }

   @JsonProperty("cid_uf")
   public void setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_uf(  String Value )
   {
      ((SdtsdtListaEnderecos_sdtListaEnderecosItem)getSdt()).setgxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_uf(Value);
   }


   int remoteHandle = -1;
}

