import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class servidor_temporario_bc extends GXWebPanel implements IGxSilentTrn
{
   public servidor_temporario_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public servidor_temporario_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( servidor_temporario_bc.class ));
   }

   public servidor_temporario_bc( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0A12( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0A12( ) ;
      standaloneModal( ) ;
      addRow0A12( ) ;
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
            Z32st_data_admissao = A32st_data_admissao ;
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

   public void confirm_0A0( )
   {
      beforeValidate0A12( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls0A12( ) ;
         }
         else
         {
            checkExtendedTable0A12( ) ;
            if ( AnyError == 0 )
            {
               zm0A12( 2) ;
            }
            closeExtendedTableCursors0A12( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm0A12( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z33st_data_demissao = A33st_data_demissao ;
      }
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -1 )
      {
         Z32st_data_admissao = A32st_data_admissao ;
         Z33st_data_demissao = A33st_data_demissao ;
         Z7pes_id = A7pes_id ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0A12( )
   {
      /* Using cursor BC000A5 */
      pr_default.execute(3, new Object[] {Short.valueOf(A7pes_id), A32st_data_admissao});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A33st_data_demissao = BC000A5_A33st_data_demissao[0] ;
         zm0A12( -1) ;
      }
      pr_default.close(3);
      onLoadActions0A12( ) ;
   }

   public void onLoadActions0A12( )
   {
   }

   public void checkExtendedTable0A12( )
   {
      nIsDirty_12 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC000A6 */
      pr_default.execute(4, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursors0A12( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void getKey0A12( )
   {
      /* Using cursor BC000A7 */
      pr_default.execute(5, new Object[] {Short.valueOf(A7pes_id), A32st_data_admissao});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000A8 */
      pr_default.execute(6, new Object[] {Short.valueOf(A7pes_id), A32st_data_admissao});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm0A12( 1) ;
         RcdFound12 = (short)(1) ;
         A32st_data_admissao = BC000A8_A32st_data_admissao[0] ;
         A33st_data_demissao = BC000A8_A33st_data_demissao[0] ;
         A7pes_id = BC000A8_A7pes_id[0] ;
         Z7pes_id = A7pes_id ;
         Z32st_data_admissao = A32st_data_admissao ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0A12( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey0A12( ) ;
         }
         Gx_mode = sMode12 ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey0A12( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey0A12( ) ;
      if ( RcdFound12 == 0 )
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
      confirm_0A0( ) ;
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

   public void checkOptimisticConcurrency0A12( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC000A9 */
         pr_default.execute(7, new Object[] {Short.valueOf(A7pes_id), A32st_data_admissao});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"servidor_temporario"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z33st_data_demissao), GXutil.resetTime(BC000A9_A33st_data_demissao[0])) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"servidor_temporario"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0A12( )
   {
      beforeValidate0A12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0A12( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0A12( 0) ;
         checkOptimisticConcurrency0A12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0A12( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0A12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000A10 */
                  pr_default.execute(8, new Object[] {A32st_data_admissao, A33st_data_demissao, Short.valueOf(A7pes_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("servidor_temporario");
                  if ( (pr_default.getStatus(8) == 1) )
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
            load0A12( ) ;
         }
         endLevel0A12( ) ;
      }
      closeExtendedTableCursors0A12( ) ;
   }

   public void update0A12( )
   {
      beforeValidate0A12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0A12( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0A12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0A12( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0A12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000A11 */
                  pr_default.execute(9, new Object[] {A33st_data_demissao, Short.valueOf(A7pes_id), A32st_data_admissao});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("servidor_temporario");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"servidor_temporario"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0A12( ) ;
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
         endLevel0A12( ) ;
      }
      closeExtendedTableCursors0A12( ) ;
   }

   public void deferredUpdate0A12( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0A12( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0A12( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0A12( ) ;
         afterConfirm0A12( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0A12( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000A12 */
               pr_default.execute(10, new Object[] {Short.valueOf(A7pes_id), A32st_data_admissao});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("servidor_temporario");
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0A12( ) ;
      Gx_mode = sMode12 ;
   }

   public void onDeleteControls0A12( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel0A12( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0A12( ) ;
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

   public void scanKeyStart0A12( )
   {
      /* Using cursor BC000A13 */
      pr_default.execute(11, new Object[] {Short.valueOf(A7pes_id), A32st_data_admissao});
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A32st_data_admissao = BC000A13_A32st_data_admissao[0] ;
         A33st_data_demissao = BC000A13_A33st_data_demissao[0] ;
         A7pes_id = BC000A13_A7pes_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0A12( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound12 = (short)(0) ;
      scanKeyLoad0A12( ) ;
   }

   public void scanKeyLoad0A12( )
   {
      sMode12 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A32st_data_admissao = BC000A13_A32st_data_admissao[0] ;
         A33st_data_demissao = BC000A13_A33st_data_demissao[0] ;
         A7pes_id = BC000A13_A7pes_id[0] ;
      }
      Gx_mode = sMode12 ;
   }

   public void scanKeyEnd0A12( )
   {
      pr_default.close(11);
   }

   public void afterConfirm0A12( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0A12( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0A12( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0A12( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0A12( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0A12( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0A12( )
   {
   }

   public void send_integrity_lvl_hashes0A12( )
   {
   }

   public void addRow0A12( )
   {
      VarsToRow12( bcservidor_temporario) ;
   }

   public void readRow0A12( )
   {
      RowToVars12( bcservidor_temporario, 1) ;
   }

   public void initializeNonKey0A12( )
   {
      A33st_data_demissao = GXutil.nullDate() ;
      Z33st_data_demissao = GXutil.nullDate() ;
   }

   public void initAll0A12( )
   {
      A7pes_id = (short)(0) ;
      A32st_data_admissao = GXutil.nullDate() ;
      initializeNonKey0A12( ) ;
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

   public void VarsToRow12( Sdtservidor_temporario obj12 )
   {
      obj12.setgxTv_Sdtservidor_temporario_Mode( Gx_mode );
      obj12.setgxTv_Sdtservidor_temporario_St_data_demissao( A33st_data_demissao );
      obj12.setgxTv_Sdtservidor_temporario_Pes_id( A7pes_id );
      obj12.setgxTv_Sdtservidor_temporario_St_data_admissao( A32st_data_admissao );
      obj12.setgxTv_Sdtservidor_temporario_Pes_id_Z( Z7pes_id );
      obj12.setgxTv_Sdtservidor_temporario_St_data_admissao_Z( Z32st_data_admissao );
      obj12.setgxTv_Sdtservidor_temporario_St_data_demissao_Z( Z33st_data_demissao );
      obj12.setgxTv_Sdtservidor_temporario_Mode( Gx_mode );
   }

   public void KeyVarsToRow12( Sdtservidor_temporario obj12 )
   {
      obj12.setgxTv_Sdtservidor_temporario_Pes_id( A7pes_id );
      obj12.setgxTv_Sdtservidor_temporario_St_data_admissao( A32st_data_admissao );
   }

   public void RowToVars12( Sdtservidor_temporario obj12 ,
                            int forceLoad )
   {
      Gx_mode = obj12.getgxTv_Sdtservidor_temporario_Mode() ;
      A33st_data_demissao = obj12.getgxTv_Sdtservidor_temporario_St_data_demissao() ;
      A7pes_id = obj12.getgxTv_Sdtservidor_temporario_Pes_id() ;
      A32st_data_admissao = obj12.getgxTv_Sdtservidor_temporario_St_data_admissao() ;
      Z7pes_id = obj12.getgxTv_Sdtservidor_temporario_Pes_id_Z() ;
      Z32st_data_admissao = obj12.getgxTv_Sdtservidor_temporario_St_data_admissao_Z() ;
      Z33st_data_demissao = obj12.getgxTv_Sdtservidor_temporario_St_data_demissao_Z() ;
      Gx_mode = obj12.getgxTv_Sdtservidor_temporario_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A7pes_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      A32st_data_admissao = (java.util.Date)getParm(obj,1) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0A12( ) ;
      scanKeyStart0A12( ) ;
      if ( RcdFound12 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000A14 */
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
         Z32st_data_admissao = A32st_data_admissao ;
      }
      zm0A12( -1) ;
      onLoadActions0A12( ) ;
      addRow0A12( ) ;
      scanKeyEnd0A12( ) ;
      if ( RcdFound12 == 0 )
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
      RowToVars12( bcservidor_temporario, 0) ;
      scanKeyStart0A12( ) ;
      if ( RcdFound12 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000A15 */
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
         Z32st_data_admissao = A32st_data_admissao ;
      }
      zm0A12( -1) ;
      onLoadActions0A12( ) ;
      addRow0A12( ) ;
      scanKeyEnd0A12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0A12( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert0A12( ) ;
      }
      else
      {
         if ( RcdFound12 == 1 )
         {
            if ( ( A7pes_id != Z7pes_id ) || !( GXutil.dateCompare(GXutil.resetTime(A32st_data_admissao), GXutil.resetTime(Z32st_data_admissao)) ) )
            {
               A7pes_id = Z7pes_id ;
               A32st_data_admissao = Z32st_data_admissao ;
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
               update0A12( ) ;
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
               if ( ( A7pes_id != Z7pes_id ) || !( GXutil.dateCompare(GXutil.resetTime(A32st_data_admissao), GXutil.resetTime(Z32st_data_admissao)) ) )
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
                     insert0A12( ) ;
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
                     insert0A12( ) ;
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
      RowToVars12( bcservidor_temporario, 1) ;
      saveImpl( ) ;
      VarsToRow12( bcservidor_temporario) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars12( bcservidor_temporario, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert0A12( ) ;
      afterTrn( ) ;
      VarsToRow12( bcservidor_temporario) ;
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
         Sdtservidor_temporario auxBC = new Sdtservidor_temporario( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A7pes_id, A32st_data_admissao);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcservidor_temporario);
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
      RowToVars12( bcservidor_temporario, 1) ;
      updateImpl( ) ;
      VarsToRow12( bcservidor_temporario) ;
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
      RowToVars12( bcservidor_temporario, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert0A12( ) ;
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
      VarsToRow12( bcservidor_temporario) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars12( bcservidor_temporario, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0A12( ) ;
      if ( RcdFound12 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A7pes_id != Z7pes_id ) || !( GXutil.dateCompare(GXutil.resetTime(A32st_data_admissao), GXutil.resetTime(Z32st_data_admissao)) ) )
         {
            A7pes_id = Z7pes_id ;
            A32st_data_admissao = Z32st_data_admissao ;
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
         if ( ( A7pes_id != Z7pes_id ) || !( GXutil.dateCompare(GXutil.resetTime(A32st_data_admissao), GXutil.resetTime(Z32st_data_admissao)) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "servidor_temporario_bc");
      VarsToRow12( bcservidor_temporario) ;
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
      Gx_mode = bcservidor_temporario.getgxTv_Sdtservidor_temporario_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcservidor_temporario.setgxTv_Sdtservidor_temporario_Mode( Gx_mode );
   }

   public void SetSDT( Sdtservidor_temporario sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcservidor_temporario )
      {
         bcservidor_temporario = sdt ;
         if ( GXutil.strcmp(bcservidor_temporario.getgxTv_Sdtservidor_temporario_Mode(), "") == 0 )
         {
            bcservidor_temporario.setgxTv_Sdtservidor_temporario_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow12( bcservidor_temporario) ;
         }
         else
         {
            RowToVars12( bcservidor_temporario, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcservidor_temporario.getgxTv_Sdtservidor_temporario_Mode(), "") == 0 )
         {
            bcservidor_temporario.setgxTv_Sdtservidor_temporario_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars12( bcservidor_temporario, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public Sdtservidor_temporario getservidor_temporario_BC( )
   {
      return bcservidor_temporario ;
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
      Z32st_data_admissao = GXutil.nullDate() ;
      A32st_data_admissao = GXutil.nullDate() ;
      Z33st_data_demissao = GXutil.nullDate() ;
      A33st_data_demissao = GXutil.nullDate() ;
      BC000A5_A32st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A5_A33st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A5_A7pes_id = new short[1] ;
      BC000A6_A7pes_id = new short[1] ;
      BC000A7_A7pes_id = new short[1] ;
      BC000A7_A32st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A8_A32st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A8_A33st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A8_A7pes_id = new short[1] ;
      sMode12 = "" ;
      BC000A9_A32st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A9_A33st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A9_A7pes_id = new short[1] ;
      BC000A13_A32st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A13_A33st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A13_A7pes_id = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000A14_A7pes_id = new short[1] ;
      BC000A15_A7pes_id = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new servidor_temporario_bc__default(),
         new Object[] {
             new Object[] {
            BC000A2_A32st_data_admissao, BC000A2_A33st_data_demissao, BC000A2_A7pes_id
            }
            , new Object[] {
            BC000A3_A32st_data_admissao, BC000A3_A33st_data_demissao, BC000A3_A7pes_id
            }
            , new Object[] {
            BC000A4_A7pes_id
            }
            , new Object[] {
            BC000A5_A32st_data_admissao, BC000A5_A33st_data_demissao, BC000A5_A7pes_id
            }
            , new Object[] {
            BC000A6_A7pes_id
            }
            , new Object[] {
            BC000A7_A7pes_id, BC000A7_A32st_data_admissao
            }
            , new Object[] {
            BC000A8_A32st_data_admissao, BC000A8_A33st_data_demissao, BC000A8_A7pes_id
            }
            , new Object[] {
            BC000A9_A32st_data_admissao, BC000A9_A33st_data_demissao, BC000A9_A7pes_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000A13_A32st_data_admissao, BC000A13_A33st_data_demissao, BC000A13_A7pes_id
            }
            , new Object[] {
            BC000A14_A7pes_id
            }
            , new Object[] {
            BC000A15_A7pes_id
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
   private short RcdFound12 ;
   private short nIsDirty_12 ;
   private int trnEnded ;
   private int GX_JID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode12 ;
   private java.util.Date Z32st_data_admissao ;
   private java.util.Date A32st_data_admissao ;
   private java.util.Date Z33st_data_demissao ;
   private java.util.Date A33st_data_demissao ;
   private boolean mustCommit ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private Sdtservidor_temporario bcservidor_temporario ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] BC000A5_A32st_data_admissao ;
   private java.util.Date[] BC000A5_A33st_data_demissao ;
   private short[] BC000A5_A7pes_id ;
   private short[] BC000A6_A7pes_id ;
   private short[] BC000A7_A7pes_id ;
   private java.util.Date[] BC000A7_A32st_data_admissao ;
   private java.util.Date[] BC000A8_A32st_data_admissao ;
   private java.util.Date[] BC000A8_A33st_data_demissao ;
   private short[] BC000A8_A7pes_id ;
   private java.util.Date[] BC000A9_A32st_data_admissao ;
   private java.util.Date[] BC000A9_A33st_data_demissao ;
   private short[] BC000A9_A7pes_id ;
   private java.util.Date[] BC000A13_A32st_data_admissao ;
   private java.util.Date[] BC000A13_A33st_data_demissao ;
   private short[] BC000A13_A7pes_id ;
   private short[] BC000A14_A7pes_id ;
   private short[] BC000A15_A7pes_id ;
   private java.util.Date[] BC000A2_A32st_data_admissao ;
   private java.util.Date[] BC000A2_A33st_data_demissao ;
   private short[] BC000A2_A7pes_id ;
   private java.util.Date[] BC000A3_A32st_data_admissao ;
   private java.util.Date[] BC000A3_A33st_data_demissao ;
   private short[] BC000A3_A7pes_id ;
   private short[] BC000A4_A7pes_id ;
}

final  class servidor_temporario_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000A2", "SELECT st_data_admissao, st_data_demissao, pes_id FROM servidor_temporario WHERE pes_id = ? AND st_data_admissao = ?  FOR UPDATE OF servidor_temporario",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A3", "SELECT st_data_admissao, st_data_demissao, pes_id FROM servidor_temporario WHERE pes_id = ? AND st_data_admissao = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A4", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A5", "SELECT TM1.st_data_admissao, TM1.st_data_demissao, TM1.pes_id FROM servidor_temporario TM1 WHERE TM1.pes_id = ? and TM1.st_data_admissao = ? ORDER BY TM1.pes_id, TM1.st_data_admissao ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A6", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A7", "SELECT pes_id, st_data_admissao FROM servidor_temporario WHERE pes_id = ? AND st_data_admissao = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A8", "SELECT st_data_admissao, st_data_demissao, pes_id FROM servidor_temporario WHERE pes_id = ? AND st_data_admissao = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A9", "SELECT st_data_admissao, st_data_demissao, pes_id FROM servidor_temporario WHERE pes_id = ? AND st_data_admissao = ?  FOR UPDATE OF servidor_temporario",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000A10", "SAVEPOINT gxupdate;INSERT INTO servidor_temporario(st_data_admissao, st_data_demissao, pes_id) VALUES(?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000A11", "SAVEPOINT gxupdate;UPDATE servidor_temporario SET st_data_demissao=?  WHERE pes_id = ? AND st_data_admissao = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000A12", "SAVEPOINT gxupdate;DELETE FROM servidor_temporario  WHERE pes_id = ? AND st_data_admissao = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000A13", "SELECT TM1.st_data_admissao, TM1.st_data_demissao, TM1.pes_id FROM servidor_temporario TM1 WHERE TM1.pes_id = ? and TM1.st_data_admissao = ? ORDER BY TM1.pes_id, TM1.st_data_admissao ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A14", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000A15", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               return;
            case 6 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 4 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 8 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
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

