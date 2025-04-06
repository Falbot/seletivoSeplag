import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtListaFotoPessoa extends GxUserType
{
   public SdtsdtListaFotoPessoa( )
   {
      this(  new ModelContext(SdtsdtListaFotoPessoa.class));
   }

   public SdtsdtListaFotoPessoa( ModelContext context )
   {
      super( context, "SdtsdtListaFotoPessoa");
   }

   public SdtsdtListaFotoPessoa( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtListaFotoPessoa");
   }

   public SdtsdtListaFotoPessoa( StructSdtsdtListaFotoPessoa struct )
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
               gxTv_SdtsdtListaFotoPessoa_Pes_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_nome") )
            {
               gxTv_SdtsdtListaFotoPessoa_Pes_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Foto") )
            {
               if ( gxTv_SdtsdtListaFotoPessoa_Foto == null )
               {
                  gxTv_SdtsdtListaFotoPessoa_Foto = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtsdtListaFotoPessoa_Foto.readxmlcollection(oReader, "Foto", "Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Foto") )
               {
                  GXSoapError = oReader.read() ;
               }
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
         sName = "sdtListaFotoPessoa" ;
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
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_SdtsdtListaFotoPessoa_Pes_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_nome", gxTv_SdtsdtListaFotoPessoa_Pes_nome);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( gxTv_SdtsdtListaFotoPessoa_Foto != null )
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
         gxTv_SdtsdtListaFotoPessoa_Foto.writexmlcollection(oWriter, "Foto", sNameSpace1, "Item", sNameSpace1);
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
      AddObjectProperty("pes_id", gxTv_SdtsdtListaFotoPessoa_Pes_id, false, false);
      AddObjectProperty("pes_nome", gxTv_SdtsdtListaFotoPessoa_Pes_nome, false, false);
      if ( gxTv_SdtsdtListaFotoPessoa_Foto != null )
      {
         AddObjectProperty("Foto", gxTv_SdtsdtListaFotoPessoa_Foto, false, false);
      }
   }

   public short getgxTv_SdtsdtListaFotoPessoa_Pes_id( )
   {
      return gxTv_SdtsdtListaFotoPessoa_Pes_id ;
   }

   public void setgxTv_SdtsdtListaFotoPessoa_Pes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaFotoPessoa_Pes_id = value ;
   }

   public String getgxTv_SdtsdtListaFotoPessoa_Pes_nome( )
   {
      return gxTv_SdtsdtListaFotoPessoa_Pes_nome ;
   }

   public void setgxTv_SdtsdtListaFotoPessoa_Pes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaFotoPessoa_Pes_nome = value ;
   }

   public GXBaseCollection<SdtsdtURLFoto> getgxTv_SdtsdtListaFotoPessoa_Foto( )
   {
      if ( gxTv_SdtsdtListaFotoPessoa_Foto == null )
      {
         gxTv_SdtsdtListaFotoPessoa_Foto = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
      }
      gxTv_SdtsdtListaFotoPessoa_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtsdtListaFotoPessoa_Foto ;
   }

   public void setgxTv_SdtsdtListaFotoPessoa_Foto( GXBaseCollection<SdtsdtURLFoto> value )
   {
      gxTv_SdtsdtListaFotoPessoa_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaFotoPessoa_Foto = value ;
   }

   public void setgxTv_SdtsdtListaFotoPessoa_Foto_SetNull( )
   {
      gxTv_SdtsdtListaFotoPessoa_Foto_N = (byte)(1) ;
      gxTv_SdtsdtListaFotoPessoa_Foto = null ;
   }

   public boolean getgxTv_SdtsdtListaFotoPessoa_Foto_IsNull( )
   {
      if ( gxTv_SdtsdtListaFotoPessoa_Foto == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtsdtListaFotoPessoa_Foto_N( )
   {
      return gxTv_SdtsdtListaFotoPessoa_Foto_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtsdtListaFotoPessoa_Pes_nome = "" ;
      gxTv_SdtsdtListaFotoPessoa_Foto_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public SdtsdtListaFotoPessoa Clone( )
   {
      return (SdtsdtListaFotoPessoa)(clone()) ;
   }

   public void setStruct( StructSdtsdtListaFotoPessoa struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtsdtListaFotoPessoa_Pes_id(struct.getPes_id());
         setgxTv_SdtsdtListaFotoPessoa_Pes_nome(struct.getPes_nome());
         GXBaseCollection<SdtsdtURLFoto> gxTv_SdtsdtListaFotoPessoa_Foto_aux = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
         Vector<StructSdtsdtURLFoto> gxTv_SdtsdtListaFotoPessoa_Foto_aux1 = struct.getFoto();
         if (gxTv_SdtsdtListaFotoPessoa_Foto_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtsdtListaFotoPessoa_Foto_aux1.size(); i++)
            {
               gxTv_SdtsdtListaFotoPessoa_Foto_aux.add(new SdtsdtURLFoto(gxTv_SdtsdtListaFotoPessoa_Foto_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtsdtListaFotoPessoa_Foto(gxTv_SdtsdtListaFotoPessoa_Foto_aux);
      }
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtListaFotoPessoa getStruct( )
   {
      StructSdtsdtListaFotoPessoa struct = new StructSdtsdtListaFotoPessoa ();
      struct.setPes_id(getgxTv_SdtsdtListaFotoPessoa_Pes_id());
      struct.setPes_nome(getgxTv_SdtsdtListaFotoPessoa_Pes_nome());
      struct.setFoto(getgxTv_SdtsdtListaFotoPessoa_Foto().getStruct());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected byte gxTv_SdtsdtListaFotoPessoa_Foto_N ;
   protected short gxTv_SdtsdtListaFotoPessoa_Pes_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtListaFotoPessoa_Pes_nome ;
   protected GXBaseCollection<SdtsdtURLFoto> gxTv_SdtsdtListaFotoPessoa_Foto_aux ;
   protected GXBaseCollection<SdtsdtURLFoto> gxTv_SdtsdtListaFotoPessoa_Foto=null ;
}

