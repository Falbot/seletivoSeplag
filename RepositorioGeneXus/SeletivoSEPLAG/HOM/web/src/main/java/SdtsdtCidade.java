import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtCidade extends GxUserType
{
   public SdtsdtCidade( )
   {
      this(  new ModelContext(SdtsdtCidade.class));
   }

   public SdtsdtCidade( ModelContext context )
   {
      super( context, "SdtsdtCidade");
   }

   public SdtsdtCidade( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtCidade");
   }

   public SdtsdtCidade( StructSdtsdtCidade struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_nome") )
            {
               gxTv_SdtsdtCidade_Cid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_uf") )
            {
               gxTv_SdtsdtCidade_Cid_uf = oReader.getValue() ;
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
         sName = "sdtCidade" ;
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
      oWriter.writeElement("cid_nome", gxTv_SdtsdtCidade_Cid_nome);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("cid_uf", gxTv_SdtsdtCidade_Cid_uf);
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
      AddObjectProperty("cid_nome", gxTv_SdtsdtCidade_Cid_nome, false, false);
      AddObjectProperty("cid_uf", gxTv_SdtsdtCidade_Cid_uf, false, false);
   }

   public String getgxTv_SdtsdtCidade_Cid_nome( )
   {
      return gxTv_SdtsdtCidade_Cid_nome ;
   }

   public void setgxTv_SdtsdtCidade_Cid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtCidade_Cid_nome = value ;
   }

   public String getgxTv_SdtsdtCidade_Cid_uf( )
   {
      return gxTv_SdtsdtCidade_Cid_uf ;
   }

   public void setgxTv_SdtsdtCidade_Cid_uf( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtCidade_Cid_uf = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtCidade_Cid_nome = "" ;
      sdtIsNull = (byte)(1) ;
      gxTv_SdtsdtCidade_Cid_uf = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public SdtsdtCidade Clone( )
   {
      return (SdtsdtCidade)(clone()) ;
   }

   public void setStruct( StructSdtsdtCidade struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtsdtCidade_Cid_nome(struct.getCid_nome());
         setgxTv_SdtsdtCidade_Cid_uf(struct.getCid_uf());
      }
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtCidade getStruct( )
   {
      StructSdtsdtCidade struct = new StructSdtsdtCidade ();
      struct.setCid_nome(getgxTv_SdtsdtCidade_Cid_nome());
      struct.setCid_uf(getgxTv_SdtsdtCidade_Cid_uf());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtsdtCidade_Cid_uf ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtCidade_Cid_nome ;
}

