import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem extends GxUserType
{
   public SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem( )
   {
      this(  new ModelContext(SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem.class));
   }

   public SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem( ModelContext context )
   {
      super( context, "SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem");
   }

   public SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem( int remoteHandle ,
                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem");
   }

   public SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem( StructSdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem struct )
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
               gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_idade") )
            {
               gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome") )
            {
               gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla") )
            {
               gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Foto") )
            {
               if ( gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto == null )
               {
                  gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto.readxmlcollection(oReader, "Foto", "Item") ;
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
         sName = "sdtEfetivoPorUnidade.sdtEfetivoPorUnidadeItem" ;
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
      oWriter.writeElement("pes_nome", gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_idade", GXutil.trim( GXutil.str( gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_nome", gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_sigla", gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto != null )
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
         gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto.writexmlcollection(oWriter, "Foto", sNameSpace1, "Item", sNameSpace1);
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
      AddObjectProperty("pes_nome", gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome, false, false);
      AddObjectProperty("pes_idade", gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade, false, false);
      AddObjectProperty("unid_nome", gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome, false, false);
      AddObjectProperty("unid_sigla", gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla, false, false);
      if ( gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto != null )
      {
         AddObjectProperty("Foto", gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto, false, false);
      }
   }

   public String getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome( )
   {
      return gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome ;
   }

   public void setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome = value ;
   }

   public short getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade( )
   {
      return gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade ;
   }

   public void setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade = value ;
   }

   public String getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome( )
   {
      return gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome ;
   }

   public void setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome = value ;
   }

   public String getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla( )
   {
      return gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla ;
   }

   public void setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla = value ;
   }

   public GXBaseCollection<SdtsdtURLFoto> getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto( )
   {
      if ( gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto == null )
      {
         gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
      }
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto ;
   }

   public void setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto( GXBaseCollection<SdtsdtURLFoto> value )
   {
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto = value ;
   }

   public void setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_SetNull( )
   {
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_N = (byte)(1) ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto = null ;
   }

   public boolean getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_IsNull( )
   {
      if ( gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_N( )
   {
      return gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome = "" ;
      sdtIsNull = (byte)(1) ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome = "" ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla = "" ;
      gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem Clone( )
   {
      return (SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem)(clone()) ;
   }

   public void setStruct( StructSdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome(struct.getPes_nome());
         setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade(struct.getPes_idade());
         setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome(struct.getUnid_nome());
         setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla(struct.getUnid_sigla());
         GXBaseCollection<SdtsdtURLFoto> gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_aux = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
         Vector<StructSdtsdtURLFoto> gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_aux1 = struct.getFoto();
         if (gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_aux1.size(); i++)
            {
               gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_aux.add(new SdtsdtURLFoto(gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto(gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_aux);
      }
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem getStruct( )
   {
      StructSdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem struct = new StructSdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem ();
      struct.setPes_nome(getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome());
      struct.setPes_idade(getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade());
      struct.setUnid_nome(getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome());
      struct.setUnid_sigla(getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla());
      struct.setFoto(getgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto().getStruct());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected byte gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_N ;
   protected short gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome ;
   protected String gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome ;
   protected String gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla ;
   protected GXBaseCollection<SdtsdtURLFoto> gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto_aux ;
   protected GXBaseCollection<SdtsdtURLFoto> gxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto=null ;
}

