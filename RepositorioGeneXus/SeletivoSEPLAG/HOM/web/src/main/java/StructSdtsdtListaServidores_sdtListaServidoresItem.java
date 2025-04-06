import com.genexus.*;

public final  class StructSdtsdtListaServidores_sdtListaServidoresItem implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaServidores_sdtListaServidoresItem( )
   {
      this( -1, new ModelContext( StructSdtsdtListaServidores_sdtListaServidoresItem.class ));
   }

   public StructSdtsdtListaServidores_sdtListaServidoresItem( int remoteHandle ,
                                                              ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome = "" ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento = cal.getTime() ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo = "" ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome = "" ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla = "" ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao = cal.getTime() ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria = "" ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor = "" ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento_N = (byte)(1) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao_N = (byte)(1) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_N = (byte)(1) ;
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
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id ;
   }

   public void setPes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id = value ;
   }

   public String getPes_nome( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome ;
   }

   public void setPes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome = value ;
   }

   public java.util.Date getPes_data_nascimento( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento ;
   }

   public void setPes_data_nascimento( java.util.Date value )
   {
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento = value ;
   }

   public String getPes_sexo( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo ;
   }

   public void setPes_sexo( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo = value ;
   }

   public String getUnid_nome( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome = value ;
   }

   public String getUnid_sigla( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla ;
   }

   public void setUnid_sigla( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla = value ;
   }

   public java.util.Date getLot_data_lotacao( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao ;
   }

   public void setLot_data_lotacao( java.util.Date value )
   {
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao = value ;
   }

   public String getLot_portaria( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria ;
   }

   public void setLot_portaria( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria = value ;
   }

   public String getTiposervidor( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor ;
   }

   public void setTiposervidor( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor = value ;
   }

   public java.util.Vector<StructSdtsdtURLFoto> getFoto( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto ;
   }

   public void setFoto( java.util.Vector<StructSdtsdtURLFoto> value )
   {
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto = value ;
   }

   protected byte gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento_N ;
   protected byte gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao_N ;
   protected byte gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_N ;
   protected byte sdtIsNull ;
   protected short gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id ;
   protected String gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome ;
   protected String gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo ;
   protected String gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome ;
   protected String gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla ;
   protected String gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria ;
   protected String gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor ;
   protected java.util.Date gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento ;
   protected java.util.Date gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao ;
   protected java.util.Vector<StructSdtsdtURLFoto> gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto=null ;
}

