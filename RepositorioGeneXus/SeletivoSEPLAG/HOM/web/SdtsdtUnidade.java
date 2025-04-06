import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtUnidade extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtsdtUnidade( )
   {
      this(  new ModelContext(SdtsdtUnidade.class));
   }

   public SdtsdtUnidade( ModelContext context )
   {
      super( context, "SdtsdtUnidade");
   }

   public SdtsdtUnidade( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtUnidade");
   }

   public SdtsdtUnidade( StructSdtsdtUnidade struct )
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
               gxTv_SdtsdtUnidade_Unid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla") )
            {
               gxTv_SdtsdtUnidade_Unid_sigla = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DadosEndereco") )
            {
               if ( gxTv_SdtsdtUnidade_Dadosendereco == null )
               {
                  gxTv_SdtsdtUnidade_Dadosendereco = new SdtsdtEndereco(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtsdtUnidade_Dadosendereco.readxml(oReader, "DadosEndereco") ;
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
         sName = "sdtUnidade" ;
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
      oWriter.writeElement("unid_nome", GXutil.rtrim( gxTv_SdtsdtUnidade_Unid_nome));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_sigla", GXutil.rtrim( gxTv_SdtsdtUnidade_Unid_sigla));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( gxTv_SdtsdtUnidade_Dadosendereco != null )
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
         gxTv_SdtsdtUnidade_Dadosendereco.writexml(oWriter, "DadosEndereco", sNameSpace1);
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
      AddObjectProperty("unid_nome", gxTv_SdtsdtUnidade_Unid_nome, false, false);
      AddObjectProperty("unid_sigla", gxTv_SdtsdtUnidade_Unid_sigla, false, false);
      if ( gxTv_SdtsdtUnidade_Dadosendereco != null )
      {
         AddObjectProperty("DadosEndereco", gxTv_SdtsdtUnidade_Dadosendereco, false, false);
      }
   }

   public String getgxTv_SdtsdtUnidade_Unid_nome( )
   {
      return gxTv_SdtsdtUnidade_Unid_nome ;
   }

   public void setgxTv_SdtsdtUnidade_Unid_nome( String value )
   {
      gxTv_SdtsdtUnidade_N = (byte)(0) ;
      gxTv_SdtsdtUnidade_Unid_nome = value ;
   }

   public String getgxTv_SdtsdtUnidade_Unid_sigla( )
   {
      return gxTv_SdtsdtUnidade_Unid_sigla ;
   }

   public void setgxTv_SdtsdtUnidade_Unid_sigla( String value )
   {
      gxTv_SdtsdtUnidade_N = (byte)(0) ;
      gxTv_SdtsdtUnidade_Unid_sigla = value ;
   }

   public SdtsdtEndereco getgxTv_SdtsdtUnidade_Dadosendereco( )
   {
      if ( gxTv_SdtsdtUnidade_Dadosendereco == null )
      {
         gxTv_SdtsdtUnidade_Dadosendereco = new SdtsdtEndereco(remoteHandle, context);
      }
      gxTv_SdtsdtUnidade_Dadosendereco_N = (byte)(0) ;
      gxTv_SdtsdtUnidade_N = (byte)(0) ;
      return gxTv_SdtsdtUnidade_Dadosendereco ;
   }

   public void setgxTv_SdtsdtUnidade_Dadosendereco( SdtsdtEndereco value )
   {
      gxTv_SdtsdtUnidade_Dadosendereco_N = (byte)(0) ;
      gxTv_SdtsdtUnidade_N = (byte)(0) ;
      gxTv_SdtsdtUnidade_Dadosendereco = value;
   }

   public void setgxTv_SdtsdtUnidade_Dadosendereco_SetNull( )
   {
      gxTv_SdtsdtUnidade_Dadosendereco_N = (byte)(1) ;
      gxTv_SdtsdtUnidade_Dadosendereco = (SdtsdtEndereco)null;
   }

   public boolean getgxTv_SdtsdtUnidade_Dadosendereco_IsNull( )
   {
      if ( gxTv_SdtsdtUnidade_Dadosendereco == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtsdtUnidade_Dadosendereco_N( )
   {
      return gxTv_SdtsdtUnidade_Dadosendereco_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtUnidade_Unid_nome = "" ;
      gxTv_SdtsdtUnidade_N = (byte)(1) ;
      gxTv_SdtsdtUnidade_Unid_sigla = "" ;
      gxTv_SdtsdtUnidade_Dadosendereco_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtUnidade_N ;
   }

   public SdtsdtUnidade Clone( )
   {
      return (SdtsdtUnidade)(clone()) ;
   }

   public void setStruct( StructSdtsdtUnidade struct )
   {
      setgxTv_SdtsdtUnidade_Unid_nome(struct.getUnid_nome());
      setgxTv_SdtsdtUnidade_Unid_sigla(struct.getUnid_sigla());
      setgxTv_SdtsdtUnidade_Dadosendereco(new SdtsdtEndereco(struct.getDadosendereco()));
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtUnidade getStruct( )
   {
      StructSdtsdtUnidade struct = new StructSdtsdtUnidade ();
      struct.setUnid_nome(getgxTv_SdtsdtUnidade_Unid_nome());
      struct.setUnid_sigla(getgxTv_SdtsdtUnidade_Unid_sigla());
      struct.setDadosendereco(getgxTv_SdtsdtUnidade_Dadosendereco().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtsdtUnidade_N ;
   protected byte gxTv_SdtsdtUnidade_Dadosendereco_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtUnidade_Unid_nome ;
   protected String gxTv_SdtsdtUnidade_Unid_sigla ;
   protected SdtsdtEndereco gxTv_SdtsdtUnidade_Dadosendereco=null ;
}

