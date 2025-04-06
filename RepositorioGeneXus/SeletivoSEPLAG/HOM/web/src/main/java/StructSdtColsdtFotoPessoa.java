import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtFotoPessoa", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtFotoPessoa implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtFotoPessoa( )
   {
      this( -1, new ModelContext( StructSdtColsdtFotoPessoa.class ));
   }

   public StructSdtColsdtFotoPessoa( int remoteHandle ,
                                     ModelContext context )
   {
   }

   public  StructSdtColsdtFotoPessoa( java.util.Vector<StructSdtsdtFotoPessoa> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtFotoPessoa",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtFotoPessoa> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtFotoPessoa> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtFotoPessoa> item = new java.util.Vector<>();
}

