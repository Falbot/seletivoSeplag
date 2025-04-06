import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lotacao_impl extends GXDataArea
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      gxfirstwebparm_bkp = gxfirstwebparm ;
      gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         dyncall( httpContext.GetNextPar( )) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A7pes_id = (short)(GXutil.lval( httpContext.GetPar( "pes_id"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A7pes_id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A4unid_id = (short)(GXutil.lval( httpContext.GetPar( "unid_id"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4unid_id), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A4unid_id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
      {
         httpContext.setAjaxEventMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else
      {
         if ( ! httpContext.IsValidAjaxCall( false) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = gxfirstwebparm_bkp ;
      }
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_web_controls( ) ;
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_9-159740", (short)(0)) ;
         }
         Form.getMeta().addItem("description", "lotacao", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtlot_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public lotacao_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lotacao_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lotacao_impl.class ));
   }

   public lotacao_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "rwdmasterpage");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
            }
            if ( ! httpContext.willRedirect( ) )
            {
               addString( httpContext.getJSONResponse( )) ;
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public void fix_multi_value_controls( )
   {
   }

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         drawControls( ) ;
         fix_multi_value_controls( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void drawControls( )
   {
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "WWAdvancedContainer", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "lotacao", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_lotacao.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, divToolbarcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 ToolbarCellClass", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "BtnFirst" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_lotacao.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_lotacao.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_lotacao.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_lotacao.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Selecionar", bttBtn_select_Jsonclick, 5, "Selecionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_lotacao.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCellAdvanced", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtlot_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtlot_id_Internalname, "lot_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      GxWebStd.gx_single_line_edit( httpContext, edtlot_id_Internalname, GXutil.ltrim( localUtil.ntoc( A22lot_id, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( ((edtlot_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A22lot_id), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A22lot_id), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtlot_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtlot_id_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_lotacao.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtpes_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtpes_id_Internalname, "pes_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      GxWebStd.gx_single_line_edit( httpContext, edtpes_id_Internalname, GXutil.ltrim( localUtil.ntoc( A7pes_id, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( ((edtpes_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7pes_id), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7pes_id), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtpes_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtpes_id_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_lotacao.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtpes_nome_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtpes_nome_Internalname, "pes_nome", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GxWebStd.gx_html_textarea( httpContext, edtpes_nome_Internalname, A8pes_nome, "", "", (short)(0), 1, edtpes_nome_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_lotacao.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtunid_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtunid_id_Internalname, "unid_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      GxWebStd.gx_single_line_edit( httpContext, edtunid_id_Internalname, GXutil.ltrim( localUtil.ntoc( A4unid_id, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( ((edtunid_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4unid_id), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4unid_id), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtunid_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtunid_id_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_lotacao.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtunid_nome_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtunid_nome_Internalname, "unid_nome", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GxWebStd.gx_html_textarea( httpContext, edtunid_nome_Internalname, A5unid_nome, "", "", (short)(0), 1, edtunid_nome_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_lotacao.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtunid_sigla_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtunid_sigla_Internalname, "unid_sigla", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      GxWebStd.gx_single_line_edit( httpContext, edtunid_sigla_Internalname, A6unid_sigla, GXutil.rtrim( localUtil.format( A6unid_sigla, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtunid_sigla_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtunid_sigla_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_lotacao.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtlot_data_lotacao_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtlot_data_lotacao_Internalname, "lot_data_lotacao", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtlot_data_lotacao_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      GxWebStd.gx_single_line_edit( httpContext, edtlot_data_lotacao_Internalname, localUtil.format(A23lot_data_lotacao, "99/99/9999"), localUtil.format( A23lot_data_lotacao, "99/99/9999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'DMY',0,24,'por',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',0,24,'por',false,0);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtlot_data_lotacao_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtlot_data_lotacao_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_lotacao.htm");
      GxWebStd.gx_bitmap( httpContext, edtlot_data_lotacao_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtlot_data_lotacao_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_lotacao.htm");
      httpContext.writeTextNL( "</div>") ;
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtlot_data_remocao_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtlot_data_remocao_Internalname, "lot_data_remocao", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtlot_data_remocao_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      GxWebStd.gx_single_line_edit( httpContext, edtlot_data_remocao_Internalname, localUtil.format(A24lot_data_remocao, "99/99/9999"), localUtil.format( A24lot_data_remocao, "99/99/9999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'DMY',0,24,'por',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',0,24,'por',false,0);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtlot_data_remocao_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtlot_data_remocao_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_lotacao.htm");
      GxWebStd.gx_bitmap( httpContext, edtlot_data_remocao_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtlot_data_remocao_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_lotacao.htm");
      httpContext.writeTextNL( "</div>") ;
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtlot_portaria_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtlot_portaria_Internalname, "lot_portaria", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      GxWebStd.gx_single_line_edit( httpContext, edtlot_portaria_Internalname, A25lot_portaria, GXutil.rtrim( localUtil.format( A25lot_portaria, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtlot_portaria_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtlot_portaria_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_lotacao.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_lotacao.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Fechar", bttBtn_cancel_Jsonclick, 1, "Fechar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_lotacao.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_lotacao.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z22lot_id = (short)(localUtil.ctol( httpContext.cgiGet( "Z22lot_id"), ",", ".")) ;
         Z23lot_data_lotacao = localUtil.ctod( httpContext.cgiGet( "Z23lot_data_lotacao"), 0) ;
         Z24lot_data_remocao = localUtil.ctod( httpContext.cgiGet( "Z24lot_data_remocao"), 0) ;
         Z25lot_portaria = httpContext.cgiGet( "Z25lot_portaria") ;
         Z7pes_id = (short)(localUtil.ctol( httpContext.cgiGet( "Z7pes_id"), ",", ".")) ;
         Z4unid_id = (short)(localUtil.ctol( httpContext.cgiGet( "Z4unid_id"), ",", ".")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtlot_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtlot_id_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LOT_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtlot_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A22lot_id = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A22lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A22lot_id), 4, 0));
         }
         else
         {
            A22lot_id = (short)(localUtil.ctol( httpContext.cgiGet( edtlot_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A22lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A22lot_id), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtpes_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtpes_id_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PES_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtpes_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7pes_id = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
         }
         else
         {
            A7pes_id = (short)(localUtil.ctol( httpContext.cgiGet( edtpes_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
         }
         A8pes_nome = GXutil.upper( httpContext.cgiGet( edtpes_nome_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtunid_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtunid_id_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UNID_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtunid_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4unid_id = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4unid_id), 4, 0));
         }
         else
         {
            A4unid_id = (short)(localUtil.ctol( httpContext.cgiGet( edtunid_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4unid_id), 4, 0));
         }
         A5unid_nome = GXutil.upper( httpContext.cgiGet( edtunid_nome_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5unid_nome", A5unid_nome);
         A6unid_sigla = GXutil.upper( httpContext.cgiGet( edtunid_sigla_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6unid_sigla", A6unid_sigla);
         if ( localUtil.vcdate( httpContext.cgiGet( edtlot_data_lotacao_Internalname), (byte)(3)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LOT_DATA_LOTACAO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtlot_data_lotacao_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A23lot_data_lotacao = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A23lot_data_lotacao", localUtil.format(A23lot_data_lotacao, "99/99/9999"));
         }
         else
         {
            A23lot_data_lotacao = localUtil.ctod( httpContext.cgiGet( edtlot_data_lotacao_Internalname), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "A23lot_data_lotacao", localUtil.format(A23lot_data_lotacao, "99/99/9999"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtlot_data_remocao_Internalname), (byte)(3)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LOT_DATA_REMOCAO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtlot_data_remocao_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A24lot_data_remocao = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A24lot_data_remocao", localUtil.format(A24lot_data_remocao, "99/99/9999"));
         }
         else
         {
            A24lot_data_remocao = localUtil.ctod( httpContext.cgiGet( edtlot_data_remocao_Internalname), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "A24lot_data_remocao", localUtil.format(A24lot_data_remocao, "99/99/9999"));
         }
         A25lot_portaria = GXutil.upper( httpContext.cgiGet( edtlot_portaria_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A25lot_portaria", A25lot_portaria);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         standaloneNotModal( ) ;
      }
      else
      {
         standaloneNotModal( ) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
         {
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            A22lot_id = (short)(GXutil.lval( httpContext.GetPar( "lot_id"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A22lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A22lot_id), 4, 0));
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons_dsp( ) ;
            standaloneModal( ) ;
         }
         else
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            standaloneModal( ) ;
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
         sEvt = httpContext.cgiGet( "_EventName") ;
         EvtGridId = httpContext.cgiGet( "_EventGridId") ;
         EvtRowId = httpContext.cgiGet( "_EventRowId") ;
         if ( GXutil.len( sEvt) > 0 )
         {
            sEvtType = GXutil.left( sEvt, 1) ;
            sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
            if ( GXutil.strcmp(sEvtType, "M") != 0 )
            {
               if ( GXutil.strcmp(sEvtType, "E") == 0 )
               {
                  sEvtType = GXutil.right( sEvt, 1) ;
                  if ( GXutil.strcmp(sEvtType, ".") == 0 )
                  {
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
                     }
                  }
                  else
                  {
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
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
            /* Clear variables for new insertion. */
            initAll066( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
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

   public void disable_std_buttons( )
   {
      if ( isIns( ) )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_first_Visible), 5, 0), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_previous_Visible), 5, 0), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_next_Visible), 5, 0), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_last_Visible), 5, 0), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_select_Visible), 5, 0), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributes066( ) ;
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( isDlt( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void resetCaption060( )
   {
   }

   public void zm066( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z23lot_data_lotacao = T00063_A23lot_data_lotacao[0] ;
            Z24lot_data_remocao = T00063_A24lot_data_remocao[0] ;
            Z25lot_portaria = T00063_A25lot_portaria[0] ;
            Z7pes_id = T00063_A7pes_id[0] ;
            Z4unid_id = T00063_A4unid_id[0] ;
         }
         else
         {
            Z23lot_data_lotacao = A23lot_data_lotacao ;
            Z24lot_data_remocao = A24lot_data_remocao ;
            Z25lot_portaria = A25lot_portaria ;
            Z7pes_id = A7pes_id ;
            Z4unid_id = A4unid_id ;
         }
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
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
   }

   public void load066( )
   {
      /* Using cursor T00066 */
      pr_default.execute(4, new Object[] {Short.valueOf(A22lot_id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A8pes_nome = T00066_A8pes_nome[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
         A5unid_nome = T00066_A5unid_nome[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5unid_nome", A5unid_nome);
         A6unid_sigla = T00066_A6unid_sigla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6unid_sigla", A6unid_sigla);
         A23lot_data_lotacao = T00066_A23lot_data_lotacao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A23lot_data_lotacao", localUtil.format(A23lot_data_lotacao, "99/99/9999"));
         A24lot_data_remocao = T00066_A24lot_data_remocao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A24lot_data_remocao", localUtil.format(A24lot_data_remocao, "99/99/9999"));
         A25lot_portaria = T00066_A25lot_portaria[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A25lot_portaria", A25lot_portaria);
         A7pes_id = T00066_A7pes_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
         A4unid_id = T00066_A4unid_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4unid_id), 4, 0));
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
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00064 */
      pr_default.execute(2, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtpes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8pes_nome = T00064_A8pes_nome[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
      pr_default.close(2);
      /* Using cursor T00065 */
      pr_default.execute(3, new Object[] {Short.valueOf(A4unid_id)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A5unid_nome = T00065_A5unid_nome[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5unid_nome", A5unid_nome);
      A6unid_sigla = T00065_A6unid_sigla[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6unid_sigla", A6unid_sigla);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors066( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( short A7pes_id )
   {
      /* Using cursor T00067 */
      pr_default.execute(5, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtpes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8pes_nome = T00067_A8pes_nome[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A8pes_nome)+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_3( short A4unid_id )
   {
      /* Using cursor T00068 */
      pr_default.execute(6, new Object[] {Short.valueOf(A4unid_id)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A5unid_nome = T00068_A5unid_nome[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5unid_nome", A5unid_nome);
      A6unid_sigla = T00068_A6unid_sigla[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6unid_sigla", A6unid_sigla);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A5unid_nome)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A6unid_sigla)+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey066( )
   {
      /* Using cursor T00069 */
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
      /* Using cursor T00063 */
      pr_default.execute(1, new Object[] {Short.valueOf(A22lot_id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm066( 1) ;
         RcdFound6 = (short)(1) ;
         A22lot_id = T00063_A22lot_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A22lot_id), 4, 0));
         A23lot_data_lotacao = T00063_A23lot_data_lotacao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A23lot_data_lotacao", localUtil.format(A23lot_data_lotacao, "99/99/9999"));
         A24lot_data_remocao = T00063_A24lot_data_remocao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A24lot_data_remocao", localUtil.format(A24lot_data_remocao, "99/99/9999"));
         A25lot_portaria = T00063_A25lot_portaria[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A25lot_portaria", A25lot_portaria);
         A7pes_id = T00063_A7pes_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
         A4unid_id = T00063_A4unid_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4unid_id), 4, 0));
         Z22lot_id = A22lot_id ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load066( ) ;
         if ( AnyError == 1 )
         {
            RcdFound6 = (short)(0) ;
            initializeNonKey066( ) ;
         }
         Gx_mode = sMode6 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound6 = (short)(0) ;
         initializeNonKey066( ) ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode6 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey066( ) ;
      if ( RcdFound6 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound6 = (short)(0) ;
      /* Using cursor T000610 */
      pr_default.execute(8, new Object[] {Short.valueOf(A22lot_id)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T000610_A22lot_id[0] < A22lot_id ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T000610_A22lot_id[0] > A22lot_id ) ) )
         {
            A22lot_id = T000610_A22lot_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A22lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A22lot_id), 4, 0));
            RcdFound6 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound6 = (short)(0) ;
      /* Using cursor T000611 */
      pr_default.execute(9, new Object[] {Short.valueOf(A22lot_id)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T000611_A22lot_id[0] > A22lot_id ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T000611_A22lot_id[0] < A22lot_id ) ) )
         {
            A22lot_id = T000611_A22lot_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A22lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A22lot_id), 4, 0));
            RcdFound6 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey066( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtlot_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert066( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound6 == 1 )
         {
            if ( A22lot_id != Z22lot_id )
            {
               A22lot_id = Z22lot_id ;
               httpContext.ajax_rsp_assign_attri("", false, "A22lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A22lot_id), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "LOT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtlot_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtlot_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update066( ) ;
               GX_FocusControl = edtlot_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A22lot_id != Z22lot_id )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtlot_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert066( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "LOT_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtlot_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtlot_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert066( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( A22lot_id != Z22lot_id )
      {
         A22lot_id = Z22lot_id ;
         httpContext.ajax_rsp_assign_attri("", false, "A22lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A22lot_id), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "LOT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtlot_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtlot_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound6 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "LOT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtlot_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtpes_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart066( ) ;
      if ( RcdFound6 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtpes_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd066( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_previous( ) ;
      if ( RcdFound6 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtpes_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_next( ) ;
      if ( RcdFound6 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtpes_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart066( ) ;
      if ( RcdFound6 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound6 != 0 )
         {
            scanNext066( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtpes_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd066( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency066( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00062 */
         pr_default.execute(0, new Object[] {Short.valueOf(A22lot_id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"lotacao"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z23lot_data_lotacao), GXutil.resetTime(T00062_A23lot_data_lotacao[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z24lot_data_remocao), GXutil.resetTime(T00062_A24lot_data_remocao[0])) ) || ( GXutil.strcmp(Z25lot_portaria, T00062_A25lot_portaria[0]) != 0 ) || ( Z7pes_id != T00062_A7pes_id[0] ) || ( Z4unid_id != T00062_A4unid_id[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z23lot_data_lotacao), GXutil.resetTime(T00062_A23lot_data_lotacao[0])) ) )
            {
               GXutil.writeLogln("lotacao:[seudo value changed for attri]"+"lot_data_lotacao");
               GXutil.writeLogRaw("Old: ",Z23lot_data_lotacao);
               GXutil.writeLogRaw("Current: ",T00062_A23lot_data_lotacao[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z24lot_data_remocao), GXutil.resetTime(T00062_A24lot_data_remocao[0])) ) )
            {
               GXutil.writeLogln("lotacao:[seudo value changed for attri]"+"lot_data_remocao");
               GXutil.writeLogRaw("Old: ",Z24lot_data_remocao);
               GXutil.writeLogRaw("Current: ",T00062_A24lot_data_remocao[0]);
            }
            if ( GXutil.strcmp(Z25lot_portaria, T00062_A25lot_portaria[0]) != 0 )
            {
               GXutil.writeLogln("lotacao:[seudo value changed for attri]"+"lot_portaria");
               GXutil.writeLogRaw("Old: ",Z25lot_portaria);
               GXutil.writeLogRaw("Current: ",T00062_A25lot_portaria[0]);
            }
            if ( Z7pes_id != T00062_A7pes_id[0] )
            {
               GXutil.writeLogln("lotacao:[seudo value changed for attri]"+"pes_id");
               GXutil.writeLogRaw("Old: ",Z7pes_id);
               GXutil.writeLogRaw("Current: ",T00062_A7pes_id[0]);
            }
            if ( Z4unid_id != T00062_A4unid_id[0] )
            {
               GXutil.writeLogln("lotacao:[seudo value changed for attri]"+"unid_id");
               GXutil.writeLogRaw("Old: ",Z4unid_id);
               GXutil.writeLogRaw("Current: ",T00062_A4unid_id[0]);
            }
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
                  /* Using cursor T000612 */
                  pr_default.execute(10, new Object[] {A23lot_data_lotacao, A24lot_data_remocao, A25lot_portaria, Short.valueOf(A7pes_id), Short.valueOf(A4unid_id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000613 */
                  pr_default.execute(11);
                  A22lot_id = T000613_A22lot_id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A22lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A22lot_id), 4, 0));
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
                        resetCaption060( ) ;
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
                  /* Using cursor T000614 */
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
                        resetCaption060( ) ;
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
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
               /* Using cursor T000615 */
               pr_default.execute(13, new Object[] {Short.valueOf(A22lot_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("lotacao");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound6 == 0 )
                     {
                        initAll066( ) ;
                        Gx_mode = "INS" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                     resetCaption060( ) ;
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
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel066( ) ;
      Gx_mode = sMode6 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls066( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000616 */
         pr_default.execute(14, new Object[] {Short.valueOf(A7pes_id)});
         A8pes_nome = T000616_A8pes_nome[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
         pr_default.close(14);
         /* Using cursor T000617 */
         pr_default.execute(15, new Object[] {Short.valueOf(A4unid_id)});
         A5unid_nome = T000617_A5unid_nome[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5unid_nome", A5unid_nome);
         A6unid_sigla = T000617_A6unid_sigla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6unid_sigla", A6unid_sigla);
         pr_default.close(15);
      }
   }

   public void endLevel066( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete066( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "lotacao");
         if ( AnyError == 0 )
         {
            confirmValues060( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "lotacao");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart066( )
   {
      /* Using cursor T000618 */
      pr_default.execute(16);
      RcdFound6 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A22lot_id = T000618_A22lot_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A22lot_id), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext066( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound6 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A22lot_id = T000618_A22lot_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A22lot_id), 4, 0));
      }
   }

   public void scanEnd066( )
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
      edtlot_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtlot_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlot_id_Enabled), 5, 0), true);
      edtpes_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtpes_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtpes_id_Enabled), 5, 0), true);
      edtpes_nome_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtpes_nome_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtpes_nome_Enabled), 5, 0), true);
      edtunid_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtunid_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtunid_id_Enabled), 5, 0), true);
      edtunid_nome_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtunid_nome_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtunid_nome_Enabled), 5, 0), true);
      edtunid_sigla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtunid_sigla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtunid_sigla_Enabled), 5, 0), true);
      edtlot_data_lotacao_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtlot_data_lotacao_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlot_data_lotacao_Enabled), 5, 0), true);
      edtlot_data_remocao_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtlot_data_remocao_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlot_data_remocao_Enabled), 5, 0), true);
      edtlot_portaria_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtlot_portaria_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlot_portaria_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes066( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues060( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
      httpContext.writeTextNL( "</title>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      MasterPageObj.master_styles();
      if ( ( ( httpContext.getBrowserType( ) == 1 ) || ( httpContext.getBrowserType( ) == 5 ) ) && ( GXutil.strcmp(httpContext.getBrowserVersion( ), "7.0") == 0 ) )
      {
         httpContext.AddJavascriptSource("json2.js", "?"+httpContext.getBuildNumber( 204420), false, true);
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 204420), false, true);
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 204420), false, true);
      httpContext.AddJavascriptSource("gxcfg.js", "?20254215303699", false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 204420), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 204420), false, true);
      httpContext.AddJavascriptSource("calendar-pt.js", "?"+httpContext.getBuildNumber( 204420), false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      bodyStyle += "-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("lotacao", new String[] {}, new String[] {}) +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      GxWebStd.gx_hidden_field( httpContext, "Z22lot_id", GXutil.ltrim( localUtil.ntoc( Z22lot_id, (byte)(4), (byte)(0), ",", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z23lot_data_lotacao", localUtil.dtoc( Z23lot_data_lotacao, 0, "/"));
      GxWebStd.gx_hidden_field( httpContext, "Z24lot_data_remocao", localUtil.dtoc( Z24lot_data_remocao, 0, "/"));
      GxWebStd.gx_hidden_field( httpContext, "Z25lot_portaria", Z25lot_portaria);
      GxWebStd.gx_hidden_field( httpContext, "Z7pes_id", GXutil.ltrim( localUtil.ntoc( Z7pes_id, (byte)(4), (byte)(0), ",", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z4unid_id", GXutil.ltrim( localUtil.ntoc( Z4unid_id, (byte)(4), (byte)(0), ",", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      httpContext.writeTextNL( "</form>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      include_jscripts( ) ;
   }

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
      httpContext.writeText( ">") ;
      draw( ) ;
      httpContext.writeText( "</div>") ;
   }

   public void dispatchEvents( )
   {
      process( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("lotacao", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "lotacao" ;
   }

   public String getPgmdesc( )
   {
      return "lotacao" ;
   }

   public void initializeNonKey066( )
   {
      A7pes_id = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
      A8pes_nome = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
      A4unid_id = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4unid_id), 4, 0));
      A5unid_nome = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5unid_nome", A5unid_nome);
      A6unid_sigla = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6unid_sigla", A6unid_sigla);
      A23lot_data_lotacao = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A23lot_data_lotacao", localUtil.format(A23lot_data_lotacao, "99/99/9999"));
      A24lot_data_remocao = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A24lot_data_remocao", localUtil.format(A24lot_data_remocao, "99/99/9999"));
      A25lot_portaria = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A25lot_portaria", A25lot_portaria);
      Z23lot_data_lotacao = GXutil.nullDate() ;
      Z24lot_data_remocao = GXutil.nullDate() ;
      Z25lot_portaria = "" ;
      Z7pes_id = (short)(0) ;
      Z4unid_id = (short)(0) ;
   }

   public void initAll066( )
   {
      A22lot_id = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A22lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A22lot_id), 4, 0));
      initializeNonKey066( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2025421530376", true, true);
         idxLst = (int)(idxLst+1) ;
      }
      if ( ! outputEnabled )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.por.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("lotacao.js", "?2025421530377", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      divToolbarcell_Internalname = "TOOLBARCELL" ;
      edtlot_id_Internalname = "LOT_ID" ;
      edtpes_id_Internalname = "PES_ID" ;
      edtpes_nome_Internalname = "PES_NOME" ;
      edtunid_id_Internalname = "UNID_ID" ;
      edtunid_nome_Internalname = "UNID_NOME" ;
      edtunid_sigla_Internalname = "UNID_SIGLA" ;
      edtlot_data_lotacao_Internalname = "LOT_DATA_LOTACAO" ;
      edtlot_data_remocao_Internalname = "LOT_DATA_REMOCAO" ;
      edtlot_portaria_Internalname = "LOT_PORTARIA" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("Carmine");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "lotacao" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtlot_portaria_Jsonclick = "" ;
      edtlot_portaria_Enabled = 1 ;
      edtlot_data_remocao_Jsonclick = "" ;
      edtlot_data_remocao_Enabled = 1 ;
      edtlot_data_lotacao_Jsonclick = "" ;
      edtlot_data_lotacao_Enabled = 1 ;
      edtunid_sigla_Jsonclick = "" ;
      edtunid_sigla_Enabled = 0 ;
      edtunid_nome_Enabled = 0 ;
      edtunid_id_Jsonclick = "" ;
      edtunid_id_Enabled = 1 ;
      edtpes_nome_Enabled = 0 ;
      edtpes_id_Jsonclick = "" ;
      edtpes_id_Enabled = 1 ;
      edtlot_id_Jsonclick = "" ;
      edtlot_id_Enabled = 1 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      GX_FocusControl = edtpes_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
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

   public void valid_Lot_id( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrim( localUtil.ntoc( A7pes_id, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4unid_id", GXutil.ltrim( localUtil.ntoc( A4unid_id, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A23lot_data_lotacao", localUtil.format(A23lot_data_lotacao, "99/99/9999"));
      httpContext.ajax_rsp_assign_attri("", false, "A24lot_data_remocao", localUtil.format(A24lot_data_remocao, "99/99/9999"));
      httpContext.ajax_rsp_assign_attri("", false, "A25lot_portaria", A25lot_portaria);
      httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
      httpContext.ajax_rsp_assign_attri("", false, "A5unid_nome", A5unid_nome);
      httpContext.ajax_rsp_assign_attri("", false, "A6unid_sigla", A6unid_sigla);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "Z22lot_id", GXutil.ltrim( localUtil.ntoc( Z22lot_id, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z7pes_id", GXutil.ltrim( localUtil.ntoc( Z7pes_id, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z4unid_id", GXutil.ltrim( localUtil.ntoc( Z4unid_id, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z23lot_data_lotacao", localUtil.format(Z23lot_data_lotacao, "99/99/9999"));
      GxWebStd.gx_hidden_field( httpContext, "Z24lot_data_remocao", localUtil.format(Z24lot_data_remocao, "99/99/9999"));
      GxWebStd.gx_hidden_field( httpContext, "Z25lot_portaria", Z25lot_portaria);
      GxWebStd.gx_hidden_field( httpContext, "Z8pes_nome", Z8pes_nome);
      GxWebStd.gx_hidden_field( httpContext, "Z5unid_nome", Z5unid_nome);
      GxWebStd.gx_hidden_field( httpContext, "Z6unid_sigla", Z6unid_sigla);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Pes_id( )
   {
      /* Using cursor T000616 */
      pr_default.execute(14, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtpes_id_Internalname ;
      }
      A8pes_nome = T000616_A8pes_nome[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
   }

   public void valid_Unid_id( )
   {
      /* Using cursor T000617 */
      pr_default.execute(15, new Object[] {Short.valueOf(A4unid_id)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunid_id_Internalname ;
      }
      A5unid_nome = T000617_A5unid_nome[0] ;
      A6unid_sigla = T000617_A6unid_sigla[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5unid_nome", A5unid_nome);
      httpContext.ajax_rsp_assign_attri("", false, "A6unid_sigla", A6unid_sigla);
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_LOT_ID","{handler:'valid_Lot_id',iparms:[{av:'A22lot_id',fld:'LOT_ID',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_LOT_ID",",oparms:[{av:'A7pes_id',fld:'PES_ID',pic:'ZZZ9'},{av:'A4unid_id',fld:'UNID_ID',pic:'ZZZ9'},{av:'A23lot_data_lotacao',fld:'LOT_DATA_LOTACAO',pic:''},{av:'A24lot_data_remocao',fld:'LOT_DATA_REMOCAO',pic:''},{av:'A25lot_portaria',fld:'LOT_PORTARIA',pic:'@!'},{av:'A8pes_nome',fld:'PES_NOME',pic:'@!'},{av:'A5unid_nome',fld:'UNID_NOME',pic:'@!'},{av:'A6unid_sigla',fld:'UNID_SIGLA',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z22lot_id'},{av:'Z7pes_id'},{av:'Z4unid_id'},{av:'Z23lot_data_lotacao'},{av:'Z24lot_data_remocao'},{av:'Z25lot_portaria'},{av:'Z8pes_nome'},{av:'Z5unid_nome'},{av:'Z6unid_sigla'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_PES_ID","{handler:'valid_Pes_id',iparms:[{av:'A7pes_id',fld:'PES_ID',pic:'ZZZ9'},{av:'A8pes_nome',fld:'PES_NOME',pic:'@!'}]");
      setEventMetadata("VALID_PES_ID",",oparms:[{av:'A8pes_nome',fld:'PES_NOME',pic:'@!'}]}");
      setEventMetadata("VALID_UNID_ID","{handler:'valid_Unid_id',iparms:[{av:'A4unid_id',fld:'UNID_ID',pic:'ZZZ9'},{av:'A5unid_nome',fld:'UNID_NOME',pic:'@!'},{av:'A6unid_sigla',fld:'UNID_SIGLA',pic:'@!'}]");
      setEventMetadata("VALID_UNID_ID",",oparms:[{av:'A5unid_nome',fld:'UNID_NOME',pic:'@!'},{av:'A6unid_sigla',fld:'UNID_SIGLA',pic:'@!'}]}");
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(14);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z23lot_data_lotacao = GXutil.nullDate() ;
      Z24lot_data_remocao = GXutil.nullDate() ;
      Z25lot_portaria = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A8pes_nome = "" ;
      A5unid_nome = "" ;
      A6unid_sigla = "" ;
      A23lot_data_lotacao = GXutil.nullDate() ;
      A24lot_data_remocao = GXutil.nullDate() ;
      A25lot_portaria = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z8pes_nome = "" ;
      Z5unid_nome = "" ;
      Z6unid_sigla = "" ;
      T00066_A22lot_id = new short[1] ;
      T00066_A8pes_nome = new String[] {""} ;
      T00066_A5unid_nome = new String[] {""} ;
      T00066_A6unid_sigla = new String[] {""} ;
      T00066_A23lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      T00066_A24lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      T00066_A25lot_portaria = new String[] {""} ;
      T00066_A7pes_id = new short[1] ;
      T00066_A4unid_id = new short[1] ;
      T00064_A8pes_nome = new String[] {""} ;
      T00065_A5unid_nome = new String[] {""} ;
      T00065_A6unid_sigla = new String[] {""} ;
      T00067_A8pes_nome = new String[] {""} ;
      T00068_A5unid_nome = new String[] {""} ;
      T00068_A6unid_sigla = new String[] {""} ;
      T00069_A22lot_id = new short[1] ;
      T00063_A22lot_id = new short[1] ;
      T00063_A23lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      T00063_A24lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      T00063_A25lot_portaria = new String[] {""} ;
      T00063_A7pes_id = new short[1] ;
      T00063_A4unid_id = new short[1] ;
      sMode6 = "" ;
      T000610_A22lot_id = new short[1] ;
      T000611_A22lot_id = new short[1] ;
      T00062_A22lot_id = new short[1] ;
      T00062_A23lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      T00062_A24lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      T00062_A25lot_portaria = new String[] {""} ;
      T00062_A7pes_id = new short[1] ;
      T00062_A4unid_id = new short[1] ;
      T000613_A22lot_id = new short[1] ;
      T000616_A8pes_nome = new String[] {""} ;
      T000617_A5unid_nome = new String[] {""} ;
      T000617_A6unid_sigla = new String[] {""} ;
      T000618_A22lot_id = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ23lot_data_lotacao = GXutil.nullDate() ;
      ZZ24lot_data_remocao = GXutil.nullDate() ;
      ZZ25lot_portaria = "" ;
      ZZ8pes_nome = "" ;
      ZZ5unid_nome = "" ;
      ZZ6unid_sigla = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new lotacao__default(),
         new Object[] {
             new Object[] {
            T00062_A22lot_id, T00062_A23lot_data_lotacao, T00062_A24lot_data_remocao, T00062_A25lot_portaria, T00062_A7pes_id, T00062_A4unid_id
            }
            , new Object[] {
            T00063_A22lot_id, T00063_A23lot_data_lotacao, T00063_A24lot_data_remocao, T00063_A25lot_portaria, T00063_A7pes_id, T00063_A4unid_id
            }
            , new Object[] {
            T00064_A8pes_nome
            }
            , new Object[] {
            T00065_A5unid_nome, T00065_A6unid_sigla
            }
            , new Object[] {
            T00066_A22lot_id, T00066_A8pes_nome, T00066_A5unid_nome, T00066_A6unid_sigla, T00066_A23lot_data_lotacao, T00066_A24lot_data_remocao, T00066_A25lot_portaria, T00066_A7pes_id, T00066_A4unid_id
            }
            , new Object[] {
            T00067_A8pes_nome
            }
            , new Object[] {
            T00068_A5unid_nome, T00068_A6unid_sigla
            }
            , new Object[] {
            T00069_A22lot_id
            }
            , new Object[] {
            T000610_A22lot_id
            }
            , new Object[] {
            T000611_A22lot_id
            }
            , new Object[] {
            }
            , new Object[] {
            T000613_A22lot_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000616_A8pes_nome
            }
            , new Object[] {
            T000617_A5unid_nome, T000617_A6unid_sigla
            }
            , new Object[] {
            T000618_A22lot_id
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z22lot_id ;
   private short Z7pes_id ;
   private short Z4unid_id ;
   private short A7pes_id ;
   private short A4unid_id ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A22lot_id ;
   private short RcdFound6 ;
   private short nIsDirty_6 ;
   private short ZZ22lot_id ;
   private short ZZ7pes_id ;
   private short ZZ4unid_id ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtlot_id_Enabled ;
   private int edtpes_id_Enabled ;
   private int edtpes_nome_Enabled ;
   private int edtunid_id_Enabled ;
   private int edtunid_nome_Enabled ;
   private int edtunid_sigla_Enabled ;
   private int edtlot_data_lotacao_Enabled ;
   private int edtlot_data_remocao_Enabled ;
   private int edtlot_portaria_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtlot_id_Internalname ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divFormcontainer_Internalname ;
   private String divToolbarcell_Internalname ;
   private String TempTags ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String edtlot_id_Jsonclick ;
   private String edtpes_id_Internalname ;
   private String edtpes_id_Jsonclick ;
   private String edtpes_nome_Internalname ;
   private String edtunid_id_Internalname ;
   private String edtunid_id_Jsonclick ;
   private String edtunid_nome_Internalname ;
   private String edtunid_sigla_Internalname ;
   private String edtunid_sigla_Jsonclick ;
   private String edtlot_data_lotacao_Internalname ;
   private String edtlot_data_lotacao_Jsonclick ;
   private String edtlot_data_remocao_Internalname ;
   private String edtlot_data_remocao_Jsonclick ;
   private String edtlot_portaria_Internalname ;
   private String edtlot_portaria_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode6 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z23lot_data_lotacao ;
   private java.util.Date Z24lot_data_remocao ;
   private java.util.Date A23lot_data_lotacao ;
   private java.util.Date A24lot_data_remocao ;
   private java.util.Date ZZ23lot_data_lotacao ;
   private java.util.Date ZZ24lot_data_remocao ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private String Z25lot_portaria ;
   private String A8pes_nome ;
   private String A5unid_nome ;
   private String A6unid_sigla ;
   private String A25lot_portaria ;
   private String Z8pes_nome ;
   private String Z5unid_nome ;
   private String Z6unid_sigla ;
   private String ZZ25lot_portaria ;
   private String ZZ8pes_nome ;
   private String ZZ5unid_nome ;
   private String ZZ6unid_sigla ;
   private IDataStoreProvider pr_default ;
   private short[] T00066_A22lot_id ;
   private String[] T00066_A8pes_nome ;
   private String[] T00066_A5unid_nome ;
   private String[] T00066_A6unid_sigla ;
   private java.util.Date[] T00066_A23lot_data_lotacao ;
   private java.util.Date[] T00066_A24lot_data_remocao ;
   private String[] T00066_A25lot_portaria ;
   private short[] T00066_A7pes_id ;
   private short[] T00066_A4unid_id ;
   private String[] T00064_A8pes_nome ;
   private String[] T00065_A5unid_nome ;
   private String[] T00065_A6unid_sigla ;
   private String[] T00067_A8pes_nome ;
   private String[] T00068_A5unid_nome ;
   private String[] T00068_A6unid_sigla ;
   private short[] T00069_A22lot_id ;
   private short[] T00063_A22lot_id ;
   private java.util.Date[] T00063_A23lot_data_lotacao ;
   private java.util.Date[] T00063_A24lot_data_remocao ;
   private String[] T00063_A25lot_portaria ;
   private short[] T00063_A7pes_id ;
   private short[] T00063_A4unid_id ;
   private short[] T000610_A22lot_id ;
   private short[] T000611_A22lot_id ;
   private short[] T00062_A22lot_id ;
   private java.util.Date[] T00062_A23lot_data_lotacao ;
   private java.util.Date[] T00062_A24lot_data_remocao ;
   private String[] T00062_A25lot_portaria ;
   private short[] T00062_A7pes_id ;
   private short[] T00062_A4unid_id ;
   private short[] T000613_A22lot_id ;
   private String[] T000616_A8pes_nome ;
   private String[] T000617_A5unid_nome ;
   private String[] T000617_A6unid_sigla ;
   private short[] T000618_A22lot_id ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class lotacao__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00062", "SELECT lot_id, lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id FROM lotacao WHERE lot_id = ?  FOR UPDATE OF lotacao NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00063", "SELECT lot_id, lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id FROM lotacao WHERE lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00064", "SELECT pes_nome FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00065", "SELECT unid_nome, unid_sigla FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00066", "SELECT TM1.lot_id, T2.pes_nome, T3.unid_nome, T3.unid_sigla, TM1.lot_data_lotacao, TM1.lot_data_remocao, TM1.lot_portaria, TM1.pes_id, TM1.unid_id FROM ((lotacao TM1 INNER JOIN pessoa T2 ON T2.pes_id = TM1.pes_id) INNER JOIN unidade T3 ON T3.unid_id = TM1.unid_id) WHERE TM1.lot_id = ? ORDER BY TM1.lot_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00067", "SELECT pes_nome FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00068", "SELECT unid_nome, unid_sigla FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00069", "SELECT lot_id FROM lotacao WHERE lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000610", "SELECT lot_id FROM lotacao WHERE ( lot_id > ?) ORDER BY lot_id  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000611", "SELECT lot_id FROM lotacao WHERE ( lot_id < ?) ORDER BY lot_id DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000612", "SAVEPOINT gxupdate;INSERT INTO lotacao(lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id) VALUES(?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000613", "SELECT currval('lot_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000614", "SAVEPOINT gxupdate;UPDATE lotacao SET lot_data_lotacao=?, lot_data_remocao=?, lot_portaria=?, pes_id=?, unid_id=?  WHERE lot_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000615", "SAVEPOINT gxupdate;DELETE FROM lotacao  WHERE lot_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000616", "SELECT pes_nome FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000617", "SELECT unid_nome, unid_sigla FROM unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000618", "SELECT lot_id FROM lotacao ORDER BY lot_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
      }
   }

}

