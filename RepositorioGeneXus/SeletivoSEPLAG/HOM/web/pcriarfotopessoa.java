import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcriarfotopessoa extends GXProcedure
{
   public pcriarfotopessoa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcriarfotopessoa.class ), "" );
   }

   public pcriarfotopessoa( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( SdtsdtFotoPessoa aP0 )
   {
      pcriarfotopessoa.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( SdtsdtFotoPessoa aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( SdtsdtFotoPessoa aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      pcriarfotopessoa.this.AV9DadosFotoPessoa = aP0;
      pcriarfotopessoa.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV30Ind = (short)(1) ;
      while ( AV30Ind <= AV9DadosFotoPessoa.getgxTv_SdtsdtFotoPessoa_Foto().size() )
      {
         AV29TipoArquivo = GXutil.substring( ((SdtsdtFoto)AV9DadosFotoPessoa.getgxTv_SdtsdtFotoPessoa_Foto().elementAt(-1+AV30Ind)).getgxTv_SdtsdtFoto_Arquivobase64(), 1, 20) ;
         if ( GXutil.strcmp(GXutil.substring( AV29TipoArquivo, 1, 4), "/9j/") == 0 )
         {
            AV28ExtensaoArquivo = ".jpg" ;
         }
         else
         {
            if ( GXutil.strcmp(GXutil.substring( AV29TipoArquivo, 1, 5), "iVBOR") == 0 )
            {
               AV28ExtensaoArquivo = ".png" ;
            }
            else
            {
               if ( GXutil.strcmp(GXutil.substring( AV29TipoArquivo, 1, 5), "R0lGO") == 0 )
               {
                  AV28ExtensaoArquivo = ".gif" ;
               }
               else
               {
                  AV21Message.setgxTv_SdtMessages_Message_Description( "O arquivo enviado não contém uma imagem." );
                  AV8Messages.add(AV21Message, 0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         AV30Ind = (short)(AV30Ind+1) ;
      }
      AV30Ind = (short)(1) ;
      while ( AV30Ind <= AV9DadosFotoPessoa.getgxTv_SdtsdtFotoPessoa_Foto().size() )
      {
         AV18NomeArquivo = java.util.UUID.randomUUID( ).toString() ;
         AV19pes_id = AV9DadosFotoPessoa.getgxTv_SdtsdtFotoPessoa_Pes_id() ;
         AV10foto_pessoa = (Sdtfoto_pessoa)new Sdtfoto_pessoa( remoteHandle, context);
         AV10foto_pessoa.setgxTv_Sdtfoto_pessoa_Pes_id( AV19pes_id );
         AV10foto_pessoa.setgxTv_Sdtfoto_pessoa_Fp_hash( AV18NomeArquivo );
         AV10foto_pessoa.setgxTv_Sdtfoto_pessoa_Fp_bucket( "seletivo" );
         if ( AV10foto_pessoa.Insert() )
         {
            Application.commitDataStores(context, remoteHandle, pr_default, "pcriarfotopessoa");
            /* Execute user subroutine: 'GRAVAIMAGEMDISCO' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
            Application.rollbackDataStores(context, remoteHandle, pr_default, "pcriarfotopessoa");
         }
         AV8Messages = AV10foto_pessoa.GetMessages() ;
         ((com.genexus.SdtMessages_Message)AV8Messages.elementAt(-1+1)).setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV10foto_pessoa.getgxTv_Sdtfoto_pessoa_Fp_id(), 4, 0))+": "+AV25URL );
         AV30Ind = (short)(AV30Ind+1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'GRAVAIMAGEMDISCO' Routine */
      returnInSub = false ;
      if ( GXutil.len( ((SdtsdtFoto)AV9DadosFotoPessoa.getgxTv_SdtsdtFotoPessoa_Foto().elementAt(-1+AV30Ind)).getgxTv_SdtsdtFoto_Arquivobase64()) > 0 )
      {
         /* User Code */
          AV12Barra = System.getProperty("file.separator");
         /* User Code */
          AV13ApplicationDataPath = httpContext.getDefaultPath();
         AV17Arquivo = AV13ApplicationDataPath + AV12Barra + "swapFiles" + AV12Barra + AV18NomeArquivo + AV28ExtensaoArquivo ;
         AV14File.setSource( AV17Arquivo );
         if ( ! AV14File.exists() )
         {
            AV14File.create();
         }
         AV14File.fromBase64(((SdtsdtFoto)AV9DadosFotoPessoa.getgxTv_SdtsdtFotoPessoa_Foto().elementAt(-1+AV30Ind)).getgxTv_SdtsdtFoto_Arquivobase64());
         AV14File.close();
         /* Execute user subroutine: 'GRAVAIMAGEMSTORAGE' */
         S121 ();
         if (returnInSub) return;
      }
   }

   public void S121( )
   {
      /* 'GRAVAIMAGEMSTORAGE' Routine */
      returnInSub = false ;
      GXt_properties1 = AV20Properties ;
      GXv_properties2[0] = GXt_properties1 ;
      new ppropriedadesstorages3(remoteHandle, context).execute( GXv_properties2) ;
      GXt_properties1 = GXv_properties2[0] ;
      AV20Properties = GXt_properties1 ;
      GXv_storageprovider3[0] = AV22StorageProvider ;
      GXv_objcol_SdtMessages_Message4[0] = AV8Messages ;
      if ( AV26ExternalStorage.connect("Default", AV20Properties, GXv_storageprovider3, GXv_objcol_SdtMessages_Message4) )
      {
         AV22StorageProvider = GXv_storageprovider3[0] ;
         AV8Messages = GXv_objcol_SdtMessages_Message4[0] ;
         httpContext.GX_msglist.addItem("Sucesso");
         AV22StorageProvider = (com.genexus.util.GXStorageProvider)new com.genexus.util.GXStorageProvider();
         AV27FileFullPath = AV14File.getAbsoluteName() ;
         if ( AV22StorageProvider.uploadPrivate(AV27FileFullPath, AV18NomeArquivo, AV24OutUploadedFile, AV8Messages) )
         {
            httpContext.GX_msglist.addItem("Sucesso Upload");
            AV25URL = AV24OutUploadedFile.getURI() ;
         }
         else
         {
            AV33GXV1 = 1 ;
            while ( AV33GXV1 <= AV8Messages.size() )
            {
               AV21Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV8Messages.elementAt(-1+AV33GXV1));
               System.out.println( AV21Message.getgxTv_SdtMessages_Message_Description() );
               AV33GXV1 = (int)(AV33GXV1+1) ;
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
      this.aP1[0] = pcriarfotopessoa.this.AV8Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV29TipoArquivo = "" ;
      AV28ExtensaoArquivo = "" ;
      AV21Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV18NomeArquivo = "" ;
      AV10foto_pessoa = new Sdtfoto_pessoa(remoteHandle);
      AV25URL = "" ;
      AV12Barra = "" ;
      AV13ApplicationDataPath = "" ;
      AV17Arquivo = "" ;
      AV14File = new com.genexus.util.GXFile();
      AV20Properties = new com.genexus.util.GXProperties();
      GXt_properties1 = new com.genexus.util.GXProperties();
      GXv_properties2 = new com.genexus.util.GXProperties[1] ;
      AV22StorageProvider = new com.genexus.util.GXStorageProvider();
      GXv_storageprovider3 = new com.genexus.util.GXStorageProvider[1] ;
      GXv_objcol_SdtMessages_Message4 = new GXBaseCollection[1] ;
      AV26ExternalStorage = new com.genexuscore.genexus.common.configuration.SdtExternalStorage(remoteHandle, context);
      AV27FileFullPath = "" ;
      AV24OutUploadedFile = new com.genexus.util.GXFile();
      pr_default = new DataStoreProvider(context, remoteHandle, new pcriarfotopessoa__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV30Ind ;
   private short AV19pes_id ;
   private short Gx_err ;
   private int AV33GXV1 ;
   private boolean returnInSub ;
   private String AV29TipoArquivo ;
   private String AV28ExtensaoArquivo ;
   private String AV18NomeArquivo ;
   private String AV25URL ;
   private String AV12Barra ;
   private String AV13ApplicationDataPath ;
   private String AV17Arquivo ;
   private String AV27FileFullPath ;
   private com.genexus.util.GXStorageProvider GXv_storageprovider3[] ;
   private com.genexus.util.GXFile AV14File ;
   private com.genexus.SdtMessages_Message AV21Message ;
   private com.genexuscore.genexus.common.configuration.SdtExternalStorage AV26ExternalStorage ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private com.genexus.util.GXStorageProvider AV22StorageProvider ;
   private com.genexus.util.GXFile AV24OutUploadedFile ;
   private com.genexus.util.GXProperties AV20Properties ;
   private com.genexus.util.GXProperties GXt_properties1 ;
   private com.genexus.util.GXProperties GXv_properties2[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message4[] ;
   private SdtsdtFotoPessoa AV9DadosFotoPessoa ;
   private Sdtfoto_pessoa AV10foto_pessoa ;
}

final  class pcriarfotopessoa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

