import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "Colpessoa", namespace ="SeletivoSEPLAG")
public final  class StructSdtColpessoa implements Cloneable, java.io.Serializable
{
   public StructSdtColpessoa( )
   {
      this( -1, new ModelContext( StructSdtColpessoa.class ));
   }

   public StructSdtColpessoa( int remoteHandle ,
                              ModelContext context )
   {
   }

   public  StructSdtColpessoa( java.util.Vector<StructSdtpessoa> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="pessoa",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtpessoa> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtpessoa> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtpessoa> item = new java.util.Vector<>();
}

