import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaServidores", namespace ="SeletivoSEPLAG")
public final  class StructSdtsdtListaServidores implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaServidores( )
   {
      this( -1, new ModelContext( StructSdtsdtListaServidores.class ));
   }

   public StructSdtsdtListaServidores( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtsdtListaServidores( java.util.Vector<StructSdtsdtListaServidores_sdtListaServidoresItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtListaServidoresItem",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtListaServidores_sdtListaServidoresItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtListaServidores_sdtListaServidoresItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtListaServidores_sdtListaServidoresItem> item = new java.util.Vector<>();
}

