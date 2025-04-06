import com.genexus.*;

public final  class StructSdtsdtCidade implements Cloneable, java.io.Serializable
{
   public StructSdtsdtCidade( )
   {
      this( -1, new ModelContext( StructSdtsdtCidade.class ));
   }

   public StructSdtsdtCidade( int remoteHandle ,
                              ModelContext context )
   {
      gxTv_SdtsdtCidade_Cid_nome = "" ;
      gxTv_SdtsdtCidade_Cid_uf = "" ;
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

   public String getCid_nome( )
   {
      return gxTv_SdtsdtCidade_Cid_nome ;
   }

   public void setCid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtCidade_Cid_nome = value ;
   }

   public String getCid_uf( )
   {
      return gxTv_SdtsdtCidade_Cid_uf ;
   }

   public void setCid_uf( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtCidade_Cid_uf = value ;
   }

   protected byte sdtIsNull ;
   protected String gxTv_SdtsdtCidade_Cid_uf ;
   protected String gxTv_SdtsdtCidade_Cid_nome ;
}

