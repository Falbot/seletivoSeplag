import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtListaServidor", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtListaServidor implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtListaServidor( )
   {
      this( -1, new ModelContext( StructSdtColsdtListaServidor.class ));
   }

   public StructSdtColsdtListaServidor( int remoteHandle ,
                                        ModelContext context )
   {
   }

   public  StructSdtColsdtListaServidor( java.util.Vector<StructSdtsdtListaServidor> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtListaServidor",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtListaServidor> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtListaServidor> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtListaServidor> item = new java.util.Vector<>();
}

