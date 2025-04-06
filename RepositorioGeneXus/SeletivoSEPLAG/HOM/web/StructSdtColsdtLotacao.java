import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtLotacao", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtLotacao implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtLotacao( )
   {
      this( -1, new ModelContext( StructSdtColsdtLotacao.class ));
   }

   public StructSdtColsdtLotacao( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColsdtLotacao( java.util.Vector<StructSdtsdtLotacao> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtLotacao",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtLotacao> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtLotacao> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtLotacao> item = new java.util.Vector<>();
}

