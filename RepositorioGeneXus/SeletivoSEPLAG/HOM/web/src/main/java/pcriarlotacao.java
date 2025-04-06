import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcriarlotacao extends GXProcedure
{
   public pcriarlotacao( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcriarlotacao.class ), "" );
   }

   public pcriarlotacao( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( SdtsdtLotacaoV2 aP0 )
   {
      pcriarlotacao.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( SdtsdtLotacaoV2 aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( SdtsdtLotacaoV2 aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      pcriarlotacao.this.AV10DadosLotacao = aP0;
      pcriarlotacao.this.AV9Messages = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV8lotacao.setgxTv_Sdtlotacao_Pes_id( AV10DadosLotacao.getgxTv_SdtsdtLotacaoV2_Pes_id() );
      AV8lotacao.setgxTv_Sdtlotacao_Unid_id( AV10DadosLotacao.getgxTv_SdtsdtLotacaoV2_Unid_id() );
      AV8lotacao.setgxTv_Sdtlotacao_Lot_data_lotacao( localUtil.ctod( AV10DadosLotacao.getgxTv_SdtsdtLotacaoV2_Lot_data_lotacao(), 3) );
      AV8lotacao.setgxTv_Sdtlotacao_Lot_data_remocao( localUtil.ctod( AV10DadosLotacao.getgxTv_SdtsdtLotacaoV2_Lot_data_remocao(), 3) );
      AV8lotacao.setgxTv_Sdtlotacao_Lot_portaria( AV10DadosLotacao.getgxTv_SdtsdtLotacaoV2_Lot_portaria() );
      AV8lotacao.Save();
      if ( AV8lotacao.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pcriarlotacao");
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pcriarlotacao");
      }
      AV9Messages = AV8lotacao.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pcriarlotacao.this.AV9Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8lotacao = new Sdtlotacao(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new pcriarlotacao__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private Sdtlotacao AV8lotacao ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private SdtsdtLotacaoV2 AV10DadosLotacao ;
}

final  class pcriarlotacao__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

