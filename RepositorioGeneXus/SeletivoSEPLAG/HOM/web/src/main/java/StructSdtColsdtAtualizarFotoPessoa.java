import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtAtualizarFotoPessoa", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtAtualizarFotoPessoa implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtAtualizarFotoPessoa( )
   {
      this( -1, new ModelContext( StructSdtColsdtAtualizarFotoPessoa.class ));
   }

   public StructSdtColsdtAtualizarFotoPessoa( int remoteHandle ,
                                              ModelContext context )
   {
   }

   public  StructSdtColsdtAtualizarFotoPessoa( java.util.Vector<StructSdtsdtAtualizarFotoPessoa> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtAtualizarFotoPessoa",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtAtualizarFotoPessoa> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtAtualizarFotoPessoa> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtAtualizarFotoPessoa> item = new java.util.Vector<>();
}

