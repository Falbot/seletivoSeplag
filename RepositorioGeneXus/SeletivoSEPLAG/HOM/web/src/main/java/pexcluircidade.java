import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexcluircidade extends GXProcedure
{
   public pexcluircidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexcluircidade.class ), "" );
   }

   public pexcluircidade( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( short aP0 )
   {
      pexcluircidade.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
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
      pexcluircidade.this.AV10cid_id = aP0;
      pexcluircidade.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV11cidade.Load(AV10cid_id);
      AV11cidade.Delete();
      if ( AV11cidade.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pexcluircidade");
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pexcluircidade");
      }
      AV8Messages = AV11cidade.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pexcluircidade.this.AV8Messages;
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
      AV11cidade = new Sdtcidade(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new pexcluircidade__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private short AV10cid_id ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private Sdtcidade AV11cidade ;
}

final  class pexcluircidade__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

