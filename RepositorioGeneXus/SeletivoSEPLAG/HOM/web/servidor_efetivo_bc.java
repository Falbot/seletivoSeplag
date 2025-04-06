import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class servidor_efetivo_bc extends GXWebPanel implements IGxSilentTrn
{
   public servidor_efetivo_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public servidor_efetivo_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( servidor_efetivo_bc.class ));
   }

   public servidor_efetivo_bc( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0811( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0811( ) ;
      standaloneModal( ) ;
      addRow0811( ) ;
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
            Z26se_matricula = A26se_matricula ;
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

   public void confirm_080( )
   {
      beforeValidate0811( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls0811( ) ;
         }
         else
         {
            checkExtendedTable0811( ) ;
            if ( AnyError == 0 )
            {
               zm0811( 3) ;
            }
            closeExtendedTableCursors0811( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm0811( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
      }
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -1 )
      {
         Z26se_matricula = A26se_matricula ;
         Z7pes_id = A7pes_id ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0811( )
   {
      /* Using cursor BC00085 */
      pr_default.execute(3, new Object[] {Short.valueOf(A7pes_id), A26se_matricula});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound11 = (short)(1) ;
         zm0811( -1) ;
      }
      pr_default.close(3);
      onLoadActions0811( ) ;
   }

   public void onLoadActions0811( )
   {
   }

   public void checkExtendedTable0811( )
   {
      nIsDirty_11 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC00086 */
      pr_default.execute(4, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(4);
      /* Using cursor BC00087 */
      pr_default.execute(5, new Object[] {A26se_matricula, Short.valueOf(A7pes_id), A26se_matricula});
      if ( (pr_default.getStatus(5) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {"se_matricula"}), 1, "");
         AnyError = (short)(1) ;
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors0811( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void getKey0811( )
   {
      /* Using cursor BC00088 */
      pr_default.execute(6, new Object[] {Short.valueOf(A7pes_id), A26se_matricula});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound11 = (short)(1) ;
      }
      else
      {
         RcdFound11 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00089 */
      pr_default.execute(7, new Object[] {Short.valueOf(A7pes_id), A26se_matricula});
      if ( (pr_default.getStatus(7) != 101) )
      {
         zm0811( 1) ;
         RcdFound11 = (short)(1) ;
         A26se_matricula = BC00089_A26se_matricula[0] ;
         A7pes_id = BC00089_A7pes_id[0] ;
         Z7pes_id = A7pes_id ;
         Z26se_matricula = A26se_matricula ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0811( ) ;
         if ( AnyError == 1 )
         {
            RcdFound11 = (short)(0) ;
            initializeNonKey0811( ) ;
         }
         Gx_mode = sMode11 ;
      }
      else
      {
         RcdFound11 = (short)(0) ;
         initializeNonKey0811( ) ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode11 ;
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey0811( ) ;
      if ( RcdFound11 == 0 )
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
      confirm_080( ) ;
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

   public void checkOptimisticConcurrency0811( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC000810 */
         pr_default.execute(8, new Object[] {Short.valueOf(A7pes_id), A26se_matricula});
         if ( (pr_default.getStatus(8) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"servidor_efetivo"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(8) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"servidor_efetivo"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0811( )
   {
      beforeValidate0811( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0811( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0811( 0) ;
         checkOptimisticConcurrency0811( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0811( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0811( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000811 */
                  pr_default.execute(9, new Object[] {A26se_matricula, Short.valueOf(A7pes_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("servidor_efetivo");
                  if ( (pr_default.getStatus(9) == 1) )
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
            load0811( ) ;
         }
         endLevel0811( ) ;
      }
      closeExtendedTableCursors0811( ) ;
   }

   public void update0811( )
   {
      beforeValidate0811( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0811( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0811( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0811( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0811( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table servidor_efetivo */
                  deferredUpdate0811( ) ;
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
         endLevel0811( ) ;
      }
      closeExtendedTableCursors0811( ) ;
   }

   public void deferredUpdate0811( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0811( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0811( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0811( ) ;
         afterConfirm0811( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0811( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000812 */
               pr_default.execute(10, new Object[] {Short.valueOf(A7pes_id), A26se_matricula});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("servidor_efetivo");
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
      sMode11 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0811( ) ;
      Gx_mode = sMode11 ;
   }

   public void onDeleteControls0811( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel0811( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(8);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0811( ) ;
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

   public void scanKeyStart0811( )
   {
      /* Using cursor BC000813 */
      pr_default.execute(11, new Object[] {Short.valueOf(A7pes_id), A26se_matricula});
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A26se_matricula = BC000813_A26se_matricula[0] ;
         A7pes_id = BC000813_A7pes_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0811( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound11 = (short)(0) ;
      scanKeyLoad0811( ) ;
   }

   public void scanKeyLoad0811( )
   {
      sMode11 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A26se_matricula = BC000813_A26se_matricula[0] ;
         A7pes_id = BC000813_A7pes_id[0] ;
      }
      Gx_mode = sMode11 ;
   }

   public void scanKeyEnd0811( )
   {
      pr_default.close(11);
   }

   public void afterConfirm0811( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0811( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0811( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0811( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0811( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0811( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0811( )
   {
   }

   public void send_integrity_lvl_hashes0811( )
   {
   }

   public void addRow0811( )
   {
      VarsToRow11( bcservidor_efetivo) ;
   }

   public void readRow0811( )
   {
      RowToVars11( bcservidor_efetivo, 1) ;
   }

   public void initializeNonKey0811( )
   {
   }

   public void initAll0811( )
   {
      A7pes_id = (short)(0) ;
      A26se_matricula = "" ;
      initializeNonKey0811( ) ;
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

   public void VarsToRow11( Sdtservidor_efetivo obj11 )
   {
      obj11.setgxTv_Sdtservidor_efetivo_Mode( Gx_mode );
      obj11.setgxTv_Sdtservidor_efetivo_Pes_id( A7pes_id );
      obj11.setgxTv_Sdtservidor_efetivo_Se_matricula( A26se_matricula );
      obj11.setgxTv_Sdtservidor_efetivo_Pes_id_Z( Z7pes_id );
      obj11.setgxTv_Sdtservidor_efetivo_Se_matricula_Z( Z26se_matricula );
      obj11.setgxTv_Sdtservidor_efetivo_Mode( Gx_mode );
   }

   public void KeyVarsToRow11( Sdtservidor_efetivo obj11 )
   {
      obj11.setgxTv_Sdtservidor_efetivo_Pes_id( A7pes_id );
      obj11.setgxTv_Sdtservidor_efetivo_Se_matricula( A26se_matricula );
   }

   public void RowToVars11( Sdtservidor_efetivo obj11 ,
                            int forceLoad )
   {
      Gx_mode = obj11.getgxTv_Sdtservidor_efetivo_Mode() ;
      A7pes_id = obj11.getgxTv_Sdtservidor_efetivo_Pes_id() ;
      A26se_matricula = obj11.getgxTv_Sdtservidor_efetivo_Se_matricula() ;
      Z7pes_id = obj11.getgxTv_Sdtservidor_efetivo_Pes_id_Z() ;
      Z26se_matricula = obj11.getgxTv_Sdtservidor_efetivo_Se_matricula_Z() ;
      Gx_mode = obj11.getgxTv_Sdtservidor_efetivo_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A7pes_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      A26se_matricula = (String)getParm(obj,1) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0811( ) ;
      scanKeyStart0811( ) ;
      if ( RcdFound11 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000814 */
         pr_default.execute(12, new Object[] {Short.valueOf(A7pes_id)});
         if ( (pr_default.getStatus(12) == 101) )
         {
            httpContext.GX_msglist.addItem("Não existe 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z7pes_id = A7pes_id ;
         Z26se_matricula = A26se_matricula ;
      }
      zm0811( -1) ;
      onLoadActions0811( ) ;
      addRow0811( ) ;
      scanKeyEnd0811( ) ;
      if ( RcdFound11 == 0 )
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
      RowToVars11( bcservidor_efetivo, 0) ;
      scanKeyStart0811( ) ;
      if ( RcdFound11 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000815 */
         pr_default.execute(13, new Object[] {Short.valueOf(A7pes_id)});
         if ( (pr_default.getStatus(13) == 101) )
         {
            httpContext.GX_msglist.addItem("Não existe 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z7pes_id = A7pes_id ;
         Z26se_matricula = A26se_matricula ;
      }
      zm0811( -1) ;
      onLoadActions0811( ) ;
      addRow0811( ) ;
      scanKeyEnd0811( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0811( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert0811( ) ;
      }
      else
      {
         if ( RcdFound11 == 1 )
         {
            if ( ( A7pes_id != Z7pes_id ) || ( GXutil.strcmp(A26se_matricula, Z26se_matricula) != 0 ) )
            {
               A7pes_id = Z7pes_id ;
               A26se_matricula = Z26se_matricula ;
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
               update0811( ) ;
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
               if ( ( A7pes_id != Z7pes_id ) || ( GXutil.strcmp(A26se_matricula, Z26se_matricula) != 0 ) )
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
                     insert0811( ) ;
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
                     insert0811( ) ;
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
      RowToVars11( bcservidor_efetivo, 1) ;
      saveImpl( ) ;
      VarsToRow11( bcservidor_efetivo) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars11( bcservidor_efetivo, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert0811( ) ;
      afterTrn( ) ;
      VarsToRow11( bcservidor_efetivo) ;
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
         Sdtservidor_efetivo auxBC = new Sdtservidor_efetivo( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A7pes_id, A26se_matricula);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcservidor_efetivo);
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
      RowToVars11( bcservidor_efetivo, 1) ;
      updateImpl( ) ;
      VarsToRow11( bcservidor_efetivo) ;
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
      RowToVars11( bcservidor_efetivo, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert0811( ) ;
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
      VarsToRow11( bcservidor_efetivo) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars11( bcservidor_efetivo, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0811( ) ;
      if ( RcdFound11 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A7pes_id != Z7pes_id ) || ( GXutil.strcmp(A26se_matricula, Z26se_matricula) != 0 ) )
         {
            A7pes_id = Z7pes_id ;
            A26se_matricula = Z26se_matricula ;
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
         if ( ( A7pes_id != Z7pes_id ) || ( GXutil.strcmp(A26se_matricula, Z26se_matricula) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "servidor_efetivo_bc");
      VarsToRow11( bcservidor_efetivo) ;
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
      Gx_mode = bcservidor_efetivo.getgxTv_Sdtservidor_efetivo_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcservidor_efetivo.setgxTv_Sdtservidor_efetivo_Mode( Gx_mode );
   }

   public void SetSDT( Sdtservidor_efetivo sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcservidor_efetivo )
      {
         bcservidor_efetivo = sdt ;
         if ( GXutil.strcmp(bcservidor_efetivo.getgxTv_Sdtservidor_efetivo_Mode(), "") == 0 )
         {
            bcservidor_efetivo.setgxTv_Sdtservidor_efetivo_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow11( bcservidor_efetivo) ;
         }
         else
         {
            RowToVars11( bcservidor_efetivo, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcservidor_efetivo.getgxTv_Sdtservidor_efetivo_Mode(), "") == 0 )
         {
            bcservidor_efetivo.setgxTv_Sdtservidor_efetivo_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars11( bcservidor_efetivo, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public Sdtservidor_efetivo getservidor_efetivo_BC( )
   {
      return bcservidor_efetivo ;
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
      Z26se_matricula = "" ;
      A26se_matricula = "" ;
      BC00085_A26se_matricula = new String[] {""} ;
      BC00085_A7pes_id = new short[1] ;
      BC00086_A7pes_id = new short[1] ;
      BC00087_A26se_matricula = new String[] {""} ;
      BC00088_A7pes_id = new short[1] ;
      BC00088_A26se_matricula = new String[] {""} ;
      BC00089_A26se_matricula = new String[] {""} ;
      BC00089_A7pes_id = new short[1] ;
      sMode11 = "" ;
      BC000810_A26se_matricula = new String[] {""} ;
      BC000810_A7pes_id = new short[1] ;
      BC000813_A26se_matricula = new String[] {""} ;
      BC000813_A7pes_id = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000814_A7pes_id = new short[1] ;
      BC000815_A7pes_id = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new servidor_efetivo_bc__default(),
         new Object[] {
             new Object[] {
            BC00082_A26se_matricula, BC00082_A7pes_id
            }
            , new Object[] {
            BC00083_A26se_matricula, BC00083_A7pes_id
            }
            , new Object[] {
            BC00084_A7pes_id
            }
            , new Object[] {
            BC00085_A26se_matricula, BC00085_A7pes_id
            }
            , new Object[] {
            BC00086_A7pes_id
            }
            , new Object[] {
            BC00087_A26se_matricula
            }
            , new Object[] {
            BC00088_A7pes_id, BC00088_A26se_matricula
            }
            , new Object[] {
            BC00089_A26se_matricula, BC00089_A7pes_id
            }
            , new Object[] {
            BC000810_A26se_matricula, BC000810_A7pes_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000813_A26se_matricula, BC000813_A7pes_id
            }
            , new Object[] {
            BC000814_A7pes_id
            }
            , new Object[] {
            BC000815_A7pes_id
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
   private short RcdFound11 ;
   private short nIsDirty_11 ;
   private int trnEnded ;
   private int GX_JID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode11 ;
   private boolean mustCommit ;
   private String Z26se_matricula ;
   private String A26se_matricula ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private Sdtservidor_efetivo bcservidor_efetivo ;
   private IDataStoreProvider pr_default ;
   private String[] BC00085_A26se_matricula ;
   private short[] BC00085_A7pes_id ;
   private short[] BC00086_A7pes_id ;
   private String[] BC00087_A26se_matricula ;
   private short[] BC00088_A7pes_id ;
   private String[] BC00088_A26se_matricula ;
   private String[] BC00089_A26se_matricula ;
   private short[] BC00089_A7pes_id ;
   private String[] BC000810_A26se_matricula ;
   private short[] BC000810_A7pes_id ;
   private String[] BC000813_A26se_matricula ;
   private short[] BC000813_A7pes_id ;
   private short[] BC000814_A7pes_id ;
   private short[] BC000815_A7pes_id ;
   private String[] BC00082_A26se_matricula ;
   private short[] BC00082_A7pes_id ;
   private String[] BC00083_A26se_matricula ;
   private short[] BC00083_A7pes_id ;
   private short[] BC00084_A7pes_id ;
}

final  class servidor_efetivo_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00082", "SELECT se_matricula, pes_id FROM servidor_efetivo WHERE pes_id = ? AND se_matricula = ?  FOR UPDATE OF servidor_efetivo",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00083", "SELECT se_matricula, pes_id FROM servidor_efetivo WHERE pes_id = ? AND se_matricula = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00084", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00085", "SELECT TM1.se_matricula, TM1.pes_id FROM servidor_efetivo TM1 WHERE TM1.pes_id = ? and TM1.se_matricula = ( ?) ORDER BY TM1.pes_id, TM1.se_matricula ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00086", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00087", "SELECT se_matricula FROM servidor_efetivo WHERE (se_matricula = ?) AND (Not ( pes_id = ? and se_matricula = ( ?))) ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00088", "SELECT pes_id, se_matricula FROM servidor_efetivo WHERE pes_id = ? AND se_matricula = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00089", "SELECT se_matricula, pes_id FROM servidor_efetivo WHERE pes_id = ? AND se_matricula = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000810", "SELECT se_matricula, pes_id FROM servidor_efetivo WHERE pes_id = ? AND se_matricula = ?  FOR UPDATE OF servidor_efetivo",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000811", "SAVEPOINT gxupdate;INSERT INTO servidor_efetivo(se_matricula, pes_id) VALUES(?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000812", "SAVEPOINT gxupdate;DELETE FROM servidor_efetivo  WHERE pes_id = ? AND se_matricula = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000813", "SELECT TM1.se_matricula, TM1.pes_id FROM servidor_efetivo TM1 WHERE TM1.pes_id = ? and TM1.se_matricula = ( ?) ORDER BY TM1.pes_id, TM1.se_matricula ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000814", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000815", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 13 :
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
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 4 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 20, false);
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

