import com.genexus.*;

public final  class StructSdtunidade implements Cloneable, java.io.Serializable
{
   public StructSdtunidade( )
   {
      this( -1, new ModelContext( StructSdtunidade.class ));
   }

   public StructSdtunidade( int remoteHandle ,
                            ModelContext context )
   {
      gxTv_Sdtunidade_Unid_nome = "" ;
      gxTv_Sdtunidade_Unid_sigla = "" ;
      gxTv_Sdtunidade_Mode = "" ;
      gxTv_Sdtunidade_Unid_nome_Z = "" ;
      gxTv_Sdtunidade_Unid_sigla_Z = "" ;
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

   public short getUnid_id( )
   {
      return gxTv_Sdtunidade_Unid_id ;
   }

   public void setUnid_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtunidade_Unid_id = value ;
   }

   public String getUnid_nome( )
   {
      return gxTv_Sdtunidade_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtunidade_Unid_nome = value ;
   }

   public String getUnid_sigla( )
   {
      return gxTv_Sdtunidade_Unid_sigla ;
   }

   public void setUnid_sigla( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtunidade_Unid_sigla = value ;
   }

   public String getMode( )
   {
      return gxTv_Sdtunidade_Mode ;
   }

   public void setMode( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtunidade_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_Sdtunidade_Initialized ;
   }

   public void setInitialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtunidade_Initialized = value ;
   }

   public short getUnid_id_Z( )
   {
      return gxTv_Sdtunidade_Unid_id_Z ;
   }

   public void setUnid_id_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtunidade_Unid_id_Z = value ;
   }

   public String getUnid_nome_Z( )
   {
      return gxTv_Sdtunidade_Unid_nome_Z ;
   }

   public void setUnid_nome_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtunidade_Unid_nome_Z = value ;
   }

   public String getUnid_sigla_Z( )
   {
      return gxTv_Sdtunidade_Unid_sigla_Z ;
   }

   public void setUnid_sigla_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtunidade_Unid_sigla_Z = value ;
   }

   private byte sdtIsNull ;
   protected short gxTv_Sdtunidade_Unid_id ;
   protected short gxTv_Sdtunidade_Initialized ;
   protected short gxTv_Sdtunidade_Unid_id_Z ;
   protected String gxTv_Sdtunidade_Mode ;
   protected String gxTv_Sdtunidade_Unid_nome ;
   protected String gxTv_Sdtunidade_Unid_sigla ;
   protected String gxTv_Sdtunidade_Unid_nome_Z ;
   protected String gxTv_Sdtunidade_Unid_sigla_Z ;
}

