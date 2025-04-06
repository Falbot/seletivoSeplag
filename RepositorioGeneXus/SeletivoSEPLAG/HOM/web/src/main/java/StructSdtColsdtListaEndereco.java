import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtListaEndereco", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtListaEndereco implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtListaEndereco( )
   {
      this( -1, new ModelContext( StructSdtColsdtListaEndereco.class ));
   }

   public StructSdtColsdtListaEndereco( int remoteHandle ,
                                        ModelContext context )
   {
   }

   public  StructSdtColsdtListaEndereco( java.util.Vector<StructSdtsdtListaEndereco> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtListaEndereco",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtListaEndereco> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtListaEndereco> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtListaEndereco> item = new java.util.Vector<>();
}

