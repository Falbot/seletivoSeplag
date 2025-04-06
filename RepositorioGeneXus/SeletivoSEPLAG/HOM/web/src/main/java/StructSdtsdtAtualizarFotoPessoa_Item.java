import com.genexus.*;

public final  class StructSdtsdtAtualizarFotoPessoa_Item implements Cloneable, java.io.Serializable
{
   public StructSdtsdtAtualizarFotoPessoa_Item( )
   {
      this( -1, new ModelContext( StructSdtsdtAtualizarFotoPessoa_Item.class ));
   }

   public StructSdtsdtAtualizarFotoPessoa_Item( int remoteHandle ,
                                                ModelContext context )
   {
      gxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto = "" ;
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

   public short getFp_id( )
   {
      return gxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id ;
   }

   public void setFp_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id = value ;
   }

   public String getArquivobase64novafoto( )
   {
      return gxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto ;
   }

   public void setArquivobase64novafoto( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto = value ;
   }

   protected byte sdtIsNull ;
   protected short gxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id ;
   protected String gxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto ;
}

