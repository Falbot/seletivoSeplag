import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtAtualizarFotoPessoa.Item", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtAtualizarFotoPessoa_Item implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtAtualizarFotoPessoa_Item( )
   {
      this( -1, new ModelContext( StructSdtColsdtAtualizarFotoPessoa_Item.class ));
   }

   public StructSdtColsdtAtualizarFotoPessoa_Item( int remoteHandle ,
                                                   ModelContext context )
   {
   }

   public  StructSdtColsdtAtualizarFotoPessoa_Item( java.util.Vector<StructSdtsdtAtualizarFotoPessoa_Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtAtualizarFotoPessoa.Item",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtAtualizarFotoPessoa_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtAtualizarFotoPessoa_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtAtualizarFotoPessoa_Item> item = new java.util.Vector<>();
}

