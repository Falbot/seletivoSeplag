import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtListaLotacao", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtListaLotacao implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtListaLotacao( )
   {
      this( -1, new ModelContext( StructSdtColsdtListaLotacao.class ));
   }

   public StructSdtColsdtListaLotacao( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtColsdtListaLotacao( java.util.Vector<StructSdtsdtListaLotacao> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtListaLotacao",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtListaLotacao> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtListaLotacao> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtListaLotacao> item = new java.util.Vector<>();
}

