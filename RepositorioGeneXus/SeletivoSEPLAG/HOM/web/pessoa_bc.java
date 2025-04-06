import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pessoa_bc extends GXWebPanel implements IGxSilentTrn
{
   public pessoa_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public pessoa_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pessoa_bc.class ));
   }

   public pessoa_bc( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow033( ) ;
      standaloneNotModal( ) ;
      initializeNonKey033( ) ;
      standaloneModal( ) ;
      addRow033( ) ;
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

   public void confirm_030( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls033( ) ;
         }
         else
         {
            checkExtendedTable033( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors033( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm033( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         Z8pes_nome = A8pes_nome ;
         Z9pes_data_nascimento = A9pes_data_nascimento ;
         Z10pes_sexo = A10pes_sexo ;
         Z11pes_mae = A11pes_mae ;
         Z12pes_pai = A12pes_pai ;
         Z34pes_idade = A34pes_idade ;
      }
      if ( GX_JID == -2 )
      {
         Z7pes_id = A7pes_id ;
         Z8pes_nome = A8pes_nome ;
         Z9pes_data_nascimento = A9pes_data_nascimento ;
         Z10pes_sexo = A10pes_sexo ;
         Z11pes_mae = A11pes_mae ;
         Z12pes_pai = A12pes_pai ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load033( )
   {
      /* Using cursor BC00034 */
      pr_default.execute(2, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A8pes_nome = BC00034_A8pes_nome[0] ;
         A9pes_data_nascimento = BC00034_A9pes_data_nascimento[0] ;
         A10pes_sexo = BC00034_A10pes_sexo[0] ;
         A11pes_mae = BC00034_A11pes_mae[0] ;
         A12pes_pai = BC00034_A12pes_pai[0] ;
         zm033( -2) ;
      }
      pr_default.close(2);
      onLoadActions033( ) ;
   }

   public void onLoadActions033( )
   {
      GXt_dtime1 = GXutil.resetTime( A9pes_data_nascimento );
      A34pes_idade = (short)(GXutil.age( GXt_dtime1, GXutil.now( ))) ;
   }

   public void checkExtendedTable033( )
   {
      nIsDirty_3 = (short)(0) ;
      standaloneModal( ) ;
      nIsDirty_3 = (short)(1) ;
      GXt_dtime1 = GXutil.resetTime( A9pes_data_nascimento );
      A34pes_idade = (short)(GXutil.age( GXt_dtime1, GXutil.now( ))) ;
   }

   public void closeExtendedTableCursors033( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey033( )
   {
      /* Using cursor BC00035 */
      pr_default.execute(3, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00036 */
      pr_default.execute(4, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm033( 2) ;
         RcdFound3 = (short)(1) ;
         A7pes_id = BC00036_A7pes_id[0] ;
         A8pes_nome = BC00036_A8pes_nome[0] ;
         A9pes_data_nascimento = BC00036_A9pes_data_nascimento[0] ;
         A10pes_sexo = BC00036_A10pes_sexo[0] ;
         A11pes_mae = BC00036_A11pes_mae[0] ;
         A12pes_pai = BC00036_A12pes_pai[0] ;
         Z7pes_id = A7pes_id ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load033( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey033( ) ;
         }
         Gx_mode = sMode3 ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey033( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey033( ) ;
      if ( RcdFound3 == 0 )
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
      confirm_030( ) ;
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

   public void checkOptimisticConcurrency033( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00037 */
         pr_default.execute(5, new Object[] {Short.valueOf(A7pes_id)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"pessoa"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z8pes_nome, BC00037_A8pes_nome[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z9pes_data_nascimento), GXutil.resetTime(BC00037_A9pes_data_nascimento[0])) ) || ( GXutil.strcmp(Z10pes_sexo, BC00037_A10pes_sexo[0]) != 0 ) || ( GXutil.strcmp(Z11pes_mae, BC00037_A11pes_mae[0]) != 0 ) || ( GXutil.strcmp(Z12pes_pai, BC00037_A12pes_pai[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"pessoa"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert033( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable033( ) ;
      }
      if ( AnyError == 0 )
      {
         zm033( 0) ;
         checkOptimisticConcurrency033( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm033( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert033( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00038 */
                  pr_default.execute(6, new Object[] {A8pes_nome, A9pes_data_nascimento, A10pes_sexo, A11pes_mae, A12pes_pai});
                  /* Retrieving last key number assigned */
                  /* Using cursor BC00039 */
                  pr_default.execute(7);
                  A7pes_id = BC00039_A7pes_id[0] ;
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("pessoa");
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
            load033( ) ;
         }
         endLevel033( ) ;
      }
      closeExtendedTableCursors033( ) ;
   }

   public void update033( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable033( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency033( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm033( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate033( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000310 */
                  pr_default.execute(8, new Object[] {A8pes_nome, A9pes_data_nascimento, A10pes_sexo, A11pes_mae, A12pes_pai, Short.valueOf(A7pes_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("pessoa");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"pessoa"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate033( ) ;
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
         endLevel033( ) ;
      }
      closeExtendedTableCursors033( ) ;
   }

   public void deferredUpdate033( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency033( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls033( ) ;
         afterConfirm033( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete033( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000311 */
               pr_default.execute(9, new Object[] {Short.valueOf(A7pes_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("pessoa");
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel033( ) ;
      Gx_mode = sMode3 ;
   }

   public void onDeleteControls033( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_dtime1 = GXutil.resetTime( A9pes_data_nascimento );
         A34pes_idade = (short)(GXutil.age( GXt_dtime1, GXutil.now( ))) ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC000312 */
         pr_default.execute(10, new Object[] {Short.valueOf(A7pes_id)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"lotacao"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor BC000313 */
         pr_default.execute(11, new Object[] {Short.valueOf(A7pes_id)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"foto_pessoa"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor BC000314 */
         pr_default.execute(12, new Object[] {Short.valueOf(A7pes_id)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"servidor_temporario"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor BC000315 */
         pr_default.execute(13, new Object[] {Short.valueOf(A7pes_id)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"servidor_efetivo"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor BC000316 */
         pr_default.execute(14, new Object[] {Short.valueOf(A7pes_id)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"pessoa_endereco"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void endLevel033( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete033( ) ;
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

   public void scanKeyStart033( )
   {
      /* Using cursor BC000317 */
      pr_default.execute(15, new Object[] {Short.valueOf(A7pes_id)});
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A7pes_id = BC000317_A7pes_id[0] ;
         A8pes_nome = BC000317_A8pes_nome[0] ;
         A9pes_data_nascimento = BC000317_A9pes_data_nascimento[0] ;
         A10pes_sexo = BC000317_A10pes_sexo[0] ;
         A11pes_mae = BC000317_A11pes_mae[0] ;
         A12pes_pai = BC000317_A12pes_pai[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext033( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound3 = (short)(0) ;
      scanKeyLoad033( ) ;
   }

   public void scanKeyLoad033( )
   {
      sMode3 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A7pes_id = BC000317_A7pes_id[0] ;
         A8pes_nome = BC000317_A8pes_nome[0] ;
         A9pes_data_nascimento = BC000317_A9pes_data_nascimento[0] ;
         A10pes_sexo = BC000317_A10pes_sexo[0] ;
         A11pes_mae = BC000317_A11pes_mae[0] ;
         A12pes_pai = BC000317_A12pes_pai[0] ;
      }
      Gx_mode = sMode3 ;
   }

   public void scanKeyEnd033( )
   {
      pr_default.close(15);
   }

   public void afterConfirm033( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert033( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate033( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete033( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete033( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate033( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes033( )
   {
   }

   public void send_integrity_lvl_hashes033( )
   {
   }

   public void addRow033( )
   {
      VarsToRow3( bcpessoa) ;
   }

   public void readRow033( )
   {
      RowToVars3( bcpessoa, 1) ;
   }

   public void initializeNonKey033( )
   {
      A34pes_idade = (short)(0) ;
      A8pes_nome = "" ;
      A9pes_data_nascimento = GXutil.nullDate() ;
      A10pes_sexo = "" ;
      A11pes_mae = "" ;
      A12pes_pai = "" ;
      Z8pes_nome = "" ;
      Z9pes_data_nascimento = GXutil.nullDate() ;
      Z10pes_sexo = "" ;
      Z11pes_mae = "" ;
      Z12pes_pai = "" ;
   }

   public void initAll033( )
   {
      A7pes_id = (short)(0) ;
      initializeNonKey033( ) ;
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

   public void VarsToRow3( Sdtpessoa obj3 )
   {
      obj3.setgxTv_Sdtpessoa_Mode( Gx_mode );
      obj3.setgxTv_Sdtpessoa_Pes_idade( A34pes_idade );
      obj3.setgxTv_Sdtpessoa_Pes_nome( A8pes_nome );
      obj3.setgxTv_Sdtpessoa_Pes_data_nascimento( A9pes_data_nascimento );
      obj3.setgxTv_Sdtpessoa_Pes_sexo( A10pes_sexo );
      obj3.setgxTv_Sdtpessoa_Pes_mae( A11pes_mae );
      obj3.setgxTv_Sdtpessoa_Pes_pai( A12pes_pai );
      obj3.setgxTv_Sdtpessoa_Pes_id( A7pes_id );
      obj3.setgxTv_Sdtpessoa_Pes_id_Z( Z7pes_id );
      obj3.setgxTv_Sdtpessoa_Pes_nome_Z( Z8pes_nome );
      obj3.setgxTv_Sdtpessoa_Pes_data_nascimento_Z( Z9pes_data_nascimento );
      obj3.setgxTv_Sdtpessoa_Pes_sexo_Z( Z10pes_sexo );
      obj3.setgxTv_Sdtpessoa_Pes_mae_Z( Z11pes_mae );
      obj3.setgxTv_Sdtpessoa_Pes_pai_Z( Z12pes_pai );
      obj3.setgxTv_Sdtpessoa_Pes_idade_Z( Z34pes_idade );
      obj3.setgxTv_Sdtpessoa_Mode( Gx_mode );
   }

   public void KeyVarsToRow3( Sdtpessoa obj3 )
   {
      obj3.setgxTv_Sdtpessoa_Pes_id( A7pes_id );
   }

   public void RowToVars3( Sdtpessoa obj3 ,
                           int forceLoad )
   {
      Gx_mode = obj3.getgxTv_Sdtpessoa_Mode() ;
      A34pes_idade = obj3.getgxTv_Sdtpessoa_Pes_idade() ;
      A8pes_nome = obj3.getgxTv_Sdtpessoa_Pes_nome() ;
      A9pes_data_nascimento = obj3.getgxTv_Sdtpessoa_Pes_data_nascimento() ;
      A10pes_sexo = obj3.getgxTv_Sdtpessoa_Pes_sexo() ;
      A11pes_mae = obj3.getgxTv_Sdtpessoa_Pes_mae() ;
      A12pes_pai = obj3.getgxTv_Sdtpessoa_Pes_pai() ;
      A7pes_id = obj3.getgxTv_Sdtpessoa_Pes_id() ;
      Z7pes_id = obj3.getgxTv_Sdtpessoa_Pes_id_Z() ;
      Z8pes_nome = obj3.getgxTv_Sdtpessoa_Pes_nome_Z() ;
      Z9pes_data_nascimento = obj3.getgxTv_Sdtpessoa_Pes_data_nascimento_Z() ;
      Z10pes_sexo = obj3.getgxTv_Sdtpessoa_Pes_sexo_Z() ;
      Z11pes_mae = obj3.getgxTv_Sdtpessoa_Pes_mae_Z() ;
      Z12pes_pai = obj3.getgxTv_Sdtpessoa_Pes_pai_Z() ;
      Z34pes_idade = obj3.getgxTv_Sdtpessoa_Pes_idade_Z() ;
      Gx_mode = obj3.getgxTv_Sdtpessoa_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A7pes_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey033( ) ;
      scanKeyStart033( ) ;
      if ( RcdFound3 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z7pes_id = A7pes_id ;
      }
      zm033( -2) ;
      onLoadActions033( ) ;
      addRow033( ) ;
      scanKeyEnd033( ) ;
      if ( RcdFound3 == 0 )
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
      RowToVars3( bcpessoa, 0) ;
      scanKeyStart033( ) ;
      if ( RcdFound3 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z7pes_id = A7pes_id ;
      }
      zm033( -2) ;
      onLoadActions033( ) ;
      addRow033( ) ;
      scanKeyEnd033( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey033( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert033( ) ;
      }
      else
      {
         if ( RcdFound3 == 1 )
         {
            if ( A7pes_id != Z7pes_id )
            {
               A7pes_id = Z7pes_id ;
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
               update033( ) ;
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
               if ( A7pes_id != Z7pes_id )
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
                     insert033( ) ;
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
                     insert033( ) ;
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
      RowToVars3( bcpessoa, 1) ;
      saveImpl( ) ;
      VarsToRow3( bcpessoa) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars3( bcpessoa, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert033( ) ;
      afterTrn( ) ;
      VarsToRow3( bcpessoa) ;
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
         Sdtpessoa auxBC = new Sdtpessoa( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A7pes_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcpessoa);
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
      RowToVars3( bcpessoa, 1) ;
      updateImpl( ) ;
      VarsToRow3( bcpessoa) ;
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
      RowToVars3( bcpessoa, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert033( ) ;
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
      VarsToRow3( bcpessoa) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars3( bcpessoa, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey033( ) ;
      if ( RcdFound3 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A7pes_id != Z7pes_id )
         {
            A7pes_id = Z7pes_id ;
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
         if ( A7pes_id != Z7pes_id )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "pessoa_bc");
      VarsToRow3( bcpessoa) ;
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
      Gx_mode = bcpessoa.getgxTv_Sdtpessoa_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcpessoa.setgxTv_Sdtpessoa_Mode( Gx_mode );
   }

   public void SetSDT( Sdtpessoa sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcpessoa )
      {
         bcpessoa = sdt ;
         if ( GXutil.strcmp(bcpessoa.getgxTv_Sdtpessoa_Mode(), "") == 0 )
         {
            bcpessoa.setgxTv_Sdtpessoa_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow3( bcpessoa) ;
         }
         else
         {
            RowToVars3( bcpessoa, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcpessoa.getgxTv_Sdtpessoa_Mode(), "") == 0 )
         {
            bcpessoa.setgxTv_Sdtpessoa_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars3( bcpessoa, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public Sdtpessoa getpessoa_BC( )
   {
      return bcpessoa ;
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
      Z8pes_nome = "" ;
      A8pes_nome = "" ;
      Z9pes_data_nascimento = GXutil.nullDate() ;
      A9pes_data_nascimento = GXutil.nullDate() ;
      Z10pes_sexo = "" ;
      A10pes_sexo = "" ;
      Z11pes_mae = "" ;
      A11pes_mae = "" ;
      Z12pes_pai = "" ;
      A12pes_pai = "" ;
      BC00034_A7pes_id = new short[1] ;
      BC00034_A8pes_nome = new String[] {""} ;
      BC00034_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      BC00034_A10pes_sexo = new String[] {""} ;
      BC00034_A11pes_mae = new String[] {""} ;
      BC00034_A12pes_pai = new String[] {""} ;
      BC00035_A7pes_id = new short[1] ;
      BC00036_A7pes_id = new short[1] ;
      BC00036_A8pes_nome = new String[] {""} ;
      BC00036_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      BC00036_A10pes_sexo = new String[] {""} ;
      BC00036_A11pes_mae = new String[] {""} ;
      BC00036_A12pes_pai = new String[] {""} ;
      sMode3 = "" ;
      BC00037_A7pes_id = new short[1] ;
      BC00037_A8pes_nome = new String[] {""} ;
      BC00037_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      BC00037_A10pes_sexo = new String[] {""} ;
      BC00037_A11pes_mae = new String[] {""} ;
      BC00037_A12pes_pai = new String[] {""} ;
      BC00039_A7pes_id = new short[1] ;
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      BC000312_A22lot_id = new short[1] ;
      BC000313_A18fp_id = new short[1] ;
      BC000314_A7pes_id = new short[1] ;
      BC000314_A32st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000315_A7pes_id = new short[1] ;
      BC000315_A26se_matricula = new String[] {""} ;
      BC000316_A7pes_id = new short[1] ;
      BC000316_A13end_id = new short[1] ;
      BC000317_A7pes_id = new short[1] ;
      BC000317_A8pes_nome = new String[] {""} ;
      BC000317_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      BC000317_A10pes_sexo = new String[] {""} ;
      BC000317_A11pes_mae = new String[] {""} ;
      BC000317_A12pes_pai = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new pessoa_bc__default(),
         new Object[] {
             new Object[] {
            BC00032_A7pes_id, BC00032_A8pes_nome, BC00032_A9pes_data_nascimento, BC00032_A10pes_sexo, BC00032_A11pes_mae, BC00032_A12pes_pai
            }
            , new Object[] {
            BC00033_A7pes_id, BC00033_A8pes_nome, BC00033_A9pes_data_nascimento, BC00033_A10pes_sexo, BC00033_A11pes_mae, BC00033_A12pes_pai
            }
            , new Object[] {
            BC00034_A7pes_id, BC00034_A8pes_nome, BC00034_A9pes_data_nascimento, BC00034_A10pes_sexo, BC00034_A11pes_mae, BC00034_A12pes_pai
            }
            , new Object[] {
            BC00035_A7pes_id
            }
            , new Object[] {
            BC00036_A7pes_id, BC00036_A8pes_nome, BC00036_A9pes_data_nascimento, BC00036_A10pes_sexo, BC00036_A11pes_mae, BC00036_A12pes_pai
            }
            , new Object[] {
            BC00037_A7pes_id, BC00037_A8pes_nome, BC00037_A9pes_data_nascimento, BC00037_A10pes_sexo, BC00037_A11pes_mae, BC00037_A12pes_pai
            }
            , new Object[] {
            }
            , new Object[] {
            BC00039_A7pes_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000312_A22lot_id
            }
            , new Object[] {
            BC000313_A18fp_id
            }
            , new Object[] {
            BC000314_A7pes_id, BC000314_A32st_data_admissao
            }
            , new Object[] {
            BC000315_A7pes_id, BC000315_A26se_matricula
            }
            , new Object[] {
            BC000316_A7pes_id, BC000316_A13end_id
            }
            , new Object[] {
            BC000317_A7pes_id, BC000317_A8pes_nome, BC000317_A9pes_data_nascimento, BC000317_A10pes_sexo, BC000317_A11pes_mae, BC000317_A12pes_pai
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
   private short Z34pes_idade ;
   private short A34pes_idade ;
   private short RcdFound3 ;
   private short nIsDirty_3 ;
   private int trnEnded ;
   private int GX_JID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode3 ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date Z9pes_data_nascimento ;
   private java.util.Date A9pes_data_nascimento ;
   private boolean mustCommit ;
   private String Z8pes_nome ;
   private String A8pes_nome ;
   private String Z10pes_sexo ;
   private String A10pes_sexo ;
   private String Z11pes_mae ;
   private String A11pes_mae ;
   private String Z12pes_pai ;
   private String A12pes_pai ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private Sdtpessoa bcpessoa ;
   private IDataStoreProvider pr_default ;
   private short[] BC00034_A7pes_id ;
   private String[] BC00034_A8pes_nome ;
   private java.util.Date[] BC00034_A9pes_data_nascimento ;
   private String[] BC00034_A10pes_sexo ;
   private String[] BC00034_A11pes_mae ;
   private String[] BC00034_A12pes_pai ;
   private short[] BC00035_A7pes_id ;
   private short[] BC00036_A7pes_id ;
   private String[] BC00036_A8pes_nome ;
   private java.util.Date[] BC00036_A9pes_data_nascimento ;
   private String[] BC00036_A10pes_sexo ;
   private String[] BC00036_A11pes_mae ;
   private String[] BC00036_A12pes_pai ;
   private short[] BC00037_A7pes_id ;
   private String[] BC00037_A8pes_nome ;
   private java.util.Date[] BC00037_A9pes_data_nascimento ;
   private String[] BC00037_A10pes_sexo ;
   private String[] BC00037_A11pes_mae ;
   private String[] BC00037_A12pes_pai ;
   private short[] BC00039_A7pes_id ;
   private short[] BC000312_A22lot_id ;
   private short[] BC000313_A18fp_id ;
   private short[] BC000314_A7pes_id ;
   private java.util.Date[] BC000314_A32st_data_admissao ;
   private short[] BC000315_A7pes_id ;
   private String[] BC000315_A26se_matricula ;
   private short[] BC000316_A7pes_id ;
   private short[] BC000316_A13end_id ;
   private short[] BC000317_A7pes_id ;
   private String[] BC000317_A8pes_nome ;
   private java.util.Date[] BC000317_A9pes_data_nascimento ;
   private String[] BC000317_A10pes_sexo ;
   private String[] BC000317_A11pes_mae ;
   private String[] BC000317_A12pes_pai ;
   private short[] BC00032_A7pes_id ;
   private String[] BC00032_A8pes_nome ;
   private java.util.Date[] BC00032_A9pes_data_nascimento ;
   private String[] BC00032_A10pes_sexo ;
   private String[] BC00032_A11pes_mae ;
   private String[] BC00032_A12pes_pai ;
   private short[] BC00033_A7pes_id ;
   private String[] BC00033_A8pes_nome ;
   private java.util.Date[] BC00033_A9pes_data_nascimento ;
   private String[] BC00033_A10pes_sexo ;
   private String[] BC00033_A11pes_mae ;
   private String[] BC00033_A12pes_pai ;
}

final  class pessoa_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00032", "SELECT pes_id, pes_nome, pes_data_nascimento, pes_sexo, pes_mae, pes_pai FROM pessoa WHERE pes_id = ?  FOR UPDATE OF pessoa",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00033", "SELECT pes_id, pes_nome, pes_data_nascimento, pes_sexo, pes_mae, pes_pai FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00034", "SELECT TM1.pes_id, TM1.pes_nome, TM1.pes_data_nascimento, TM1.pes_sexo, TM1.pes_mae, TM1.pes_pai FROM pessoa TM1 WHERE TM1.pes_id = ? ORDER BY TM1.pes_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00035", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00036", "SELECT pes_id, pes_nome, pes_data_nascimento, pes_sexo, pes_mae, pes_pai FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00037", "SELECT pes_id, pes_nome, pes_data_nascimento, pes_sexo, pes_mae, pes_pai FROM pessoa WHERE pes_id = ?  FOR UPDATE OF pessoa",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC00038", "SAVEPOINT gxupdate;INSERT INTO pessoa(pes_nome, pes_data_nascimento, pes_sexo, pes_mae, pes_pai) VALUES(?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC00039", "SELECT currval('pes_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000310", "SAVEPOINT gxupdate;UPDATE pessoa SET pes_nome=?, pes_data_nascimento=?, pes_sexo=?, pes_mae=?, pes_pai=?  WHERE pes_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000311", "SAVEPOINT gxupdate;DELETE FROM pessoa  WHERE pes_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000312", "SELECT lot_id FROM lotacao WHERE pes_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000313", "SELECT fp_id FROM foto_pessoa WHERE pes_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000314", "SELECT pes_id, st_data_admissao FROM servidor_temporario WHERE pes_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000315", "SELECT pes_id, se_matricula FROM servidor_efetivo WHERE pes_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000316", "SELECT pes_id, end_id FROM pessoa_endereco WHERE pes_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000317", "SELECT TM1.pes_id, TM1.pes_nome, TM1.pes_data_nascimento, TM1.pes_sexo, TM1.pes_mae, TM1.pes_pai FROM pessoa TM1 WHERE TM1.pes_id = ? ORDER BY TM1.pes_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setVarchar(3, (String)parms[2], 9, false);
               stmt.setVarchar(4, (String)parms[3], 200, false);
               stmt.setVarchar(5, (String)parms[4], 200, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 200, false);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setVarchar(3, (String)parms[2], 9, false);
               stmt.setVarchar(4, (String)parms[3], 200, false);
               stmt.setVarchar(5, (String)parms[4], 200, false);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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

