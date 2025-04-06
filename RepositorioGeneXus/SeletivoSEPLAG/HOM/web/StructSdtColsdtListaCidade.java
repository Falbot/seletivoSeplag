import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtListaCidade", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtListaCidade implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtListaCidade( )
   {
      this( -1, new ModelContext( StructSdtColsdtListaCidade.class ));
   }

   public StructSdtColsdtListaCidade( int remoteHandle ,
                                      ModelContext context )
   {
   }

   public  StructSdtColsdtListaCidade( java.util.Vector<StructSdtsdtListaCidade> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtListaCidade",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtListaCidade> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtListaCidade> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtListaCidade> item = new java.util.Vector<>();
}

