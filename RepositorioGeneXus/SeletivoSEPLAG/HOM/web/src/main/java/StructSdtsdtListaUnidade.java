import com.genexus.*;

public final  class StructSdtsdtListaUnidade implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaUnidade( )
   {
      this( -1, new ModelContext( StructSdtsdtListaUnidade.class ));
   }

   public StructSdtsdtListaUnidade( int remoteHandle ,
                                    ModelContext context )
   {
      gxTv_SdtsdtListaUnidade_Unid_nome = "" ;
      gxTv_SdtsdtListaUnidade_Unid_sigla = "" ;
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
      return gxTv_SdtsdtListaUnidade_Unid_id ;
   }

   public void setUnid_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaUnidade_Unid_id = value ;
   }

   public String getUnid_nome( )
   {
      return gxTv_SdtsdtListaUnidade_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaUnidade_Unid_nome = value ;
   }

   public String getUnid_sigla( )
   {
      return gxTv_SdtsdtListaUnidade_Unid_sigla ;
   }

   public void setUnid_sigla( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaUnidade_Unid_sigla = value ;
   }

   protected byte sdtIsNull ;
   protected short gxTv_SdtsdtListaUnidade_Unid_id ;
   protected String gxTv_SdtsdtListaUnidade_Unid_nome ;
   protected String gxTv_SdtsdtListaUnidade_Unid_sigla ;
}

