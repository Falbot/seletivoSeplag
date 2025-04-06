import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtListaFotoPessoa", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtListaFotoPessoa implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtListaFotoPessoa( )
   {
      this( -1, new ModelContext( StructSdtColsdtListaFotoPessoa.class ));
   }

   public StructSdtColsdtListaFotoPessoa( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtColsdtListaFotoPessoa( java.util.Vector<StructSdtsdtListaFotoPessoa> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtListaFotoPessoa",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtListaFotoPessoa> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtListaFotoPessoa> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtListaFotoPessoa> item = new java.util.Vector<>();
}

