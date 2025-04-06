import com.genexus.*;

public final  class StructSdtsdtListaFotoPessoa implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaFotoPessoa( )
   {
      this( -1, new ModelContext( StructSdtsdtListaFotoPessoa.class ));
   }

   public StructSdtsdtListaFotoPessoa( int remoteHandle ,
                                       ModelContext context )
   {
      gxTv_SdtsdtListaFotoPessoa_Pes_nome = "" ;
      gxTv_SdtsdtListaFotoPessoa_Foto_N = (byte)(1) ;
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
      return gxTv_SdtsdtListaFotoPessoa_Pes_id ;
   }

   public void setPes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaFotoPessoa_Pes_id = value ;
   }

   public String getPes_nome( )
   {
      return gxTv_SdtsdtListaFotoPessoa_Pes_nome ;
   }

   public void setPes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaFotoPessoa_Pes_nome = value ;
   }

   public java.util.Vector<StructSdtsdtURLFoto> getFoto( )
   {
      return gxTv_SdtsdtListaFotoPessoa_Foto ;
   }

   public void setFoto( java.util.Vector<StructSdtsdtURLFoto> value )
   {
      gxTv_SdtsdtListaFotoPessoa_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaFotoPessoa_Foto = value ;
   }

   protected byte gxTv_SdtsdtListaFotoPessoa_Foto_N ;
   protected byte sdtIsNull ;
   protected short gxTv_SdtsdtListaFotoPessoa_Pes_id ;
   protected String gxTv_SdtsdtListaFotoPessoa_Pes_nome ;
   protected java.util.Vector<StructSdtsdtURLFoto> gxTv_SdtsdtListaFotoPessoa_Foto=null ;
}

