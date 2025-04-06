import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class foto_pessoa_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A7pes_id = (short)(GXutil.lval( httpContext.GetPar( "pes_id"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A7pes_id) ;
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
         Form.getMeta().addItem("description", "foto_pessoa", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtfp_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public foto_pessoa_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public foto_pessoa_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( foto_pessoa_impl.class ));
   }

   public foto_pessoa_impl( int remoteHandle ,
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
      GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "foto_pessoa", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_foto_pessoa.htm");
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
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_foto_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_foto_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_foto_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_foto_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Selecionar", bttBtn_select_Jsonclick, 5, "Selecionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_foto_pessoa.htm");
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
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtfp_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtfp_id_Internalname, "fp_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      GxWebStd.gx_single_line_edit( httpContext, edtfp_id_Internalname, GXutil.ltrim( localUtil.ntoc( A18fp_id, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( ((edtfp_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A18fp_id), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A18fp_id), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtfp_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtfp_id_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_foto_pessoa.htm");
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
      GxWebStd.gx_single_line_edit( httpContext, edtpes_id_Internalname, GXutil.ltrim( localUtil.ntoc( A7pes_id, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( ((edtpes_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7pes_id), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7pes_id), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtpes_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtpes_id_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_foto_pessoa.htm");
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
      GxWebStd.gx_html_textarea( httpContext, edtpes_nome_Internalname, A8pes_nome, "", "", (short)(0), 1, edtpes_nome_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_foto_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtpes_data_nascimento_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtpes_data_nascimento_Internalname, "pes_data_nascimento", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtpes_data_nascimento_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      GxWebStd.gx_single_line_edit( httpContext, edtpes_data_nascimento_Internalname, localUtil.format(A9pes_data_nascimento, "99/99/9999"), localUtil.format( A9pes_data_nascimento, "99/99/9999"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtpes_data_nascimento_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtpes_data_nascimento_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_foto_pessoa.htm");
      GxWebStd.gx_bitmap( httpContext, edtpes_data_nascimento_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtpes_data_nascimento_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_foto_pessoa.htm");
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
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtfp_data_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtfp_data_Internalname, "fp_data", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtfp_data_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      GxWebStd.gx_single_line_edit( httpContext, edtfp_data_Internalname, localUtil.format(A19fp_data, "99/99/9999"), localUtil.format( A19fp_data, "99/99/9999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'DMY',0,24,'por',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',0,24,'por',false,0);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtfp_data_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtfp_data_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_foto_pessoa.htm");
      GxWebStd.gx_bitmap( httpContext, edtfp_data_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtfp_data_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_foto_pessoa.htm");
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
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtfp_bucket_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtfp_bucket_Internalname, "fp_bucket", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      GxWebStd.gx_single_line_edit( httpContext, edtfp_bucket_Internalname, A20fp_bucket, GXutil.rtrim( localUtil.format( A20fp_bucket, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtfp_bucket_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtfp_bucket_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_foto_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtfp_hash_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtfp_hash_Internalname, "fp_hash", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      GxWebStd.gx_single_line_edit( httpContext, edtfp_hash_Internalname, A21fp_hash, GXutil.rtrim( localUtil.format( A21fp_hash, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtfp_hash_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtfp_hash_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_foto_pessoa.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_foto_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Fechar", bttBtn_cancel_Jsonclick, 1, "Fechar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_foto_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_foto_pessoa.htm");
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
         Z18fp_id = (short)(localUtil.ctol( httpContext.cgiGet( "Z18fp_id"), ",", ".")) ;
         Z19fp_data = localUtil.ctod( httpContext.cgiGet( "Z19fp_data"), 0) ;
         Z20fp_bucket = httpContext.cgiGet( "Z20fp_bucket") ;
         Z21fp_hash = httpContext.cgiGet( "Z21fp_hash") ;
         Z7pes_id = (short)(localUtil.ctol( httpContext.cgiGet( "Z7pes_id"), ",", ".")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), ",", ".")) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtfp_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtfp_id_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FP_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtfp_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A18fp_id = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A18fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18fp_id), 4, 0));
         }
         else
         {
            A18fp_id = (short)(localUtil.ctol( httpContext.cgiGet( edtfp_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A18fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18fp_id), 4, 0));
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
         A9pes_data_nascimento = localUtil.ctod( httpContext.cgiGet( edtpes_data_nascimento_Internalname), 3) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9pes_data_nascimento", localUtil.format(A9pes_data_nascimento, "99/99/9999"));
         if ( localUtil.vcdate( httpContext.cgiGet( edtfp_data_Internalname), (byte)(3)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FP_DATA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtfp_data_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A19fp_data = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A19fp_data", localUtil.format(A19fp_data, "99/99/9999"));
         }
         else
         {
            A19fp_data = localUtil.ctod( httpContext.cgiGet( edtfp_data_Internalname), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "A19fp_data", localUtil.format(A19fp_data, "99/99/9999"));
         }
         A20fp_bucket = httpContext.cgiGet( edtfp_bucket_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A20fp_bucket", A20fp_bucket);
         A21fp_hash = httpContext.cgiGet( edtfp_hash_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A21fp_hash", A21fp_hash);
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
            A18fp_id = (short)(GXutil.lval( httpContext.GetPar( "fp_id"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A18fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18fp_id), 4, 0));
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
            initAll055( ) ;
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
      disableAttributes055( ) ;
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

   public void resetCaption050( )
   {
   }

   public void zm055( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z19fp_data = T00053_A19fp_data[0] ;
            Z20fp_bucket = T00053_A20fp_bucket[0] ;
            Z21fp_hash = T00053_A21fp_hash[0] ;
            Z7pes_id = T00053_A7pes_id[0] ;
         }
         else
         {
            Z19fp_data = A19fp_data ;
            Z20fp_bucket = A20fp_bucket ;
            Z21fp_hash = A21fp_hash ;
            Z7pes_id = A7pes_id ;
         }
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
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A19fp_data)) && ( Gx_BScreen == 0 ) )
      {
         A19fp_data = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A19fp_data", localUtil.format(A19fp_data, "99/99/9999"));
      }
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

   public void load055( )
   {
      /* Using cursor T00055 */
      pr_default.execute(3, new Object[] {Short.valueOf(A18fp_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A8pes_nome = T00055_A8pes_nome[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
         A9pes_data_nascimento = T00055_A9pes_data_nascimento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9pes_data_nascimento", localUtil.format(A9pes_data_nascimento, "99/99/9999"));
         A19fp_data = T00055_A19fp_data[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19fp_data", localUtil.format(A19fp_data, "99/99/9999"));
         A20fp_bucket = T00055_A20fp_bucket[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A20fp_bucket", A20fp_bucket);
         A21fp_hash = T00055_A21fp_hash[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21fp_hash", A21fp_hash);
         A7pes_id = T00055_A7pes_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
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
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T00054 */
      pr_default.execute(2, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtpes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8pes_nome = T00054_A8pes_nome[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
      A9pes_data_nascimento = T00054_A9pes_data_nascimento[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9pes_data_nascimento", localUtil.format(A9pes_data_nascimento, "99/99/9999"));
      pr_default.close(2);
   }

   public void closeExtendedTableCursors055( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( short A7pes_id )
   {
      /* Using cursor T00056 */
      pr_default.execute(4, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtpes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8pes_nome = T00056_A8pes_nome[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
      A9pes_data_nascimento = T00056_A9pes_data_nascimento[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9pes_data_nascimento", localUtil.format(A9pes_data_nascimento, "99/99/9999"));
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A8pes_nome)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A9pes_data_nascimento, "99/99/9999"))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey055( )
   {
      /* Using cursor T00057 */
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
      /* Using cursor T00053 */
      pr_default.execute(1, new Object[] {Short.valueOf(A18fp_id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm055( 2) ;
         RcdFound5 = (short)(1) ;
         A18fp_id = T00053_A18fp_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18fp_id), 4, 0));
         A19fp_data = T00053_A19fp_data[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19fp_data", localUtil.format(A19fp_data, "99/99/9999"));
         A20fp_bucket = T00053_A20fp_bucket[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A20fp_bucket", A20fp_bucket);
         A21fp_hash = T00053_A21fp_hash[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21fp_hash", A21fp_hash);
         A7pes_id = T00053_A7pes_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
         Z18fp_id = A18fp_id ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load055( ) ;
         if ( AnyError == 1 )
         {
            RcdFound5 = (short)(0) ;
            initializeNonKey055( ) ;
         }
         Gx_mode = sMode5 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound5 = (short)(0) ;
         initializeNonKey055( ) ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode5 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey055( ) ;
      if ( RcdFound5 == 0 )
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
      RcdFound5 = (short)(0) ;
      /* Using cursor T00058 */
      pr_default.execute(6, new Object[] {Short.valueOf(A18fp_id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T00058_A18fp_id[0] < A18fp_id ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T00058_A18fp_id[0] > A18fp_id ) ) )
         {
            A18fp_id = T00058_A18fp_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A18fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18fp_id), 4, 0));
            RcdFound5 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound5 = (short)(0) ;
      /* Using cursor T00059 */
      pr_default.execute(7, new Object[] {Short.valueOf(A18fp_id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T00059_A18fp_id[0] > A18fp_id ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T00059_A18fp_id[0] < A18fp_id ) ) )
         {
            A18fp_id = T00059_A18fp_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A18fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18fp_id), 4, 0));
            RcdFound5 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey055( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtfp_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert055( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound5 == 1 )
         {
            if ( A18fp_id != Z18fp_id )
            {
               A18fp_id = Z18fp_id ;
               httpContext.ajax_rsp_assign_attri("", false, "A18fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18fp_id), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "FP_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtfp_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtfp_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update055( ) ;
               GX_FocusControl = edtfp_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A18fp_id != Z18fp_id )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtfp_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert055( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "FP_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtfp_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtfp_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert055( ) ;
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
      if ( A18fp_id != Z18fp_id )
      {
         A18fp_id = Z18fp_id ;
         httpContext.ajax_rsp_assign_attri("", false, "A18fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18fp_id), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "FP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtfp_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtfp_id_Internalname ;
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
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "FP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtfp_id_Internalname ;
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
      scanStart055( ) ;
      if ( RcdFound5 == 0 )
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
      scanEnd055( ) ;
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
      if ( RcdFound5 == 0 )
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
      if ( RcdFound5 == 0 )
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
      scanStart055( ) ;
      if ( RcdFound5 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound5 != 0 )
         {
            scanNext055( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtpes_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd055( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency055( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00052 */
         pr_default.execute(0, new Object[] {Short.valueOf(A18fp_id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"foto_pessoa"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z19fp_data), GXutil.resetTime(T00052_A19fp_data[0])) ) || ( GXutil.strcmp(Z20fp_bucket, T00052_A20fp_bucket[0]) != 0 ) || ( GXutil.strcmp(Z21fp_hash, T00052_A21fp_hash[0]) != 0 ) || ( Z7pes_id != T00052_A7pes_id[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z19fp_data), GXutil.resetTime(T00052_A19fp_data[0])) ) )
            {
               GXutil.writeLogln("foto_pessoa:[seudo value changed for attri]"+"fp_data");
               GXutil.writeLogRaw("Old: ",Z19fp_data);
               GXutil.writeLogRaw("Current: ",T00052_A19fp_data[0]);
            }
            if ( GXutil.strcmp(Z20fp_bucket, T00052_A20fp_bucket[0]) != 0 )
            {
               GXutil.writeLogln("foto_pessoa:[seudo value changed for attri]"+"fp_bucket");
               GXutil.writeLogRaw("Old: ",Z20fp_bucket);
               GXutil.writeLogRaw("Current: ",T00052_A20fp_bucket[0]);
            }
            if ( GXutil.strcmp(Z21fp_hash, T00052_A21fp_hash[0]) != 0 )
            {
               GXutil.writeLogln("foto_pessoa:[seudo value changed for attri]"+"fp_hash");
               GXutil.writeLogRaw("Old: ",Z21fp_hash);
               GXutil.writeLogRaw("Current: ",T00052_A21fp_hash[0]);
            }
            if ( Z7pes_id != T00052_A7pes_id[0] )
            {
               GXutil.writeLogln("foto_pessoa:[seudo value changed for attri]"+"pes_id");
               GXutil.writeLogRaw("Old: ",Z7pes_id);
               GXutil.writeLogRaw("Current: ",T00052_A7pes_id[0]);
            }
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
                  /* Using cursor T000510 */
                  pr_default.execute(8, new Object[] {A19fp_data, A20fp_bucket, A21fp_hash, Short.valueOf(A7pes_id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000511 */
                  pr_default.execute(9);
                  A18fp_id = T000511_A18fp_id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A18fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18fp_id), 4, 0));
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
                        resetCaption050( ) ;
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
                  /* Using cursor T000512 */
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
                        resetCaption050( ) ;
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
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
               /* Using cursor T000513 */
               pr_default.execute(11, new Object[] {Short.valueOf(A18fp_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("foto_pessoa");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound5 == 0 )
                     {
                        initAll055( ) ;
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
                     resetCaption050( ) ;
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
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel055( ) ;
      Gx_mode = sMode5 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls055( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000514 */
         pr_default.execute(12, new Object[] {Short.valueOf(A7pes_id)});
         A8pes_nome = T000514_A8pes_nome[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
         A9pes_data_nascimento = T000514_A9pes_data_nascimento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9pes_data_nascimento", localUtil.format(A9pes_data_nascimento, "99/99/9999"));
         pr_default.close(12);
      }
   }

   public void endLevel055( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete055( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "foto_pessoa");
         if ( AnyError == 0 )
         {
            confirmValues050( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "foto_pessoa");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart055( )
   {
      /* Using cursor T000515 */
      pr_default.execute(13);
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A18fp_id = T000515_A18fp_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18fp_id), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext055( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A18fp_id = T000515_A18fp_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18fp_id), 4, 0));
      }
   }

   public void scanEnd055( )
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
      edtfp_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtfp_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtfp_id_Enabled), 5, 0), true);
      edtpes_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtpes_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtpes_id_Enabled), 5, 0), true);
      edtpes_nome_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtpes_nome_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtpes_nome_Enabled), 5, 0), true);
      edtpes_data_nascimento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtpes_data_nascimento_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtpes_data_nascimento_Enabled), 5, 0), true);
      edtfp_data_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtfp_data_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtfp_data_Enabled), 5, 0), true);
      edtfp_bucket_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtfp_bucket_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtfp_bucket_Enabled), 5, 0), true);
      edtfp_hash_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtfp_hash_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtfp_hash_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes055( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues050( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20254215303615", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("foto_pessoa", new String[] {}, new String[] {}) +"\">") ;
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
      GxWebStd.gx_hidden_field( httpContext, "Z18fp_id", GXutil.ltrim( localUtil.ntoc( Z18fp_id, (byte)(4), (byte)(0), ",", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z19fp_data", localUtil.dtoc( Z19fp_data, 0, "/"));
      GxWebStd.gx_hidden_field( httpContext, "Z20fp_bucket", Z20fp_bucket);
      GxWebStd.gx_hidden_field( httpContext, "Z21fp_hash", Z21fp_hash);
      GxWebStd.gx_hidden_field( httpContext, "Z7pes_id", GXutil.ltrim( localUtil.ntoc( Z7pes_id, (byte)(4), (byte)(0), ",", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), ",", "")));
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
      return formatLink("foto_pessoa", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "foto_pessoa" ;
   }

   public String getPgmdesc( )
   {
      return "foto_pessoa" ;
   }

   public void initializeNonKey055( )
   {
      A7pes_id = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
      A8pes_nome = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
      A9pes_data_nascimento = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A9pes_data_nascimento", localUtil.format(A9pes_data_nascimento, "99/99/9999"));
      A20fp_bucket = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A20fp_bucket", A20fp_bucket);
      A21fp_hash = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A21fp_hash", A21fp_hash);
      A19fp_data = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A19fp_data", localUtil.format(A19fp_data, "99/99/9999"));
      Z19fp_data = GXutil.nullDate() ;
      Z20fp_bucket = "" ;
      Z21fp_hash = "" ;
      Z7pes_id = (short)(0) ;
   }

   public void initAll055( )
   {
      A18fp_id = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A18fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A18fp_id), 4, 0));
      initializeNonKey055( ) ;
   }

   public void standaloneModalInsert( )
   {
      A19fp_data = i19fp_data ;
      httpContext.ajax_rsp_assign_attri("", false, "A19fp_data", localUtil.format(A19fp_data, "99/99/9999"));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20254215303622", true, true);
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
      httpContext.AddJavascriptSource("foto_pessoa.js", "?20254215303622", false, true);
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
      edtfp_id_Internalname = "FP_ID" ;
      edtpes_id_Internalname = "PES_ID" ;
      edtpes_nome_Internalname = "PES_NOME" ;
      edtpes_data_nascimento_Internalname = "PES_DATA_NASCIMENTO" ;
      edtfp_data_Internalname = "FP_DATA" ;
      edtfp_bucket_Internalname = "FP_BUCKET" ;
      edtfp_hash_Internalname = "FP_HASH" ;
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
      Form.setCaption( "foto_pessoa" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtfp_hash_Jsonclick = "" ;
      edtfp_hash_Enabled = 1 ;
      edtfp_bucket_Jsonclick = "" ;
      edtfp_bucket_Enabled = 1 ;
      edtfp_data_Jsonclick = "" ;
      edtfp_data_Enabled = 1 ;
      edtpes_data_nascimento_Jsonclick = "" ;
      edtpes_data_nascimento_Enabled = 0 ;
      edtpes_nome_Enabled = 0 ;
      edtpes_id_Jsonclick = "" ;
      edtpes_id_Enabled = 1 ;
      edtfp_id_Jsonclick = "" ;
      edtfp_id_Enabled = 1 ;
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

   public void valid_Fp_id( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrim( localUtil.ntoc( A7pes_id, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A19fp_data", localUtil.format(A19fp_data, "99/99/9999"));
      httpContext.ajax_rsp_assign_attri("", false, "A20fp_bucket", A20fp_bucket);
      httpContext.ajax_rsp_assign_attri("", false, "A21fp_hash", A21fp_hash);
      httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
      httpContext.ajax_rsp_assign_attri("", false, "A9pes_data_nascimento", localUtil.format(A9pes_data_nascimento, "99/99/9999"));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "Z18fp_id", GXutil.ltrim( localUtil.ntoc( Z18fp_id, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z7pes_id", GXutil.ltrim( localUtil.ntoc( Z7pes_id, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z19fp_data", localUtil.format(Z19fp_data, "99/99/9999"));
      GxWebStd.gx_hidden_field( httpContext, "Z20fp_bucket", Z20fp_bucket);
      GxWebStd.gx_hidden_field( httpContext, "Z21fp_hash", Z21fp_hash);
      GxWebStd.gx_hidden_field( httpContext, "Z8pes_nome", Z8pes_nome);
      GxWebStd.gx_hidden_field( httpContext, "Z9pes_data_nascimento", localUtil.format(Z9pes_data_nascimento, "99/99/9999"));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Pes_id( )
   {
      /* Using cursor T000514 */
      pr_default.execute(12, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtpes_id_Internalname ;
      }
      A8pes_nome = T000514_A8pes_nome[0] ;
      A9pes_data_nascimento = T000514_A9pes_data_nascimento[0] ;
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
      httpContext.ajax_rsp_assign_attri("", false, "A9pes_data_nascimento", localUtil.format(A9pes_data_nascimento, "99/99/9999"));
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
      setEventMetadata("VALID_FP_ID","{handler:'valid_Fp_id',iparms:[{av:'A18fp_id',fld:'FP_ID',pic:'ZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A19fp_data',fld:'FP_DATA',pic:''}]");
      setEventMetadata("VALID_FP_ID",",oparms:[{av:'A7pes_id',fld:'PES_ID',pic:'ZZZ9'},{av:'A19fp_data',fld:'FP_DATA',pic:''},{av:'A20fp_bucket',fld:'FP_BUCKET',pic:''},{av:'A21fp_hash',fld:'FP_HASH',pic:''},{av:'A8pes_nome',fld:'PES_NOME',pic:'@!'},{av:'A9pes_data_nascimento',fld:'PES_DATA_NASCIMENTO',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z18fp_id'},{av:'Z7pes_id'},{av:'Z19fp_data'},{av:'Z20fp_bucket'},{av:'Z21fp_hash'},{av:'Z8pes_nome'},{av:'Z9pes_data_nascimento'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_PES_ID","{handler:'valid_Pes_id',iparms:[{av:'A7pes_id',fld:'PES_ID',pic:'ZZZ9'},{av:'A8pes_nome',fld:'PES_NOME',pic:'@!'},{av:'A9pes_data_nascimento',fld:'PES_DATA_NASCIMENTO',pic:''}]");
      setEventMetadata("VALID_PES_ID",",oparms:[{av:'A8pes_nome',fld:'PES_NOME',pic:'@!'},{av:'A9pes_data_nascimento',fld:'PES_DATA_NASCIMENTO',pic:''}]}");
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
      Z19fp_data = GXutil.nullDate() ;
      Z20fp_bucket = "" ;
      Z21fp_hash = "" ;
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
      A9pes_data_nascimento = GXutil.nullDate() ;
      A19fp_data = GXutil.nullDate() ;
      A20fp_bucket = "" ;
      A21fp_hash = "" ;
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
      Z9pes_data_nascimento = GXutil.nullDate() ;
      T00055_A18fp_id = new short[1] ;
      T00055_A8pes_nome = new String[] {""} ;
      T00055_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      T00055_A19fp_data = new java.util.Date[] {GXutil.nullDate()} ;
      T00055_A20fp_bucket = new String[] {""} ;
      T00055_A21fp_hash = new String[] {""} ;
      T00055_A7pes_id = new short[1] ;
      T00054_A8pes_nome = new String[] {""} ;
      T00054_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      T00056_A8pes_nome = new String[] {""} ;
      T00056_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      T00057_A18fp_id = new short[1] ;
      T00053_A18fp_id = new short[1] ;
      T00053_A19fp_data = new java.util.Date[] {GXutil.nullDate()} ;
      T00053_A20fp_bucket = new String[] {""} ;
      T00053_A21fp_hash = new String[] {""} ;
      T00053_A7pes_id = new short[1] ;
      sMode5 = "" ;
      T00058_A18fp_id = new short[1] ;
      T00059_A18fp_id = new short[1] ;
      T00052_A18fp_id = new short[1] ;
      T00052_A19fp_data = new java.util.Date[] {GXutil.nullDate()} ;
      T00052_A20fp_bucket = new String[] {""} ;
      T00052_A21fp_hash = new String[] {""} ;
      T00052_A7pes_id = new short[1] ;
      T000511_A18fp_id = new short[1] ;
      T000514_A8pes_nome = new String[] {""} ;
      T000514_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      T000515_A18fp_id = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i19fp_data = GXutil.nullDate() ;
      ZZ19fp_data = GXutil.nullDate() ;
      ZZ20fp_bucket = "" ;
      ZZ21fp_hash = "" ;
      ZZ8pes_nome = "" ;
      ZZ9pes_data_nascimento = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new foto_pessoa__default(),
         new Object[] {
             new Object[] {
            T00052_A18fp_id, T00052_A19fp_data, T00052_A20fp_bucket, T00052_A21fp_hash, T00052_A7pes_id
            }
            , new Object[] {
            T00053_A18fp_id, T00053_A19fp_data, T00053_A20fp_bucket, T00053_A21fp_hash, T00053_A7pes_id
            }
            , new Object[] {
            T00054_A8pes_nome, T00054_A9pes_data_nascimento
            }
            , new Object[] {
            T00055_A18fp_id, T00055_A8pes_nome, T00055_A9pes_data_nascimento, T00055_A19fp_data, T00055_A20fp_bucket, T00055_A21fp_hash, T00055_A7pes_id
            }
            , new Object[] {
            T00056_A8pes_nome, T00056_A9pes_data_nascimento
            }
            , new Object[] {
            T00057_A18fp_id
            }
            , new Object[] {
            T00058_A18fp_id
            }
            , new Object[] {
            T00059_A18fp_id
            }
            , new Object[] {
            }
            , new Object[] {
            T000511_A18fp_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000514_A8pes_nome, T000514_A9pes_data_nascimento
            }
            , new Object[] {
            T000515_A18fp_id
            }
         }
      );
      Z19fp_data = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A19fp_data = GXutil.serverDate( context, remoteHandle, pr_default) ;
      i19fp_data = GXutil.serverDate( context, remoteHandle, pr_default) ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z18fp_id ;
   private short Z7pes_id ;
   private short A7pes_id ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A18fp_id ;
   private short RcdFound5 ;
   private short nIsDirty_5 ;
   private short ZZ18fp_id ;
   private short ZZ7pes_id ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtfp_id_Enabled ;
   private int edtpes_id_Enabled ;
   private int edtpes_nome_Enabled ;
   private int edtpes_data_nascimento_Enabled ;
   private int edtfp_data_Enabled ;
   private int edtfp_bucket_Enabled ;
   private int edtfp_hash_Enabled ;
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
   private String edtfp_id_Internalname ;
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
   private String edtfp_id_Jsonclick ;
   private String edtpes_id_Internalname ;
   private String edtpes_id_Jsonclick ;
   private String edtpes_nome_Internalname ;
   private String edtpes_data_nascimento_Internalname ;
   private String edtpes_data_nascimento_Jsonclick ;
   private String edtfp_data_Internalname ;
   private String edtfp_data_Jsonclick ;
   private String edtfp_bucket_Internalname ;
   private String edtfp_bucket_Jsonclick ;
   private String edtfp_hash_Internalname ;
   private String edtfp_hash_Jsonclick ;
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
   private String sMode5 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z19fp_data ;
   private java.util.Date A9pes_data_nascimento ;
   private java.util.Date A19fp_data ;
   private java.util.Date Z9pes_data_nascimento ;
   private java.util.Date i19fp_data ;
   private java.util.Date ZZ19fp_data ;
   private java.util.Date ZZ9pes_data_nascimento ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private String Z20fp_bucket ;
   private String Z21fp_hash ;
   private String A8pes_nome ;
   private String A20fp_bucket ;
   private String A21fp_hash ;
   private String Z8pes_nome ;
   private String ZZ20fp_bucket ;
   private String ZZ21fp_hash ;
   private String ZZ8pes_nome ;
   private IDataStoreProvider pr_default ;
   private short[] T00055_A18fp_id ;
   private String[] T00055_A8pes_nome ;
   private java.util.Date[] T00055_A9pes_data_nascimento ;
   private java.util.Date[] T00055_A19fp_data ;
   private String[] T00055_A20fp_bucket ;
   private String[] T00055_A21fp_hash ;
   private short[] T00055_A7pes_id ;
   private String[] T00054_A8pes_nome ;
   private java.util.Date[] T00054_A9pes_data_nascimento ;
   private String[] T00056_A8pes_nome ;
   private java.util.Date[] T00056_A9pes_data_nascimento ;
   private short[] T00057_A18fp_id ;
   private short[] T00053_A18fp_id ;
   private java.util.Date[] T00053_A19fp_data ;
   private String[] T00053_A20fp_bucket ;
   private String[] T00053_A21fp_hash ;
   private short[] T00053_A7pes_id ;
   private short[] T00058_A18fp_id ;
   private short[] T00059_A18fp_id ;
   private short[] T00052_A18fp_id ;
   private java.util.Date[] T00052_A19fp_data ;
   private String[] T00052_A20fp_bucket ;
   private String[] T00052_A21fp_hash ;
   private short[] T00052_A7pes_id ;
   private short[] T000511_A18fp_id ;
   private String[] T000514_A8pes_nome ;
   private java.util.Date[] T000514_A9pes_data_nascimento ;
   private short[] T000515_A18fp_id ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class foto_pessoa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00052", "SELECT fp_id, fp_data, fp_bucket, fp_hash, pes_id FROM foto_pessoa WHERE fp_id = ?  FOR UPDATE OF foto_pessoa NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00053", "SELECT fp_id, fp_data, fp_bucket, fp_hash, pes_id FROM foto_pessoa WHERE fp_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00054", "SELECT pes_nome, pes_data_nascimento FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00055", "SELECT TM1.fp_id, T2.pes_nome, T2.pes_data_nascimento, TM1.fp_data, TM1.fp_bucket, TM1.fp_hash, TM1.pes_id FROM (foto_pessoa TM1 INNER JOIN pessoa T2 ON T2.pes_id = TM1.pes_id) WHERE TM1.fp_id = ? ORDER BY TM1.fp_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00056", "SELECT pes_nome, pes_data_nascimento FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00057", "SELECT fp_id FROM foto_pessoa WHERE fp_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00058", "SELECT fp_id FROM foto_pessoa WHERE ( fp_id > ?) ORDER BY fp_id  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00059", "SELECT fp_id FROM foto_pessoa WHERE ( fp_id < ?) ORDER BY fp_id DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000510", "SAVEPOINT gxupdate;INSERT INTO foto_pessoa(fp_data, fp_bucket, fp_hash, pes_id) VALUES(?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000511", "SELECT currval('fp_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000512", "SAVEPOINT gxupdate;UPDATE foto_pessoa SET fp_data=?, fp_bucket=?, fp_hash=?, pes_id=?  WHERE fp_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000513", "SAVEPOINT gxupdate;DELETE FROM foto_pessoa  WHERE fp_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000514", "SELECT pes_nome, pes_data_nascimento FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000515", "SELECT fp_id FROM foto_pessoa ORDER BY fp_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
      }
   }

}

