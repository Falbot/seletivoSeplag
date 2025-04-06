import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtCidade", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtCidade implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtCidade( )
   {
      this( -1, new ModelContext( StructSdtColsdtCidade.class ));
   }

   public StructSdtColsdtCidade( int remoteHandle ,
                                 ModelContext context )
   {
   }

   public  StructSdtColsdtCidade( java.util.Vector<StructSdtsdtCidade> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtCidade",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtCidade> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtCidade> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtCidade> item = new java.util.Vector<>();
}

