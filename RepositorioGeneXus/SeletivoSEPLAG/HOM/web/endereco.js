gx.evt.autoSkip=!1;gx.define("endereco",!1,function(){this.ServerClass="endereco";this.PackageName="";this.ServerFullClass="endereco";this.setObjectType("trn");this.hasEnterEvent=!0;this.skipOnEnter=!1;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){};this.Valid_End_id=function(){return this.validSrvEvt("valid_End_id",0).then(function(n){return n}.closure(this))};this.Valid_Cid_id=function(){return this.validSrvEvt("valid_Cid_id",0).then(function(n){return n}.closure(this))};this.e11044_client=function(){return this.executeServerEvent("ENTER",!0,null,!1,!1)};this.e12044_client=function(){return this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];var n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78];this.GXLastCtrlId=78;n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAINTABLE",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};n[6]={id:6,fld:"TITLECONTAINER",grid:0};n[7]={id:7,fld:"",grid:0};n[8]={id:8,fld:"",grid:0};n[9]={id:9,fld:"TITLE",format:0,grid:0,ctrltype:"textblock"};n[10]={id:10,fld:"",grid:0};n[11]={id:11,fld:"",grid:0};n[13]={id:13,fld:"",grid:0};n[14]={id:14,fld:"",grid:0};n[15]={id:15,fld:"FORMCONTAINER",grid:0};n[16]={id:16,fld:"",grid:0};n[17]={id:17,fld:"TOOLBARCELL",grid:0};n[18]={id:18,fld:"",grid:0};n[19]={id:19,fld:"",grid:0};n[20]={id:20,fld:"",grid:0};n[21]={id:21,fld:"BTN_FIRST",grid:0,evt:"e13044_client",std:"FIRST"};n[22]={id:22,fld:"",grid:0};n[23]={id:23,fld:"BTN_PREVIOUS",grid:0,evt:"e14044_client",std:"PREVIOUS"};n[24]={id:24,fld:"",grid:0};n[25]={id:25,fld:"BTN_NEXT",grid:0,evt:"e15044_client",std:"NEXT"};n[26]={id:26,fld:"",grid:0};n[27]={id:27,fld:"BTN_LAST",grid:0,evt:"e16044_client",std:"LAST"};n[28]={id:28,fld:"",grid:0};n[29]={id:29,fld:"BTN_SELECT",grid:0,evt:"e17044_client",std:"SELECT"};n[30]={id:30,fld:"",grid:0};n[31]={id:31,fld:"",grid:0};n[32]={id:32,fld:"",grid:0};n[33]={id:33,fld:"",grid:0};n[34]={id:34,lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_End_id,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"END_ID",gxz:"Z13end_id",gxold:"O13end_id",gxvar:"A13end_id",ucs:[],op:[59,54,49,44,39],ip:[59,54,49,44,39,34],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A13end_id=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z13end_id=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("END_ID",gx.O.A13end_id,0)},c2v:function(){this.val()!==undefined&&(gx.O.A13end_id=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("END_ID",".")},nac:gx.falseFn};n[35]={id:35,fld:"",grid:0};n[36]={id:36,fld:"",grid:0};n[37]={id:37,fld:"",grid:0};n[38]={id:38,fld:"",grid:0};n[39]={id:39,lvl:0,type:"svchar",len:50,dec:0,sign:!1,pic:"@!",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"END_TIPO_LOGRADOURO",gxz:"Z14end_tipo_logradouro",gxold:"O14end_tipo_logradouro",gxvar:"A14end_tipo_logradouro",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A14end_tipo_logradouro=n)},v2z:function(n){n!==undefined&&(gx.O.Z14end_tipo_logradouro=n)},v2c:function(){gx.fn.setControlValue("END_TIPO_LOGRADOURO",gx.O.A14end_tipo_logradouro,0)},c2v:function(){this.val()!==undefined&&(gx.O.A14end_tipo_logradouro=this.val())},val:function(){return gx.fn.getControlValue("END_TIPO_LOGRADOURO")},nac:gx.falseFn};n[40]={id:40,fld:"",grid:0};n[41]={id:41,fld:"",grid:0};n[42]={id:42,fld:"",grid:0};n[43]={id:43,fld:"",grid:0};n[44]={id:44,lvl:0,type:"svchar",len:200,dec:0,sign:!1,ro:0,multiline:!0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"END_LOGRADOURO",gxz:"Z15end_logradouro",gxold:"O15end_logradouro",gxvar:"A15end_logradouro",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A15end_logradouro=n)},v2z:function(n){n!==undefined&&(gx.O.Z15end_logradouro=n)},v2c:function(){gx.fn.setControlValue("END_LOGRADOURO",gx.O.A15end_logradouro,0)},c2v:function(){this.val()!==undefined&&(gx.O.A15end_logradouro=this.val())},val:function(){return gx.fn.getControlValue("END_LOGRADOURO")},nac:gx.falseFn};n[45]={id:45,fld:"",grid:0};n[46]={id:46,fld:"",grid:0};n[47]={id:47,fld:"",grid:0};n[48]={id:48,fld:"",grid:0};n[49]={id:49,lvl:0,type:"int",len:10,dec:0,sign:!1,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"END_NUMERO",gxz:"Z16end_numero",gxold:"O16end_numero",gxvar:"A16end_numero",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A16end_numero=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z16end_numero=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("END_NUMERO",gx.O.A16end_numero,0)},c2v:function(){this.val()!==undefined&&(gx.O.A16end_numero=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("END_NUMERO",".")},nac:gx.falseFn};n[50]={id:50,fld:"",grid:0};n[51]={id:51,fld:"",grid:0};n[52]={id:52,fld:"",grid:0};n[53]={id:53,fld:"",grid:0};n[54]={id:54,lvl:0,type:"svchar",len:100,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"END_BAIRRO",gxz:"Z17end_bairro",gxold:"O17end_bairro",gxvar:"A17end_bairro",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A17end_bairro=n)},v2z:function(n){n!==undefined&&(gx.O.Z17end_bairro=n)},v2c:function(){gx.fn.setControlValue("END_BAIRRO",gx.O.A17end_bairro,0)},c2v:function(){this.val()!==undefined&&(gx.O.A17end_bairro=this.val())},val:function(){return gx.fn.getControlValue("END_BAIRRO")},nac:gx.falseFn};n[55]={id:55,fld:"",grid:0};n[56]={id:56,fld:"",grid:0};n[57]={id:57,fld:"",grid:0};n[58]={id:58,fld:"",grid:0};n[59]={id:59,lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Cid_id,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"CID_ID",gxz:"Z1cid_id",gxold:"O1cid_id",gxvar:"A1cid_id",ucs:[],op:[69,64],ip:[69,64,59],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A1cid_id=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z1cid_id=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("CID_ID",gx.O.A1cid_id,0)},c2v:function(){this.val()!==undefined&&(gx.O.A1cid_id=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("CID_ID",".")},nac:gx.falseFn};n[60]={id:60,fld:"",grid:0};n[61]={id:61,fld:"",grid:0};n[62]={id:62,fld:"",grid:0};n[63]={id:63,fld:"",grid:0};n[64]={id:64,lvl:0,type:"svchar",len:200,dec:0,sign:!1,pic:"@!",ro:1,multiline:!0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"CID_NOME",gxz:"Z2cid_nome",gxold:"O2cid_nome",gxvar:"A2cid_nome",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A2cid_nome=n)},v2z:function(n){n!==undefined&&(gx.O.Z2cid_nome=n)},v2c:function(){gx.fn.setControlValue("CID_NOME",gx.O.A2cid_nome,0)},c2v:function(){this.val()!==undefined&&(gx.O.A2cid_nome=this.val())},val:function(){return gx.fn.getControlValue("CID_NOME")},nac:gx.falseFn};n[65]={id:65,fld:"",grid:0};n[66]={id:66,fld:"",grid:0};n[67]={id:67,fld:"",grid:0};n[68]={id:68,fld:"",grid:0};n[69]={id:69,lvl:0,type:"char",len:2,dec:0,sign:!1,pic:"@!",ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"CID_UF",gxz:"Z3cid_uf",gxold:"O3cid_uf",gxvar:"A3cid_uf",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A3cid_uf=n)},v2z:function(n){n!==undefined&&(gx.O.Z3cid_uf=n)},v2c:function(){gx.fn.setControlValue("CID_UF",gx.O.A3cid_uf,0)},c2v:function(){this.val()!==undefined&&(gx.O.A3cid_uf=this.val())},val:function(){return gx.fn.getControlValue("CID_UF")},nac:gx.falseFn};n[70]={id:70,fld:"",grid:0};n[71]={id:71,fld:"",grid:0};n[72]={id:72,fld:"",grid:0};n[73]={id:73,fld:"",grid:0};n[74]={id:74,fld:"BTN_ENTER",grid:0,evt:"e11044_client",std:"ENTER"};n[75]={id:75,fld:"",grid:0};n[76]={id:76,fld:"BTN_CANCEL",grid:0,evt:"e12044_client"};n[77]={id:77,fld:"",grid:0};n[78]={id:78,fld:"BTN_DELETE",grid:0,evt:"e18044_client",std:"DELETE"};this.A13end_id=0;this.Z13end_id=0;this.O13end_id=0;this.A14end_tipo_logradouro="";this.Z14end_tipo_logradouro="";this.O14end_tipo_logradouro="";this.A15end_logradouro="";this.Z15end_logradouro="";this.O15end_logradouro="";this.A16end_numero=0;this.Z16end_numero=0;this.O16end_numero=0;this.A17end_bairro="";this.Z17end_bairro="";this.O17end_bairro="";this.A1cid_id=0;this.Z1cid_id=0;this.O1cid_id=0;this.A2cid_nome="";this.Z2cid_nome="";this.O2cid_nome="";this.A3cid_uf="";this.Z3cid_uf="";this.O3cid_uf="";this.A13end_id=0;this.A14end_tipo_logradouro="";this.A15end_logradouro="";this.A16end_numero=0;this.A17end_bairro="";this.A1cid_id=0;this.A2cid_nome="";this.A3cid_uf="";this.Events={e11044_client:["ENTER",!0],e12044_client:["CANCEL",!0]};this.EvtParms.ENTER=[[{postForm:!0}],[]];this.EvtParms.REFRESH=[[],[]];this.EvtParms.VALID_END_ID=[[{av:"A13end_id",fld:"END_ID",pic:"ZZZ9"},{av:"Gx_mode",fld:"vMODE",pic:"@!"}],[{av:"A14end_tipo_logradouro",fld:"END_TIPO_LOGRADOURO",pic:"@!"},{av:"A15end_logradouro",fld:"END_LOGRADOURO",pic:""},{av:"A16end_numero",fld:"END_NUMERO",pic:"ZZZZZZZZZ9"},{av:"A17end_bairro",fld:"END_BAIRRO",pic:""},{av:"A1cid_id",fld:"CID_ID",pic:"ZZZ9"},{av:"A2cid_nome",fld:"CID_NOME",pic:"@!"},{av:"A3cid_uf",fld:"CID_UF",pic:"@!"},{av:"Gx_mode",fld:"vMODE",pic:"@!"},{av:"Z13end_id"},{av:"Z14end_tipo_logradouro"},{av:"Z15end_logradouro"},{av:"Z16end_numero"},{av:"Z17end_bairro"},{av:"Z1cid_id"},{av:"Z2cid_nome"},{av:"Z3cid_uf"},{ctrl:"BTN_DELETE",prop:"Enabled"},{ctrl:"BTN_ENTER",prop:"Enabled"}]];this.EvtParms.VALID_CID_ID=[[{av:"A1cid_id",fld:"CID_ID",pic:"ZZZ9"},{av:"A2cid_nome",fld:"CID_NOME",pic:"@!"},{av:"A3cid_uf",fld:"CID_UF",pic:"@!"}],[{av:"A2cid_nome",fld:"CID_NOME",pic:"@!"},{av:"A3cid_uf",fld:"CID_UF",pic:"@!"}]];this.EnterCtrl=["BTN_ENTER"];this.Initialize()});gx.wi(function(){gx.createParentObj(this.endereco)})