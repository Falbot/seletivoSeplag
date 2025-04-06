import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lotacao_bc extends GXWebPanel implements IGxSilentTrn
{
   public lotacao_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lotacao_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lotacao_bc.class ));
   }

   public lotacao_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow066( ) ;
      standaloneNotModal( ) ;
      initializeNonKey066( ) ;
      standaloneModal( ) ;
      addRow066( ) ;
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
            Z22lot_id = A22lot_id ;
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

   public void confirm_060( )
   {
      beforeValidate066( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls066( ) ;
         }
         else
         {
            checkExtendedTable066( ) ;
            if ( AnyError == 0 )
            {
               zm066( 2) ;
               zm066( 3) ;
            }
            closeExtendedTableCursors066( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm066( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z23lot_data_lotacao = A23lot_data_lotacao ;
         Z24lot_data_remocao = A24lot_data_remocao ;
         Z25lot_portaria = A25lot_portaria ;
         Z7pes_id = A7pes_id ;
         Z4unid_id = A4unid_id ;
      }
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         Z8pes_nome = A8pes_nome ;
      }
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         Z5unid_nome = A5unid_nome ;
         Z6unid_sigla = A6unid_sigla ;
      }
      if ( GX_JID == -1 )
      {
         Z22lot_id = A22lot_id ;
         Z23lot_data_lotacao = A23lot_data_lotacao ;
         Z24lot_data_remocao = A24lot_data_remocao ;
         Z25lot_portaria = A25lot_portaria ;
         Z7pes_id = A7pes_id ;
         Z4unid_id = A4unid_id ;
         Z8pes_nome = A8pes_nome ;
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

   public void load066( )
   {
      /* Using cursor BC00066 */
      pr_default.execute(4, new Object[] {Short.valueOf(A22lot_id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A8pes_nome = BC00066_A8pes_nome[0] ;
         A5unid_nome = BC00066_A5unid_nome[0] ;
         A6unid_sigla = BC00066_A6unid_sigla[0] ;
         A23lot_data_lotacao = BC00066_A23lot_data_lotacao[0] ;
         A24lot_data_remocao = BC00066_A24lot_data_remocao[0] ;
         A25lot_portaria = BC00066_A25lot_portaria[0] ;
         A7pes_id = BC00066_A7pes_id[0] ;
         A4unid_id = BC00066_A4unid_id[0] ;
         zm066( -1) ;
      }
      pr_default.close(4);
      onLoadActions066( ) ;
   }

   public void onLoadActions066( )
   {
   }

   public void checkExtendedTable066( )
   {
      nIsDirty_6 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC00067 */
      pr_default.execute(5, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
      }
      A8pes_nome = BC00067_A8pes_nome[0] ;
      pr_default.close(5);
      /* Using cursor BC00068 */
      pr_default.execute(6, new Object[] {Short.valueOf(A4unid_id)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
      }
      A5unid_nome = BC00068_A5unid_nome[0] ;
      A6unid_sigla = BC00068_A6unid_sigla[0] ;
      pr_default.close(6);
   }

   public void closeExtendedTableCursors066( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void getKey066( )
   {
      /* Using cursor BC00069 */
      pr_default.execute(7, new Object[] {Short.valueOf(A22lot_id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound6 = (short)(1) ;
      }
      else
      {
         RcdFound6 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000610 */
      pr_default.execute(8, new Object[] {Short.valueOf(A22lot_id)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         zm066( 1) ;
         RcdFound6 = (short)(1) ;
         A22lot_id = BC000610_A22lot_id[0] ;
         A23lot_data_lotacao = BC000610_A23lot_data_lotacao[0] ;
         A24lot_data_remocao = BC000610_A24lot_data_remocao[0] ;
         A25lot_portaria = BC000610_A25lot_portaria[0] ;
         A7pes_id = BC000610_A7pes_id[0] ;
         A4unid_id = BC000610_A4unid_id[0] ;
         Z22lot_id = A22lot_id ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load066( ) ;
         if ( AnyError == 1 )
         {
            RcdFound6 = (short)(0) ;
            initializeNonKey066( ) ;
         }
         Gx_mode = sMode6 ;
      }
      else
      {
         RcdFound6 = (short)(0) ;
         initializeNonKey066( ) ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode6 ;
      }
      pr_default.close(8);
   }

   public void getEqualNoModal( )
   {
      getKey066( ) ;
      if ( RcdFound6 == 0 )
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
      confirm_060( ) ;
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

   public void checkOptimisticConcurrency066( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC000611 */
         pr_default.execute(9, new Object[] {Short.valueOf(A22lot_id)});
         if ( (pr_default.getStatus(9) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"lotacao"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(9) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z23lot_data_lotacao), GXutil.resetTime(BC000611_A23lot_data_lotacao[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z24lot_data_remocao), GXutil.resetTime(BC000611_A24lot_data_remocao[0])) ) || ( GXutil.strcmp(Z25lot_portaria, BC000611_A25lot_portaria[0]) != 0 ) || ( Z7pes_id != BC000611_A7pes_id[0] ) || ( Z4unid_id != BC000611_A4unid_id[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"lotacao"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert066( )
   {
      beforeValidate066( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable066( ) ;
      }
      if ( AnyError == 0 )
      {
         zm066( 0) ;
         checkOptimisticConcurrency066( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm066( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert066( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000612 */
                  pr_default.execute(10, new Object[] {A23lot_data_lotacao, A24lot_data_remocao, A25lot_portaria, Short.valueOf(A7pes_id), Short.valueOf(A4unid_id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor BC000613 */
                  pr_default.execute(11);
                  A22lot_id = BC000613_A22lot_id[0] ;
                  pr_default.close(11);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("lotacao");
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
            load066( ) ;
         }
         endLevel066( ) ;
      }
      closeExtendedTableCursors066( ) ;
   }

   public void update066( )
   {
      beforeValidate066( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable066( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency066( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm066( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate066( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000614 */
                  pr_default.execute(12, new Object[] {A23lot_data_lotacao, A24lot_data_remocao, A25lot_portaria, Short.valueOf(A7pes_id), Short.valueOf(A4unid_id), Short.valueOf(A22lot_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("lotacao");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"lotacao"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate066( ) ;
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
         endLevel066( ) ;
      }
      closeExtendedTableCursors066( ) ;
   }

   public void deferredUpdate066( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate066( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency066( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls066( ) ;
         afterConfirm066( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete066( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000615 */
               pr_default.execute(13, new Object[] {Short.valueOf(A22lot_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("lotacao");
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
      sMode6 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel066( ) ;
      Gx_mode = sMode6 ;
   }

   public void onDeleteControls066( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC000616 */
         pr_default.execute(14, new Object[] {Short.valueOf(A7pes_id)});
         A8pes_nome = BC000616_A8pes_nome[0] ;
         pr_default.close(14);
         /* Using cursor BC000617 */
         pr_default.execute(15, new Object[] {Short.valueOf(A4unid_id)});
         A5unid_nome = BC000617_A5unid_nome[0] ;
         A6unid_sigla = BC000617_A6unid_sigla[0] ;
         pr_default.close(15);
      }
   }

   public void endLevel066( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(9);
      }
      if ( AnyError == 0 )
      {
         beforeComplete066( ) ;
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

   public void scanKeyStart066( )
   {
      /* Using cursor BC000618 */
      pr_default.execute(16, new Object[] {Short.valueOf(A22lot_id)});
      RcdFound6 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A22lot_id = BC000618_A22lot_id[0] ;
         A8pes_nome = BC000618_A8pes_nome[0] ;
         A5unid_nome = BC000618_A5unid_nome[0] ;
         A6unid_sigla = BC000618_A6unid_sigla[0] ;
         A23lot_data_lotacao = BC000618_A23lot_data_lotacao[0] ;
         A24lot_data_remocao = BC000618_A24lot_data_remocao[0] ;
         A25lot_portaria = BC000618_A25lot_portaria[0] ;
         A7pes_id = BC000618_A7pes_id[0] ;
         A4unid_id = BC000618_A4unid_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext066( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound6 = (short)(0) ;
      scanKeyLoad066( ) ;
   }

   public void scanKeyLoad066( )
   {
      sMode6 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A22lot_id = BC000618_A22lot_id[0] ;
         A8pes_nome = BC000618_A8pes_nome[0] ;
         A5unid_nome = BC000618_A5unid_nome[0] ;
         A6unid_sigla = BC000618_A6unid_sigla[0] ;
         A23lot_data_lotacao = BC000618_A23lot_data_lotacao[0] ;
         A24lot_data_remocao = BC000618_A24lot_data_remocao[0] ;
         A25lot_portaria = BC000618_A25lot_portaria[0] ;
         A7pes_id = BC000618_A7pes_id[0] ;
         A4unid_id = BC000618_A4unid_id[0] ;
      }
      Gx_mode = sMode6 ;
   }

   public void scanKeyEnd066( )
   {
      pr_default.close(16);
   }

   public void afterConfirm066( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert066( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate066( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete066( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete066( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate066( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes066( )
   {
   }

   public void send_integrity_lvl_hashes066( )
   {
   }

   public void addRow066( )
   {
      VarsToRow6( bclotacao) ;
   }

   public void readRow066( )
   {
      RowToVars6( bclotacao, 1) ;
   }

   public void initializeNonKey066( )
   {
      A7pes_id = (short)(0) ;
      A8pes_nome = "" ;
      A4unid_id = (short)(0) ;
      A5unid_nome = "" ;
      A6unid_sigla = "" ;
      A23lot_data_lotacao = GXutil.nullDate() ;
      A24lot_data_remocao = GXutil.nullDate() ;
      A25lot_portaria = "" ;
      Z23lot_data_lotacao = GXutil.nullDate() ;
      Z24lot_data_remocao = GXutil.nullDate() ;
      Z25lot_portaria = "" ;
      Z7pes_id = (short)(0) ;
      Z4unid_id = (short)(0) ;
   }

   public void initAll066( )
   {
      A22lot_id = (short)(0) ;
      initializeNonKey066( ) ;
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

   public void VarsToRow6( Sdtlotacao obj6 )
   {
      obj6.setgxTv_Sdtlotacao_Mode( Gx_mode );
      obj6.setgxTv_Sdtlotacao_Pes_id( A7pes_id );
      obj6.setgxTv_Sdtlotacao_Pes_nome( A8pes_nome );
      obj6.setgxTv_Sdtlotacao_Unid_id( A4unid_id );
      obj6.setgxTv_Sdtlotacao_Unid_nome( A5unid_nome );
      obj6.setgxTv_Sdtlotacao_Unid_sigla( A6unid_sigla );
      obj6.setgxTv_Sdtlotacao_Lot_data_lotacao( A23lot_data_lotacao );
      obj6.setgxTv_Sdtlotacao_Lot_data_remocao( A24lot_data_remocao );
      obj6.setgxTv_Sdtlotacao_Lot_portaria( A25lot_portaria );
      obj6.setgxTv_Sdtlotacao_Lot_id( A22lot_id );
      obj6.setgxTv_Sdtlotacao_Lot_id_Z( Z22lot_id );
      obj6.setgxTv_Sdtlotacao_Pes_id_Z( Z7pes_id );
      obj6.setgxTv_Sdtlotacao_Pes_nome_Z( Z8pes_nome );
      obj6.setgxTv_Sdtlotacao_Unid_id_Z( Z4unid_id );
      obj6.setgxTv_Sdtlotacao_Unid_nome_Z( Z5unid_nome );
      obj6.setgxTv_Sdtlotacao_Unid_sigla_Z( Z6unid_sigla );
      obj6.setgxTv_Sdtlotacao_Lot_data_lotacao_Z( Z23lot_data_lotacao );
      obj6.setgxTv_Sdtlotacao_Lot_data_remocao_Z( Z24lot_data_remocao );
      obj6.setgxTv_Sdtlotacao_Lot_portaria_Z( Z25lot_portaria );
      obj6.setgxTv_Sdtlotacao_Mode( Gx_mode );
   }

   public void KeyVarsToRow6( Sdtlotacao obj6 )
   {
      obj6.setgxTv_Sdtlotacao_Lot_id( A22lot_id );
   }

   public void RowToVars6( Sdtlotacao obj6 ,
                           int forceLoad )
   {
      Gx_mode = obj6.getgxTv_Sdtlotacao_Mode() ;
      A7pes_id = obj6.getgxTv_Sdtlotacao_Pes_id() ;
      A8pes_nome = obj6.getgxTv_Sdtlotacao_Pes_nome() ;
      A4unid_id = obj6.getgxTv_Sdtlotacao_Unid_id() ;
      A5unid_nome = obj6.getgxTv_Sdtlotacao_Unid_nome() ;
      A6unid_sigla = obj6.getgxTv_Sdtlotacao_Unid_sigla() ;
      A23lot_data_lotacao = obj6.getgxTv_Sdtlotacao_Lot_data_lotacao() ;
      A24lot_data_remocao = obj6.getgxTv_Sdtlotacao_Lot_data_remocao() ;
      A25lot_portaria = obj6.getgxTv_Sdtlotacao_Lot_portaria() ;
      A22lot_id = obj6.getgxTv_Sdtlotacao_Lot_id() ;
      Z22lot_id = obj6.getgxTv_Sdtlotacao_Lot_id_Z() ;
      Z7pes_id = obj6.getgxTv_Sdtlotacao_Pes_id_Z() ;
      Z8pes_nome = obj6.getgxTv_Sdtlotacao_Pes_nome_Z() ;
      Z4unid_id = obj6.getgxTv_Sdtlotacao_Unid_id_Z() ;
      Z5unid_nome = obj6.getgxTv_Sdtlotacao_Unid_nome_Z() ;
      Z6unid_sigla = obj6.getgxTv_Sdtlotacao_Unid_sigla_Z() ;
      Z23lot_data_lotacao = obj6.getgxTv_Sdtlotacao_Lot_data_lotacao_Z() ;
      Z24lot_data_remocao = obj6.getgxTv_Sdtlotacao_Lot_data_remocao_Z() ;
      Z25lot_portaria = obj6.getgxTv_Sdtlotacao_Lot_portaria_Z() ;
      Gx_mode = obj6.getgxTv_Sdtlotacao_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A22lot_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey066( ) ;
      scanKeyStart066( ) ;
      if ( RcdFound6 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z22lot_id = A22lot_id ;
      }
      zm066( -1) ;
      onLoadActions066( ) ;
      addRow066( ) ;
      scanKeyEnd066( ) ;
      if ( RcdFound6 == 0 )
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
      RowToVars6( bclotacao, 0) ;
      scanKeyStart066( ) ;
      if ( RcdFound6 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z22lot_id = A22lot_id ;
      }
      zm066( -1) ;
      onLoadActions066( ) ;
      addRow066( ) ;
      scanKeyEnd066( ) ;
      if ( RcdFound6 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey066( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert066( ) ;
      }
      else
      {
         if ( RcdFound6 == 1 )
         {
            if ( A22lot_id != Z22lot_id )
            {
               A22lot_id = Z22lot_id ;
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
               update066( ) ;
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
               if ( A22lot_id != Z22lot_id )
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
                     insert066( ) ;
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
                     insert066( ) ;
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
      RowToVars6( bclotacao, 1) ;
      saveImpl( ) ;
      VarsToRow6( bclotacao) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars6( bclotacao, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert066( ) ;
      afterTrn( ) ;
      VarsToRow6( bclotacao) ;
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
         Sdtlotacao auxBC = new Sdtlotacao( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A22lot_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bclotacao);
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
      RowToVars6( bclotacao, 1) ;
      updateImpl( ) ;
      VarsToRow6( bclotacao) ;
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
      RowToVars6( bclotacao, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert066( ) ;
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
      VarsToRow6( bclotacao) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars6( bclotacao, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey066( ) ;
      if ( RcdFound6 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A22lot_id != Z22lot_id )
         {
            A22lot_id = Z22lot_id ;
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
         if ( A22lot_id != Z22lot_id )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "lotacao_bc");
      VarsToRow6( bclotacao) ;
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
      Gx_mode = bclotacao.getgxTv_Sdtlotacao_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bclotacao.setgxTv_Sdtlotacao_Mode( Gx_mode );
   }

   public void SetSDT( Sdtlotacao sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bclotacao )
      {
         bclotacao = sdt ;
         if ( GXutil.strcmp(bclotacao.getgxTv_Sdtlotacao_Mode(), "") == 0 )
         {
            bclotacao.setgxTv_Sdtlotacao_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow6( bclotacao) ;
         }
         else
         {
            RowToVars6( bclotacao, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bclotacao.getgxTv_Sdtlotacao_Mode(), "") == 0 )
         {
            bclotacao.setgxTv_Sdtlotacao_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars6( bclotacao, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public Sdtlotacao getlotacao_BC( )
   {
      return bclotacao ;
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
      Z23lot_data_lotacao = GXutil.nullDate() ;
      A23lot_data_lotacao = GXutil.nullDate() ;
      Z24lot_data_remocao = GXutil.nullDate() ;
      A24lot_data_remocao = GXutil.nullDate() ;
      Z25lot_portaria = "" ;
      A25lot_portaria = "" ;
      Z8pes_nome = "" ;
      A8pes_nome = "" ;
      Z5unid_nome = "" ;
      A5unid_nome = "" ;
      Z6unid_sigla = "" ;
      A6unid_sigla = "" ;
      BC00066_A22lot_id = new short[1] ;
      BC00066_A8pes_nome = new String[] {""} ;
      BC00066_A5unid_nome = new String[] {""} ;
      BC00066_A6unid_sigla = new String[] {""} ;
      BC00066_A23lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00066_A24lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00066_A25lot_portaria = new String[] {""} ;
      BC00066_A7pes_id = new short[1] ;
      BC00066_A4unid_id = new short[1] ;
      BC00067_A8pes_nome = new String[] {""} ;
      BC00068_A5unid_nome = new String[] {""} ;
      BC00068_A6unid_sigla = new String[] {""} ;
      BC00069_A22lot_id = new short[1] ;
      BC000610_A22lot_id = new short[1] ;
      BC000610_A23lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000610_A24lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000610_A25lot_portaria = new String[] {""} ;
      BC000610_A7pes_id = new short[1] ;
      BC000610_A4unid_id = new short[1] ;
      sMode6 = "" ;
      BC000611_A22lot_id = new short[1] ;
      BC000611_A23lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000611_A24lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000611_A25lot_portaria = new String[] {""} ;
      BC000611_A7pes_id = new short[1] ;
      BC000611_A4unid_id = new short[1] ;
      BC000613_A22lot_id = new short[1] ;
      BC000616_A8pes_nome = new String[] {""} ;
      BC000617_A5unid_nome = new String[] {""} ;
      BC000617_A6unid_sigla = new String[] {""} ;
      BC000618_A22lot_id = new short[1] ;
      BC000618_A8pes_nome = new String[] {""} ;
      BC000618_A5unid_nome = new String[] {""} ;
      BC000618_A6unid_sigla = new String[] {""} ;
      BC000618_A23lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000618_A24lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000618_A25lot_portaria = new String[] {""} ;
      BC000618_A7pes_id = new short[1] ;
      BC000618_A4unid_id = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new lotacao_bc__default(),
         new Object[] {
             new Object[] {
            BC00062_A22lot_id, BC00062_A23lot_data_lotacao, BC00062_A24lot_data_remocao, BC00062_A25lot_portaria, BC00062_A7pes_id, BC00062_A4unid_id
            }
            , new Object[] {
            BC00063_A22lot_id, BC00063_A23lot_data_lotacao, BC00063_A24lot_data_remocao, BC00063_A25lot_portaria, BC00063_A7pes_id, BC00063_A4unid_id
            }
            , new Object[] {
            BC00064_A8pes_nome
            }
            , new Object[] {
            BC00065_A5unid_nome, BC00065_A6unid_sigla
            }
            , new Object[] {
            BC00066_A22lot_id, BC00066_A8pes_nome, BC00066_A5unid_nome, BC00066_A6unid_sigla, BC00066_A23lot_data_lotacao, BC00066_A24lot_data_remocao, BC00066_A25lot_portaria, BC00066_A7pes_id, BC00066_A4unid_id
            }
            , new Object[] {
            BC00067_A8pes_nome
            }
            , new Object[] {
            BC00068_A5unid_nome, BC00068_A6unid_sigla
            }
            , new Object[] {
            BC00069_A22lot_id
            }
            , new Object[] {
            BC000610_A22lot_id, BC000610_A23lot_data_lotacao, BC000610_A24lot_data_remocao, BC000610_A25lot_portaria, BC000610_A7pes_id, BC000610_A4unid_id
            }
            , new Object[] {
            BC000611_A22lot_id, BC000611_A23lot_data_lotacao, BC000611_A24lot_data_remocao, BC000611_A25lot_portaria, BC000611_A7pes_id, BC000611_A4unid_id
            }
            , new Object[] {
            }
            , new Object[] {
            BC000613_A22lot_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000616_A8pes_nome
            }
            , new Object[] {
            BC000617_A5unid_nome, BC000617_A6unid_sigla
            }
            , new Object[] {
            BC000618_A22lot_id, BC000618_A8pes_nome, BC000618_A5unid_nome, BC000618_A6unid_sigla, BC000618_A23lot_data_lotacao, BC000618_A24lot_data_remocao, BC000618_A25lot_portaria, BC000618_A7pes_id, BC000618_A4unid_id
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
   private short Z22lot_id ;
   private short A22lot_id ;
   private short Z7pes_id ;
   private short A7pes_id ;
   private short Z4unid_id ;
   private short A4unid_id ;
   private short RcdFound6 ;
   private short nIsDirty_6 ;
   private int trnEnded ;
   private int GX_JID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode6 ;
   private java.util.Date Z23lot_data_lotacao ;
   private java.util.Date A23lot_data_lotacao ;
   private java.util.Date Z24lot_data_remocao ;
   private java.util.Date A24lot_data_remocao ;
   private boolean mustCommit ;
   private String Z25lot_portaria ;
   private String A25lot_portaria ;
   private String Z8pes_nome ;
   private String A8pes_nome ;
   private String Z5unid_nome ;
   private String A5unid_nome ;
   private String Z6unid_sigla ;
   private String A6unid_sigla ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private Sdtlotacao bclotacao ;
   private IDataStoreProvider pr_default ;
   private short[] BC00066_A22lot_id ;
   private String[] BC00066_A8pes_nome ;
   private String[] BC00066_A5unid_nome ;
   private String[] BC00066_A6unid_sigla ;
   private java.util.Date[] BC00066_A23lot_data_lotacao ;
   private java.util.Date[] BC00066_A24lot_data_remocao ;
   private String[] BC00066_A25lot_portaria ;
   private short[] BC00066_A7pes_id ;
   private short[] BC00066_A4unid_id ;
   private String[] BC00067_A8pes_nome ;
   private String[] BC00068_A5unid_nome ;
   private String[] BC00068_A6unid_sigla ;
   private short[] BC00069_A22lot_id ;
   private short[] BC000610_A22lot_id ;
   private java.util.Date[] BC000610_A23lot_data_lotacao ;
   private java.util.Date[] BC000610_A24lot_data_remocao ;
   private String[] BC000610_A25lot_portaria ;
   private short[] BC000610_A7pes_id ;
   private short[] BC000610_A4unid_id ;
   private short[] BC000611_A22lot_id ;
   private java.util.Date[] BC000611_A23lot_data_lotacao ;
   private java.util.Date[] BC000611_A24lot_data_remocao ;
   private String[] BC000611_A25lot_portaria ;
   private short[] BC000611_A7pes_id ;
   private short[] BC000611_A4unid_id ;
   private short[] BC000613_A22lot_id ;
   private String[] BC000616_A8pes_nome ;
   private String[] BC000617_A5unid_nome ;
   private String[] BC000617_A6unid_sigla ;
   private short[] BC000618_A22lot_id ;
   private String[] BC000618_A8pes_nome ;
   private String[] BC000618_A5unid_nome ;
   private String[] BC000618_A6unid_sigla ;
   private java.util.Date[] BC000618_A23lot_data_lotacao ;
   private java.util.Date[] BC000618_A24lot_data_remocao ;
   private String[] BC000618_A25lot_portaria ;
   private short[] BC000618_A7pes_id ;
   private short[] BC000618_A4unid_id ;
   private short[] BC00062_A22lot_id ;
   private java.util.Date[] BC00062_A23lot_data_lotacao ;
   private java.util.Date[] BC00062_A24lot_data_remocao ;
   private String[] BC00062_A25lot_portaria ;
   private short[] BC00062_A7pes_id ;
   private short[] BC00062_A4unid_id ;
   private short[] BC00063_A22lot_id ;
   private java.util.Date[] BC00063_A23lot_data_lotacao ;
   private java.util.Date[] BC00063_A24lot_data_remocao ;
   private String[] BC00063_A25lot_portaria ;
   private short[] BC00063_A7pes_id ;
   private short[] BC00063_A4unid_id ;
   private String[] BC00064_A8pes_nome ;
   private String[] BC00065_A5unid_nome ;
   private String[] BC00065_A6unid_sigla ;
}

final  class lotacao_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00062", "SELECT lot_id, lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id FROM lotacao WHERE lot_id = ?  FOR UPDATE OF lotacao",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00063", "SELECT lot_id, lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id FROM lotacao WHERE lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00064", "SELECT pes_nome FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00065", "SELECT unid_nome, unid_sigla FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00066", "SELECT TM1.lot_id, T2.pes_nome, T3.unid_nome, T3.unid_sigla, TM1.lot_data_lotacao, TM1.lot_data_remocao, TM1.lot_portaria, TM1.pes_id, TM1.unid_id FROM ((lotacao TM1 INNER JOIN pessoa T2 ON T2.pes_id = TM1.pes_id) INNER JOIN unidade T3 ON T3.unid_id = TM1.unid_id) WHERE TM1.lot_id = ? ORDER BY TM1.lot_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00067", "SELECT pes_nome FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00068", "SELECT unid_nome, unid_sigla FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00069", "SELECT lot_id FROM lotacao WHERE lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000610", "SELECT lot_id, lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id FROM lotacao WHERE lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000611", "SELECT lot_id, lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id FROM lotacao WHERE lot_id = ?  FOR UPDATE OF lotacao",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000612", "SAVEPOINT gxupdate;INSERT INTO lotacao(lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id) VALUES(?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000613", "SELECT currval('lot_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000614", "SAVEPOINT gxupdate;UPDATE lotacao SET lot_data_lotacao=?, lot_data_remocao=?, lot_portaria=?, pes_id=?, unid_id=?  WHERE lot_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000615", "SAVEPOINT gxupdate;DELETE FROM lotacao  WHERE lot_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000616", "SELECT pes_nome FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000617", "SELECT unid_nome, unid_sigla FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000618", "SELECT TM1.lot_id, T2.pes_nome, T3.unid_nome, T3.unid_sigla, TM1.lot_data_lotacao, TM1.lot_data_remocao, TM1.lot_portaria, TM1.pes_id, TM1.unid_id FROM ((lotacao TM1 INNER JOIN pessoa T2 ON T2.pes_id = TM1.pes_id) INNER JOIN unidade T3 ON T3.unid_id = TM1.unid_id) WHERE TM1.lot_id = ? ORDER BY TM1.lot_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               return;
            case 16 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 10 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 12 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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

