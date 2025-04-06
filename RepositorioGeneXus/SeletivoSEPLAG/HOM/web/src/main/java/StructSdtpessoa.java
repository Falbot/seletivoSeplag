import com.genexus.*;

public final  class StructSdtpessoa implements Cloneable, java.io.Serializable
{
   public StructSdtpessoa( )
   {
      this( -1, new ModelContext( StructSdtpessoa.class ));
   }

   public StructSdtpessoa( int remoteHandle ,
                           ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_Sdtpessoa_Pes_nome = "" ;
      gxTv_Sdtpessoa_Pes_data_nascimento = cal.getTime() ;
      gxTv_Sdtpessoa_Pes_sexo = "" ;
      gxTv_Sdtpessoa_Pes_mae = "" ;
      gxTv_Sdtpessoa_Pes_pai = "" ;
      gxTv_Sdtpessoa_Mode = "" ;
      gxTv_Sdtpessoa_Pes_nome_Z = "" ;
      gxTv_Sdtpessoa_Pes_data_nascimento_Z = cal.getTime() ;
      gxTv_Sdtpessoa_Pes_sexo_Z = "" ;
      gxTv_Sdtpessoa_Pes_mae_Z = "" ;
      gxTv_Sdtpessoa_Pes_pai_Z = "" ;
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
      return gxTv_Sdtpessoa_Pes_id ;
   }

   public void setPes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_Pes_id = value ;
   }

   public String getPes_nome( )
   {
      return gxTv_Sdtpessoa_Pes_nome ;
   }

   public void setPes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_Pes_nome = value ;
   }

   public java.util.Date getPes_data_nascimento( )
   {
      return gxTv_Sdtpessoa_Pes_data_nascimento ;
   }

   public void setPes_data_nascimento( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_Pes_data_nascimento = value ;
   }

   public String getPes_sexo( )
   {
      return gxTv_Sdtpessoa_Pes_sexo ;
   }

   public void setPes_sexo( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_Pes_sexo = value ;
   }

   public String getPes_mae( )
   {
      return gxTv_Sdtpessoa_Pes_mae ;
   }

   public void setPes_mae( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_Pes_mae = value ;
   }

   public String getPes_pai( )
   {
      return gxTv_Sdtpessoa_Pes_pai ;
   }

   public void setPes_pai( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_Pes_pai = value ;
   }

   public short getPes_idade( )
   {
      return gxTv_Sdtpessoa_Pes_idade ;
   }

   public void setPes_idade( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_Pes_idade = value ;
   }

   public String getMode( )
   {
      return gxTv_Sdtpessoa_Mode ;
   }

   public void setMode( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_Sdtpessoa_Initialized ;
   }

   public void setInitialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_Initialized = value ;
   }

   public short getPes_id_Z( )
   {
      return gxTv_Sdtpessoa_Pes_id_Z ;
   }

   public void setPes_id_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_Pes_id_Z = value ;
   }

   public String getPes_nome_Z( )
   {
      return gxTv_Sdtpessoa_Pes_nome_Z ;
   }

   public void setPes_nome_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_Pes_nome_Z = value ;
   }

   public java.util.Date getPes_data_nascimento_Z( )
   {
      return gxTv_Sdtpessoa_Pes_data_nascimento_Z ;
   }

   public void setPes_data_nascimento_Z( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_Pes_data_nascimento_Z = value ;
   }

   public String getPes_sexo_Z( )
   {
      return gxTv_Sdtpessoa_Pes_sexo_Z ;
   }

   public void setPes_sexo_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_Pes_sexo_Z = value ;
   }

   public String getPes_mae_Z( )
   {
      return gxTv_Sdtpessoa_Pes_mae_Z ;
   }

   public void setPes_mae_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_Pes_mae_Z = value ;
   }

   public String getPes_pai_Z( )
   {
      return gxTv_Sdtpessoa_Pes_pai_Z ;
   }

   public void setPes_pai_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_Pes_pai_Z = value ;
   }

   public short getPes_idade_Z( )
   {
      return gxTv_Sdtpessoa_Pes_idade_Z ;
   }

   public void setPes_idade_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtpessoa_Pes_idade_Z = value ;
   }

   private byte sdtIsNull ;
   protected short gxTv_Sdtpessoa_Pes_id ;
   protected short gxTv_Sdtpessoa_Pes_idade ;
   protected short gxTv_Sdtpessoa_Initialized ;
   protected short gxTv_Sdtpessoa_Pes_id_Z ;
   protected short gxTv_Sdtpessoa_Pes_idade_Z ;
   protected String gxTv_Sdtpessoa_Mode ;
   protected String gxTv_Sdtpessoa_Pes_nome ;
   protected String gxTv_Sdtpessoa_Pes_sexo ;
   protected String gxTv_Sdtpessoa_Pes_mae ;
   protected String gxTv_Sdtpessoa_Pes_pai ;
   protected String gxTv_Sdtpessoa_Pes_nome_Z ;
   protected String gxTv_Sdtpessoa_Pes_sexo_Z ;
   protected String gxTv_Sdtpessoa_Pes_mae_Z ;
   protected String gxTv_Sdtpessoa_Pes_pai_Z ;
   protected java.util.Date gxTv_Sdtpessoa_Pes_data_nascimento ;
   protected java.util.Date gxTv_Sdtpessoa_Pes_data_nascimento_Z ;
}

