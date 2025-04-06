import com.genexus.*;

public final  class StructSdtsdtAtualizarFotoPessoa implements Cloneable, java.io.Serializable
{
   public StructSdtsdtAtualizarFotoPessoa( )
   {
      this( -1, new ModelContext( StructSdtsdtAtualizarFotoPessoa.class ));
   }

   public StructSdtsdtAtualizarFotoPessoa( int remoteHandle ,
                                           ModelContext context )
   {
      gxTv_SdtsdtAtualizarFotoPessoa_Foto_N = (byte)(1) ;
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
      return gxTv_SdtsdtAtualizarFotoPessoa_Pes_id ;
   }

   public void setPes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtAtualizarFotoPessoa_Pes_id = value ;
   }

   public java.util.Vector<StructSdtsdtAtualizarFotoPessoa_Item> getFoto( )
   {
      return gxTv_SdtsdtAtualizarFotoPessoa_Foto ;
   }

   public void setFoto( java.util.Vector<StructSdtsdtAtualizarFotoPessoa_Item> value )
   {
      gxTv_SdtsdtAtualizarFotoPessoa_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtAtualizarFotoPessoa_Foto = value ;
   }

   protected byte gxTv_SdtsdtAtualizarFotoPessoa_Foto_N ;
   protected byte sdtIsNull ;
   protected short gxTv_SdtsdtAtualizarFotoPessoa_Pes_id ;
   protected java.util.Vector<StructSdtsdtAtualizarFotoPessoa_Item> gxTv_SdtsdtAtualizarFotoPessoa_Foto=null ;
}

