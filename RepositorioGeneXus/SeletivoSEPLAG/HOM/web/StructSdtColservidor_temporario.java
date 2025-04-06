import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "Colservidor_temporario", namespace ="SeletivoSEPLAG")
public final  class StructSdtColservidor_temporario implements Cloneable, java.io.Serializable
{
   public StructSdtColservidor_temporario( )
   {
      this( -1, new ModelContext( StructSdtColservidor_temporario.class ));
   }

   public StructSdtColservidor_temporario( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtColservidor_temporario( java.util.Vector<StructSdtservidor_temporario> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="servidor_temporario",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtservidor_temporario> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtservidor_temporario> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtservidor_temporario> item = new java.util.Vector<>();
}

