import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaUnidades", namespace ="SeletivoSEPLAG")
public final  class StructSdtsdtListaUnidades implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaUnidades( )
   {
      this( -1, new ModelContext( StructSdtsdtListaUnidades.class ));
   }

   public StructSdtsdtListaUnidades( int remoteHandle ,
                                     ModelContext context )
   {
   }

   public  StructSdtsdtListaUnidades( java.util.Vector<StructSdtsdtListaUnidades_sdtListaUnidadesItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtListaUnidadesItem",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtListaUnidades_sdtListaUnidadesItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtListaUnidades_sdtListaUnidadesItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtListaUnidades_sdtListaUnidadesItem> item = new java.util.Vector<>();
}

