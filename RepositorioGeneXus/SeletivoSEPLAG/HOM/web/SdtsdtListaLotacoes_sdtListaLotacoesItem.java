import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtListaLotacoes_sdtListaLotacoesItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtsdtListaLotacoes_sdtListaLotacoesItem( )
   {
      this(  new ModelContext(SdtsdtListaLotacoes_sdtListaLotacoesItem.class));
   }

   public SdtsdtListaLotacoes_sdtListaLotacoesItem( ModelContext context )
   {
      super( context, "SdtsdtListaLotacoes_sdtListaLotacoesItem");
   }

   public SdtsdtListaLotacoes_sdtListaLotacoesItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtListaLotacoes_sdtListaLotacoesItem");
   }

   public SdtsdtListaLotacoes_sdtListaLotacoesItem( StructSdtsdtListaLotacoes_sdtListaLotacoesItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_id") )
            {
               gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id") )
            {
               gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_nome") )
            {
               gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id") )
            {
               gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome") )
            {
               gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla") )
            {
               gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_sigla = oReader.getValue() ;
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
                  gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao = GXutil.nullDate() ;
                  gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao_N = (byte)(0) ;
                  gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
                  gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao = GXutil.nullDate() ;
                  gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao_N = (byte)(0) ;
                  gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_portaria = oReader.getValue() ;
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
         sName = "sdtListaLotacoes.sdtListaLotacoesItem" ;
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
      oWriter.writeElement("lot_id", GXutil.trim( GXutil.str( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_nome", GXutil.rtrim( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_nome));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_id", GXutil.trim( GXutil.str( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_nome", GXutil.rtrim( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_nome));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_sigla", GXutil.rtrim( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_sigla));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao)) && ( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("lot_data_lotacao", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao)) && ( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao_N == 1 ) )
      {
         oWriter.writeElement("lot_data_remocao", "");
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("lot_data_remocao", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
      }
      oWriter.writeElement("lot_portaria", GXutil.rtrim( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_portaria));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
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
      AddObjectProperty("lot_id", gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_id, false, false);
      AddObjectProperty("pes_id", gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_id, false, false);
      AddObjectProperty("pes_nome", gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_nome, false, false);
      AddObjectProperty("unid_id", gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_id, false, false);
      AddObjectProperty("unid_nome", gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_nome, false, false);
      AddObjectProperty("unid_sigla", gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_sigla, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("lot_data_lotacao", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("lot_data_remocao", sDateCnv, false, false);
      AddObjectProperty("lot_portaria", gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_portaria, false, false);
   }

   public short getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_id( )
   {
      return gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_id ;
   }

   public void setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_id( short value )
   {
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_id = value ;
   }

   public short getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_id( )
   {
      return gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_id ;
   }

   public void setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_id( short value )
   {
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_id = value ;
   }

   public String getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_nome( )
   {
      return gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_nome ;
   }

   public void setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_nome( String value )
   {
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_nome = value ;
   }

   public short getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_id( )
   {
      return gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_id ;
   }

   public void setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_id( short value )
   {
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_id = value ;
   }

   public String getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_nome( )
   {
      return gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_nome ;
   }

   public void setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_nome( String value )
   {
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_nome = value ;
   }

   public String getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_sigla( )
   {
      return gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_sigla ;
   }

   public void setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_sigla( String value )
   {
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_sigla = value ;
   }

   public java.util.Date getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao( )
   {
      return gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao ;
   }

   public void setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao( java.util.Date value )
   {
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao = value ;
   }

   public java.util.Date getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao( )
   {
      return gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao ;
   }

   public void setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao( java.util.Date value )
   {
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao = value ;
   }

   public String getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_portaria( )
   {
      return gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_portaria ;
   }

   public void setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_portaria( String value )
   {
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_portaria = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_N = (byte)(1) ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_nome = "" ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_nome = "" ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_sigla = "" ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao = GXutil.nullDate() ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao_N = (byte)(1) ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao = GXutil.nullDate() ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao_N = (byte)(1) ;
      gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_portaria = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_N ;
   }

   public SdtsdtListaLotacoes_sdtListaLotacoesItem Clone( )
   {
      return (SdtsdtListaLotacoes_sdtListaLotacoesItem)(clone()) ;
   }

   public void setStruct( StructSdtsdtListaLotacoes_sdtListaLotacoesItem struct )
   {
      setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_id(struct.getLot_id());
      setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_id(struct.getPes_id());
      setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_nome(struct.getPes_nome());
      setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_id(struct.getUnid_id());
      setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_nome(struct.getUnid_nome());
      setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_sigla(struct.getUnid_sigla());
      if ( struct.gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao_N == 0 )
      {
         setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao(struct.getLot_data_lotacao());
      }
      if ( struct.gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao_N == 0 )
      {
         setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao(struct.getLot_data_remocao());
      }
      setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_portaria(struct.getLot_portaria());
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtListaLotacoes_sdtListaLotacoesItem getStruct( )
   {
      StructSdtsdtListaLotacoes_sdtListaLotacoesItem struct = new StructSdtsdtListaLotacoes_sdtListaLotacoesItem ();
      struct.setLot_id(getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_id());
      struct.setPes_id(getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_id());
      struct.setPes_nome(getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_nome());
      struct.setUnid_id(getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_id());
      struct.setUnid_nome(getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_nome());
      struct.setUnid_sigla(getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_sigla());
      if ( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao_N == 0 )
      {
         struct.setLot_data_lotacao(getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao());
      }
      if ( gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao_N == 0 )
      {
         struct.setLot_data_remocao(getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao());
      }
      struct.setLot_portaria(getgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_portaria());
      return struct ;
   }

   protected byte gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_N ;
   protected byte gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao_N ;
   protected byte gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao_N ;
   protected short gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_id ;
   protected short gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_id ;
   protected short gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao ;
   protected java.util.Date gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_nome ;
   protected String gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_nome ;
   protected String gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_sigla ;
   protected String gxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_portaria ;
}

