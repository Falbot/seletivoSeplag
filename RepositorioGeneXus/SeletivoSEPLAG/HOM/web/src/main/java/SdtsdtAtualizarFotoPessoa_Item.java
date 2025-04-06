import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtAtualizarFotoPessoa_Item extends GxUserType
{
   public SdtsdtAtualizarFotoPessoa_Item( )
   {
      this(  new ModelContext(SdtsdtAtualizarFotoPessoa_Item.class));
   }

   public SdtsdtAtualizarFotoPessoa_Item( ModelContext context )
   {
      super( context, "SdtsdtAtualizarFotoPessoa_Item");
   }

   public SdtsdtAtualizarFotoPessoa_Item( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtAtualizarFotoPessoa_Item");
   }

   public SdtsdtAtualizarFotoPessoa_Item( StructSdtsdtAtualizarFotoPessoa_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "fp_id") )
            {
               gxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "arquivoBase64NovaFoto") )
            {
               gxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto = oReader.getValue() ;
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
         sName = "sdtAtualizarFotoPessoa.Item" ;
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
      oWriter.writeElement("fp_id", GXutil.trim( GXutil.str( gxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("arquivoBase64NovaFoto", gxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto);
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
      AddObjectProperty("fp_id", gxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id, false, false);
      AddObjectProperty("arquivoBase64NovaFoto", gxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto, false, false);
   }

   public short getgxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id( )
   {
      return gxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id ;
   }

   public void setgxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id = value ;
   }

   public String getgxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto( )
   {
      return gxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto ;
   }

   public void setgxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public SdtsdtAtualizarFotoPessoa_Item Clone( )
   {
      return (SdtsdtAtualizarFotoPessoa_Item)(clone()) ;
   }

   public void setStruct( StructSdtsdtAtualizarFotoPessoa_Item struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id(struct.getFp_id());
         setgxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto(struct.getArquivobase64novafoto());
      }
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtAtualizarFotoPessoa_Item getStruct( )
   {
      StructSdtsdtAtualizarFotoPessoa_Item struct = new StructSdtsdtAtualizarFotoPessoa_Item ();
      struct.setFp_id(getgxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id());
      struct.setArquivobase64novafoto(getgxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected short gxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto ;
}

