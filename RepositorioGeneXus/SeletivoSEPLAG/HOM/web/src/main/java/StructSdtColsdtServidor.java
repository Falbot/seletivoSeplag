import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtServidor", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtServidor implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtServidor( )
   {
      this( -1, new ModelContext( StructSdtColsdtServidor.class ));
   }

   public StructSdtColsdtServidor( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtColsdtServidor( java.util.Vector<StructSdtsdtServidor> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtServidor",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtServidor> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtServidor> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtServidor> item = new java.util.Vector<>();
}

