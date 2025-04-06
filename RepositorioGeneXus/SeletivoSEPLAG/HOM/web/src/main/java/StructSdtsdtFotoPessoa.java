import com.genexus.*;

public final  class StructSdtsdtFotoPessoa implements Cloneable, java.io.Serializable
{
   public StructSdtsdtFotoPessoa( )
   {
      this( -1, new ModelContext( StructSdtsdtFotoPessoa.class ));
   }

   public StructSdtsdtFotoPessoa( int remoteHandle ,
                                  ModelContext context )
   {
      gxTv_SdtsdtFotoPessoa_Foto_N = (byte)(1) ;
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
      return gxTv_SdtsdtFotoPessoa_Pes_id ;
   }

   public void setPes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtFotoPessoa_Pes_id = value ;
   }

   public java.util.Vector<StructSdtsdtFoto> getFoto( )
   {
      return gxTv_SdtsdtFotoPessoa_Foto ;
   }

   public void setFoto( java.util.Vector<StructSdtsdtFoto> value )
   {
      gxTv_SdtsdtFotoPessoa_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtFotoPessoa_Foto = value ;
   }

   protected byte gxTv_SdtsdtFotoPessoa_Foto_N ;
   protected byte sdtIsNull ;
   protected short gxTv_SdtsdtFotoPessoa_Pes_id ;
   protected java.util.Vector<StructSdtsdtFoto> gxTv_SdtsdtFotoPessoa_Foto=null ;
}

