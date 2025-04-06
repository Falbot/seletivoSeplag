import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "sdtListaCidades", namespace ="SeletivoSEPLAG")
public final  class StructSdtsdtListaCidades implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaCidades( )
   {
      this( -1, new ModelContext( StructSdtsdtListaCidades.class ));
   }

   public StructSdtsdtListaCidades( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtsdtListaCidades( java.util.Vector<StructSdtsdtListaCidades_sdtListaCidadesItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtListaCidadesItem",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtListaCidades_sdtListaCidadesItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtListaCidades_sdtListaCidadesItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtListaCidades_sdtListaCidadesItem> item = new java.util.Vector<>();
}

