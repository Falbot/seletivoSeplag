import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "Colcidade", namespace ="SeletivoSEPLAG")
public final  class StructSdtColcidade implements Cloneable, java.io.Serializable
{
   public StructSdtColcidade( )
   {
      this( -1, new ModelContext( StructSdtColcidade.class ));
   }

   public StructSdtColcidade( int remoteHandle ,
                              ModelContext context )
   {
   }

   public  StructSdtColcidade( java.util.Vector<StructSdtcidade> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="cidade",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtcidade> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtcidade> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtcidade> item = new java.util.Vector<>();
}

