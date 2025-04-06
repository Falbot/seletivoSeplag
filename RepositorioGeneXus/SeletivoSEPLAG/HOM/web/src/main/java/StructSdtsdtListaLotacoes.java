import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaLotacoes", namespace ="SeletivoSEPLAG")
public final  class StructSdtsdtListaLotacoes implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaLotacoes( )
   {
      this( -1, new ModelContext( StructSdtsdtListaLotacoes.class ));
   }

   public StructSdtsdtListaLotacoes( int remoteHandle ,
                                     ModelContext context )
   {
   }

   public  StructSdtsdtListaLotacoes( java.util.Vector<StructSdtsdtListaLotacoes_sdtListaLotacoesItem> value )
   {
      item = value;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   @jakarta.xml.bind.annotation.XmlElement(name="sdtListaLotacoesItem",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtListaLotacoes_sdtListaLotacoesItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtListaLotacoes_sdtListaLotacoesItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtListaLotacoes_sdtListaLotacoesItem> item = new java.util.Vector<>();
}

