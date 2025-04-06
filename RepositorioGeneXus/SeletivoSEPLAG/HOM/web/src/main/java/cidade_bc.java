import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cidade_bc extends GXWebProcedure implements IGxSilentTrn
{
   public cidade_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cidade_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cidade_bc.class ));
   }

   public cidade_bc( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow011( ) ;
      standaloneNotModal( ) ;
      initializeNonKey011( ) ;
      standaloneModal( ) ;
      addRow011( ) ;
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
            Z1cid_id = A1cid_id ;
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

   public void confirm_010( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls011( ) ;
         }
         else
         {
            checkExtendedTable011( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors011( ) ;
         }
      }
      if ( AnyError == 0 )
      {
      }
   }

   public void zm011( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z2cid_nome = A2cid_nome ;
         Z3cid_uf = A3cid_uf ;
      }
      if ( GX_JID == -1 )
      {
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

   public void load011( )
   {
      /* Using cursor BC00014 */
      pr_default.execute(2, new Object[] {Short.valueOf(A1cid_id)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A2cid_nome = BC00014_A2cid_nome[0] ;
         A3cid_uf = BC00014_A3cid_uf[0] ;
         zm011( -1) ;
      }
      pr_default.close(2);
      onLoadActions011( ) ;
   }

   public void onLoadActions011( )
   {
   }

   public void checkExtendedTable011( )
   {
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors011( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey011( )
   {
      /* Using cursor BC00015 */
      pr_default.execute(3, new Object[] {Short.valueOf(A1cid_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1 = (short)(1) ;
      }
      else
      {
         RcdFound1 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00016 */
      pr_default.execute(4, new Object[] {Short.valueOf(A1cid_id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm011( 1) ;
         RcdFound1 = (short)(1) ;
         A1cid_id = BC00016_A1cid_id[0] ;
         A2cid_nome = BC00016_A2cid_nome[0] ;
         A3cid_uf = BC00016_A3cid_uf[0] ;
         Z1cid_id = A1cid_id ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load011( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1 = (short)(0) ;
            initializeNonKey011( ) ;
         }
         Gx_mode = sMode1 ;
      }
      else
      {
         RcdFound1 = (short)(0) ;
         initializeNonKey011( ) ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode1 ;
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey011( ) ;
      if ( RcdFound1 == 0 )
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
      confirm_010( ) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency011( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00017 */
         pr_default.execute(5, new Object[] {Short.valueOf(A1cid_id)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"cidade"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z2cid_nome, BC00017_A2cid_nome[0]) != 0 ) || ( GXutil.strcmp(Z3cid_uf, BC00017_A3cid_uf[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"cidade"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert011( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable011( ) ;
      }
      if ( AnyError == 0 )
      {
         zm011( 0) ;
         checkOptimisticConcurrency011( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm011( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert011( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00018 */
                  pr_default.execute(6, new Object[] {A2cid_nome, A3cid_uf});
                  /* Retrieving last key number assigned */
                  /* Using cursor BC00019 */
                  pr_default.execute(7);
                  A1cid_id = BC00019_A1cid_id[0] ;
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("cidade");
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
            load011( ) ;
         }
         endLevel011( ) ;
      }
      closeExtendedTableCursors011( ) ;
   }

   public void update011( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable011( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency011( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm011( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate011( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000110 */
                  pr_default.execute(8, new Object[] {A2cid_nome, A3cid_uf, Short.valueOf(A1cid_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("cidade");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"cidade"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate011( ) ;
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
         endLevel011( ) ;
      }
      closeExtendedTableCursors011( ) ;
   }

   public void deferredUpdate011( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency011( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls011( ) ;
         afterConfirm011( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete011( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000111 */
               pr_default.execute(9, new Object[] {Short.valueOf(A1cid_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("cidade");
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
      sMode1 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel011( ) ;
      Gx_mode = sMode1 ;
   }

   public void onDeleteControls011( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor BC000112 */
         pr_default.execute(10, new Object[] {Short.valueOf(A1cid_id)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"endereco"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel011( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete011( ) ;
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
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart011( )
   {
      /* Using cursor BC000113 */
      pr_default.execute(11, new Object[] {Short.valueOf(A1cid_id)});
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1cid_id = BC000113_A1cid_id[0] ;
         A2cid_nome = BC000113_A2cid_nome[0] ;
         A3cid_uf = BC000113_A3cid_uf[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext011( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1 = (short)(0) ;
      scanKeyLoad011( ) ;
   }

   public void scanKeyLoad011( )
   {
      sMode1 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1cid_id = BC000113_A1cid_id[0] ;
         A2cid_nome = BC000113_A2cid_nome[0] ;
         A3cid_uf = BC000113_A3cid_uf[0] ;
      }
      Gx_mode = sMode1 ;
   }

   public void scanKeyEnd011( )
   {
      pr_default.close(11);
   }

   public void afterConfirm011( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert011( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate011( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete011( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete011( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate011( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes011( )
   {
   }

   public void send_integrity_lvl_hashes011( )
   {
   }

   public void addRow011( )
   {
      VarsToRow1( bccidade) ;
   }

   public void readRow011( )
   {
      RowToVars1( bccidade, 1) ;
   }

   public void initializeNonKey011( )
   {
      A2cid_nome = "" ;
      A3cid_uf = "" ;
      Z2cid_nome = "" ;
      Z3cid_uf = "" ;
   }

   public void initAll011( )
   {
      A1cid_id = (short)(0) ;
      initializeNonKey011( ) ;
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

   public void VarsToRow1( Sdtcidade obj1 )
   {
      obj1.setgxTv_Sdtcidade_Mode( Gx_mode );
      obj1.setgxTv_Sdtcidade_Cid_nome( A2cid_nome );
      obj1.setgxTv_Sdtcidade_Cid_uf( A3cid_uf );
      obj1.setgxTv_Sdtcidade_Cid_id( A1cid_id );
      obj1.setgxTv_Sdtcidade_Cid_id_Z( Z1cid_id );
      obj1.setgxTv_Sdtcidade_Cid_nome_Z( Z2cid_nome );
      obj1.setgxTv_Sdtcidade_Cid_uf_Z( Z3cid_uf );
      obj1.setgxTv_Sdtcidade_Mode( Gx_mode );
   }

   public void KeyVarsToRow1( Sdtcidade obj1 )
   {
      obj1.setgxTv_Sdtcidade_Cid_id( A1cid_id );
   }

   public void RowToVars1( Sdtcidade obj1 ,
                           int forceLoad )
   {
      Gx_mode = obj1.getgxTv_Sdtcidade_Mode() ;
      A2cid_nome = obj1.getgxTv_Sdtcidade_Cid_nome() ;
      A3cid_uf = obj1.getgxTv_Sdtcidade_Cid_uf() ;
      A1cid_id = obj1.getgxTv_Sdtcidade_Cid_id() ;
      Z1cid_id = obj1.getgxTv_Sdtcidade_Cid_id_Z() ;
      Z2cid_nome = obj1.getgxTv_Sdtcidade_Cid_nome_Z() ;
      Z3cid_uf = obj1.getgxTv_Sdtcidade_Cid_uf_Z() ;
      Gx_mode = obj1.getgxTv_Sdtcidade_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A1cid_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey011( ) ;
      scanKeyStart011( ) ;
      if ( RcdFound1 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z1cid_id = A1cid_id ;
      }
      zm011( -1) ;
      onLoadActions011( ) ;
      addRow011( ) ;
      scanKeyEnd011( ) ;
      if ( RcdFound1 == 0 )
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
      RowToVars1( bccidade, 0) ;
      scanKeyStart011( ) ;
      if ( RcdFound1 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z1cid_id = A1cid_id ;
      }
      zm011( -1) ;
      onLoadActions011( ) ;
      addRow011( ) ;
      scanKeyEnd011( ) ;
      if ( RcdFound1 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      getKey011( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert011( ) ;
      }
      else
      {
         if ( RcdFound1 == 1 )
         {
            if ( A1cid_id != Z1cid_id )
            {
               A1cid_id = Z1cid_id ;
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
               update011( ) ;
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
               if ( A1cid_id != Z1cid_id )
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
                     insert011( ) ;
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
                     insert011( ) ;
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
      RowToVars1( bccidade, 1) ;
      saveImpl( ) ;
      VarsToRow1( bccidade) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1( bccidade, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert011( ) ;
      afterTrn( ) ;
      VarsToRow1( bccidade) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
         VarsToRow1( bccidade) ;
      }
      else
      {
         Sdtcidade auxBC = new Sdtcidade( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A1cid_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bccidade);
            auxBC.Save();
            bccidade.copy(auxBC);
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
      RowToVars1( bccidade, 1) ;
      updateImpl( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public boolean InsertOrUpdate( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1( bccidade, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert011( ) ;
      if ( AnyError == 1 )
      {
         if ( GXutil.strcmp(httpContext.GX_msglist.getItemValue((short)(1)), "DuplicatePrimaryKey") == 0 )
         {
            AnyError = (short)(0) ;
            httpContext.GX_msglist.removeAllItems();
            updateImpl( ) ;
         }
         else
         {
            VarsToRow1( bccidade) ;
         }
      }
      else
      {
         afterTrn( ) ;
         VarsToRow1( bccidade) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1( bccidade, 0) ;
      getKey011( ) ;
      if ( RcdFound1 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A1cid_id != Z1cid_id )
         {
            A1cid_id = Z1cid_id ;
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
         if ( A1cid_id != Z1cid_id )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "cidade_bc");
      VarsToRow1( bccidade) ;
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
      Gx_mode = bccidade.getgxTv_Sdtcidade_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bccidade.setgxTv_Sdtcidade_Mode( Gx_mode );
   }

   public void SetSDT( Sdtcidade sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bccidade )
      {
         bccidade = sdt ;
         if ( GXutil.strcmp(bccidade.getgxTv_Sdtcidade_Mode(), "") == 0 )
         {
            bccidade.setgxTv_Sdtcidade_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow1( bccidade) ;
         }
         else
         {
            RowToVars1( bccidade, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bccidade.getgxTv_Sdtcidade_Mode(), "") == 0 )
         {
            bccidade.setgxTv_Sdtcidade_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars1( bccidade, 1) ;
   }

   public void ForceCommitOnExit( )
   {
   }

   public Sdtcidade getcidade_BC( )
   {
      return bccidade ;
   }


   public void webExecute( )
   {
   }

   public boolean isMasterPage( )
   {
      return false;
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
      Gx_mode = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z2cid_nome = "" ;
      A2cid_nome = "" ;
      Z3cid_uf = "" ;
      A3cid_uf = "" ;
      BC00014_A1cid_id = new short[1] ;
      BC00014_A2cid_nome = new String[] {""} ;
      BC00014_A3cid_uf = new String[] {""} ;
      BC00015_A1cid_id = new short[1] ;
      BC00016_A1cid_id = new short[1] ;
      BC00016_A2cid_nome = new String[] {""} ;
      BC00016_A3cid_uf = new String[] {""} ;
      sMode1 = "" ;
      BC00017_A1cid_id = new short[1] ;
      BC00017_A2cid_nome = new String[] {""} ;
      BC00017_A3cid_uf = new String[] {""} ;
      BC00019_A1cid_id = new short[1] ;
      BC000112_A13end_id = new short[1] ;
      BC000113_A1cid_id = new short[1] ;
      BC000113_A2cid_nome = new String[] {""} ;
      BC000113_A3cid_uf = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new cidade_bc__default(),
         new Object[] {
             new Object[] {
            BC00012_A1cid_id, BC00012_A2cid_nome, BC00012_A3cid_uf
            }
            , new Object[] {
            BC00013_A1cid_id, BC00013_A2cid_nome, BC00013_A3cid_uf
            }
            , new Object[] {
            BC00014_A1cid_id, BC00014_A2cid_nome, BC00014_A3cid_uf
            }
            , new Object[] {
            BC00015_A1cid_id
            }
            , new Object[] {
            BC00016_A1cid_id, BC00016_A2cid_nome, BC00016_A3cid_uf
            }
            , new Object[] {
            BC00017_A1cid_id, BC00017_A2cid_nome, BC00017_A3cid_uf
            }
            , new Object[] {
            }
            , new Object[] {
            BC00019_A1cid_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000112_A13end_id
            }
            , new Object[] {
            BC000113_A1cid_id, BC000113_A2cid_nome, BC000113_A3cid_uf
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private short AnyError ;
   private short Z1cid_id ;
   private short A1cid_id ;
   private short RcdFound1 ;
   private int trnEnded ;
   private int GX_JID ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z3cid_uf ;
   private String A3cid_uf ;
   private String sMode1 ;
   private String Z2cid_nome ;
   private String A2cid_nome ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private Sdtcidade bccidade ;
   private IDataStoreProvider pr_default ;
   private short[] BC00014_A1cid_id ;
   private String[] BC00014_A2cid_nome ;
   private String[] BC00014_A3cid_uf ;
   private short[] BC00015_A1cid_id ;
   private short[] BC00016_A1cid_id ;
   private String[] BC00016_A2cid_nome ;
   private String[] BC00016_A3cid_uf ;
   private short[] BC00017_A1cid_id ;
   private String[] BC00017_A2cid_nome ;
   private String[] BC00017_A3cid_uf ;
   private short[] BC00019_A1cid_id ;
   private short[] BC000112_A13end_id ;
   private short[] BC000113_A1cid_id ;
   private String[] BC000113_A2cid_nome ;
   private String[] BC000113_A3cid_uf ;
   private short[] BC00012_A1cid_id ;
   private String[] BC00012_A2cid_nome ;
   private String[] BC00012_A3cid_uf ;
   private short[] BC00013_A1cid_id ;
   private String[] BC00013_A2cid_nome ;
   private String[] BC00013_A3cid_uf ;
}

final  class cidade_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00012", "SELECT cid_id, cid_nome, cid_uf FROM cidade WHERE cid_id = ?  FOR UPDATE OF cidade",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00013", "SELECT cid_id, cid_nome, cid_uf FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00014", "SELECT TM1.cid_id, TM1.cid_nome, TM1.cid_uf FROM cidade TM1 WHERE TM1.cid_id = ? ORDER BY TM1.cid_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00015", "SELECT cid_id FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00016", "SELECT cid_id, cid_nome, cid_uf FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00017", "SELECT cid_id, cid_nome, cid_uf FROM cidade WHERE cid_id = ?  FOR UPDATE OF cidade",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC00018", "SAVEPOINT gxupdate;INSERT INTO cidade(cid_nome, cid_uf) VALUES(?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC00019", "SELECT currval('cid_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000110", "SAVEPOINT gxupdate;UPDATE cidade SET cid_nome=?, cid_uf=?  WHERE cid_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000111", "SAVEPOINT gxupdate;DELETE FROM cidade  WHERE cid_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000112", "SELECT end_id FROM endereco WHERE cid_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000113", "SELECT TM1.cid_id, TM1.cid_nome, TM1.cid_uf FROM cidade TM1 WHERE TM1.cid_id = ? ORDER BY TM1.cid_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
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
               stmt.setVarchar(1, (String)parms[0], 200, false);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 200, false);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

