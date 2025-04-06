import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtServidor extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtsdtServidor( )
   {
      this(  new ModelContext(SdtsdtServidor.class));
   }

   public SdtsdtServidor( ModelContext context )
   {
      super( context, "SdtsdtServidor");
   }

   public SdtsdtServidor( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtServidor");
   }

   public SdtsdtServidor( StructSdtsdtServidor struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id") )
            {
               gxTv_SdtsdtServidor_Unid_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DadosPessoa") )
            {
               if ( gxTv_SdtsdtServidor_Dadospessoa == null )
               {
                  gxTv_SdtsdtServidor_Dadospessoa = new SdtsdtPessoa(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtsdtServidor_Dadospessoa.readxml(oReader, "DadosPessoa") ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DadosEndereco") )
            {
               if ( gxTv_SdtsdtServidor_Dadosendereco == null )
               {
                  gxTv_SdtsdtServidor_Dadosendereco = new SdtsdtEndereco(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtsdtServidor_Dadosendereco.readxml(oReader, "DadosEndereco") ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DadosLotacao") )
            {
               if ( gxTv_SdtsdtServidor_Dadoslotacao == null )
               {
                  gxTv_SdtsdtServidor_Dadoslotacao = new SdtsdtLotacao(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtsdtServidor_Dadoslotacao.readxml(oReader, "DadosLotacao") ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "foto") )
            {
               if ( gxTv_SdtsdtServidor_Foto == null )
               {
                  gxTv_SdtsdtServidor_Foto = new GXBaseCollection<SdtsdtFoto>(SdtsdtFoto.class, "sdtFoto", "SeletivoSEPLAG", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtsdtServidor_Foto.readxmlcollection(oReader, "foto", "Item") ;
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
         sName = "sdtServidor" ;
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
      oWriter.writeElement("unid_id", GXutil.trim( GXutil.str( gxTv_SdtsdtServidor_Unid_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( gxTv_SdtsdtServidor_Dadospessoa != null )
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
         gxTv_SdtsdtServidor_Dadospessoa.writexml(oWriter, "DadosPessoa", sNameSpace1);
      }
      if ( gxTv_SdtsdtServidor_Dadosendereco != null )
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
         gxTv_SdtsdtServidor_Dadosendereco.writexml(oWriter, "DadosEndereco", sNameSpace1);
      }
      if ( gxTv_SdtsdtServidor_Dadoslotacao != null )
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
         gxTv_SdtsdtServidor_Dadoslotacao.writexml(oWriter, "DadosLotacao", sNameSpace1);
      }
      if ( gxTv_SdtsdtServidor_Foto != null )
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
         gxTv_SdtsdtServidor_Foto.writexmlcollection(oWriter, "foto", sNameSpace1, "Item", sNameSpace1);
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
      AddObjectProperty("unid_id", gxTv_SdtsdtServidor_Unid_id, false, false);
      if ( gxTv_SdtsdtServidor_Dadospessoa != null )
      {
         AddObjectProperty("DadosPessoa", gxTv_SdtsdtServidor_Dadospessoa, false, false);
      }
      if ( gxTv_SdtsdtServidor_Dadosendereco != null )
      {
         AddObjectProperty("DadosEndereco", gxTv_SdtsdtServidor_Dadosendereco, false, false);
      }
      if ( gxTv_SdtsdtServidor_Dadoslotacao != null )
      {
         AddObjectProperty("DadosLotacao", gxTv_SdtsdtServidor_Dadoslotacao, false, false);
      }
      if ( gxTv_SdtsdtServidor_Foto != null )
      {
         AddObjectProperty("foto", gxTv_SdtsdtServidor_Foto, false, false);
      }
   }

   public short getgxTv_SdtsdtServidor_Unid_id( )
   {
      return gxTv_SdtsdtServidor_Unid_id ;
   }

   public void setgxTv_SdtsdtServidor_Unid_id( short value )
   {
      gxTv_SdtsdtServidor_N = (byte)(0) ;
      gxTv_SdtsdtServidor_Unid_id = value ;
   }

   public SdtsdtPessoa getgxTv_SdtsdtServidor_Dadospessoa( )
   {
      if ( gxTv_SdtsdtServidor_Dadospessoa == null )
      {
         gxTv_SdtsdtServidor_Dadospessoa = new SdtsdtPessoa(remoteHandle, context);
      }
      gxTv_SdtsdtServidor_Dadospessoa_N = (byte)(0) ;
      gxTv_SdtsdtServidor_N = (byte)(0) ;
      return gxTv_SdtsdtServidor_Dadospessoa ;
   }

   public void setgxTv_SdtsdtServidor_Dadospessoa( SdtsdtPessoa value )
   {
      gxTv_SdtsdtServidor_Dadospessoa_N = (byte)(0) ;
      gxTv_SdtsdtServidor_N = (byte)(0) ;
      gxTv_SdtsdtServidor_Dadospessoa = value;
   }

   public void setgxTv_SdtsdtServidor_Dadospessoa_SetNull( )
   {
      gxTv_SdtsdtServidor_Dadospessoa_N = (byte)(1) ;
      gxTv_SdtsdtServidor_Dadospessoa = (SdtsdtPessoa)null;
   }

   public boolean getgxTv_SdtsdtServidor_Dadospessoa_IsNull( )
   {
      if ( gxTv_SdtsdtServidor_Dadospessoa == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtsdtServidor_Dadospessoa_N( )
   {
      return gxTv_SdtsdtServidor_Dadospessoa_N ;
   }

   public SdtsdtEndereco getgxTv_SdtsdtServidor_Dadosendereco( )
   {
      if ( gxTv_SdtsdtServidor_Dadosendereco == null )
      {
         gxTv_SdtsdtServidor_Dadosendereco = new SdtsdtEndereco(remoteHandle, context);
      }
      gxTv_SdtsdtServidor_Dadosendereco_N = (byte)(0) ;
      gxTv_SdtsdtServidor_N = (byte)(0) ;
      return gxTv_SdtsdtServidor_Dadosendereco ;
   }

   public void setgxTv_SdtsdtServidor_Dadosendereco( SdtsdtEndereco value )
   {
      gxTv_SdtsdtServidor_Dadosendereco_N = (byte)(0) ;
      gxTv_SdtsdtServidor_N = (byte)(0) ;
      gxTv_SdtsdtServidor_Dadosendereco = value;
   }

   public void setgxTv_SdtsdtServidor_Dadosendereco_SetNull( )
   {
      gxTv_SdtsdtServidor_Dadosendereco_N = (byte)(1) ;
      gxTv_SdtsdtServidor_Dadosendereco = (SdtsdtEndereco)null;
   }

   public boolean getgxTv_SdtsdtServidor_Dadosendereco_IsNull( )
   {
      if ( gxTv_SdtsdtServidor_Dadosendereco == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtsdtServidor_Dadosendereco_N( )
   {
      return gxTv_SdtsdtServidor_Dadosendereco_N ;
   }

   public SdtsdtLotacao getgxTv_SdtsdtServidor_Dadoslotacao( )
   {
      if ( gxTv_SdtsdtServidor_Dadoslotacao == null )
      {
         gxTv_SdtsdtServidor_Dadoslotacao = new SdtsdtLotacao(remoteHandle, context);
      }
      gxTv_SdtsdtServidor_Dadoslotacao_N = (byte)(0) ;
      gxTv_SdtsdtServidor_N = (byte)(0) ;
      return gxTv_SdtsdtServidor_Dadoslotacao ;
   }

   public void setgxTv_SdtsdtServidor_Dadoslotacao( SdtsdtLotacao value )
   {
      gxTv_SdtsdtServidor_Dadoslotacao_N = (byte)(0) ;
      gxTv_SdtsdtServidor_N = (byte)(0) ;
      gxTv_SdtsdtServidor_Dadoslotacao = value;
   }

   public void setgxTv_SdtsdtServidor_Dadoslotacao_SetNull( )
   {
      gxTv_SdtsdtServidor_Dadoslotacao_N = (byte)(1) ;
      gxTv_SdtsdtServidor_Dadoslotacao = (SdtsdtLotacao)null;
   }

   public boolean getgxTv_SdtsdtServidor_Dadoslotacao_IsNull( )
   {
      if ( gxTv_SdtsdtServidor_Dadoslotacao == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtsdtServidor_Dadoslotacao_N( )
   {
      return gxTv_SdtsdtServidor_Dadoslotacao_N ;
   }

   public GXBaseCollection<SdtsdtFoto> getgxTv_SdtsdtServidor_Foto( )
   {
      if ( gxTv_SdtsdtServidor_Foto == null )
      {
         gxTv_SdtsdtServidor_Foto = new GXBaseCollection<SdtsdtFoto>(SdtsdtFoto.class, "sdtFoto", "SeletivoSEPLAG", remoteHandle);
      }
      gxTv_SdtsdtServidor_Foto_N = (byte)(0) ;
      gxTv_SdtsdtServidor_N = (byte)(0) ;
      return gxTv_SdtsdtServidor_Foto ;
   }

   public void setgxTv_SdtsdtServidor_Foto( GXBaseCollection<SdtsdtFoto> value )
   {
      gxTv_SdtsdtServidor_Foto_N = (byte)(0) ;
      gxTv_SdtsdtServidor_N = (byte)(0) ;
      gxTv_SdtsdtServidor_Foto = value ;
   }

   public void setgxTv_SdtsdtServidor_Foto_SetNull( )
   {
      gxTv_SdtsdtServidor_Foto_N = (byte)(1) ;
      gxTv_SdtsdtServidor_Foto = null ;
   }

   public boolean getgxTv_SdtsdtServidor_Foto_IsNull( )
   {
      if ( gxTv_SdtsdtServidor_Foto == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtsdtServidor_Foto_N( )
   {
      return gxTv_SdtsdtServidor_Foto_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtServidor_N = (byte)(1) ;
      gxTv_SdtsdtServidor_Dadospessoa_N = (byte)(1) ;
      gxTv_SdtsdtServidor_Dadosendereco_N = (byte)(1) ;
      gxTv_SdtsdtServidor_Dadoslotacao_N = (byte)(1) ;
      gxTv_SdtsdtServidor_Foto_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtServidor_N ;
   }

   public SdtsdtServidor Clone( )
   {
      return (SdtsdtServidor)(clone()) ;
   }

   public void setStruct( StructSdtsdtServidor struct )
   {
      setgxTv_SdtsdtServidor_Unid_id(struct.getUnid_id());
      setgxTv_SdtsdtServidor_Dadospessoa(new SdtsdtPessoa(struct.getDadospessoa()));
      setgxTv_SdtsdtServidor_Dadosendereco(new SdtsdtEndereco(struct.getDadosendereco()));
      setgxTv_SdtsdtServidor_Dadoslotacao(new SdtsdtLotacao(struct.getDadoslotacao()));
      GXBaseCollection<SdtsdtFoto> gxTv_SdtsdtServidor_Foto_aux = new GXBaseCollection<SdtsdtFoto>(SdtsdtFoto.class, "sdtFoto", "SeletivoSEPLAG", remoteHandle);
      Vector<StructSdtsdtFoto> gxTv_SdtsdtServidor_Foto_aux1 = struct.getFoto();
      if (gxTv_SdtsdtServidor_Foto_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtsdtServidor_Foto_aux1.size(); i++)
         {
            gxTv_SdtsdtServidor_Foto_aux.add(new SdtsdtFoto(gxTv_SdtsdtServidor_Foto_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtsdtServidor_Foto(gxTv_SdtsdtServidor_Foto_aux);
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtServidor getStruct( )
   {
      StructSdtsdtServidor struct = new StructSdtsdtServidor ();
      struct.setUnid_id(getgxTv_SdtsdtServidor_Unid_id());
      struct.setDadospessoa(getgxTv_SdtsdtServidor_Dadospessoa().getStruct());
      struct.setDadosendereco(getgxTv_SdtsdtServidor_Dadosendereco().getStruct());
      struct.setDadoslotacao(getgxTv_SdtsdtServidor_Dadoslotacao().getStruct());
      struct.setFoto(getgxTv_SdtsdtServidor_Foto().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtsdtServidor_N ;
   protected byte gxTv_SdtsdtServidor_Dadospessoa_N ;
   protected byte gxTv_SdtsdtServidor_Dadosendereco_N ;
   protected byte gxTv_SdtsdtServidor_Dadoslotacao_N ;
   protected byte gxTv_SdtsdtServidor_Foto_N ;
   protected short gxTv_SdtsdtServidor_Unid_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<SdtsdtFoto> gxTv_SdtsdtServidor_Foto_aux ;
   protected GXBaseCollection<SdtsdtFoto> gxTv_SdtsdtServidor_Foto=null ;
   protected SdtsdtPessoa gxTv_SdtsdtServidor_Dadospessoa=null ;
   protected SdtsdtEndereco gxTv_SdtsdtServidor_Dadosendereco=null ;
   protected SdtsdtLotacao gxTv_SdtsdtServidor_Dadoslotacao=null ;
}

