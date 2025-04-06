import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "Colpessoa_endereco", namespace ="SeletivoSEPLAG")
public final  class StructSdtColpessoa_endereco implements Cloneable, java.io.Serializable
{
   public StructSdtColpessoa_endereco( )
   {
      this( -1, new ModelContext( StructSdtColpessoa_endereco.class ));
   }

   public StructSdtColpessoa_endereco( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtColpessoa_endereco( java.util.Vector<StructSdtpessoa_endereco> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="pessoa_endereco",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtpessoa_endereco> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtpessoa_endereco> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtpessoa_endereco> item = new java.util.Vector<>();
}

