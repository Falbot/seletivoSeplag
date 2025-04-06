import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class Sdtservidor_temporario extends GxSilentTrnSdt
{
   public Sdtservidor_temporario( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(Sdtservidor_temporario.class));
   }

   public Sdtservidor_temporario( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "Sdtservidor_temporario");
      initialize( remoteHandle) ;
   }

   public Sdtservidor_temporario( int remoteHandle ,
                                  StructSdtservidor_temporario struct )
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

   public void Load( short AV7pes_id ,
                     java.util.Date AV32st_data_admissao )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Short.valueOf(AV7pes_id),AV32st_data_admissao});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"pes_id", short.class}, new Object[]{"st_data_admissao", java.util.Date.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "servidor_temporario");
      metadata.set("BT", "servidor_temporario");
      metadata.set("PK", "[ \"pes_id\",\"st_data_admissao\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"pes_id\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id") )
            {
               gxTv_Sdtservidor_temporario_Pes_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "st_data_admissao") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_Sdtservidor_temporario_St_data_admissao = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_Sdtservidor_temporario_St_data_admissao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "st_data_demissao") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_Sdtservidor_temporario_St_data_demissao = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_Sdtservidor_temporario_St_data_demissao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_Sdtservidor_temporario_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_Sdtservidor_temporario_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id_Z") )
            {
               gxTv_Sdtservidor_temporario_Pes_id_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "st_data_admissao_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_Sdtservidor_temporario_St_data_admissao_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_Sdtservidor_temporario_St_data_admissao_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "st_data_demissao_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_Sdtservidor_temporario_St_data_demissao_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_Sdtservidor_temporario_St_data_demissao_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
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
         sName = "servidor_temporario" ;
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
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_Sdtservidor_temporario_Pes_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtservidor_temporario_St_data_admissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtservidor_temporario_St_data_admissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtservidor_temporario_St_data_admissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("st_data_admissao", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtservidor_temporario_St_data_demissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtservidor_temporario_St_data_demissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtservidor_temporario_St_data_demissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("st_data_demissao", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_Sdtservidor_temporario_Mode);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_Sdtservidor_temporario_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("pes_id_Z", GXutil.trim( GXutil.str( gxTv_Sdtservidor_temporario_Pes_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtservidor_temporario_St_data_admissao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtservidor_temporario_St_data_admissao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtservidor_temporario_St_data_admissao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("st_data_admissao_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtservidor_temporario_St_data_demissao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtservidor_temporario_St_data_demissao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtservidor_temporario_St_data_demissao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("st_data_demissao_Z", sDateCnv);
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
      AddObjectProperty("pes_id", gxTv_Sdtservidor_temporario_Pes_id, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtservidor_temporario_St_data_admissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtservidor_temporario_St_data_admissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtservidor_temporario_St_data_admissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("st_data_admissao", sDateCnv, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtservidor_temporario_St_data_demissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtservidor_temporario_St_data_demissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtservidor_temporario_St_data_demissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("st_data_demissao", sDateCnv, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_Sdtservidor_temporario_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_Sdtservidor_temporario_Initialized, false, includeNonInitialized);
         AddObjectProperty("pes_id_Z", gxTv_Sdtservidor_temporario_Pes_id_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtservidor_temporario_St_data_admissao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtservidor_temporario_St_data_admissao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtservidor_temporario_St_data_admissao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("st_data_admissao_Z", sDateCnv, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtservidor_temporario_St_data_demissao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtservidor_temporario_St_data_demissao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtservidor_temporario_St_data_demissao_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("st_data_demissao_Z", sDateCnv, false, includeNonInitialized);
      }
   }

   public void updateDirties( Sdtservidor_temporario sdt )
   {
      if ( sdt.IsDirty("pes_id") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtservidor_temporario_Pes_id = sdt.getgxTv_Sdtservidor_temporario_Pes_id() ;
      }
      if ( sdt.IsDirty("st_data_admissao") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtservidor_temporario_St_data_admissao = sdt.getgxTv_Sdtservidor_temporario_St_data_admissao() ;
      }
      if ( sdt.IsDirty("st_data_demissao") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtservidor_temporario_St_data_demissao = sdt.getgxTv_Sdtservidor_temporario_St_data_demissao() ;
      }
   }

   public short getgxTv_Sdtservidor_temporario_Pes_id( )
   {
      return gxTv_Sdtservidor_temporario_Pes_id ;
   }

   public void setgxTv_Sdtservidor_temporario_Pes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      if ( gxTv_Sdtservidor_temporario_Pes_id != value )
      {
         gxTv_Sdtservidor_temporario_Mode = "INS" ;
         this.setgxTv_Sdtservidor_temporario_Pes_id_Z_SetNull( );
         this.setgxTv_Sdtservidor_temporario_St_data_admissao_Z_SetNull( );
         this.setgxTv_Sdtservidor_temporario_St_data_demissao_Z_SetNull( );
      }
      SetDirty("Pes_id");
      gxTv_Sdtservidor_temporario_Pes_id = value ;
   }

   public java.util.Date getgxTv_Sdtservidor_temporario_St_data_admissao( )
   {
      return gxTv_Sdtservidor_temporario_St_data_admissao ;
   }

   public void setgxTv_Sdtservidor_temporario_St_data_admissao( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      if ( !( GXutil.dateCompare(GXutil.resetTime(gxTv_Sdtservidor_temporario_St_data_admissao), GXutil.resetTime(value)) ) )
      {
         gxTv_Sdtservidor_temporario_Mode = "INS" ;
         this.setgxTv_Sdtservidor_temporario_Pes_id_Z_SetNull( );
         this.setgxTv_Sdtservidor_temporario_St_data_admissao_Z_SetNull( );
         this.setgxTv_Sdtservidor_temporario_St_data_demissao_Z_SetNull( );
      }
      SetDirty("St_data_admissao");
      gxTv_Sdtservidor_temporario_St_data_admissao = value ;
   }

   public java.util.Date getgxTv_Sdtservidor_temporario_St_data_demissao( )
   {
      return gxTv_Sdtservidor_temporario_St_data_demissao ;
   }

   public void setgxTv_Sdtservidor_temporario_St_data_demissao( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("St_data_demissao");
      gxTv_Sdtservidor_temporario_St_data_demissao = value ;
   }

   public String getgxTv_Sdtservidor_temporario_Mode( )
   {
      return gxTv_Sdtservidor_temporario_Mode ;
   }

   public void setgxTv_Sdtservidor_temporario_Mode( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Mode");
      gxTv_Sdtservidor_temporario_Mode = value ;
   }

   public void setgxTv_Sdtservidor_temporario_Mode_SetNull( )
   {
      gxTv_Sdtservidor_temporario_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_Sdtservidor_temporario_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtservidor_temporario_Initialized( )
   {
      return gxTv_Sdtservidor_temporario_Initialized ;
   }

   public void setgxTv_Sdtservidor_temporario_Initialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_Sdtservidor_temporario_Initialized = value ;
   }

   public void setgxTv_Sdtservidor_temporario_Initialized_SetNull( )
   {
      gxTv_Sdtservidor_temporario_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_Sdtservidor_temporario_Initialized_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtservidor_temporario_Pes_id_Z( )
   {
      return gxTv_Sdtservidor_temporario_Pes_id_Z ;
   }

   public void setgxTv_Sdtservidor_temporario_Pes_id_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_id_Z");
      gxTv_Sdtservidor_temporario_Pes_id_Z = value ;
   }

   public void setgxTv_Sdtservidor_temporario_Pes_id_Z_SetNull( )
   {
      gxTv_Sdtservidor_temporario_Pes_id_Z = (short)(0) ;
      SetDirty("Pes_id_Z");
   }

   public boolean getgxTv_Sdtservidor_temporario_Pes_id_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_Sdtservidor_temporario_St_data_admissao_Z( )
   {
      return gxTv_Sdtservidor_temporario_St_data_admissao_Z ;
   }

   public void setgxTv_Sdtservidor_temporario_St_data_admissao_Z( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("St_data_admissao_Z");
      gxTv_Sdtservidor_temporario_St_data_admissao_Z = value ;
   }

   public void setgxTv_Sdtservidor_temporario_St_data_admissao_Z_SetNull( )
   {
      gxTv_Sdtservidor_temporario_St_data_admissao_Z = GXutil.nullDate() ;
      SetDirty("St_data_admissao_Z");
   }

   public boolean getgxTv_Sdtservidor_temporario_St_data_admissao_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_Sdtservidor_temporario_St_data_demissao_Z( )
   {
      return gxTv_Sdtservidor_temporario_St_data_demissao_Z ;
   }

   public void setgxTv_Sdtservidor_temporario_St_data_demissao_Z( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("St_data_demissao_Z");
      gxTv_Sdtservidor_temporario_St_data_demissao_Z = value ;
   }

   public void setgxTv_Sdtservidor_temporario_St_data_demissao_Z_SetNull( )
   {
      gxTv_Sdtservidor_temporario_St_data_demissao_Z = GXutil.nullDate() ;
      SetDirty("St_data_demissao_Z");
   }

   public boolean getgxTv_Sdtservidor_temporario_St_data_demissao_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      servidor_temporario_bc obj;
      obj = new servidor_temporario_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_Sdtservidor_temporario_St_data_admissao = GXutil.nullDate() ;
      gxTv_Sdtservidor_temporario_St_data_demissao = GXutil.nullDate() ;
      gxTv_Sdtservidor_temporario_Mode = "" ;
      gxTv_Sdtservidor_temporario_St_data_admissao_Z = GXutil.nullDate() ;
      gxTv_Sdtservidor_temporario_St_data_demissao_Z = GXutil.nullDate() ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public Sdtservidor_temporario Clone( )
   {
      Sdtservidor_temporario sdt;
      servidor_temporario_bc obj;
      sdt = (Sdtservidor_temporario)(clone()) ;
      obj = (servidor_temporario_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtservidor_temporario struct )
   {
      if ( struct != null )
      {
         setgxTv_Sdtservidor_temporario_Pes_id(struct.getPes_id());
         setgxTv_Sdtservidor_temporario_St_data_admissao(struct.getSt_data_admissao());
         setgxTv_Sdtservidor_temporario_St_data_demissao(struct.getSt_data_demissao());
         setgxTv_Sdtservidor_temporario_Mode(struct.getMode());
         setgxTv_Sdtservidor_temporario_Initialized(struct.getInitialized());
         setgxTv_Sdtservidor_temporario_Pes_id_Z(struct.getPes_id_Z());
         setgxTv_Sdtservidor_temporario_St_data_admissao_Z(struct.getSt_data_admissao_Z());
         setgxTv_Sdtservidor_temporario_St_data_demissao_Z(struct.getSt_data_demissao_Z());
      }
   }

   @SuppressWarnings("unchecked")
   public StructSdtservidor_temporario getStruct( )
   {
      StructSdtservidor_temporario struct = new StructSdtservidor_temporario ();
      struct.setPes_id(getgxTv_Sdtservidor_temporario_Pes_id());
      struct.setSt_data_admissao(getgxTv_Sdtservidor_temporario_St_data_admissao());
      struct.setSt_data_demissao(getgxTv_Sdtservidor_temporario_St_data_demissao());
      struct.setMode(getgxTv_Sdtservidor_temporario_Mode());
      struct.setInitialized(getgxTv_Sdtservidor_temporario_Initialized());
      struct.setPes_id_Z(getgxTv_Sdtservidor_temporario_Pes_id_Z());
      struct.setSt_data_admissao_Z(getgxTv_Sdtservidor_temporario_St_data_admissao_Z());
      struct.setSt_data_demissao_Z(getgxTv_Sdtservidor_temporario_St_data_demissao_Z());
      return struct ;
   }

   private byte sdtIsNull ;
   private short gxTv_Sdtservidor_temporario_Pes_id ;
   private short gxTv_Sdtservidor_temporario_Initialized ;
   private short gxTv_Sdtservidor_temporario_Pes_id_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_Sdtservidor_temporario_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_Sdtservidor_temporario_St_data_admissao ;
   private java.util.Date gxTv_Sdtservidor_temporario_St_data_demissao ;
   private java.util.Date gxTv_Sdtservidor_temporario_St_data_admissao_Z ;
   private java.util.Date gxTv_Sdtservidor_temporario_St_data_demissao_Z ;
   private boolean readElement ;
   private boolean formatError ;
}

