import com.genexus.*;

public final  class StructSdtsdtListaPessoas_sdtListaPessoasItem implements Cloneable, java.io.Serializable
{
   public StructSdtsdtListaPessoas_sdtListaPessoasItem( )
   {
      this( -1, new ModelContext( StructSdtsdtListaPessoas_sdtListaPessoasItem.class ));
   }

   public StructSdtsdtListaPessoas_sdtListaPessoasItem( int remoteHandle ,
                                                        ModelContext context )
   {
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome = "" ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento = "" ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo = "" ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae = "" ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai = "" ;
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
      return gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id ;
   }

   public void setPes_id( short value )
   {
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_N = (byte)(0) ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id = value ;
   }

   public String getPes_nome( )
   {
      return gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome ;
   }

   public void setPes_nome( String value )
   {
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_N = (byte)(0) ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome = value ;
   }

   public String getPes_data_nascimento( )
   {
      return gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento ;
   }

   public void setPes_data_nascimento( String value )
   {
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_N = (byte)(0) ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento = value ;
   }

   public String getPes_sexo( )
   {
      return gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo ;
   }

   public void setPes_sexo( String value )
   {
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_N = (byte)(0) ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo = value ;
   }

   public String getPes_mae( )
   {
      return gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae ;
   }

   public void setPes_mae( String value )
   {
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_N = (byte)(0) ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae = value ;
   }

   public String getPes_pai( )
   {
      return gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai ;
   }

   public void setPes_pai( String value )
   {
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_N = (byte)(0) ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai = value ;
   }

   protected byte gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_N ;
   protected short gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id ;
   protected String gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome ;
   protected String gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento ;
   protected String gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo ;
   protected String gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae ;
   protected String gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai ;
}

