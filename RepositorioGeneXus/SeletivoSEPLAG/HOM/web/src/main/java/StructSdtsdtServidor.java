import com.genexus.*;

public final  class StructSdtsdtServidor implements Cloneable, java.io.Serializable
{
   public StructSdtsdtServidor( )
   {
      this( -1, new ModelContext( StructSdtsdtServidor.class ));
   }

   public StructSdtsdtServidor( int remoteHandle ,
                                ModelContext context )
   {
      gxTv_SdtsdtServidor_Dadospessoa_N = (byte)(1) ;
      gxTv_SdtsdtServidor_Dadosendereco_N = (byte)(1) ;
      gxTv_SdtsdtServidor_Dadoslotacao_N = (byte)(1) ;
      gxTv_SdtsdtServidor_Foto_N = (byte)(1) ;
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

   public short getUnid_id( )
   {
      return gxTv_SdtsdtServidor_Unid_id ;
   }

   public void setUnid_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtServidor_Unid_id = value ;
   }

   public StructSdtsdtPessoa getDadospessoa( )
   {
      return gxTv_SdtsdtServidor_Dadospessoa ;
   }

   public void setDadospessoa( StructSdtsdtPessoa value )
   {
      gxTv_SdtsdtServidor_Dadospessoa_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtServidor_Dadospessoa = value;
   }

   public StructSdtsdtEndereco getDadosendereco( )
   {
      return gxTv_SdtsdtServidor_Dadosendereco ;
   }

   public void setDadosendereco( StructSdtsdtEndereco value )
   {
      gxTv_SdtsdtServidor_Dadosendereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtServidor_Dadosendereco = value;
   }

   public StructSdtsdtLotacao getDadoslotacao( )
   {
      return gxTv_SdtsdtServidor_Dadoslotacao ;
   }

   public void setDadoslotacao( StructSdtsdtLotacao value )
   {
      gxTv_SdtsdtServidor_Dadoslotacao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtServidor_Dadoslotacao = value;
   }

   public java.util.Vector<StructSdtsdtFoto> getFoto( )
   {
      return gxTv_SdtsdtServidor_Foto ;
   }

   public void setFoto( java.util.Vector<StructSdtsdtFoto> value )
   {
      gxTv_SdtsdtServidor_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtServidor_Foto = value ;
   }

   protected byte gxTv_SdtsdtServidor_Dadospessoa_N ;
   protected byte gxTv_SdtsdtServidor_Dadosendereco_N ;
   protected byte gxTv_SdtsdtServidor_Dadoslotacao_N ;
   protected byte gxTv_SdtsdtServidor_Foto_N ;
   protected byte sdtIsNull ;
   protected short gxTv_SdtsdtServidor_Unid_id ;
   protected StructSdtsdtPessoa gxTv_SdtsdtServidor_Dadospessoa=null ;
   protected StructSdtsdtEndereco gxTv_SdtsdtServidor_Dadosendereco=null ;
   protected StructSdtsdtLotacao gxTv_SdtsdtServidor_Dadoslotacao=null ;
   protected java.util.Vector<StructSdtsdtFoto> gxTv_SdtsdtServidor_Foto=null ;
}

