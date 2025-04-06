import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "Pessoa", namespace ="SeletivoSEPLAG", propOrder={"pes_nome", "pes_data_nascimento", "pes_sexo", "pes_mae", "pes_pai"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtPessoa_RESTInterface extends GxGenericCollectionItem<SdtsdtPessoa>
{
   public SdtsdtPessoa_RESTInterface( )
   {
      super(new SdtsdtPessoa ());
   }

   public SdtsdtPessoa_RESTInterface( SdtsdtPessoa psdt )
   {
      super(psdt);
   }

   @JsonProperty("pes_nome")
   public String getgxTv_SdtsdtPessoa_Pes_nome( )
   {
      return GXutil.rtrim(((SdtsdtPessoa)getSdt()).getgxTv_SdtsdtPessoa_Pes_nome()) ;
   }

   @JsonProperty("pes_nome")
   public void setgxTv_SdtsdtPessoa_Pes_nome(  String Value )
   {
      ((SdtsdtPessoa)getSdt()).setgxTv_SdtsdtPessoa_Pes_nome(Value);
   }


   @JsonProperty("pes_data_nascimento")
   public String getgxTv_SdtsdtPessoa_Pes_data_nascimento( )
   {
      return GXutil.rtrim(((SdtsdtPessoa)getSdt()).getgxTv_SdtsdtPessoa_Pes_data_nascimento()) ;
   }

   @JsonProperty("pes_data_nascimento")
   public void setgxTv_SdtsdtPessoa_Pes_data_nascimento(  String Value )
   {
      ((SdtsdtPessoa)getSdt()).setgxTv_SdtsdtPessoa_Pes_data_nascimento(Value);
   }


   @JsonProperty("pes_sexo")
   public String getgxTv_SdtsdtPessoa_Pes_sexo( )
   {
      return GXutil.rtrim(((SdtsdtPessoa)getSdt()).getgxTv_SdtsdtPessoa_Pes_sexo()) ;
   }

   @JsonProperty("pes_sexo")
   public void setgxTv_SdtsdtPessoa_Pes_sexo(  String Value )
   {
      ((SdtsdtPessoa)getSdt()).setgxTv_SdtsdtPessoa_Pes_sexo(Value);
   }


   @JsonProperty("pes_mae")
   public String getgxTv_SdtsdtPessoa_Pes_mae( )
   {
      return GXutil.rtrim(((SdtsdtPessoa)getSdt()).getgxTv_SdtsdtPessoa_Pes_mae()) ;
   }

   @JsonProperty("pes_mae")
   public void setgxTv_SdtsdtPessoa_Pes_mae(  String Value )
   {
      ((SdtsdtPessoa)getSdt()).setgxTv_SdtsdtPessoa_Pes_mae(Value);
   }


   @JsonProperty("pes_pai")
   public String getgxTv_SdtsdtPessoa_Pes_pai( )
   {
      return GXutil.rtrim(((SdtsdtPessoa)getSdt()).getgxTv_SdtsdtPessoa_Pes_pai()) ;
   }

   @JsonProperty("pes_pai")
   public void setgxTv_SdtsdtPessoa_Pes_pai(  String Value )
   {
      ((SdtsdtPessoa)getSdt()).setgxTv_SdtsdtPessoa_Pes_pai(Value);
   }


   int remoteHandle = -1;
}

