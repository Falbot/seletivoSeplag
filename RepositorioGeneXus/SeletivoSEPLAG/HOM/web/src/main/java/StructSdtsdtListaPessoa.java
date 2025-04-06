import com.genexus.*;

public final  class StructSdtsdtListaPessoa implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaPessoa( )
   {
      this( -1, new ModelContext( StructSdtsdtListaPessoa.class ));
   }

   public StructSdtsdtListaPessoa( int remoteHandle ,
                                   ModelContext context )
   {
      gxTv_SdtsdtListaPessoa_Pes_nome = "" ;
      gxTv_SdtsdtListaPessoa_Pes_data_nascimento = "" ;
      gxTv_SdtsdtListaPessoa_Pes_sexo = "" ;
      gxTv_SdtsdtListaPessoa_Pes_mae = "" ;
      gxTv_SdtsdtListaPessoa_Pes_pai = "" ;
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
      return gxTv_SdtsdtListaPessoa_Pes_id ;
   }

   public void setPes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaPessoa_Pes_id = value ;
   }

   public String getPes_nome( )
   {
      return gxTv_SdtsdtListaPessoa_Pes_nome ;
   }

   public void setPes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaPessoa_Pes_nome = value ;
   }

   public String getPes_data_nascimento( )
   {
      return gxTv_SdtsdtListaPessoa_Pes_data_nascimento ;
   }

   public void setPes_data_nascimento( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaPessoa_Pes_data_nascimento = value ;
   }

   public String getPes_sexo( )
   {
      return gxTv_SdtsdtListaPessoa_Pes_sexo ;
   }

   public void setPes_sexo( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaPessoa_Pes_sexo = value ;
   }

   public String getPes_mae( )
   {
      return gxTv_SdtsdtListaPessoa_Pes_mae ;
   }

   public void setPes_mae( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaPessoa_Pes_mae = value ;
   }

   public String getPes_pai( )
   {
      return gxTv_SdtsdtListaPessoa_Pes_pai ;
   }

   public void setPes_pai( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaPessoa_Pes_pai = value ;
   }

   protected byte sdtIsNull ;
   protected short gxTv_SdtsdtListaPessoa_Pes_id ;
   protected String gxTv_SdtsdtListaPessoa_Pes_nome ;
   protected String gxTv_SdtsdtListaPessoa_Pes_data_nascimento ;
   protected String gxTv_SdtsdtListaPessoa_Pes_sexo ;
   protected String gxTv_SdtsdtListaPessoa_Pes_mae ;
   protected String gxTv_SdtsdtListaPessoa_Pes_pai ;
}

