import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtFoto extends GxUserType
{
   public SdtsdtFoto( )
   {
      this(  new ModelContext(SdtsdtFoto.class));
   }

   public SdtsdtFoto( ModelContext context )
   {
      super( context, "SdtsdtFoto");
   }

   public SdtsdtFoto( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtFoto");
   }

   public SdtsdtFoto( StructSdtsdtFoto struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "arquivoBase64") )
            {
               gxTv_SdtsdtFoto_Arquivobase64 = oReader.getValue() ;
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
         sName = "sdtFoto" ;
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
      oWriter.writeElement("arquivoBase64", gxTv_SdtsdtFoto_Arquivobase64);
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
      AddObjectProperty("arquivoBase64", gxTv_SdtsdtFoto_Arquivobase64, false, false);
   }

   public String getgxTv_SdtsdtFoto_Arquivobase64( )
   {
      return gxTv_SdtsdtFoto_Arquivobase64 ;
   }

   public void setgxTv_SdtsdtFoto_Arquivobase64( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtFoto_Arquivobase64 = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtFoto_Arquivobase64 = "" ;
      sdtIsNull = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public SdtsdtFoto Clone( )
   {
      return (SdtsdtFoto)(clone()) ;
   }

   public void setStruct( StructSdtsdtFoto struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtsdtFoto_Arquivobase64(struct.getArquivobase64());
      }
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtFoto getStruct( )
   {
      StructSdtsdtFoto struct = new StructSdtsdtFoto ();
      struct.setArquivobase64(getgxTv_SdtsdtFoto_Arquivobase64());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtFoto_Arquivobase64 ;
}

