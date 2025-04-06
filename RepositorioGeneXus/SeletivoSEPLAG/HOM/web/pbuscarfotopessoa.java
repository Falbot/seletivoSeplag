import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscarfotopessoa extends GXProcedure
{
   public pbuscarfotopessoa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscarfotopessoa.class ), "" );
   }

   public pbuscarfotopessoa( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<SdtsdtURLFoto> executeUdp( short aP0 )
   {
      pbuscarfotopessoa.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<SdtsdtURLFoto>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( short aP0 ,
                        GXBaseCollection<SdtsdtURLFoto>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( short aP0 ,
                             GXBaseCollection<SdtsdtURLFoto>[] aP1 )
   {
      pbuscarfotopessoa.this.AV8pes_id = aP0;
      pbuscarfotopessoa.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00172 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV8pes_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7pes_id = P00172_A7pes_id[0] ;
         A21fp_hash = P00172_A21fp_hash[0] ;
         A18fp_id = P00172_A18fp_id[0] ;
         AV16fp_hash = A21fp_hash ;
         /* Execute user subroutine: 'PEGARURLIMAGEMSTORAGE' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV9Foto.add(AV19URL, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'PEGARURLIMAGEMSTORAGE' Routine */
      returnInSub = false ;
      GXt_properties1 = AV10Properties ;
      GXv_properties2[0] = GXt_properties1 ;
      new ppropriedadesstorages3(remoteHandle, context).execute( GXv_properties2) ;
      GXt_properties1 = GXv_properties2[0] ;
      AV10Properties = GXt_properties1 ;
      GXv_storageprovider3[0] = AV12StorageProvider ;
      GXv_objcol_SdtMessages_Message4[0] = AV13Messages ;
      if ( AV11ExternalStorage.connect("Default", AV10Properties, GXv_storageprovider3, GXv_objcol_SdtMessages_Message4) )
      {
         AV12StorageProvider = GXv_storageprovider3[0] ;
         AV13Messages = GXv_objcol_SdtMessages_Message4[0] ;
         httpContext.GX_msglist.addItem("Sucesso");
         if ( AV12StorageProvider.getPrivate(AV16fp_hash, AV15UploadedFile, (short)(5), new GXBaseCollection<com.genexus.SdtMessages_Message>()) )
         {
            AV19URL.setgxTv_SdtsdtURLFoto_Linkexp5minutos( AV15UploadedFile.getURI() );
            System.out.println( AV15UploadedFile.getURI() );
            httpContext.GX_msglist.addItem("Sucesso Get URI");
         }
         else
         {
            AV23GXV1 = 1 ;
            while ( AV23GXV1 <= AV13Messages.size() )
            {
               AV14Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV13Messages.elementAt(-1+AV23GXV1));
               System.out.println( AV14Message.getgxTv_SdtMessages_Message_Description() );
               AV23GXV1 = (int)(AV23GXV1+1) ;
            }
         }
      }
      else
      {
         httpContext.GX_msglist.addItem("Falhou");
      }
   }

   protected void cleanup( )
   {
      this.aP1[0] = pbuscarfotopessoa.this.AV9Foto;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Foto = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
      scmdbuf = "" ;
      P00172_A7pes_id = new short[1] ;
      P00172_A21fp_hash = new String[] {""} ;
      P00172_A18fp_id = new short[1] ;
      A21fp_hash = "" ;
      AV16fp_hash = "" ;
      AV19URL = new SdtsdtURLFoto(remoteHandle, context);
      AV10Properties = new com.genexus.util.GXProperties();
      GXt_properties1 = new com.genexus.util.GXProperties();
      GXv_properties2 = new com.genexus.util.GXProperties[1] ;
      AV12StorageProvider = new com.genexus.util.GXStorageProvider();
      GXv_storageprovider3 = new com.genexus.util.GXStorageProvider[1] ;
      AV13Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message4 = new GXBaseCollection[1] ;
      AV11ExternalStorage = new com.genexuscore.genexus.common.configuration.SdtExternalStorage(remoteHandle, context);
      AV15UploadedFile = new com.genexus.util.GXFile();
      AV14Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new pbuscarfotopessoa__default(),
         new Object[] {
             new Object[] {
            P00172_A7pes_id, P00172_A21fp_hash, P00172_A18fp_id
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8pes_id ;
   private short A7pes_id ;
   private short A18fp_id ;
   private short Gx_err ;
   private int AV23GXV1 ;
   private String scmdbuf ;
   private boolean returnInSub ;
   private String A21fp_hash ;
   private String AV16fp_hash ;
   private com.genexus.util.GXStorageProvider GXv_storageprovider3[] ;
   private com.genexuscore.genexus.common.configuration.SdtExternalStorage AV11ExternalStorage ;
   private GXBaseCollection<SdtsdtURLFoto>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P00172_A7pes_id ;
   private String[] P00172_A21fp_hash ;
   private short[] P00172_A18fp_id ;
   private com.genexus.util.GXStorageProvider AV12StorageProvider ;
   private com.genexus.util.GXFile AV15UploadedFile ;
   private com.genexus.util.GXProperties AV10Properties ;
   private com.genexus.util.GXProperties GXt_properties1 ;
   private com.genexus.util.GXProperties GXv_properties2[] ;
   private GXBaseCollection<SdtsdtURLFoto> AV9Foto ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV13Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message4[] ;
   private com.genexus.SdtMessages_Message AV14Message ;
   private SdtsdtURLFoto AV19URL ;
}

final  class pbuscarfotopessoa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00172", "SELECT pes_id, fp_hash, fp_id FROM foto_pessoa WHERE pes_id = ? ORDER BY pes_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

