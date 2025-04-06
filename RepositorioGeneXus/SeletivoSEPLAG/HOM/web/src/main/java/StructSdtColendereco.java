import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "Colendereco", namespace ="SeletivoSEPLAG")
public final  class StructSdtColendereco implements Cloneable, java.io.Serializable
{
   public StructSdtColendereco( )
   {
      this( -1, new ModelContext( StructSdtColendereco.class ));
   }

   public StructSdtColendereco( int remoteHandle ,
                                ModelContext context )
   {
   }

   public  StructSdtColendereco( java.util.Vector<StructSdtendereco> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="endereco",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtendereco> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtendereco> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtendereco> item = new java.util.Vector<>();
}

