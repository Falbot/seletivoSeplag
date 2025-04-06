import com.genexus.*;

public final  class StructSdtsdtLotacaoV3 implements Cloneable, java.io.Serializable
{
   public StructSdtsdtLotacaoV3( )
   {
      this( -1, new ModelContext( StructSdtsdtLotacaoV3.class ));
   }

   public StructSdtsdtLotacaoV3( int remoteHandle ,
                                 ModelContext context )
   {
      gxTv_SdtsdtLotacaoV3_Unid_nome = "" ;
      gxTv_SdtsdtLotacaoV3_Unid_sigla = "" ;
      gxTv_SdtsdtLotacaoV3_Lot_data_lotacao = "" ;
      gxTv_SdtsdtLotacaoV3_Lot_data_remocao = "" ;
      gxTv_SdtsdtLotacaoV3_Lot_portaria = "" ;
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
      return gxTv_SdtsdtLotacaoV3_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacaoV3_Unid_nome = value ;
   }

   public String getUnid_sigla( )
   {
      return gxTv_SdtsdtLotacaoV3_Unid_sigla ;
   }

   public void setUnid_sigla( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacaoV3_Unid_sigla = value ;
   }

   public String getLot_data_lotacao( )
   {
      return gxTv_SdtsdtLotacaoV3_Lot_data_lotacao ;
   }

   public void setLot_data_lotacao( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacaoV3_Lot_data_lotacao = value ;
   }

   public String getLot_data_remocao( )
   {
      return gxTv_SdtsdtLotacaoV3_Lot_data_remocao ;
   }

   public void setLot_data_remocao( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacaoV3_Lot_data_remocao = value ;
   }

   public String getLot_portaria( )
   {
      return gxTv_SdtsdtLotacaoV3_Lot_portaria ;
   }

   public void setLot_portaria( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacaoV3_Lot_portaria = value ;
   }

   protected byte sdtIsNull ;
   protected String gxTv_SdtsdtLotacaoV3_Unid_nome ;
   protected String gxTv_SdtsdtLotacaoV3_Unid_sigla ;
   protected String gxTv_SdtsdtLotacaoV3_Lot_data_lotacao ;
   protected String gxTv_SdtsdtLotacaoV3_Lot_data_remocao ;
   protected String gxTv_SdtsdtLotacaoV3_Lot_portaria ;
}

