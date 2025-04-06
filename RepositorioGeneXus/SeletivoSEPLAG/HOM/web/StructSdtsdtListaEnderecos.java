import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaEnderecos", namespace ="SeletivoSEPLAG")
public final  class StructSdtsdtListaEnderecos implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaEnderecos( )
   {
      this( -1, new ModelContext( StructSdtsdtListaEnderecos.class ));
   }

   public StructSdtsdtListaEnderecos( int remoteHandle ,
                                      ModelContext context )
   {
   }

   public  StructSdtsdtListaEnderecos( java.util.Vector<StructSdtsdtListaEnderecos_sdtListaEnderecosItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtListaEnderecosItem",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtListaEnderecos_sdtListaEnderecosItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtListaEnderecos_sdtListaEnderecosItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtListaEnderecos_sdtListaEnderecosItem> item = new java.util.Vector<>();
}

