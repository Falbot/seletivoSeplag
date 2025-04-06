import com.genexus.*;

public final  class StructSdtservidor_temporario implements Cloneable, java.io.Serializable
{
   public StructSdtservidor_temporario( )
   {
      this( -1, new ModelContext( StructSdtservidor_temporario.class ));
   }

   public StructSdtservidor_temporario( int remoteHandle ,
                                        ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_Sdtservidor_temporario_St_data_admissao = cal.getTime() ;
      gxTv_Sdtservidor_temporario_St_data_demissao = cal.getTime() ;
      gxTv_Sdtservidor_temporario_Mode = "" ;
      gxTv_Sdtservidor_temporario_St_data_admissao_Z = cal.getTime() ;
      gxTv_Sdtservidor_temporario_St_data_demissao_Z = cal.getTime() ;
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
      return gxTv_Sdtservidor_temporario_Pes_id ;
   }

   public void setPes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_temporario_Pes_id = value ;
   }

   public java.util.Date getSt_data_admissao( )
   {
      return gxTv_Sdtservidor_temporario_St_data_admissao ;
   }

   public void setSt_data_admissao( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_temporario_St_data_admissao = value ;
   }

   public java.util.Date getSt_data_demissao( )
   {
      return gxTv_Sdtservidor_temporario_St_data_demissao ;
   }

   public void setSt_data_demissao( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_temporario_St_data_demissao = value ;
   }

   public String getMode( )
   {
      return gxTv_Sdtservidor_temporario_Mode ;
   }

   public void setMode( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_temporario_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_Sdtservidor_temporario_Initialized ;
   }

   public void setInitialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_temporario_Initialized = value ;
   }

   public short getPes_id_Z( )
   {
      return gxTv_Sdtservidor_temporario_Pes_id_Z ;
   }

   public void setPes_id_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_temporario_Pes_id_Z = value ;
   }

   public java.util.Date getSt_data_admissao_Z( )
   {
      return gxTv_Sdtservidor_temporario_St_data_admissao_Z ;
   }

   public void setSt_data_admissao_Z( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_temporario_St_data_admissao_Z = value ;
   }

   public java.util.Date getSt_data_demissao_Z( )
   {
      return gxTv_Sdtservidor_temporario_St_data_demissao_Z ;
   }

   public void setSt_data_demissao_Z( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_temporario_St_data_demissao_Z = value ;
   }

   private byte sdtIsNull ;
   protected short gxTv_Sdtservidor_temporario_Pes_id ;
   protected short gxTv_Sdtservidor_temporario_Initialized ;
   protected short gxTv_Sdtservidor_temporario_Pes_id_Z ;
   protected String gxTv_Sdtservidor_temporario_Mode ;
   protected java.util.Date gxTv_Sdtservidor_temporario_St_data_admissao ;
   protected java.util.Date gxTv_Sdtservidor_temporario_St_data_demissao ;
   protected java.util.Date gxTv_Sdtservidor_temporario_St_data_admissao_Z ;
   protected java.util.Date gxTv_Sdtservidor_temporario_St_data_demissao_Z ;
}

