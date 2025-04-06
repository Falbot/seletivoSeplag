import com.genexus.*;

public final  class StructSdtsdtListaFotoPessoas_sdtListaFotoPessoasItem implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaFotoPessoas_sdtListaFotoPessoasItem( )
   {
      this( -1, new ModelContext( StructSdtsdtListaFotoPessoas_sdtListaFotoPessoasItem.class ));
   }

   public StructSdtsdtListaFotoPessoas_sdtListaFotoPessoasItem( int remoteHandle ,
                                                                ModelContext context )
   {
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome = "" ;
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_N = (byte)(1) ;
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
      return gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id ;
   }

   public void setPes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id = value ;
   }

   public String getPes_nome( )
   {
      return gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome ;
   }

   public void setPes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome = value ;
   }

   public java.util.Vector<StructSdtsdtURLFoto> getFoto( )
   {
      return gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto ;
   }

   public void setFoto( java.util.Vector<StructSdtsdtURLFoto> value )
   {
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto = value ;
   }

   protected byte gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_N ;
   protected byte sdtIsNull ;
   protected short gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id ;
   protected String gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome ;
   protected java.util.Vector<StructSdtsdtURLFoto> gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto=null ;
}

