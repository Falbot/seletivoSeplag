import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtAtualizarFotoPessoa", namespace ="SeletivoSEPLAG", propOrder={"pes_id", "foto"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtAtualizarFotoPessoa_RESTInterface extends GxGenericCollectionItem<SdtsdtAtualizarFotoPessoa>
{
   public SdtsdtAtualizarFotoPessoa_RESTInterface( )
   {
      super(new SdtsdtAtualizarFotoPessoa ());
   }

   public SdtsdtAtualizarFotoPessoa_RESTInterface( SdtsdtAtualizarFotoPessoa psdt )
   {
      super(psdt);
   }

   @JsonProperty("pes_id")
   public Short getgxTv_SdtsdtAtualizarFotoPessoa_Pes_id( )
   {
      return ((SdtsdtAtualizarFotoPessoa)getSdt()).getgxTv_SdtsdtAtualizarFotoPessoa_Pes_id() ;
   }

   @JsonProperty("pes_id")
   public void setgxTv_SdtsdtAtualizarFotoPessoa_Pes_id(  Short Value )
   {
      ((SdtsdtAtualizarFotoPessoa)getSdt()).setgxTv_SdtsdtAtualizarFotoPessoa_Pes_id(Value);
   }


   @JsonProperty("foto")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtAtualizarFotoPessoa_Item_RESTInterface> getgxTv_SdtsdtAtualizarFotoPessoa_Foto( )
   {
      return SdtsdtAtualizarFotoPessoa_Item_RESTInterfacefromGXObjectCollection(((SdtsdtAtualizarFotoPessoa)getSdt()).getgxTv_SdtsdtAtualizarFotoPessoa_Foto()) ;
   }

   @JsonProperty("foto")
   public void setgxTv_SdtsdtAtualizarFotoPessoa_Foto(  Vector<SdtsdtAtualizarFotoPessoa_Item_RESTInterface> Value )
   {
      ((SdtsdtAtualizarFotoPessoa)getSdt()).setgxTv_SdtsdtAtualizarFotoPessoa_Foto(SdtsdtAtualizarFotoPessoa_Item_RESTInterfacetoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<SdtsdtAtualizarFotoPessoa_Item> SdtsdtAtualizarFotoPessoa_Item_RESTInterfacetoGXObjectCollection( Vector<SdtsdtAtualizarFotoPessoa_Item_RESTInterface> collection )
   {
      GXBaseCollection<SdtsdtAtualizarFotoPessoa_Item> result = new GXBaseCollection<SdtsdtAtualizarFotoPessoa_Item>(SdtsdtAtualizarFotoPessoa_Item.class, "sdtAtualizarFotoPessoa.Item", "SeletivoSEPLAG.sdtAtualizarFotoPessoa", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((SdtsdtAtualizarFotoPessoa_Item)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<SdtsdtAtualizarFotoPessoa_Item_RESTInterface> SdtsdtAtualizarFotoPessoa_Item_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtAtualizarFotoPessoa_Item> collection )
   {
      Vector<SdtsdtAtualizarFotoPessoa_Item_RESTInterface> result = new Vector<SdtsdtAtualizarFotoPessoa_Item_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new SdtsdtAtualizarFotoPessoa_Item_RESTInterface((SdtsdtAtualizarFotoPessoa_Item)collection.elementAt(i)));
      }
      return result ;
   }

}

