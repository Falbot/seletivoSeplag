import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class patualizarfotopessoa extends GXProcedure
{
   public patualizarfotopessoa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( patualizarfotopessoa.class ), "" );
   }

   public patualizarfotopessoa( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( SdtsdtAtualizarFotoPessoa[] aP0 )
   {
      patualizarfotopessoa.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( SdtsdtAtualizarFotoPessoa[] aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( SdtsdtAtualizarFotoPessoa[] aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      patualizarfotopessoa.this.AV8ListaFotoPessoa = aP0[0];
      this.aP0 = aP0;
      patualizarfotopessoa.this.AV10Messages = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV13pes_id = AV8ListaFotoPessoa.getgxTv_SdtsdtAtualizarFotoPessoa_Pes_id() ;
      AV42GXLvl2 = (byte)(0) ;
      /* Using cursor P001B2 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV13pes_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7pes_id = P001B2_A7pes_id[0] ;
         A18fp_id = P001B2_A18fp_id[0] ;
         AV42GXLvl2 = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV42GXLvl2 == 0 )
      {
         AV14Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV14Message.setgxTv_SdtMessages_Message_Description( "Pessoa (pes_id="+GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV13pes_id), "ZZZ9"))+") não possui foto." );
         AV10Messages.add(AV14Message, 0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV8ListaFotoPessoa.getgxTv_SdtsdtAtualizarFotoPessoa_Foto().size() > 0 )
      {
         AV15Ind = (short)(1) ;
         while ( AV15Ind <= AV8ListaFotoPessoa.getgxTv_SdtsdtAtualizarFotoPessoa_Foto().size() )
         {
            AV16fp_id = ((SdtsdtAtualizarFotoPessoa_Item)AV8ListaFotoPessoa.getgxTv_SdtsdtAtualizarFotoPessoa_Foto().elementAt(-1+AV15Ind)).getgxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id() ;
            AV43GXLvl14 = (byte)(0) ;
            /* Using cursor P001B3 */
            pr_default.execute(1, new Object[] {Short.valueOf(AV16fp_id), Short.valueOf(AV13pes_id)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A7pes_id = P001B3_A7pes_id[0] ;
               A18fp_id = P001B3_A18fp_id[0] ;
               AV43GXLvl14 = (byte)(1) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            if ( AV43GXLvl14 == 0 )
            {
               AV14Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
               AV14Message.setgxTv_SdtMessages_Message_Description( "Foto (fp_id="+GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV16fp_id), "ZZZ9"))+") não encontrada." );
               AV10Messages.add(AV14Message, 0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV15Ind = (short)(AV15Ind+1) ;
         }
      }
      else
      {
         AV14Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV14Message.setgxTv_SdtMessages_Message_Description( "Nenhuma foto foi enviada para atualização." );
         AV10Messages.add(AV14Message, 0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV15Ind = (short)(1) ;
      while ( AV15Ind <= AV8ListaFotoPessoa.getgxTv_SdtsdtAtualizarFotoPessoa_Foto().size() )
      {
         AV19TipoArquivo = GXutil.substring( ((SdtsdtAtualizarFotoPessoa_Item)AV8ListaFotoPessoa.getgxTv_SdtsdtAtualizarFotoPessoa_Foto().elementAt(-1+AV15Ind)).getgxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto(), 1, 20) ;
         if ( GXutil.strcmp(GXutil.substring( AV19TipoArquivo, 1, 4), "/9j/") == 0 )
         {
            AV20ExtensaoArquivo = ".jpg" ;
         }
         else
         {
            if ( GXutil.strcmp(GXutil.substring( AV19TipoArquivo, 1, 5), "iVBOR") == 0 )
            {
               AV20ExtensaoArquivo = ".png" ;
            }
            else
            {
               if ( GXutil.strcmp(GXutil.substring( AV19TipoArquivo, 1, 5), "R0lGO") == 0 )
               {
                  AV20ExtensaoArquivo = ".gif" ;
               }
               else
               {
                  AV14Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                  AV14Message.setgxTv_SdtMessages_Message_Description( "O arquivo enviado não contém uma imagem." );
                  AV10Messages.add(AV14Message, 0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         AV15Ind = (short)(AV15Ind+1) ;
      }
      AV15Ind = (short)(1) ;
      while ( AV15Ind <= AV8ListaFotoPessoa.getgxTv_SdtsdtAtualizarFotoPessoa_Foto().size() )
      {
         AV16fp_id = ((SdtsdtAtualizarFotoPessoa_Item)AV8ListaFotoPessoa.getgxTv_SdtsdtAtualizarFotoPessoa_Foto().elementAt(-1+AV15Ind)).getgxTv_SdtsdtAtualizarFotoPessoa_Item_Fp_id() ;
         AV11foto_pessoa.Load(AV16fp_id);
         AV27NomeArquivo = AV11foto_pessoa.getgxTv_Sdtfoto_pessoa_Fp_bucket() ;
         /* Execute user subroutine: 'EXCLUIRARQUIVOBUCKET' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV19TipoArquivo = GXutil.substring( ((SdtsdtAtualizarFotoPessoa_Item)AV8ListaFotoPessoa.getgxTv_SdtsdtAtualizarFotoPessoa_Foto().elementAt(-1+AV15Ind)).getgxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto(), 1, 20) ;
         if ( GXutil.strcmp(GXutil.substring( AV19TipoArquivo, 1, 4), "/9j/") == 0 )
         {
            AV20ExtensaoArquivo = ".jpg" ;
         }
         else
         {
            if ( GXutil.strcmp(GXutil.substring( AV19TipoArquivo, 1, 5), "iVBOR") == 0 )
            {
               AV20ExtensaoArquivo = ".png" ;
            }
            else
            {
               if ( GXutil.strcmp(GXutil.substring( AV19TipoArquivo, 1, 5), "R0lGO") == 0 )
               {
                  AV20ExtensaoArquivo = ".gif" ;
               }
               else
               {
                  AV14Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                  AV14Message.setgxTv_SdtMessages_Message_Description( "O arquivo enviado não contém uma imagem." );
                  AV10Messages.add(AV14Message, 0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         AV27NomeArquivo = java.util.UUID.randomUUID( ).toString() ;
         AV11foto_pessoa.setgxTv_Sdtfoto_pessoa_Fp_hash( AV27NomeArquivo );
         AV11foto_pessoa.setgxTv_Sdtfoto_pessoa_Fp_bucket( AV27NomeArquivo+AV20ExtensaoArquivo );
         AV11foto_pessoa.Update();
         if ( AV11foto_pessoa.Success() )
         {
            Application.commitDataStores(context, remoteHandle, pr_default, "patualizarfotopessoa");
            AV27NomeArquivo += AV20ExtensaoArquivo ;
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
            Application.rollbackDataStores(context, remoteHandle, pr_default, "patualizarfotopessoa");
         }
         AV15Ind = (short)(AV15Ind+1) ;
      }
      AV14Message.setgxTv_SdtMessages_Message_Description( "Atualização de imagem(ns) realizada com sucesso!" );
      AV10Messages.add(AV14Message, 0);
      cleanup();
   }

   public void S111( )
   {
      /* 'GRAVAIMAGEMDISCO' Routine */
      returnInSub = false ;
      /* User Code */
       AV39Barra = System.getProperty("file.separator");
      /* User Code */
       AV40ApplicationDataPath = httpContext.getDefaultPath();
      AV41Arquivo = AV40ApplicationDataPath + AV39Barra + "swapFiles" + AV39Barra + AV27NomeArquivo ;
      AV36FileNew.setSource( AV41Arquivo );
      if ( ! AV36FileNew.exists() )
      {
         AV36FileNew.create();
      }
      AV36FileNew.fromBase64(((SdtsdtAtualizarFotoPessoa_Item)AV8ListaFotoPessoa.getgxTv_SdtsdtAtualizarFotoPessoa_Foto().elementAt(-1+AV15Ind)).getgxTv_SdtsdtAtualizarFotoPessoa_Item_Arquivobase64novafoto());
      AV36FileNew.close();
      /* Execute user subroutine: 'GRAVAIMAGEMSTORAGE' */
      S121 ();
      if (returnInSub) return;
   }

   public void S121( )
   {
      /* 'GRAVAIMAGEMSTORAGE' Routine */
      returnInSub = false ;
      GXt_properties1 = AV23Properties ;
      GXv_properties2[0] = GXt_properties1 ;
      new ppropriedadesstorages3(remoteHandle, context).execute( GXv_properties2) ;
      GXt_properties1 = GXv_properties2[0] ;
      AV23Properties = GXt_properties1 ;
      GXv_storageprovider3[0] = AV25StorageProvider ;
      GXv_objcol_SdtMessages_Message4[0] = AV10Messages ;
      if ( AV24ExternalStorage.connect("AMAZONS3", AV23Properties, GXv_storageprovider3, GXv_objcol_SdtMessages_Message4) )
      {
         AV25StorageProvider = (com.genexus.util.GXStorageProvider)GXv_storageprovider3[0];
         AV10Messages = GXv_objcol_SdtMessages_Message4[0] ;
         AV25StorageProvider = (com.genexus.util.GXStorageProvider)new com.genexus.util.GXStorageProvider();
         AV28FileFullPath = AV36FileNew.getAbsoluteName() ;
         if ( AV25StorageProvider.uploadPrivate(AV28FileFullPath, AV27NomeArquivo, AV37OutUploadedFile, AV10Messages) )
         {
         }
         else
         {
         }
      }
      else
      {
         AV44GXV1 = 1 ;
         while ( AV44GXV1 <= AV10Messages.size() )
         {
            AV14Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV10Messages.elementAt(-1+AV44GXV1));
            AV44GXV1 = (int)(AV44GXV1+1) ;
         }
      }
   }

   public void S131( )
   {
      /* 'EXCLUIRARQUIVOBUCKET' Routine */
      returnInSub = false ;
      GXt_properties1 = AV23Properties ;
      GXv_properties2[0] = GXt_properties1 ;
      new ppropriedadesstorages3(remoteHandle, context).execute( GXv_properties2) ;
      GXt_properties1 = GXv_properties2[0] ;
      AV23Properties = GXt_properties1 ;
      GXv_storageprovider3[0] = AV25StorageProvider ;
      GXv_objcol_SdtMessages_Message4[0] = AV10Messages ;
      if ( AV24ExternalStorage.connect("AMAZONS3", AV23Properties, GXv_storageprovider3, GXv_objcol_SdtMessages_Message4) )
      {
         AV25StorageProvider = (com.genexus.util.GXStorageProvider)GXv_storageprovider3[0];
         AV10Messages = GXv_objcol_SdtMessages_Message4[0] ;
         AV28FileFullPath = AV27NomeArquivo ;
         if ( AV25StorageProvider.getPrivate(AV28FileFullPath, AV30File, (short)(1), new GXBaseCollection<com.genexus.SdtMessages_Message>()) )
         {
            AV30File.delete();
         }
         else
         {
         }
      }
      else
      {
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = patualizarfotopessoa.this.AV8ListaFotoPessoa;
      this.aP1[0] = patualizarfotopessoa.this.AV10Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      P001B2_A7pes_id = new short[1] ;
      P001B2_A18fp_id = new short[1] ;
      AV14Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      P001B3_A7pes_id = new short[1] ;
      P001B3_A18fp_id = new short[1] ;
      AV19TipoArquivo = "" ;
      AV20ExtensaoArquivo = "" ;
      AV11foto_pessoa = new Sdtfoto_pessoa(remoteHandle);
      AV27NomeArquivo = "" ;
      AV39Barra = "" ;
      AV40ApplicationDataPath = "" ;
      AV41Arquivo = "" ;
      AV36FileNew = new com.genexus.util.GXFile();
      AV23Properties = new com.genexus.util.GXProperties();
      AV25StorageProvider = new com.genexus.util.GXStorageProvider();
      AV24ExternalStorage = new com.genexuscore.genexus.common.configuration.SdtExternalStorage(remoteHandle, context);
      AV28FileFullPath = "" ;
      AV37OutUploadedFile = new com.genexus.util.GXFile();
      GXt_properties1 = new com.genexus.util.GXProperties();
      GXv_properties2 = new com.genexus.util.GXProperties[1] ;
      GXv_storageprovider3 = new com.genexus.util.GXStorageProvider[1] ;
      AV30File = new com.genexus.util.GXFile();
      pr_default = new DataStoreProvider(context, remoteHandle, new patualizarfotopessoa__default(),
         new Object[] {
             new Object[] {
            P001B2_A7pes_id, P001B2_A18fp_id
            }
            , new Object[] {
            P001B3_A7pes_id, P001B3_A18fp_id
            }
         }
      );
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message4 = new GXBaseCollection[1] ;
   }

   private byte AV42GXLvl2 ;
   private byte AV43GXLvl14 ;
   private short AV13pes_id ;
   private short A7pes_id ;
   private short A18fp_id ;
   private short AV15Ind ;
   private short AV16fp_id ;
   private int AV44GXV1 ;
   private boolean returnInSub ;
   private String AV19TipoArquivo ;
   private String AV20ExtensaoArquivo ;
   private String AV27NomeArquivo ;
   private String AV39Barra ;
   private String AV40ApplicationDataPath ;
   private String AV41Arquivo ;
   private String AV28FileFullPath ;
   private com.genexus.util.GXStorageProvider GXv_storageprovider3[] ;
   private com.genexus.util.GXFile AV36FileNew ;
   private com.genexus.SdtMessages_Message AV14Message ;
   private com.genexuscore.genexus.common.configuration.SdtExternalStorage AV24ExternalStorage ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private SdtsdtAtualizarFotoPessoa[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P001B2_A7pes_id ;
   private short[] P001B2_A18fp_id ;
   private short[] P001B3_A7pes_id ;
   private short[] P001B3_A18fp_id ;
   private com.genexus.util.GXStorageProvider AV25StorageProvider ;
   private com.genexus.util.GXFile AV37OutUploadedFile ;
   private com.genexus.util.GXFile AV30File ;
   private com.genexus.util.GXProperties AV23Properties ;
   private com.genexus.util.GXProperties GXt_properties1 ;
   private com.genexus.util.GXProperties GXv_properties2[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message4[] ;
   private SdtsdtAtualizarFotoPessoa AV8ListaFotoPessoa ;
   private Sdtfoto_pessoa AV11foto_pessoa ;
}

final  class patualizarfotopessoa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001B2", "SELECT pes_id, fp_id FROM foto_pessoa WHERE pes_id = ? ORDER BY pes_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P001B3", "SELECT pes_id, fp_id FROM foto_pessoa WHERE (fp_id = ?) AND (pes_id = ?) ORDER BY fp_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

