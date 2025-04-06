import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "Colunidade", namespace ="SeletivoSEPLAG")
public final  class StructSdtColunidade implements Cloneable, java.io.Serializable
{
   public StructSdtColunidade( )
   {
      this( -1, new ModelContext( StructSdtColunidade.class ));
   }

   public StructSdtColunidade( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColunidade( java.util.Vector<StructSdtunidade> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="unidade",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtunidade> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtunidade> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtunidade> item = new java.util.Vector<>();
}

