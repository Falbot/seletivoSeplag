import com.genexus.*;

public final  class StructSdtpessoa_endereco implements Cloneable, java.io.Serializable
{
   public StructSdtpessoa_endereco( )
   {
      this( -1, new ModelContext( StructSdtpessoa_endereco.class ));
   }

   public StructSdtpessoa_endereco( int remoteHandle ,
                                    ModelContext context )
   {
      gxTv_Sdtpessoa_endereco_Mode = "" ;
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
      return gxTv_Sdtpessoa_endereco_Pes_id ;
   }

   public void setPes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_endereco_Pes_id = value ;
   }

   public short getEnd_id( )
   {
      return gxTv_Sdtpessoa_endereco_End_id ;
   }

   public void setEnd_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_endereco_End_id = value ;
   }

   public String getMode( )
   {
      return gxTv_Sdtpessoa_endereco_Mode ;
   }

   public void setMode( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_endereco_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_Sdtpessoa_endereco_Initialized ;
   }

   public void setInitialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_endereco_Initialized = value ;
   }

   public short getPes_id_Z( )
   {
      return gxTv_Sdtpessoa_endereco_Pes_id_Z ;
   }

   public void setPes_id_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_endereco_Pes_id_Z = value ;
   }

   public short getEnd_id_Z( )
   {
      return gxTv_Sdtpessoa_endereco_End_id_Z ;
   }

   public void setEnd_id_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_endereco_End_id_Z = value ;
   }

   private byte sdtIsNull ;
   protected short gxTv_Sdtpessoa_endereco_Pes_id ;
   protected short gxTv_Sdtpessoa_endereco_End_id ;
   protected short gxTv_Sdtpessoa_endereco_Initialized ;
   protected short gxTv_Sdtpessoa_endereco_Pes_id_Z ;
   protected short gxTv_Sdtpessoa_endereco_End_id_Z ;
   protected String gxTv_Sdtpessoa_endereco_Mode ;
}

