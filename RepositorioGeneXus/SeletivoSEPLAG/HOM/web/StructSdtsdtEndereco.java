import com.genexus.*;

public final  class StructSdtsdtEndereco implements Cloneable, java.io.Serializable
{
   public StructSdtsdtEndereco( )
   {
      this( -1, new ModelContext( StructSdtsdtEndereco.class ));
   }

   public StructSdtsdtEndereco( int remoteHandle ,
                                ModelContext context )
   {
      gxTv_SdtsdtEndereco_End_tipo_logradouro = "" ;
      gxTv_SdtsdtEndereco_End_logradouro = "" ;
      gxTv_SdtsdtEndereco_End_bairro = "" ;
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

   public String getEnd_tipo_logradouro( )
   {
      return gxTv_SdtsdtEndereco_End_tipo_logradouro ;
   }

   public void setEnd_tipo_logradouro( String value )
   {
      gxTv_SdtsdtEndereco_N = (byte)(0) ;
      gxTv_SdtsdtEndereco_End_tipo_logradouro = value ;
   }

   public String getEnd_logradouro( )
   {
      return gxTv_SdtsdtEndereco_End_logradouro ;
   }

   public void setEnd_logradouro( String value )
   {
      gxTv_SdtsdtEndereco_N = (byte)(0) ;
      gxTv_SdtsdtEndereco_End_logradouro = value ;
   }

   public long getEnd_numero( )
   {
      return gxTv_SdtsdtEndereco_End_numero ;
   }

   public void setEnd_numero( long value )
   {
      gxTv_SdtsdtEndereco_N = (byte)(0) ;
      gxTv_SdtsdtEndereco_End_numero = value ;
   }

   public String getEnd_bairro( )
   {
      return gxTv_SdtsdtEndereco_End_bairro ;
   }

   public void setEnd_bairro( String value )
   {
      gxTv_SdtsdtEndereco_N = (byte)(0) ;
      gxTv_SdtsdtEndereco_End_bairro = value ;
   }

   public short getCid_id( )
   {
      return gxTv_SdtsdtEndereco_Cid_id ;
   }

   public void setCid_id( short value )
   {
      gxTv_SdtsdtEndereco_N = (byte)(0) ;
      gxTv_SdtsdtEndereco_Cid_id = value ;
   }

   protected byte gxTv_SdtsdtEndereco_N ;
   protected short gxTv_SdtsdtEndereco_Cid_id ;
   protected long gxTv_SdtsdtEndereco_End_numero ;
   protected String gxTv_SdtsdtEndereco_End_tipo_logradouro ;
   protected String gxTv_SdtsdtEndereco_End_logradouro ;
   protected String gxTv_SdtsdtEndereco_End_bairro ;
}

