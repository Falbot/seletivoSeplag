import com.genexus.*;

public final  class StructSdtsdtPessoa implements Cloneable, java.io.Serializable
{
   public StructSdtsdtPessoa( )
   {
      this( -1, new ModelContext( StructSdtsdtPessoa.class ));
   }

   public StructSdtsdtPessoa( int remoteHandle ,
                              ModelContext context )
   {
      gxTv_SdtsdtPessoa_Pes_nome = "" ;
      gxTv_SdtsdtPessoa_Pes_data_nascimento = "" ;
      gxTv_SdtsdtPessoa_Pes_sexo = "" ;
      gxTv_SdtsdtPessoa_Pes_mae = "" ;
      gxTv_SdtsdtPessoa_Pes_pai = "" ;
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

   public String getPes_nome( )
   {
      return gxTv_SdtsdtPessoa_Pes_nome ;
   }

   public void setPes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtPessoa_Pes_nome = value ;
   }

   public String getPes_data_nascimento( )
   {
      return gxTv_SdtsdtPessoa_Pes_data_nascimento ;
   }

   public void setPes_data_nascimento( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtPessoa_Pes_data_nascimento = value ;
   }

   public String getPes_sexo( )
   {
      return gxTv_SdtsdtPessoa_Pes_sexo ;
   }

   public void setPes_sexo( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtPessoa_Pes_sexo = value ;
   }

   public String getPes_mae( )
   {
      return gxTv_SdtsdtPessoa_Pes_mae ;
   }

   public void setPes_mae( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtPessoa_Pes_mae = value ;
   }

   public String getPes_pai( )
   {
      return gxTv_SdtsdtPessoa_Pes_pai ;
   }

   public void setPes_pai( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtPessoa_Pes_pai = value ;
   }

   protected byte sdtIsNull ;
   protected String gxTv_SdtsdtPessoa_Pes_nome ;
   protected String gxTv_SdtsdtPessoa_Pes_data_nascimento ;
   protected String gxTv_SdtsdtPessoa_Pes_sexo ;
   protected String gxTv_SdtsdtPessoa_Pes_mae ;
   protected String gxTv_SdtsdtPessoa_Pes_pai ;
}

