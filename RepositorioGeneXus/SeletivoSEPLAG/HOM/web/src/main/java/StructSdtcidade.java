import com.genexus.*;

public final  class StructSdtcidade implements Cloneable, java.io.Serializable
{
   public StructSdtcidade( )
   {
      this( -1, new ModelContext( StructSdtcidade.class ));
   }

   public StructSdtcidade( int remoteHandle ,
                           ModelContext context )
   {
      gxTv_Sdtcidade_Cid_nome = "" ;
      gxTv_Sdtcidade_Cid_uf = "" ;
      gxTv_Sdtcidade_Mode = "" ;
      gxTv_Sdtcidade_Cid_nome_Z = "" ;
      gxTv_Sdtcidade_Cid_uf_Z = "" ;
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

   public short getCid_id( )
   {
      return gxTv_Sdtcidade_Cid_id ;
   }

   public void setCid_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtcidade_Cid_id = value ;
   }

   public String getCid_nome( )
   {
      return gxTv_Sdtcidade_Cid_nome ;
   }

   public void setCid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtcidade_Cid_nome = value ;
   }

   public String getCid_uf( )
   {
      return gxTv_Sdtcidade_Cid_uf ;
   }

   public void setCid_uf( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtcidade_Cid_uf = value ;
   }

   public String getMode( )
   {
      return gxTv_Sdtcidade_Mode ;
   }

   public void setMode( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtcidade_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_Sdtcidade_Initialized ;
   }

   public void setInitialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtcidade_Initialized = value ;
   }

   public short getCid_id_Z( )
   {
      return gxTv_Sdtcidade_Cid_id_Z ;
   }

   public void setCid_id_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtcidade_Cid_id_Z = value ;
   }

   public String getCid_nome_Z( )
   {
      return gxTv_Sdtcidade_Cid_nome_Z ;
   }

   public void setCid_nome_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtcidade_Cid_nome_Z = value ;
   }

   public String getCid_uf_Z( )
   {
      return gxTv_Sdtcidade_Cid_uf_Z ;
   }

   public void setCid_uf_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtcidade_Cid_uf_Z = value ;
   }

   private byte sdtIsNull ;
   protected short gxTv_Sdtcidade_Cid_id ;
   protected short gxTv_Sdtcidade_Initialized ;
   protected short gxTv_Sdtcidade_Cid_id_Z ;
   protected String gxTv_Sdtcidade_Cid_uf ;
   protected String gxTv_Sdtcidade_Mode ;
   protected String gxTv_Sdtcidade_Cid_uf_Z ;
   protected String gxTv_Sdtcidade_Cid_nome ;
   protected String gxTv_Sdtcidade_Cid_nome_Z ;
}

