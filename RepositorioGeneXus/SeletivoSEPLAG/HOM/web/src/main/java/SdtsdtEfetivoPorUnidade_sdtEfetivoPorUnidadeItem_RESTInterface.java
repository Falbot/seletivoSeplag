import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtEfetivoPorUnidade.sdtEfetivoPorUnidadeItem", namespace ="SeletivoSEPLAG", propOrder={"pes_nome", "pes_idade", "unid_nome", "unid_sigla", "foto"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_RESTInterface extends GxGenericCollectionItem<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem>
{
   public SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_RESTInterface( )
   {
      super(new SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem ());
   }

   public SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_RESTInterface( SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("pes_nome")
   public String getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome( )
   {
      return GXutil.rtrim(((SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem)getSdt()).getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome()) ;
   }

   @JsonProperty("pes_nome")
   public void setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome(  String Value )
   {
      ((SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem)getSdt()).setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome(Value);
   }


   @JsonProperty("pes_idade")
   public Short getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade( )
   {
      return ((SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem)getSdt()).getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade() ;
   }

   @JsonProperty("pes_idade")
   public void setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade(  Short Value )
   {
      ((SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem)getSdt()).setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade(Value);
   }


   @JsonProperty("unid_nome")
   public String getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome( )
   {
      return GXutil.rtrim(((SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem)getSdt()).getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome()) ;
   }

   @JsonProperty("unid_nome")
   public void setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome(  String Value )
   {
      ((SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem)getSdt()).setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome(Value);
   }


   @JsonProperty("unid_sigla")
   public String getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla( )
   {
      return GXutil.rtrim(((SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem)getSdt()).getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla()) ;
   }

   @JsonProperty("unid_sigla")
   public void setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla(  String Value )
   {
      ((SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem)getSdt()).setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla(Value);
   }


   @JsonProperty("Foto")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtURLFoto_RESTInterface> getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto( )
   {
      return SdtsdtURLFoto_RESTInterfacefromGXObjectCollection(((SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem)getSdt()).getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto()) ;
   }

   @JsonProperty("Foto")
   public void setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto(  Vector<SdtsdtURLFoto_RESTInterface> Value )
   {
      ((SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem)getSdt()).setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto(SdtsdtURLFoto_RESTInterfacetoGXObjectCollection(Value));
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

