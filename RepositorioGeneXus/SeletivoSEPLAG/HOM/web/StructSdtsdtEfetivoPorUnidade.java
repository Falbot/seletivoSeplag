import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtEfetivoPorUnidade", namespace ="SeletivoSEPLAG")
public final  class StructSdtsdtEfetivoPorUnidade implements Cloneable, java.io.Serializable
{
   public StructSdtsdtEfetivoPorUnidade( )
   {
      this( -1, new ModelContext( StructSdtsdtEfetivoPorUnidade.class ));
   }

   public StructSdtsdtEfetivoPorUnidade( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtsdtEfetivoPorUnidade( java.util.Vector<StructSdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtEfetivoPorUnidadeItem",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem> item = new java.util.Vector<>();
}

