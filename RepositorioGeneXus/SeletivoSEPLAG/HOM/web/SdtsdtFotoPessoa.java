import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtFotoPessoa extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtsdtFotoPessoa( )
   {
      this(  new ModelContext(SdtsdtFotoPessoa.class));
   }

   public SdtsdtFotoPessoa( ModelContext context )
   {
      super( context, "SdtsdtFotoPessoa");
   }

   public SdtsdtFotoPessoa( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtFotoPessoa");
   }

   public SdtsdtFotoPessoa( StructSdtsdtFotoPessoa struct )
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
               gxTv_SdtsdtFotoPessoa_Pes_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "foto") )
            {
               if ( gxTv_SdtsdtFotoPessoa_Foto == null )
               {
                  gxTv_SdtsdtFotoPessoa_Foto = new GXBaseCollection<SdtsdtFoto>(SdtsdtFoto.class, "sdtFoto", "SeletivoSEPLAG", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtsdtFotoPessoa_Foto.readxmlcollection(oReader, "foto", "Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "foto") )
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
         sName = "sdtFotoPessoa" ;
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
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_SdtsdtFotoPessoa_Pes_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( gxTv_SdtsdtFotoPessoa_Foto != null )
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
         gxTv_SdtsdtFotoPessoa_Foto.writexmlcollection(oWriter, "foto", sNameSpace1, "Item", sNameSpace1);
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
      AddObjectProperty("pes_id", gxTv_SdtsdtFotoPessoa_Pes_id, false, false);
      if ( gxTv_SdtsdtFotoPessoa_Foto != null )
      {
         AddObjectProperty("foto", gxTv_SdtsdtFotoPessoa_Foto, false, false);
      }
   }

   public short getgxTv_SdtsdtFotoPessoa_Pes_id( )
   {
      return gxTv_SdtsdtFotoPessoa_Pes_id ;
   }

   public void setgxTv_SdtsdtFotoPessoa_Pes_id( short value )
   {
      gxTv_SdtsdtFotoPessoa_N = (byte)(0) ;
      gxTv_SdtsdtFotoPessoa_Pes_id = value ;
   }

   public GXBaseCollection<SdtsdtFoto> getgxTv_SdtsdtFotoPessoa_Foto( )
   {
      if ( gxTv_SdtsdtFotoPessoa_Foto == null )
      {
         gxTv_SdtsdtFotoPessoa_Foto = new GXBaseCollection<SdtsdtFoto>(SdtsdtFoto.class, "sdtFoto", "SeletivoSEPLAG", remoteHandle);
      }
      gxTv_SdtsdtFotoPessoa_Foto_N = (byte)(0) ;
      gxTv_SdtsdtFotoPessoa_N = (byte)(0) ;
      return gxTv_SdtsdtFotoPessoa_Foto ;
   }

   public void setgxTv_SdtsdtFotoPessoa_Foto( GXBaseCollection<SdtsdtFoto> value )
   {
      gxTv_SdtsdtFotoPessoa_Foto_N = (byte)(0) ;
      gxTv_SdtsdtFotoPessoa_N = (byte)(0) ;
      gxTv_SdtsdtFotoPessoa_Foto = value ;
   }

   public void setgxTv_SdtsdtFotoPessoa_Foto_SetNull( )
   {
      gxTv_SdtsdtFotoPessoa_Foto_N = (byte)(1) ;
      gxTv_SdtsdtFotoPessoa_Foto = null ;
   }

   public boolean getgxTv_SdtsdtFotoPessoa_Foto_IsNull( )
   {
      if ( gxTv_SdtsdtFotoPessoa_Foto == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtsdtFotoPessoa_Foto_N( )
   {
      return gxTv_SdtsdtFotoPessoa_Foto_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtFotoPessoa_N = (byte)(1) ;
      gxTv_SdtsdtFotoPessoa_Foto_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtFotoPessoa_N ;
   }

   public SdtsdtFotoPessoa Clone( )
   {
      return (SdtsdtFotoPessoa)(clone()) ;
   }

   public void setStruct( StructSdtsdtFotoPessoa struct )
   {
      setgxTv_SdtsdtFotoPessoa_Pes_id(struct.getPes_id());
      GXBaseCollection<SdtsdtFoto> gxTv_SdtsdtFotoPessoa_Foto_aux = new GXBaseCollection<SdtsdtFoto>(SdtsdtFoto.class, "sdtFoto", "SeletivoSEPLAG", remoteHandle);
      Vector<StructSdtsdtFoto> gxTv_SdtsdtFotoPessoa_Foto_aux1 = struct.getFoto();
      if (gxTv_SdtsdtFotoPessoa_Foto_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtsdtFotoPessoa_Foto_aux1.size(); i++)
         {
            gxTv_SdtsdtFotoPessoa_Foto_aux.add(new SdtsdtFoto(gxTv_SdtsdtFotoPessoa_Foto_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtsdtFotoPessoa_Foto(gxTv_SdtsdtFotoPessoa_Foto_aux);
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtFotoPessoa getStruct( )
   {
      StructSdtsdtFotoPessoa struct = new StructSdtsdtFotoPessoa ();
      struct.setPes_id(getgxTv_SdtsdtFotoPessoa_Pes_id());
      struct.setFoto(getgxTv_SdtsdtFotoPessoa_Foto().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtsdtFotoPessoa_N ;
   protected byte gxTv_SdtsdtFotoPessoa_Foto_N ;
   protected short gxTv_SdtsdtFotoPessoa_Pes_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<SdtsdtFoto> gxTv_SdtsdtFotoPessoa_Foto_aux ;
   protected GXBaseCollection<SdtsdtFoto> gxTv_SdtsdtFotoPessoa_Foto=null ;
}

