import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaFotoPessoas", namespace ="SeletivoSEPLAG")
public final  class StructSdtsdtListaFotoPessoas implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaFotoPessoas( )
   {
      this( -1, new ModelContext( StructSdtsdtListaFotoPessoas.class ));
   }

   public StructSdtsdtListaFotoPessoas( int remoteHandle ,
                                        ModelContext context )
   {
   }

   public  StructSdtsdtListaFotoPessoas( java.util.Vector<StructSdtsdtListaFotoPessoas_sdtListaFotoPessoasItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtListaFotoPessoasItem",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtListaFotoPessoas_sdtListaFotoPessoasItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtListaFotoPessoas_sdtListaFotoPessoasItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtListaFotoPessoas_sdtListaFotoPessoasItem> item = new java.util.Vector<>();
}

