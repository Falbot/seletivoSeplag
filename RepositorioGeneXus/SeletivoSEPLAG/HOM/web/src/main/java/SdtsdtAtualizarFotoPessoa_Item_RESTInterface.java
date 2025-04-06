import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtAtualizarFotoPessoa.Item", namespace ="SeletivoSEPLAG", propOrder={"fp_id", "arquivobase64novafoto"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtAtualizarFotoPessoa_Item_RESTInterface extends GxGenericCollectionItem<SdtsdtAtualizarFotoPessoa_Item>
{
   public SdtsdtAtualizarFotoPessoa_Item_RESTInterface( )
   {
      super(new SdtsdtAtualizarFotoPessoa_Item ());
   }

   public SdtsdtAtualizarFotoPessoa_Item_RESTInterface( SdtsdtAtualizarFotoPessoa_Item psdt )
   {
      super(psdt);
   }

   @JsonProperty("fp_id")
   public Short getgxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id( )
   {
      return ((SdtsdtAtualizarFotoPessoa_Item)getSdt()).getgxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id() ;
   }

   @JsonProperty("fp_id")
   public void setgxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id(  Short Value )
   {
      ((SdtsdtAtualizarFotoPessoa_Item)getSdt()).setgxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id(Value);
   }


   @JsonProperty("arquivoBase64NovaFoto")
   public String getgxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto( )
   {
      return ((SdtsdtAtualizarFotoPessoa_Item)getSdt()).getgxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto() ;
   }

   @JsonProperty("arquivoBase64NovaFoto")
   public void setgxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto(  String Value )
   {
      ((SdtsdtAtualizarFotoPessoa_Item)getSdt()).setgxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto(Value);
   }


   int remoteHandle = -1;
}

