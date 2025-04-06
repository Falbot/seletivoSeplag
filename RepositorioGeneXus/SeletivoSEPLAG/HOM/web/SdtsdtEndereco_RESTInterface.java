import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtEndereco", namespace ="SeletivoSEPLAG")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtEndereco_RESTInterface extends GxGenericCollectionItem<SdtsdtEndereco>
{
   public SdtsdtEndereco_RESTInterface( )
   {
      super(new SdtsdtEndereco ());
   }

   public SdtsdtEndereco_RESTInterface( SdtsdtEndereco psdt )
   {
      super(psdt);
   }

   @JsonProperty("end_tipo_logradouro")
   public String getgxTv_SdtsdtEndereco_End_tipo_logradouro( )
   {
      return GXutil.rtrim(((SdtsdtEndereco)getSdt()).getgxTv_SdtsdtEndereco_End_tipo_logradouro()) ;
   }

   @JsonProperty("end_tipo_logradouro")
   public void setgxTv_SdtsdtEndereco_End_tipo_logradouro(  String Value )
   {
      ((SdtsdtEndereco)getSdt()).setgxTv_SdtsdtEndereco_End_tipo_logradouro(Value);
   }


   @JsonProperty("end_logradouro")
   public String getgxTv_SdtsdtEndereco_End_logradouro( )
   {
      return GXutil.rtrim(((SdtsdtEndereco)getSdt()).getgxTv_SdtsdtEndereco_End_logradouro()) ;
   }

   @JsonProperty("end_logradouro")
   public void setgxTv_SdtsdtEndereco_End_logradouro(  String Value )
   {
      ((SdtsdtEndereco)getSdt()).setgxTv_SdtsdtEndereco_End_logradouro(Value);
   }


   @JsonProperty("end_numero")
   public String getgxTv_SdtsdtEndereco_End_numero( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtsdtEndereco_End_numero(), 10, 0)) ;
   }

   @JsonProperty("end_numero")
   public void setgxTv_SdtsdtEndereco_End_numero(  String Value )
   {
      sdt.setgxTv_SdtsdtEndereco_End_numero( GXutil.lval( Value) );
   }


   @JsonProperty("end_bairro")
   public String getgxTv_SdtsdtEndereco_End_bairro( )
   {
      return GXutil.rtrim(((SdtsdtEndereco)getSdt()).getgxTv_SdtsdtEndereco_End_bairro()) ;
   }

   @JsonProperty("end_bairro")
   public void setgxTv_SdtsdtEndereco_End_bairro(  String Value )
   {
      ((SdtsdtEndereco)getSdt()).setgxTv_SdtsdtEndereco_End_bairro(Value);
   }


   @JsonProperty("cid_id")
   public Short getgxTv_SdtsdtEndereco_Cid_id( )
   {
      return ((SdtsdtEndereco)getSdt()).getgxTv_SdtsdtEndereco_Cid_id() ;
   }

   @JsonProperty("cid_id")
   public void setgxTv_SdtsdtEndereco_Cid_id(  Short Value )
   {
      ((SdtsdtEndereco)getSdt()).setgxTv_SdtsdtEndereco_Cid_id(Value);
   }


   int remoteHandle = -1;
}

