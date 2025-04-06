import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtListaUnidades_sdtListaUnidadesItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtsdtListaUnidades_sdtListaUnidadesItem( )
   {
      this(  new ModelContext(SdtsdtListaUnidades_sdtListaUnidadesItem.class));
   }

   public SdtsdtListaUnidades_sdtListaUnidadesItem( ModelContext context )
   {
      super( context, "SdtsdtListaUnidades_sdtListaUnidadesItem");
   }

   public SdtsdtListaUnidades_sdtListaUnidadesItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtListaUnidades_sdtListaUnidadesItem");
   }

   public SdtsdtListaUnidades_sdtListaUnidadesItem( StructSdtsdtListaUnidades_sdtListaUnidadesItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id") )
            {
               gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome") )
            {
               gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla") )
            {
               gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla = oReader.getValue() ;
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
         sName = "sdtListaUnidades.sdtListaUnidadesItem" ;
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
      oWriter.writeElement("unid_id", GXutil.trim( GXutil.str( gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_nome", GXutil.rtrim( gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_sigla", GXutil.rtrim( gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla));
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
      AddObjectProperty("unid_id", gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id, false, false);
      AddObjectProperty("unid_nome", gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome, false, false);
      AddObjectProperty("unid_sigla", gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla, false, false);
   }

   public short getgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id( )
   {
      return gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id ;
   }

   public void setgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id( short value )
   {
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id = value ;
   }

   public String getgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome( )
   {
      return gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome ;
   }

   public void setgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome( String value )
   {
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome = value ;
   }

   public String getgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla( )
   {
      return gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla ;
   }

   public void setgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla( String value )
   {
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_N = (byte)(0) ;
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_N = (byte)(1) ;
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome = "" ;
      gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_N ;
   }

   public SdtsdtListaUnidades_sdtListaUnidadesItem Clone( )
   {
      return (SdtsdtListaUnidades_sdtListaUnidadesItem)(clone()) ;
   }

   public void setStruct( StructSdtsdtListaUnidades_sdtListaUnidadesItem struct )
   {
      setgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id(struct.getUnid_id());
      setgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome(struct.getUnid_nome());
      setgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla(struct.getUnid_sigla());
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtListaUnidades_sdtListaUnidadesItem getStruct( )
   {
      StructSdtsdtListaUnidades_sdtListaUnidadesItem struct = new StructSdtsdtListaUnidades_sdtListaUnidadesItem ();
      struct.setUnid_id(getgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id());
      struct.setUnid_nome(getgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome());
      struct.setUnid_sigla(getgxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla());
      return struct ;
   }

   protected byte gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_N ;
   protected short gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_nome ;
   protected String gxTv_SdtsdtListaUnidades_sdtListaUnidadesItem_Unid_sigla ;
}

