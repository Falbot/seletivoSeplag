import com.genexus.*;

public final  class StructSdtservidor_efetivo implements Cloneable, java.io.Serializable
{
   public StructSdtservidor_efetivo( )
   {
      this( -1, new ModelContext( StructSdtservidor_efetivo.class ));
   }

   public StructSdtservidor_efetivo( int remoteHandle ,
                                     ModelContext context )
   {
      gxTv_Sdtservidor_efetivo_Se_matricula = "" ;
      gxTv_Sdtservidor_efetivo_Mode = "" ;
      gxTv_Sdtservidor_efetivo_Se_matricula_Z = "" ;
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
      return gxTv_Sdtservidor_efetivo_Pes_id ;
   }

   public void setPes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_efetivo_Pes_id = value ;
   }

   public String getSe_matricula( )
   {
      return gxTv_Sdtservidor_efetivo_Se_matricula ;
   }

   public void setSe_matricula( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_efetivo_Se_matricula = value ;
   }

   public String getMode( )
   {
      return gxTv_Sdtservidor_efetivo_Mode ;
   }

   public void setMode( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_efetivo_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_Sdtservidor_efetivo_Initialized ;
   }

   public void setInitialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_efetivo_Initialized = value ;
   }

   public short getPes_id_Z( )
   {
      return gxTv_Sdtservidor_efetivo_Pes_id_Z ;
   }

   public void setPes_id_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_efetivo_Pes_id_Z = value ;
   }

   public String getSe_matricula_Z( )
   {
      return gxTv_Sdtservidor_efetivo_Se_matricula_Z ;
   }

   public void setSe_matricula_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_efetivo_Se_matricula_Z = value ;
   }

   private byte sdtIsNull ;
   protected short gxTv_Sdtservidor_efetivo_Pes_id ;
   protected short gxTv_Sdtservidor_efetivo_Initialized ;
   protected short gxTv_Sdtservidor_efetivo_Pes_id_Z ;
   protected String gxTv_Sdtservidor_efetivo_Mode ;
   protected String gxTv_Sdtservidor_efetivo_Se_matricula ;
   protected String gxTv_Sdtservidor_efetivo_Se_matricula_Z ;
}

