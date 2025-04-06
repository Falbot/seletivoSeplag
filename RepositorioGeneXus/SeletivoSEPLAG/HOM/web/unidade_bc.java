import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class unidade_bc extends GXWebPanel implements IGxSilentTrn
{
   public unidade_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public unidade_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( unidade_bc.class ));
   }

   public unidade_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow022( ) ;
      standaloneNotModal( ) ;
      initializeNonKey022( ) ;
      standaloneModal( ) ;
      addRow022( ) ;
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
            Z4unid_id = A4unid_id ;
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

   public void confirm_020( )
   {
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls022( ) ;
         }
         else
         {
            checkExtendedTable022( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors022( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm022( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z5unid_nome = A5unid_nome ;
         Z6unid_sigla = A6unid_sigla ;
      }
      if ( GX_JID == -1 )
      {
         Z4unid_id = A4unid_id ;
         Z5unid_nome = A5unid_nome ;
         Z6unid_sigla = A6unid_sigla ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load022( )
   {
      /* Using cursor BC00024 */
      pr_default.execute(2, new Object[] {Short.valueOf(A4unid_id)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A5unid_nome = BC00024_A5unid_nome[0] ;
         A6unid_sigla = BC00024_A6unid_sigla[0] ;
         zm022( -1) ;
      }
      pr_default.close(2);
      onLoadActions022( ) ;
   }

   public void onLoadActions022( )
   {
   }

   public void checkExtendedTable022( )
   {
      nIsDirty_2 = (short)(0) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors022( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey022( )
   {
      /* Using cursor BC00025 */
      pr_default.execute(3, new Object[] {Short.valueOf(A4unid_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound2 = (short)(1) ;
      }
      else
      {
         RcdFound2 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00026 */
      pr_default.execute(4, new Object[] {Short.valueOf(A4unid_id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm022( 1) ;
         RcdFound2 = (short)(1) ;
         A4unid_id = BC00026_A4unid_id[0] ;
         A5unid_nome = BC00026_A5unid_nome[0] ;
         A6unid_sigla = BC00026_A6unid_sigla[0] ;
         Z4unid_id = A4unid_id ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load022( ) ;
         if ( AnyError == 1 )
         {
            RcdFound2 = (short)(0) ;
            initializeNonKey022( ) ;
         }
         Gx_mode = sMode2 ;
      }
      else
      {
         RcdFound2 = (short)(0) ;
         initializeNonKey022( ) ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode2 ;
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey022( ) ;
      if ( RcdFound2 == 0 )
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
      confirm_020( ) ;
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

   public void checkOptimisticConcurrency022( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00027 */
         pr_default.execute(5, new Object[] {Short.valueOf(A4unid_id)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"unidade"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z5unid_nome, BC00027_A5unid_nome[0]) != 0 ) || ( GXutil.strcmp(Z6unid_sigla, BC00027_A6unid_sigla[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"unidade"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert022( )
   {
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable022( ) ;
      }
      if ( AnyError == 0 )
      {
         zm022( 0) ;
         checkOptimisticConcurrency022( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm022( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert022( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00028 */
                  pr_default.execute(6, new Object[] {A5unid_nome, A6unid_sigla});
                  /* Retrieving last key number assigned */
                  /* Using cursor BC00029 */
                  pr_default.execute(7);
                  A4unid_id = BC00029_A4unid_id[0] ;
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("unidade");
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
            load022( ) ;
         }
         endLevel022( ) ;
      }
      closeExtendedTableCursors022( ) ;
   }

   public void update022( )
   {
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable022( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency022( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm022( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate022( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000210 */
                  pr_default.execute(8, new Object[] {A5unid_nome, A6unid_sigla, Short.valueOf(A4unid_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("unidade");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"unidade"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate022( ) ;
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
         endLevel022( ) ;
      }
      closeExtendedTableCursors022( ) ;
   }

   public void deferredUpdate022( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency022( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls022( ) ;
         afterConfirm022( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete022( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000211 */
               pr_default.execute(9, new Object[] {Short.valueOf(A4unid_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("unidade");
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
      sMode2 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel022( ) ;
      Gx_mode = sMode2 ;
   }

   public void onDeleteControls022( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor BC000212 */
         pr_default.execute(10, new Object[] {Short.valueOf(A4unid_id)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"lotacao"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor BC000213 */
         pr_default.execute(11, new Object[] {Short.valueOf(A4unid_id)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"unidade_endereco"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
   }

   public void endLevel022( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete022( ) ;
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

   public void scanKeyStart022( )
   {
      /* Using cursor BC000214 */
      pr_default.execute(12, new Object[] {Short.valueOf(A4unid_id)});
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A4unid_id = BC000214_A4unid_id[0] ;
         A5unid_nome = BC000214_A5unid_nome[0] ;
         A6unid_sigla = BC000214_A6unid_sigla[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext022( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound2 = (short)(0) ;
      scanKeyLoad022( ) ;
   }

   public void scanKeyLoad022( )
   {
      sMode2 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A4unid_id = BC000214_A4unid_id[0] ;
         A5unid_nome = BC000214_A5unid_nome[0] ;
         A6unid_sigla = BC000214_A6unid_sigla[0] ;
      }
      Gx_mode = sMode2 ;
   }

   public void scanKeyEnd022( )
   {
      pr_default.close(12);
   }

   public void afterConfirm022( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert022( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate022( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete022( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete022( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate022( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes022( )
   {
   }

   public void send_integrity_lvl_hashes022( )
   {
   }

   public void addRow022( )
   {
      VarsToRow2( bcunidade) ;
   }

   public void readRow022( )
   {
      RowToVars2( bcunidade, 1) ;
   }

   public void initializeNonKey022( )
   {
      A5unid_nome = "" ;
      A6unid_sigla = "" ;
      Z5unid_nome = "" ;
      Z6unid_sigla = "" ;
   }

   public void initAll022( )
   {
      A4unid_id = (short)(0) ;
      initializeNonKey022( ) ;
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

   public void VarsToRow2( Sdtunidade obj2 )
   {
      obj2.setgxTv_Sdtunidade_Mode( Gx_mode );
      obj2.setgxTv_Sdtunidade_Unid_nome( A5unid_nome );
      obj2.setgxTv_Sdtunidade_Unid_sigla( A6unid_sigla );
      obj2.setgxTv_Sdtunidade_Unid_id( A4unid_id );
      obj2.setgxTv_Sdtunidade_Unid_id_Z( Z4unid_id );
      obj2.setgxTv_Sdtunidade_Unid_nome_Z( Z5unid_nome );
      obj2.setgxTv_Sdtunidade_Unid_sigla_Z( Z6unid_sigla );
      obj2.setgxTv_Sdtunidade_Mode( Gx_mode );
   }

   public void KeyVarsToRow2( Sdtunidade obj2 )
   {
      obj2.setgxTv_Sdtunidade_Unid_id( A4unid_id );
   }

   public void RowToVars2( Sdtunidade obj2 ,
                           int forceLoad )
   {
      Gx_mode = obj2.getgxTv_Sdtunidade_Mode() ;
      A5unid_nome = obj2.getgxTv_Sdtunidade_Unid_nome() ;
      A6unid_sigla = obj2.getgxTv_Sdtunidade_Unid_sigla() ;
      A4unid_id = obj2.getgxTv_Sdtunidade_Unid_id() ;
      Z4unid_id = obj2.getgxTv_Sdtunidade_Unid_id_Z() ;
      Z5unid_nome = obj2.getgxTv_Sdtunidade_Unid_nome_Z() ;
      Z6unid_sigla = obj2.getgxTv_Sdtunidade_Unid_sigla_Z() ;
      Gx_mode = obj2.getgxTv_Sdtunidade_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A4unid_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey022( ) ;
      scanKeyStart022( ) ;
      if ( RcdFound2 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z4unid_id = A4unid_id ;
      }
      zm022( -1) ;
      onLoadActions022( ) ;
      addRow022( ) ;
      scanKeyEnd022( ) ;
      if ( RcdFound2 == 0 )
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
      RowToVars2( bcunidade, 0) ;
      scanKeyStart022( ) ;
      if ( RcdFound2 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z4unid_id = A4unid_id ;
      }
      zm022( -1) ;
      onLoadActions022( ) ;
      addRow022( ) ;
      scanKeyEnd022( ) ;
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey022( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert022( ) ;
      }
      else
      {
         if ( RcdFound2 == 1 )
         {
            if ( A4unid_id != Z4unid_id )
            {
               A4unid_id = Z4unid_id ;
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
               update022( ) ;
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
               if ( A4unid_id != Z4unid_id )
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
                     insert022( ) ;
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
                     insert022( ) ;
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
      RowToVars2( bcunidade, 1) ;
      saveImpl( ) ;
      VarsToRow2( bcunidade) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars2( bcunidade, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert022( ) ;
      afterTrn( ) ;
      VarsToRow2( bcunidade) ;
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
         Sdtunidade auxBC = new Sdtunidade( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A4unid_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcunidade);
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
      RowToVars2( bcunidade, 1) ;
      updateImpl( ) ;
      VarsToRow2( bcunidade) ;
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
      RowToVars2( bcunidade, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert022( ) ;
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
      VarsToRow2( bcunidade) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars2( bcunidade, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey022( ) ;
      if ( RcdFound2 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A4unid_id != Z4unid_id )
         {
            A4unid_id = Z4unid_id ;
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
         if ( A4unid_id != Z4unid_id )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "unidade_bc");
      VarsToRow2( bcunidade) ;
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
      Gx_mode = bcunidade.getgxTv_Sdtunidade_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcunidade.setgxTv_Sdtunidade_Mode( Gx_mode );
   }

   public void SetSDT( Sdtunidade sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcunidade )
      {
         bcunidade = sdt ;
         if ( GXutil.strcmp(bcunidade.getgxTv_Sdtunidade_Mode(), "") == 0 )
         {
            bcunidade.setgxTv_Sdtunidade_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow2( bcunidade) ;
         }
         else
         {
            RowToVars2( bcunidade, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcunidade.getgxTv_Sdtunidade_Mode(), "") == 0 )
         {
            bcunidade.setgxTv_Sdtunidade_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars2( bcunidade, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public Sdtunidade getunidade_BC( )
   {
      return bcunidade ;
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
      Z5unid_nome = "" ;
      A5unid_nome = "" ;
      Z6unid_sigla = "" ;
      A6unid_sigla = "" ;
      BC00024_A4unid_id = new short[1] ;
      BC00024_A5unid_nome = new String[] {""} ;
      BC00024_A6unid_sigla = new String[] {""} ;
      BC00025_A4unid_id = new short[1] ;
      BC00026_A4unid_id = new short[1] ;
      BC00026_A5unid_nome = new String[] {""} ;
      BC00026_A6unid_sigla = new String[] {""} ;
      sMode2 = "" ;
      BC00027_A4unid_id = new short[1] ;
      BC00027_A5unid_nome = new String[] {""} ;
      BC00027_A6unid_sigla = new String[] {""} ;
      BC00029_A4unid_id = new short[1] ;
      BC000212_A22lot_id = new short[1] ;
      BC000213_A4unid_id = new short[1] ;
      BC000213_A13end_id = new short[1] ;
      BC000214_A4unid_id = new short[1] ;
      BC000214_A5unid_nome = new String[] {""} ;
      BC000214_A6unid_sigla = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new unidade_bc__default(),
         new Object[] {
             new Object[] {
            BC00022_A4unid_id, BC00022_A5unid_nome, BC00022_A6unid_sigla
            }
            , new Object[] {
            BC00023_A4unid_id, BC00023_A5unid_nome, BC00023_A6unid_sigla
            }
            , new Object[] {
            BC00024_A4unid_id, BC00024_A5unid_nome, BC00024_A6unid_sigla
            }
            , new Object[] {
            BC00025_A4unid_id
            }
            , new Object[] {
            BC00026_A4unid_id, BC00026_A5unid_nome, BC00026_A6unid_sigla
            }
            , new Object[] {
            BC00027_A4unid_id, BC00027_A5unid_nome, BC00027_A6unid_sigla
            }
            , new Object[] {
            }
            , new Object[] {
            BC00029_A4unid_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000212_A22lot_id
            }
            , new Object[] {
            BC000213_A4unid_id, BC000213_A13end_id
            }
            , new Object[] {
            BC000214_A4unid_id, BC000214_A5unid_nome, BC000214_A6unid_sigla
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
   private short Z4unid_id ;
   private short A4unid_id ;
   private short RcdFound2 ;
   private short nIsDirty_2 ;
   private int trnEnded ;
   private int GX_JID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode2 ;
   private boolean mustCommit ;
   private String Z5unid_nome ;
   private String A5unid_nome ;
   private String Z6unid_sigla ;
   private String A6unid_sigla ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private Sdtunidade bcunidade ;
   private IDataStoreProvider pr_default ;
   private short[] BC00024_A4unid_id ;
   private String[] BC00024_A5unid_nome ;
   private String[] BC00024_A6unid_sigla ;
   private short[] BC00025_A4unid_id ;
   private short[] BC00026_A4unid_id ;
   private String[] BC00026_A5unid_nome ;
   private String[] BC00026_A6unid_sigla ;
   private short[] BC00027_A4unid_id ;
   private String[] BC00027_A5unid_nome ;
   private String[] BC00027_A6unid_sigla ;
   private short[] BC00029_A4unid_id ;
   private short[] BC000212_A22lot_id ;
   private short[] BC000213_A4unid_id ;
   private short[] BC000213_A13end_id ;
   private short[] BC000214_A4unid_id ;
   private String[] BC000214_A5unid_nome ;
   private String[] BC000214_A6unid_sigla ;
   private short[] BC00022_A4unid_id ;
   private String[] BC00022_A5unid_nome ;
   private String[] BC00022_A6unid_sigla ;
   private short[] BC00023_A4unid_id ;
   private String[] BC00023_A5unid_nome ;
   private String[] BC00023_A6unid_sigla ;
}

final  class unidade_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00022", "SELECT unid_id, unid_nome, unid_sigla FROM unidade WHERE unid_id = ?  FOR UPDATE OF unidade",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00023", "SELECT unid_id, unid_nome, unid_sigla FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00024", "SELECT TM1.unid_id, TM1.unid_nome, TM1.unid_sigla FROM unidade TM1 WHERE TM1.unid_id = ? ORDER BY TM1.unid_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00025", "SELECT unid_id FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00026", "SELECT unid_id, unid_nome, unid_sigla FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00027", "SELECT unid_id, unid_nome, unid_sigla FROM unidade WHERE unid_id = ?  FOR UPDATE OF unidade",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC00028", "SAVEPOINT gxupdate;INSERT INTO unidade(unid_nome, unid_sigla) VALUES(?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC00029", "SELECT currval('unid_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000210", "SAVEPOINT gxupdate;UPDATE unidade SET unid_nome=?, unid_sigla=?  WHERE unid_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000211", "SAVEPOINT gxupdate;DELETE FROM unidade  WHERE unid_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000212", "SELECT lot_id FROM lotacao WHERE unid_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000213", "SELECT unid_id, end_id FROM unidade_endereco WHERE unid_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000214", "SELECT TM1.unid_id, TM1.unid_nome, TM1.unid_sigla FROM unidade TM1 WHERE TM1.unid_id = ? ORDER BY TM1.unid_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
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
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 200, false);
               stmt.setVarchar(2, (String)parms[1], 20, false);
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
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

