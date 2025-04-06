import com.genexus.*;

public final  class StructSdtsdtListaCidade implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaCidade( )
   {
      this( -1, new ModelContext( StructSdtsdtListaCidade.class ));
   }

   public StructSdtsdtListaCidade( int remoteHandle ,
                                   ModelContext context )
   {
      gxTv_SdtsdtListaCidade_Cid_nome = "" ;
      gxTv_SdtsdtListaCidade_Cid_uf = "" ;
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

   public short getCid_id( )
   {
      return gxTv_SdtsdtListaCidade_Cid_id ;
   }

   public void setCid_id( short value )
   {
      gxTv_SdtsdtListaCidade_N = (byte)(0) ;
      gxTv_SdtsdtListaCidade_Cid_id = value ;
   }

   public String getCid_nome( )
   {
      return gxTv_SdtsdtListaCidade_Cid_nome ;
   }

   public void setCid_nome( String value )
   {
      gxTv_SdtsdtListaCidade_N = (byte)(0) ;
      gxTv_SdtsdtListaCidade_Cid_nome = value ;
   }

   public String getCid_uf( )
   {
      return gxTv_SdtsdtListaCidade_Cid_uf ;
   }

   public void setCid_uf( String value )
   {
      gxTv_SdtsdtListaCidade_N = (byte)(0) ;
      gxTv_SdtsdtListaCidade_Cid_uf = value ;
   }

   protected byte gxTv_SdtsdtListaCidade_N ;
   protected short gxTv_SdtsdtListaCidade_Cid_id ;
   protected String gxTv_SdtsdtListaCidade_Cid_uf ;
   protected String gxTv_SdtsdtListaCidade_Cid_nome ;
}

