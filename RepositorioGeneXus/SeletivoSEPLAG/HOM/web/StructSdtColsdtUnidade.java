import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtUnidade", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtUnidade implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtUnidade( )
   {
      this( -1, new ModelContext( StructSdtColsdtUnidade.class ));
   }

   public StructSdtColsdtUnidade( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColsdtUnidade( java.util.Vector<StructSdtsdtUnidade> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtUnidade",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtUnidade> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtUnidade> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtUnidade> item = new java.util.Vector<>();
}

