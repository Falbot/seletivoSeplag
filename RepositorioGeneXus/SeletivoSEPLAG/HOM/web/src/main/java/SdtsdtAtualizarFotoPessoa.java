import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtAtualizarFotoPessoa extends GxUserType
{
   public SdtsdtAtualizarFotoPessoa( )
   {
      this(  new ModelContext(SdtsdtAtualizarFotoPessoa.class));
   }

   public SdtsdtAtualizarFotoPessoa( ModelContext context )
   {
      super( context, "SdtsdtAtualizarFotoPessoa");
   }

   public SdtsdtAtualizarFotoPessoa( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtAtualizarFotoPessoa");
   }

   public SdtsdtAtualizarFotoPessoa( StructSdtsdtAtualizarFotoPessoa struct )
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
               gxTv_SdtsdtAtualizarFotoPessoa_Pes_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "foto") )
            {
               if ( gxTv_SdtsdtAtualizarFotoPessoa_Foto == null )
               {
                  gxTv_SdtsdtAtualizarFotoPessoa_Foto = new GXBaseCollection<SdtsdtAtualizarFotoPessoa_Item>(SdtsdtAtualizarFotoPessoa_Item.class, "sdtAtualizarFotoPessoa.Item", "SeletivoSEPLAG", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtsdtAtualizarFotoPessoa_Foto.readxmlcollection(oReader, "foto", "Item") ;
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
         sName = "sdtAtualizarFotoPessoa" ;
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
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_SdtsdtAtualizarFotoPessoa_Pes_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( gxTv_SdtsdtAtualizarFotoPessoa_Foto != null )
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
         gxTv_SdtsdtAtualizarFotoPessoa_Foto.writexmlcollection(oWriter, "foto", sNameSpace1, "Item", sNameSpace1);
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
      AddObjectProperty("pes_id", gxTv_SdtsdtAtualizarFotoPessoa_Pes_id, false, false);
      if ( gxTv_SdtsdtAtualizarFotoPessoa_Foto != null )
      {
         AddObjectProperty("foto", gxTv_SdtsdtAtualizarFotoPessoa_Foto, false, false);
      }
   }

   public short getgxTv_SdtsdtAtualizarFotoPessoa_Pes_id( )
   {
      return gxTv_SdtsdtAtualizarFotoPessoa_Pes_id ;
   }

   public void setgxTv_SdtsdtAtualizarFotoPessoa_Pes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtAtualizarFotoPessoa_Pes_id = value ;
   }

   public GXBaseCollection<SdtsdtAtualizarFotoPessoa_Item> getgxTv_SdtsdtAtualizarFotoPessoa_Foto( )
   {
      if ( gxTv_SdtsdtAtualizarFotoPessoa_Foto == null )
      {
         gxTv_SdtsdtAtualizarFotoPessoa_Foto = new GXBaseCollection<SdtsdtAtualizarFotoPessoa_Item>(SdtsdtAtualizarFotoPessoa_Item.class, "sdtAtualizarFotoPessoa.Item", "SeletivoSEPLAG", remoteHandle);
      }
      gxTv_SdtsdtAtualizarFotoPessoa_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtsdtAtualizarFotoPessoa_Foto ;
   }

   public void setgxTv_SdtsdtAtualizarFotoPessoa_Foto( GXBaseCollection<SdtsdtAtualizarFotoPessoa_Item> value )
   {
      gxTv_SdtsdtAtualizarFotoPessoa_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtAtualizarFotoPessoa_Foto = value ;
   }

   public void setgxTv_SdtsdtAtualizarFotoPessoa_Foto_SetNull( )
   {
      gxTv_SdtsdtAtualizarFotoPessoa_Foto_N = (byte)(1) ;
      gxTv_SdtsdtAtualizarFotoPessoa_Foto = null ;
   }

   public boolean getgxTv_SdtsdtAtualizarFotoPessoa_Foto_IsNull( )
   {
      if ( gxTv_SdtsdtAtualizarFotoPessoa_Foto == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtsdtAtualizarFotoPessoa_Foto_N( )
   {
      return gxTv_SdtsdtAtualizarFotoPessoa_Foto_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtsdtAtualizarFotoPessoa_Foto_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public SdtsdtAtualizarFotoPessoa Clone( )
   {
      return (SdtsdtAtualizarFotoPessoa)(clone()) ;
   }

   public void setStruct( StructSdtsdtAtualizarFotoPessoa struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtsdtAtualizarFotoPessoa_Pes_id(struct.getPes_id());
         GXBaseCollection<SdtsdtAtualizarFotoPessoa_Item> gxTv_SdtsdtAtualizarFotoPessoa_Foto_aux = new GXBaseCollection<SdtsdtAtualizarFotoPessoa_Item>(SdtsdtAtualizarFotoPessoa_Item.class, "sdtAtualizarFotoPessoa.Item", "SeletivoSEPLAG", remoteHandle);
         Vector<StructSdtsdtAtualizarFotoPessoa_Item> gxTv_SdtsdtAtualizarFotoPessoa_Foto_aux1 = struct.getFoto();
         if (gxTv_SdtsdtAtualizarFotoPessoa_Foto_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtsdtAtualizarFotoPessoa_Foto_aux1.size(); i++)
            {
               gxTv_SdtsdtAtualizarFotoPessoa_Foto_aux.add(new SdtsdtAtualizarFotoPessoa_Item(gxTv_SdtsdtAtualizarFotoPessoa_Foto_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtsdtAtualizarFotoPessoa_Foto(gxTv_SdtsdtAtualizarFotoPessoa_Foto_aux);
      }
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtAtualizarFotoPessoa getStruct( )
   {
      StructSdtsdtAtualizarFotoPessoa struct = new StructSdtsdtAtualizarFotoPessoa ();
      struct.setPes_id(getgxTv_SdtsdtAtualizarFotoPessoa_Pes_id());
      struct.setFoto(getgxTv_SdtsdtAtualizarFotoPessoa_Foto().getStruct());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected byte gxTv_SdtsdtAtualizarFotoPessoa_Foto_N ;
   protected short gxTv_SdtsdtAtualizarFotoPessoa_Pes_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<SdtsdtAtualizarFotoPessoa_Item> gxTv_SdtsdtAtualizarFotoPessoa_Foto_aux ;
   protected GXBaseCollection<SdtsdtAtualizarFotoPessoa_Item> gxTv_SdtsdtAtualizarFotoPessoa_Foto=null ;
}

