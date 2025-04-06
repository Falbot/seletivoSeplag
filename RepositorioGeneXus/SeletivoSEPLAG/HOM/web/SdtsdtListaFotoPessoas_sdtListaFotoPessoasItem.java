import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem( )
   {
      this(  new ModelContext(SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem.class));
   }

   public SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem( ModelContext context )
   {
      super( context, "SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem");
   }

   public SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem");
   }

   public SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem( StructSdtsdtListaFotoPessoas_sdtListaFotoPessoasItem struct )
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
               gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_nome") )
            {
               gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Foto") )
            {
               if ( gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto == null )
               {
                  gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto.readxmlcollection(oReader, "Foto", "Item") ;
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
         sName = "sdtListaFotoPessoas.sdtListaFotoPessoasItem" ;
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
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_nome", GXutil.rtrim( gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto != null )
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
         gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto.writexmlcollection(oWriter, "Foto", sNameSpace1, "Item", sNameSpace1);
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
      AddObjectProperty("pes_id", gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id, false, false);
      AddObjectProperty("pes_nome", gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome, false, false);
      if ( gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto != null )
      {
         AddObjectProperty("Foto", gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto, false, false);
      }
   }

   public short getgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id( )
   {
      return gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id ;
   }

   public void setgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id( short value )
   {
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_N = (byte)(0) ;
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id = value ;
   }

   public String getgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome( )
   {
      return gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome ;
   }

   public void setgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome( String value )
   {
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_N = (byte)(0) ;
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome = value ;
   }

   public GXBaseCollection<SdtsdtURLFoto> getgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto( )
   {
      if ( gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto == null )
      {
         gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
      }
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_N = (byte)(0) ;
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_N = (byte)(0) ;
      return gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto ;
   }

   public void setgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto( GXBaseCollection<SdtsdtURLFoto> value )
   {
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_N = (byte)(0) ;
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_N = (byte)(0) ;
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto = value ;
   }

   public void setgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_SetNull( )
   {
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_N = (byte)(1) ;
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto = null ;
   }

   public boolean getgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_IsNull( )
   {
      if ( gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_N( )
   {
      return gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_N = (byte)(1) ;
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome = "" ;
      gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_N ;
   }

   public SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem Clone( )
   {
      return (SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem)(clone()) ;
   }

   public void setStruct( StructSdtsdtListaFotoPessoas_sdtListaFotoPessoasItem struct )
   {
      setgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id(struct.getPes_id());
      setgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome(struct.getPes_nome());
      GXBaseCollection<SdtsdtURLFoto> gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_aux = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
      Vector<StructSdtsdtURLFoto> gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_aux1 = struct.getFoto();
      if (gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_aux1.size(); i++)
         {
            gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_aux.add(new SdtsdtURLFoto(gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto(gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_aux);
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtListaFotoPessoas_sdtListaFotoPessoasItem getStruct( )
   {
      StructSdtsdtListaFotoPessoas_sdtListaFotoPessoasItem struct = new StructSdtsdtListaFotoPessoas_sdtListaFotoPessoasItem ();
      struct.setPes_id(getgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id());
      struct.setPes_nome(getgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome());
      struct.setFoto(getgxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_N ;
   protected byte gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_N ;
   protected short gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Pes_nome ;
   protected GXBaseCollection<SdtsdtURLFoto> gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto_aux ;
   protected GXBaseCollection<SdtsdtURLFoto> gxTv_SdtsdtListaFotoPessoas_sdtListaFotoPessoasItem_Foto=null ;
}

