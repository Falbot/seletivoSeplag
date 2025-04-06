import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaPessoas.sdtListaPessoasItem", namespace ="SeletivoSEPLAG", propOrder={"pes_id", "pes_nome", "pes_data_nascimento", "pes_sexo", "pes_mae", "pes_pai"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtListaPessoas_sdtListaPessoasItem_RESTInterface extends GxGenericCollectionItem<SdtsdtListaPessoas_sdtListaPessoasItem>
{
   public SdtsdtListaPessoas_sdtListaPessoasItem_RESTInterface( )
   {
      super(new SdtsdtListaPessoas_sdtListaPessoasItem ());
   }

   public SdtsdtListaPessoas_sdtListaPessoasItem_RESTInterface( SdtsdtListaPessoas_sdtListaPessoasItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("pes_id")
   public Short getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id( )
   {
      return ((SdtsdtListaPessoas_sdtListaPessoasItem)getSdt()).getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id() ;
   }

   @JsonProperty("pes_id")
   public void setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id(  Short Value )
   {
      ((SdtsdtListaPessoas_sdtListaPessoasItem)getSdt()).setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id(Value);
   }


   @JsonProperty("pes_nome")
   public String getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome( )
   {
      return GXutil.rtrim(((SdtsdtListaPessoas_sdtListaPessoasItem)getSdt()).getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome()) ;
   }

   @JsonProperty("pes_nome")
   public void setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome(  String Value )
   {
      ((SdtsdtListaPessoas_sdtListaPessoasItem)getSdt()).setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome(Value);
   }


   @JsonProperty("pes_data_nascimento")
   public String getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento( )
   {
      return GXutil.rtrim(((SdtsdtListaPessoas_sdtListaPessoasItem)getSdt()).getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento()) ;
   }

   @JsonProperty("pes_data_nascimento")
   public void setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento(  String Value )
   {
      ((SdtsdtListaPessoas_sdtListaPessoasItem)getSdt()).setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento(Value);
   }


   @JsonProperty("pes_sexo")
   public String getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo( )
   {
      return GXutil.rtrim(((SdtsdtListaPessoas_sdtListaPessoasItem)getSdt()).getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo()) ;
   }

   @JsonProperty("pes_sexo")
   public void setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo(  String Value )
   {
      ((SdtsdtListaPessoas_sdtListaPessoasItem)getSdt()).setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo(Value);
   }


   @JsonProperty("pes_mae")
   public String getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae( )
   {
      return GXutil.rtrim(((SdtsdtListaPessoas_sdtListaPessoasItem)getSdt()).getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae()) ;
   }

   @JsonProperty("pes_mae")
   public void setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae(  String Value )
   {
      ((SdtsdtListaPessoas_sdtListaPessoasItem)getSdt()).setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae(Value);
   }


   @JsonProperty("pes_pai")
   public String getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai( )
   {
      return GXutil.rtrim(((SdtsdtListaPessoas_sdtListaPessoasItem)getSdt()).getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai()) ;
   }

   @JsonProperty("pes_pai")
   public void setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai(  String Value )
   {
      ((SdtsdtListaPessoas_sdtListaPessoasItem)getSdt()).setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai(Value);
   }


   int remoteHandle = -1;
}

