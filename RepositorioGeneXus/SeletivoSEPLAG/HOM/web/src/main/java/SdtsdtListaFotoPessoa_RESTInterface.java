import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaFotoPessoa", namespace ="SeletivoSEPLAG", propOrder={"pes_id", "pes_nome", "foto"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtListaFotoPessoa_RESTInterface extends GxGenericCollectionItem<SdtsdtListaFotoPessoa>
{
   public SdtsdtListaFotoPessoa_RESTInterface( )
   {
      super(new SdtsdtListaFotoPessoa ());
   }

   public SdtsdtListaFotoPessoa_RESTInterface( SdtsdtListaFotoPessoa psdt )
   {
      super(psdt);
   }

   @JsonProperty("pes_id")
   public Short getgxTv_SdtsdtListaFotoPessoa_Pes_id( )
   {
      return ((SdtsdtListaFotoPessoa)getSdt()).getgxTv_SdtsdtListaFotoPessoa_Pes_id() ;
   }

   @JsonProperty("pes_id")
   public void setgxTv_SdtsdtListaFotoPessoa_Pes_id(  Short Value )
   {
      ((SdtsdtListaFotoPessoa)getSdt()).setgxTv_SdtsdtListaFotoPessoa_Pes_id(Value);
   }


   @JsonProperty("pes_nome")
   public String getgxTv_SdtsdtListaFotoPessoa_Pes_nome( )
   {
      return GXutil.rtrim(((SdtsdtListaFotoPessoa)getSdt()).getgxTv_SdtsdtListaFotoPessoa_Pes_nome()) ;
   }

   @JsonProperty("pes_nome")
   public void setgxTv_SdtsdtListaFotoPessoa_Pes_nome(  String Value )
   {
      ((SdtsdtListaFotoPessoa)getSdt()).setgxTv_SdtsdtListaFotoPessoa_Pes_nome(Value);
   }


   @JsonProperty("Foto")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtURLFoto_RESTInterface> getgxTv_SdtsdtListaFotoPessoa_Foto( )
   {
      return SdtsdtURLFoto_RESTInterfacefromGXObjectCollection(((SdtsdtListaFotoPessoa)getSdt()).getgxTv_SdtsdtListaFotoPessoa_Foto()) ;
   }

   @JsonProperty("Foto")
   public void setgxTv_SdtsdtListaFotoPessoa_Foto(  Vector<SdtsdtURLFoto_RESTInterface> Value )
   {
      ((SdtsdtListaFotoPessoa)getSdt()).setgxTv_SdtsdtListaFotoPessoa_Foto(SdtsdtURLFoto_RESTInterfacetoGXObjectCollection(Value));
   }


   int remoteHandle = -1;
   private GXBaseCollection<SdtsdtURLFoto> SdtsdtURLFoto_RESTInterfacetoGXObjectCollection( Vector<SdtsdtURLFoto_RESTInterface> collection )
   {
      GXBaseCollection<SdtsdtURLFoto> result = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.add((SdtsdtURLFoto)collection.elementAt(i).getSdt());
      }
      return result ;
   }

   private Vector<SdtsdtURLFoto_RESTInterface> SdtsdtURLFoto_RESTInterfacefromGXObjectCollection( GXBaseCollection<SdtsdtURLFoto> collection )
   {
      Vector<SdtsdtURLFoto_RESTInterface> result = new Vector<SdtsdtURLFoto_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new SdtsdtURLFoto_RESTInterface((SdtsdtURLFoto)collection.elementAt(i)));
      }
      return result ;
   }

}

