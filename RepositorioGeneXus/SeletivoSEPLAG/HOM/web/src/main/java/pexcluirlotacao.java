import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexcluirlotacao extends GXProcedure
{
   public pexcluirlotacao( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexcluirlotacao.class ), "" );
   }

   public pexcluirlotacao( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( short aP0 )
   {
      pexcluirlotacao.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( short aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( short aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      pexcluirlotacao.this.AV8lot_id = aP0;
      pexcluirlotacao.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV10lotacao.Load(AV8lot_id);
      AV10lotacao.Delete();
      if ( AV10lotacao.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pexcluirlotacao");
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pexcluirlotacao");
      }
      AV9Messages = AV10lotacao.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pexcluirlotacao.this.AV9Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV10lotacao = new Sdtlotacao(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new pexcluirlotacao__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private short AV8lot_id ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private Sdtlotacao AV10lotacao ;
}

final  class pexcluirlotacao__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

