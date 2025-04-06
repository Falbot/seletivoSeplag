import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtURLFoto", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtURLFoto implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtURLFoto( )
   {
      this( -1, new ModelContext( StructSdtColsdtURLFoto.class ));
   }

   public StructSdtColsdtURLFoto( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColsdtURLFoto( java.util.Vector<StructSdtsdtURLFoto> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtURLFoto",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtURLFoto> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtURLFoto> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtURLFoto> item = new java.util.Vector<>();
}

