import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaPessoas", namespace ="SeletivoSEPLAG")
public final  class StructSdtsdtListaPessoas implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaPessoas( )
   {
      this( -1, new ModelContext( StructSdtsdtListaPessoas.class ));
   }

   public StructSdtsdtListaPessoas( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtsdtListaPessoas( java.util.Vector<StructSdtsdtListaPessoas_sdtListaPessoasItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtListaPessoasItem",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtListaPessoas_sdtListaPessoasItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtListaPessoas_sdtListaPessoasItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtListaPessoas_sdtListaPessoasItem> item = new java.util.Vector<>();
}

