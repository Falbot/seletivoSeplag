import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtPessoa", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtPessoa implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtPessoa( )
   {
      this( -1, new ModelContext( StructSdtColsdtPessoa.class ));
   }

   public StructSdtColsdtPessoa( int remoteHandle ,
                                 ModelContext context )
   {
   }

   public  StructSdtColsdtPessoa( java.util.Vector<StructSdtsdtPessoa> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Pessoa",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtPessoa> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtPessoa> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtPessoa> item = new java.util.Vector<>();
}

