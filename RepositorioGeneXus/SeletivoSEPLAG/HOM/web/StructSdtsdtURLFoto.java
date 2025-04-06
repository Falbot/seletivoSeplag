import com.genexus.*;

public final  class StructSdtsdtURLFoto implements Cloneable, java.io.Serializable
{
   public StructSdtsdtURLFoto( )
   {
      this( -1, new ModelContext( StructSdtsdtURLFoto.class ));
   }

   public StructSdtsdtURLFoto( int remoteHandle ,
                               ModelContext context )
   {
      gxTv_SdtsdtURLFoto_Linkexp5minutos = "" ;
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

   public String getLinkexp5minutos( )
   {
      return gxTv_SdtsdtURLFoto_Linkexp5minutos ;
   }

   public void setLinkexp5minutos( String value )
   {
      gxTv_SdtsdtURLFoto_N = (byte)(0) ;
      gxTv_SdtsdtURLFoto_Linkexp5minutos = value ;
   }

   protected byte gxTv_SdtsdtURLFoto_N ;
   protected String gxTv_SdtsdtURLFoto_Linkexp5minutos ;
}

