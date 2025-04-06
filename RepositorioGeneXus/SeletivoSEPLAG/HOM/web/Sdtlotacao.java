import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class Sdtlotacao extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public Sdtlotacao( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(Sdtlotacao.class));
   }

   public Sdtlotacao( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "Sdtlotacao");
      initialize( remoteHandle) ;
   }

   public Sdtlotacao( int remoteHandle ,
                      StructSdtlotacao struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public void Load( short AV22lot_id )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Short.valueOf(AV22lot_id)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"lot_id", short.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "lotacao");
      metadata.set("BT", "lotacao");
      metadata.set("PK", "[ \"lot_id\" ]");
      metadata.set("PKAssigned", "[ \"lot_id\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"pes_id\" ],\"FKMap\":[  ] },{ \"FK\":[ \"unid_id\" ],\"FKMap\":[  ] } ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1;
      formatError = false ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            readElement = false ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_id") )
            {
               gxTv_Sdtlotacao_Lot_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id") )
            {
               gxTv_Sdtlotacao_Pes_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_nome") )
            {
               gxTv_Sdtlotacao_Pes_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id") )
            {
               gxTv_Sdtlotacao_Unid_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome") )
            {
               gxTv_Sdtlotacao_Unid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla") )
            {
               gxTv_Sdtlotacao_Unid_sigla = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_data_lotacao") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_Sdtlotacao_Lot_data_lotacao = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_Sdtlotacao_Lot_data_lotacao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_data_remocao") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_Sdtlotacao_Lot_data_remocao = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_Sdtlotacao_Lot_data_remocao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_portaria") )
            {
               gxTv_Sdtlotacao_Lot_portaria = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_Sdtlotacao_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_Sdtlotacao_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_id_Z") )
            {
               gxTv_Sdtlotacao_Lot_id_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id_Z") )
            {
               gxTv_Sdtlotacao_Pes_id_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_nome_Z") )
            {
               gxTv_Sdtlotacao_Pes_nome_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id_Z") )
            {
               gxTv_Sdtlotacao_Unid_id_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome_Z") )
            {
               gxTv_Sdtlotacao_Unid_nome_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla_Z") )
            {
               gxTv_Sdtlotacao_Unid_sigla_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_data_lotacao_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_Sdtlotacao_Lot_data_lotacao_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_Sdtlotacao_Lot_data_lotacao_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_data_remocao_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_Sdtlotacao_Lot_data_remocao_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_Sdtlotacao_Lot_data_remocao_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_portaria_Z") )
            {
               gxTv_Sdtlotacao_Lot_portaria_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( ! readElement )
            {
               readOk = (short)(1) ;
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( ( readOk == 0 ) || formatError )
            {
               context.globals.sSOAPErrMsg += "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg += "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "lotacao" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "SeletivoSEPLAG" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("lot_id", GXutil.trim( GXutil.str( gxTv_Sdtlotacao_Lot_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_Sdtlotacao_Pes_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_nome", GXutil.rtrim( gxTv_Sdtlotacao_Pes_nome));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_id", GXutil.trim( GXutil.str( gxTv_Sdtlotacao_Unid_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_nome", GXutil.rtrim( gxTv_Sdtlotacao_Unid_nome));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_sigla", GXutil.rtrim( gxTv_Sdtlotacao_Unid_sigla));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtlotacao_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtlotacao_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtlotacao_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("lot_data_lotacao", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtlotacao_Lot_data_remocao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtlotacao_Lot_data_remocao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtlotacao_Lot_data_remocao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("lot_data_remocao", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("lot_portaria", GXutil.rtrim( gxTv_Sdtlotacao_Lot_portaria));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_Sdtlotacao_Mode));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_Sdtlotacao_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("lot_id_Z", GXutil.trim( GXutil.str( gxTv_Sdtlotacao_Lot_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("pes_id_Z", GXutil.trim( GXutil.str( gxTv_Sdtlotacao_Pes_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("pes_nome_Z", GXutil.rtrim( gxTv_Sdtlotacao_Pes_nome_Z));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("unid_id_Z", GXutil.trim( GXutil.str( gxTv_Sdtlotacao_Unid_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("unid_nome_Z", GXutil.rtrim( gxTv_Sdtlotacao_Unid_nome_Z));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("unid_sigla_Z", GXutil.rtrim( gxTv_Sdtlotacao_Unid_sigla_Z));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtlotacao_Lot_data_lotacao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtlotacao_Lot_data_lotacao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtlotacao_Lot_data_lotacao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("lot_data_lotacao_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtlotacao_Lot_data_remocao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtlotacao_Lot_data_remocao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtlotacao_Lot_data_remocao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("lot_data_remocao_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("lot_portaria_Z", GXutil.rtrim( gxTv_Sdtlotacao_Lot_portaria_Z));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
      }
      oWriter.writeEndElement();
   }

   public long getnumericvalue( String value )
   {
      if ( GXutil.notNumeric( value) )
      {
         formatError = true ;
      }
      return GXutil.lval( value) ;
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      tojson( includeState, true) ;
   }

   public void tojson( boolean includeState ,
                       boolean includeNonInitialized )
   {
      AddObjectProperty("lot_id", gxTv_Sdtlotacao_Lot_id, false, includeNonInitialized);
      AddObjectProperty("pes_id", gxTv_Sdtlotacao_Pes_id, false, includeNonInitialized);
      AddObjectProperty("pes_nome", gxTv_Sdtlotacao_Pes_nome, false, includeNonInitialized);
      AddObjectProperty("unid_id", gxTv_Sdtlotacao_Unid_id, false, includeNonInitialized);
      AddObjectProperty("unid_nome", gxTv_Sdtlotacao_Unid_nome, false, includeNonInitialized);
      AddObjectProperty("unid_sigla", gxTv_Sdtlotacao_Unid_sigla, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtlotacao_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtlotacao_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtlotacao_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("lot_data_lotacao", sDateCnv, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtlotacao_Lot_data_remocao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtlotacao_Lot_data_remocao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtlotacao_Lot_data_remocao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("lot_data_remocao", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("lot_portaria", gxTv_Sdtlotacao_Lot_portaria, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_Sdtlotacao_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_Sdtlotacao_Initialized, false, includeNonInitialized);
         AddObjectProperty("lot_id_Z", gxTv_Sdtlotacao_Lot_id_Z, false, includeNonInitialized);
         AddObjectProperty("pes_id_Z", gxTv_Sdtlotacao_Pes_id_Z, false, includeNonInitialized);
         AddObjectProperty("pes_nome_Z", gxTv_Sdtlotacao_Pes_nome_Z, false, includeNonInitialized);
         AddObjectProperty("unid_id_Z", gxTv_Sdtlotacao_Unid_id_Z, false, includeNonInitialized);
         AddObjectProperty("unid_nome_Z", gxTv_Sdtlotacao_Unid_nome_Z, false, includeNonInitialized);
         AddObjectProperty("unid_sigla_Z", gxTv_Sdtlotacao_Unid_sigla_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtlotacao_Lot_data_lotacao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtlotacao_Lot_data_lotacao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtlotacao_Lot_data_lotacao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("lot_data_lotacao_Z", sDateCnv, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtlotacao_Lot_data_remocao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtlotacao_Lot_data_remocao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtlotacao_Lot_data_remocao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("lot_data_remocao_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("lot_portaria_Z", gxTv_Sdtlotacao_Lot_portaria_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( Sdtlotacao sdt )
   {
      if ( sdt.IsDirty("lot_id") )
      {
         gxTv_Sdtlotacao_N = (byte)(0) ;
         gxTv_Sdtlotacao_Lot_id = sdt.getgxTv_Sdtlotacao_Lot_id() ;
      }
      if ( sdt.IsDirty("pes_id") )
      {
         gxTv_Sdtlotacao_N = (byte)(0) ;
         gxTv_Sdtlotacao_Pes_id = sdt.getgxTv_Sdtlotacao_Pes_id() ;
      }
      if ( sdt.IsDirty("pes_nome") )
      {
         gxTv_Sdtlotacao_N = (byte)(0) ;
         gxTv_Sdtlotacao_Pes_nome = sdt.getgxTv_Sdtlotacao_Pes_nome() ;
      }
      if ( sdt.IsDirty("unid_id") )
      {
         gxTv_Sdtlotacao_N = (byte)(0) ;
         gxTv_Sdtlotacao_Unid_id = sdt.getgxTv_Sdtlotacao_Unid_id() ;
      }
      if ( sdt.IsDirty("unid_nome") )
      {
         gxTv_Sdtlotacao_N = (byte)(0) ;
         gxTv_Sdtlotacao_Unid_nome = sdt.getgxTv_Sdtlotacao_Unid_nome() ;
      }
      if ( sdt.IsDirty("unid_sigla") )
      {
         gxTv_Sdtlotacao_N = (byte)(0) ;
         gxTv_Sdtlotacao_Unid_sigla = sdt.getgxTv_Sdtlotacao_Unid_sigla() ;
      }
      if ( sdt.IsDirty("lot_data_lotacao") )
      {
         gxTv_Sdtlotacao_N = (byte)(0) ;
         gxTv_Sdtlotacao_Lot_data_lotacao = sdt.getgxTv_Sdtlotacao_Lot_data_lotacao() ;
      }
      if ( sdt.IsDirty("lot_data_remocao") )
      {
         gxTv_Sdtlotacao_N = (byte)(0) ;
         gxTv_Sdtlotacao_Lot_data_remocao = sdt.getgxTv_Sdtlotacao_Lot_data_remocao() ;
      }
      if ( sdt.IsDirty("lot_portaria") )
      {
         gxTv_Sdtlotacao_N = (byte)(0) ;
         gxTv_Sdtlotacao_Lot_portaria = sdt.getgxTv_Sdtlotacao_Lot_portaria() ;
      }
   }

   public short getgxTv_Sdtlotacao_Lot_id( )
   {
      return gxTv_Sdtlotacao_Lot_id ;
   }

   public void setgxTv_Sdtlotacao_Lot_id( short value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      if ( gxTv_Sdtlotacao_Lot_id != value )
      {
         gxTv_Sdtlotacao_Mode = "INS" ;
         this.setgxTv_Sdtlotacao_Lot_id_Z_SetNull( );
         this.setgxTv_Sdtlotacao_Pes_id_Z_SetNull( );
         this.setgxTv_Sdtlotacao_Pes_nome_Z_SetNull( );
         this.setgxTv_Sdtlotacao_Unid_id_Z_SetNull( );
         this.setgxTv_Sdtlotacao_Unid_nome_Z_SetNull( );
         this.setgxTv_Sdtlotacao_Unid_sigla_Z_SetNull( );
         this.setgxTv_Sdtlotacao_Lot_data_lotacao_Z_SetNull( );
         this.setgxTv_Sdtlotacao_Lot_data_remocao_Z_SetNull( );
         this.setgxTv_Sdtlotacao_Lot_portaria_Z_SetNull( );
      }
      SetDirty("Lot_id");
      gxTv_Sdtlotacao_Lot_id = value ;
   }

   public short getgxTv_Sdtlotacao_Pes_id( )
   {
      return gxTv_Sdtlotacao_Pes_id ;
   }

   public void setgxTv_Sdtlotacao_Pes_id( short value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Pes_id");
      gxTv_Sdtlotacao_Pes_id = value ;
   }

   public String getgxTv_Sdtlotacao_Pes_nome( )
   {
      return gxTv_Sdtlotacao_Pes_nome ;
   }

   public void setgxTv_Sdtlotacao_Pes_nome( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Pes_nome");
      gxTv_Sdtlotacao_Pes_nome = value ;
   }

   public short getgxTv_Sdtlotacao_Unid_id( )
   {
      return gxTv_Sdtlotacao_Unid_id ;
   }

   public void setgxTv_Sdtlotacao_Unid_id( short value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Unid_id");
      gxTv_Sdtlotacao_Unid_id = value ;
   }

   public String getgxTv_Sdtlotacao_Unid_nome( )
   {
      return gxTv_Sdtlotacao_Unid_nome ;
   }

   public void setgxTv_Sdtlotacao_Unid_nome( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Unid_nome");
      gxTv_Sdtlotacao_Unid_nome = value ;
   }

   public String getgxTv_Sdtlotacao_Unid_sigla( )
   {
      return gxTv_Sdtlotacao_Unid_sigla ;
   }

   public void setgxTv_Sdtlotacao_Unid_sigla( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Unid_sigla");
      gxTv_Sdtlotacao_Unid_sigla = value ;
   }

   public java.util.Date getgxTv_Sdtlotacao_Lot_data_lotacao( )
   {
      return gxTv_Sdtlotacao_Lot_data_lotacao ;
   }

   public void setgxTv_Sdtlotacao_Lot_data_lotacao( java.util.Date value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Lot_data_lotacao");
      gxTv_Sdtlotacao_Lot_data_lotacao = value ;
   }

   public java.util.Date getgxTv_Sdtlotacao_Lot_data_remocao( )
   {
      return gxTv_Sdtlotacao_Lot_data_remocao ;
   }

   public void setgxTv_Sdtlotacao_Lot_data_remocao( java.util.Date value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Lot_data_remocao");
      gxTv_Sdtlotacao_Lot_data_remocao = value ;
   }

   public String getgxTv_Sdtlotacao_Lot_portaria( )
   {
      return gxTv_Sdtlotacao_Lot_portaria ;
   }

   public void setgxTv_Sdtlotacao_Lot_portaria( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Lot_portaria");
      gxTv_Sdtlotacao_Lot_portaria = value ;
   }

   public String getgxTv_Sdtlotacao_Mode( )
   {
      return gxTv_Sdtlotacao_Mode ;
   }

   public void setgxTv_Sdtlotacao_Mode( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_Sdtlotacao_Mode = value ;
   }

   public void setgxTv_Sdtlotacao_Mode_SetNull( )
   {
      gxTv_Sdtlotacao_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_Sdtlotacao_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtlotacao_Initialized( )
   {
      return gxTv_Sdtlotacao_Initialized ;
   }

   public void setgxTv_Sdtlotacao_Initialized( short value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_Sdtlotacao_Initialized = value ;
   }

   public void setgxTv_Sdtlotacao_Initialized_SetNull( )
   {
      gxTv_Sdtlotacao_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_Sdtlotacao_Initialized_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtlotacao_Lot_id_Z( )
   {
      return gxTv_Sdtlotacao_Lot_id_Z ;
   }

   public void setgxTv_Sdtlotacao_Lot_id_Z( short value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Lot_id_Z");
      gxTv_Sdtlotacao_Lot_id_Z = value ;
   }

   public void setgxTv_Sdtlotacao_Lot_id_Z_SetNull( )
   {
      gxTv_Sdtlotacao_Lot_id_Z = (short)(0) ;
      SetDirty("Lot_id_Z");
   }

   public boolean getgxTv_Sdtlotacao_Lot_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtlotacao_Pes_id_Z( )
   {
      return gxTv_Sdtlotacao_Pes_id_Z ;
   }

   public void setgxTv_Sdtlotacao_Pes_id_Z( short value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Pes_id_Z");
      gxTv_Sdtlotacao_Pes_id_Z = value ;
   }

   public void setgxTv_Sdtlotacao_Pes_id_Z_SetNull( )
   {
      gxTv_Sdtlotacao_Pes_id_Z = (short)(0) ;
      SetDirty("Pes_id_Z");
   }

   public boolean getgxTv_Sdtlotacao_Pes_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtlotacao_Pes_nome_Z( )
   {
      return gxTv_Sdtlotacao_Pes_nome_Z ;
   }

   public void setgxTv_Sdtlotacao_Pes_nome_Z( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Pes_nome_Z");
      gxTv_Sdtlotacao_Pes_nome_Z = value ;
   }

   public void setgxTv_Sdtlotacao_Pes_nome_Z_SetNull( )
   {
      gxTv_Sdtlotacao_Pes_nome_Z = "" ;
      SetDirty("Pes_nome_Z");
   }

   public boolean getgxTv_Sdtlotacao_Pes_nome_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtlotacao_Unid_id_Z( )
   {
      return gxTv_Sdtlotacao_Unid_id_Z ;
   }

   public void setgxTv_Sdtlotacao_Unid_id_Z( short value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Unid_id_Z");
      gxTv_Sdtlotacao_Unid_id_Z = value ;
   }

   public void setgxTv_Sdtlotacao_Unid_id_Z_SetNull( )
   {
      gxTv_Sdtlotacao_Unid_id_Z = (short)(0) ;
      SetDirty("Unid_id_Z");
   }

   public boolean getgxTv_Sdtlotacao_Unid_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtlotacao_Unid_nome_Z( )
   {
      return gxTv_Sdtlotacao_Unid_nome_Z ;
   }

   public void setgxTv_Sdtlotacao_Unid_nome_Z( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Unid_nome_Z");
      gxTv_Sdtlotacao_Unid_nome_Z = value ;
   }

   public void setgxTv_Sdtlotacao_Unid_nome_Z_SetNull( )
   {
      gxTv_Sdtlotacao_Unid_nome_Z = "" ;
      SetDirty("Unid_nome_Z");
   }

   public boolean getgxTv_Sdtlotacao_Unid_nome_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtlotacao_Unid_sigla_Z( )
   {
      return gxTv_Sdtlotacao_Unid_sigla_Z ;
   }

   public void setgxTv_Sdtlotacao_Unid_sigla_Z( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Unid_sigla_Z");
      gxTv_Sdtlotacao_Unid_sigla_Z = value ;
   }

   public void setgxTv_Sdtlotacao_Unid_sigla_Z_SetNull( )
   {
      gxTv_Sdtlotacao_Unid_sigla_Z = "" ;
      SetDirty("Unid_sigla_Z");
   }

   public boolean getgxTv_Sdtlotacao_Unid_sigla_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_Sdtlotacao_Lot_data_lotacao_Z( )
   {
      return gxTv_Sdtlotacao_Lot_data_lotacao_Z ;
   }

   public void setgxTv_Sdtlotacao_Lot_data_lotacao_Z( java.util.Date value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Lot_data_lotacao_Z");
      gxTv_Sdtlotacao_Lot_data_lotacao_Z = value ;
   }

   public void setgxTv_Sdtlotacao_Lot_data_lotacao_Z_SetNull( )
   {
      gxTv_Sdtlotacao_Lot_data_lotacao_Z = GXutil.nullDate() ;
      SetDirty("Lot_data_lotacao_Z");
   }

   public boolean getgxTv_Sdtlotacao_Lot_data_lotacao_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_Sdtlotacao_Lot_data_remocao_Z( )
   {
      return gxTv_Sdtlotacao_Lot_data_remocao_Z ;
   }

   public void setgxTv_Sdtlotacao_Lot_data_remocao_Z( java.util.Date value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Lot_data_remocao_Z");
      gxTv_Sdtlotacao_Lot_data_remocao_Z = value ;
   }

   public void setgxTv_Sdtlotacao_Lot_data_remocao_Z_SetNull( )
   {
      gxTv_Sdtlotacao_Lot_data_remocao_Z = GXutil.nullDate() ;
      SetDirty("Lot_data_remocao_Z");
   }

   public boolean getgxTv_Sdtlotacao_Lot_data_remocao_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtlotacao_Lot_portaria_Z( )
   {
      return gxTv_Sdtlotacao_Lot_portaria_Z ;
   }

   public void setgxTv_Sdtlotacao_Lot_portaria_Z( String value )
   {
      gxTv_Sdtlotacao_N = (byte)(0) ;
      SetDirty("Lot_portaria_Z");
      gxTv_Sdtlotacao_Lot_portaria_Z = value ;
   }

   public void setgxTv_Sdtlotacao_Lot_portaria_Z_SetNull( )
   {
      gxTv_Sdtlotacao_Lot_portaria_Z = "" ;
      SetDirty("Lot_portaria_Z");
   }

   public boolean getgxTv_Sdtlotacao_Lot_portaria_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      lotacao_bc obj;
      obj = new lotacao_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_Sdtlotacao_N = (byte)(1) ;
      gxTv_Sdtlotacao_Pes_nome = "" ;
      gxTv_Sdtlotacao_Unid_nome = "" ;
      gxTv_Sdtlotacao_Unid_sigla = "" ;
      gxTv_Sdtlotacao_Lot_data_lotacao = GXutil.nullDate() ;
      gxTv_Sdtlotacao_Lot_data_remocao = GXutil.nullDate() ;
      gxTv_Sdtlotacao_Lot_portaria = "" ;
      gxTv_Sdtlotacao_Mode = "" ;
      gxTv_Sdtlotacao_Pes_nome_Z = "" ;
      gxTv_Sdtlotacao_Unid_nome_Z = "" ;
      gxTv_Sdtlotacao_Unid_sigla_Z = "" ;
      gxTv_Sdtlotacao_Lot_data_lotacao_Z = GXutil.nullDate() ;
      gxTv_Sdtlotacao_Lot_data_remocao_Z = GXutil.nullDate() ;
      gxTv_Sdtlotacao_Lot_portaria_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_Sdtlotacao_N ;
   }

   public Sdtlotacao Clone( )
   {
      Sdtlotacao sdt;
      lotacao_bc obj;
      sdt = (Sdtlotacao)(clone()) ;
      obj = (lotacao_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtlotacao struct )
   {
      setgxTv_Sdtlotacao_Lot_id(struct.getLot_id());
      setgxTv_Sdtlotacao_Pes_id(struct.getPes_id());
      setgxTv_Sdtlotacao_Pes_nome(struct.getPes_nome());
      setgxTv_Sdtlotacao_Unid_id(struct.getUnid_id());
      setgxTv_Sdtlotacao_Unid_nome(struct.getUnid_nome());
      setgxTv_Sdtlotacao_Unid_sigla(struct.getUnid_sigla());
      setgxTv_Sdtlotacao_Lot_data_lotacao(struct.getLot_data_lotacao());
      setgxTv_Sdtlotacao_Lot_data_remocao(struct.getLot_data_remocao());
      setgxTv_Sdtlotacao_Lot_portaria(struct.getLot_portaria());
      setgxTv_Sdtlotacao_Mode(struct.getMode());
      setgxTv_Sdtlotacao_Initialized(struct.getInitialized());
      setgxTv_Sdtlotacao_Lot_id_Z(struct.getLot_id_Z());
      setgxTv_Sdtlotacao_Pes_id_Z(struct.getPes_id_Z());
      setgxTv_Sdtlotacao_Pes_nome_Z(struct.getPes_nome_Z());
      setgxTv_Sdtlotacao_Unid_id_Z(struct.getUnid_id_Z());
      setgxTv_Sdtlotacao_Unid_nome_Z(struct.getUnid_nome_Z());
      setgxTv_Sdtlotacao_Unid_sigla_Z(struct.getUnid_sigla_Z());
      setgxTv_Sdtlotacao_Lot_data_lotacao_Z(struct.getLot_data_lotacao_Z());
      setgxTv_Sdtlotacao_Lot_data_remocao_Z(struct.getLot_data_remocao_Z());
      setgxTv_Sdtlotacao_Lot_portaria_Z(struct.getLot_portaria_Z());
   }

   @SuppressWarnings("unchecked")
   public StructSdtlotacao getStruct( )
   {
      StructSdtlotacao struct = new StructSdtlotacao ();
      struct.setLot_id(getgxTv_Sdtlotacao_Lot_id());
      struct.setPes_id(getgxTv_Sdtlotacao_Pes_id());
      struct.setPes_nome(getgxTv_Sdtlotacao_Pes_nome());
      struct.setUnid_id(getgxTv_Sdtlotacao_Unid_id());
      struct.setUnid_nome(getgxTv_Sdtlotacao_Unid_nome());
      struct.setUnid_sigla(getgxTv_Sdtlotacao_Unid_sigla());
      struct.setLot_data_lotacao(getgxTv_Sdtlotacao_Lot_data_lotacao());
      struct.setLot_data_remocao(getgxTv_Sdtlotacao_Lot_data_remocao());
      struct.setLot_portaria(getgxTv_Sdtlotacao_Lot_portaria());
      struct.setMode(getgxTv_Sdtlotacao_Mode());
      struct.setInitialized(getgxTv_Sdtlotacao_Initialized());
      struct.setLot_id_Z(getgxTv_Sdtlotacao_Lot_id_Z());
      struct.setPes_id_Z(getgxTv_Sdtlotacao_Pes_id_Z());
      struct.setPes_nome_Z(getgxTv_Sdtlotacao_Pes_nome_Z());
      struct.setUnid_id_Z(getgxTv_Sdtlotacao_Unid_id_Z());
      struct.setUnid_nome_Z(getgxTv_Sdtlotacao_Unid_nome_Z());
      struct.setUnid_sigla_Z(getgxTv_Sdtlotacao_Unid_sigla_Z());
      struct.setLot_data_lotacao_Z(getgxTv_Sdtlotacao_Lot_data_lotacao_Z());
      struct.setLot_data_remocao_Z(getgxTv_Sdtlotacao_Lot_data_remocao_Z());
      struct.setLot_portaria_Z(getgxTv_Sdtlotacao_Lot_portaria_Z());
      return struct ;
   }

   private byte gxTv_Sdtlotacao_N ;
   private short gxTv_Sdtlotacao_Lot_id ;
   private short gxTv_Sdtlotacao_Pes_id ;
   private short gxTv_Sdtlotacao_Unid_id ;
   private short gxTv_Sdtlotacao_Initialized ;
   private short gxTv_Sdtlotacao_Lot_id_Z ;
   private short gxTv_Sdtlotacao_Pes_id_Z ;
   private short gxTv_Sdtlotacao_Unid_id_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_Sdtlotacao_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_Sdtlotacao_Lot_data_lotacao ;
   private java.util.Date gxTv_Sdtlotacao_Lot_data_remocao ;
   private java.util.Date gxTv_Sdtlotacao_Lot_data_lotacao_Z ;
   private java.util.Date gxTv_Sdtlotacao_Lot_data_remocao_Z ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_Sdtlotacao_Pes_nome ;
   private String gxTv_Sdtlotacao_Unid_nome ;
   private String gxTv_Sdtlotacao_Unid_sigla ;
   private String gxTv_Sdtlotacao_Lot_portaria ;
   private String gxTv_Sdtlotacao_Pes_nome_Z ;
   private String gxTv_Sdtlotacao_Unid_nome_Z ;
   private String gxTv_Sdtlotacao_Unid_sigla_Z ;
   private String gxTv_Sdtlotacao_Lot_portaria_Z ;
}

