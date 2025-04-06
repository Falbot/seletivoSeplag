import com.genexus.*;

public final  class StructSdtsdtFoto implements Cloneable, java.io.Serializable
{
   public StructSdtsdtFoto( )
   {
      this( -1, new ModelContext( StructSdtsdtFoto.class ));
   }

   public StructSdtsdtFoto( int remoteHandle ,
                            ModelContext context )
   {
      gxTv_SdtsdtFoto_Arquivobase64 = "" ;
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

   public String getArquivobase64( )
   {
      return gxTv_SdtsdtFoto_Arquivobase64 ;
   }

   public void setArquivobase64( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtFoto_Arquivobase64 = value ;
   }

   protected byte sdtIsNull ;
   protected String gxTv_SdtsdtFoto_Arquivobase64 ;
}

