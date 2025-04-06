import com.genexus.*;

public final  class StructSdtsdtPessoaEndereco implements Cloneable, java.io.Serializable
{
   public StructSdtsdtPessoaEndereco( )
   {
      this( -1, new ModelContext( StructSdtsdtPessoaEndereco.class ));
   }

   public StructSdtsdtPessoaEndereco( int remoteHandle ,
                                      ModelContext context )
   {
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

   public short getPes_id( )
   {
      return gxTv_SdtsdtPessoaEndereco_Pes_id ;
   }

   public void setPes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtPessoaEndereco_Pes_id = value ;
   }

   public short getEnd_id( )
   {
      return gxTv_SdtsdtPessoaEndereco_End_id ;
   }

   public void setEnd_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtPessoaEndereco_End_id = value ;
   }

   protected byte sdtIsNull ;
   protected short gxTv_SdtsdtPessoaEndereco_Pes_id ;
   protected short gxTv_SdtsdtPessoaEndereco_End_id ;
}

