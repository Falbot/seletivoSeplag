import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaFotoPessoas.sdtListaFotoPessoasItem", namespace ="SeletivoSEPLAG")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_RESTInterface extends GxGenericCollectionItem<SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem>
{
   public SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_RESTInterface( )
   {
      super(new SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem ());
   }

   public SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_RESTInterface( SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("pes_id")
   public Short getgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id( )
   {
      return ((SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem)getSdt()).getgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id() ;
   }

   @JsonProperty("pes_id")
   public void setgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id(  Short Value )
   {
      ((SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem)getSdt()).setgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id(Value);
   }


   @JsonProperty("pes_nome")
   public String getgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome( )
   {
      return GXutil.rtrim(((SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem)getSdt()).getgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome()) ;
   }

   @JsonProperty("pes_nome")
   public void setgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome(  String Value )
   {
      ((SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem)getSdt()).setgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome(Value);
   }


   @JsonProperty("Foto")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtURLFoto_RESTInterface> getgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto( )
   {
      return SdtsdtURLFoto_RESTInterfacefromGXObjectCollection(((SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem)getSdt()).getgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto()) ;
   }

   @JsonProperty("Foto")
   public void setgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto(  Vector<SdtsdtURLFoto_RESTInterface> Value )
   {
      ((SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem)getSdt()).setgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto(SdtsdtURLFoto_RESTInterfacetoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<SdtsdtURLFoto> SdtsdtURLFoto_RESTInterfacetoGXObjectCollection( Vector<SdtsdtURLFoto_RESTInterface> collection )
   {
      GXBaseCollection<SdtsdtURLFoto> result = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
      for (int i = 0; i < collection.size(); i++)
      {
         result.add((SdtsdtURLFoto)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<SdtsdtURLFoto_RESTInterface> SdtsdtURLFoto_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtURLFoto> collection )
   {
      Vector<SdtsdtURLFoto_RESTInterface> result = new Vector<SdtsdtURLFoto_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new SdtsdtURLFoto_RESTInterface((SdtsdtURLFoto)collection.elementAt(i)));
      }
      return result ;
   }

}

