import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtFotoPessoa", namespace ="SeletivoSEPLAG", propOrder={"pes_id", "foto"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtFotoPessoa_RESTInterface extends GxGenericCollectionItem<SdtsdtFotoPessoa>
{
   public SdtsdtFotoPessoa_RESTInterface( )
   {
      super(new SdtsdtFotoPessoa ());
   }

   public SdtsdtFotoPessoa_RESTInterface( SdtsdtFotoPessoa psdt )
   {
      super(psdt);
   }

   @JsonProperty("pes_id")
   public Short getgxTv_SdtsdtFotoPessoa_Pes_id( )
   {
      return ((SdtsdtFotoPessoa)getSdt()).getgxTv_SdtsdtFotoPessoa_Pes_id() ;
   }

   @JsonProperty("pes_id")
   public void setgxTv_SdtsdtFotoPessoa_Pes_id(  Short Value )
   {
      ((SdtsdtFotoPessoa)getSdt()).setgxTv_SdtsdtFotoPessoa_Pes_id(Value);
   }


   @JsonProperty("foto")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtFoto_RESTInterface> getgxTv_SdtsdtFotoPessoa_Foto( )
   {
      return SdtsdtFoto_RESTInterfacefromGXObjectCollection(((SdtsdtFotoPessoa)getSdt()).getgxTv_SdtsdtFotoPessoa_Foto()) ;
   }

   @JsonProperty("foto")
   public void setgxTv_SdtsdtFotoPessoa_Foto(  Vector<SdtsdtFoto_RESTInterface> Value )
   {
      ((SdtsdtFotoPessoa)getSdt()).setgxTv_SdtsdtFotoPessoa_Foto(SdtsdtFoto_RESTInterfacetoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<SdtsdtFoto> SdtsdtFoto_RESTInterfacetoGXObjectCollection( Vector<SdtsdtFoto_RESTInterface> collection )
   {
      GXBaseCollection<SdtsdtFoto> result = new GXBaseCollection<SdtsdtFoto>(SdtsdtFoto.class, "sdtFoto", "SeletivoSEPLAG", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((SdtsdtFoto)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<SdtsdtFoto_RESTInterface> SdtsdtFoto_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtFoto> collection )
   {
      Vector<SdtsdtFoto_RESTInterface> result = new Vector<SdtsdtFoto_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new SdtsdtFoto_RESTInterface((SdtsdtFoto)collection.elementAt(i)));
      }
      return result ;
   }

}

