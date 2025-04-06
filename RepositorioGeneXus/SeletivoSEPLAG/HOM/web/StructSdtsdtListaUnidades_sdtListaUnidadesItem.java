import com.genexus.*;

public final  class StructSdtsdtListaUnidades_sdtListaUnidadesItem implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaUnidades_sdtListaUnidadesItem( )
   {
      this( -1, new ModelContext( StructSdtsdtListaUnidades_sdtListaUnidadesItem.class ));
   }

   public StructSdtsdtListaUnidades_sdtListaUnidadesItem( int remoteHandle ,
                                                          ModelContext context )
   {
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome = "" ;
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla = "" ;
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
      return gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id ;
   }

   public void setUnid_id( short value )
   {
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id = value ;
   }

   public String getUnid_nome( )
   {
      return gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome = value ;
   }

   public String getUnid_sigla( )
   {
      return gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla ;
   }

   public void setUnid_sigla( String value )
   {
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla = value ;
   }

   protected byte gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_N ;
   protected short gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id ;
   protected String gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome ;
   protected String gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla ;
}

