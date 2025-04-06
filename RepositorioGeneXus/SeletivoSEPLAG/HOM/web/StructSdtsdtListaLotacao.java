import com.genexus.*;

public final  class StructSdtsdtListaLotacao implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaLotacao( )
   {
      this( -1, new ModelContext( StructSdtsdtListaLotacao.class ));
   }

   public StructSdtsdtListaLotacao( int remoteHandle ,
                                    ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtsdtListaLotacao_Pes_nome = "" ;
      gxTv_SdtsdtListaLotacao_Unid_nome = "" ;
      gxTv_SdtsdtListaLotacao_Unid_sigla = "" ;
      gxTv_SdtsdtListaLotacao_Lot_data_lotacao = cal.getTime() ;
      gxTv_SdtsdtListaLotacao_Lot_data_remocao = cal.getTime() ;
      gxTv_SdtsdtListaLotacao_Lot_portaria = "" ;
      gxTv_SdtsdtListaLotacao_Lot_data_lotacao_N = (byte)(1) ;
      gxTv_SdtsdtListaLotacao_Lot_data_remocao_N = (byte)(1) ;
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

   public short getLot_id( )
   {
      return gxTv_SdtsdtListaLotacao_Lot_id ;
   }

   public void setLot_id( short value )
   {
      gxTv_SdtsdtListaLotacao_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacao_Lot_id = value ;
   }

   public short getPes_id( )
   {
      return gxTv_SdtsdtListaLotacao_Pes_id ;
   }

   public void setPes_id( short value )
   {
      gxTv_SdtsdtListaLotacao_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacao_Pes_id = value ;
   }

   public String getPes_nome( )
   {
      return gxTv_SdtsdtListaLotacao_Pes_nome ;
   }

   public void setPes_nome( String value )
   {
      gxTv_SdtsdtListaLotacao_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacao_Pes_nome = value ;
   }

   public short getUnid_id( )
   {
      return gxTv_SdtsdtListaLotacao_Unid_id ;
   }

   public void setUnid_id( short value )
   {
      gxTv_SdtsdtListaLotacao_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacao_Unid_id = value ;
   }

   public String getUnid_nome( )
   {
      return gxTv_SdtsdtListaLotacao_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      gxTv_SdtsdtListaLotacao_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacao_Unid_nome = value ;
   }

   public String getUnid_sigla( )
   {
      return gxTv_SdtsdtListaLotacao_Unid_sigla ;
   }

   public void setUnid_sigla( String value )
   {
      gxTv_SdtsdtListaLotacao_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacao_Unid_sigla = value ;
   }

   public java.util.Date getLot_data_lotacao( )
   {
      return gxTv_SdtsdtListaLotacao_Lot_data_lotacao ;
   }

   public void setLot_data_lotacao( java.util.Date value )
   {
      gxTv_SdtsdtListaLotacao_Lot_data_lotacao_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacao_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacao_Lot_data_lotacao = value ;
   }

   public java.util.Date getLot_data_remocao( )
   {
      return gxTv_SdtsdtListaLotacao_Lot_data_remocao ;
   }

   public void setLot_data_remocao( java.util.Date value )
   {
      gxTv_SdtsdtListaLotacao_Lot_data_remocao_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacao_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacao_Lot_data_remocao = value ;
   }

   public String getLot_portaria( )
   {
      return gxTv_SdtsdtListaLotacao_Lot_portaria ;
   }

   public void setLot_portaria( String value )
   {
      gxTv_SdtsdtListaLotacao_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacao_Lot_portaria = value ;
   }

   protected byte gxTv_SdtsdtListaLotacao_Lot_data_lotacao_N ;
   protected byte gxTv_SdtsdtListaLotacao_Lot_data_remocao_N ;
   protected byte gxTv_SdtsdtListaLotacao_N ;
   protected short gxTv_SdtsdtListaLotacao_Lot_id ;
   protected short gxTv_SdtsdtListaLotacao_Pes_id ;
   protected short gxTv_SdtsdtListaLotacao_Unid_id ;
   protected String gxTv_SdtsdtListaLotacao_Pes_nome ;
   protected String gxTv_SdtsdtListaLotacao_Unid_nome ;
   protected String gxTv_SdtsdtListaLotacao_Unid_sigla ;
   protected String gxTv_SdtsdtListaLotacao_Lot_portaria ;
   protected java.util.Date gxTv_SdtsdtListaLotacao_Lot_data_lotacao ;
   protected java.util.Date gxTv_SdtsdtListaLotacao_Lot_data_remocao ;
}

