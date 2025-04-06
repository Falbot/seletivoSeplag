import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaPessoa", namespace ="SeletivoSEPLAG")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtListaPessoa_RESTInterface extends GxGenericCollectionItem<SdtsdtListaPessoa>
{
   public SdtsdtListaPessoa_RESTInterface( )
   {
      super(new SdtsdtListaPessoa ());
   }

   public SdtsdtListaPessoa_RESTInterface( SdtsdtListaPessoa psdt )
   {
      super(psdt);
   }

   @JsonProperty("pes_id")
   public Short getgxTv_SdtsdtListaPessoa_Pes_id( )
   {
      return ((SdtsdtListaPessoa)getSdt()).getgxTv_SdtsdtListaPessoa_Pes_id() ;
   }

   @JsonProperty("pes_id")
   public void setgxTv_SdtsdtListaPessoa_Pes_id(  Short Value )
   {
      ((SdtsdtListaPessoa)getSdt()).setgxTv_SdtsdtListaPessoa_Pes_id(Value);
   }


   @JsonProperty("pes_nome")
   public String getgxTv_SdtsdtListaPessoa_Pes_nome( )
   {
      return GXutil.rtrim(((SdtsdtListaPessoa)getSdt()).getgxTv_SdtsdtListaPessoa_Pes_nome()) ;
   }

   @JsonProperty("pes_nome")
   public void setgxTv_SdtsdtListaPessoa_Pes_nome(  String Value )
   {
      ((SdtsdtListaPessoa)getSdt()).setgxTv_SdtsdtListaPessoa_Pes_nome(Value);
   }


   @JsonProperty("pes_data_nascimento")
   public String getgxTv_SdtsdtListaPessoa_Pes_data_nascimento( )
   {
      return GXutil.rtrim(((SdtsdtListaPessoa)getSdt()).getgxTv_SdtsdtListaPessoa_Pes_data_nascimento()) ;
   }

   @JsonProperty("pes_data_nascimento")
   public void setgxTv_SdtsdtListaPessoa_Pes_data_nascimento(  String Value )
   {
      ((SdtsdtListaPessoa)getSdt()).setgxTv_SdtsdtListaPessoa_Pes_data_nascimento(Value);
   }


   @JsonProperty("pes_sexo")
   public String getgxTv_SdtsdtListaPessoa_Pes_sexo( )
   {
      return GXutil.rtrim(((SdtsdtListaPessoa)getSdt()).getgxTv_SdtsdtListaPessoa_Pes_sexo()) ;
   }

   @JsonProperty("pes_sexo")
   public void setgxTv_SdtsdtListaPessoa_Pes_sexo(  String Value )
   {
      ((SdtsdtListaPessoa)getSdt()).setgxTv_SdtsdtListaPessoa_Pes_sexo(Value);
   }


   @JsonProperty("pes_mae")
   public String getgxTv_SdtsdtListaPessoa_Pes_mae( )
   {
      return GXutil.rtrim(((SdtsdtListaPessoa)getSdt()).getgxTv_SdtsdtListaPessoa_Pes_mae()) ;
   }

   @JsonProperty("pes_mae")
   public void setgxTv_SdtsdtListaPessoa_Pes_mae(  String Value )
   {
      ((SdtsdtListaPessoa)getSdt()).setgxTv_SdtsdtListaPessoa_Pes_mae(Value);
   }


   @JsonProperty("pes_pai")
   public String getgxTv_SdtsdtListaPessoa_Pes_pai( )
   {
      return GXutil.rtrim(((SdtsdtListaPessoa)getSdt()).getgxTv_SdtsdtListaPessoa_Pes_pai()) ;
   }

   @JsonProperty("pes_pai")
   public void setgxTv_SdtsdtListaPessoa_Pes_pai(  String Value )
   {
      ((SdtsdtListaPessoa)getSdt()).setgxTv_SdtsdtListaPessoa_Pes_pai(Value);
   }


   int remoteHandle = -1;
}

