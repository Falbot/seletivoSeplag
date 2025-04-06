import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtPessoaEndereco extends GxUserType
{
   public SdtsdtPessoaEndereco( )
   {
      this(  new ModelContext(SdtsdtPessoaEndereco.class));
   }

   public SdtsdtPessoaEndereco( ModelContext context )
   {
      super( context, "SdtsdtPessoaEndereco");
   }

   public SdtsdtPessoaEndereco( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtPessoaEndereco");
   }

   public SdtsdtPessoaEndereco( StructSdtsdtPessoaEndereco struct )
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
               gxTv_SdtsdtPessoaEndereco_Pes_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_id") )
            {
               gxTv_SdtsdtPessoaEndereco_End_id = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "sdtPessoaEndereco" ;
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
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_SdtsdtPessoaEndereco_Pes_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("end_id", GXutil.trim( GXutil.str( gxTv_SdtsdtPessoaEndereco_End_id, 4, 0)));
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
      AddObjectProperty("pes_id", gxTv_SdtsdtPessoaEndereco_Pes_id, false, false);
      AddObjectProperty("end_id", gxTv_SdtsdtPessoaEndereco_End_id, false, false);
   }

   public short getgxTv_SdtsdtPessoaEndereco_Pes_id( )
   {
      return gxTv_SdtsdtPessoaEndereco_Pes_id ;
   }

   public void setgxTv_SdtsdtPessoaEndereco_Pes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtPessoaEndereco_Pes_id = value ;
   }

   public short getgxTv_SdtsdtPessoaEndereco_End_id( )
   {
      return gxTv_SdtsdtPessoaEndereco_End_id ;
   }

   public void setgxTv_SdtsdtPessoaEndereco_End_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtPessoaEndereco_End_id = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public SdtsdtPessoaEndereco Clone( )
   {
      return (SdtsdtPessoaEndereco)(clone()) ;
   }

   public void setStruct( StructSdtsdtPessoaEndereco struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtsdtPessoaEndereco_Pes_id(struct.getPes_id());
         setgxTv_SdtsdtPessoaEndereco_End_id(struct.getEnd_id());
      }
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtPessoaEndereco getStruct( )
   {
      StructSdtsdtPessoaEndereco struct = new StructSdtsdtPessoaEndereco ();
      struct.setPes_id(getgxTv_SdtsdtPessoaEndereco_Pes_id());
      struct.setEnd_id(getgxTv_SdtsdtPessoaEndereco_End_id());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected short gxTv_SdtsdtPessoaEndereco_Pes_id ;
   protected short gxTv_SdtsdtPessoaEndereco_End_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

