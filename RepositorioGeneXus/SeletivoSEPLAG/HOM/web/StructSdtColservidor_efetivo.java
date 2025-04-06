import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "Colservidor_efetivo", namespace ="SeletivoSEPLAG")
public final  class StructSdtColservidor_efetivo implements Cloneable, java.io.Serializable
{
   public StructSdtColservidor_efetivo( )
   {
      this( -1, new ModelContext( StructSdtColservidor_efetivo.class ));
   }

   public StructSdtColservidor_efetivo( int remoteHandle ,
                                        ModelContext context )
   {
   }

   public  StructSdtColservidor_efetivo( java.util.Vector<StructSdtservidor_efetivo> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="servidor_efetivo",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtservidor_efetivo> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtservidor_efetivo> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtservidor_efetivo> item = new java.util.Vector<>();
}

