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
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtsdtLotacaoV2_Lot_data_lotacao = cal.getTime() ;
      gxTv_SdtsdtLotacaoV2_Lot_data_remocao = cal.getTime() ;
      gxTv_SdtsdtLotacaoV2_Lot_portaria = "" ;
      gxTv_SdtsdtLotacaoV2_Lot_data_lotacao_N = (byte)(1) ;
      gxTv_SdtsdtLotacaoV2_Lot_data_remocao_N = (byte)(1) ;
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
      gxTv_SdtsdtLotacaoV2_N = (byte)(0) ;
      gxTv_SdtsdtLotacaoV2_Pes_id = value ;
   }

   public short getUnid_id( )
   {
      return gxTv_SdtsdtLotacaoV2_Unid_id ;
   }

   public void setUnid_id( short value )
   {
      gxTv_SdtsdtLotacaoV2_N = (byte)(0) ;
      gxTv_SdtsdtLotacaoV2_Unid_id = value ;
   }

   public java.util.Date getLot_data_lotacao( )
   {
      return gxTv_SdtsdtLotacaoV2_Lot_data_lotacao ;
   }

   public void setLot_data_lotacao( java.util.Date value )
   {
      gxTv_SdtsdtLotacaoV2_Lot_data_lotacao_N = (byte)(0) ;
      gxTv_SdtsdtLotacaoV2_N = (byte)(0) ;
      gxTv_SdtsdtLotacaoV2_Lot_data_lotacao = value ;
   }

   public java.util.Date getLot_data_remocao( )
   {
      return gxTv_SdtsdtLotacaoV2_Lot_data_remocao ;
   }

   public void setLot_data_remocao( java.util.Date value )
   {
      gxTv_SdtsdtLotacaoV2_Lot_data_remocao_N = (byte)(0) ;
      gxTv_SdtsdtLotacaoV2_N = (byte)(0) ;
      gxTv_SdtsdtLotacaoV2_Lot_data_remocao = value ;
   }

   public String getLot_portaria( )
   {
      return gxTv_SdtsdtLotacaoV2_Lot_portaria ;
   }

   public void setLot_portaria( String value )
   {
      gxTv_SdtsdtLotacaoV2_N = (byte)(0) ;
      gxTv_SdtsdtLotacaoV2_Lot_portaria = value ;
   }

   protected byte gxTv_SdtsdtLotacaoV2_Lot_data_lotacao_N ;
   protected byte gxTv_SdtsdtLotacaoV2_Lot_data_remocao_N ;
   protected byte gxTv_SdtsdtLotacaoV2_N ;
   protected short gxTv_SdtsdtLotacaoV2_Pes_id ;
   protected short gxTv_SdtsdtLotacaoV2_Unid_id ;
   protected String gxTv_SdtsdtLotacaoV2_Lot_portaria ;
   protected java.util.Date gxTv_SdtsdtLotacaoV2_Lot_data_lotacao ;
   protected java.util.Date gxTv_SdtsdtLotacaoV2_Lot_data_remocao ;
}

