import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtEndereco", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtEndereco implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtEndereco( )
   {
      this( -1, new ModelContext( StructSdtColsdtEndereco.class ));
   }

   public StructSdtColsdtEndereco( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtColsdtEndereco( java.util.Vector<StructSdtsdtEndereco> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtEndereco",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtEndereco> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtEndereco> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtEndereco> item = new java.util.Vector<>();
}

