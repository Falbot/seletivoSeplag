import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColsdtPessoaEndereco", namespace ="SeletivoSEPLAG")
public final  class StructSdtColsdtPessoaEndereco implements Cloneable, java.io.Serializable
{
   public StructSdtColsdtPessoaEndereco( )
   {
      this( -1, new ModelContext( StructSdtColsdtPessoaEndereco.class ));
   }

   public StructSdtColsdtPessoaEndereco( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtColsdtPessoaEndereco( java.util.Vector<StructSdtsdtPessoaEndereco> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="sdtPessoaEndereco",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtsdtPessoaEndereco> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtsdtPessoaEndereco> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtsdtPessoaEndereco> item = new java.util.Vector<>();
}

