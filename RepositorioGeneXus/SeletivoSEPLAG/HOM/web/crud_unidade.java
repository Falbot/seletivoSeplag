import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class crud_unidade extends GXProcedure
{
   public crud_unidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crud_unidade.class ), "" );
   }

   public crud_unidade( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e11022( )
   {
      /* Before Routine */
      returnInSub = false ;
      AV21Retorno = AV20HttpRequest.getHeader("Authorization") ;
      if ( ! (GXutil.strcmp("", AV21Retorno)==0) )
      {
         if ( GXutil.startsWith( AV21Retorno, "Bearer ") )
         {
            AV19Token = GXutil.strReplace( AV21Retorno, "Bearer ", "") ;
            GXt_boolean1 = AV18IsValid ;
            GXv_boolean2[0] = GXt_boolean1 ;
            new pvalidarjwt(remoteHandle, context).execute( AV19Token, GXv_boolean2) ;
            this.GXt_boolean1 = GXv_boolean2[0] ;
            AV18IsValid = GXt_boolean1 ;
         }
      }
      if ( ! AV18IsValid )
      {
         Gx_restcode = (short)(401) ;
         returnInSub = true;
         return;
      }
   }

   public void e12022( )
   {
      /* Read_getbykey_Before Routine */
      returnInSub = false ;
      if ( AV10codgUnidade < 0 )
      {
         Gx_restcode = (short)(412) ;
         returnInSub = true;
         return;
      }
   }

   public void e13022( )
   {
      /* Read_getbykey_After Routine */
      returnInSub = false ;
      if ( AV12ListaUnidade.getgxTv_SdtsdtListaUnidade_Unid_id() == 0 )
      {
         Gx_restcode = (short)(404) ;
      }
   }

   public void gxep_create__post( SdtsdtUnidade in_AV6DadosUnidade ,
                                  short [] arr_AV15RetornoPK ,
                                  GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV7Messages )
   {
      this.AV6DadosUnidade = in_AV6DadosUnidade;
      initialize();
      initialized = (short)(1) ;
      arr_AV15RetornoPK[0] = this.AV15RetornoPK;
      arr_AV7Messages[0] = this.AV7Messages;
      /* Execute user event: Before */
      e11022 ();
      if ( returnInSub )
      {
         arr_AV15RetornoPK[0] = this.AV15RetornoPK;
         arr_AV7Messages[0] = this.AV7Messages;
         return;
      }
      /* Create__post Constructor */
      GXv_int3[0] = AV15RetornoPK ;
      GXv_objcol_SdtMessages_Message4[0] = AV7Messages ;
      new pcriarunidade(remoteHandle, context).execute( AV6DadosUnidade, GXv_int3, GXv_objcol_SdtMessages_Message4) ;
      this.AV15RetornoPK = GXv_int3[0] ;
      AV7Messages = GXv_objcol_SdtMessages_Message4[0] ;
      arr_AV15RetornoPK[0] = this.AV15RetornoPK;
      arr_AV7Messages[0] = this.AV7Messages;
   }

   public void gxep_read_getlist( long in_AV25PageNumber ,
                                  long in_AV26PageSize ,
                                  GXBaseCollection<SdtsdtListaUnidades_sdtListaUnidadesItem> [] arr_AV9ListaDadosUnidade )
   {
      this.AV25PageNumber = in_AV25PageNumber;
      this.AV26PageSize = in_AV26PageSize;
      initialize();
      initialized = (short)(1) ;
      arr_AV9ListaDadosUnidade[0] = this.AV9ListaDadosUnidade;
      /* Execute user event: Before */
      e11022 ();
      if ( returnInSub )
      {
         arr_AV9ListaDadosUnidade[0] = this.AV9ListaDadosUnidade;
         return;
      }
      /* Read_GetList Constructor */
      GXv_objcol_SdtsdtListaUnidades_sdtListaUnidadesItem5[0] = AV9ListaDadosUnidade ;
      new dplistarunidades(remoteHandle, context).execute( AV25PageNumber, AV26PageSize, GXv_objcol_SdtsdtListaUnidades_sdtListaUnidadesItem5) ;
      AV9ListaDadosUnidade = GXv_objcol_SdtsdtListaUnidades_sdtListaUnidadesItem5[0] ;
      arr_AV9ListaDadosUnidade[0] = this.AV9ListaDadosUnidade;
   }

   public void gxep_read_getbykey( short in_AV10codgUnidade ,
                                   SdtsdtListaUnidade [] arr_AV12ListaUnidade ,
                                   GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV7Messages )
   {
      this.AV10codgUnidade = in_AV10codgUnidade;
      initialize();
      initialized = (short)(1) ;
      arr_AV12ListaUnidade[0] = this.AV12ListaUnidade;
      arr_AV7Messages[0] = this.AV7Messages;
      /* Execute user event: Before */
      e11022 ();
      if ( returnInSub )
      {
         arr_AV12ListaUnidade[0] = this.AV12ListaUnidade;
         arr_AV7Messages[0] = this.AV7Messages;
         return;
      }
      e12022 ();
      if ( returnInSub )
      {
         arr_AV12ListaUnidade[0] = this.AV12ListaUnidade;
         arr_AV7Messages[0] = this.AV7Messages;
         return;
      }
      /* Read_GetByKey Constructor */
      GXv_SdtsdtListaUnidade6[0] = AV12ListaUnidade;
      GXv_objcol_SdtMessages_Message4[0] = AV7Messages ;
      new plistarunidade(remoteHandle, context).execute( AV10codgUnidade, GXv_SdtsdtListaUnidade6, GXv_objcol_SdtMessages_Message4) ;
      AV12ListaUnidade = GXv_SdtsdtListaUnidade6[0] ;
      AV7Messages = GXv_objcol_SdtMessages_Message4[0] ;
      e13022 ();
      if ( returnInSub )
      {
         arr_AV12ListaUnidade[0] = this.AV12ListaUnidade;
         arr_AV7Messages[0] = this.AV7Messages;
         return;
      }
      arr_AV12ListaUnidade[0] = this.AV12ListaUnidade;
      arr_AV7Messages[0] = this.AV7Messages;
   }

   public void gxep_update__put( SdtsdtListaUnidade in_AV12ListaUnidade ,
                                 GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV7Messages )
   {
      this.AV12ListaUnidade = in_AV12ListaUnidade;
      initialize();
      initialized = (short)(1) ;
      arr_AV7Messages[0] = this.AV7Messages;
      /* Execute user event: Before */
      e11022 ();
      if ( returnInSub )
      {
         arr_AV7Messages[0] = this.AV7Messages;
         return;
      }
      /* Update__put Constructor */
      GXv_objcol_SdtMessages_Message4[0] = AV7Messages ;
      new patualizarunidade(remoteHandle, context).execute( AV12ListaUnidade, GXv_objcol_SdtMessages_Message4) ;
      AV7Messages = GXv_objcol_SdtMessages_Message4[0] ;
      arr_AV7Messages[0] = this.AV7Messages;
   }

   public void gxep_delete__delete( short in_AV10codgUnidade ,
                                    GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV7Messages )
   {
      this.AV10codgUnidade = in_AV10codgUnidade;
      initialize();
      initialized = (short)(1) ;
      arr_AV7Messages[0] = this.AV7Messages;
      /* Execute user event: Before */
      e11022 ();
      if ( returnInSub )
      {
         arr_AV7Messages[0] = this.AV7Messages;
         return;
      }
      /* Delete__delete Constructor */
      GXv_objcol_SdtMessages_Message4[0] = AV7Messages ;
      new pexcluirunidade(remoteHandle, context).execute( AV10codgUnidade, GXv_objcol_SdtMessages_Message4) ;
      AV7Messages = GXv_objcol_SdtMessages_Message4[0] ;
      arr_AV7Messages[0] = this.AV7Messages;
   }

   public void gxep_delete_endereco__delete( short in_AV10codgUnidade ,
                                             short in_AV16codEndereco ,
                                             GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV7Messages )
   {
      this.AV10codgUnidade = in_AV10codgUnidade;
      this.AV16codEndereco = in_AV16codEndereco;
      initialize();
      initialized = (short)(1) ;
      arr_AV7Messages[0] = this.AV7Messages;
      /* Execute user event: Before */
      e11022 ();
      if ( returnInSub )
      {
         arr_AV7Messages[0] = this.AV7Messages;
         return;
      }
      /* Delete_Endereco__delete Constructor */
      GXv_objcol_SdtMessages_Message4[0] = AV7Messages ;
      new pexcluirunidadeendereco(remoteHandle, context).execute( AV10codgUnidade, AV16codEndereco, GXv_objcol_SdtMessages_Message4) ;
      AV7Messages = GXv_objcol_SdtMessages_Message4[0] ;
      arr_AV7Messages[0] = this.AV7Messages;
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
      AV21Retorno = "" ;
      AV20HttpRequest = httpContext.getHttpRequest();
      AV19Token = "" ;
      GXv_boolean2 = new boolean[1] ;
      AV7Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_int3 = new short[1] ;
      AV9ListaDadosUnidade = new GXBaseCollection<SdtsdtListaUnidades_sdtListaUnidadesItem>(SdtsdtListaUnidades_sdtListaUnidadesItem.class, "sdtListaUnidadesItem", "SeletivoSEPLAG", remoteHandle);
      GXv_objcol_SdtsdtListaUnidades_sdtListaUnidadesItem5 = new GXBaseCollection[1] ;
      GXv_SdtsdtListaUnidade6 = new SdtsdtListaUnidade[1] ;
      GXv_objcol_SdtMessages_Message4 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   protected short Gx_restcode ;
   protected short initialized ;
   protected short AV15RetornoPK ;
   protected short GXv_int3[] ;
   protected short AV10codgUnidade ;
   protected short AV16codEndereco ;
   protected short Gx_err ;
   protected long AV25PageNumber ;
   protected long AV26PageSize ;
   protected boolean returnInSub ;
   protected boolean AV18IsValid ;
   protected boolean GXt_boolean1 ;
   protected boolean GXv_boolean2[] ;
   protected String AV21Retorno ;
   protected String AV19Token ;
   protected com.genexus.internet.HttpRequest AV20HttpRequest ;
   protected SdtsdtListaUnidade AV12ListaUnidade ;
   protected short[] arr_AV15RetornoPK ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV7Messages ;
   protected GXBaseCollection<SdtsdtListaUnidades_sdtListaUnidadesItem>[] arr_AV9ListaDadosUnidade ;
   protected SdtsdtListaUnidade[] arr_AV12ListaUnidade ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV7Messages ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message4[] ;
   protected GXBaseCollection<SdtsdtListaUnidades_sdtListaUnidadesItem> AV9ListaDadosUnidade ;
   protected GXBaseCollection<SdtsdtListaUnidades_sdtListaUnidadesItem> GXv_objcol_SdtsdtListaUnidades_sdtListaUnidadesItem5[] ;
   protected SdtsdtUnidade AV6DadosUnidade ;
   protected SdtsdtListaUnidade GXv_SdtsdtListaUnidade6[] ;
}

