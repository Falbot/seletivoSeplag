import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaEndereco", namespace ="SeletivoSEPLAG", propOrder={"end_id", "end_tipo_logradouro", "end_logradouro", "end_numero", "end_bairro", "cid_id", "cid_nome", "cid_uf"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtListaEndereco_RESTInterface extends GxGenericCollectionItem<SdtsdtListaEndereco>
{
   public SdtsdtListaEndereco_RESTInterface( )
   {
      super(new SdtsdtListaEndereco ());
   }

   public SdtsdtListaEndereco_RESTInterface( SdtsdtListaEndereco psdt )
   {
      super(psdt);
   }

   @JsonProperty("end_id")
   public Short getgxTv_SdtsdtListaEndereco_End_id( )
   {
      return ((SdtsdtListaEndereco)getSdt()).getgxTv_SdtsdtListaEndereco_End_id() ;
   }

   @JsonProperty("end_id")
   public void setgxTv_SdtsdtListaEndereco_End_id(  Short Value )
   {
      ((SdtsdtListaEndereco)getSdt()).setgxTv_SdtsdtListaEndereco_End_id(Value);
   }


   @JsonProperty("end_tipo_logradouro")
   public String getgxTv_SdtsdtListaEndereco_End_tipo_logradouro( )
   {
      return GXutil.rtrim(((SdtsdtListaEndereco)getSdt()).getgxTv_SdtsdtListaEndereco_End_tipo_logradouro()) ;
   }

   @JsonProperty("end_tipo_logradouro")
   public void setgxTv_SdtsdtListaEndereco_End_tipo_logradouro(  String Value )
   {
      ((SdtsdtListaEndereco)getSdt()).setgxTv_SdtsdtListaEndereco_End_tipo_logradouro(Value);
   }


   @JsonProperty("end_logradouro")
   public String getgxTv_SdtsdtListaEndereco_End_logradouro( )
   {
      return GXutil.rtrim(((SdtsdtListaEndereco)getSdt()).getgxTv_SdtsdtListaEndereco_End_logradouro()) ;
   }

   @JsonProperty("end_logradouro")
   public void setgxTv_SdtsdtListaEndereco_End_logradouro(  String Value )
   {
      ((SdtsdtListaEndereco)getSdt()).setgxTv_SdtsdtListaEndereco_End_logradouro(Value);
   }


   @JsonProperty("end_numero")
   public String getgxTv_SdtsdtListaEndereco_End_numero( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtsdtListaEndereco_End_numero(), 10, 0)) ;
   }

   @JsonProperty("end_numero")
   public void setgxTv_SdtsdtListaEndereco_End_numero(  String Value )
   {
      sdt.setgxTv_SdtsdtListaEndereco_End_numero( GXutil.lval( Value) );
   }


   @JsonProperty("end_bairro")
   public String getgxTv_SdtsdtListaEndereco_End_bairro( )
   {
      return GXutil.rtrim(((SdtsdtListaEndereco)getSdt()).getgxTv_SdtsdtListaEndereco_End_bairro()) ;
   }

   @JsonProperty("end_bairro")
   public void setgxTv_SdtsdtListaEndereco_End_bairro(  String Value )
   {
      ((SdtsdtListaEndereco)getSdt()).setgxTv_SdtsdtListaEndereco_End_bairro(Value);
   }


   @JsonProperty("cid_id")
   public Short getgxTv_SdtsdtListaEndereco_Cid_id( )
   {
      return ((SdtsdtListaEndereco)getSdt()).getgxTv_SdtsdtListaEndereco_Cid_id() ;
   }

   @JsonProperty("cid_id")
   public void setgxTv_SdtsdtListaEndereco_Cid_id(  Short Value )
   {
      ((SdtsdtListaEndereco)getSdt()).setgxTv_SdtsdtListaEndereco_Cid_id(Value);
   }


   @JsonProperty("cid_nome")
   public String getgxTv_SdtsdtListaEndereco_Cid_nome( )
   {
      return GXutil.rtrim(((SdtsdtListaEndereco)getSdt()).getgxTv_SdtsdtListaEndereco_Cid_nome()) ;
   }

   @JsonProperty("cid_nome")
   public void setgxTv_SdtsdtListaEndereco_Cid_nome(  String Value )
   {
      ((SdtsdtListaEndereco)getSdt()).setgxTv_SdtsdtListaEndereco_Cid_nome(Value);
   }


   @JsonProperty("cid_uf")
   public String getgxTv_SdtsdtListaEndereco_Cid_uf( )
   {
      return GXutil.rtrim(((SdtsdtListaEndereco)getSdt()).getgxTv_SdtsdtListaEndereco_Cid_uf()) ;
   }

   @JsonProperty("cid_uf")
   public void setgxTv_SdtsdtListaEndereco_Cid_uf(  String Value )
   {
      ((SdtsdtListaEndereco)getSdt()).setgxTv_SdtsdtListaEndereco_Cid_uf(Value);
   }


   int remoteHandle = -1;
}

