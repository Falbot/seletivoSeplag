import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pessoa_endereco_bc extends GXWebPanel implements IGxSilentTrn
{
   public pessoa_endereco_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public pessoa_endereco_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pessoa_endereco_bc.class ));
   }

   public pessoa_endereco_bc( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0910( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0910( ) ;
      standaloneModal( ) ;
      addRow0910( ) ;
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
            Z7pes_id = A7pes_id ;
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

   public void confirm_090( )
   {
      beforeValidate0910( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls0910( ) ;
         }
         else
         {
            checkExtendedTable0910( ) ;
            if ( AnyError == 0 )
            {
               zm0910( 2) ;
               zm0910( 3) ;
            }
            closeExtendedTableCursors0910( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm0910( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
      }
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
      }
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -1 )
      {
         Z7pes_id = A7pes_id ;
         Z13end_id = A13end_id ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0910( )
   {
      /* Using cursor BC00096 */
      pr_default.execute(4, new Object[] {Short.valueOf(A7pes_id), Short.valueOf(A13end_id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound10 = (short)(1) ;
         zm0910( -1) ;
      }
      pr_default.close(4);
      onLoadActions0910( ) ;
   }

   public void onLoadActions0910( )
   {
   }

   public void checkExtendedTable0910( )
   {
      nIsDirty_10 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC00097 */
      pr_default.execute(5, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(5);
      /* Using cursor BC00098 */
      pr_default.execute(6, new Object[] {Short.valueOf(A13end_id)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'endereco'.", "ForeignKeyNotFound", 1, "END_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
   }

   public void closeExtendedTableCursors0910( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void getKey0910( )
   {
      /* Using cursor BC00099 */
      pr_default.execute(7, new Object[] {Short.valueOf(A7pes_id), Short.valueOf(A13end_id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000910 */
      pr_default.execute(8, new Object[] {Short.valueOf(A7pes_id), Short.valueOf(A13end_id)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         zm0910( 1) ;
         RcdFound10 = (short)(1) ;
         A7pes_id = BC000910_A7pes_id[0] ;
         A13end_id = BC000910_A13end_id[0] ;
         Z7pes_id = A7pes_id ;
         Z13end_id = A13end_id ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0910( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKey0910( ) ;
         }
         Gx_mode = sMode10 ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey0910( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
      }
      pr_default.close(8);
   }

   public void getEqualNoModal( )
   {
      getKey0910( ) ;
      if ( RcdFound10 == 0 )
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
      confirm_090( ) ;
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

   public void checkOptimisticConcurrency0910( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC000911 */
         pr_default.execute(9, new Object[] {Short.valueOf(A7pes_id), Short.valueOf(A13end_id)});
         if ( (pr_default.getStatus(9) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"pessoa_endereco"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(9) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"pessoa_endereco"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0910( )
   {
      beforeValidate0910( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0910( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0910( 0) ;
         checkOptimisticConcurrency0910( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0910( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0910( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000912 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A7pes_id), Short.valueOf(A13end_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("pessoa_endereco");
                  if ( (pr_default.getStatus(10) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
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
            load0910( ) ;
         }
         endLevel0910( ) ;
      }
      closeExtendedTableCursors0910( ) ;
   }

   public void update0910( )
   {
      beforeValidate0910( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0910( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0910( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0910( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0910( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table pessoa_endereco */
                  deferredUpdate0910( ) ;
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
         endLevel0910( ) ;
      }
      closeExtendedTableCursors0910( ) ;
   }

   public void deferredUpdate0910( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0910( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0910( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0910( ) ;
         afterConfirm0910( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0910( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000913 */
               pr_default.execute(11, new Object[] {Short.valueOf(A7pes_id), Short.valueOf(A13end_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("pessoa_endereco");
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
      sMode10 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0910( ) ;
      Gx_mode = sMode10 ;
   }

   public void onDeleteControls0910( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel0910( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(9);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0910( ) ;
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

   public void scanKeyStart0910( )
   {
      /* Using cursor BC000914 */
      pr_default.execute(12, new Object[] {Short.valueOf(A7pes_id), Short.valueOf(A13end_id)});
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A7pes_id = BC000914_A7pes_id[0] ;
         A13end_id = BC000914_A13end_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0910( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound10 = (short)(0) ;
      scanKeyLoad0910( ) ;
   }

   public void scanKeyLoad0910( )
   {
      sMode10 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A7pes_id = BC000914_A7pes_id[0] ;
         A13end_id = BC000914_A13end_id[0] ;
      }
      Gx_mode = sMode10 ;
   }

   public void scanKeyEnd0910( )
   {
      pr_default.close(12);
   }

   public void afterConfirm0910( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0910( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0910( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0910( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0910( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0910( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0910( )
   {
   }

   public void send_integrity_lvl_hashes0910( )
   {
   }

   public void addRow0910( )
   {
      VarsToRow10( bcpessoa_endereco) ;
   }

   public void readRow0910( )
   {
      RowToVars10( bcpessoa_endereco, 1) ;
   }

   public void initializeNonKey0910( )
   {
   }

   public void initAll0910( )
   {
      A7pes_id = (short)(0) ;
      A13end_id = (short)(0) ;
      initializeNonKey0910( ) ;
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

   public void VarsToRow10( Sdtpessoa_endereco obj10 )
   {
      obj10.setgxTv_Sdtpessoa_endereco_Mode( Gx_mode );
      obj10.setgxTv_Sdtpessoa_endereco_Pes_id( A7pes_id );
      obj10.setgxTv_Sdtpessoa_endereco_End_id( A13end_id );
      obj10.setgxTv_Sdtpessoa_endereco_Pes_id_Z( Z7pes_id );
      obj10.setgxTv_Sdtpessoa_endereco_End_id_Z( Z13end_id );
      obj10.setgxTv_Sdtpessoa_endereco_Mode( Gx_mode );
   }

   public void KeyVarsToRow10( Sdtpessoa_endereco obj10 )
   {
      obj10.setgxTv_Sdtpessoa_endereco_Pes_id( A7pes_id );
      obj10.setgxTv_Sdtpessoa_endereco_End_id( A13end_id );
   }

   public void RowToVars10( Sdtpessoa_endereco obj10 ,
                            int forceLoad )
   {
      Gx_mode = obj10.getgxTv_Sdtpessoa_endereco_Mode() ;
      A7pes_id = obj10.getgxTv_Sdtpessoa_endereco_Pes_id() ;
      A13end_id = obj10.getgxTv_Sdtpessoa_endereco_End_id() ;
      Z7pes_id = obj10.getgxTv_Sdtpessoa_endereco_Pes_id_Z() ;
      Z13end_id = obj10.getgxTv_Sdtpessoa_endereco_End_id_Z() ;
      Gx_mode = obj10.getgxTv_Sdtpessoa_endereco_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A7pes_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      A13end_id = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0910( ) ;
      scanKeyStart0910( ) ;
      if ( RcdFound10 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000915 */
         pr_default.execute(13, new Object[] {Short.valueOf(A7pes_id)});
         if ( (pr_default.getStatus(13) == 101) )
         {
            httpContext.GX_msglist.addItem("Não existe 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor BC000916 */
         pr_default.execute(14, new Object[] {Short.valueOf(A13end_id)});
         if ( (pr_default.getStatus(14) == 101) )
         {
            httpContext.GX_msglist.addItem("Não existe 'endereco'.", "ForeignKeyNotFound", 1, "END_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z7pes_id = A7pes_id ;
         Z13end_id = A13end_id ;
      }
      zm0910( -1) ;
      onLoadActions0910( ) ;
      addRow0910( ) ;
      scanKeyEnd0910( ) ;
      if ( RcdFound10 == 0 )
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
      RowToVars10( bcpessoa_endereco, 0) ;
      scanKeyStart0910( ) ;
      if ( RcdFound10 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000917 */
         pr_default.execute(15, new Object[] {Short.valueOf(A7pes_id)});
         if ( (pr_default.getStatus(15) == 101) )
         {
            httpContext.GX_msglist.addItem("Não existe 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor BC000918 */
         pr_default.execute(16, new Object[] {Short.valueOf(A13end_id)});
         if ( (pr_default.getStatus(16) == 101) )
         {
            httpContext.GX_msglist.addItem("Não existe 'endereco'.", "ForeignKeyNotFound", 1, "END_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z7pes_id = A7pes_id ;
         Z13end_id = A13end_id ;
      }
      zm0910( -1) ;
      onLoadActions0910( ) ;
      addRow0910( ) ;
      scanKeyEnd0910( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0910( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert0910( ) ;
      }
      else
      {
         if ( RcdFound10 == 1 )
         {
            if ( ( A7pes_id != Z7pes_id ) || ( A13end_id != Z13end_id ) )
            {
               A7pes_id = Z7pes_id ;
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
               update0910( ) ;
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
               if ( ( A7pes_id != Z7pes_id ) || ( A13end_id != Z13end_id ) )
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
                     insert0910( ) ;
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
                     insert0910( ) ;
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
      RowToVars10( bcpessoa_endereco, 1) ;
      saveImpl( ) ;
      VarsToRow10( bcpessoa_endereco) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars10( bcpessoa_endereco, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert0910( ) ;
      afterTrn( ) ;
      VarsToRow10( bcpessoa_endereco) ;
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
         Sdtpessoa_endereco auxBC = new Sdtpessoa_endereco( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A7pes_id, A13end_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcpessoa_endereco);
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
      RowToVars10( bcpessoa_endereco, 1) ;
      updateImpl( ) ;
      VarsToRow10( bcpessoa_endereco) ;
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
      RowToVars10( bcpessoa_endereco, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert0910( ) ;
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
      VarsToRow10( bcpessoa_endereco) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars10( bcpessoa_endereco, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0910( ) ;
      if ( RcdFound10 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A7pes_id != Z7pes_id ) || ( A13end_id != Z13end_id ) )
         {
            A7pes_id = Z7pes_id ;
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
         if ( ( A7pes_id != Z7pes_id ) || ( A13end_id != Z13end_id ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "pessoa_endereco_bc");
      VarsToRow10( bcpessoa_endereco) ;
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
      Gx_mode = bcpessoa_endereco.getgxTv_Sdtpessoa_endereco_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcpessoa_endereco.setgxTv_Sdtpessoa_endereco_Mode( Gx_mode );
   }

   public void SetSDT( Sdtpessoa_endereco sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcpessoa_endereco )
      {
         bcpessoa_endereco = sdt ;
         if ( GXutil.strcmp(bcpessoa_endereco.getgxTv_Sdtpessoa_endereco_Mode(), "") == 0 )
         {
            bcpessoa_endereco.setgxTv_Sdtpessoa_endereco_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow10( bcpessoa_endereco) ;
         }
         else
         {
            RowToVars10( bcpessoa_endereco, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcpessoa_endereco.getgxTv_Sdtpessoa_endereco_Mode(), "") == 0 )
         {
            bcpessoa_endereco.setgxTv_Sdtpessoa_endereco_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars10( bcpessoa_endereco, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public Sdtpessoa_endereco getpessoa_endereco_BC( )
   {
      return bcpessoa_endereco ;
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
      BC00096_A7pes_id = new short[1] ;
      BC00096_A13end_id = new short[1] ;
      BC00097_A7pes_id = new short[1] ;
      BC00098_A13end_id = new short[1] ;
      BC00099_A7pes_id = new short[1] ;
      BC00099_A13end_id = new short[1] ;
      BC000910_A7pes_id = new short[1] ;
      BC000910_A13end_id = new short[1] ;
      sMode10 = "" ;
      BC000911_A7pes_id = new short[1] ;
      BC000911_A13end_id = new short[1] ;
      BC000914_A7pes_id = new short[1] ;
      BC000914_A13end_id = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000915_A7pes_id = new short[1] ;
      BC000916_A13end_id = new short[1] ;
      BC000917_A7pes_id = new short[1] ;
      BC000918_A13end_id = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new pessoa_endereco_bc__default(),
         new Object[] {
             new Object[] {
            BC00092_A7pes_id, BC00092_A13end_id
            }
            , new Object[] {
            BC00093_A7pes_id, BC00093_A13end_id
            }
            , new Object[] {
            BC00094_A7pes_id
            }
            , new Object[] {
            BC00095_A13end_id
            }
            , new Object[] {
            BC00096_A7pes_id, BC00096_A13end_id
            }
            , new Object[] {
            BC00097_A7pes_id
            }
            , new Object[] {
            BC00098_A13end_id
            }
            , new Object[] {
            BC00099_A7pes_id, BC00099_A13end_id
            }
            , new Object[] {
            BC000910_A7pes_id, BC000910_A13end_id
            }
            , new Object[] {
            BC000911_A7pes_id, BC000911_A13end_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000914_A7pes_id, BC000914_A13end_id
            }
            , new Object[] {
            BC000915_A7pes_id
            }
            , new Object[] {
            BC000916_A13end_id
            }
            , new Object[] {
            BC000917_A7pes_id
            }
            , new Object[] {
            BC000918_A13end_id
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
   private short Z7pes_id ;
   private short A7pes_id ;
   private short Z13end_id ;
   private short A13end_id ;
   private short RcdFound10 ;
   private short nIsDirty_10 ;
   private int trnEnded ;
   private int GX_JID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode10 ;
   private boolean mustCommit ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private Sdtpessoa_endereco bcpessoa_endereco ;
   private IDataStoreProvider pr_default ;
   private short[] BC00096_A7pes_id ;
   private short[] BC00096_A13end_id ;
   private short[] BC00097_A7pes_id ;
   private short[] BC00098_A13end_id ;
   private short[] BC00099_A7pes_id ;
   private short[] BC00099_A13end_id ;
   private short[] BC000910_A7pes_id ;
   private short[] BC000910_A13end_id ;
   private short[] BC000911_A7pes_id ;
   private short[] BC000911_A13end_id ;
   private short[] BC000914_A7pes_id ;
   private short[] BC000914_A13end_id ;
   private short[] BC000915_A7pes_id ;
   private short[] BC000916_A13end_id ;
   private short[] BC000917_A7pes_id ;
   private short[] BC000918_A13end_id ;
   private short[] BC00092_A7pes_id ;
   private short[] BC00092_A13end_id ;
   private short[] BC00093_A7pes_id ;
   private short[] BC00093_A13end_id ;
   private short[] BC00094_A7pes_id ;
   private short[] BC00095_A13end_id ;
}

final  class pessoa_endereco_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00092", "SELECT pes_id, end_id FROM pessoa_endereco WHERE pes_id = ? AND end_id = ?  FOR UPDATE OF pessoa_endereco",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00093", "SELECT pes_id, end_id FROM pessoa_endereco WHERE pes_id = ? AND end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00094", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00095", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00096", "SELECT TM1.pes_id, TM1.end_id FROM pessoa_endereco TM1 WHERE TM1.pes_id = ? and TM1.end_id = ? ORDER BY TM1.pes_id, TM1.end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00097", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00098", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00099", "SELECT pes_id, end_id FROM pessoa_endereco WHERE pes_id = ? AND end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000910", "SELECT pes_id, end_id FROM pessoa_endereco WHERE pes_id = ? AND end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000911", "SELECT pes_id, end_id FROM pessoa_endereco WHERE pes_id = ? AND end_id = ?  FOR UPDATE OF pessoa_endereco",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000912", "SAVEPOINT gxupdate;INSERT INTO pessoa_endereco(pes_id, end_id) VALUES(?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000913", "SAVEPOINT gxupdate;DELETE FROM pessoa_endereco  WHERE pes_id = ? AND end_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000914", "SELECT TM1.pes_id, TM1.end_id FROM pessoa_endereco TM1 WHERE TM1.pes_id = ? and TM1.end_id = ? ORDER BY TM1.pes_id, TM1.end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000915", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000916", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000917", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000918", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 16 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 4 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
            case 16 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

