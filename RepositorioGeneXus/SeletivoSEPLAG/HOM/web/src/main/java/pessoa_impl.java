import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pessoa_impl extends GXDataArea
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
      Form.getMeta().addItem("description", "pessoa", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtpes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine", false);
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public pessoa_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public pessoa_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pessoa_impl.class ));
   }

   public pessoa_impl( int remoteHandle ,
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
      GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "pessoa", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_pessoa.htm");
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
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Selecionar", bttBtn_select_Jsonclick, 5, "Selecionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_pessoa.htm");
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
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtpes_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtpes_id_Internalname, "pes_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      GxWebStd.gx_single_line_edit( httpContext, edtpes_id_Internalname, GXutil.ltrim( localUtil.ntoc( A7pes_id, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( ((edtpes_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7pes_id), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7pes_id), "ZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtpes_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtpes_id_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtpes_nome_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtpes_nome_Internalname, "pes_nome", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GxWebStd.gx_html_textarea( httpContext, edtpes_nome_Internalname, A8pes_nome, "", TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,39);\"", (short)(0), 1, edtpes_nome_Enabled, 0, 80, "chr", 3, "row", (byte)(1), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "", "HLP_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtpes_data_nascimento_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtpes_data_nascimento_Internalname, "pes_data_nascimento", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtpes_data_nascimento_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      GxWebStd.gx_single_line_edit( httpContext, edtpes_data_nascimento_Internalname, localUtil.format(A9pes_data_nascimento, "99/99/9999"), localUtil.format( A9pes_data_nascimento, "99/99/9999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'DMY',0,24,'por',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',0,24,'por',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtpes_data_nascimento_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtpes_data_nascimento_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_pessoa.htm");
      GxWebStd.gx_bitmap( httpContext, edtpes_data_nascimento_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtpes_data_nascimento_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_pessoa.htm");
      httpContext.writeTextNL( "</div>") ;
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtpes_sexo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtpes_sexo_Internalname, "pes_sexo", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      GxWebStd.gx_single_line_edit( httpContext, edtpes_sexo_Internalname, A10pes_sexo, GXutil.rtrim( localUtil.format( A10pes_sexo, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtpes_sexo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtpes_sexo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtpes_mae_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtpes_mae_Internalname, "pes_mae", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GxWebStd.gx_html_textarea( httpContext, edtpes_mae_Internalname, A11pes_mae, "", TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,54);\"", (short)(0), 1, edtpes_mae_Enabled, 0, 80, "chr", 3, "row", (byte)(1), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "", "HLP_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtpes_pai_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtpes_pai_Internalname, "pes_pai", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GxWebStd.gx_html_textarea( httpContext, edtpes_pai_Internalname, A12pes_pai, "", TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,59);\"", (short)(0), 1, edtpes_pai_Enabled, 0, 80, "chr", 3, "row", (byte)(1), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "", "HLP_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "start", "top", "", "", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtpes_idade_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      GxWebStd.gx_label_element( httpContext, edtpes_idade_Internalname, "pes_idade", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      GxWebStd.gx_single_line_edit( httpContext, edtpes_idade_Internalname, GXutil.ltrim( localUtil.ntoc( A34pes_idade, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( ((edtpes_idade_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A34pes_idade), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A34pes_idade), "ZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtpes_idade_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtpes_idade_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_pessoa.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Fechar", bttBtn_cancel_Jsonclick, 1, "Fechar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_pessoa.htm");
      GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_pessoa.htm");
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
         Z7pes_id = (short)(localUtil.ctol( httpContext.cgiGet( "Z7pes_id"), ",", ".")) ;
         Z8pes_nome = httpContext.cgiGet( "Z8pes_nome") ;
         Z9pes_data_nascimento = localUtil.ctod( httpContext.cgiGet( "Z9pes_data_nascimento"), 0) ;
         Z10pes_sexo = httpContext.cgiGet( "Z10pes_sexo") ;
         Z11pes_mae = httpContext.cgiGet( "Z11pes_mae") ;
         Z12pes_pai = httpContext.cgiGet( "Z12pes_pai") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
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
         if ( localUtil.vcdate( httpContext.cgiGet( edtpes_data_nascimento_Internalname), (byte)(3)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PES_DATA_NASCIMENTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtpes_data_nascimento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9pes_data_nascimento = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A9pes_data_nascimento", localUtil.format(A9pes_data_nascimento, "99/99/9999"));
         }
         else
         {
            A9pes_data_nascimento = localUtil.ctod( httpContext.cgiGet( edtpes_data_nascimento_Internalname), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9pes_data_nascimento", localUtil.format(A9pes_data_nascimento, "99/99/9999"));
         }
         A10pes_sexo = GXutil.upper( httpContext.cgiGet( edtpes_sexo_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10pes_sexo", A10pes_sexo);
         A11pes_mae = GXutil.upper( httpContext.cgiGet( edtpes_mae_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11pes_mae", A11pes_mae);
         A12pes_pai = GXutil.upper( httpContext.cgiGet( edtpes_pai_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12pes_pai", A12pes_pai);
         A34pes_idade = (short)(localUtil.ctol( httpContext.cgiGet( edtpes_idade_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A34pes_idade", GXutil.ltrimstr( DecimalUtil.doubleToDec(A34pes_idade), 4, 0));
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
            A7pes_id = (short)(GXutil.lval( httpContext.GetPar( "pes_id"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
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
            initAll033( ) ;
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
      disableAttributes033( ) ;
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

   public void resetCaption030( )
   {
   }

   public void zm033( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8pes_nome = T00033_A8pes_nome[0] ;
            Z9pes_data_nascimento = T00033_A9pes_data_nascimento[0] ;
            Z10pes_sexo = T00033_A10pes_sexo[0] ;
            Z11pes_mae = T00033_A11pes_mae[0] ;
            Z12pes_pai = T00033_A12pes_pai[0] ;
         }
         else
         {
            Z8pes_nome = A8pes_nome ;
            Z9pes_data_nascimento = A9pes_data_nascimento ;
            Z10pes_sexo = A10pes_sexo ;
            Z11pes_mae = A11pes_mae ;
            Z12pes_pai = A12pes_pai ;
         }
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

   public void load033( )
   {
      /* Using cursor T00034 */
      pr_default.execute(2, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A8pes_nome = T00034_A8pes_nome[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
         A9pes_data_nascimento = T00034_A9pes_data_nascimento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9pes_data_nascimento", localUtil.format(A9pes_data_nascimento, "99/99/9999"));
         A10pes_sexo = T00034_A10pes_sexo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10pes_sexo", A10pes_sexo);
         A11pes_mae = T00034_A11pes_mae[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11pes_mae", A11pes_mae);
         A12pes_pai = T00034_A12pes_pai[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12pes_pai", A12pes_pai);
         zm033( -2) ;
      }
      pr_default.close(2);
      onLoadActions033( ) ;
   }

   public void onLoadActions033( )
   {
      GXt_dtime1 = GXutil.resetTime( A9pes_data_nascimento );
      A34pes_idade = (short)(GXutil.age( GXt_dtime1, GXutil.now( ))) ;
      httpContext.ajax_rsp_assign_attri("", false, "A34pes_idade", GXutil.ltrimstr( DecimalUtil.doubleToDec(A34pes_idade), 4, 0));
   }

   public void checkExtendedTable033( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      GXt_dtime1 = GXutil.resetTime( A9pes_data_nascimento );
      A34pes_idade = (short)(GXutil.age( GXt_dtime1, GXutil.now( ))) ;
      httpContext.ajax_rsp_assign_attri("", false, "A34pes_idade", GXutil.ltrimstr( DecimalUtil.doubleToDec(A34pes_idade), 4, 0));
   }

   public void closeExtendedTableCursors033( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey033( )
   {
      /* Using cursor T00035 */
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
      /* Using cursor T00033 */
      pr_default.execute(1, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm033( 2) ;
         RcdFound3 = (short)(1) ;
         A7pes_id = T00033_A7pes_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
         A8pes_nome = T00033_A8pes_nome[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
         A9pes_data_nascimento = T00033_A9pes_data_nascimento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9pes_data_nascimento", localUtil.format(A9pes_data_nascimento, "99/99/9999"));
         A10pes_sexo = T00033_A10pes_sexo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10pes_sexo", A10pes_sexo);
         A11pes_mae = T00033_A11pes_mae[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11pes_mae", A11pes_mae);
         A12pes_pai = T00033_A12pes_pai[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12pes_pai", A12pes_pai);
         Z7pes_id = A7pes_id ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load033( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey033( ) ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey033( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey033( ) ;
      if ( RcdFound3 == 0 )
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
      RcdFound3 = (short)(0) ;
      /* Using cursor T00036 */
      pr_default.execute(4, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00036_A7pes_id[0] < A7pes_id ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00036_A7pes_id[0] > A7pes_id ) ) )
         {
            A7pes_id = T00036_A7pes_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T00037 */
      pr_default.execute(5, new Object[] {Short.valueOf(A7pes_id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00037_A7pes_id[0] > A7pes_id ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00037_A7pes_id[0] < A7pes_id ) ) )
         {
            A7pes_id = T00037_A7pes_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey033( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtpes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert033( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound3 == 1 )
         {
            if ( A7pes_id != Z7pes_id )
            {
               A7pes_id = Z7pes_id ;
               httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PES_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtpes_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtpes_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update033( ) ;
               GX_FocusControl = edtpes_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A7pes_id != Z7pes_id )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtpes_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert033( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PES_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtpes_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtpes_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert033( ) ;
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
      if ( A7pes_id != Z7pes_id )
      {
         A7pes_id = Z7pes_id ;
         httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtpes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtpes_id_Internalname ;
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
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtpes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtpes_nome_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart033( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtpes_nome_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd033( ) ;
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
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtpes_nome_Internalname ;
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
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtpes_nome_Internalname ;
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
      scanStart033( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound3 != 0 )
         {
            scanNext033( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtpes_nome_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd033( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency033( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00032 */
         pr_default.execute(0, new Object[] {Short.valueOf(A7pes_id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"pessoa"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z8pes_nome, T00032_A8pes_nome[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z9pes_data_nascimento), GXutil.resetTime(T00032_A9pes_data_nascimento[0])) ) || ( GXutil.strcmp(Z10pes_sexo, T00032_A10pes_sexo[0]) != 0 ) || ( GXutil.strcmp(Z11pes_mae, T00032_A11pes_mae[0]) != 0 ) || ( GXutil.strcmp(Z12pes_pai, T00032_A12pes_pai[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z8pes_nome, T00032_A8pes_nome[0]) != 0 )
            {
               GXutil.writeLogln("pessoa:[seudo value changed for attri]"+"pes_nome");
               GXutil.writeLogRaw("Old: ",Z8pes_nome);
               GXutil.writeLogRaw("Current: ",T00032_A8pes_nome[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9pes_data_nascimento), GXutil.resetTime(T00032_A9pes_data_nascimento[0])) ) )
            {
               GXutil.writeLogln("pessoa:[seudo value changed for attri]"+"pes_data_nascimento");
               GXutil.writeLogRaw("Old: ",Z9pes_data_nascimento);
               GXutil.writeLogRaw("Current: ",T00032_A9pes_data_nascimento[0]);
            }
            if ( GXutil.strcmp(Z10pes_sexo, T00032_A10pes_sexo[0]) != 0 )
            {
               GXutil.writeLogln("pessoa:[seudo value changed for attri]"+"pes_sexo");
               GXutil.writeLogRaw("Old: ",Z10pes_sexo);
               GXutil.writeLogRaw("Current: ",T00032_A10pes_sexo[0]);
            }
            if ( GXutil.strcmp(Z11pes_mae, T00032_A11pes_mae[0]) != 0 )
            {
               GXutil.writeLogln("pessoa:[seudo value changed for attri]"+"pes_mae");
               GXutil.writeLogRaw("Old: ",Z11pes_mae);
               GXutil.writeLogRaw("Current: ",T00032_A11pes_mae[0]);
            }
            if ( GXutil.strcmp(Z12pes_pai, T00032_A12pes_pai[0]) != 0 )
            {
               GXutil.writeLogln("pessoa:[seudo value changed for attri]"+"pes_pai");
               GXutil.writeLogRaw("Old: ",Z12pes_pai);
               GXutil.writeLogRaw("Current: ",T00032_A12pes_pai[0]);
            }
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
                  /* Using cursor T00038 */
                  pr_default.execute(6, new Object[] {A8pes_nome, A9pes_data_nascimento, A10pes_sexo, A11pes_mae, A12pes_pai});
                  /* Retrieving last key number assigned */
                  /* Using cursor T00039 */
                  pr_default.execute(7);
                  A7pes_id = T00039_A7pes_id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
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
                        resetCaption030( ) ;
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
                  /* Using cursor T000310 */
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
                        resetCaption030( ) ;
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
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
               /* Using cursor T000311 */
               pr_default.execute(9, new Object[] {Short.valueOf(A7pes_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("pessoa");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound3 == 0 )
                     {
                        initAll033( ) ;
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
                     resetCaption030( ) ;
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
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel033( ) ;
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls033( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_dtime1 = GXutil.resetTime( A9pes_data_nascimento );
         A34pes_idade = (short)(GXutil.age( GXt_dtime1, GXutil.now( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A34pes_idade", GXutil.ltrimstr( DecimalUtil.doubleToDec(A34pes_idade), 4, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000312 */
         pr_default.execute(10, new Object[] {Short.valueOf(A7pes_id)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"lotacao"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T000313 */
         pr_default.execute(11, new Object[] {Short.valueOf(A7pes_id)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"foto_pessoa"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T000314 */
         pr_default.execute(12, new Object[] {Short.valueOf(A7pes_id)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"servidor_temporario"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T000315 */
         pr_default.execute(13, new Object[] {Short.valueOf(A7pes_id)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"servidor_efetivo"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T000316 */
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
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete033( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pessoa");
         if ( AnyError == 0 )
         {
            confirmValues030( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pessoa");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart033( )
   {
      /* Using cursor T000317 */
      pr_default.execute(15);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A7pes_id = T000317_A7pes_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext033( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A7pes_id = T000317_A7pes_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
      }
   }

   public void scanEnd033( )
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
      edtpes_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtpes_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtpes_id_Enabled), 5, 0), true);
      edtpes_nome_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtpes_nome_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtpes_nome_Enabled), 5, 0), true);
      edtpes_data_nascimento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtpes_data_nascimento_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtpes_data_nascimento_Enabled), 5, 0), true);
      edtpes_sexo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtpes_sexo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtpes_sexo_Enabled), 5, 0), true);
      edtpes_mae_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtpes_mae_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtpes_mae_Enabled), 5, 0), true);
      edtpes_pai_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtpes_pai_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtpes_pai_Enabled), 5, 0), true);
      edtpes_idade_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtpes_idade_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtpes_idade_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes033( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues030( )
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 1720180), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 1720180), false, true);
      httpContext.AddJavascriptSource("calendar-pt.js", "?"+httpContext.getBuildNumber( 1720180), false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("pessoa", new String[] {}, new String[] {}) +"\">") ;
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
      GxWebStd.gx_hidden_field( httpContext, "Z7pes_id", GXutil.ltrim( localUtil.ntoc( Z7pes_id, (byte)(4), (byte)(0), ",", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z8pes_nome", Z8pes_nome);
      GxWebStd.gx_hidden_field( httpContext, "Z9pes_data_nascimento", localUtil.dtoc( Z9pes_data_nascimento, 0, "/"));
      GxWebStd.gx_hidden_field( httpContext, "Z10pes_sexo", Z10pes_sexo);
      GxWebStd.gx_hidden_field( httpContext, "Z11pes_mae", Z11pes_mae);
      GxWebStd.gx_hidden_field( httpContext, "Z12pes_pai", Z12pes_pai);
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
      return formatLink("pessoa", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "pessoa" ;
   }

   public String getPgmdesc( )
   {
      return "pessoa" ;
   }

   public void initializeNonKey033( )
   {
      A34pes_idade = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A34pes_idade", GXutil.ltrimstr( DecimalUtil.doubleToDec(A34pes_idade), 4, 0));
      A8pes_nome = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
      A9pes_data_nascimento = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A9pes_data_nascimento", localUtil.format(A9pes_data_nascimento, "99/99/9999"));
      A10pes_sexo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10pes_sexo", A10pes_sexo);
      A11pes_mae = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11pes_mae", A11pes_mae);
      A12pes_pai = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12pes_pai", A12pes_pai);
      Z8pes_nome = "" ;
      Z9pes_data_nascimento = GXutil.nullDate() ;
      Z10pes_sexo = "" ;
      Z11pes_mae = "" ;
      Z12pes_pai = "" ;
   }

   public void initAll033( )
   {
      A7pes_id = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7pes_id), 4, 0));
      initializeNonKey033( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20254523212821", true, true);
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
      httpContext.AddJavascriptSource("pessoa.js", "?20254523212821", false, true);
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
      edtpes_id_Internalname = "PES_ID" ;
      edtpes_nome_Internalname = "PES_NOME" ;
      edtpes_data_nascimento_Internalname = "PES_DATA_NASCIMENTO" ;
      edtpes_sexo_Internalname = "PES_SEXO" ;
      edtpes_mae_Internalname = "PES_MAE" ;
      edtpes_pai_Internalname = "PES_PAI" ;
      edtpes_idade_Internalname = "PES_IDADE" ;
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
      Form.setCaption( "pessoa" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtpes_idade_Jsonclick = "" ;
      edtpes_idade_Enabled = 0 ;
      edtpes_pai_Enabled = 1 ;
      edtpes_mae_Enabled = 1 ;
      edtpes_sexo_Jsonclick = "" ;
      edtpes_sexo_Enabled = 1 ;
      edtpes_data_nascimento_Jsonclick = "" ;
      edtpes_data_nascimento_Enabled = 1 ;
      edtpes_nome_Enabled = 1 ;
      edtpes_id_Jsonclick = "" ;
      edtpes_id_Enabled = 1 ;
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
      GX_FocusControl = edtpes_nome_Internalname ;
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

   public void valid_Pes_id( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8pes_nome", A8pes_nome);
      httpContext.ajax_rsp_assign_attri("", false, "A9pes_data_nascimento", localUtil.format(A9pes_data_nascimento, "99/99/9999"));
      httpContext.ajax_rsp_assign_attri("", false, "A10pes_sexo", A10pes_sexo);
      httpContext.ajax_rsp_assign_attri("", false, "A11pes_mae", A11pes_mae);
      httpContext.ajax_rsp_assign_attri("", false, "A12pes_pai", A12pes_pai);
      httpContext.ajax_rsp_assign_attri("", false, "A34pes_idade", GXutil.ltrim( localUtil.ntoc( A34pes_idade, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "Z7pes_id", GXutil.ltrim( localUtil.ntoc( Z7pes_id, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z8pes_nome", Z8pes_nome);
      GxWebStd.gx_hidden_field( httpContext, "Z9pes_data_nascimento", localUtil.format(Z9pes_data_nascimento, "99/99/9999"));
      GxWebStd.gx_hidden_field( httpContext, "Z10pes_sexo", Z10pes_sexo);
      GxWebStd.gx_hidden_field( httpContext, "Z11pes_mae", Z11pes_mae);
      GxWebStd.gx_hidden_field( httpContext, "Z12pes_pai", Z12pes_pai);
      GxWebStd.gx_hidden_field( httpContext, "Z34pes_idade", GXutil.ltrim( localUtil.ntoc( Z34pes_idade, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Pes_data_nascimento( )
   {
      GXt_dtime1 = GXutil.resetTime( A9pes_data_nascimento );
      A34pes_idade = (short)(GXutil.age( GXt_dtime1, GXutil.now( ))) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A34pes_idade", GXutil.ltrim( localUtil.ntoc( A34pes_idade, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_PES_ID","{handler:'valid_Pes_id',iparms:[{av:'A7pes_id',fld:'PES_ID',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PES_ID",",oparms:[{av:'A8pes_nome',fld:'PES_NOME',pic:'@!'},{av:'A9pes_data_nascimento',fld:'PES_DATA_NASCIMENTO',pic:''},{av:'A10pes_sexo',fld:'PES_SEXO',pic:'@!'},{av:'A11pes_mae',fld:'PES_MAE',pic:'@!'},{av:'A12pes_pai',fld:'PES_PAI',pic:'@!'},{av:'A34pes_idade',fld:'PES_IDADE',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z7pes_id'},{av:'Z8pes_nome'},{av:'Z9pes_data_nascimento'},{av:'Z10pes_sexo'},{av:'Z11pes_mae'},{av:'Z12pes_pai'},{av:'Z34pes_idade'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_PES_DATA_NASCIMENTO","{handler:'valid_Pes_data_nascimento',iparms:[{av:'A9pes_data_nascimento',fld:'PES_DATA_NASCIMENTO',pic:''},{av:'A34pes_idade',fld:'PES_IDADE',pic:'ZZZ9'}]");
      setEventMetadata("VALID_PES_DATA_NASCIMENTO",",oparms:[{av:'A34pes_idade',fld:'PES_IDADE',pic:'ZZZ9'}]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z8pes_nome = "" ;
      Z9pes_data_nascimento = GXutil.nullDate() ;
      Z10pes_sexo = "" ;
      Z11pes_mae = "" ;
      Z12pes_pai = "" ;
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
      A10pes_sexo = "" ;
      A11pes_mae = "" ;
      A12pes_pai = "" ;
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
      T00034_A7pes_id = new short[1] ;
      T00034_A8pes_nome = new String[] {""} ;
      T00034_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      T00034_A10pes_sexo = new String[] {""} ;
      T00034_A11pes_mae = new String[] {""} ;
      T00034_A12pes_pai = new String[] {""} ;
      T00035_A7pes_id = new short[1] ;
      T00033_A7pes_id = new short[1] ;
      T00033_A8pes_nome = new String[] {""} ;
      T00033_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      T00033_A10pes_sexo = new String[] {""} ;
      T00033_A11pes_mae = new String[] {""} ;
      T00033_A12pes_pai = new String[] {""} ;
      sMode3 = "" ;
      T00036_A7pes_id = new short[1] ;
      T00037_A7pes_id = new short[1] ;
      T00032_A7pes_id = new short[1] ;
      T00032_A8pes_nome = new String[] {""} ;
      T00032_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      T00032_A10pes_sexo = new String[] {""} ;
      T00032_A11pes_mae = new String[] {""} ;
      T00032_A12pes_pai = new String[] {""} ;
      T00039_A7pes_id = new short[1] ;
      T000312_A22lot_id = new short[1] ;
      T000313_A18fp_id = new short[1] ;
      T000314_A7pes_id = new short[1] ;
      T000314_A32st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      T000315_A7pes_id = new short[1] ;
      T000315_A26se_matricula = new String[] {""} ;
      T000316_A7pes_id = new short[1] ;
      T000316_A13end_id = new short[1] ;
      T000317_A7pes_id = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ8pes_nome = "" ;
      ZZ9pes_data_nascimento = GXutil.nullDate() ;
      ZZ10pes_sexo = "" ;
      ZZ11pes_mae = "" ;
      ZZ12pes_pai = "" ;
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new pessoa__default(),
         new Object[] {
             new Object[] {
            T00032_A7pes_id, T00032_A8pes_nome, T00032_A9pes_data_nascimento, T00032_A10pes_sexo, T00032_A11pes_mae, T00032_A12pes_pai
            }
            , new Object[] {
            T00033_A7pes_id, T00033_A8pes_nome, T00033_A9pes_data_nascimento, T00033_A10pes_sexo, T00033_A11pes_mae, T00033_A12pes_pai
            }
            , new Object[] {
            T00034_A7pes_id, T00034_A8pes_nome, T00034_A9pes_data_nascimento, T00034_A10pes_sexo, T00034_A11pes_mae, T00034_A12pes_pai
            }
            , new Object[] {
            T00035_A7pes_id
            }
            , new Object[] {
            T00036_A7pes_id
            }
            , new Object[] {
            T00037_A7pes_id
            }
            , new Object[] {
            }
            , new Object[] {
            T00039_A7pes_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000312_A22lot_id
            }
            , new Object[] {
            T000313_A18fp_id
            }
            , new Object[] {
            T000314_A7pes_id, T000314_A32st_data_admissao
            }
            , new Object[] {
            T000315_A7pes_id, T000315_A26se_matricula
            }
            , new Object[] {
            T000316_A7pes_id, T000316_A13end_id
            }
            , new Object[] {
            T000317_A7pes_id
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z7pes_id ;
   private short gxcookieaux ;
   private short AnyError ;
   private short IsModified ;
   private short IsConfirmed ;
   private short A7pes_id ;
   private short A34pes_idade ;
   private short RcdFound3 ;
   private short Z34pes_idade ;
   private short ZZ7pes_id ;
   private short ZZ34pes_idade ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtpes_id_Enabled ;
   private int edtpes_nome_Enabled ;
   private int edtpes_data_nascimento_Enabled ;
   private int edtpes_sexo_Enabled ;
   private int edtpes_mae_Enabled ;
   private int edtpes_pai_Enabled ;
   private int edtpes_idade_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtpes_id_Internalname ;
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
   private String edtpes_id_Jsonclick ;
   private String edtpes_nome_Internalname ;
   private String edtpes_data_nascimento_Internalname ;
   private String edtpes_data_nascimento_Jsonclick ;
   private String edtpes_sexo_Internalname ;
   private String edtpes_sexo_Jsonclick ;
   private String edtpes_mae_Internalname ;
   private String edtpes_pai_Internalname ;
   private String edtpes_idade_Internalname ;
   private String edtpes_idade_Jsonclick ;
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
   private String sMode3 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date Z9pes_data_nascimento ;
   private java.util.Date A9pes_data_nascimento ;
   private java.util.Date ZZ9pes_data_nascimento ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private String Z8pes_nome ;
   private String Z10pes_sexo ;
   private String Z11pes_mae ;
   private String Z12pes_pai ;
   private String A8pes_nome ;
   private String A10pes_sexo ;
   private String A11pes_mae ;
   private String A12pes_pai ;
   private String ZZ8pes_nome ;
   private String ZZ10pes_sexo ;
   private String ZZ11pes_mae ;
   private String ZZ12pes_pai ;
   private IDataStoreProvider pr_default ;
   private short[] T00034_A7pes_id ;
   private String[] T00034_A8pes_nome ;
   private java.util.Date[] T00034_A9pes_data_nascimento ;
   private String[] T00034_A10pes_sexo ;
   private String[] T00034_A11pes_mae ;
   private String[] T00034_A12pes_pai ;
   private short[] T00035_A7pes_id ;
   private short[] T00033_A7pes_id ;
   private String[] T00033_A8pes_nome ;
   private java.util.Date[] T00033_A9pes_data_nascimento ;
   private String[] T00033_A10pes_sexo ;
   private String[] T00033_A11pes_mae ;
   private String[] T00033_A12pes_pai ;
   private short[] T00036_A7pes_id ;
   private short[] T00037_A7pes_id ;
   private short[] T00032_A7pes_id ;
   private String[] T00032_A8pes_nome ;
   private java.util.Date[] T00032_A9pes_data_nascimento ;
   private String[] T00032_A10pes_sexo ;
   private String[] T00032_A11pes_mae ;
   private String[] T00032_A12pes_pai ;
   private short[] T00039_A7pes_id ;
   private short[] T000312_A22lot_id ;
   private short[] T000313_A18fp_id ;
   private short[] T000314_A7pes_id ;
   private java.util.Date[] T000314_A32st_data_admissao ;
   private short[] T000315_A7pes_id ;
   private String[] T000315_A26se_matricula ;
   private short[] T000316_A7pes_id ;
   private short[] T000316_A13end_id ;
   private short[] T000317_A7pes_id ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class pessoa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00032", "SELECT pes_id, pes_nome, pes_data_nascimento, pes_sexo, pes_mae, pes_pai FROM pessoa WHERE pes_id = ?  FOR UPDATE OF pessoa NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00033", "SELECT pes_id, pes_nome, pes_data_nascimento, pes_sexo, pes_mae, pes_pai FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00034", "SELECT TM1.pes_id, TM1.pes_nome, TM1.pes_data_nascimento, TM1.pes_sexo, TM1.pes_mae, TM1.pes_pai FROM pessoa TM1 WHERE TM1.pes_id = ? ORDER BY TM1.pes_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00035", "SELECT pes_id FROM pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00036", "SELECT pes_id FROM pessoa WHERE ( pes_id > ?) ORDER BY pes_id  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00037", "SELECT pes_id FROM pessoa WHERE ( pes_id < ?) ORDER BY pes_id DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00038", "SAVEPOINT gxupdate;INSERT INTO pessoa(pes_nome, pes_data_nascimento, pes_sexo, pes_mae, pes_pai) VALUES(?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T00039", "SELECT currval('pes_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000310", "SAVEPOINT gxupdate;UPDATE pessoa SET pes_nome=?, pes_data_nascimento=?, pes_sexo=?, pes_mae=?, pes_pai=?  WHERE pes_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000311", "SAVEPOINT gxupdate;DELETE FROM pessoa  WHERE pes_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000312", "SELECT lot_id FROM lotacao WHERE pes_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000313", "SELECT fp_id FROM foto_pessoa WHERE pes_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000314", "SELECT pes_id, st_data_admissao FROM servidor_temporario WHERE pes_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000315", "SELECT pes_id, se_matricula FROM servidor_efetivo WHERE pes_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000316", "SELECT pes_id, end_id FROM pessoa_endereco WHERE pes_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000317", "SELECT pes_id FROM pessoa ORDER BY pes_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
      }
   }

}

