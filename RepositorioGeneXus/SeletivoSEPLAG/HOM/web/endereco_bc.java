import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class endereco_bc extends GXWebPanel implements IGxSilentTrn
{
   public endereco_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public endereco_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( endereco_bc.class ));
   }

   public endereco_bc( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow044( ) ;
      standaloneNotModal( ) ;
      initializeNonKey044( ) ;
      standaloneModal( ) ;
      addRow044( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z13end_id = A13end_id ;
            SetMode( "UPD") ;
         }
      }
      endTrnMsgTxt = "" ;
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public boolean Reindex( )
   {
      return true ;
   }

   public void confirm_040( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls044( ) ;
         }
         else
         {
            checkExtendedTable044( ) ;
            if ( AnyError == 0 )
            {
               zm044( 2) ;
            }
            closeExtendedTableCursors044( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm044( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z14end_tipo_logradouro = A14end_tipo_logradouro ;
         Z15end_logradouro = A15end_logradouro ;
         Z16end_numero = A16end_numero ;
         Z17end_bairro = A17end_bairro ;
         Z1cid_id = A1cid_id ;
      }
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         Z2cid_nome = A2cid_nome ;
         Z3cid_uf = A3cid_uf ;
      }
      if ( GX_JID == -1 )
      {
         Z13end_id = A13end_id ;
         Z14end_tipo_logradouro = A14end_tipo_logradouro ;
         Z15end_logradouro = A15end_logradouro ;
         Z16end_numero = A16end_numero ;
         Z17end_bairro = A17end_bairro ;
         Z1cid_id = A1cid_id ;
         Z2cid_nome = A2cid_nome ;
         Z3cid_uf = A3cid_uf ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load044( )
   {
      /* Using cursor BC00045 */
      pr_default.execute(3, new Object[] {Short.valueOf(A13end_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A14end_tipo_logradouro = BC00045_A14end_tipo_logradouro[0] ;
         A15end_logradouro = BC00045_A15end_logradouro[0] ;
         A16end_numero = BC00045_A16end_numero[0] ;
         A17end_bairro = BC00045_A17end_bairro[0] ;
         A2cid_nome = BC00045_A2cid_nome[0] ;
         A3cid_uf = BC00045_A3cid_uf[0] ;
         A1cid_id = BC00045_A1cid_id[0] ;
         zm044( -1) ;
      }
      pr_default.close(3);
      onLoadActions044( ) ;
   }

   public void onLoadActions044( )
   {
   }

   public void checkExtendedTable044( )
   {
      nIsDirty_4 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC00046 */
      pr_default.execute(4, new Object[] {Short.valueOf(A1cid_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'cidade'.", "ForeignKeyNotFound", 1, "CID_ID");
         AnyError = (short)(1) ;
      }
      A2cid_nome = BC00046_A2cid_nome[0] ;
      A3cid_uf = BC00046_A3cid_uf[0] ;
      pr_default.close(4);
   }

   public void closeExtendedTableCursors044( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void getKey044( )
   {
      /* Using cursor BC00047 */
      pr_default.execute(5, new Object[] {Short.valueOf(A13end_id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound4 = (short)(1) ;
      }
      else
      {
         RcdFound4 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00048 */
      pr_default.execute(6, new Object[] {Short.valueOf(A13end_id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm044( 1) ;
         RcdFound4 = (short)(1) ;
         A13end_id = BC00048_A13end_id[0] ;
         A14end_tipo_logradouro = BC00048_A14end_tipo_logradouro[0] ;
         A15end_logradouro = BC00048_A15end_logradouro[0] ;
         A16end_numero = BC00048_A16end_numero[0] ;
         A17end_bairro = BC00048_A17end_bairro[0] ;
         A1cid_id = BC00048_A1cid_id[0] ;
         Z13end_id = A13end_id ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load044( ) ;
         if ( AnyError == 1 )
         {
            RcdFound4 = (short)(0) ;
            initializeNonKey044( ) ;
         }
         Gx_mode = sMode4 ;
      }
      else
      {
         RcdFound4 = (short)(0) ;
         initializeNonKey044( ) ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode4 ;
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey044( ) ;
      if ( RcdFound4 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
      }
      getByPrimaryKey( ) ;
   }

   public void insert_check( )
   {
      confirm_040( ) ;
      IsConfirmed = (short)(0) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency044( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00049 */
         pr_default.execute(7, new Object[] {Short.valueOf(A13end_id)});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"endereco"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) || ( GXutil.strcmp(Z14end_tipo_logradouro, BC00049_A14end_tipo_logradouro[0]) != 0 ) || ( GXutil.strcmp(Z15end_logradouro, BC00049_A15end_logradouro[0]) != 0 ) || ( Z16end_numero != BC00049_A16end_numero[0] ) || ( GXutil.strcmp(Z17end_bairro, BC00049_A17end_bairro[0]) != 0 ) || ( Z1cid_id != BC00049_A1cid_id[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"endereco"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert044( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable044( ) ;
      }
      if ( AnyError == 0 )
      {
         zm044( 0) ;
         checkOptimisticConcurrency044( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm044( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert044( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000410 */
                  pr_default.execute(8, new Object[] {A14end_tipo_logradouro, A15end_logradouro, Long.valueOf(A16end_numero), A17end_bairro, Short.valueOf(A1cid_id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor BC000411 */
                  pr_default.execute(9);
                  A13end_id = BC000411_A13end_id[0] ;
                  pr_default.close(9);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("endereco");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load044( ) ;
         }
         endLevel044( ) ;
      }
      closeExtendedTableCursors044( ) ;
   }

   public void update044( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable044( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency044( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm044( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate044( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000412 */
                  pr_default.execute(10, new Object[] {A14end_tipo_logradouro, A15end_logradouro, Long.valueOf(A16end_numero), A17end_bairro, Short.valueOf(A1cid_id), Short.valueOf(A13end_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("endereco");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"endereco"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate044( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel044( ) ;
      }
      closeExtendedTableCursors044( ) ;
   }

   public void deferredUpdate044( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency044( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls044( ) ;
         afterConfirm044( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete044( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000413 */
               pr_default.execute(11, new Object[] {Short.valueOf(A13end_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("endereco");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode4 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel044( ) ;
      Gx_mode = sMode4 ;
   }

   public void onDeleteControls044( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC000414 */
         pr_default.execute(12, new Object[] {Short.valueOf(A1cid_id)});
         A2cid_nome = BC000414_A2cid_nome[0] ;
         A3cid_uf = BC000414_A3cid_uf[0] ;
         pr_default.close(12);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC000415 */
         pr_default.execute(13, new Object[] {Short.valueOf(A13end_id)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"unidade_endereco"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor BC000416 */
         pr_default.execute(14, new Object[] {Short.valueOf(A13end_id)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"pessoa_endereco"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void endLevel044( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete044( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart044( )
   {
      /* Using cursor BC000417 */
      pr_default.execute(15, new Object[] {Short.valueOf(A13end_id)});
      RcdFound4 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A13end_id = BC000417_A13end_id[0] ;
         A14end_tipo_logradouro = BC000417_A14end_tipo_logradouro[0] ;
         A15end_logradouro = BC000417_A15end_logradouro[0] ;
         A16end_numero = BC000417_A16end_numero[0] ;
         A17end_bairro = BC000417_A17end_bairro[0] ;
         A2cid_nome = BC000417_A2cid_nome[0] ;
         A3cid_uf = BC000417_A3cid_uf[0] ;
         A1cid_id = BC000417_A1cid_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext044( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound4 = (short)(0) ;
      scanKeyLoad044( ) ;
   }

   public void scanKeyLoad044( )
   {
      sMode4 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A13end_id = BC000417_A13end_id[0] ;
         A14end_tipo_logradouro = BC000417_A14end_tipo_logradouro[0] ;
         A15end_logradouro = BC000417_A15end_logradouro[0] ;
         A16end_numero = BC000417_A16end_numero[0] ;
         A17end_bairro = BC000417_A17end_bairro[0] ;
         A2cid_nome = BC000417_A2cid_nome[0] ;
         A3cid_uf = BC000417_A3cid_uf[0] ;
         A1cid_id = BC000417_A1cid_id[0] ;
      }
      Gx_mode = sMode4 ;
   }

   public void scanKeyEnd044( )
   {
      pr_default.close(15);
   }

   public void afterConfirm044( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert044( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate044( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete044( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete044( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate044( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes044( )
   {
   }

   public void send_integrity_lvl_hashes044( )
   {
   }

   public void addRow044( )
   {
      VarsToRow4( bcendereco) ;
   }

   public void readRow044( )
   {
      RowToVars4( bcendereco, 1) ;
   }

   public void initializeNonKey044( )
   {
      A14end_tipo_logradouro = "" ;
      A15end_logradouro = "" ;
      A16end_numero = 0 ;
      A17end_bairro = "" ;
      A1cid_id = (short)(0) ;
      A2cid_nome = "" ;
      A3cid_uf = "" ;
      Z14end_tipo_logradouro = "" ;
      Z15end_logradouro = "" ;
      Z16end_numero = 0 ;
      Z17end_bairro = "" ;
      Z1cid_id = (short)(0) ;
   }

   public void initAll044( )
   {
      A13end_id = (short)(0) ;
      initializeNonKey044( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public boolean isIns( )
   {
      return ((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ;
   }

   public boolean isDlt( )
   {
      return ((GXutil.strcmp(Gx_mode, "DLT")==0) ? true : false) ;
   }

   public boolean isUpd( )
   {
      return ((GXutil.strcmp(Gx_mode, "UPD")==0) ? true : false) ;
   }

   public boolean isDsp( )
   {
      return ((GXutil.strcmp(Gx_mode, "DSP")==0) ? true : false) ;
   }

   public void VarsToRow4( Sdtendereco obj4 )
   {
      obj4.setgxTv_Sdtendereco_Mode( Gx_mode );
      obj4.setgxTv_Sdtendereco_End_tipo_logradouro( A14end_tipo_logradouro );
      obj4.setgxTv_Sdtendereco_End_logradouro( A15end_logradouro );
      obj4.setgxTv_Sdtendereco_End_numero( A16end_numero );
      obj4.setgxTv_Sdtendereco_End_bairro( A17end_bairro );
      obj4.setgxTv_Sdtendereco_Cid_id( A1cid_id );
      obj4.setgxTv_Sdtendereco_Cid_nome( A2cid_nome );
      obj4.setgxTv_Sdtendereco_Cid_uf( A3cid_uf );
      obj4.setgxTv_Sdtendereco_End_id( A13end_id );
      obj4.setgxTv_Sdtendereco_End_id_Z( Z13end_id );
      obj4.setgxTv_Sdtendereco_End_tipo_logradouro_Z( Z14end_tipo_logradouro );
      obj4.setgxTv_Sdtendereco_End_logradouro_Z( Z15end_logradouro );
      obj4.setgxTv_Sdtendereco_End_numero_Z( Z16end_numero );
      obj4.setgxTv_Sdtendereco_End_bairro_Z( Z17end_bairro );
      obj4.setgxTv_Sdtendereco_Cid_id_Z( Z1cid_id );
      obj4.setgxTv_Sdtendereco_Cid_nome_Z( Z2cid_nome );
      obj4.setgxTv_Sdtendereco_Cid_uf_Z( Z3cid_uf );
      obj4.setgxTv_Sdtendereco_Mode( Gx_mode );
   }

   public void KeyVarsToRow4( Sdtendereco obj4 )
   {
      obj4.setgxTv_Sdtendereco_End_id( A13end_id );
   }

   public void RowToVars4( Sdtendereco obj4 ,
                           int forceLoad )
   {
      Gx_mode = obj4.getgxTv_Sdtendereco_Mode() ;
      A14end_tipo_logradouro = obj4.getgxTv_Sdtendereco_End_tipo_logradouro() ;
      A15end_logradouro = obj4.getgxTv_Sdtendereco_End_logradouro() ;
      A16end_numero = obj4.getgxTv_Sdtendereco_End_numero() ;
      A17end_bairro = obj4.getgxTv_Sdtendereco_End_bairro() ;
      A1cid_id = obj4.getgxTv_Sdtendereco_Cid_id() ;
      A2cid_nome = obj4.getgxTv_Sdtendereco_Cid_nome() ;
      A3cid_uf = obj4.getgxTv_Sdtendereco_Cid_uf() ;
      A13end_id = obj4.getgxTv_Sdtendereco_End_id() ;
      Z13end_id = obj4.getgxTv_Sdtendereco_End_id_Z() ;
      Z14end_tipo_logradouro = obj4.getgxTv_Sdtendereco_End_tipo_logradouro_Z() ;
      Z15end_logradouro = obj4.getgxTv_Sdtendereco_End_logradouro_Z() ;
      Z16end_numero = obj4.getgxTv_Sdtendereco_End_numero_Z() ;
      Z17end_bairro = obj4.getgxTv_Sdtendereco_End_bairro_Z() ;
      Z1cid_id = obj4.getgxTv_Sdtendereco_Cid_id_Z() ;
      Z2cid_nome = obj4.getgxTv_Sdtendereco_Cid_nome_Z() ;
      Z3cid_uf = obj4.getgxTv_Sdtendereco_Cid_uf_Z() ;
      Gx_mode = obj4.getgxTv_Sdtendereco_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A13end_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey044( ) ;
      scanKeyStart044( ) ;
      if ( RcdFound4 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z13end_id = A13end_id ;
      }
      zm044( -1) ;
      onLoadActions044( ) ;
      addRow044( ) ;
      scanKeyEnd044( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Load( )
   {
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      RowToVars4( bcendereco, 0) ;
      scanKeyStart044( ) ;
      if ( RcdFound4 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z13end_id = A13end_id ;
      }
      zm044( -1) ;
      onLoadActions044( ) ;
      addRow044( ) ;
      scanKeyEnd044( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey044( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert044( ) ;
      }
      else
      {
         if ( RcdFound4 == 1 )
         {
            if ( A13end_id != Z13end_id )
            {
               A13end_id = Z13end_id ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               /* Update record */
               update044( ) ;
            }
         }
         else
         {
            if ( isDlt( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               if ( A13end_id != Z13end_id )
               {
                  if ( isUpd( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert044( ) ;
                  }
               }
               else
               {
                  if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert044( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void Save( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars4( bcendereco, 1) ;
      saveImpl( ) ;
      VarsToRow4( bcendereco) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars4( bcendereco, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert044( ) ;
      afterTrn( ) ;
      VarsToRow4( bcendereco) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
      }
      else
      {
         Sdtendereco auxBC = new Sdtendereco( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A13end_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcendereco);
            auxBC.Save();
         }
         LclMsgLst = auxTrn.GetMessages() ;
         AnyError = (short)(auxTrn.Errors()) ;
         httpContext.GX_msglist = LclMsgLst ;
         if ( auxTrn.Errors() == 0 )
         {
            Gx_mode = auxTrn.GetMode() ;
            afterTrn( ) ;
         }
      }
   }

   public boolean Update( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars4( bcendereco, 1) ;
      updateImpl( ) ;
      VarsToRow4( bcendereco) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public boolean InsertOrUpdate( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars4( bcendereco, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert044( ) ;
      if ( AnyError == 1 )
      {
         if ( GXutil.strcmp(httpContext.GX_msglist.getItemValue((short)(1)), "DuplicatePrimaryKey") == 0 )
         {
            AnyError = (short)(0) ;
            httpContext.GX_msglist.removeAllItems();
            updateImpl( ) ;
         }
      }
      else
      {
         afterTrn( ) ;
      }
      VarsToRow4( bcendereco) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars4( bcendereco, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey044( ) ;
      if ( RcdFound4 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A13end_id != Z13end_id )
         {
            A13end_id = Z13end_id ;
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( isDlt( ) )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            update_check( ) ;
         }
      }
      else
      {
         if ( A13end_id != Z13end_id )
         {
            Gx_mode = "INS" ;
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               Gx_mode = "INS" ;
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "endereco_bc");
      VarsToRow4( bcendereco) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public int Errors( )
   {
      if ( AnyError == 0 )
      {
         return 0 ;
      }
      return 1 ;
   }

   public com.genexus.internet.MsgList GetMessages( )
   {
      return LclMsgLst ;
   }

   public String GetMode( )
   {
      Gx_mode = bcendereco.getgxTv_Sdtendereco_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcendereco.setgxTv_Sdtendereco_Mode( Gx_mode );
   }

   public void SetSDT( Sdtendereco sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcendereco )
      {
         bcendereco = sdt ;
         if ( GXutil.strcmp(bcendereco.getgxTv_Sdtendereco_Mode(), "") == 0 )
         {
            bcendereco.setgxTv_Sdtendereco_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow4( bcendereco) ;
         }
         else
         {
            RowToVars4( bcendereco, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcendereco.getgxTv_Sdtendereco_Mode(), "") == 0 )
         {
            bcendereco.setgxTv_Sdtendereco_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars4( bcendereco, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public Sdtendereco getendereco_BC( )
   {
      return bcendereco ;
   }


   public void webExecute( )
   {
   }

   protected void createObjects( )
   {
   }

   protected void Process( )
   {
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Gx_mode = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z14end_tipo_logradouro = "" ;
      A14end_tipo_logradouro = "" ;
      Z15end_logradouro = "" ;
      A15end_logradouro = "" ;
      Z17end_bairro = "" ;
      A17end_bairro = "" ;
      Z2cid_nome = "" ;
      A2cid_nome = "" ;
      Z3cid_uf = "" ;
      A3cid_uf = "" ;
      BC00045_A13end_id = new short[1] ;
      BC00045_A14end_tipo_logradouro = new String[] {""} ;
      BC00045_A15end_logradouro = new String[] {""} ;
      BC00045_A16end_numero = new long[1] ;
      BC00045_A17end_bairro = new String[] {""} ;
      BC00045_A2cid_nome = new String[] {""} ;
      BC00045_A3cid_uf = new String[] {""} ;
      BC00045_A1cid_id = new short[1] ;
      BC00046_A2cid_nome = new String[] {""} ;
      BC00046_A3cid_uf = new String[] {""} ;
      BC00047_A13end_id = new short[1] ;
      BC00048_A13end_id = new short[1] ;
      BC00048_A14end_tipo_logradouro = new String[] {""} ;
      BC00048_A15end_logradouro = new String[] {""} ;
      BC00048_A16end_numero = new long[1] ;
      BC00048_A17end_bairro = new String[] {""} ;
      BC00048_A1cid_id = new short[1] ;
      sMode4 = "" ;
      BC00049_A13end_id = new short[1] ;
      BC00049_A14end_tipo_logradouro = new String[] {""} ;
      BC00049_A15end_logradouro = new String[] {""} ;
      BC00049_A16end_numero = new long[1] ;
      BC00049_A17end_bairro = new String[] {""} ;
      BC00049_A1cid_id = new short[1] ;
      BC000411_A13end_id = new short[1] ;
      BC000414_A2cid_nome = new String[] {""} ;
      BC000414_A3cid_uf = new String[] {""} ;
      BC000415_A4unid_id = new short[1] ;
      BC000415_A13end_id = new short[1] ;
      BC000416_A7pes_id = new short[1] ;
      BC000416_A13end_id = new short[1] ;
      BC000417_A13end_id = new short[1] ;
      BC000417_A14end_tipo_logradouro = new String[] {""} ;
      BC000417_A15end_logradouro = new String[] {""} ;
      BC000417_A16end_numero = new long[1] ;
      BC000417_A17end_bairro = new String[] {""} ;
      BC000417_A2cid_nome = new String[] {""} ;
      BC000417_A3cid_uf = new String[] {""} ;
      BC000417_A1cid_id = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new endereco_bc__default(),
         new Object[] {
             new Object[] {
            BC00042_A13end_id, BC00042_A14end_tipo_logradouro, BC00042_A15end_logradouro, BC00042_A16end_numero, BC00042_A17end_bairro, BC00042_A1cid_id
            }
            , new Object[] {
            BC00043_A13end_id, BC00043_A14end_tipo_logradouro, BC00043_A15end_logradouro, BC00043_A16end_numero, BC00043_A17end_bairro, BC00043_A1cid_id
            }
            , new Object[] {
            BC00044_A2cid_nome, BC00044_A3cid_uf
            }
            , new Object[] {
            BC00045_A13end_id, BC00045_A14end_tipo_logradouro, BC00045_A15end_logradouro, BC00045_A16end_numero, BC00045_A17end_bairro, BC00045_A2cid_nome, BC00045_A3cid_uf, BC00045_A1cid_id
            }
            , new Object[] {
            BC00046_A2cid_nome, BC00046_A3cid_uf
            }
            , new Object[] {
            BC00047_A13end_id
            }
            , new Object[] {
            BC00048_A13end_id, BC00048_A14end_tipo_logradouro, BC00048_A15end_logradouro, BC00048_A16end_numero, BC00048_A17end_bairro, BC00048_A1cid_id
            }
            , new Object[] {
            BC00049_A13end_id, BC00049_A14end_tipo_logradouro, BC00049_A15end_logradouro, BC00049_A16end_numero, BC00049_A17end_bairro, BC00049_A1cid_id
            }
            , new Object[] {
            }
            , new Object[] {
            BC000411_A13end_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000414_A2cid_nome, BC000414_A3cid_uf
            }
            , new Object[] {
            BC000415_A4unid_id, BC000415_A13end_id
            }
            , new Object[] {
            BC000416_A7pes_id, BC000416_A13end_id
            }
            , new Object[] {
            BC000417_A13end_id, BC000417_A14end_tipo_logradouro, BC000417_A15end_logradouro, BC000417_A16end_numero, BC000417_A17end_bairro, BC000417_A2cid_nome, BC000417_A3cid_uf, BC000417_A1cid_id
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z13end_id ;
   private short A13end_id ;
   private short Z1cid_id ;
   private short A1cid_id ;
   private short RcdFound4 ;
   private short nIsDirty_4 ;
   private int trnEnded ;
   private int GX_JID ;
   private long Z16end_numero ;
   private long A16end_numero ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z3cid_uf ;
   private String A3cid_uf ;
   private String sMode4 ;
   private boolean mustCommit ;
   private String Z14end_tipo_logradouro ;
   private String A14end_tipo_logradouro ;
   private String Z15end_logradouro ;
   private String A15end_logradouro ;
   private String Z17end_bairro ;
   private String A17end_bairro ;
   private String Z2cid_nome ;
   private String A2cid_nome ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private Sdtendereco bcendereco ;
   private IDataStoreProvider pr_default ;
   private short[] BC00045_A13end_id ;
   private String[] BC00045_A14end_tipo_logradouro ;
   private String[] BC00045_A15end_logradouro ;
   private long[] BC00045_A16end_numero ;
   private String[] BC00045_A17end_bairro ;
   private String[] BC00045_A2cid_nome ;
   private String[] BC00045_A3cid_uf ;
   private short[] BC00045_A1cid_id ;
   private String[] BC00046_A2cid_nome ;
   private String[] BC00046_A3cid_uf ;
   private short[] BC00047_A13end_id ;
   private short[] BC00048_A13end_id ;
   private String[] BC00048_A14end_tipo_logradouro ;
   private String[] BC00048_A15end_logradouro ;
   private long[] BC00048_A16end_numero ;
   private String[] BC00048_A17end_bairro ;
   private short[] BC00048_A1cid_id ;
   private short[] BC00049_A13end_id ;
   private String[] BC00049_A14end_tipo_logradouro ;
   private String[] BC00049_A15end_logradouro ;
   private long[] BC00049_A16end_numero ;
   private String[] BC00049_A17end_bairro ;
   private short[] BC00049_A1cid_id ;
   private short[] BC000411_A13end_id ;
   private String[] BC000414_A2cid_nome ;
   private String[] BC000414_A3cid_uf ;
   private short[] BC000415_A4unid_id ;
   private short[] BC000415_A13end_id ;
   private short[] BC000416_A7pes_id ;
   private short[] BC000416_A13end_id ;
   private short[] BC000417_A13end_id ;
   private String[] BC000417_A14end_tipo_logradouro ;
   private String[] BC000417_A15end_logradouro ;
   private long[] BC000417_A16end_numero ;
   private String[] BC000417_A17end_bairro ;
   private String[] BC000417_A2cid_nome ;
   private String[] BC000417_A3cid_uf ;
   private short[] BC000417_A1cid_id ;
   private short[] BC00042_A13end_id ;
   private String[] BC00042_A14end_tipo_logradouro ;
   private String[] BC00042_A15end_logradouro ;
   private long[] BC00042_A16end_numero ;
   private String[] BC00042_A17end_bairro ;
   private short[] BC00042_A1cid_id ;
   private short[] BC00043_A13end_id ;
   private String[] BC00043_A14end_tipo_logradouro ;
   private String[] BC00043_A15end_logradouro ;
   private long[] BC00043_A16end_numero ;
   private String[] BC00043_A17end_bairro ;
   private short[] BC00043_A1cid_id ;
   private String[] BC00044_A2cid_nome ;
   private String[] BC00044_A3cid_uf ;
}

final  class endereco_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00042", "SELECT end_id, end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id FROM endereco WHERE end_id = ?  FOR UPDATE OF endereco",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00043", "SELECT end_id, end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00044", "SELECT cid_nome, cid_uf FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00045", "SELECT TM1.end_id, TM1.end_tipo_logradouro, TM1.end_logradouro, TM1.end_numero, TM1.end_bairro, T2.cid_nome, T2.cid_uf, TM1.cid_id FROM (endereco TM1 INNER JOIN cidade T2 ON T2.cid_id = TM1.cid_id) WHERE TM1.end_id = ? ORDER BY TM1.end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00046", "SELECT cid_nome, cid_uf FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00047", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00048", "SELECT end_id, end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00049", "SELECT end_id, end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id FROM endereco WHERE end_id = ?  FOR UPDATE OF endereco",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000410", "SAVEPOINT gxupdate;INSERT INTO endereco(end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id) VALUES(?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000411", "SELECT currval('end_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000412", "SAVEPOINT gxupdate;UPDATE endereco SET end_tipo_logradouro=?, end_logradouro=?, end_numero=?, end_bairro=?, cid_id=?  WHERE end_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000413", "SAVEPOINT gxupdate;DELETE FROM endereco  WHERE end_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000414", "SELECT cid_nome, cid_uf FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000415", "SELECT unid_id, end_id FROM unidade_endereco WHERE end_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000416", "SELECT pes_id, end_id FROM pessoa_endereco WHERE end_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000417", "SELECT TM1.end_id, TM1.end_tipo_logradouro, TM1.end_logradouro, TM1.end_numero, TM1.end_bairro, T2.cid_nome, T2.cid_uf, TM1.cid_id FROM (endereco TM1 INNER JOIN cidade T2 ON T2.cid_id = TM1.cid_id) WHERE TM1.end_id = ? ORDER BY TM1.end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 4 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setVarchar(4, (String)parms[3], 100, false);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setVarchar(4, (String)parms[3], 100, false);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

