import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtEnderecoLotacaoEfetivo", namespace ="SeletivoSEPLAG")
public final  class StructSdtsdtEnderecoLotacaoEfetivo implements Cloneable, java.io.Serializable
{
   public StructSdtsdtEnderecoLotacaoEfetivo( )
   {
      this( -1, new ModelContext( StructSdtsdtEnderecoLotacaoEfetivo.class ));
   }

   public StructSdtsdtEnderecoLotacaoEfetivo( int remoteHandle ,
                                              ModelContext context )
   {
   }

   public  StructSdtsdtEnderecoLotacaoEfetivo( java.util.Vector<StructSdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtEnderecoLotacaoEfetivoItem",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem> item = new java.util.Vector<>();
}

