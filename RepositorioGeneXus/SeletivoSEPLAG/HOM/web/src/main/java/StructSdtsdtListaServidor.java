import com.genexus.*;

public final  class StructSdtsdtListaServidor implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaServidor( )
   {
      this( -1, new ModelContext( StructSdtsdtListaServidor.class ));
   }

   public StructSdtsdtListaServidor( int remoteHandle ,
                                     ModelContext context )
   {
      gxTv_SdtsdtListaServidor_Tiposervidor = "" ;
      gxTv_SdtsdtListaServidor_Dadospessoa_N = (byte)(1) ;
      gxTv_SdtsdtListaServidor_Dadosendereco_N = (byte)(1) ;
      gxTv_SdtsdtListaServidor_Dadoslotacao_N = (byte)(1) ;
      gxTv_SdtsdtListaServidor_Foto_N = (byte)(1) ;
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

   public String getTiposervidor( )
   {
      return gxTv_SdtsdtListaServidor_Tiposervidor ;
   }

   public void setTiposervidor( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidor_Tiposervidor = value ;
   }

   public StructSdtsdtPessoa getDadospessoa( )
   {
      return gxTv_SdtsdtListaServidor_Dadospessoa ;
   }

   public void setDadospessoa( StructSdtsdtPessoa value )
   {
      gxTv_SdtsdtListaServidor_Dadospessoa_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidor_Dadospessoa = value;
   }

   public java.util.Vector<StructSdtsdtEndereco> getDadosendereco( )
   {
      return gxTv_SdtsdtListaServidor_Dadosendereco ;
   }

   public void setDadosendereco( java.util.Vector<StructSdtsdtEndereco> value )
   {
      gxTv_SdtsdtListaServidor_Dadosendereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidor_Dadosendereco = value ;
   }

   public java.util.Vector<StructSdtsdtLotacaoV3> getDadoslotacao( )
   {
      return gxTv_SdtsdtListaServidor_Dadoslotacao ;
   }

   public void setDadoslotacao( java.util.Vector<StructSdtsdtLotacaoV3> value )
   {
      gxTv_SdtsdtListaServidor_Dadoslotacao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidor_Dadoslotacao = value ;
   }

   public java.util.Vector<StructSdtsdtURLFoto> getFoto( )
   {
      return gxTv_SdtsdtListaServidor_Foto ;
   }

   public void setFoto( java.util.Vector<StructSdtsdtURLFoto> value )
   {
      gxTv_SdtsdtListaServidor_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidor_Foto = value ;
   }

   protected byte gxTv_SdtsdtListaServidor_Dadospessoa_N ;
   protected byte gxTv_SdtsdtListaServidor_Dadosendereco_N ;
   protected byte gxTv_SdtsdtListaServidor_Dadoslotacao_N ;
   protected byte gxTv_SdtsdtListaServidor_Foto_N ;
   protected byte sdtIsNull ;
   protected String gxTv_SdtsdtListaServidor_Tiposervidor ;
   protected StructSdtsdtPessoa gxTv_SdtsdtListaServidor_Dadospessoa=null ;
   protected java.util.Vector<StructSdtsdtEndereco> gxTv_SdtsdtListaServidor_Dadosendereco=null ;
   protected java.util.Vector<StructSdtsdtLotacaoV3> gxTv_SdtsdtListaServidor_Dadoslotacao=null ;
   protected java.util.Vector<StructSdtsdtURLFoto> gxTv_SdtsdtListaServidor_Foto=null ;
}

