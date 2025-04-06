import com.genexus.*;

public final  class StructSdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem implements Cloneable, java.io.Serializable
{
   public StructSdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem( )
   {
      this( -1, new ModelContext( StructSdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem.class ));
   }

   public StructSdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem( int remoteHandle ,
                                                                  ModelContext context )
   {
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome = "" ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome = "" ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla = "" ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_N = (byte)(1) ;
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

   public String getPes_nome( )
   {
      return gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome ;
   }

   public void setPes_nome( String value )
   {
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_N = (byte)(0) ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome = value ;
   }

   public short getPes_idade( )
   {
      return gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade ;
   }

   public void setPes_idade( short value )
   {
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_N = (byte)(0) ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade = value ;
   }

   public String getUnid_nome( )
   {
      return gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_N = (byte)(0) ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome = value ;
   }

   public String getUnid_sigla( )
   {
      return gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla ;
   }

   public void setUnid_sigla( String value )
   {
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_N = (byte)(0) ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla = value ;
   }

   public java.util.Vector<StructSdtsdtURLFoto> getFoto( )
   {
      return gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto ;
   }

   public void setFoto( java.util.Vector<StructSdtsdtURLFoto> value )
   {
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_N = (byte)(0) ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_N = (byte)(0) ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto = value ;
   }

   protected byte gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_N ;
   protected byte gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_N ;
   protected short gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade ;
   protected String gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome ;
   protected String gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome ;
   protected String gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla ;
   protected java.util.Vector<StructSdtsdtURLFoto> gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto=null ;
}

