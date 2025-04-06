import com.genexus.*;

public final  class StructSdtsdtListaEnderecos_sdtListaEnderecosItem implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaEnderecos_sdtListaEnderecosItem( )
   {
      this( -1, new ModelContext( StructSdtsdtListaEnderecos_sdtListaEnderecosItem.class ));
   }

   public StructSdtsdtListaEnderecos_sdtListaEnderecosItem( int remoteHandle ,
                                                            ModelContext context )
   {
      gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_tipo_logradouro = "" ;
      gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_logradouro = "" ;
      gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_bairro = "" ;
      gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_nome = "" ;
      gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_uf = "" ;
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

   public short getEnd_id( )
   {
      return gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_id ;
   }

   public void setEnd_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_id = value ;
   }

   public String getEnd_tipo_logradouro( )
   {
      return gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_tipo_logradouro ;
   }

   public void setEnd_tipo_logradouro( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_tipo_logradouro = value ;
   }

   public String getEnd_logradouro( )
   {
      return gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_logradouro ;
   }

   public void setEnd_logradouro( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_logradouro = value ;
   }

   public long getEnd_numero( )
   {
      return gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_numero ;
   }

   public void setEnd_numero( long value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_numero = value ;
   }

   public String getEnd_bairro( )
   {
      return gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_bairro ;
   }

   public void setEnd_bairro( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_bairro = value ;
   }

   public short getCid_id( )
   {
      return gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_id ;
   }

   public void setCid_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_id = value ;
   }

   public String getCid_nome( )
   {
      return gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_nome ;
   }

   public void setCid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_nome = value ;
   }

   public String getCid_uf( )
   {
      return gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_uf ;
   }

   public void setCid_uf( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_uf = value ;
   }

   protected byte sdtIsNull ;
   protected short gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_id ;
   protected short gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_id ;
   protected long gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_numero ;
   protected String gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_uf ;
   protected String gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_tipo_logradouro ;
   protected String gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_logradouro ;
   protected String gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_End_bairro ;
   protected String gxTv_SdtsdtListaEnderecos_sdtListaEnderecosItem_Cid_nome ;
}

