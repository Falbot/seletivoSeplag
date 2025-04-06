import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtFoto", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtFoto implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtFoto( )
   {
      this( -1, new ModelContext( StructSdtColsdtFoto.class ));
   }

   public StructSdtColsdtFoto( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColsdtFoto( java.util.Vector<StructSdtsdtFoto> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtFoto",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtFoto> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtFoto> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtFoto> item = new java.util.Vector<>();
}

