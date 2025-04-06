import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "crud_lotacao_read_getlist_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class crud_lotacao_read_getlist_RESTInterfaceOUT
{
   Vector<SdtsdtListaLotacoes_sdtListaLotacoesItem_RESTInterface> AV8ListaDadosLotacao ;
   @JsonProperty("ListaDadosLotacao")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<SdtsdtListaLotacoes_sdtListaLotacoesItem_RESTInterface> getListaDadosLotacao( )
   {
      return AV8ListaDadosLotacao ;
   }

   @JsonProperty("ListaDadosLotacao")
   public void setListaDadosLotacao(  Vector<SdtsdtListaLotacoes_sdtListaLotacoesItem_RESTInterface> Value )
   {
      AV8ListaDadosLotacao= Value;
   }


}

