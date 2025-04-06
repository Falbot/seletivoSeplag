import com.genexus.*;

public final  class StructSdtsdtListaEndereco implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaEndereco( )
   {
      this( -1, new ModelContext( StructSdtsdtListaEndereco.class ));
   }

   public StructSdtsdtListaEndereco( int remoteHandle ,
                                     ModelContext context )
   {
      gxTv_SdtsdtListaEndereco_End_tipo_logradouro = "" ;
      gxTv_SdtsdtListaEndereco_End_logradouro = "" ;
      gxTv_SdtsdtListaEndereco_End_bairro = "" ;
      gxTv_SdtsdtListaEndereco_Cid_nome = "" ;
      gxTv_SdtsdtListaEndereco_Cid_uf = "" ;
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
      return gxTv_SdtsdtListaEndereco_End_id ;
   }

   public void setEnd_id( short value )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(0) ;
      gxTv_SdtsdtListaEndereco_End_id = value ;
   }

   public String getEnd_tipo_logradouro( )
   {
      return gxTv_SdtsdtListaEndereco_End_tipo_logradouro ;
   }

   public void setEnd_tipo_logradouro( String value )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(0) ;
      gxTv_SdtsdtListaEndereco_End_tipo_logradouro = value ;
   }

   public String getEnd_logradouro( )
   {
      return gxTv_SdtsdtListaEndereco_End_logradouro ;
   }

   public void setEnd_logradouro( String value )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(0) ;
      gxTv_SdtsdtListaEndereco_End_logradouro = value ;
   }

   public long getEnd_numero( )
   {
      return gxTv_SdtsdtListaEndereco_End_numero ;
   }

   public void setEnd_numero( long value )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(0) ;
      gxTv_SdtsdtListaEndereco_End_numero = value ;
   }

   public String getEnd_bairro( )
   {
      return gxTv_SdtsdtListaEndereco_End_bairro ;
   }

   public void setEnd_bairro( String value )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(0) ;
      gxTv_SdtsdtListaEndereco_End_bairro = value ;
   }

   public short getCid_id( )
   {
      return gxTv_SdtsdtListaEndereco_Cid_id ;
   }

   public void setCid_id( short value )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(0) ;
      gxTv_SdtsdtListaEndereco_Cid_id = value ;
   }

   public String getCid_nome( )
   {
      return gxTv_SdtsdtListaEndereco_Cid_nome ;
   }

   public void setCid_nome( String value )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(0) ;
      gxTv_SdtsdtListaEndereco_Cid_nome = value ;
   }

   public String getCid_uf( )
   {
      return gxTv_SdtsdtListaEndereco_Cid_uf ;
   }

   public void setCid_uf( String value )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(0) ;
      gxTv_SdtsdtListaEndereco_Cid_uf = value ;
   }

   protected byte gxTv_SdtsdtListaEndereco_N ;
   protected short gxTv_SdtsdtListaEndereco_End_id ;
   protected short gxTv_SdtsdtListaEndereco_Cid_id ;
   protected long gxTv_SdtsdtListaEndereco_End_numero ;
   protected String gxTv_SdtsdtListaEndereco_Cid_uf ;
   protected String gxTv_SdtsdtListaEndereco_End_tipo_logradouro ;
   protected String gxTv_SdtsdtListaEndereco_End_logradouro ;
   protected String gxTv_SdtsdtListaEndereco_End_bairro ;
   protected String gxTv_SdtsdtListaEndereco_Cid_nome ;
}

