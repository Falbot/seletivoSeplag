import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class Sdtcidade extends GxSilentTrnSdt
{
   public Sdtcidade( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(Sdtcidade.class));
   }

   public Sdtcidade( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle, context, "Sdtcidade");
      initialize( remoteHandle) ;
   }

   public Sdtcidade( int remoteHandle ,
                     StructSdtcidade struct )
   {
      this(remoteHandle);
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

   public void Load( short AV1cid_id )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Short.valueOf(AV1cid_id)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"cid_id", short.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "cidade");
      metadata.set("BT", "cidade");
      metadata.set("PK", "[ \"cid_id\" ]");
      metadata.set("PKAssigned", "[ \"cid_id\" ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_id") )
            {
               gxTv_Sdtcidade_Cid_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_nome") )
            {
               gxTv_Sdtcidade_Cid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_uf") )
            {
               gxTv_Sdtcidade_Cid_uf = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_Sdtcidade_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_Sdtcidade_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_id_Z") )
            {
               gxTv_Sdtcidade_Cid_id_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_nome_Z") )
            {
               gxTv_Sdtcidade_Cid_nome_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cid_uf_Z") )
            {
               gxTv_Sdtcidade_Cid_uf_Z = oReader.getValue() ;
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
         sName = "cidade" ;
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
      oWriter.writeElement("cid_id", GXutil.trim( GXutil.str( gxTv_Sdtcidade_Cid_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("cid_nome", gxTv_Sdtcidade_Cid_nome);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("cid_uf", gxTv_Sdtcidade_Cid_uf);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_Sdtcidade_Mode);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_Sdtcidade_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("cid_id_Z", GXutil.trim( GXutil.str( gxTv_Sdtcidade_Cid_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("cid_nome_Z", gxTv_Sdtcidade_Cid_nome_Z);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("cid_uf_Z", gxTv_Sdtcidade_Cid_uf_Z);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
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
      AddObjectProperty("cid_id", gxTv_Sdtcidade_Cid_id, false, includeNonInitialized);
      AddObjectProperty("cid_nome", gxTv_Sdtcidade_Cid_nome, false, includeNonInitialized);
      AddObjectProperty("cid_uf", gxTv_Sdtcidade_Cid_uf, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_Sdtcidade_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_Sdtcidade_Initialized, false, includeNonInitialized);
         AddObjectProperty("cid_id_Z", gxTv_Sdtcidade_Cid_id_Z, false, includeNonInitialized);
         AddObjectProperty("cid_nome_Z", gxTv_Sdtcidade_Cid_nome_Z, false, includeNonInitialized);
         AddObjectProperty("cid_uf_Z", gxTv_Sdtcidade_Cid_uf_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( Sdtcidade sdt )
   {
      if ( sdt.IsDirty("cid_id") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtcidade_Cid_id = sdt.getgxTv_Sdtcidade_Cid_id() ;
      }
      if ( sdt.IsDirty("cid_nome") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtcidade_Cid_nome = sdt.getgxTv_Sdtcidade_Cid_nome() ;
      }
      if ( sdt.IsDirty("cid_uf") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtcidade_Cid_uf = sdt.getgxTv_Sdtcidade_Cid_uf() ;
      }
   }

   public short getgxTv_Sdtcidade_Cid_id( )
   {
      return gxTv_Sdtcidade_Cid_id ;
   }

   public void setgxTv_Sdtcidade_Cid_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      if ( gxTv_Sdtcidade_Cid_id != value )
      {
         gxTv_Sdtcidade_Mode = "INS" ;
         this.setgxTv_Sdtcidade_Cid_id_Z_SetNull( );
         this.setgxTv_Sdtcidade_Cid_nome_Z_SetNull( );
         this.setgxTv_Sdtcidade_Cid_uf_Z_SetNull( );
      }
      SetDirty("Cid_id");
      gxTv_Sdtcidade_Cid_id = value ;
   }

   public String getgxTv_Sdtcidade_Cid_nome( )
   {
      return gxTv_Sdtcidade_Cid_nome ;
   }

   public void setgxTv_Sdtcidade_Cid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Cid_nome");
      gxTv_Sdtcidade_Cid_nome = value ;
   }

   public String getgxTv_Sdtcidade_Cid_uf( )
   {
      return gxTv_Sdtcidade_Cid_uf ;
   }

   public void setgxTv_Sdtcidade_Cid_uf( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Cid_uf");
      gxTv_Sdtcidade_Cid_uf = value ;
   }

   public String getgxTv_Sdtcidade_Mode( )
   {
      return gxTv_Sdtcidade_Mode ;
   }

   public void setgxTv_Sdtcidade_Mode( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Mode");
      gxTv_Sdtcidade_Mode = value ;
   }

   public void setgxTv_Sdtcidade_Mode_SetNull( )
   {
      gxTv_Sdtcidade_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_Sdtcidade_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtcidade_Initialized( )
   {
      return gxTv_Sdtcidade_Initialized ;
   }

   public void setgxTv_Sdtcidade_Initialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_Sdtcidade_Initialized = value ;
   }

   public void setgxTv_Sdtcidade_Initialized_SetNull( )
   {
      gxTv_Sdtcidade_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_Sdtcidade_Initialized_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtcidade_Cid_id_Z( )
   {
      return gxTv_Sdtcidade_Cid_id_Z ;
   }

   public void setgxTv_Sdtcidade_Cid_id_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Cid_id_Z");
      gxTv_Sdtcidade_Cid_id_Z = value ;
   }

   public void setgxTv_Sdtcidade_Cid_id_Z_SetNull( )
   {
      gxTv_Sdtcidade_Cid_id_Z = (short)(0) ;
      SetDirty("Cid_id_Z");
   }

   public boolean getgxTv_Sdtcidade_Cid_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtcidade_Cid_nome_Z( )
   {
      return gxTv_Sdtcidade_Cid_nome_Z ;
   }

   public void setgxTv_Sdtcidade_Cid_nome_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Cid_nome_Z");
      gxTv_Sdtcidade_Cid_nome_Z = value ;
   }

   public void setgxTv_Sdtcidade_Cid_nome_Z_SetNull( )
   {
      gxTv_Sdtcidade_Cid_nome_Z = "" ;
      SetDirty("Cid_nome_Z");
   }

   public boolean getgxTv_Sdtcidade_Cid_nome_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtcidade_Cid_uf_Z( )
   {
      return gxTv_Sdtcidade_Cid_uf_Z ;
   }

   public void setgxTv_Sdtcidade_Cid_uf_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Cid_uf_Z");
      gxTv_Sdtcidade_Cid_uf_Z = value ;
   }

   public void setgxTv_Sdtcidade_Cid_uf_Z_SetNull( )
   {
      gxTv_Sdtcidade_Cid_uf_Z = "" ;
      SetDirty("Cid_uf_Z");
   }

   public boolean getgxTv_Sdtcidade_Cid_uf_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      cidade_bc obj;
      obj = new cidade_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_Sdtcidade_Cid_nome = "" ;
      gxTv_Sdtcidade_Cid_uf = "" ;
      gxTv_Sdtcidade_Mode = "" ;
      gxTv_Sdtcidade_Cid_nome_Z = "" ;
      gxTv_Sdtcidade_Cid_uf_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public Sdtcidade Clone( )
   {
      Sdtcidade sdt;
      cidade_bc obj;
      sdt = (Sdtcidade)(clone()) ;
      obj = (cidade_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtcidade struct )
   {
      if ( struct != null )
      {
         setgxTv_Sdtcidade_Cid_id(struct.getCid_id());
         setgxTv_Sdtcidade_Cid_nome(struct.getCid_nome());
         setgxTv_Sdtcidade_Cid_uf(struct.getCid_uf());
         setgxTv_Sdtcidade_Mode(struct.getMode());
         setgxTv_Sdtcidade_Initialized(struct.getInitialized());
         setgxTv_Sdtcidade_Cid_id_Z(struct.getCid_id_Z());
         setgxTv_Sdtcidade_Cid_nome_Z(struct.getCid_nome_Z());
         setgxTv_Sdtcidade_Cid_uf_Z(struct.getCid_uf_Z());
      }
   }

   @SuppressWarnings("unchecked")
   public StructSdtcidade getStruct( )
   {
      StructSdtcidade struct = new StructSdtcidade ();
      struct.setCid_id(getgxTv_Sdtcidade_Cid_id());
      struct.setCid_nome(getgxTv_Sdtcidade_Cid_nome());
      struct.setCid_uf(getgxTv_Sdtcidade_Cid_uf());
      struct.setMode(getgxTv_Sdtcidade_Mode());
      struct.setInitialized(getgxTv_Sdtcidade_Initialized());
      struct.setCid_id_Z(getgxTv_Sdtcidade_Cid_id_Z());
      struct.setCid_nome_Z(getgxTv_Sdtcidade_Cid_nome_Z());
      struct.setCid_uf_Z(getgxTv_Sdtcidade_Cid_uf_Z());
      return struct ;
   }

   private byte sdtIsNull ;
   private short gxTv_Sdtcidade_Cid_id ;
   private short gxTv_Sdtcidade_Initialized ;
   private short gxTv_Sdtcidade_Cid_id_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_Sdtcidade_Cid_uf ;
   private String gxTv_Sdtcidade_Mode ;
   private String gxTv_Sdtcidade_Cid_uf_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_Sdtcidade_Cid_nome ;
   private String gxTv_Sdtcidade_Cid_nome_Z ;
}

