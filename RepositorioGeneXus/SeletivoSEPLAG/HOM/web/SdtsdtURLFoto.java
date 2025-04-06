import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtURLFoto extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtsdtURLFoto( )
   {
      this(  new ModelContext(SdtsdtURLFoto.class));
   }

   public SdtsdtURLFoto( ModelContext context )
   {
      super( context, "SdtsdtURLFoto");
   }

   public SdtsdtURLFoto( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtURLFoto");
   }

   public SdtsdtURLFoto( StructSdtsdtURLFoto struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "LinkExp5Minutos") )
            {
               gxTv_SdtsdtURLFoto_Linkexp5minutos = oReader.getValue() ;
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
         sName = "sdtURLFoto" ;
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
      oWriter.writeElement("LinkExp5Minutos", GXutil.rtrim( gxTv_SdtsdtURLFoto_Linkexp5minutos));
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
      AddObjectProperty("LinkExp5Minutos", gxTv_SdtsdtURLFoto_Linkexp5minutos, false, false);
   }

   public String getgxTv_SdtsdtURLFoto_Linkexp5minutos( )
   {
      return gxTv_SdtsdtURLFoto_Linkexp5minutos ;
   }

   public void setgxTv_SdtsdtURLFoto_Linkexp5minutos( String value )
   {
      gxTv_SdtsdtURLFoto_N = (byte)(0) ;
      gxTv_SdtsdtURLFoto_Linkexp5minutos = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtURLFoto_Linkexp5minutos = "" ;
      gxTv_SdtsdtURLFoto_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtURLFoto_N ;
   }

   public SdtsdtURLFoto Clone( )
   {
      return (SdtsdtURLFoto)(clone()) ;
   }

   public void setStruct( StructSdtsdtURLFoto struct )
   {
      setgxTv_SdtsdtURLFoto_Linkexp5minutos(struct.getLinkexp5minutos());
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtURLFoto getStruct( )
   {
      StructSdtsdtURLFoto struct = new StructSdtsdtURLFoto ();
      struct.setLinkexp5minutos(getgxTv_SdtsdtURLFoto_Linkexp5minutos());
      return struct ;
   }

   protected byte gxTv_SdtsdtURLFoto_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtURLFoto_Linkexp5minutos ;
}

