import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtListaEndereco extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtsdtListaEndereco( )
   {
      this(  new ModelContext(SdtsdtListaEndereco.class));
   }

   public SdtsdtListaEndereco( ModelContext context )
   {
      super( context, "SdtsdtListaEndereco");
   }

   public SdtsdtListaEndereco( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtListaEndereco");
   }

   public SdtsdtListaEndereco( StructSdtsdtListaEndereco struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_id") )
            {
               gxTv_SdtsdtListaEndereco_End_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_tipo_logradouro") )
            {
               gxTv_SdtsdtListaEndereco_End_tipo_logradouro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_logradouro") )
            {
               gxTv_SdtsdtListaEndereco_End_logradouro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_numero") )
            {
               gxTv_SdtsdtListaEndereco_End_numero = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_bairro") )
            {
               gxTv_SdtsdtListaEndereco_End_bairro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_id") )
            {
               gxTv_SdtsdtListaEndereco_Cid_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_nome") )
            {
               gxTv_SdtsdtListaEndereco_Cid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_uf") )
            {
               gxTv_SdtsdtListaEndereco_Cid_uf = oReader.getValue() ;
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
         sName = "sdtListaEndereco" ;
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
      oWriter.writeElement("end_id", GXutil.trim( GXutil.str( gxTv_SdtsdtListaEndereco_End_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("end_tipo_logradouro", GXutil.rtrim( gxTv_SdtsdtListaEndereco_End_tipo_logradouro));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("end_logradouro", GXutil.rtrim( gxTv_SdtsdtListaEndereco_End_logradouro));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("end_numero", GXutil.trim( GXutil.str( gxTv_SdtsdtListaEndereco_End_numero, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("end_bairro", GXutil.rtrim( gxTv_SdtsdtListaEndereco_End_bairro));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("cid_id", GXutil.trim( GXutil.str( gxTv_SdtsdtListaEndereco_Cid_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("cid_nome", GXutil.rtrim( gxTv_SdtsdtListaEndereco_Cid_nome));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("cid_uf", GXutil.rtrim( gxTv_SdtsdtListaEndereco_Cid_uf));
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
      AddObjectProperty("end_id", gxTv_SdtsdtListaEndereco_End_id, false, false);
      AddObjectProperty("end_tipo_logradouro", gxTv_SdtsdtListaEndereco_End_tipo_logradouro, false, false);
      AddObjectProperty("end_logradouro", gxTv_SdtsdtListaEndereco_End_logradouro, false, false);
      AddObjectProperty("end_numero", gxTv_SdtsdtListaEndereco_End_numero, false, false);
      AddObjectProperty("end_bairro", gxTv_SdtsdtListaEndereco_End_bairro, false, false);
      AddObjectProperty("cid_id", gxTv_SdtsdtListaEndereco_Cid_id, false, false);
      AddObjectProperty("cid_nome", gxTv_SdtsdtListaEndereco_Cid_nome, false, false);
      AddObjectProperty("cid_uf", gxTv_SdtsdtListaEndereco_Cid_uf, false, false);
   }

   public short getgxTv_SdtsdtListaEndereco_End_id( )
   {
      return gxTv_SdtsdtListaEndereco_End_id ;
   }

   public void setgxTv_SdtsdtListaEndereco_End_id( short value )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(0) ;
      gxTv_SdtsdtListaEndereco_End_id = value ;
   }

   public String getgxTv_SdtsdtListaEndereco_End_tipo_logradouro( )
   {
      return gxTv_SdtsdtListaEndereco_End_tipo_logradouro ;
   }

   public void setgxTv_SdtsdtListaEndereco_End_tipo_logradouro( String value )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(0) ;
      gxTv_SdtsdtListaEndereco_End_tipo_logradouro = value ;
   }

   public String getgxTv_SdtsdtListaEndereco_End_logradouro( )
   {
      return gxTv_SdtsdtListaEndereco_End_logradouro ;
   }

   public void setgxTv_SdtsdtListaEndereco_End_logradouro( String value )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(0) ;
      gxTv_SdtsdtListaEndereco_End_logradouro = value ;
   }

   public long getgxTv_SdtsdtListaEndereco_End_numero( )
   {
      return gxTv_SdtsdtListaEndereco_End_numero ;
   }

   public void setgxTv_SdtsdtListaEndereco_End_numero( long value )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(0) ;
      gxTv_SdtsdtListaEndereco_End_numero = value ;
   }

   public String getgxTv_SdtsdtListaEndereco_End_bairro( )
   {
      return gxTv_SdtsdtListaEndereco_End_bairro ;
   }

   public void setgxTv_SdtsdtListaEndereco_End_bairro( String value )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(0) ;
      gxTv_SdtsdtListaEndereco_End_bairro = value ;
   }

   public short getgxTv_SdtsdtListaEndereco_Cid_id( )
   {
      return gxTv_SdtsdtListaEndereco_Cid_id ;
   }

   public void setgxTv_SdtsdtListaEndereco_Cid_id( short value )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(0) ;
      gxTv_SdtsdtListaEndereco_Cid_id = value ;
   }

   public String getgxTv_SdtsdtListaEndereco_Cid_nome( )
   {
      return gxTv_SdtsdtListaEndereco_Cid_nome ;
   }

   public void setgxTv_SdtsdtListaEndereco_Cid_nome( String value )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(0) ;
      gxTv_SdtsdtListaEndereco_Cid_nome = value ;
   }

   public String getgxTv_SdtsdtListaEndereco_Cid_uf( )
   {
      return gxTv_SdtsdtListaEndereco_Cid_uf ;
   }

   public void setgxTv_SdtsdtListaEndereco_Cid_uf( String value )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(0) ;
      gxTv_SdtsdtListaEndereco_Cid_uf = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtListaEndereco_N = (byte)(1) ;
      gxTv_SdtsdtListaEndereco_End_tipo_logradouro = "" ;
      gxTv_SdtsdtListaEndereco_End_logradouro = "" ;
      gxTv_SdtsdtListaEndereco_End_bairro = "" ;
      gxTv_SdtsdtListaEndereco_Cid_nome = "" ;
      gxTv_SdtsdtListaEndereco_Cid_uf = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtListaEndereco_N ;
   }

   public SdtsdtListaEndereco Clone( )
   {
      return (SdtsdtListaEndereco)(clone()) ;
   }

   public void setStruct( StructSdtsdtListaEndereco struct )
   {
      setgxTv_SdtsdtListaEndereco_End_id(struct.getEnd_id());
      setgxTv_SdtsdtListaEndereco_End_tipo_logradouro(struct.getEnd_tipo_logradouro());
      setgxTv_SdtsdtListaEndereco_End_logradouro(struct.getEnd_logradouro());
      setgxTv_SdtsdtListaEndereco_End_numero(struct.getEnd_numero());
      setgxTv_SdtsdtListaEndereco_End_bairro(struct.getEnd_bairro());
      setgxTv_SdtsdtListaEndereco_Cid_id(struct.getCid_id());
      setgxTv_SdtsdtListaEndereco_Cid_nome(struct.getCid_nome());
      setgxTv_SdtsdtListaEndereco_Cid_uf(struct.getCid_uf());
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtListaEndereco getStruct( )
   {
      StructSdtsdtListaEndereco struct = new StructSdtsdtListaEndereco ();
      struct.setEnd_id(getgxTv_SdtsdtListaEndereco_End_id());
      struct.setEnd_tipo_logradouro(getgxTv_SdtsdtListaEndereco_End_tipo_logradouro());
      struct.setEnd_logradouro(getgxTv_SdtsdtListaEndereco_End_logradouro());
      struct.setEnd_numero(getgxTv_SdtsdtListaEndereco_End_numero());
      struct.setEnd_bairro(getgxTv_SdtsdtListaEndereco_End_bairro());
      struct.setCid_id(getgxTv_SdtsdtListaEndereco_Cid_id());
      struct.setCid_nome(getgxTv_SdtsdtListaEndereco_Cid_nome());
      struct.setCid_uf(getgxTv_SdtsdtListaEndereco_Cid_uf());
      return struct ;
   }

   protected byte gxTv_SdtsdtListaEndereco_N ;
   protected short gxTv_SdtsdtListaEndereco_End_id ;
   protected short gxTv_SdtsdtListaEndereco_Cid_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtsdtListaEndereco_End_numero ;
   protected String gxTv_SdtsdtListaEndereco_Cid_uf ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtListaEndereco_End_tipo_logradouro ;
   protected String gxTv_SdtsdtListaEndereco_End_logradouro ;
   protected String gxTv_SdtsdtListaEndereco_End_bairro ;
   protected String gxTv_SdtsdtListaEndereco_Cid_nome ;
}

