import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtLotacaoV3 extends GxUserType
{
   public SdtsdtLotacaoV3( )
   {
      this(  new ModelContext(SdtsdtLotacaoV3.class));
   }

   public SdtsdtLotacaoV3( ModelContext context )
   {
      super( context, "SdtsdtLotacaoV3");
   }

   public SdtsdtLotacaoV3( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtLotacaoV3");
   }

   public SdtsdtLotacaoV3( StructSdtsdtLotacaoV3 struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome") )
            {
               gxTv_SdtsdtLotacaoV3_Unid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla") )
            {
               gxTv_SdtsdtLotacaoV3_Unid_sigla = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_data_lotacao") )
            {
               gxTv_SdtsdtLotacaoV3_Lot_data_lotacao = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_data_remocao") )
            {
               gxTv_SdtsdtLotacaoV3_Lot_data_remocao = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_portaria") )
            {
               gxTv_SdtsdtLotacaoV3_Lot_portaria = oReader.getValue() ;
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
         sName = "sdtLotacaoV3" ;
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
      oWriter.writeElement("unid_nome", gxTv_SdtsdtLotacaoV3_Unid_nome);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_sigla", gxTv_SdtsdtLotacaoV3_Unid_sigla);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("lot_data_lotacao", gxTv_SdtsdtLotacaoV3_Lot_data_lotacao);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("lot_data_remocao", gxTv_SdtsdtLotacaoV3_Lot_data_remocao);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("lot_portaria", gxTv_SdtsdtLotacaoV3_Lot_portaria);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeEndElement();
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
      AddObjectProperty("unid_nome", gxTv_SdtsdtLotacaoV3_Unid_nome, false, false);
      AddObjectProperty("unid_sigla", gxTv_SdtsdtLotacaoV3_Unid_sigla, false, false);
      AddObjectProperty("lot_data_lotacao", gxTv_SdtsdtLotacaoV3_Lot_data_lotacao, false, false);
      AddObjectProperty("lot_data_remocao", gxTv_SdtsdtLotacaoV3_Lot_data_remocao, false, false);
      AddObjectProperty("lot_portaria", gxTv_SdtsdtLotacaoV3_Lot_portaria, false, false);
   }

   public String getgxTv_SdtsdtLotacaoV3_Unid_nome( )
   {
      return gxTv_SdtsdtLotacaoV3_Unid_nome ;
   }

   public void setgxTv_SdtsdtLotacaoV3_Unid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacaoV3_Unid_nome = value ;
   }

   public String getgxTv_SdtsdtLotacaoV3_Unid_sigla( )
   {
      return gxTv_SdtsdtLotacaoV3_Unid_sigla ;
   }

   public void setgxTv_SdtsdtLotacaoV3_Unid_sigla( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacaoV3_Unid_sigla = value ;
   }

   public String getgxTv_SdtsdtLotacaoV3_Lot_data_lotacao( )
   {
      return gxTv_SdtsdtLotacaoV3_Lot_data_lotacao ;
   }

   public void setgxTv_SdtsdtLotacaoV3_Lot_data_lotacao( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacaoV3_Lot_data_lotacao = value ;
   }

   public String getgxTv_SdtsdtLotacaoV3_Lot_data_remocao( )
   {
      return gxTv_SdtsdtLotacaoV3_Lot_data_remocao ;
   }

   public void setgxTv_SdtsdtLotacaoV3_Lot_data_remocao( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacaoV3_Lot_data_remocao = value ;
   }

   public String getgxTv_SdtsdtLotacaoV3_Lot_portaria( )
   {
      return gxTv_SdtsdtLotacaoV3_Lot_portaria ;
   }

   public void setgxTv_SdtsdtLotacaoV3_Lot_portaria( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtLotacaoV3_Lot_portaria = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtLotacaoV3_Unid_nome = "" ;
      sdtIsNull = (byte)(1) ;
      gxTv_SdtsdtLotacaoV3_Unid_sigla = "" ;
      gxTv_SdtsdtLotacaoV3_Lot_data_lotacao = "" ;
      gxTv_SdtsdtLotacaoV3_Lot_data_remocao = "" ;
      gxTv_SdtsdtLotacaoV3_Lot_portaria = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public SdtsdtLotacaoV3 Clone( )
   {
      return (SdtsdtLotacaoV3)(clone()) ;
   }

   public void setStruct( StructSdtsdtLotacaoV3 struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtsdtLotacaoV3_Unid_nome(struct.getUnid_nome());
         setgxTv_SdtsdtLotacaoV3_Unid_sigla(struct.getUnid_sigla());
         setgxTv_SdtsdtLotacaoV3_Lot_data_lotacao(struct.getLot_data_lotacao());
         setgxTv_SdtsdtLotacaoV3_Lot_data_remocao(struct.getLot_data_remocao());
         setgxTv_SdtsdtLotacaoV3_Lot_portaria(struct.getLot_portaria());
      }
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtLotacaoV3 getStruct( )
   {
      StructSdtsdtLotacaoV3 struct = new StructSdtsdtLotacaoV3 ();
      struct.setUnid_nome(getgxTv_SdtsdtLotacaoV3_Unid_nome());
      struct.setUnid_sigla(getgxTv_SdtsdtLotacaoV3_Unid_sigla());
      struct.setLot_data_lotacao(getgxTv_SdtsdtLotacaoV3_Lot_data_lotacao());
      struct.setLot_data_remocao(getgxTv_SdtsdtLotacaoV3_Lot_data_remocao());
      struct.setLot_portaria(getgxTv_SdtsdtLotacaoV3_Lot_portaria());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtLotacaoV3_Unid_nome ;
   protected String gxTv_SdtsdtLotacaoV3_Unid_sigla ;
   protected String gxTv_SdtsdtLotacaoV3_Lot_data_lotacao ;
   protected String gxTv_SdtsdtLotacaoV3_Lot_data_remocao ;
   protected String gxTv_SdtsdtLotacaoV3_Lot_portaria ;
}

