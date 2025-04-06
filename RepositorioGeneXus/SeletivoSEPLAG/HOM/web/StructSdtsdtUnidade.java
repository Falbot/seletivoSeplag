import com.genexus.*;

public final  class StructSdtsdtUnidade implements Cloneable, java.io.Serializable
{
   public StructSdtsdtUnidade( )
   {
      this( -1, new ModelContext( StructSdtsdtUnidade.class ));
   }

   public StructSdtsdtUnidade( int remoteHandle ,
                               ModelContext context )
   {
      gxTv_SdtsdtUnidade_Unid_nome = "" ;
      gxTv_SdtsdtUnidade_Unid_sigla = "" ;
      gxTv_SdtsdtUnidade_Dadosendereco_N = (byte)(1) ;
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

   public String getUnid_nome( )
   {
      return gxTv_SdtsdtUnidade_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      gxTv_SdtsdtUnidade_N = (byte)(0) ;
      gxTv_SdtsdtUnidade_Unid_nome = value ;
   }

   public String getUnid_sigla( )
   {
      return gxTv_SdtsdtUnidade_Unid_sigla ;
   }

   public void setUnid_sigla( String value )
   {
      gxTv_SdtsdtUnidade_N = (byte)(0) ;
      gxTv_SdtsdtUnidade_Unid_sigla = value ;
   }

   public StructSdtsdtEndereco getDadosendereco( )
   {
      return gxTv_SdtsdtUnidade_Dadosendereco ;
   }

   public void setDadosendereco( StructSdtsdtEndereco value )
   {
      gxTv_SdtsdtUnidade_Dadosendereco_N = (byte)(0) ;
      gxTv_SdtsdtUnidade_N = (byte)(0) ;
      gxTv_SdtsdtUnidade_Dadosendereco = value;
   }

   protected byte gxTv_SdtsdtUnidade_Dadosendereco_N ;
   protected byte gxTv_SdtsdtUnidade_N ;
   protected String gxTv_SdtsdtUnidade_Unid_nome ;
   protected String gxTv_SdtsdtUnidade_Unid_sigla ;
   protected StructSdtsdtEndereco gxTv_SdtsdtUnidade_Dadosendereco=null ;
}

