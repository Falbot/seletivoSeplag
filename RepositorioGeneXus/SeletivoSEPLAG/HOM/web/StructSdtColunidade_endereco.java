import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "Colunidade_endereco", namespace ="SeletivoSEPLAG")
public final  class StructSdtColunidade_endereco implements Cloneable, java.io.Serializable
{
   public StructSdtColunidade_endereco( )
   {
      this( -1, new ModelContext( StructSdtColunidade_endereco.class ));
   }

   public StructSdtColunidade_endereco( int remoteHandle ,
                                        ModelContext context )
   {
   }

   public  StructSdtColunidade_endereco( java.util.Vector<StructSdtunidade_endereco> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="unidade_endereco",namespace="SeletivoSEPLAG")
   public java.util.Vector<StructSdtunidade_endereco> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtunidade_endereco> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtunidade_endereco> item = new java.util.Vector<>();
}

