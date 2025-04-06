import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtListaPessoas_sdtListaPessoasItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtsdtListaPessoas_sdtListaPessoasItem( )
   {
      this(  new ModelContext(SdtsdtListaPessoas_sdtListaPessoasItem.class));
   }

   public SdtsdtListaPessoas_sdtListaPessoasItem( ModelContext context )
   {
      super( context, "SdtsdtListaPessoas_sdtListaPessoasItem");
   }

   public SdtsdtListaPessoas_sdtListaPessoasItem( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtListaPessoas_sdtListaPessoasItem");
   }

   public SdtsdtListaPessoas_sdtListaPessoasItem( StructSdtsdtListaPessoas_sdtListaPessoasItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id") )
            {
               gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_nome") )
            {
               gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_data_nascimento") )
            {
               gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_sexo") )
            {
               gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_mae") )
            {
               gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_pai") )
            {
               gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai = oReader.getValue() ;
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
         sName = "sdtListaPessoas.sdtListaPessoasItem" ;
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
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_nome", GXutil.rtrim( gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_data_nascimento", GXutil.rtrim( gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_sexo", GXutil.rtrim( gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_mae", GXutil.rtrim( gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_pai", GXutil.rtrim( gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai));
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
      AddObjectProperty("pes_id", gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id, false, false);
      AddObjectProperty("pes_nome", gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome, false, false);
      AddObjectProperty("pes_data_nascimento", gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento, false, false);
      AddObjectProperty("pes_sexo", gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo, false, false);
      AddObjectProperty("pes_mae", gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae, false, false);
      AddObjectProperty("pes_pai", gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai, false, false);
   }

   public short getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id( )
   {
      return gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id ;
   }

   public void setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id( short value )
   {
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_N = (byte)(0) ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id = value ;
   }

   public String getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome( )
   {
      return gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome ;
   }

   public void setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome( String value )
   {
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_N = (byte)(0) ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome = value ;
   }

   public String getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento( )
   {
      return gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento ;
   }

   public void setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento( String value )
   {
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_N = (byte)(0) ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento = value ;
   }

   public String getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo( )
   {
      return gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo ;
   }

   public void setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo( String value )
   {
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_N = (byte)(0) ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo = value ;
   }

   public String getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae( )
   {
      return gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae ;
   }

   public void setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae( String value )
   {
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_N = (byte)(0) ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae = value ;
   }

   public String getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai( )
   {
      return gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai ;
   }

   public void setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai( String value )
   {
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_N = (byte)(0) ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_N = (byte)(1) ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome = "" ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento = "" ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo = "" ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae = "" ;
      gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_N ;
   }

   public SdtsdtListaPessoas_sdtListaPessoasItem Clone( )
   {
      return (SdtsdtListaPessoas_sdtListaPessoasItem)(clone()) ;
   }

   public void setStruct( StructSdtsdtListaPessoas_sdtListaPessoasItem struct )
   {
      setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id(struct.getPes_id());
      setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome(struct.getPes_nome());
      setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento(struct.getPes_data_nascimento());
      setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo(struct.getPes_sexo());
      setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae(struct.getPes_mae());
      setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai(struct.getPes_pai());
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtListaPessoas_sdtListaPessoasItem getStruct( )
   {
      StructSdtsdtListaPessoas_sdtListaPessoasItem struct = new StructSdtsdtListaPessoas_sdtListaPessoasItem ();
      struct.setPes_id(getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id());
      struct.setPes_nome(getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome());
      struct.setPes_data_nascimento(getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento());
      struct.setPes_sexo(getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo());
      struct.setPes_mae(getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae());
      struct.setPes_pai(getgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai());
      return struct ;
   }

   protected byte gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_N ;
   protected short gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome ;
   protected String gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento ;
   protected String gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo ;
   protected String gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae ;
   protected String gxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai ;
}

