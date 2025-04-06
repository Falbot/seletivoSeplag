import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class patualizarlotacao extends GXProcedure
{
   public patualizarlotacao( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( patualizarlotacao.class ), "" );
   }

   public patualizarlotacao( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( short aP0 ,
                                                                        SdtsdtLotacao aP1 )
   {
      patualizarlotacao.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( short aP0 ,
                        SdtsdtLotacao aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( short aP0 ,
                             SdtsdtLotacao aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      patualizarlotacao.this.AV8lot_id = aP0;
      patualizarlotacao.this.AV9InfoLotacao = aP1;
      patualizarlotacao.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11lotacao.Load(AV8lot_id);
      AV11lotacao.setgxTv_Sdtlotacao_Lot_data_lotacao( ((GXutil.strcmp(AV9InfoLotacao.getgxTv_SdtsdtLotacao_Lot_data_lotacao(), "")!=0) ? localUtil.ctod( AV9InfoLotacao.getgxTv_SdtsdtLotacao_Lot_data_lotacao(), 3) : AV11lotacao.getgxTv_Sdtlotacao_Lot_data_lotacao()) );
      AV11lotacao.setgxTv_Sdtlotacao_Lot_data_remocao( ((GXutil.strcmp(AV9InfoLotacao.getgxTv_SdtsdtLotacao_Lot_data_remocao(), "")!=0) ? localUtil.ctod( AV9InfoLotacao.getgxTv_SdtsdtLotacao_Lot_data_remocao(), 3) : AV11lotacao.getgxTv_Sdtlotacao_Lot_data_remocao()) );
      AV11lotacao.setgxTv_Sdtlotacao_Lot_portaria( ((GXutil.strcmp(AV9InfoLotacao.getgxTv_SdtsdtLotacao_Lot_portaria(), "")!=0) ? AV9InfoLotacao.getgxTv_SdtsdtLotacao_Lot_portaria() : AV11lotacao.getgxTv_Sdtlotacao_Lot_portaria()) );
      if ( AV11lotacao.Update() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "patualizarlotacao");
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "patualizarlotacao");
      }
      AV10Messages = AV11lotacao.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = patualizarlotacao.this.AV10Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV11lotacao = new Sdtlotacao(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new patualizarlotacao__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8lot_id ;
   private short Gx_err ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private SdtsdtLotacao AV9InfoLotacao ;
   private Sdtlotacao AV11lotacao ;
}

final  class patualizarlotacao__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

