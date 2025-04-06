import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class Sdtpessoa extends GxSilentTrnSdt
{
   public Sdtpessoa( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(Sdtpessoa.class));
   }

   public Sdtpessoa( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle, context, "Sdtpessoa");
      initialize( remoteHandle) ;
   }

   public Sdtpessoa( int remoteHandle ,
                     StructSdtpessoa struct )
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

   public void Load( short AV7pes_id )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Short.valueOf(AV7pes_id)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"pes_id", short.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "pessoa");
      metadata.set("BT", "pessoa");
      metadata.set("PK", "[ \"pes_id\" ]");
      metadata.set("PKAssigned", "[ \"pes_id\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id") )
            {
               gxTv_Sdtpessoa_Pes_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_nome") )
            {
               gxTv_Sdtpessoa_Pes_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_data_nascimento") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_Sdtpessoa_Pes_data_nascimento = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_Sdtpessoa_Pes_data_nascimento = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_sexo") )
            {
               gxTv_Sdtpessoa_Pes_sexo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_mae") )
            {
               gxTv_Sdtpessoa_Pes_mae = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_pai") )
            {
               gxTv_Sdtpessoa_Pes_pai = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_idade") )
            {
               gxTv_Sdtpessoa_Pes_idade = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_Sdtpessoa_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_Sdtpessoa_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id_Z") )
            {
               gxTv_Sdtpessoa_Pes_id_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_nome_Z") )
            {
               gxTv_Sdtpessoa_Pes_nome_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_data_nascimento_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_Sdtpessoa_Pes_data_nascimento_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_Sdtpessoa_Pes_data_nascimento_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_sexo_Z") )
            {
               gxTv_Sdtpessoa_Pes_sexo_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_mae_Z") )
            {
               gxTv_Sdtpessoa_Pes_mae_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_pai_Z") )
            {
               gxTv_Sdtpessoa_Pes_pai_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_idade_Z") )
            {
               gxTv_Sdtpessoa_Pes_idade_Z = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "pessoa" ;
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
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_Sdtpessoa_Pes_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_nome", gxTv_Sdtpessoa_Pes_nome);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtpessoa_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtpessoa_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtpessoa_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("pes_data_nascimento", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_sexo", gxTv_Sdtpessoa_Pes_sexo);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_mae", gxTv_Sdtpessoa_Pes_mae);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_pai", gxTv_Sdtpessoa_Pes_pai);
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      oWriter.writeElement("pes_idade", GXutil.trim( GXutil.str( gxTv_Sdtpessoa_Pes_idade, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_Sdtpessoa_Mode);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_Sdtpessoa_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("pes_id_Z", GXutil.trim( GXutil.str( gxTv_Sdtpessoa_Pes_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("pes_nome_Z", gxTv_Sdtpessoa_Pes_nome_Z);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtpessoa_Pes_data_nascimento_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtpessoa_Pes_data_nascimento_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtpessoa_Pes_data_nascimento_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("pes_data_nascimento_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("pes_sexo_Z", gxTv_Sdtpessoa_Pes_sexo_Z);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("pes_mae_Z", gxTv_Sdtpessoa_Pes_mae_Z);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("pes_pai_Z", gxTv_Sdtpessoa_Pes_pai_Z);
         if ( GXutil.strcmp(sNameSpace, "SeletivoSEPLAG") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SeletivoSEPLAG");
         }
         oWriter.writeElement("pes_idade_Z", GXutil.trim( GXutil.str( gxTv_Sdtpessoa_Pes_idade_Z, 4, 0)));
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
      AddObjectProperty("pes_id", gxTv_Sdtpessoa_Pes_id, false, includeNonInitialized);
      AddObjectProperty("pes_nome", gxTv_Sdtpessoa_Pes_nome, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtpessoa_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtpessoa_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtpessoa_Pes_data_nascimento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("pes_data_nascimento", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("pes_sexo", gxTv_Sdtpessoa_Pes_sexo, false, includeNonInitialized);
      AddObjectProperty("pes_mae", gxTv_Sdtpessoa_Pes_mae, false, includeNonInitialized);
      AddObjectProperty("pes_pai", gxTv_Sdtpessoa_Pes_pai, false, includeNonInitialized);
      AddObjectProperty("pes_idade", gxTv_Sdtpessoa_Pes_idade, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_Sdtpessoa_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_Sdtpessoa_Initialized, false, includeNonInitialized);
         AddObjectProperty("pes_id_Z", gxTv_Sdtpessoa_Pes_id_Z, false, includeNonInitialized);
         AddObjectProperty("pes_nome_Z", gxTv_Sdtpessoa_Pes_nome_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_Sdtpessoa_Pes_data_nascimento_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_Sdtpessoa_Pes_data_nascimento_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_Sdtpessoa_Pes_data_nascimento_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("pes_data_nascimento_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("pes_sexo_Z", gxTv_Sdtpessoa_Pes_sexo_Z, false, includeNonInitialized);
         AddObjectProperty("pes_mae_Z", gxTv_Sdtpessoa_Pes_mae_Z, false, includeNonInitialized);
         AddObjectProperty("pes_pai_Z", gxTv_Sdtpessoa_Pes_pai_Z, false, includeNonInitialized);
         AddObjectProperty("pes_idade_Z", gxTv_Sdtpessoa_Pes_idade_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( Sdtpessoa sdt )
   {
      if ( sdt.IsDirty("pes_id") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtpessoa_Pes_id = sdt.getgxTv_Sdtpessoa_Pes_id() ;
      }
      if ( sdt.IsDirty("pes_nome") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtpessoa_Pes_nome = sdt.getgxTv_Sdtpessoa_Pes_nome() ;
      }
      if ( sdt.IsDirty("pes_data_nascimento") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtpessoa_Pes_data_nascimento = sdt.getgxTv_Sdtpessoa_Pes_data_nascimento() ;
      }
      if ( sdt.IsDirty("pes_sexo") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtpessoa_Pes_sexo = sdt.getgxTv_Sdtpessoa_Pes_sexo() ;
      }
      if ( sdt.IsDirty("pes_mae") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtpessoa_Pes_mae = sdt.getgxTv_Sdtpessoa_Pes_mae() ;
      }
      if ( sdt.IsDirty("pes_pai") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtpessoa_Pes_pai = sdt.getgxTv_Sdtpessoa_Pes_pai() ;
      }
      if ( sdt.IsDirty("pes_idade") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_Sdtpessoa_Pes_idade = sdt.getgxTv_Sdtpessoa_Pes_idade() ;
      }
   }

   public short getgxTv_Sdtpessoa_Pes_id( )
   {
      return gxTv_Sdtpessoa_Pes_id ;
   }

   public void setgxTv_Sdtpessoa_Pes_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      if ( gxTv_Sdtpessoa_Pes_id != value )
      {
         gxTv_Sdtpessoa_Mode = "INS" ;
         this.setgxTv_Sdtpessoa_Pes_id_Z_SetNull( );
         this.setgxTv_Sdtpessoa_Pes_nome_Z_SetNull( );
         this.setgxTv_Sdtpessoa_Pes_data_nascimento_Z_SetNull( );
         this.setgxTv_Sdtpessoa_Pes_sexo_Z_SetNull( );
         this.setgxTv_Sdtpessoa_Pes_mae_Z_SetNull( );
         this.setgxTv_Sdtpessoa_Pes_pai_Z_SetNull( );
         this.setgxTv_Sdtpessoa_Pes_idade_Z_SetNull( );
      }
      SetDirty("Pes_id");
      gxTv_Sdtpessoa_Pes_id = value ;
   }

   public String getgxTv_Sdtpessoa_Pes_nome( )
   {
      return gxTv_Sdtpessoa_Pes_nome ;
   }

   public void setgxTv_Sdtpessoa_Pes_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_nome");
      gxTv_Sdtpessoa_Pes_nome = value ;
   }

   public java.util.Date getgxTv_Sdtpessoa_Pes_data_nascimento( )
   {
      return gxTv_Sdtpessoa_Pes_data_nascimento ;
   }

   public void setgxTv_Sdtpessoa_Pes_data_nascimento( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_data_nascimento");
      gxTv_Sdtpessoa_Pes_data_nascimento = value ;
   }

   public String getgxTv_Sdtpessoa_Pes_sexo( )
   {
      return gxTv_Sdtpessoa_Pes_sexo ;
   }

   public void setgxTv_Sdtpessoa_Pes_sexo( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_sexo");
      gxTv_Sdtpessoa_Pes_sexo = value ;
   }

   public String getgxTv_Sdtpessoa_Pes_mae( )
   {
      return gxTv_Sdtpessoa_Pes_mae ;
   }

   public void setgxTv_Sdtpessoa_Pes_mae( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_mae");
      gxTv_Sdtpessoa_Pes_mae = value ;
   }

   public String getgxTv_Sdtpessoa_Pes_pai( )
   {
      return gxTv_Sdtpessoa_Pes_pai ;
   }

   public void setgxTv_Sdtpessoa_Pes_pai( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_pai");
      gxTv_Sdtpessoa_Pes_pai = value ;
   }

   public short getgxTv_Sdtpessoa_Pes_idade( )
   {
      return gxTv_Sdtpessoa_Pes_idade ;
   }

   public void setgxTv_Sdtpessoa_Pes_idade( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_idade");
      gxTv_Sdtpessoa_Pes_idade = value ;
   }

   public void setgxTv_Sdtpessoa_Pes_idade_SetNull( )
   {
      gxTv_Sdtpessoa_Pes_idade = (short)(0) ;
      SetDirty("Pes_idade");
   }

   public boolean getgxTv_Sdtpessoa_Pes_idade_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtpessoa_Mode( )
   {
      return gxTv_Sdtpessoa_Mode ;
   }

   public void setgxTv_Sdtpessoa_Mode( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Mode");
      gxTv_Sdtpessoa_Mode = value ;
   }

   public void setgxTv_Sdtpessoa_Mode_SetNull( )
   {
      gxTv_Sdtpessoa_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_Sdtpessoa_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtpessoa_Initialized( )
   {
      return gxTv_Sdtpessoa_Initialized ;
   }

   public void setgxTv_Sdtpessoa_Initialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_Sdtpessoa_Initialized = value ;
   }

   public void setgxTv_Sdtpessoa_Initialized_SetNull( )
   {
      gxTv_Sdtpessoa_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_Sdtpessoa_Initialized_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtpessoa_Pes_id_Z( )
   {
      return gxTv_Sdtpessoa_Pes_id_Z ;
   }

   public void setgxTv_Sdtpessoa_Pes_id_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_id_Z");
      gxTv_Sdtpessoa_Pes_id_Z = value ;
   }

   public void setgxTv_Sdtpessoa_Pes_id_Z_SetNull( )
   {
      gxTv_Sdtpessoa_Pes_id_Z = (short)(0) ;
      SetDirty("Pes_id_Z");
   }

   public boolean getgxTv_Sdtpessoa_Pes_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtpessoa_Pes_nome_Z( )
   {
      return gxTv_Sdtpessoa_Pes_nome_Z ;
   }

   public void setgxTv_Sdtpessoa_Pes_nome_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_nome_Z");
      gxTv_Sdtpessoa_Pes_nome_Z = value ;
   }

   public void setgxTv_Sdtpessoa_Pes_nome_Z_SetNull( )
   {
      gxTv_Sdtpessoa_Pes_nome_Z = "" ;
      SetDirty("Pes_nome_Z");
   }

   public boolean getgxTv_Sdtpessoa_Pes_nome_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_Sdtpessoa_Pes_data_nascimento_Z( )
   {
      return gxTv_Sdtpessoa_Pes_data_nascimento_Z ;
   }

   public void setgxTv_Sdtpessoa_Pes_data_nascimento_Z( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_data_nascimento_Z");
      gxTv_Sdtpessoa_Pes_data_nascimento_Z = value ;
   }

   public void setgxTv_Sdtpessoa_Pes_data_nascimento_Z_SetNull( )
   {
      gxTv_Sdtpessoa_Pes_data_nascimento_Z = GXutil.nullDate() ;
      SetDirty("Pes_data_nascimento_Z");
   }

   public boolean getgxTv_Sdtpessoa_Pes_data_nascimento_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtpessoa_Pes_sexo_Z( )
   {
      return gxTv_Sdtpessoa_Pes_sexo_Z ;
   }

   public void setgxTv_Sdtpessoa_Pes_sexo_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_sexo_Z");
      gxTv_Sdtpessoa_Pes_sexo_Z = value ;
   }

   public void setgxTv_Sdtpessoa_Pes_sexo_Z_SetNull( )
   {
      gxTv_Sdtpessoa_Pes_sexo_Z = "" ;
      SetDirty("Pes_sexo_Z");
   }

   public boolean getgxTv_Sdtpessoa_Pes_sexo_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtpessoa_Pes_mae_Z( )
   {
      return gxTv_Sdtpessoa_Pes_mae_Z ;
   }

   public void setgxTv_Sdtpessoa_Pes_mae_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_mae_Z");
      gxTv_Sdtpessoa_Pes_mae_Z = value ;
   }

   public void setgxTv_Sdtpessoa_Pes_mae_Z_SetNull( )
   {
      gxTv_Sdtpessoa_Pes_mae_Z = "" ;
      SetDirty("Pes_mae_Z");
   }

   public boolean getgxTv_Sdtpessoa_Pes_mae_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtpessoa_Pes_pai_Z( )
   {
      return gxTv_Sdtpessoa_Pes_pai_Z ;
   }

   public void setgxTv_Sdtpessoa_Pes_pai_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_pai_Z");
      gxTv_Sdtpessoa_Pes_pai_Z = value ;
   }

   public void setgxTv_Sdtpessoa_Pes_pai_Z_SetNull( )
   {
      gxTv_Sdtpessoa_Pes_pai_Z = "" ;
      SetDirty("Pes_pai_Z");
   }

   public boolean getgxTv_Sdtpessoa_Pes_pai_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_Sdtpessoa_Pes_idade_Z( )
   {
      return gxTv_Sdtpessoa_Pes_idade_Z ;
   }

   public void setgxTv_Sdtpessoa_Pes_idade_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Pes_idade_Z");
      gxTv_Sdtpessoa_Pes_idade_Z = value ;
   }

   public void setgxTv_Sdtpessoa_Pes_idade_Z_SetNull( )
   {
      gxTv_Sdtpessoa_Pes_idade_Z = (short)(0) ;
      SetDirty("Pes_idade_Z");
   }

   public boolean getgxTv_Sdtpessoa_Pes_idade_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      pessoa_bc obj;
      obj = new pessoa_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_Sdtpessoa_Pes_nome = "" ;
      gxTv_Sdtpessoa_Pes_data_nascimento = GXutil.nullDate() ;
      gxTv_Sdtpessoa_Pes_sexo = "" ;
      gxTv_Sdtpessoa_Pes_mae = "" ;
      gxTv_Sdtpessoa_Pes_pai = "" ;
      gxTv_Sdtpessoa_Mode = "" ;
      gxTv_Sdtpessoa_Pes_nome_Z = "" ;
      gxTv_Sdtpessoa_Pes_data_nascimento_Z = GXutil.nullDate() ;
      gxTv_Sdtpessoa_Pes_sexo_Z = "" ;
      gxTv_Sdtpessoa_Pes_mae_Z = "" ;
      gxTv_Sdtpessoa_Pes_pai_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public Sdtpessoa Clone( )
   {
      Sdtpessoa sdt;
      pessoa_bc obj;
      sdt = (Sdtpessoa)(clone()) ;
      obj = (pessoa_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtpessoa struct )
   {
      if ( struct != null )
      {
         setgxTv_Sdtpessoa_Pes_id(struct.getPes_id());
         setgxTv_Sdtpessoa_Pes_nome(struct.getPes_nome());
         setgxTv_Sdtpessoa_Pes_data_nascimento(struct.getPes_data_nascimento());
         setgxTv_Sdtpessoa_Pes_sexo(struct.getPes_sexo());
         setgxTv_Sdtpessoa_Pes_mae(struct.getPes_mae());
         setgxTv_Sdtpessoa_Pes_pai(struct.getPes_pai());
         setgxTv_Sdtpessoa_Pes_idade(struct.getPes_idade());
         setgxTv_Sdtpessoa_Mode(struct.getMode());
         setgxTv_Sdtpessoa_Initialized(struct.getInitialized());
         setgxTv_Sdtpessoa_Pes_id_Z(struct.getPes_id_Z());
         setgxTv_Sdtpessoa_Pes_nome_Z(struct.getPes_nome_Z());
         setgxTv_Sdtpessoa_Pes_data_nascimento_Z(struct.getPes_data_nascimento_Z());
         setgxTv_Sdtpessoa_Pes_sexo_Z(struct.getPes_sexo_Z());
         setgxTv_Sdtpessoa_Pes_mae_Z(struct.getPes_mae_Z());
         setgxTv_Sdtpessoa_Pes_pai_Z(struct.getPes_pai_Z());
         setgxTv_Sdtpessoa_Pes_idade_Z(struct.getPes_idade_Z());
      }
   }

   @SuppressWarnings("unchecked")
   public StructSdtpessoa getStruct( )
   {
      StructSdtpessoa struct = new StructSdtpessoa ();
      struct.setPes_id(getgxTv_Sdtpessoa_Pes_id());
      struct.setPes_nome(getgxTv_Sdtpessoa_Pes_nome());
      struct.setPes_data_nascimento(getgxTv_Sdtpessoa_Pes_data_nascimento());
      struct.setPes_sexo(getgxTv_Sdtpessoa_Pes_sexo());
      struct.setPes_mae(getgxTv_Sdtpessoa_Pes_mae());
      struct.setPes_pai(getgxTv_Sdtpessoa_Pes_pai());
      struct.setPes_idade(getgxTv_Sdtpessoa_Pes_idade());
      struct.setMode(getgxTv_Sdtpessoa_Mode());
      struct.setInitialized(getgxTv_Sdtpessoa_Initialized());
      struct.setPes_id_Z(getgxTv_Sdtpessoa_Pes_id_Z());
      struct.setPes_nome_Z(getgxTv_Sdtpessoa_Pes_nome_Z());
      struct.setPes_data_nascimento_Z(getgxTv_Sdtpessoa_Pes_data_nascimento_Z());
      struct.setPes_sexo_Z(getgxTv_Sdtpessoa_Pes_sexo_Z());
      struct.setPes_mae_Z(getgxTv_Sdtpessoa_Pes_mae_Z());
      struct.setPes_pai_Z(getgxTv_Sdtpessoa_Pes_pai_Z());
      struct.setPes_idade_Z(getgxTv_Sdtpessoa_Pes_idade_Z());
      return struct ;
   }

   private byte sdtIsNull ;
   private short gxTv_Sdtpessoa_Pes_id ;
   private short gxTv_Sdtpessoa_Pes_idade ;
   private short gxTv_Sdtpessoa_Initialized ;
   private short gxTv_Sdtpessoa_Pes_id_Z ;
   private short gxTv_Sdtpessoa_Pes_idade_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_Sdtpessoa_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_Sdtpessoa_Pes_data_nascimento ;
   private java.util.Date gxTv_Sdtpessoa_Pes_data_nascimento_Z ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_Sdtpessoa_Pes_nome ;
   private String gxTv_Sdtpessoa_Pes_sexo ;
   private String gxTv_Sdtpessoa_Pes_mae ;
   private String gxTv_Sdtpessoa_Pes_pai ;
   private String gxTv_Sdtpessoa_Pes_nome_Z ;
   private String gxTv_Sdtpessoa_Pes_sexo_Z ;
   private String gxTv_Sdtpessoa_Pes_mae_Z ;
   private String gxTv_Sdtpessoa_Pes_pai_Z ;
}

