import com.genexus.*;

public final  class StructSdtsdtLotacao implements Cloneable, java.io.Serializable
{
   public StructSdtsdtLotacao( )
   {
      this( -1, new ModelContext( StructSdtsdtLotacao.class ));
   }

   public StructSdtsdtLotacao( int remoteHandle ,
                               ModelContext context )
   {
      gxTv_SdtsdtLotacao_Lot_data_lotacao = "" ;
      gxTv_SdtsdtLotacao_Lot_data_remocao = "" ;
      gxTv_SdtsdtLotacao_Lot_portaria = "" ;
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

   public String getLot_data_lotacao( )
   {
      return gxTv_SdtsdtLotacao_Lot_data_lotacao ;
   }

   public void setLot_data_lotacao( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacao_Lot_data_lotacao = value ;
   }

   public String getLot_data_remocao( )
   {
      return gxTv_SdtsdtLotacao_Lot_data_remocao ;
   }

   public void setLot_data_remocao( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacao_Lot_data_remocao = value ;
   }

   public String getLot_portaria( )
   {
      return gxTv_SdtsdtLotacao_Lot_portaria ;
   }

   public void setLot_portaria( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacao_Lot_portaria = value ;
   }

   protected byte sdtIsNull ;
   protected String gxTv_SdtsdtLotacao_Lot_data_lotacao ;
   protected String gxTv_SdtsdtLotacao_Lot_data_remocao ;
   protected String gxTv_SdtsdtLotacao_Lot_portaria ;
}

