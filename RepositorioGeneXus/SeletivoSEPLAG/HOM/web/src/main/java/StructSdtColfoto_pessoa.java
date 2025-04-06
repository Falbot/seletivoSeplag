import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "Colfoto_pessoa", namespace ="SeletivoSEPLAG")
public final  class StructSdtColfoto_pessoa implements Cloneable, java.io.Serializable
{
   public StructSdtColfoto_pessoa( )
   {
      this( -1, new ModelContext( StructSdtColfoto_pessoa.class ));
   }

   public StructSdtColfoto_pessoa( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtColfoto_pessoa( java.util.Vector<StructSdtfoto_pessoa> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="foto_pessoa",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtfoto_pessoa> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtfoto_pessoa> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtfoto_pessoa> item = new java.util.Vector<>();
}

