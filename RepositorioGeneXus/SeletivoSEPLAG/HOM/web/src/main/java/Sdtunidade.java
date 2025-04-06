import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class Sdtunidade extends GxSilentTrnSdt
{
   public Sdtunidade( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(Sdtunidade.class));
   }

   public Sdtunidade( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "Sdtunidade");
      initialize( remoteHandle) ;
   }

   public Sdtunidade( int remoteHandle ,
                      StructSdtunidade struct )
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

   public void Load( short AV4unid_id )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Short.valueOf(AV4unid_id)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"unid_id", short.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "unidade");
      metadata.set("BT", "unidade");
      metadata.set("PK", "[ \"unid_id\" ]");
      metadata.set("PKAssigned", "[ \"unid_id\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id") )
            {
               gxTv_Sdtunidade_Unid_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome") )
            {
               gxTv_Sdtunidade_Unid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla") )
            {
               gxTv_Sdtunidade_Unid_sigla = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_Sdtunidade_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_Sdtunidade_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id_Z") )
            {
               gxTv_Sdtunidade_Unid_id_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome_Z") )
            {
               gxTv_Sdtunidade_Unid_nome_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla_Z") )
            {
               gxTv_Sdtunidade_Unid_sigla_Z = oReader.getValue() ;
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
         sName = "unidade" ;
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
      oWriter.writeElement("unid_id", GXutil.trim( GXutil.str( gxTv_Sdtunidade_Unid_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_nome", gxTv_Sdtunidade_Unid_nome);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("unid_sigla", gxTv_Sdtunidade_Unid_sigla);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_Sdtunidade_Mode);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_Sdtunidade_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("unid_id_Z", GXutil.trim( GXutil.str( gxTv_Sdtunidade_Unid_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("unid_nome_Z", gxTv_Sdtunidade_Unid_nome_Z);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("unid_sigla_Z", gxTv_Sdtunidade_Unid_sigla_Z);
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
      AddObjectProperty("unid_id", gxTv_Sdtunidade_Unid_id, false, includeNonInitialized);
      AddObjectProperty("unid_nome", gxTv_Sdtunidade_Unid_nome, false, includeNonInitialized);
      AddObjectProperty("unid_sigla", gxTv_Sdtunidade_Unid_sigla, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_Sdtunidade_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_Sdtunidade_Initialized, false, includeNonInitialized);
         AddObjectProperty("unid_id_Z", gxTv_Sdtunidade_Unid_id_Z, false, includeNonInitialized);
         AddObjectProperty("unid_nome_Z", gxTv_Sdtunidade_Unid_nome_Z, false, includeNonInitialized);
         AddObjectProperty("unid_sigla_Z", gxTv_Sdtunidade_Unid_sigla_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( Sdtunidade sdt )
   {
      if ( sdt.IsDirty("unid_id") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtunidade_Unid_id = sdt.getgxTv_Sdtunidade_Unid_id() ;
      }
      if ( sdt.IsDirty("unid_nome") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtunidade_Unid_nome = sdt.getgxTv_Sdtunidade_Unid_nome() ;
      }
      if ( sdt.IsDirty("unid_sigla") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtunidade_Unid_sigla = sdt.getgxTv_Sdtunidade_Unid_sigla() ;
      }
   }

   public short getgxTv_Sdtunidade_Unid_id( )
   {
      return gxTv_Sdtunidade_Unid_id ;
   }

   public void setgxTv_Sdtunidade_Unid_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      if ( gxTv_Sdtunidade_Unid_id != value )
      {
         gxTv_Sdtunidade_Mode = "INS" ;
         this.setgxTv_Sdtunidade_Unid_id_Z_SetNull( );
         this.setgxTv_Sdtunidade_Unid_nome_Z_SetNull( );
         this.setgxTv_Sdtunidade_Unid_sigla_Z_SetNull( );
      }
      SetDirty("Unid_id");
      gxTv_Sdtunidade_Unid_id = value ;
   }

   public String getgxTv_Sdtunidade_Unid_nome( )
   {
      return gxTv_Sdtunidade_Unid_nome ;
   }

   public void setgxTv_Sdtunidade_Unid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_nome");
      gxTv_Sdtunidade_Unid_nome = value ;
   }

   public String getgxTv_Sdtunidade_Unid_sigla( )
   {
      return gxTv_Sdtunidade_Unid_sigla ;
   }

   public void setgxTv_Sdtunidade_Unid_sigla( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_sigla");
      gxTv_Sdtunidade_Unid_sigla = value ;
   }

   public String getgxTv_Sdtunidade_Mode( )
   {
      return gxTv_Sdtunidade_Mode ;
   }

   public void setgxTv_Sdtunidade_Mode( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Mode");
      gxTv_Sdtunidade_Mode = value ;
   }

   public void setgxTv_Sdtunidade_Mode_SetNull( )
   {
      gxTv_Sdtunidade_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_Sdtunidade_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtunidade_Initialized( )
   {
      return gxTv_Sdtunidade_Initialized ;
   }

   public void setgxTv_Sdtunidade_Initialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_Sdtunidade_Initialized = value ;
   }

   public void setgxTv_Sdtunidade_Initialized_SetNull( )
   {
      gxTv_Sdtunidade_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_Sdtunidade_Initialized_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtunidade_Unid_id_Z( )
   {
      return gxTv_Sdtunidade_Unid_id_Z ;
   }

   public void setgxTv_Sdtunidade_Unid_id_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_id_Z");
      gxTv_Sdtunidade_Unid_id_Z = value ;
   }

   public void setgxTv_Sdtunidade_Unid_id_Z_SetNull( )
   {
      gxTv_Sdtunidade_Unid_id_Z = (short)(0) ;
      SetDirty("Unid_id_Z");
   }

   public boolean getgxTv_Sdtunidade_Unid_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtunidade_Unid_nome_Z( )
   {
      return gxTv_Sdtunidade_Unid_nome_Z ;
   }

   public void setgxTv_Sdtunidade_Unid_nome_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_nome_Z");
      gxTv_Sdtunidade_Unid_nome_Z = value ;
   }

   public void setgxTv_Sdtunidade_Unid_nome_Z_SetNull( )
   {
      gxTv_Sdtunidade_Unid_nome_Z = "" ;
      SetDirty("Unid_nome_Z");
   }

   public boolean getgxTv_Sdtunidade_Unid_nome_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtunidade_Unid_sigla_Z( )
   {
      return gxTv_Sdtunidade_Unid_sigla_Z ;
   }

   public void setgxTv_Sdtunidade_Unid_sigla_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_sigla_Z");
      gxTv_Sdtunidade_Unid_sigla_Z = value ;
   }

   public void setgxTv_Sdtunidade_Unid_sigla_Z_SetNull( )
   {
      gxTv_Sdtunidade_Unid_sigla_Z = "" ;
      SetDirty("Unid_sigla_Z");
   }

   public boolean getgxTv_Sdtunidade_Unid_sigla_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      unidade_bc obj;
      obj = new unidade_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_Sdtunidade_Unid_nome = "" ;
      gxTv_Sdtunidade_Unid_sigla = "" ;
      gxTv_Sdtunidade_Mode = "" ;
      gxTv_Sdtunidade_Unid_nome_Z = "" ;
      gxTv_Sdtunidade_Unid_sigla_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public Sdtunidade Clone( )
   {
      Sdtunidade sdt;
      unidade_bc obj;
      sdt = (Sdtunidade)(clone()) ;
      obj = (unidade_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtunidade struct )
   {
      if ( struct != null )
      {
         setgxTv_Sdtunidade_Unid_id(struct.getUnid_id());
         setgxTv_Sdtunidade_Unid_nome(struct.getUnid_nome());
         setgxTv_Sdtunidade_Unid_sigla(struct.getUnid_sigla());
         setgxTv_Sdtunidade_Mode(struct.getMode());
         setgxTv_Sdtunidade_Initialized(struct.getInitialized());
         setgxTv_Sdtunidade_Unid_id_Z(struct.getUnid_id_Z());
         setgxTv_Sdtunidade_Unid_nome_Z(struct.getUnid_nome_Z());
         setgxTv_Sdtunidade_Unid_sigla_Z(struct.getUnid_sigla_Z());
      }
   }

   @SuppressWarnings("unchecked")
   public StructSdtunidade getStruct( )
   {
      StructSdtunidade struct = new StructSdtunidade ();
      struct.setUnid_id(getgxTv_Sdtunidade_Unid_id());
      struct.setUnid_nome(getgxTv_Sdtunidade_Unid_nome());
      struct.setUnid_sigla(getgxTv_Sdtunidade_Unid_sigla());
      struct.setMode(getgxTv_Sdtunidade_Mode());
      struct.setInitialized(getgxTv_Sdtunidade_Initialized());
      struct.setUnid_id_Z(getgxTv_Sdtunidade_Unid_id_Z());
      struct.setUnid_nome_Z(getgxTv_Sdtunidade_Unid_nome_Z());
      struct.setUnid_sigla_Z(getgxTv_Sdtunidade_Unid_sigla_Z());
      return struct ;
   }

   private byte sdtIsNull ;
   private short gxTv_Sdtunidade_Unid_id ;
   private short gxTv_Sdtunidade_Initialized ;
   private short gxTv_Sdtunidade_Unid_id_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_Sdtunidade_Mode ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_Sdtunidade_Unid_nome ;
   private String gxTv_Sdtunidade_Unid_sigla ;
   private String gxTv_Sdtunidade_Unid_nome_Z ;
   private String gxTv_Sdtunidade_Unid_sigla_Z ;
}

