import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtListaServidores_sdtListaServidoresItem extends GxUserType
{
   public SdtsdtListaServidores_sdtListaServidoresItem( )
   {
      this(  new ModelContext(SdtsdtListaServidores_sdtListaServidoresItem.class));
   }

   public SdtsdtListaServidores_sdtListaServidoresItem( ModelContext context )
   {
      super( context, "SdtsdtListaServidores_sdtListaServidoresItem");
   }

   public SdtsdtListaServidores_sdtListaServidoresItem( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtListaServidores_sdtListaServidoresItem");
   }

   public SdtsdtListaServidores_sdtListaServidoresItem( StructSdtsdtListaServidores_sdtListaServidoresItem struct )
   {
      this();
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
               gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_nome") )
            {
               gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_data_nascimento") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento = GXutil.nullDate() ;
                  gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento_N = (byte)(0) ;
                  gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_sexo") )
            {
               gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome") )
            {
               gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla") )
            {
               gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla = oReader.getValue() ;
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
                  gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao = GXutil.nullDate() ;
                  gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao_N = (byte)(0) ;
                  gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipoServidor") )
            {
               gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Foto") )
            {
               if ( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto == null )
               {
                  gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto.readxmlcollection(oReader, "Foto", "Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Foto") )
               {
                  GXSoapError = oReader.read() ;
               }
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
         sName = "sdtListaServidores.sdtListaServidoresItem" ;
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
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_nome", gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento)) && ( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento_N == 1 ) )
      {
         oWriter.writeElement("pes_data_nascimento", "");
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("pes_data_nascimento", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
      }
      oWriter.writeElement("pes_sexo", gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_nome", gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_sigla", gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao)) && ( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao_N == 1 ) )
      {
         oWriter.writeElement("lot_data_lotacao", "");
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("lot_data_lotacao", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
      }
      oWriter.writeElement("lot_portaria", gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("TipoServidor", gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "SeletivoSEPLAG" ;
         }
         else
         {
            sNameSpace1 = "SeletivoSEPLAG" ;
         }
         gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto.writexmlcollection(oWriter, "Foto", sNameSpace1, "Item", sNameSpace1);
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
      AddObjectProperty("pes_id", gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id, false, false);
      AddObjectProperty("pes_nome", gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("pes_data_nascimento", sDateCnv, false, false);
      AddObjectProperty("pes_sexo", gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo, false, false);
      AddObjectProperty("unid_nome", gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome, false, false);
      AddObjectProperty("unid_sigla", gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("lot_data_lotacao", sDateCnv, false, false);
      AddObjectProperty("lot_portaria", gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria, false, false);
      AddObjectProperty("TipoServidor", gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor, false, false);
      if ( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto != null )
      {
         AddObjectProperty("Foto", gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto, false, false);
      }
   }

   public short getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id ;
   }

   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id = value ;
   }

   public String getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome ;
   }

   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome = value ;
   }

   public java.util.Date getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento ;
   }

   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento( java.util.Date value )
   {
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento = value ;
   }

   public String getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo ;
   }

   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo = value ;
   }

   public String getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome ;
   }

   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome = value ;
   }

   public String getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla ;
   }

   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla = value ;
   }

   public java.util.Date getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao ;
   }

   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao( java.util.Date value )
   {
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao = value ;
   }

   public String getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria ;
   }

   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria = value ;
   }

   public String getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor ;
   }

   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor = value ;
   }

   public GXBaseCollection<SdtsdtURLFoto> getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto( )
   {
      if ( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto == null )
      {
         gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
      }
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto ;
   }

   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto( GXBaseCollection<SdtsdtURLFoto> value )
   {
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto = value ;
   }

   public void setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_SetNull( )
   {
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_N = (byte)(1) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto = null ;
   }

   public boolean getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_IsNull( )
   {
      if ( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_N( )
   {
      return gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome = "" ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento = GXutil.nullDate() ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento_N = (byte)(1) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo = "" ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome = "" ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla = "" ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao = GXutil.nullDate() ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao_N = (byte)(1) ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria = "" ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor = "" ;
      gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public SdtsdtListaServidores_sdtListaServidoresItem Clone( )
   {
      return (SdtsdtListaServidores_sdtListaServidoresItem)(clone()) ;
   }

   public void setStruct( StructSdtsdtListaServidores_sdtListaServidoresItem struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id(struct.getPes_id());
         setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome(struct.getPes_nome());
         if ( struct.gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento_N == 0 )
         {
            setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento(struct.getPes_data_nascimento());
         }
         setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo(struct.getPes_sexo());
         setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome(struct.getUnid_nome());
         setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla(struct.getUnid_sigla());
         if ( struct.gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao_N == 0 )
         {
            setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao(struct.getLot_data_lotacao());
         }
         setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria(struct.getLot_portaria());
         setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor(struct.getTiposervidor());
         GXBaseCollection<SdtsdtURLFoto> gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_aux = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
         Vector<StructSdtsdtURLFoto> gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_aux1 = struct.getFoto();
         if (gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_aux1.size(); i++)
            {
               gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_aux.add(new SdtsdtURLFoto(gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto(gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_aux);
      }
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtListaServidores_sdtListaServidoresItem getStruct( )
   {
      StructSdtsdtListaServidores_sdtListaServidoresItem struct = new StructSdtsdtListaServidores_sdtListaServidoresItem ();
      struct.setPes_id(getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id());
      struct.setPes_nome(getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome());
      if ( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento_N == 0 )
      {
         struct.setPes_data_nascimento(getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento());
      }
      struct.setPes_sexo(getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo());
      struct.setUnid_nome(getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome());
      struct.setUnid_sigla(getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla());
      if ( gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao_N == 0 )
      {
         struct.setLot_data_lotacao(getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao());
      }
      struct.setLot_portaria(getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria());
      struct.setTiposervidor(getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor());
      struct.setFoto(getgxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto().getStruct());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected byte gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento_N ;
   protected byte gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao_N ;
   protected byte gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_N ;
   protected short gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_data_nascimento ;
   protected java.util.Date gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_data_lotacao ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_nome ;
   protected String gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Pes_sexo ;
   protected String gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_nome ;
   protected String gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Unid_sigla ;
   protected String gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Lot_portaria ;
   protected String gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Tiposervidor ;
   protected GXBaseCollection<SdtsdtURLFoto> gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto_aux ;
   protected GXBaseCollection<SdtsdtURLFoto> gxTv_SdtsdtListaServidores_sdtListaServidoresItem_Foto=null ;
}

