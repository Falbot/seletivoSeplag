import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexcluirunidade extends GXProcedure
{
   public pexcluirunidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexcluirunidade.class ), "" );
   }

   public pexcluirunidade( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( short aP0 )
   {
      pexcluirunidade.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
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
      pexcluirunidade.this.AV10unid_id = aP0;
      pexcluirunidade.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV11unidade.Load(AV10unid_id);
      AV11unidade.Delete();
      if ( AV11unidade.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pexcluirunidade");
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pexcluirunidade");
      }
      AV8Messages = AV11unidade.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pexcluirunidade.this.AV8Messages;
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
      AV11unidade = new Sdtunidade(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new pexcluirunidade__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private short AV10unid_id ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private Sdtunidade AV11unidade ;
}

final  class pexcluirunidade__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

