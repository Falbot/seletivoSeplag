import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem( )
   {
      this(  new ModelContext(SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem.class));
   }

   public SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem( ModelContext context )
   {
      super( context, "SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem");
   }

   public SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem( int remoteHandle ,
                                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem");
   }

   public SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem( StructSdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_tipo_logradouro") )
            {
               gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_tipo_logradouro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_logradouro") )
            {
               gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_logradouro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_numero") )
            {
               gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_numero = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_bairro") )
            {
               gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_bairro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_nome") )
            {
               gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_uf") )
            {
               gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_uf = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_nome") )
            {
               gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Pes_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome") )
            {
               gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla") )
            {
               gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_sigla = oReader.getValue() ;
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
         sName = "sdtEnderecoLotacaoEfetivo.sdtEnderecoLotacaoEfetivoItem" ;
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
      oWriter.writeElement("end_tipo_logradouro", GXutil.rtrim( gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_tipo_logradouro));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("end_logradouro", GXutil.rtrim( gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_logradouro));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("end_numero", GXutil.trim( GXutil.str( gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_numero, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("end_bairro", GXutil.rtrim( gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_bairro));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("cid_nome", GXutil.rtrim( gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_nome));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("cid_uf", GXutil.rtrim( gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_uf));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_nome", GXutil.rtrim( gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Pes_nome));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_nome", GXutil.rtrim( gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_nome));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_sigla", GXutil.rtrim( gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_sigla));
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
      AddObjectProperty("end_tipo_logradouro", gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_tipo_logradouro, false, false);
      AddObjectProperty("end_logradouro", gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_logradouro, false, false);
      AddObjectProperty("end_numero", gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_numero, false, false);
      AddObjectProperty("end_bairro", gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_bairro, false, false);
      AddObjectProperty("cid_nome", gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_nome, false, false);
      AddObjectProperty("cid_uf", gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_uf, false, false);
      AddObjectProperty("pes_nome", gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Pes_nome, false, false);
      AddObjectProperty("unid_nome", gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_nome, false, false);
      AddObjectProperty("unid_sigla", gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_sigla, false, false);
   }

   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_tipo_logradouro( )
   {
      return gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_tipo_logradouro ;
   }

   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_tipo_logradouro( String value )
   {
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_N = (byte)(0) ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_tipo_logradouro = value ;
   }

   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_logradouro( )
   {
      return gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_logradouro ;
   }

   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_logradouro( String value )
   {
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_N = (byte)(0) ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_logradouro = value ;
   }

   public long getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_numero( )
   {
      return gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_numero ;
   }

   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_numero( long value )
   {
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_N = (byte)(0) ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_numero = value ;
   }

   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_bairro( )
   {
      return gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_bairro ;
   }

   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_bairro( String value )
   {
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_N = (byte)(0) ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_bairro = value ;
   }

   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_nome( )
   {
      return gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_nome ;
   }

   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_nome( String value )
   {
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_N = (byte)(0) ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_nome = value ;
   }

   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_uf( )
   {
      return gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_uf ;
   }

   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_uf( String value )
   {
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_N = (byte)(0) ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_uf = value ;
   }

   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Pes_nome( )
   {
      return gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Pes_nome ;
   }

   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Pes_nome( String value )
   {
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_N = (byte)(0) ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Pes_nome = value ;
   }

   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_nome( )
   {
      return gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_nome ;
   }

   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_nome( String value )
   {
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_N = (byte)(0) ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_nome = value ;
   }

   public String getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_sigla( )
   {
      return gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_sigla ;
   }

   public void setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_sigla( String value )
   {
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_N = (byte)(0) ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_sigla = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_tipo_logradouro = "" ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_N = (byte)(1) ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_logradouro = "" ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_bairro = "" ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_nome = "" ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_uf = "" ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Pes_nome = "" ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_nome = "" ;
      gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_sigla = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_N ;
   }

   public SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem Clone( )
   {
      return (SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)(clone()) ;
   }

   public void setStruct( StructSdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem struct )
   {
      setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_tipo_logradouro(struct.getEnd_tipo_logradouro());
      setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_logradouro(struct.getEnd_logradouro());
      setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_numero(struct.getEnd_numero());
      setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_bairro(struct.getEnd_bairro());
      setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_nome(struct.getCid_nome());
      setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_uf(struct.getCid_uf());
      setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Pes_nome(struct.getPes_nome());
      setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_nome(struct.getUnid_nome());
      setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_sigla(struct.getUnid_sigla());
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem getStruct( )
   {
      StructSdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem struct = new StructSdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem ();
      struct.setEnd_tipo_logradouro(getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_tipo_logradouro());
      struct.setEnd_logradouro(getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_logradouro());
      struct.setEnd_numero(getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_numero());
      struct.setEnd_bairro(getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_bairro());
      struct.setCid_nome(getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_nome());
      struct.setCid_uf(getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_uf());
      struct.setPes_nome(getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Pes_nome());
      struct.setUnid_nome(getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_nome());
      struct.setUnid_sigla(getgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_sigla());
      return struct ;
   }

   protected byte gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_numero ;
   protected String gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_uf ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_tipo_logradouro ;
   protected String gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_logradouro ;
   protected String gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_bairro ;
   protected String gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_nome ;
   protected String gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Pes_nome ;
   protected String gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_nome ;
   protected String gxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_sigla ;
}

