import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class foto_pessoa_bc extends GXWebPanel implements IGxSilentTrn
{
   public foto_pessoa_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public foto_pessoa_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( foto_pessoa_bc.class ));
   }

   public foto_pessoa_bc( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow055( ) ;
      standaloneNotModal( ) ;
      initializeNonKey055( ) ;
      standaloneModal( ) ;
      addRow055( ) ;
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
            Z18fp_id = A18fp_id ;
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

   public void confirm_050( )
   {
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls055( ) ;
         }
         else
         {
            checkExtendedTable055( ) ;
            if ( AnyError == 0 )
            {
               zm055( 3) ;
            }
            closeExtendedTableCursors055( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm055( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         Z19fp_data = A19fp_data ;
         Z20fp_bucket = A20fp_bucket ;
         Z21fp_hash = A21fp_hash ;
         Z7pes_id = A7pes_id ;
      }
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         Z8pes_nome = A8pes_nome ;
         Z9pes_data_nascimento = A9pes_data_nascimento ;
      }
      if ( GX_JID == -2 )
      {
         Z18fp_id = A18fp_id ;
         Z19fp_data = A19fp_data ;
         Z20fp_bucket = A20fp_bucket ;
         Z21fp_hash = A21fp_hash ;
         Z7pes_id = A7pes_id ;
         Z8pes_nome = A8pes_nome ;
         Z9pes_data_nascimento = A9pes_data_nascimento ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A19fp_data)) && ( Gx_BScreen == 0 ) )
      {
         A19fp_data = GXutil.serverDate( context, remoteHandle, pr_default) ;
      }
   }

   public void load055( )
   {
      /* Using cursor BC00055 */
      pr_default.execute(3, new Object[] {Short.valueOf(A18fp_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A8pes_nome = BC00055_A8pes_nome[0] ;
         A9pes_data_nascimento = BC00055_A9pes_data_nascimento[0] ;
         A19fp_data = BC00055_A19fp_data[0] ;
         A20fp_bucket = BC00055_A20fp_bucket[0] ;
         A21fp_hash = BC00055_A21fp_hash[0] ;
         A7pes_id = BC00055_A7pes_id[0] ;
         zm055( -2) ;
      }
      pr_default.close(3);
      onLoadActions055( ) ;
   }

   public void onLoadActions055( )
   {
   }

   public void checkExtendedTable055( )
   {
      nIsDirty_5 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC00056 */
      pr_default.execute(4, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
      }
      A8pes_nome = BC00056_A8pes_nome[0] ;
      A9pes_data_nascimento = BC00056_A9pes_data_nascimento[0] ;
      pr_default.close(4);
   }

   public void closeExtendedTableCursors055( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void getKey055( )
   {
      /* Using cursor BC00057 */
      pr_default.execute(5, new Object[] {Short.valueOf(A18fp_id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound5 = (short)(1) ;
      }
      else
      {
         RcdFound5 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00058 */
      pr_default.execute(6, new Object[] {Short.valueOf(A18fp_id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm055( 2) ;
         RcdFound5 = (short)(1) ;
         A18fp_id = BC00058_A18fp_id[0] ;
         A19fp_data = BC00058_A19fp_data[0] ;
         A20fp_bucket = BC00058_A20fp_bucket[0] ;
         A21fp_hash = BC00058_A21fp_hash[0] ;
         A7pes_id = BC00058_A7pes_id[0] ;
         Z18fp_id = A18fp_id ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load055( ) ;
         if ( AnyError == 1 )
         {
            RcdFound5 = (short)(0) ;
            initializeNonKey055( ) ;
         }
         Gx_mode = sMode5 ;
      }
      else
      {
         RcdFound5 = (short)(0) ;
         initializeNonKey055( ) ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode5 ;
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey055( ) ;
      if ( RcdFound5 == 0 )
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
      confirm_050( ) ;
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

   public void checkOptimisticConcurrency055( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00059 */
         pr_default.execute(7, new Object[] {Short.valueOf(A18fp_id)});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"foto_pessoa"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z19fp_data), GXutil.resetTime(BC00059_A19fp_data[0])) ) || ( GXutil.strcmp(Z20fp_bucket, BC00059_A20fp_bucket[0]) != 0 ) || ( GXutil.strcmp(Z21fp_hash, BC00059_A21fp_hash[0]) != 0 ) || ( Z7pes_id != BC00059_A7pes_id[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"foto_pessoa"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert055( )
   {
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable055( ) ;
      }
      if ( AnyError == 0 )
      {
         zm055( 0) ;
         checkOptimisticConcurrency055( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm055( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert055( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000510 */
                  pr_default.execute(8, new Object[] {A19fp_data, A20fp_bucket, A21fp_hash, Short.valueOf(A7pes_id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor BC000511 */
                  pr_default.execute(9);
                  A18fp_id = BC000511_A18fp_id[0] ;
                  pr_default.close(9);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("foto_pessoa");
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
            load055( ) ;
         }
         endLevel055( ) ;
      }
      closeExtendedTableCursors055( ) ;
   }

   public void update055( )
   {
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable055( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency055( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm055( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate055( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000512 */
                  pr_default.execute(10, new Object[] {A19fp_data, A20fp_bucket, A21fp_hash, Short.valueOf(A7pes_id), Short.valueOf(A18fp_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("foto_pessoa");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"foto_pessoa"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate055( ) ;
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
         endLevel055( ) ;
      }
      closeExtendedTableCursors055( ) ;
   }

   public void deferredUpdate055( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate055( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency055( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls055( ) ;
         afterConfirm055( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete055( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000513 */
               pr_default.execute(11, new Object[] {Short.valueOf(A18fp_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("foto_pessoa");
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
      sMode5 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel055( ) ;
      Gx_mode = sMode5 ;
   }

   public void onDeleteControls055( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC000514 */
         pr_default.execute(12, new Object[] {Short.valueOf(A7pes_id)});
         A8pes_nome = BC000514_A8pes_nome[0] ;
         A9pes_data_nascimento = BC000514_A9pes_data_nascimento[0] ;
         pr_default.close(12);
      }
   }

   public void endLevel055( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete055( ) ;
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

   public void scanKeyStart055( )
   {
      /* Using cursor BC000515 */
      pr_default.execute(13, new Object[] {Short.valueOf(A18fp_id)});
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A18fp_id = BC000515_A18fp_id[0] ;
         A8pes_nome = BC000515_A8pes_nome[0] ;
         A9pes_data_nascimento = BC000515_A9pes_data_nascimento[0] ;
         A19fp_data = BC000515_A19fp_data[0] ;
         A20fp_bucket = BC000515_A20fp_bucket[0] ;
         A21fp_hash = BC000515_A21fp_hash[0] ;
         A7pes_id = BC000515_A7pes_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext055( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound5 = (short)(0) ;
      scanKeyLoad055( ) ;
   }

   public void scanKeyLoad055( )
   {
      sMode5 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A18fp_id = BC000515_A18fp_id[0] ;
         A8pes_nome = BC000515_A8pes_nome[0] ;
         A9pes_data_nascimento = BC000515_A9pes_data_nascimento[0] ;
         A19fp_data = BC000515_A19fp_data[0] ;
         A20fp_bucket = BC000515_A20fp_bucket[0] ;
         A21fp_hash = BC000515_A21fp_hash[0] ;
         A7pes_id = BC000515_A7pes_id[0] ;
      }
      Gx_mode = sMode5 ;
   }

   public void scanKeyEnd055( )
   {
      pr_default.close(13);
   }

   public void afterConfirm055( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert055( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate055( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete055( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete055( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate055( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes055( )
   {
   }

   public void send_integrity_lvl_hashes055( )
   {
   }

   public void addRow055( )
   {
      VarsToRow5( bcfoto_pessoa) ;
   }

   public void readRow055( )
   {
      RowToVars5( bcfoto_pessoa, 1) ;
   }

   public void initializeNonKey055( )
   {
      A7pes_id = (short)(0) ;
      A8pes_nome = "" ;
      A9pes_data_nascimento = GXutil.nullDate() ;
      A20fp_bucket = "" ;
      A21fp_hash = "" ;
      A19fp_data = GXutil.serverDate( context, remoteHandle, pr_default) ;
      Z19fp_data = GXutil.nullDate() ;
      Z20fp_bucket = "" ;
      Z21fp_hash = "" ;
      Z7pes_id = (short)(0) ;
   }

   public void initAll055( )
   {
      A18fp_id = (short)(0) ;
      initializeNonKey055( ) ;
   }

   public void standaloneModalInsert( )
   {
      A19fp_data = i19fp_data ;
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

   public void VarsToRow5( Sdtfoto_pessoa obj5 )
   {
      obj5.setgxTv_Sdtfoto_pessoa_Mode( Gx_mode );
      obj5.setgxTv_Sdtfoto_pessoa_Pes_id( A7pes_id );
      obj5.setgxTv_Sdtfoto_pessoa_Pes_nome( A8pes_nome );
      obj5.setgxTv_Sdtfoto_pessoa_Pes_data_nascimento( A9pes_data_nascimento );
      obj5.setgxTv_Sdtfoto_pessoa_Fp_bucket( A20fp_bucket );
      obj5.setgxTv_Sdtfoto_pessoa_Fp_hash( A21fp_hash );
      obj5.setgxTv_Sdtfoto_pessoa_Fp_data( A19fp_data );
      obj5.setgxTv_Sdtfoto_pessoa_Fp_id( A18fp_id );
      obj5.setgxTv_Sdtfoto_pessoa_Fp_id_Z( Z18fp_id );
      obj5.setgxTv_Sdtfoto_pessoa_Pes_id_Z( Z7pes_id );
      obj5.setgxTv_Sdtfoto_pessoa_Pes_nome_Z( Z8pes_nome );
      obj5.setgxTv_Sdtfoto_pessoa_Pes_data_nascimento_Z( Z9pes_data_nascimento );
      obj5.setgxTv_Sdtfoto_pessoa_Fp_data_Z( Z19fp_data );
      obj5.setgxTv_Sdtfoto_pessoa_Fp_bucket_Z( Z20fp_bucket );
      obj5.setgxTv_Sdtfoto_pessoa_Fp_hash_Z( Z21fp_hash );
      obj5.setgxTv_Sdtfoto_pessoa_Mode( Gx_mode );
   }

   public void KeyVarsToRow5( Sdtfoto_pessoa obj5 )
   {
      obj5.setgxTv_Sdtfoto_pessoa_Fp_id( A18fp_id );
   }

   public void RowToVars5( Sdtfoto_pessoa obj5 ,
                           int forceLoad )
   {
      Gx_mode = obj5.getgxTv_Sdtfoto_pessoa_Mode() ;
      A7pes_id = obj5.getgxTv_Sdtfoto_pessoa_Pes_id() ;
      A8pes_nome = obj5.getgxTv_Sdtfoto_pessoa_Pes_nome() ;
      A9pes_data_nascimento = obj5.getgxTv_Sdtfoto_pessoa_Pes_data_nascimento() ;
      A20fp_bucket = obj5.getgxTv_Sdtfoto_pessoa_Fp_bucket() ;
      A21fp_hash = obj5.getgxTv_Sdtfoto_pessoa_Fp_hash() ;
      A19fp_data = obj5.getgxTv_Sdtfoto_pessoa_Fp_data() ;
      A18fp_id = obj5.getgxTv_Sdtfoto_pessoa_Fp_id() ;
      Z18fp_id = obj5.getgxTv_Sdtfoto_pessoa_Fp_id_Z() ;
      Z7pes_id = obj5.getgxTv_Sdtfoto_pessoa_Pes_id_Z() ;
      Z8pes_nome = obj5.getgxTv_Sdtfoto_pessoa_Pes_nome_Z() ;
      Z9pes_data_nascimento = obj5.getgxTv_Sdtfoto_pessoa_Pes_data_nascimento_Z() ;
      Z19fp_data = obj5.getgxTv_Sdtfoto_pessoa_Fp_data_Z() ;
      Z20fp_bucket = obj5.getgxTv_Sdtfoto_pessoa_Fp_bucket_Z() ;
      Z21fp_hash = obj5.getgxTv_Sdtfoto_pessoa_Fp_hash_Z() ;
      Gx_mode = obj5.getgxTv_Sdtfoto_pessoa_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A18fp_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey055( ) ;
      scanKeyStart055( ) ;
      if ( RcdFound5 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z18fp_id = A18fp_id ;
      }
      zm055( -2) ;
      onLoadActions055( ) ;
      addRow055( ) ;
      scanKeyEnd055( ) ;
      if ( RcdFound5 == 0 )
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
      RowToVars5( bcfoto_pessoa, 0) ;
      scanKeyStart055( ) ;
      if ( RcdFound5 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z18fp_id = A18fp_id ;
      }
      zm055( -2) ;
      onLoadActions055( ) ;
      addRow055( ) ;
      scanKeyEnd055( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey055( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert055( ) ;
      }
      else
      {
         if ( RcdFound5 == 1 )
         {
            if ( A18fp_id != Z18fp_id )
            {
               A18fp_id = Z18fp_id ;
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
               update055( ) ;
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
               if ( A18fp_id != Z18fp_id )
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
                     insert055( ) ;
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
                     insert055( ) ;
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
      RowToVars5( bcfoto_pessoa, 1) ;
      saveImpl( ) ;
      VarsToRow5( bcfoto_pessoa) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars5( bcfoto_pessoa, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert055( ) ;
      afterTrn( ) ;
      VarsToRow5( bcfoto_pessoa) ;
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
         Sdtfoto_pessoa auxBC = new Sdtfoto_pessoa( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A18fp_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcfoto_pessoa);
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
      RowToVars5( bcfoto_pessoa, 1) ;
      updateImpl( ) ;
      VarsToRow5( bcfoto_pessoa) ;
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
      RowToVars5( bcfoto_pessoa, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert055( ) ;
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
      VarsToRow5( bcfoto_pessoa) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars5( bcfoto_pessoa, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey055( ) ;
      if ( RcdFound5 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A18fp_id != Z18fp_id )
         {
            A18fp_id = Z18fp_id ;
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
         if ( A18fp_id != Z18fp_id )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "foto_pessoa_bc");
      VarsToRow5( bcfoto_pessoa) ;
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
      Gx_mode = bcfoto_pessoa.getgxTv_Sdtfoto_pessoa_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcfoto_pessoa.setgxTv_Sdtfoto_pessoa_Mode( Gx_mode );
   }

   public void SetSDT( Sdtfoto_pessoa sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcfoto_pessoa )
      {
         bcfoto_pessoa = sdt ;
         if ( GXutil.strcmp(bcfoto_pessoa.getgxTv_Sdtfoto_pessoa_Mode(), "") == 0 )
         {
            bcfoto_pessoa.setgxTv_Sdtfoto_pessoa_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow5( bcfoto_pessoa) ;
         }
         else
         {
            RowToVars5( bcfoto_pessoa, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcfoto_pessoa.getgxTv_Sdtfoto_pessoa_Mode(), "") == 0 )
         {
            bcfoto_pessoa.setgxTv_Sdtfoto_pessoa_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars5( bcfoto_pessoa, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public Sdtfoto_pessoa getfoto_pessoa_BC( )
   {
      return bcfoto_pessoa ;
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
      Z19fp_data = GXutil.nullDate() ;
      A19fp_data = GXutil.nullDate() ;
      Z20fp_bucket = "" ;
      A20fp_bucket = "" ;
      Z21fp_hash = "" ;
      A21fp_hash = "" ;
      Z8pes_nome = "" ;
      A8pes_nome = "" ;
      Z9pes_data_nascimento = GXutil.nullDate() ;
      A9pes_data_nascimento = GXutil.nullDate() ;
      BC00055_A18fp_id = new short[1] ;
      BC00055_A8pes_nome = new String[] {""} ;
      BC00055_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      BC00055_A19fp_data = new java.util.Date[] {GXutil.nullDate()} ;
      BC00055_A20fp_bucket = new String[] {""} ;
      BC00055_A21fp_hash = new String[] {""} ;
      BC00055_A7pes_id = new short[1] ;
      BC00056_A8pes_nome = new String[] {""} ;
      BC00056_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      BC00057_A18fp_id = new short[1] ;
      BC00058_A18fp_id = new short[1] ;
      BC00058_A19fp_data = new java.util.Date[] {GXutil.nullDate()} ;
      BC00058_A20fp_bucket = new String[] {""} ;
      BC00058_A21fp_hash = new String[] {""} ;
      BC00058_A7pes_id = new short[1] ;
      sMode5 = "" ;
      BC00059_A18fp_id = new short[1] ;
      BC00059_A19fp_data = new java.util.Date[] {GXutil.nullDate()} ;
      BC00059_A20fp_bucket = new String[] {""} ;
      BC00059_A21fp_hash = new String[] {""} ;
      BC00059_A7pes_id = new short[1] ;
      BC000511_A18fp_id = new short[1] ;
      BC000514_A8pes_nome = new String[] {""} ;
      BC000514_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      BC000515_A18fp_id = new short[1] ;
      BC000515_A8pes_nome = new String[] {""} ;
      BC000515_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      BC000515_A19fp_data = new java.util.Date[] {GXutil.nullDate()} ;
      BC000515_A20fp_bucket = new String[] {""} ;
      BC000515_A21fp_hash = new String[] {""} ;
      BC000515_A7pes_id = new short[1] ;
      i19fp_data = GXutil.nullDate() ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new foto_pessoa_bc__default(),
         new Object[] {
             new Object[] {
            BC00052_A18fp_id, BC00052_A19fp_data, BC00052_A20fp_bucket, BC00052_A21fp_hash, BC00052_A7pes_id
            }
            , new Object[] {
            BC00053_A18fp_id, BC00053_A19fp_data, BC00053_A20fp_bucket, BC00053_A21fp_hash, BC00053_A7pes_id
            }
            , new Object[] {
            BC00054_A8pes_nome, BC00054_A9pes_data_nascimento
            }
            , new Object[] {
            BC00055_A18fp_id, BC00055_A8pes_nome, BC00055_A9pes_data_nascimento, BC00055_A19fp_data, BC00055_A20fp_bucket, BC00055_A21fp_hash, BC00055_A7pes_id
            }
            , new Object[] {
            BC00056_A8pes_nome, BC00056_A9pes_data_nascimento
            }
            , new Object[] {
            BC00057_A18fp_id
            }
            , new Object[] {
            BC00058_A18fp_id, BC00058_A19fp_data, BC00058_A20fp_bucket, BC00058_A21fp_hash, BC00058_A7pes_id
            }
            , new Object[] {
            BC00059_A18fp_id, BC00059_A19fp_data, BC00059_A20fp_bucket, BC00059_A21fp_hash, BC00059_A7pes_id
            }
            , new Object[] {
            }
            , new Object[] {
            BC000511_A18fp_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000514_A8pes_nome, BC000514_A9pes_data_nascimento
            }
            , new Object[] {
            BC000515_A18fp_id, BC000515_A8pes_nome, BC000515_A9pes_data_nascimento, BC000515_A19fp_data, BC000515_A20fp_bucket, BC000515_A21fp_hash, BC000515_A7pes_id
            }
         }
      );
      Z19fp_data = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A19fp_data = GXutil.serverDate( context, remoteHandle, pr_default) ;
      i19fp_data = GXutil.serverDate( context, remoteHandle, pr_default) ;
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z18fp_id ;
   private short A18fp_id ;
   private short Z7pes_id ;
   private short A7pes_id ;
   private short RcdFound5 ;
   private short nIsDirty_5 ;
   private int trnEnded ;
   private int GX_JID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode5 ;
   private java.util.Date Z19fp_data ;
   private java.util.Date A19fp_data ;
   private java.util.Date Z9pes_data_nascimento ;
   private java.util.Date A9pes_data_nascimento ;
   private java.util.Date i19fp_data ;
   private boolean mustCommit ;
   private String Z20fp_bucket ;
   private String A20fp_bucket ;
   private String Z21fp_hash ;
   private String A21fp_hash ;
   private String Z8pes_nome ;
   private String A8pes_nome ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private Sdtfoto_pessoa bcfoto_pessoa ;
   private IDataStoreProvider pr_default ;
   private short[] BC00055_A18fp_id ;
   private String[] BC00055_A8pes_nome ;
   private java.util.Date[] BC00055_A9pes_data_nascimento ;
   private java.util.Date[] BC00055_A19fp_data ;
   private String[] BC00055_A20fp_bucket ;
   private String[] BC00055_A21fp_hash ;
   private short[] BC00055_A7pes_id ;
   private String[] BC00056_A8pes_nome ;
   private java.util.Date[] BC00056_A9pes_data_nascimento ;
   private short[] BC00057_A18fp_id ;
   private short[] BC00058_A18fp_id ;
   private java.util.Date[] BC00058_A19fp_data ;
   private String[] BC00058_A20fp_bucket ;
   private String[] BC00058_A21fp_hash ;
   private short[] BC00058_A7pes_id ;
   private short[] BC00059_A18fp_id ;
   private java.util.Date[] BC00059_A19fp_data ;
   private String[] BC00059_A20fp_bucket ;
   private String[] BC00059_A21fp_hash ;
   private short[] BC00059_A7pes_id ;
   private short[] BC000511_A18fp_id ;
   private String[] BC000514_A8pes_nome ;
   private java.util.Date[] BC000514_A9pes_data_nascimento ;
   private short[] BC000515_A18fp_id ;
   private String[] BC000515_A8pes_nome ;
   private java.util.Date[] BC000515_A9pes_data_nascimento ;
   private java.util.Date[] BC000515_A19fp_data ;
   private String[] BC000515_A20fp_bucket ;
   private String[] BC000515_A21fp_hash ;
   private short[] BC000515_A7pes_id ;
   private short[] BC00052_A18fp_id ;
   private java.util.Date[] BC00052_A19fp_data ;
   private String[] BC00052_A20fp_bucket ;
   private String[] BC00052_A21fp_hash ;
   private short[] BC00052_A7pes_id ;
   private short[] BC00053_A18fp_id ;
   private java.util.Date[] BC00053_A19fp_data ;
   private String[] BC00053_A20fp_bucket ;
   private String[] BC00053_A21fp_hash ;
   private short[] BC00053_A7pes_id ;
   private String[] BC00054_A8pes_nome ;
   private java.util.Date[] BC00054_A9pes_data_nascimento ;
}

final  class foto_pessoa_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00052", "SELECT fp_id, fp_data, fp_bucket, fp_hash, pes_id FROM foto_pessoa WHERE fp_id = ?  FOR UPDATE OF foto_pessoa",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00053", "SELECT fp_id, fp_data, fp_bucket, fp_hash, pes_id FROM foto_pessoa WHERE fp_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00054", "SELECT pes_nome, pes_data_nascimento FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00055", "SELECT TM1.fp_id, T2.pes_nome, T2.pes_data_nascimento, TM1.fp_data, TM1.fp_bucket, TM1.fp_hash, TM1.pes_id FROM (foto_pessoa TM1 INNER JOIN pessoa T2 ON T2.pes_id = TM1.pes_id) WHERE TM1.fp_id = ? ORDER BY TM1.fp_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00056", "SELECT pes_nome, pes_data_nascimento FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00057", "SELECT fp_id FROM foto_pessoa WHERE fp_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00058", "SELECT fp_id, fp_data, fp_bucket, fp_hash, pes_id FROM foto_pessoa WHERE fp_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00059", "SELECT fp_id, fp_data, fp_bucket, fp_hash, pes_id FROM foto_pessoa WHERE fp_id = ?  FOR UPDATE OF foto_pessoa",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000510", "SAVEPOINT gxupdate;INSERT INTO foto_pessoa(fp_data, fp_bucket, fp_hash, pes_id) VALUES(?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000511", "SELECT currval('fp_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000512", "SAVEPOINT gxupdate;UPDATE foto_pessoa SET fp_data=?, fp_bucket=?, fp_hash=?, pes_id=?  WHERE fp_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000513", "SAVEPOINT gxupdate;DELETE FROM foto_pessoa  WHERE fp_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000514", "SELECT pes_nome, pes_data_nascimento FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000515", "SELECT TM1.fp_id, T2.pes_nome, T2.pes_data_nascimento, TM1.fp_data, TM1.fp_bucket, TM1.fp_hash, TM1.pes_id FROM (foto_pessoa TM1 INNER JOIN pessoa T2 ON T2.pes_id = TM1.pes_id) WHERE TM1.fp_id = ? ORDER BY TM1.fp_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 10 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
      }
   }

}

