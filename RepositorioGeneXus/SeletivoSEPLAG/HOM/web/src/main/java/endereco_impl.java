import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class endereco_impl extends GXDataArea
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
         A1cid_id = (short)(GXutil.lval( httpContext.GetPar( "cid_id"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1cid_id), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A1cid_id) ;
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
            Form.getMeta().addItem("generator", "GeneXus Java 18_0_8-180599", (short)(0)) ;
         }
      }
      Form.getMeta().addItem("description", "endereco", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtend_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine", false);
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public endereco_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public endereco_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( endereco_impl.class ));
   }

   public endereco_impl( int remoteHandle ,
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
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "start", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "WWAdvancedContainer", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
      /* Text block */
      GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "endereco", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "FormContainer", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, divToolbarcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 ToolbarCellClass", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "start", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "BtnFirst" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Selecionar", bttBtn_select_Jsonclick, 5, "Selecionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCellAdvanced", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtend_id_Internalname, "end_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      GxWebStd.gx_single_line_edit( httpContext, edtend_id_Internalname, GXutil.ltrim( localUtil.ntoc( A13end_id, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( ((edtend_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13end_id), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13end_id), "ZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtend_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtend_id_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_tipo_logradouro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtend_tipo_logradouro_Internalname, "end_tipo_logradouro", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      GxWebStd.gx_single_line_edit( httpContext, edtend_tipo_logradouro_Internalname, A14end_tipo_logradouro, GXutil.rtrim( localUtil.format( A14end_tipo_logradouro, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtend_tipo_logradouro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtend_tipo_logradouro_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_logradouro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtend_logradouro_Internalname, "end_logradouro", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GxWebStd.gx_html_textarea( httpContext, edtend_logradouro_Internalname, A15end_logradouro, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", (short)(0), 1, edtend_logradouro_Enabled, 0, 80, "chr", 3, "row", (byte)(1), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "", "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_numero_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtend_numero_Internalname, "end_numero", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      GxWebStd.gx_single_line_edit( httpContext, edtend_numero_Internalname, GXutil.ltrim( localUtil.ntoc( A16end_numero, (byte)(10), (byte)(0), ",", "")), GXutil.ltrim( ((edtend_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A16end_numero), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A16end_numero), "ZZZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtend_numero_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtend_numero_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_bairro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtend_bairro_Internalname, "end_bairro", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      GxWebStd.gx_single_line_edit( httpContext, edtend_bairro_Internalname, A17end_bairro, GXutil.rtrim( localUtil.format( A17end_bairro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtend_bairro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtend_bairro_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtcid_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtcid_id_Internalname, "cid_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      GxWebStd.gx_single_line_edit( httpContext, edtcid_id_Internalname, GXutil.ltrim( localUtil.ntoc( A1cid_id, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( ((edtcid_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1cid_id), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1cid_id), "ZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtcid_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtcid_id_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtcid_nome_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtcid_nome_Internalname, "cid_nome", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Multiple line edit */
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GxWebStd.gx_html_textarea( httpContext, edtcid_nome_Internalname, A2cid_nome, "", "", (short)(0), 1, edtcid_nome_Enabled, 0, 80, "chr", 3, "row", (byte)(1), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "", "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtcid_uf_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtcid_uf_Internalname, "cid_uf", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      GxWebStd.gx_single_line_edit( httpContext, edtcid_uf_Internalname, GXutil.rtrim( A3cid_uf), GXutil.rtrim( localUtil.format( A3cid_uf, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtcid_uf_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtcid_uf_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "start", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Fechar", bttBtn_cancel_Jsonclick, 1, "Fechar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_endereco.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
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
         Z13end_id = (short)(localUtil.ctol( httpContext.cgiGet( "Z13end_id"), ",", ".")) ;
         Z14end_tipo_logradouro = httpContext.cgiGet( "Z14end_tipo_logradouro") ;
         Z15end_logradouro = httpContext.cgiGet( "Z15end_logradouro") ;
         Z16end_numero = localUtil.ctol( httpContext.cgiGet( "Z16end_numero"), ",", ".") ;
         Z17end_bairro = httpContext.cgiGet( "Z17end_bairro") ;
         Z1cid_id = (short)(localUtil.ctol( httpContext.cgiGet( "Z1cid_id"), ",", ".")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtend_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtend_id_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "END_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtend_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13end_id = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13end_id), 4, 0));
         }
         else
         {
            A13end_id = (short)(localUtil.ctol( httpContext.cgiGet( edtend_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13end_id), 4, 0));
         }
         A14end_tipo_logradouro = GXutil.upper( httpContext.cgiGet( edtend_tipo_logradouro_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14end_tipo_logradouro", A14end_tipo_logradouro);
         A15end_logradouro = httpContext.cgiGet( edtend_logradouro_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A15end_logradouro", A15end_logradouro);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtend_numero_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtend_numero_Internalname), ",", ".") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "END_NUMERO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtend_numero_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A16end_numero = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A16end_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A16end_numero), 10, 0));
         }
         else
         {
            A16end_numero = localUtil.ctol( httpContext.cgiGet( edtend_numero_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A16end_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A16end_numero), 10, 0));
         }
         A17end_bairro = httpContext.cgiGet( edtend_bairro_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A17end_bairro", A17end_bairro);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtcid_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtcid_id_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CID_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtcid_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1cid_id = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1cid_id), 4, 0));
         }
         else
         {
            A1cid_id = (short)(localUtil.ctol( httpContext.cgiGet( edtcid_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1cid_id), 4, 0));
         }
         A2cid_nome = GXutil.upper( httpContext.cgiGet( edtcid_nome_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2cid_nome", A2cid_nome);
         A3cid_uf = GXutil.upper( httpContext.cgiGet( edtcid_uf_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3cid_uf", A3cid_uf);
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
            A13end_id = (short)(GXutil.lval( httpContext.GetPar( "end_id"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13end_id), 4, 0));
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
            initAll044( ) ;
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
      disableAttributes044( ) ;
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

   public void resetCaption040( )
   {
   }

   public void zm044( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14end_tipo_logradouro = T00043_A14end_tipo_logradouro[0] ;
            Z15end_logradouro = T00043_A15end_logradouro[0] ;
            Z16end_numero = T00043_A16end_numero[0] ;
            Z17end_bairro = T00043_A17end_bairro[0] ;
            Z1cid_id = T00043_A1cid_id[0] ;
         }
         else
         {
            Z14end_tipo_logradouro = A14end_tipo_logradouro ;
            Z15end_logradouro = A15end_logradouro ;
            Z16end_numero = A16end_numero ;
            Z17end_bairro = A17end_bairro ;
            Z1cid_id = A1cid_id ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z13end_id = A13end_id ;
         Z14end_tipo_logradouro = A14end_tipo_logradouro ;
         Z15end_logradouro = A15end_logradouro ;
         Z16end_numero = A16end_numero ;
         Z17end_bairro = A17end_bairro ;
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

   public void load044( )
   {
      /* Using cursor T00045 */
      pr_default.execute(3, new Object[] {Short.valueOf(A13end_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A14end_tipo_logradouro = T00045_A14end_tipo_logradouro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14end_tipo_logradouro", A14end_tipo_logradouro);
         A15end_logradouro = T00045_A15end_logradouro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A15end_logradouro", A15end_logradouro);
         A16end_numero = T00045_A16end_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16end_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A16end_numero), 10, 0));
         A17end_bairro = T00045_A17end_bairro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17end_bairro", A17end_bairro);
         A2cid_nome = T00045_A2cid_nome[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2cid_nome", A2cid_nome);
         A3cid_uf = T00045_A3cid_uf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3cid_uf", A3cid_uf);
         A1cid_id = T00045_A1cid_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1cid_id), 4, 0));
         zm044( -1) ;
      }
      pr_default.close(3);
      onLoadActions044( ) ;
   }

   public void onLoadActions044( )
   {
   }

   public void checkExtendedTable044( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00044 */
      pr_default.execute(2, new Object[] {Short.valueOf(A1cid_id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'cidade'.", "ForeignKeyNotFound", 1, "CID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtcid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2cid_nome = T00044_A2cid_nome[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2cid_nome", A2cid_nome);
      A3cid_uf = T00044_A3cid_uf[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3cid_uf", A3cid_uf);
      pr_default.close(2);
   }

   public void closeExtendedTableCursors044( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( short A1cid_id )
   {
      /* Using cursor T00046 */
      pr_default.execute(4, new Object[] {Short.valueOf(A1cid_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'cidade'.", "ForeignKeyNotFound", 1, "CID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtcid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2cid_nome = T00046_A2cid_nome[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2cid_nome", A2cid_nome);
      A3cid_uf = T00046_A3cid_uf[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3cid_uf", A3cid_uf);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A2cid_nome)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3cid_uf))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey044( )
   {
      /* Using cursor T00047 */
      pr_default.execute(5, new Object[] {Short.valueOf(A13end_id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound4 = (short)(1) ;
      }
      else
      {
         RcdFound4 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00043 */
      pr_default.execute(1, new Object[] {Short.valueOf(A13end_id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm044( 1) ;
         RcdFound4 = (short)(1) ;
         A13end_id = T00043_A13end_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13end_id), 4, 0));
         A14end_tipo_logradouro = T00043_A14end_tipo_logradouro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14end_tipo_logradouro", A14end_tipo_logradouro);
         A15end_logradouro = T00043_A15end_logradouro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A15end_logradouro", A15end_logradouro);
         A16end_numero = T00043_A16end_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16end_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A16end_numero), 10, 0));
         A17end_bairro = T00043_A17end_bairro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17end_bairro", A17end_bairro);
         A1cid_id = T00043_A1cid_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1cid_id), 4, 0));
         Z13end_id = A13end_id ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load044( ) ;
         if ( AnyError == 1 )
         {
            RcdFound4 = (short)(0) ;
            initializeNonKey044( ) ;
         }
         Gx_mode = sMode4 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound4 = (short)(0) ;
         initializeNonKey044( ) ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode4 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey044( ) ;
      if ( RcdFound4 == 0 )
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
      RcdFound4 = (short)(0) ;
      /* Using cursor T00048 */
      pr_default.execute(6, new Object[] {Short.valueOf(A13end_id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T00048_A13end_id[0] < A13end_id ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T00048_A13end_id[0] > A13end_id ) ) )
         {
            A13end_id = T00048_A13end_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13end_id), 4, 0));
            RcdFound4 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound4 = (short)(0) ;
      /* Using cursor T00049 */
      pr_default.execute(7, new Object[] {Short.valueOf(A13end_id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T00049_A13end_id[0] > A13end_id ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T00049_A13end_id[0] < A13end_id ) ) )
         {
            A13end_id = T00049_A13end_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13end_id), 4, 0));
            RcdFound4 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey044( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtend_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert044( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound4 == 1 )
         {
            if ( A13end_id != Z13end_id )
            {
               A13end_id = Z13end_id ;
               httpContext.ajax_rsp_assign_attri("", false, "A13end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13end_id), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "END_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtend_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtend_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update044( ) ;
               GX_FocusControl = edtend_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A13end_id != Z13end_id )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtend_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert044( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "END_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtend_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtend_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert044( ) ;
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
      if ( A13end_id != Z13end_id )
      {
         A13end_id = Z13end_id ;
         httpContext.ajax_rsp_assign_attri("", false, "A13end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13end_id), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "END_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtend_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtend_id_Internalname ;
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
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "END_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtend_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart044( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd044( ) ;
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
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
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
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
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
      scanStart044( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound4 != 0 )
         {
            scanNext044( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd044( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency044( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00042 */
         pr_default.execute(0, new Object[] {Short.valueOf(A13end_id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"endereco"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14end_tipo_logradouro, T00042_A14end_tipo_logradouro[0]) != 0 ) || ( GXutil.strcmp(Z15end_logradouro, T00042_A15end_logradouro[0]) != 0 ) || ( Z16end_numero != T00042_A16end_numero[0] ) || ( GXutil.strcmp(Z17end_bairro, T00042_A17end_bairro[0]) != 0 ) || ( Z1cid_id != T00042_A1cid_id[0] ) )
         {
            if ( GXutil.strcmp(Z14end_tipo_logradouro, T00042_A14end_tipo_logradouro[0]) != 0 )
            {
               GXutil.writeLogln("endereco:[seudo value changed for attri]"+"end_tipo_logradouro");
               GXutil.writeLogRaw("Old: ",Z14end_tipo_logradouro);
               GXutil.writeLogRaw("Current: ",T00042_A14end_tipo_logradouro[0]);
            }
            if ( GXutil.strcmp(Z15end_logradouro, T00042_A15end_logradouro[0]) != 0 )
            {
               GXutil.writeLogln("endereco:[seudo value changed for attri]"+"end_logradouro");
               GXutil.writeLogRaw("Old: ",Z15end_logradouro);
               GXutil.writeLogRaw("Current: ",T00042_A15end_logradouro[0]);
            }
            if ( Z16end_numero != T00042_A16end_numero[0] )
            {
               GXutil.writeLogln("endereco:[seudo value changed for attri]"+"end_numero");
               GXutil.writeLogRaw("Old: ",Z16end_numero);
               GXutil.writeLogRaw("Current: ",T00042_A16end_numero[0]);
            }
            if ( GXutil.strcmp(Z17end_bairro, T00042_A17end_bairro[0]) != 0 )
            {
               GXutil.writeLogln("endereco:[seudo value changed for attri]"+"end_bairro");
               GXutil.writeLogRaw("Old: ",Z17end_bairro);
               GXutil.writeLogRaw("Current: ",T00042_A17end_bairro[0]);
            }
            if ( Z1cid_id != T00042_A1cid_id[0] )
            {
               GXutil.writeLogln("endereco:[seudo value changed for attri]"+"cid_id");
               GXutil.writeLogRaw("Old: ",Z1cid_id);
               GXutil.writeLogRaw("Current: ",T00042_A1cid_id[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"endereco"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert044( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable044( ) ;
      }
      if ( AnyError == 0 )
      {
         zm044( 0) ;
         checkOptimisticConcurrency044( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm044( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert044( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000410 */
                  pr_default.execute(8, new Object[] {A14end_tipo_logradouro, A15end_logradouro, Long.valueOf(A16end_numero), A17end_bairro, Short.valueOf(A1cid_id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000411 */
                  pr_default.execute(9);
                  A13end_id = T000411_A13end_id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13end_id), 4, 0));
                  pr_default.close(9);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("endereco");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption040( ) ;
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
            load044( ) ;
         }
         endLevel044( ) ;
      }
      closeExtendedTableCursors044( ) ;
   }

   public void update044( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable044( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency044( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm044( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate044( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000412 */
                  pr_default.execute(10, new Object[] {A14end_tipo_logradouro, A15end_logradouro, Long.valueOf(A16end_numero), A17end_bairro, Short.valueOf(A1cid_id), Short.valueOf(A13end_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("endereco");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"endereco"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate044( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption040( ) ;
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
         endLevel044( ) ;
      }
      closeExtendedTableCursors044( ) ;
   }

   public void deferredUpdate044( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency044( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls044( ) ;
         afterConfirm044( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete044( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000413 */
               pr_default.execute(11, new Object[] {Short.valueOf(A13end_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("endereco");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound4 == 0 )
                     {
                        initAll044( ) ;
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
                     resetCaption040( ) ;
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
      sMode4 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel044( ) ;
      Gx_mode = sMode4 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls044( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000414 */
         pr_default.execute(12, new Object[] {Short.valueOf(A1cid_id)});
         A2cid_nome = T000414_A2cid_nome[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2cid_nome", A2cid_nome);
         A3cid_uf = T000414_A3cid_uf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3cid_uf", A3cid_uf);
         pr_default.close(12);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000415 */
         pr_default.execute(13, new Object[] {Short.valueOf(A13end_id)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"unidade_endereco"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T000416 */
         pr_default.execute(14, new Object[] {Short.valueOf(A13end_id)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"pessoa_endereco"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void endLevel044( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete044( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "endereco");
         if ( AnyError == 0 )
         {
            confirmValues040( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "endereco");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart044( )
   {
      /* Using cursor T000417 */
      pr_default.execute(15);
      RcdFound4 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A13end_id = T000417_A13end_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13end_id), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext044( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound4 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A13end_id = T000417_A13end_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13end_id), 4, 0));
      }
   }

   public void scanEnd044( )
   {
      pr_default.close(15);
   }

   public void afterConfirm044( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert044( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate044( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete044( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete044( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate044( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes044( )
   {
      edtend_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_id_Enabled), 5, 0), true);
      edtend_tipo_logradouro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_tipo_logradouro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_tipo_logradouro_Enabled), 5, 0), true);
      edtend_logradouro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_logradouro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_logradouro_Enabled), 5, 0), true);
      edtend_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_numero_Enabled), 5, 0), true);
      edtend_bairro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_bairro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_bairro_Enabled), 5, 0), true);
      edtcid_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtcid_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtcid_id_Enabled), 5, 0), true);
      edtcid_nome_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtcid_nome_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtcid_nome_Enabled), 5, 0), true);
      edtcid_uf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtcid_uf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtcid_uf_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes044( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues040( )
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
      httpContext.CloseStyles();
      if ( ( ( httpContext.getBrowserType( ) == 1 ) || ( httpContext.getBrowserType( ) == 5 ) ) && ( GXutil.strcmp(httpContext.getBrowserVersion( ), "7.0") == 0 ) )
      {
         httpContext.AddJavascriptSource("json2.js", "?"+httpContext.getBuildNumber( 1720180), false, true);
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 1720180), false, true);
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 1720180), false, true);
      httpContext.AddJavascriptSource("gxcfg.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      if ( GXutil.strcmp(httpContext.getLanguageProperty( "rtl"), "true") == 0 )
      {
         httpContext.writeText( " dir=\"rtl\" ") ;
      }
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      bodyStyle += "-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("endereco", new String[] {}, new String[] {}) +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<div style=\"height:0;overflow:hidden\"><input type=\"submit\" title=\"submit\"  disabled></div>") ;
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
      GxWebStd.gx_hidden_field( httpContext, "Z13end_id", GXutil.ltrim( localUtil.ntoc( Z13end_id, (byte)(4), (byte)(0), ",", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z14end_tipo_logradouro", Z14end_tipo_logradouro);
      GxWebStd.gx_hidden_field( httpContext, "Z15end_logradouro", Z15end_logradouro);
      GxWebStd.gx_hidden_field( httpContext, "Z16end_numero", GXutil.ltrim( localUtil.ntoc( Z16end_numero, (byte)(10), (byte)(0), ",", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z17end_bairro", Z17end_bairro);
      GxWebStd.gx_hidden_field( httpContext, "Z1cid_id", GXutil.ltrim( localUtil.ntoc( Z1cid_id, (byte)(4), (byte)(0), ",", "")));
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
      return formatLink("endereco", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "endereco" ;
   }

   public String getPgmdesc( )
   {
      return "endereco" ;
   }

   public void initializeNonKey044( )
   {
      A14end_tipo_logradouro = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14end_tipo_logradouro", A14end_tipo_logradouro);
      A15end_logradouro = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A15end_logradouro", A15end_logradouro);
      A16end_numero = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A16end_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A16end_numero), 10, 0));
      A17end_bairro = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A17end_bairro", A17end_bairro);
      A1cid_id = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1cid_id), 4, 0));
      A2cid_nome = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2cid_nome", A2cid_nome);
      A3cid_uf = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3cid_uf", A3cid_uf);
      Z14end_tipo_logradouro = "" ;
      Z15end_logradouro = "" ;
      Z16end_numero = 0 ;
      Z17end_bairro = "" ;
      Z1cid_id = (short)(0) ;
   }

   public void initAll044( )
   {
      A13end_id = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13end_id), 4, 0));
      initializeNonKey044( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2025452321290", true, true);
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
      httpContext.AddJavascriptSource("endereco.js", "?2025452321290", false, true);
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
      edtend_id_Internalname = "END_ID" ;
      edtend_tipo_logradouro_Internalname = "END_TIPO_LOGRADOURO" ;
      edtend_logradouro_Internalname = "END_LOGRADOURO" ;
      edtend_numero_Internalname = "END_NUMERO" ;
      edtend_bairro_Internalname = "END_BAIRRO" ;
      edtcid_id_Internalname = "CID_ID" ;
      edtcid_nome_Internalname = "CID_NOME" ;
      edtcid_uf_Internalname = "CID_UF" ;
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
      httpContext.setDefaultTheme("Carmine", false);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "endereco" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtcid_uf_Jsonclick = "" ;
      edtcid_uf_Enabled = 0 ;
      edtcid_nome_Enabled = 0 ;
      edtcid_id_Jsonclick = "" ;
      edtcid_id_Enabled = 1 ;
      edtend_bairro_Jsonclick = "" ;
      edtend_bairro_Enabled = 1 ;
      edtend_numero_Jsonclick = "" ;
      edtend_numero_Enabled = 1 ;
      edtend_logradouro_Enabled = 1 ;
      edtend_tipo_logradouro_Jsonclick = "" ;
      edtend_tipo_logradouro_Enabled = 1 ;
      edtend_id_Jsonclick = "" ;
      edtend_id_Enabled = 1 ;
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
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
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

   public void valid_End_id( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14end_tipo_logradouro", A14end_tipo_logradouro);
      httpContext.ajax_rsp_assign_attri("", false, "A15end_logradouro", A15end_logradouro);
      httpContext.ajax_rsp_assign_attri("", false, "A16end_numero", GXutil.ltrim( localUtil.ntoc( A16end_numero, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A17end_bairro", A17end_bairro);
      httpContext.ajax_rsp_assign_attri("", false, "A1cid_id", GXutil.ltrim( localUtil.ntoc( A1cid_id, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2cid_nome", A2cid_nome);
      httpContext.ajax_rsp_assign_attri("", false, "A3cid_uf", GXutil.rtrim( A3cid_uf));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "Z13end_id", GXutil.ltrim( localUtil.ntoc( Z13end_id, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z14end_tipo_logradouro", Z14end_tipo_logradouro);
      GxWebStd.gx_hidden_field( httpContext, "Z15end_logradouro", Z15end_logradouro);
      GxWebStd.gx_hidden_field( httpContext, "Z16end_numero", GXutil.ltrim( localUtil.ntoc( Z16end_numero, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z17end_bairro", Z17end_bairro);
      GxWebStd.gx_hidden_field( httpContext, "Z1cid_id", GXutil.ltrim( localUtil.ntoc( Z1cid_id, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z2cid_nome", Z2cid_nome);
      GxWebStd.gx_hidden_field( httpContext, "Z3cid_uf", GXutil.rtrim( Z3cid_uf));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Cid_id( )
   {
      /* Using cursor T000414 */
      pr_default.execute(12, new Object[] {Short.valueOf(A1cid_id)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'cidade'.", "ForeignKeyNotFound", 1, "CID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtcid_id_Internalname ;
      }
      A2cid_nome = T000414_A2cid_nome[0] ;
      A3cid_uf = T000414_A3cid_uf[0] ;
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2cid_nome", A2cid_nome);
      httpContext.ajax_rsp_assign_attri("", false, "A3cid_uf", GXutil.rtrim( A3cid_uf));
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
      setEventMetadata("VALID_END_ID","{handler:'valid_End_id',iparms:[{av:'A13end_id',fld:'END_ID',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_END_ID",",oparms:[{av:'A14end_tipo_logradouro',fld:'END_TIPO_LOGRADOURO',pic:'@!'},{av:'A15end_logradouro',fld:'END_LOGRADOURO',pic:''},{av:'A16end_numero',fld:'END_NUMERO',pic:'ZZZZZZZZZ9'},{av:'A17end_bairro',fld:'END_BAIRRO',pic:''},{av:'A1cid_id',fld:'CID_ID',pic:'ZZZ9'},{av:'A2cid_nome',fld:'CID_NOME',pic:'@!'},{av:'A3cid_uf',fld:'CID_UF',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z13end_id'},{av:'Z14end_tipo_logradouro'},{av:'Z15end_logradouro'},{av:'Z16end_numero'},{av:'Z17end_bairro'},{av:'Z1cid_id'},{av:'Z2cid_nome'},{av:'Z3cid_uf'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_CID_ID","{handler:'valid_Cid_id',iparms:[{av:'A1cid_id',fld:'CID_ID',pic:'ZZZ9'},{av:'A2cid_nome',fld:'CID_NOME',pic:'@!'},{av:'A3cid_uf',fld:'CID_UF',pic:'@!'}]");
      setEventMetadata("VALID_CID_ID",",oparms:[{av:'A2cid_nome',fld:'CID_NOME',pic:'@!'},{av:'A3cid_uf',fld:'CID_UF',pic:'@!'}]}");
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
      pr_default.close(12);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z14end_tipo_logradouro = "" ;
      Z15end_logradouro = "" ;
      Z17end_bairro = "" ;
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
      A14end_tipo_logradouro = "" ;
      A15end_logradouro = "" ;
      A17end_bairro = "" ;
      A2cid_nome = "" ;
      A3cid_uf = "" ;
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
      Z2cid_nome = "" ;
      Z3cid_uf = "" ;
      T00045_A13end_id = new short[1] ;
      T00045_A14end_tipo_logradouro = new String[] {""} ;
      T00045_A15end_logradouro = new String[] {""} ;
      T00045_A16end_numero = new long[1] ;
      T00045_A17end_bairro = new String[] {""} ;
      T00045_A2cid_nome = new String[] {""} ;
      T00045_A3cid_uf = new String[] {""} ;
      T00045_A1cid_id = new short[1] ;
      T00044_A2cid_nome = new String[] {""} ;
      T00044_A3cid_uf = new String[] {""} ;
      T00046_A2cid_nome = new String[] {""} ;
      T00046_A3cid_uf = new String[] {""} ;
      T00047_A13end_id = new short[1] ;
      T00043_A13end_id = new short[1] ;
      T00043_A14end_tipo_logradouro = new String[] {""} ;
      T00043_A15end_logradouro = new String[] {""} ;
      T00043_A16end_numero = new long[1] ;
      T00043_A17end_bairro = new String[] {""} ;
      T00043_A1cid_id = new short[1] ;
      sMode4 = "" ;
      T00048_A13end_id = new short[1] ;
      T00049_A13end_id = new short[1] ;
      T00042_A13end_id = new short[1] ;
      T00042_A14end_tipo_logradouro = new String[] {""} ;
      T00042_A15end_logradouro = new String[] {""} ;
      T00042_A16end_numero = new long[1] ;
      T00042_A17end_bairro = new String[] {""} ;
      T00042_A1cid_id = new short[1] ;
      T000411_A13end_id = new short[1] ;
      T000414_A2cid_nome = new String[] {""} ;
      T000414_A3cid_uf = new String[] {""} ;
      T000415_A4unid_id = new short[1] ;
      T000415_A13end_id = new short[1] ;
      T000416_A7pes_id = new short[1] ;
      T000416_A13end_id = new short[1] ;
      T000417_A13end_id = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ14end_tipo_logradouro = "" ;
      ZZ15end_logradouro = "" ;
      ZZ17end_bairro = "" ;
      ZZ2cid_nome = "" ;
      ZZ3cid_uf = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new endereco__default(),
         new Object[] {
             new Object[] {
            T00042_A13end_id, T00042_A14end_tipo_logradouro, T00042_A15end_logradouro, T00042_A16end_numero, T00042_A17end_bairro, T00042_A1cid_id
            }
            , new Object[] {
            T00043_A13end_id, T00043_A14end_tipo_logradouro, T00043_A15end_logradouro, T00043_A16end_numero, T00043_A17end_bairro, T00043_A1cid_id
            }
            , new Object[] {
            T00044_A2cid_nome, T00044_A3cid_uf
            }
            , new Object[] {
            T00045_A13end_id, T00045_A14end_tipo_logradouro, T00045_A15end_logradouro, T00045_A16end_numero, T00045_A17end_bairro, T00045_A2cid_nome, T00045_A3cid_uf, T00045_A1cid_id
            }
            , new Object[] {
            T00046_A2cid_nome, T00046_A3cid_uf
            }
            , new Object[] {
            T00047_A13end_id
            }
            , new Object[] {
            T00048_A13end_id
            }
            , new Object[] {
            T00049_A13end_id
            }
            , new Object[] {
            }
            , new Object[] {
            T000411_A13end_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000414_A2cid_nome, T000414_A3cid_uf
            }
            , new Object[] {
            T000415_A4unid_id, T000415_A13end_id
            }
            , new Object[] {
            T000416_A7pes_id, T000416_A13end_id
            }
            , new Object[] {
            T000417_A13end_id
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z13end_id ;
   private short Z1cid_id ;
   private short A1cid_id ;
   private short gxcookieaux ;
   private short AnyError ;
   private short IsModified ;
   private short IsConfirmed ;
   private short A13end_id ;
   private short RcdFound4 ;
   private short ZZ13end_id ;
   private short ZZ1cid_id ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtend_id_Enabled ;
   private int edtend_tipo_logradouro_Enabled ;
   private int edtend_logradouro_Enabled ;
   private int edtend_numero_Enabled ;
   private int edtend_bairro_Enabled ;
   private int edtcid_id_Enabled ;
   private int edtcid_nome_Enabled ;
   private int edtcid_uf_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z16end_numero ;
   private long A16end_numero ;
   private long ZZ16end_numero ;
   private String sPrefix ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtend_id_Internalname ;
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
   private String edtend_id_Jsonclick ;
   private String edtend_tipo_logradouro_Internalname ;
   private String edtend_tipo_logradouro_Jsonclick ;
   private String edtend_logradouro_Internalname ;
   private String edtend_numero_Internalname ;
   private String edtend_numero_Jsonclick ;
   private String edtend_bairro_Internalname ;
   private String edtend_bairro_Jsonclick ;
   private String edtcid_id_Internalname ;
   private String edtcid_id_Jsonclick ;
   private String edtcid_nome_Internalname ;
   private String edtcid_uf_Internalname ;
   private String A3cid_uf ;
   private String edtcid_uf_Jsonclick ;
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
   private String Z3cid_uf ;
   private String sMode4 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ3cid_uf ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private String Z14end_tipo_logradouro ;
   private String Z15end_logradouro ;
   private String Z17end_bairro ;
   private String A14end_tipo_logradouro ;
   private String A15end_logradouro ;
   private String A17end_bairro ;
   private String A2cid_nome ;
   private String Z2cid_nome ;
   private String ZZ14end_tipo_logradouro ;
   private String ZZ15end_logradouro ;
   private String ZZ17end_bairro ;
   private String ZZ2cid_nome ;
   private IDataStoreProvider pr_default ;
   private short[] T00045_A13end_id ;
   private String[] T00045_A14end_tipo_logradouro ;
   private String[] T00045_A15end_logradouro ;
   private long[] T00045_A16end_numero ;
   private String[] T00045_A17end_bairro ;
   private String[] T00045_A2cid_nome ;
   private String[] T00045_A3cid_uf ;
   private short[] T00045_A1cid_id ;
   private String[] T00044_A2cid_nome ;
   private String[] T00044_A3cid_uf ;
   private String[] T00046_A2cid_nome ;
   private String[] T00046_A3cid_uf ;
   private short[] T00047_A13end_id ;
   private short[] T00043_A13end_id ;
   private String[] T00043_A14end_tipo_logradouro ;
   private String[] T00043_A15end_logradouro ;
   private long[] T00043_A16end_numero ;
   private String[] T00043_A17end_bairro ;
   private short[] T00043_A1cid_id ;
   private short[] T00048_A13end_id ;
   private short[] T00049_A13end_id ;
   private short[] T00042_A13end_id ;
   private String[] T00042_A14end_tipo_logradouro ;
   private String[] T00042_A15end_logradouro ;
   private long[] T00042_A16end_numero ;
   private String[] T00042_A17end_bairro ;
   private short[] T00042_A1cid_id ;
   private short[] T000411_A13end_id ;
   private String[] T000414_A2cid_nome ;
   private String[] T000414_A3cid_uf ;
   private short[] T000415_A4unid_id ;
   private short[] T000415_A13end_id ;
   private short[] T000416_A7pes_id ;
   private short[] T000416_A13end_id ;
   private short[] T000417_A13end_id ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class endereco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00042", "SELECT end_id, end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id FROM endereco WHERE end_id = ?  FOR UPDATE OF endereco NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00043", "SELECT end_id, end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00044", "SELECT cid_nome, cid_uf FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00045", "SELECT TM1.end_id, TM1.end_tipo_logradouro, TM1.end_logradouro, TM1.end_numero, TM1.end_bairro, T2.cid_nome, T2.cid_uf, TM1.cid_id FROM (endereco TM1 INNER JOIN cidade T2 ON T2.cid_id = TM1.cid_id) WHERE TM1.end_id = ? ORDER BY TM1.end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00046", "SELECT cid_nome, cid_uf FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00047", "SELECT end_id FROM endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00048", "SELECT end_id FROM endereco WHERE ( end_id > ?) ORDER BY end_id  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00049", "SELECT end_id FROM endereco WHERE ( end_id < ?) ORDER BY end_id DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000410", "SAVEPOINT gxupdate;INSERT INTO endereco(end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id) VALUES(?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000411", "SELECT currval('end_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000412", "SAVEPOINT gxupdate;UPDATE endereco SET end_tipo_logradouro=?, end_logradouro=?, end_numero=?, end_bairro=?, cid_id=?  WHERE end_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000413", "SAVEPOINT gxupdate;DELETE FROM endereco  WHERE end_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000414", "SELECT cid_nome, cid_uf FROM cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000415", "SELECT unid_id, end_id FROM unidade_endereco WHERE end_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000416", "SELECT pes_id, end_id FROM pessoa_endereco WHERE end_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000417", "SELECT end_id FROM endereco ORDER BY end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 15 :
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setVarchar(4, (String)parms[3], 100, false);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setVarchar(4, (String)parms[3], 100, false);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
      }
   }

}

