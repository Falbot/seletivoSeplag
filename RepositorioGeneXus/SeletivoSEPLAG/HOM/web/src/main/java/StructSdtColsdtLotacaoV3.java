import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtLotacaoV3", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtLotacaoV3 implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtLotacaoV3( )
   {
      this( -1, new ModelContext( StructSdtColsdtLotacaoV3.class ));
   }

   public StructSdtColsdtLotacaoV3( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColsdtLotacaoV3( java.util.Vector<StructSdtsdtLotacaoV3> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtLotacaoV3",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtLotacaoV3> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtLotacaoV3> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtLotacaoV3> item = new java.util.Vector<>();
}

