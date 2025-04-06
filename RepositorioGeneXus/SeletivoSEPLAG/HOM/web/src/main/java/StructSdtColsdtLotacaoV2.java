import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtLotacaoV2", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtLotacaoV2 implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtLotacaoV2( )
   {
      this( -1, new ModelContext( StructSdtColsdtLotacaoV2.class ));
   }

   public StructSdtColsdtLotacaoV2( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColsdtLotacaoV2( java.util.Vector<StructSdtsdtLotacaoV2> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtLotacaoV2",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtLotacaoV2> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtLotacaoV2> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtLotacaoV2> item = new java.util.Vector<>();
}

