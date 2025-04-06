import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaServidores.sdtListaServidoresItem", namespace ="SeletivoSEPLAG", propOrder={"pes_id", "pes_nome", "pes_data_nascimento", "pes_sexo", "unid_nome", "unid_sigla", "lot_data_lotacao", "lot_portaria", "tiposervidor", "foto"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtsdtListaServidores_sdtListaServidoresItem_RESTInterface extends GxGenericCollectionItem<SdtsdtListaServidores_sdtListaServidoresItem>
{
   public SdtsdtListaServidores_sdtListaServidoresItem_RESTInterface( )
   {
      super(new SdtsdtListaServidores_sdtListaServidoresItem ());
   }

   public SdtsdtListaServidores_sdtListaServidoresItem_RESTInterface( SdtsdtListaServidores_sdtListaServidoresItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("pes_id")
   public Short getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id( )
   {
      return ((SdtsdtListaServidores_sdtListaServidoresItem)getSdt()).getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id() ;
   }

   @JsonProperty("pes_id")
   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id(  Short Value )
   {
      ((SdtsdtListaServidores_sdtListaServidoresItem)getSdt()).setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id(Value);
   }


   @JsonProperty("pes_nome")
   public String getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome( )
   {
      return GXutil.rtrim(((SdtsdtListaServidores_sdtListaServidoresItem)getSdt()).getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome()) ;
   }

   @JsonProperty("pes_nome")
   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome(  String Value )
   {
      ((SdtsdtListaServidores_sdtListaServidoresItem)getSdt()).setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome(Value);
   }


   @JsonProperty("pes_data_nascimento")
   public String getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento()) ;
   }

   @JsonProperty("pes_data_nascimento")
   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento(  String Value )
   {
      sdt.setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("pes_sexo")
   public String getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo( )
   {
      return GXutil.rtrim(((SdtsdtListaServidores_sdtListaServidoresItem)getSdt()).getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo()) ;
   }

   @JsonProperty("pes_sexo")
   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo(  String Value )
   {
      ((SdtsdtListaServidores_sdtListaServidoresItem)getSdt()).setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo(Value);
   }


   @JsonProperty("unid_nome")
   public String getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome( )
   {
      return GXutil.rtrim(((SdtsdtListaServidores_sdtListaServidoresItem)getSdt()).getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome()) ;
   }

   @JsonProperty("unid_nome")
   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome(  String Value )
   {
      ((SdtsdtListaServidores_sdtListaServidoresItem)getSdt()).setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome(Value);
   }


   @JsonProperty("unid_sigla")
   public String getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla( )
   {
      return GXutil.rtrim(((SdtsdtListaServidores_sdtListaServidoresItem)getSdt()).getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla()) ;
   }

   @JsonProperty("unid_sigla")
   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla(  String Value )
   {
      ((SdtsdtListaServidores_sdtListaServidoresItem)getSdt()).setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla(Value);
   }


   @JsonProperty("lot_data_lotacao")
   public String getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao()) ;
   }

   @JsonProperty("lot_data_lotacao")
   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao(  String Value )
   {
      sdt.setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("lot_portaria")
   public String getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria( )
   {
      return GXutil.rtrim(((SdtsdtListaServidores_sdtListaServidoresItem)getSdt()).getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria()) ;
   }

   @JsonProperty("lot_portaria")
   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria(  String Value )
   {
      ((SdtsdtListaServidores_sdtListaServidoresItem)getSdt()).setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria(Value);
   }


   @JsonProperty("TipoServidor")
   public String getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor( )
   {
      return GXutil.rtrim(((SdtsdtListaServidores_sdtListaServidoresItem)getSdt()).getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor()) ;
   }

   @JsonProperty("TipoServidor")
   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor(  String Value )
   {
      ((SdtsdtListaServidores_sdtListaServidoresItem)getSdt()).setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor(Value);
   }


   @JsonProperty("Foto")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtURLFoto_RESTInterface> getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto( )
   {
      return SdtsdtURLFoto_RESTInterfacefromGXObjectCollection(((SdtsdtListaServidores_sdtListaServidoresItem)getSdt()).getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto()) ;
   }

   @JsonProperty("Foto")
   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto(  Vector<SdtsdtURLFoto_RESTInterface> Value )
   {
      ((SdtsdtListaServidores_sdtListaServidoresItem)getSdt()).setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto(SdtsdtURLFoto_RESTInterfacetoGXObjectCollection(Value));
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

