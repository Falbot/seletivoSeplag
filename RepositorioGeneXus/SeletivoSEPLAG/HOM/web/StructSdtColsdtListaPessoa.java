import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtListaPessoa", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtListaPessoa implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtListaPessoa( )
   {
      this( -1, new ModelContext( StructSdtColsdtListaPessoa.class ));
   }

   public StructSdtColsdtListaPessoa( int remoteHandle ,
                                      ModelContext context )
   {
   }

   public  StructSdtColsdtListaPessoa( java.util.Vector<StructSdtsdtListaPessoa> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtListaPessoa",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtListaPessoa> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtListaPessoa> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtListaPessoa> item = new java.util.Vector<>();
}

