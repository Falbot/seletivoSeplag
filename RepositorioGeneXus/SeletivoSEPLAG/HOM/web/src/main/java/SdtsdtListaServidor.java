import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtListaServidor extends GxUserType
{
   public SdtsdtListaServidor( )
   {
      this(  new ModelContext(SdtsdtListaServidor.class));
   }

   public SdtsdtListaServidor( ModelContext context )
   {
      super( context, "SdtsdtListaServidor");
   }

   public SdtsdtListaServidor( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtListaServidor");
   }

   public SdtsdtListaServidor( StructSdtsdtListaServidor struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipoServidor") )
            {
               gxTv_SdtsdtListaServidor_Tiposervidor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DadosPessoa") )
            {
               if ( gxTv_SdtsdtListaServidor_Dadospessoa == null )
               {
                  gxTv_SdtsdtListaServidor_Dadospessoa = new SdtsdtPessoa(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtsdtListaServidor_Dadospessoa.readxml(oReader, "DadosPessoa") ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DadosEndereco") )
            {
               if ( gxTv_SdtsdtListaServidor_Dadosendereco == null )
               {
                  gxTv_SdtsdtListaServidor_Dadosendereco = new GXBaseCollection<SdtsdtEndereco>(SdtsdtEndereco.class, "sdtEndereco", "SeletivoSEPLAG", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtsdtListaServidor_Dadosendereco.readxmlcollection(oReader, "DadosEndereco", "Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "DadosEndereco") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DadosLotacao") )
            {
               if ( gxTv_SdtsdtListaServidor_Dadoslotacao == null )
               {
                  gxTv_SdtsdtListaServidor_Dadoslotacao = new GXBaseCollection<SdtsdtLotacaoV3>(SdtsdtLotacaoV3.class, "sdtLotacaoV3", "SeletivoSEPLAG", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtsdtListaServidor_Dadoslotacao.readxmlcollection(oReader, "DadosLotacao", "Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "DadosLotacao") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Foto") )
            {
               if ( gxTv_SdtsdtListaServidor_Foto == null )
               {
                  gxTv_SdtsdtListaServidor_Foto = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtsdtListaServidor_Foto.readxmlcollection(oReader, "Foto", "Item") ;
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
         sName = "sdtListaServidor" ;
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
      oWriter.writeElement("TipoServidor", gxTv_SdtsdtListaServidor_Tiposervidor);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( gxTv_SdtsdtListaServidor_Dadospessoa != null )
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
         gxTv_SdtsdtListaServidor_Dadospessoa.writexml(oWriter, "DadosPessoa", sNameSpace1);
      }
      if ( gxTv_SdtsdtListaServidor_Dadosendereco != null )
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
         gxTv_SdtsdtListaServidor_Dadosendereco.writexmlcollection(oWriter, "DadosEndereco", sNameSpace1, "Item", sNameSpace1);
      }
      if ( gxTv_SdtsdtListaServidor_Dadoslotacao != null )
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
         gxTv_SdtsdtListaServidor_Dadoslotacao.writexmlcollection(oWriter, "DadosLotacao", sNameSpace1, "Item", sNameSpace1);
      }
      if ( gxTv_SdtsdtListaServidor_Foto != null )
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
         gxTv_SdtsdtListaServidor_Foto.writexmlcollection(oWriter, "Foto", sNameSpace1, "Item", sNameSpace1);
      }
      oWriter.writeEndElement();
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
      AddObjectProperty("TipoServidor", gxTv_SdtsdtListaServidor_Tiposervidor, false, false);
      if ( gxTv_SdtsdtListaServidor_Dadospessoa != null )
      {
         AddObjectProperty("DadosPessoa", gxTv_SdtsdtListaServidor_Dadospessoa, false, false);
      }
      if ( gxTv_SdtsdtListaServidor_Dadosendereco != null )
      {
         AddObjectProperty("DadosEndereco", gxTv_SdtsdtListaServidor_Dadosendereco, false, false);
      }
      if ( gxTv_SdtsdtListaServidor_Dadoslotacao != null )
      {
         AddObjectProperty("DadosLotacao", gxTv_SdtsdtListaServidor_Dadoslotacao, false, false);
      }
      if ( gxTv_SdtsdtListaServidor_Foto != null )
      {
         AddObjectProperty("Foto", gxTv_SdtsdtListaServidor_Foto, false, false);
      }
   }

   public String getgxTv_SdtsdtListaServidor_Tiposervidor( )
   {
      return gxTv_SdtsdtListaServidor_Tiposervidor ;
   }

   public void setgxTv_SdtsdtListaServidor_Tiposervidor( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidor_Tiposervidor = value ;
   }

   public SdtsdtPessoa getgxTv_SdtsdtListaServidor_Dadospessoa( )
   {
      if ( gxTv_SdtsdtListaServidor_Dadospessoa == null )
      {
         gxTv_SdtsdtListaServidor_Dadospessoa = new SdtsdtPessoa(remoteHandle, context);
      }
      gxTv_SdtsdtListaServidor_Dadospessoa_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtsdtListaServidor_Dadospessoa ;
   }

   public void setgxTv_SdtsdtListaServidor_Dadospessoa( SdtsdtPessoa value )
   {
      gxTv_SdtsdtListaServidor_Dadospessoa_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidor_Dadospessoa = value;
   }

   public void setgxTv_SdtsdtListaServidor_Dadospessoa_SetNull( )
   {
      gxTv_SdtsdtListaServidor_Dadospessoa_N = (byte)(1) ;
      gxTv_SdtsdtListaServidor_Dadospessoa = (SdtsdtPessoa)null;
   }

   public boolean getgxTv_SdtsdtListaServidor_Dadospessoa_IsNull( )
   {
      if ( gxTv_SdtsdtListaServidor_Dadospessoa == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtsdtListaServidor_Dadospessoa_N( )
   {
      return gxTv_SdtsdtListaServidor_Dadospessoa_N ;
   }

   public GXBaseCollection<SdtsdtEndereco> getgxTv_SdtsdtListaServidor_Dadosendereco( )
   {
      if ( gxTv_SdtsdtListaServidor_Dadosendereco == null )
      {
         gxTv_SdtsdtListaServidor_Dadosendereco = new GXBaseCollection<SdtsdtEndereco>(SdtsdtEndereco.class, "sdtEndereco", "SeletivoSEPLAG", remoteHandle);
      }
      gxTv_SdtsdtListaServidor_Dadosendereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtsdtListaServidor_Dadosendereco ;
   }

   public void setgxTv_SdtsdtListaServidor_Dadosendereco( GXBaseCollection<SdtsdtEndereco> value )
   {
      gxTv_SdtsdtListaServidor_Dadosendereco_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidor_Dadosendereco = value ;
   }

   public void setgxTv_SdtsdtListaServidor_Dadosendereco_SetNull( )
   {
      gxTv_SdtsdtListaServidor_Dadosendereco_N = (byte)(1) ;
      gxTv_SdtsdtListaServidor_Dadosendereco = null ;
   }

   public boolean getgxTv_SdtsdtListaServidor_Dadosendereco_IsNull( )
   {
      if ( gxTv_SdtsdtListaServidor_Dadosendereco == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtsdtListaServidor_Dadosendereco_N( )
   {
      return gxTv_SdtsdtListaServidor_Dadosendereco_N ;
   }

   public GXBaseCollection<SdtsdtLotacaoV3> getgxTv_SdtsdtListaServidor_Dadoslotacao( )
   {
      if ( gxTv_SdtsdtListaServidor_Dadoslotacao == null )
      {
         gxTv_SdtsdtListaServidor_Dadoslotacao = new GXBaseCollection<SdtsdtLotacaoV3>(SdtsdtLotacaoV3.class, "sdtLotacaoV3", "SeletivoSEPLAG", remoteHandle);
      }
      gxTv_SdtsdtListaServidor_Dadoslotacao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtsdtListaServidor_Dadoslotacao ;
   }

   public void setgxTv_SdtsdtListaServidor_Dadoslotacao( GXBaseCollection<SdtsdtLotacaoV3> value )
   {
      gxTv_SdtsdtListaServidor_Dadoslotacao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidor_Dadoslotacao = value ;
   }

   public void setgxTv_SdtsdtListaServidor_Dadoslotacao_SetNull( )
   {
      gxTv_SdtsdtListaServidor_Dadoslotacao_N = (byte)(1) ;
      gxTv_SdtsdtListaServidor_Dadoslotacao = null ;
   }

   public boolean getgxTv_SdtsdtListaServidor_Dadoslotacao_IsNull( )
   {
      if ( gxTv_SdtsdtListaServidor_Dadoslotacao == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtsdtListaServidor_Dadoslotacao_N( )
   {
      return gxTv_SdtsdtListaServidor_Dadoslotacao_N ;
   }

   public GXBaseCollection<SdtsdtURLFoto> getgxTv_SdtsdtListaServidor_Foto( )
   {
      if ( gxTv_SdtsdtListaServidor_Foto == null )
      {
         gxTv_SdtsdtListaServidor_Foto = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
      }
      gxTv_SdtsdtListaServidor_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      return gxTv_SdtsdtListaServidor_Foto ;
   }

   public void setgxTv_SdtsdtListaServidor_Foto( GXBaseCollection<SdtsdtURLFoto> value )
   {
      gxTv_SdtsdtListaServidor_Foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtsdtListaServidor_Foto = value ;
   }

   public void setgxTv_SdtsdtListaServidor_Foto_SetNull( )
   {
      gxTv_SdtsdtListaServidor_Foto_N = (byte)(1) ;
      gxTv_SdtsdtListaServidor_Foto = null ;
   }

   public boolean getgxTv_SdtsdtListaServidor_Foto_IsNull( )
   {
      if ( gxTv_SdtsdtListaServidor_Foto == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtsdtListaServidor_Foto_N( )
   {
      return gxTv_SdtsdtListaServidor_Foto_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtListaServidor_Tiposervidor = "" ;
      sdtIsNull = (byte)(1) ;
      gxTv_SdtsdtListaServidor_Dadospessoa_N = (byte)(1) ;
      gxTv_SdtsdtListaServidor_Dadosendereco_N = (byte)(1) ;
      gxTv_SdtsdtListaServidor_Dadoslotacao_N = (byte)(1) ;
      gxTv_SdtsdtListaServidor_Foto_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public SdtsdtListaServidor Clone( )
   {
      return (SdtsdtListaServidor)(clone()) ;
   }

   public void setStruct( StructSdtsdtListaServidor struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtsdtListaServidor_Tiposervidor(struct.getTiposervidor());
         setgxTv_SdtsdtListaServidor_Dadospessoa(new SdtsdtPessoa(struct.getDadospessoa()));
         GXBaseCollection<SdtsdtEndereco> gxTv_SdtsdtListaServidor_Dadosendereco_aux = new GXBaseCollection<SdtsdtEndereco>(SdtsdtEndereco.class, "sdtEndereco", "SeletivoSEPLAG", remoteHandle);
         Vector<StructSdtsdtEndereco> gxTv_SdtsdtListaServidor_Dadosendereco_aux1 = struct.getDadosendereco();
         if (gxTv_SdtsdtListaServidor_Dadosendereco_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtsdtListaServidor_Dadosendereco_aux1.size(); i++)
            {
               gxTv_SdtsdtListaServidor_Dadosendereco_aux.add(new SdtsdtEndereco(gxTv_SdtsdtListaServidor_Dadosendereco_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtsdtListaServidor_Dadosendereco(gxTv_SdtsdtListaServidor_Dadosendereco_aux);
         GXBaseCollection<SdtsdtLotacaoV3> gxTv_SdtsdtListaServidor_Dadoslotacao_aux = new GXBaseCollection<SdtsdtLotacaoV3>(SdtsdtLotacaoV3.class, "sdtLotacaoV3", "SeletivoSEPLAG", remoteHandle);
         Vector<StructSdtsdtLotacaoV3> gxTv_SdtsdtListaServidor_Dadoslotacao_aux1 = struct.getDadoslotacao();
         if (gxTv_SdtsdtListaServidor_Dadoslotacao_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtsdtListaServidor_Dadoslotacao_aux1.size(); i++)
            {
               gxTv_SdtsdtListaServidor_Dadoslotacao_aux.add(new SdtsdtLotacaoV3(gxTv_SdtsdtListaServidor_Dadoslotacao_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtsdtListaServidor_Dadoslotacao(gxTv_SdtsdtListaServidor_Dadoslotacao_aux);
         GXBaseCollection<SdtsdtURLFoto> gxTv_SdtsdtListaServidor_Foto_aux = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
         Vector<StructSdtsdtURLFoto> gxTv_SdtsdtListaServidor_Foto_aux1 = struct.getFoto();
         if (gxTv_SdtsdtListaServidor_Foto_aux1 != null)
         {
            for (int i = 0; i < gxTv_SdtsdtListaServidor_Foto_aux1.size(); i++)
            {
               gxTv_SdtsdtListaServidor_Foto_aux.add(new SdtsdtURLFoto(gxTv_SdtsdtListaServidor_Foto_aux1.elementAt(i)));
            }
         }
         setgxTv_SdtsdtListaServidor_Foto(gxTv_SdtsdtListaServidor_Foto_aux);
      }
   }

   @SuppressWarnings("unchecked")
   public StructSdtsdtListaServidor getStruct( )
   {
      StructSdtsdtListaServidor struct = new StructSdtsdtListaServidor ();
      struct.setTiposervidor(getgxTv_SdtsdtListaServidor_Tiposervidor());
      struct.setDadospessoa(getgxTv_SdtsdtListaServidor_Dadospessoa().getStruct());
      struct.setDadosendereco(getgxTv_SdtsdtListaServidor_Dadosendereco().getStruct());
      struct.setDadoslotacao(getgxTv_SdtsdtListaServidor_Dadoslotacao().getStruct());
      struct.setFoto(getgxTv_SdtsdtListaServidor_Foto().getStruct());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected byte gxTv_SdtsdtListaServidor_Dadospessoa_N ;
   protected byte gxTv_SdtsdtListaServidor_Dadosendereco_N ;
   protected byte gxTv_SdtsdtListaServidor_Dadoslotacao_N ;
   protected byte gxTv_SdtsdtListaServidor_Foto_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtListaServidor_Tiposervidor ;
   protected GXBaseCollection<SdtsdtEndereco> gxTv_SdtsdtListaServidor_Dadosendereco_aux ;
   protected GXBaseCollection<SdtsdtLotacaoV3> gxTv_SdtsdtListaServidor_Dadoslotacao_aux ;
   protected GXBaseCollection<SdtsdtURLFoto> gxTv_SdtsdtListaServidor_Foto_aux ;
   protected GXBaseCollection<SdtsdtEndereco> gxTv_SdtsdtListaServidor_Dadosendereco=null ;
   protected GXBaseCollection<SdtsdtLotacaoV3> gxTv_SdtsdtListaServidor_Dadoslotacao=null ;
   protected GXBaseCollection<SdtsdtURLFoto> gxTv_SdtsdtListaServidor_Foto=null ;
   protected SdtsdtPessoa gxTv_SdtsdtListaServidor_Dadospessoa=null ;
}

