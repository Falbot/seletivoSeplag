import com.genexus.*;

public final  class StructSdtsdtLotacaoV2 implements Cloneable, java.io.Serializable
{
   public StructSdtsdtLotacaoV2( )
   {
      this( -1, new ModelContext( StructSdtsdtLotacaoV2.class ));
   }

   public StructSdtsdtLotacaoV2( int remoteHandle ,
                                 ModelContext context )
   {
      gxTv_SdtsdtLotacaoV2_Lot_data_lotacao = "" ;
      gxTv_SdtsdtLotacaoV2_Lot_data_remocao = "" ;
      gxTv_SdtsdtLotacaoV2_Lot_portaria = "" ;
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

   public short getPes_id( )
   {
      return gxTv_SdtsdtLotacaoV2_Pes_id ;
   }

   public void setPes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacaoV2_Pes_id = value ;
   }

   public short getUnid_id( )
   {
      return gxTv_SdtsdtLotacaoV2_Unid_id ;
   }

   public void setUnid_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacaoV2_Unid_id = value ;
   }

   public String getLot_data_lotacao( )
   {
      return gxTv_SdtsdtLotacaoV2_Lot_data_lotacao ;
   }

   public void setLot_data_lotacao( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacaoV2_Lot_data_lotacao = value ;
   }

   public String getLot_data_remocao( )
   {
      return gxTv_SdtsdtLotacaoV2_Lot_data_remocao ;
   }

   public void setLot_data_remocao( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacaoV2_Lot_data_remocao = value ;
   }

   public String getLot_portaria( )
   {
      return gxTv_SdtsdtLotacaoV2_Lot_portaria ;
   }

   public void setLot_portaria( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacaoV2_Lot_portaria = value ;
   }

   protected byte sdtIsNull ;
   protected short gxTv_SdtsdtLotacaoV2_Pes_id ;
   protected short gxTv_SdtsdtLotacaoV2_Unid_id ;
   protected String gxTv_SdtsdtLotacaoV2_Lot_data_lotacao ;
   protected String gxTv_SdtsdtLotacaoV2_Lot_data_remocao ;
   protected String gxTv_SdtsdtLotacaoV2_Lot_portaria ;
}

