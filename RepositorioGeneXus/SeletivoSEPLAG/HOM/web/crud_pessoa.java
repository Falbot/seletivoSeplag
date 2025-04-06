import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class crud_pessoa extends GXProcedure
{
   public crud_pessoa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crud_pessoa.class ), "" );
   }

   public crud_pessoa( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e11012( )
   {
      /* Before Routine */
      returnInSub = false ;
      AV16Retorno = AV17HttpRequest.getHeader("Authorization") ;
      if ( ! (GXutil.strcmp("", AV16Retorno)==0) )
      {
         if ( GXutil.startsWith( AV16Retorno, "Bearer ") )
         {
            AV18Token = GXutil.strReplace( AV16Retorno, "Bearer ", "") ;
            GXt_boolean1 = AV19IsValid ;
            GXv_boolean2[0] = GXt_boolean1 ;
            new pvalidarjwt(remoteHandle, context).execute( AV18Token, GXv_boolean2) ;
            this.GXt_boolean1 = GXv_boolean2[0] ;
            AV19IsValid = GXt_boolean1 ;
         }
      }
      if ( ! AV19IsValid )
      {
         Gx_restcode = (short)(401) ;
         returnInSub = true;
         return;
      }
   }

   public void e12012( )
   {
      /* Read_getbykey_Before Routine */
      returnInSub = false ;
      if ( AV12codgPessoa < 0 )
      {
         Gx_restcode = (short)(412) ;
         returnInSub = true;
         return;
      }
   }

   public void e13012( )
   {
      /* Read_getbykey_After Routine */
      returnInSub = false ;
      if ( AV13ListaPessoa.getgxTv_SdtsdtListaPessoa_Pes_id() == 0 )
      {
         Gx_restcode = (short)(404) ;
      }
   }

   public void gxep_create__post( SdtsdtPessoa in_AV5DadosPessoa ,
                                  short [] arr_AV15RetornoPK ,
                                  GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV5DadosPessoa = in_AV5DadosPessoa;
      initialize();
      initialized = (short)(1) ;
      arr_AV15RetornoPK[0] = this.AV15RetornoPK;
      arr_AV6Messages[0] = this.AV6Messages;
      /* Execute user event: Before */
      e11012 ();
      if ( returnInSub )
      {
         arr_AV15RetornoPK[0] = this.AV15RetornoPK;
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* Create__post Constructor */
      GXv_int3[0] = AV15RetornoPK ;
      GXv_objcol_SdtMessages_Message4[0] = AV6Messages ;
      new pcriarpessoa(remoteHandle, context).execute( AV5DadosPessoa, GXv_int3, GXv_objcol_SdtMessages_Message4) ;
      this.AV15RetornoPK = GXv_int3[0] ;
      AV6Messages = GXv_objcol_SdtMessages_Message4[0] ;
      arr_AV15RetornoPK[0] = this.AV15RetornoPK;
      arr_AV6Messages[0] = this.AV6Messages;
   }

   public void gxep_read_getlist( long in_AV21PageNumber ,
                                  long in_AV20PageSize ,
                                  GXBaseCollection<SdtsdtListaPessoas_sdtListaPessoasItem> [] arr_AV7ListaDadosPessoa )
   {
      this.AV21PageNumber = in_AV21PageNumber;
      this.AV20PageSize = in_AV20PageSize;
      initialize();
      initialized = (short)(1) ;
      arr_AV7ListaDadosPessoa[0] = this.AV7ListaDadosPessoa;
      /* Execute user event: Before */
      e11012 ();
      if ( returnInSub )
      {
         arr_AV7ListaDadosPessoa[0] = this.AV7ListaDadosPessoa;
         return;
      }
      /* Read_GetList Constructor */
      GXv_objcol_SdtsdtListaPessoas_sdtListaPessoasItem5[0] = AV7ListaDadosPessoa ;
      new dplistarpessoas(remoteHandle, context).execute( AV21PageNumber, AV20PageSize, GXv_objcol_SdtsdtListaPessoas_sdtListaPessoasItem5) ;
      AV7ListaDadosPessoa = GXv_objcol_SdtsdtListaPessoas_sdtListaPessoasItem5[0] ;
      arr_AV7ListaDadosPessoa[0] = this.AV7ListaDadosPessoa;
   }

   public void gxep_read_getbykey( short in_AV12codgPessoa ,
                                   SdtsdtListaPessoa [] arr_AV13ListaPessoa ,
                                   GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV12codgPessoa = in_AV12codgPessoa;
      initialize();
      initialized = (short)(1) ;
      arr_AV13ListaPessoa[0] = this.AV13ListaPessoa;
      arr_AV6Messages[0] = this.AV6Messages;
      /* Execute user event: Before */
      e11012 ();
      if ( returnInSub )
      {
         arr_AV13ListaPessoa[0] = this.AV13ListaPessoa;
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      e12012 ();
      if ( returnInSub )
      {
         arr_AV13ListaPessoa[0] = this.AV13ListaPessoa;
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* Read_GetByKey Constructor */
      GXv_SdtsdtListaPessoa6[0] = AV13ListaPessoa;
      GXv_objcol_SdtMessages_Message4[0] = AV6Messages ;
      new plistarpessoa(remoteHandle, context).execute( AV12codgPessoa, GXv_SdtsdtListaPessoa6, GXv_objcol_SdtMessages_Message4) ;
      AV13ListaPessoa = GXv_SdtsdtListaPessoa6[0] ;
      AV6Messages = GXv_objcol_SdtMessages_Message4[0] ;
      e13012 ();
      if ( returnInSub )
      {
         arr_AV13ListaPessoa[0] = this.AV13ListaPessoa;
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      arr_AV13ListaPessoa[0] = this.AV13ListaPessoa;
      arr_AV6Messages[0] = this.AV6Messages;
   }

   public void gxep_update__put( SdtsdtListaPessoa in_AV13ListaPessoa ,
                                 GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV13ListaPessoa = in_AV13ListaPessoa;
      initialize();
      initialized = (short)(1) ;
      arr_AV6Messages[0] = this.AV6Messages;
      /* Execute user event: Before */
      e11012 ();
      if ( returnInSub )
      {
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* Update__put Constructor */
      GXv_objcol_SdtMessages_Message4[0] = AV6Messages ;
      new patualizarpessoa(remoteHandle, context).execute( AV13ListaPessoa, GXv_objcol_SdtMessages_Message4) ;
      AV6Messages = GXv_objcol_SdtMessages_Message4[0] ;
      arr_AV6Messages[0] = this.AV6Messages;
   }

   public void gxep_delete__delete( short in_AV12codgPessoa ,
                                    GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV6Messages )
   {
      this.AV12codgPessoa = in_AV12codgPessoa;
      initialize();
      initialized = (short)(1) ;
      arr_AV6Messages[0] = this.AV6Messages;
      /* Execute user event: Before */
      e11012 ();
      if ( returnInSub )
      {
         arr_AV6Messages[0] = this.AV6Messages;
         return;
      }
      /* Delete__delete Constructor */
      GXv_int3[0] = AV12codgPessoa ;
      GXv_objcol_SdtMessages_Message4[0] = AV6Messages ;
      new pexcluirpessoa(remoteHandle, context).execute( GXv_int3, GXv_objcol_SdtMessages_Message4) ;
      this.AV12codgPessoa = GXv_int3[0] ;
      AV6Messages = GXv_objcol_SdtMessages_Message4[0] ;
      arr_AV6Messages[0] = this.AV6Messages;
   }

   public short getrestcode( )
   {
      return Gx_restcode ;
   }

   protected void cleanup( )
   {
      if ( initialized != 1 )
      {
      }
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Retorno = "" ;
      AV17HttpRequest = httpContext.getHttpRequest();
      AV18Token = "" ;
      GXv_boolean2 = new boolean[1] ;
      AV6Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV7ListaDadosPessoa = new GXBaseCollection<SdtsdtListaPessoas_sdtListaPessoasItem>(SdtsdtListaPessoas_sdtListaPessoasItem.class, "sdtListaPessoasItem", "SeletivoSEPLAG", remoteHandle);
      GXv_objcol_SdtsdtListaPessoas_sdtListaPessoasItem5 = new GXBaseCollection[1] ;
      GXv_SdtsdtListaPessoa6 = new SdtsdtListaPessoa[1] ;
      GXv_int3 = new short[1] ;
      GXv_objcol_SdtMessages_Message4 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   protected short Gx_restcode ;
   protected short initialized ;
   protected short AV15RetornoPK ;
   protected short AV12codgPessoa ;
   protected short GXv_int3[] ;
   protected short Gx_err ;
   protected long AV21PageNumber ;
   protected long AV20PageSize ;
   protected boolean returnInSub ;
   protected boolean AV19IsValid ;
   protected boolean GXt_boolean1 ;
   protected boolean GXv_boolean2[] ;
   protected String AV18Token ;
   protected String AV16Retorno ;
   protected com.genexus.internet.HttpRequest AV17HttpRequest ;
   protected SdtsdtListaPessoa AV13ListaPessoa ;
   protected short[] arr_AV15RetornoPK ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV6Messages ;
   protected GXBaseCollection<SdtsdtListaPessoas_sdtListaPessoasItem>[] arr_AV7ListaDadosPessoa ;
   protected SdtsdtListaPessoa[] arr_AV13ListaPessoa ;
   protected GXBaseCollection<SdtsdtListaPessoas_sdtListaPessoasItem> AV7ListaDadosPessoa ;
   protected GXBaseCollection<SdtsdtListaPessoas_sdtListaPessoasItem> GXv_objcol_SdtsdtListaPessoas_sdtListaPessoasItem5[] ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV6Messages ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message4[] ;
   protected SdtsdtPessoa AV5DadosPessoa ;
   protected SdtsdtListaPessoa GXv_SdtsdtListaPessoa6[] ;
}

