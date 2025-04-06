import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtPessoa extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtsdtPessoa( )
   {
      this(  new ModelContext(SdtsdtPessoa.class));
   }

   public SdtsdtPessoa( ModelContext context )
   {
      super( context, "SdtsdtPessoa");
   }

   public SdtsdtPessoa( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtPessoa");
   }

   public SdtsdtPessoa( StructSdtsdtPessoa struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_nome") )
            {
               gxTv_SdtsdtPessoa_Pes_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_data_nascimento") )
            {
               gxTv_SdtsdtPessoa_Pes_data_nascimento = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_sexo") )
            {
               gxTv_SdtsdtPessoa_Pes_sexo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_mae") )
            {
               gxTv_SdtsdtPessoa_Pes_mae = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_pai") )
            {
               gxTv_SdtsdtPessoa_Pes_pai = oReader.getValue() ;
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
         sName = "Pessoa" ;
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
      oWriter.writeElement("pes_nome", GXutil.rtrim( gxTv_SdtsdtPessoa_Pes_nome));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_data_nascimento", GXutil.rtrim( gxTv_SdtsdtPessoa_Pes_data_nascimento));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_sexo", GXutil.rtrim( gxTv_SdtsdtPessoa_Pes_sexo));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_mae", GXutil.rtrim( gxTv_SdtsdtPessoa_Pes_mae));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_pai", GXutil.rtrim( gxTv_SdtsdtPessoa_Pes_pai));
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
      AddObjectProperty("pes_nome", gxTv_SdtsdtPessoa_Pes_nome, false, false);
      AddObjectProperty("pes_data_nascimento", gxTv_SdtsdtPessoa_Pes_data_nascimento, false, false);
      AddObjectProperty("pes_sexo", gxTv_SdtsdtPessoa_Pes_sexo, false, false);
      AddObjectProperty("pes_mae", gxTv_SdtsdtPessoa_Pes_mae, false, false);
      AddObjectProperty("pes_pai", gxTv_SdtsdtPessoa_Pes_pai, false, false);
   }

   public String getgxTv_SdtsdtPessoa_Pes_nome( )
   {
      return gxTv_SdtsdtPessoa_Pes_nome ;
   }

   public void setgxTv_SdtsdtPessoa_Pes_nome( String value )
   {
      gxTv_SdtsdtPessoa_N = (byte)(0) ;
      gxTv_SdtsdtPessoa_Pes_nome = value ;
   }

   public String getgxTv_SdtsdtPessoa_Pes_data_nascimento( )
   {
      return gxTv_SdtsdtPessoa_Pes_data_nascimento ;
   }

   public void setgxTv_SdtsdtPessoa_Pes_data_nascimento( String value )
   {
      gxTv_SdtsdtPessoa_N = (byte)(0) ;
      gxTv_SdtsdtPessoa_Pes_data_nascimento = value ;
   }

   public String getgxTv_SdtsdtPessoa_Pes_sexo( )
   {
      return gxTv_SdtsdtPessoa_Pes_sexo ;
   }

   public void setgxTv_SdtsdtPessoa_Pes_sexo( String value )
   {
      gxTv_SdtsdtPessoa_N = (byte)(0) ;
      gxTv_SdtsdtPessoa_Pes_sexo = value ;
   }

   public String getgxTv_SdtsdtPessoa_Pes_mae( )
   {
      return gxTv_SdtsdtPessoa_Pes_mae ;
   }

   public void setgxTv_SdtsdtPessoa_Pes_mae( String value )
   {
      gxTv_SdtsdtPessoa_N = (byte)(0) ;
      gxTv_SdtsdtPessoa_Pes_mae = value ;
   }

   public String getgxTv_SdtsdtPessoa_Pes_pai( )
   {
      return gxTv_SdtsdtPessoa_Pes_pai ;
   }

   public void setgxTv_SdtsdtPessoa_Pes_pai( String value )
   {
      gxTv_SdtsdtPessoa_N = (byte)(0) ;
      gxTv_SdtsdtPessoa_Pes_pai = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtPessoa_Pes_nome = "" ;
      gxTv_SdtsdtPessoa_N = (byte)(1) ;
      gxTv_SdtsdtPessoa_Pes_data_nascimento = "" ;
      gxTv_SdtsdtPessoa_Pes_sexo = "" ;
      gxTv_SdtsdtPessoa_Pes_mae = "" ;
      gxTv_SdtsdtPessoa_Pes_pai = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtPessoa_N ;
   }

   public SdtsdtPessoa Clone( )
   {
      return (SdtsdtPessoa)(clone()) ;
   }

   public void setStruct( StructSdtsdtPessoa struct )
   {
      setgxTv_SdtsdtPessoa_Pes_nome(struct.getPes_nome());
      setgxTv_SdtsdtPessoa_Pes_data_nascimento(struct.getPes_data_nascimento());
      setgxTv_SdtsdtPessoa_Pes_sexo(struct.getPes_sexo());
      setgxTv_SdtsdtPessoa_Pes_mae(struct.getPes_mae());
      setgxTv_SdtsdtPessoa_Pes_pai(struct.getPes_pai());
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtPessoa getStruct( )
   {
      StructSdtsdtPessoa struct = new StructSdtsdtPessoa ();
      struct.setPes_nome(getgxTv_SdtsdtPessoa_Pes_nome());
      struct.setPes_data_nascimento(getgxTv_SdtsdtPessoa_Pes_data_nascimento());
      struct.setPes_sexo(getgxTv_SdtsdtPessoa_Pes_sexo());
      struct.setPes_mae(getgxTv_SdtsdtPessoa_Pes_mae());
      struct.setPes_pai(getgxTv_SdtsdtPessoa_Pes_pai());
      return struct ;
   }

   protected byte gxTv_SdtsdtPessoa_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtPessoa_Pes_nome ;
   protected String gxTv_SdtsdtPessoa_Pes_data_nascimento ;
   protected String gxTv_SdtsdtPessoa_Pes_sexo ;
   protected String gxTv_SdtsdtPessoa_Pes_mae ;
   protected String gxTv_SdtsdtPessoa_Pes_pai ;
}

