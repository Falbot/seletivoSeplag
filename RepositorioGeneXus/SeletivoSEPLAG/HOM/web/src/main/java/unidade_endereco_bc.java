import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class unidade_endereco_bc extends GXWebProcedure implements IGxSilentTrn
{
   public unidade_endereco_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public unidade_endereco_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( unidade_endereco_bc.class ));
   }

   public unidade_endereco_bc( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0B13( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0B13( ) ;
      standaloneModal( ) ;
      addRow0B13( ) ;
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

   public void confirm_0B0( )
   {
      beforeValidate0B13( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls0B13( ) ;
         }
         else
         {
            checkExtendedTable0B13( ) ;
            if ( AnyError == 0 )
            {
               zm0B13( 2) ;
               zm0B13( 3) ;
            }
            closeExtendedTableCursors0B13( ) ;
         }
      }
      if ( AnyError == 0 )
      {
      }
   }

   public void zm0B13( int GX_JID )
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
         Z4unid_id = A4unid_id ;
         Z13end_id = A13end_id ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0B13( )
   {
      /* Using cursor BC000B6 */
      pr_default.execute(4, new Object[] {Short.valueOf(A4unid_id), Short.valueOf(A13end_id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound13 = (short)(1) ;
         zm0B13( -1) ;
      }
      pr_default.close(4);
      onLoadActions0B13( ) ;
   }

   public void onLoadActions0B13( )
   {
   }

   public void checkExtendedTable0B13( )
   {
      standaloneModal( ) ;
      /* Using cursor BC000B7 */
      pr_default.execute(5, new Object[] {Short.valueOf(A4unid_id)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(5);
      /* Using cursor BC000B8 */
      pr_default.execute(6, new Object[] {Short.valueOf(A13end_id)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'endereco'.", "ForeignKeyNotFound", 1, "END_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
   }

   public void closeExtendedTableCursors0B13( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void getKey0B13( )
   {
      /* Using cursor BC000B9 */
      pr_default.execute(7, new Object[] {Short.valueOf(A4unid_id), Short.valueOf(A13end_id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound13 = (short)(1) ;
      }
      else
      {
         RcdFound13 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000B10 */
      pr_default.execute(8, new Object[] {Short.valueOf(A4unid_id), Short.valueOf(A13end_id)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         zm0B13( 1) ;
         RcdFound13 = (short)(1) ;
         A4unid_id = BC000B10_A4unid_id[0] ;
         A13end_id = BC000B10_A13end_id[0] ;
         Z4unid_id = A4unid_id ;
         Z13end_id = A13end_id ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0B13( ) ;
         if ( AnyError == 1 )
         {
            RcdFound13 = (short)(0) ;
            initializeNonKey0B13( ) ;
         }
         Gx_mode = sMode13 ;
      }
      else
      {
         RcdFound13 = (short)(0) ;
         initializeNonKey0B13( ) ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode13 ;
      }
      pr_default.close(8);
   }

   public void getEqualNoModal( )
   {
      getKey0B13( ) ;
      if ( RcdFound13 == 0 )
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
      confirm_0B0( ) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency0B13( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC000B11 */
         pr_default.execute(9, new Object[] {Short.valueOf(A4unid_id), Short.valueOf(A13end_id)});
         if ( (pr_default.getStatus(9) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"unidade_endereco"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(9) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"unidade_endereco"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0B13( )
   {
      beforeValidate0B13( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0B13( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0B13( 0) ;
         checkOptimisticConcurrency0B13( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0B13( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0B13( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000B12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A4unid_id), Short.valueOf(A13end_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("unidade_endereco");
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
            load0B13( ) ;
         }
         endLevel0B13( ) ;
      }
      closeExtendedTableCursors0B13( ) ;
   }

   public void update0B13( )
   {
      beforeValidate0B13( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0B13( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0B13( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0B13( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0B13( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table unidade_endereco */
                  deferredUpdate0B13( ) ;
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
         endLevel0B13( ) ;
      }
      closeExtendedTableCursors0B13( ) ;
   }

   public void deferredUpdate0B13( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0B13( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0B13( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0B13( ) ;
         afterConfirm0B13( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0B13( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000B13 */
               pr_default.execute(11, new Object[] {Short.valueOf(A4unid_id), Short.valueOf(A13end_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("unidade_endereco");
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
      sMode13 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0B13( ) ;
      Gx_mode = sMode13 ;
   }

   public void onDeleteControls0B13( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel0B13( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(9);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0B13( ) ;
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

   public void scanKeyStart0B13( )
   {
      /* Using cursor BC000B14 */
      pr_default.execute(12, new Object[] {Short.valueOf(A4unid_id), Short.valueOf(A13end_id)});
      RcdFound13 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A4unid_id = BC000B14_A4unid_id[0] ;
         A13end_id = BC000B14_A13end_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0B13( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound13 = (short)(0) ;
      scanKeyLoad0B13( ) ;
   }

   public void scanKeyLoad0B13( )
   {
      sMode13 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A4unid_id = BC000B14_A4unid_id[0] ;
         A13end_id = BC000B14_A13end_id[0] ;
      }
      Gx_mode = sMode13 ;
   }

   public void scanKeyEnd0B13( )
   {
      pr_default.close(12);
   }

   public void afterConfirm0B13( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0B13( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0B13( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0B13( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0B13( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0B13( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0B13( )
   {
   }

   public void send_integrity_lvl_hashes0B13( )
   {
   }

   public void addRow0B13( )
   {
      VarsToRow13( bcunidade_endereco) ;
   }

   public void readRow0B13( )
   {
      RowToVars13( bcunidade_endereco, 1) ;
   }

   public void initializeNonKey0B13( )
   {
   }

   public void initAll0B13( )
   {
      A4unid_id = (short)(0) ;
      A13end_id = (short)(0) ;
      initializeNonKey0B13( ) ;
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

   public void VarsToRow13( Sdtunidade_endereco obj13 )
   {
      obj13.setgxTv_Sdtunidade_endereco_Mode( Gx_mode );
      obj13.setgxTv_Sdtunidade_endereco_Unid_id( A4unid_id );
      obj13.setgxTv_Sdtunidade_endereco_End_id( A13end_id );
      obj13.setgxTv_Sdtunidade_endereco_Unid_id_Z( Z4unid_id );
      obj13.setgxTv_Sdtunidade_endereco_End_id_Z( Z13end_id );
      obj13.setgxTv_Sdtunidade_endereco_Mode( Gx_mode );
   }

   public void KeyVarsToRow13( Sdtunidade_endereco obj13 )
   {
      obj13.setgxTv_Sdtunidade_endereco_Unid_id( A4unid_id );
      obj13.setgxTv_Sdtunidade_endereco_End_id( A13end_id );
   }

   public void RowToVars13( Sdtunidade_endereco obj13 ,
                            int forceLoad )
   {
      Gx_mode = obj13.getgxTv_Sdtunidade_endereco_Mode() ;
      A4unid_id = obj13.getgxTv_Sdtunidade_endereco_Unid_id() ;
      A13end_id = obj13.getgxTv_Sdtunidade_endereco_End_id() ;
      Z4unid_id = obj13.getgxTv_Sdtunidade_endereco_Unid_id_Z() ;
      Z13end_id = obj13.getgxTv_Sdtunidade_endereco_End_id_Z() ;
      Gx_mode = obj13.getgxTv_Sdtunidade_endereco_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A4unid_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      A13end_id = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0B13( ) ;
      scanKeyStart0B13( ) ;
      if ( RcdFound13 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000B15 */
         pr_default.execute(13, new Object[] {Short.valueOf(A4unid_id)});
         if ( (pr_default.getStatus(13) == 101) )
         {
            httpContext.GX_msglist.addItem("Não existe 'unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor BC000B16 */
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
         Z4unid_id = A4unid_id ;
         Z13end_id = A13end_id ;
      }
      zm0B13( -1) ;
      onLoadActions0B13( ) ;
      addRow0B13( ) ;
      scanKeyEnd0B13( ) ;
      if ( RcdFound13 == 0 )
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
      RowToVars13( bcunidade_endereco, 0) ;
      scanKeyStart0B13( ) ;
      if ( RcdFound13 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000B17 */
         pr_default.execute(15, new Object[] {Short.valueOf(A4unid_id)});
         if ( (pr_default.getStatus(15) == 101) )
         {
            httpContext.GX_msglist.addItem("Não existe 'unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor BC000B18 */
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
         Z4unid_id = A4unid_id ;
         Z13end_id = A13end_id ;
      }
      zm0B13( -1) ;
      onLoadActions0B13( ) ;
      addRow0B13( ) ;
      scanKeyEnd0B13( ) ;
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      getKey0B13( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert0B13( ) ;
      }
      else
      {
         if ( RcdFound13 == 1 )
         {
            if ( ( A4unid_id != Z4unid_id ) || ( A13end_id != Z13end_id ) )
            {
               A4unid_id = Z4unid_id ;
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
               update0B13( ) ;
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
               if ( ( A4unid_id != Z4unid_id ) || ( A13end_id != Z13end_id ) )
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
                     insert0B13( ) ;
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
                     insert0B13( ) ;
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
      RowToVars13( bcunidade_endereco, 1) ;
      saveImpl( ) ;
      VarsToRow13( bcunidade_endereco) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars13( bcunidade_endereco, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert0B13( ) ;
      afterTrn( ) ;
      VarsToRow13( bcunidade_endereco) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
         VarsToRow13( bcunidade_endereco) ;
      }
      else
      {
         Sdtunidade_endereco auxBC = new Sdtunidade_endereco( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A4unid_id, A13end_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcunidade_endereco);
            auxBC.Save();
            bcunidade_endereco.copy(auxBC);
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
      RowToVars13( bcunidade_endereco, 1) ;
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
      RowToVars13( bcunidade_endereco, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert0B13( ) ;
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
            VarsToRow13( bcunidade_endereco) ;
         }
      }
      else
      {
         afterTrn( ) ;
         VarsToRow13( bcunidade_endereco) ;
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
      RowToVars13( bcunidade_endereco, 0) ;
      getKey0B13( ) ;
      if ( RcdFound13 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A4unid_id != Z4unid_id ) || ( A13end_id != Z13end_id ) )
         {
            A4unid_id = Z4unid_id ;
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
         if ( ( A4unid_id != Z4unid_id ) || ( A13end_id != Z13end_id ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "unidade_endereco_bc");
      VarsToRow13( bcunidade_endereco) ;
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
      Gx_mode = bcunidade_endereco.getgxTv_Sdtunidade_endereco_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcunidade_endereco.setgxTv_Sdtunidade_endereco_Mode( Gx_mode );
   }

   public void SetSDT( Sdtunidade_endereco sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcunidade_endereco )
      {
         bcunidade_endereco = sdt ;
         if ( GXutil.strcmp(bcunidade_endereco.getgxTv_Sdtunidade_endereco_Mode(), "") == 0 )
         {
            bcunidade_endereco.setgxTv_Sdtunidade_endereco_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow13( bcunidade_endereco) ;
         }
         else
         {
            RowToVars13( bcunidade_endereco, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcunidade_endereco.getgxTv_Sdtunidade_endereco_Mode(), "") == 0 )
         {
            bcunidade_endereco.setgxTv_Sdtunidade_endereco_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars13( bcunidade_endereco, 1) ;
   }

   public void ForceCommitOnExit( )
   {
   }

   public Sdtunidade_endereco getunidade_endereco_BC( )
   {
      return bcunidade_endereco ;
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
      BC000B6_A4unid_id = new short[1] ;
      BC000B6_A13end_id = new short[1] ;
      BC000B7_A4unid_id = new short[1] ;
      BC000B8_A13end_id = new short[1] ;
      BC000B9_A4unid_id = new short[1] ;
      BC000B9_A13end_id = new short[1] ;
      BC000B10_A4unid_id = new short[1] ;
      BC000B10_A13end_id = new short[1] ;
      sMode13 = "" ;
      BC000B11_A4unid_id = new short[1] ;
      BC000B11_A13end_id = new short[1] ;
      BC000B14_A4unid_id = new short[1] ;
      BC000B14_A13end_id = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000B15_A4unid_id = new short[1] ;
      BC000B16_A13end_id = new short[1] ;
      BC000B17_A4unid_id = new short[1] ;
      BC000B18_A13end_id = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new unidade_endereco_bc__default(),
         new Object[] {
             new Object[] {
            BC000B2_A4unid_id, BC000B2_A13end_id
            }
            , new Object[] {
            BC000B3_A4unid_id, BC000B3_A13end_id
            }
            , new Object[] {
            BC000B4_A4unid_id
            }
            , new Object[] {
            BC000B5_A13end_id
            }
            , new Object[] {
            BC000B6_A4unid_id, BC000B6_A13end_id
            }
            , new Object[] {
            BC000B7_A4unid_id
            }
            , new Object[] {
            BC000B8_A13end_id
            }
            , new Object[] {
            BC000B9_A4unid_id, BC000B9_A13end_id
            }
            , new Object[] {
            BC000B10_A4unid_id, BC000B10_A13end_id
            }
            , new Object[] {
            BC000B11_A4unid_id, BC000B11_A13end_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000B14_A4unid_id, BC000B14_A13end_id
            }
            , new Object[] {
            BC000B15_A4unid_id
            }
            , new Object[] {
            BC000B16_A13end_id
            }
            , new Object[] {
            BC000B17_A4unid_id
            }
            , new Object[] {
            BC000B18_A13end_id
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private short AnyError ;
   private short Z4unid_id ;
   private short A4unid_id ;
   private short Z13end_id ;
   private short A13end_id ;
   private short RcdFound13 ;
   private int trnEnded ;
   private int GX_JID ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode13 ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private Sdtunidade_endereco bcunidade_endereco ;
   private IDataStoreProvider pr_default ;
   private short[] BC000B6_A4unid_id ;
   private short[] BC000B6_A13end_id ;
   private short[] BC000B7_A4unid_id ;
   private short[] BC000B8_A13end_id ;
   private short[] BC000B9_A4unid_id ;
   private short[] BC000B9_A13end_id ;
   private short[] BC000B10_A4unid_id ;
   private short[] BC000B10_A13end_id ;
   private short[] BC000B11_A4unid_id ;
   private short[] BC000B11_A13end_id ;
   private short[] BC000B14_A4unid_id ;
   private short[] BC000B14_A13end_id ;
   private short[] BC000B15_A4unid_id ;
   private short[] BC000B16_A13end_id ;
   private short[] BC000B17_A4unid_id ;
   private short[] BC000B18_A13end_id ;
   private short[] BC000B2_A4unid_id ;
   private short[] BC000B2_A13end_id ;
   private short[] BC000B3_A4unid_id ;
   private short[] BC000B3_A13end_id ;
   private short[] BC000B4_A4unid_id ;
   private short[] BC000B5_A13end_id ;
}

final  class unidade_endereco_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000B2", "SELECT unid_id, end_id FROM unidade_endereco WHERE unid_id = ? AND end_id = ?  FOR UPDATE OF unidade_endereco",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B3", "SELECT unid_id, end_id FROM unidade_endereco WHERE unid_id = ? AND end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B4", "SELECT unid_id FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B5", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B6", "SELECT TM1.unid_id, TM1.end_id FROM unidade_endereco TM1 WHERE TM1.unid_id = ? and TM1.end_id = ? ORDER BY TM1.unid_id, TM1.end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B7", "SELECT unid_id FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B8", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B9", "SELECT unid_id, end_id FROM unidade_endereco WHERE unid_id = ? AND end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B10", "SELECT unid_id, end_id FROM unidade_endereco WHERE unid_id = ? AND end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B11", "SELECT unid_id, end_id FROM unidade_endereco WHERE unid_id = ? AND end_id = ?  FOR UPDATE OF unidade_endereco",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000B12", "SAVEPOINT gxupdate;INSERT INTO unidade_endereco(unid_id, end_id) VALUES(?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000B13", "SAVEPOINT gxupdate;DELETE FROM unidade_endereco  WHERE unid_id = ? AND end_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000B14", "SELECT TM1.unid_id, TM1.end_id FROM unidade_endereco TM1 WHERE TM1.unid_id = ? and TM1.end_id = ? ORDER BY TM1.unid_id, TM1.end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B15", "SELECT unid_id FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B16", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B17", "SELECT unid_id FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B18", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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

