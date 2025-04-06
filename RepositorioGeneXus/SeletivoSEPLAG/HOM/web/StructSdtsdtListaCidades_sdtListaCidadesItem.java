import com.genexus.*;

public final  class StructSdtsdtListaCidades_sdtListaCidadesItem implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaCidades_sdtListaCidadesItem( )
   {
      this( -1, new ModelContext( StructSdtsdtListaCidades_sdtListaCidadesItem.class ));
   }

   public StructSdtsdtListaCidades_sdtListaCidadesItem( int remoteHandle ,
                                                        ModelContext context )
   {
      gxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_nome = "" ;
      gxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_uf = "" ;
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
      return gxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_id ;
   }

   public void setCid_id( short value )
   {
      gxTv_SdtsdtListaCidades_sdtListaCidadesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_id = value ;
   }

   public String getCid_nome( )
   {
      return gxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_nome ;
   }

   public void setCid_nome( String value )
   {
      gxTv_SdtsdtListaCidades_sdtListaCidadesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_nome = value ;
   }

   public String getCid_uf( )
   {
      return gxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_uf ;
   }

   public void setCid_uf( String value )
   {
      gxTv_SdtsdtListaCidades_sdtListaCidadesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_uf = value ;
   }

   protected byte gxTv_SdtsdtListaCidades_sdtListaCidadesItem_N ;
   protected short gxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_id ;
   protected String gxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_uf ;
   protected String gxTv_SdtsdtListaCidades_sdtListaCidadesItem_Cid_nome ;
}

