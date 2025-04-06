import com.genexus.*;

public final  class StructSdtunidade_endereco implements Cloneable, java.io.Serializable
{
   public StructSdtunidade_endereco( )
   {
      this( -1, new ModelContext( StructSdtunidade_endereco.class ));
   }

   public StructSdtunidade_endereco( int remoteHandle ,
                                     ModelContext context )
   {
      gxTv_Sdtunidade_endereco_Mode = "" ;
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
      return gxTv_Sdtunidade_endereco_Unid_id ;
   }

   public void setUnid_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtunidade_endereco_Unid_id = value ;
   }

   public short getEnd_id( )
   {
      return gxTv_Sdtunidade_endereco_End_id ;
   }

   public void setEnd_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtunidade_endereco_End_id = value ;
   }

   public String getMode( )
   {
      return gxTv_Sdtunidade_endereco_Mode ;
   }

   public void setMode( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtunidade_endereco_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_Sdtunidade_endereco_Initialized ;
   }

   public void setInitialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtunidade_endereco_Initialized = value ;
   }

   public short getUnid_id_Z( )
   {
      return gxTv_Sdtunidade_endereco_Unid_id_Z ;
   }

   public void setUnid_id_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtunidade_endereco_Unid_id_Z = value ;
   }

   public short getEnd_id_Z( )
   {
      return gxTv_Sdtunidade_endereco_End_id_Z ;
   }

   public void setEnd_id_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtunidade_endereco_End_id_Z = value ;
   }

   private byte sdtIsNull ;
   protected short gxTv_Sdtunidade_endereco_Unid_id ;
   protected short gxTv_Sdtunidade_endereco_End_id ;
   protected short gxTv_Sdtunidade_endereco_Initialized ;
   protected short gxTv_Sdtunidade_endereco_Unid_id_Z ;
   protected short gxTv_Sdtunidade_endereco_End_id_Z ;
   protected String gxTv_Sdtunidade_endereco_Mode ;
}

