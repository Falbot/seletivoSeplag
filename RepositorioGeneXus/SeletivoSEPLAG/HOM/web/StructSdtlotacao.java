import com.genexus.*;

public final  class StructSdtlotacao implements Cloneable, java.io.Serializable
{
   public StructSdtlotacao( )
   {
      this( -1, new ModelContext( StructSdtlotacao.class ));
   }

   public StructSdtlotacao( int remoteHandle ,
                            ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_Sdtlotacao_Pes_nome = "" ;
      gxTv_Sdtlotacao_Unid_nome = "" ;
      gxTv_Sdtlotacao_Unid_sigla = "" ;
      gxTv_Sdtlotacao_Lot_data_lotacao = cal.getTime() ;
      gxTv_Sdtlotacao_Lot_data_remocao = cal.getTime() ;
      gxTv_Sdtlotacao_Lot_portaria = "" ;
      gxTv_Sdtlotacao_Mode = "" ;
      gxTv_Sdtlotacao_Pes_nome_Z = "" ;
      gxTv_Sdtlotacao_Unid_nome_Z = "" ;
      gxTv_Sdtlotacao_Unid_sigla_Z = "" ;
      gxTv_Sdtlotacao_Lot_data_lotacao_Z = cal.getTime() ;
      gxTv_Sdtlotacao_Lot_data_remocao_Z = cal.getTime() ;
      gxTv_Sdtlotacao_Lot_portaria_Z = "" ;
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
      return gxTv_Sdtlotacao_Lot_id ;
   }

   public void setLot_id( short value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_id = value ;
   }

   public short getPes_id( )
   {
      return gxTv_Sdtlotacao_Pes_id ;
   }

   public void setPes_id( short value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Pes_id = value ;
   }

   public String getPes_nome( )
   {
      return gxTv_Sdtlotacao_Pes_nome ;
   }

   public void setPes_nome( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Pes_nome = value ;
   }

   public short getUnid_id( )
   {
      return gxTv_Sdtlotacao_Unid_id ;
   }

   public void setUnid_id( short value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Unid_id = value ;
   }

   public String getUnid_nome( )
   {
      return gxTv_Sdtlotacao_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Unid_nome = value ;
   }

   public String getUnid_sigla( )
   {
      return gxTv_Sdtlotacao_Unid_sigla ;
   }

   public void setUnid_sigla( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Unid_sigla = value ;
   }

   public java.util.Date getLot_data_lotacao( )
   {
      return gxTv_Sdtlotacao_Lot_data_lotacao ;
   }

   public void setLot_data_lotacao( java.util.Date value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_data_lotacao = value ;
   }

   public java.util.Date getLot_data_remocao( )
   {
      return gxTv_Sdtlotacao_Lot_data_remocao ;
   }

   public void setLot_data_remocao( java.util.Date value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_data_remocao = value ;
   }

   public String getLot_portaria( )
   {
      return gxTv_Sdtlotacao_Lot_portaria ;
   }

   public void setLot_portaria( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_portaria = value ;
   }

   public String getMode( )
   {
      return gxTv_Sdtlotacao_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_Sdtlotacao_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Initialized = value ;
   }

   public short getLot_id_Z( )
   {
      return gxTv_Sdtlotacao_Lot_id_Z ;
   }

   public void setLot_id_Z( short value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_id_Z = value ;
   }

   public short getPes_id_Z( )
   {
      return gxTv_Sdtlotacao_Pes_id_Z ;
   }

   public void setPes_id_Z( short value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Pes_id_Z = value ;
   }

   public String getPes_nome_Z( )
   {
      return gxTv_Sdtlotacao_Pes_nome_Z ;
   }

   public void setPes_nome_Z( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Pes_nome_Z = value ;
   }

   public short getUnid_id_Z( )
   {
      return gxTv_Sdtlotacao_Unid_id_Z ;
   }

   public void setUnid_id_Z( short value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Unid_id_Z = value ;
   }

   public String getUnid_nome_Z( )
   {
      return gxTv_Sdtlotacao_Unid_nome_Z ;
   }

   public void setUnid_nome_Z( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Unid_nome_Z = value ;
   }

   public String getUnid_sigla_Z( )
   {
      return gxTv_Sdtlotacao_Unid_sigla_Z ;
   }

   public void setUnid_sigla_Z( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Unid_sigla_Z = value ;
   }

   public java.util.Date getLot_data_lotacao_Z( )
   {
      return gxTv_Sdtlotacao_Lot_data_lotacao_Z ;
   }

   public void setLot_data_lotacao_Z( java.util.Date value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_data_lotacao_Z = value ;
   }

   public java.util.Date getLot_data_remocao_Z( )
   {
      return gxTv_Sdtlotacao_Lot_data_remocao_Z ;
   }

   public void setLot_data_remocao_Z( java.util.Date value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_data_remocao_Z = value ;
   }

   public String getLot_portaria_Z( )
   {
      return gxTv_Sdtlotacao_Lot_portaria_Z ;
   }

   public void setLot_portaria_Z( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_portaria_Z = value ;
   }

   private byte gxTv_Sdtlotacao_N ;
   protected short gxTv_Sdtlotacao_Lot_id ;
   protected short gxTv_Sdtlotacao_Pes_id ;
   protected short gxTv_Sdtlotacao_Unid_id ;
   protected short gxTv_Sdtlotacao_Initialized ;
   protected short gxTv_Sdtlotacao_Lot_id_Z ;
   protected short gxTv_Sdtlotacao_Pes_id_Z ;
   protected short gxTv_Sdtlotacao_Unid_id_Z ;
   protected String gxTv_Sdtlotacao_Mode ;
   protected String gxTv_Sdtlotacao_Pes_nome ;
   protected String gxTv_Sdtlotacao_Unid_nome ;
   protected String gxTv_Sdtlotacao_Unid_sigla ;
   protected String gxTv_Sdtlotacao_Lot_portaria ;
   protected String gxTv_Sdtlotacao_Pes_nome_Z ;
   protected String gxTv_Sdtlotacao_Unid_nome_Z ;
   protected String gxTv_Sdtlotacao_Unid_sigla_Z ;
   protected String gxTv_Sdtlotacao_Lot_portaria_Z ;
   protected java.util.Date gxTv_Sdtlotacao_Lot_data_lotacao ;
   protected java.util.Date gxTv_Sdtlotacao_Lot_data_remocao ;
   protected java.util.Date gxTv_Sdtlotacao_Lot_data_lotacao_Z ;
   protected java.util.Date gxTv_Sdtlotacao_Lot_data_remocao_Z ;
}

