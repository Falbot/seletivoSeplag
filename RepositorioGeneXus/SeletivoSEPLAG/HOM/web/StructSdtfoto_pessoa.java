import com.genexus.*;

public final  class StructSdtfoto_pessoa implements Cloneable, java.io.Serializable
{
   public StructSdtfoto_pessoa( )
   {
      this( -1, new ModelContext( StructSdtfoto_pessoa.class ));
   }

   public StructSdtfoto_pessoa( int remoteHandle ,
                                ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_Sdtfoto_pessoa_Pes_nome = "" ;
      gxTv_Sdtfoto_pessoa_Pes_data_nascimento = cal.getTime() ;
      gxTv_Sdtfoto_pessoa_Fp_data = cal.getTime() ;
      gxTv_Sdtfoto_pessoa_Fp_bucket = "" ;
      gxTv_Sdtfoto_pessoa_Fp_hash = "" ;
      gxTv_Sdtfoto_pessoa_Mode = "" ;
      gxTv_Sdtfoto_pessoa_Pes_nome_Z = "" ;
      gxTv_Sdtfoto_pessoa_Pes_data_nascimento_Z = cal.getTime() ;
      gxTv_Sdtfoto_pessoa_Fp_data_Z = cal.getTime() ;
      gxTv_Sdtfoto_pessoa_Fp_bucket_Z = "" ;
      gxTv_Sdtfoto_pessoa_Fp_hash_Z = "" ;
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

   public short getFp_id( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_id ;
   }

   public void setFp_id( short value )
   {
      gxTv_Sdtfoto_pessoa_N = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_id = value ;
   }

   public short getPes_id( )
   {
      return gxTv_Sdtfoto_pessoa_Pes_id ;
   }

   public void setPes_id( short value )
   {
      gxTv_Sdtfoto_pessoa_N = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Pes_id = value ;
   }

   public String getPes_nome( )
   {
      return gxTv_Sdtfoto_pessoa_Pes_nome ;
   }

   public void setPes_nome( String value )
   {
      gxTv_Sdtfoto_pessoa_N = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Pes_nome = value ;
   }

   public java.util.Date getPes_data_nascimento( )
   {
      return gxTv_Sdtfoto_pessoa_Pes_data_nascimento ;
   }

   public void setPes_data_nascimento( java.util.Date value )
   {
      gxTv_Sdtfoto_pessoa_N = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Pes_data_nascimento = value ;
   }

   public java.util.Date getFp_data( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_data ;
   }

   public void setFp_data( java.util.Date value )
   {
      gxTv_Sdtfoto_pessoa_N = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_data = value ;
   }

   public String getFp_bucket( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_bucket ;
   }

   public void setFp_bucket( String value )
   {
      gxTv_Sdtfoto_pessoa_N = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_bucket = value ;
   }

   public String getFp_hash( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_hash ;
   }

   public void setFp_hash( String value )
   {
      gxTv_Sdtfoto_pessoa_N = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_hash = value ;
   }

   public String getMode( )
   {
      return gxTv_Sdtfoto_pessoa_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_Sdtfoto_pessoa_N = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_Sdtfoto_pessoa_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_Sdtfoto_pessoa_N = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Initialized = value ;
   }

   public short getFp_id_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_id_Z ;
   }

   public void setFp_id_Z( short value )
   {
      gxTv_Sdtfoto_pessoa_N = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_id_Z = value ;
   }

   public short getPes_id_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Pes_id_Z ;
   }

   public void setPes_id_Z( short value )
   {
      gxTv_Sdtfoto_pessoa_N = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Pes_id_Z = value ;
   }

   public String getPes_nome_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Pes_nome_Z ;
   }

   public void setPes_nome_Z( String value )
   {
      gxTv_Sdtfoto_pessoa_N = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Pes_nome_Z = value ;
   }

   public java.util.Date getPes_data_nascimento_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Pes_data_nascimento_Z ;
   }

   public void setPes_data_nascimento_Z( java.util.Date value )
   {
      gxTv_Sdtfoto_pessoa_N = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Pes_data_nascimento_Z = value ;
   }

   public java.util.Date getFp_data_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_data_Z ;
   }

   public void setFp_data_Z( java.util.Date value )
   {
      gxTv_Sdtfoto_pessoa_N = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_data_Z = value ;
   }

   public String getFp_bucket_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_bucket_Z ;
   }

   public void setFp_bucket_Z( String value )
   {
      gxTv_Sdtfoto_pessoa_N = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_bucket_Z = value ;
   }

   public String getFp_hash_Z( )
   {
      return gxTv_Sdtfoto_pessoa_Fp_hash_Z ;
   }

   public void setFp_hash_Z( String value )
   {
      gxTv_Sdtfoto_pessoa_N = (byte)(0) ;
      gxTv_Sdtfoto_pessoa_Fp_hash_Z = value ;
   }

   private byte gxTv_Sdtfoto_pessoa_N ;
   protected short gxTv_Sdtfoto_pessoa_Fp_id ;
   protected short gxTv_Sdtfoto_pessoa_Pes_id ;
   protected short gxTv_Sdtfoto_pessoa_Initialized ;
   protected short gxTv_Sdtfoto_pessoa_Fp_id_Z ;
   protected short gxTv_Sdtfoto_pessoa_Pes_id_Z ;
   protected String gxTv_Sdtfoto_pessoa_Mode ;
   protected String gxTv_Sdtfoto_pessoa_Pes_nome ;
   protected String gxTv_Sdtfoto_pessoa_Fp_bucket ;
   protected String gxTv_Sdtfoto_pessoa_Fp_hash ;
   protected String gxTv_Sdtfoto_pessoa_Pes_nome_Z ;
   protected String gxTv_Sdtfoto_pessoa_Fp_bucket_Z ;
   protected String gxTv_Sdtfoto_pessoa_Fp_hash_Z ;
   protected java.util.Date gxTv_Sdtfoto_pessoa_Pes_data_nascimento ;
   protected java.util.Date gxTv_Sdtfoto_pessoa_Fp_data ;
   protected java.util.Date gxTv_Sdtfoto_pessoa_Pes_data_nascimento_Z ;
   protected java.util.Date gxTv_Sdtfoto_pessoa_Fp_data_Z ;
}

