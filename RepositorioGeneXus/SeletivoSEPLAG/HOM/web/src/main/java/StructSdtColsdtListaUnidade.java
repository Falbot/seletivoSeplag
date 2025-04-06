import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtListaUnidade", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtListaUnidade implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtListaUnidade( )
   {
      this( -1, new ModelContext( StructSdtColsdtListaUnidade.class ));
   }

   public StructSdtColsdtListaUnidade( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtColsdtListaUnidade( java.util.Vector<StructSdtsdtListaUnidade> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtListaUnidade",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtListaUnidade> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtListaUnidade> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtListaUnidade> item = new java.util.Vector<>();
}

