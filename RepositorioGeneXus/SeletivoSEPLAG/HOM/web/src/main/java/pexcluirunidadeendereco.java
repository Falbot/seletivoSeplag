import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexcluirunidadeendereco extends GXProcedure
{
   public pexcluirunidadeendereco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexcluirunidadeendereco.class ), "" );
   }

   public pexcluirunidadeendereco( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( short aP0 ,
                                                                        short aP1 )
   {
      pexcluirunidadeendereco.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( short aP0 ,
                        short aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( short aP0 ,
                             short aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      pexcluirunidadeendereco.this.AV10uni_id = aP0;
      pexcluirunidadeendereco.this.AV9end_id = aP1;
      pexcluirunidadeendereco.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV8unidade_endereco.Load(AV10uni_id, AV9end_id);
      AV8unidade_endereco.Delete();
      if ( AV8unidade_endereco.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pexcluirunidadeendereco");
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pexcluirunidadeendereco");
      }
      AV11Messages = AV8unidade_endereco.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pexcluirunidadeendereco.this.AV11Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV8unidade_endereco = new Sdtunidade_endereco(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new pexcluirunidadeendereco__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private short AV10uni_id ;
   private short AV9end_id ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV11Messages ;
   private Sdtunidade_endereco AV8unidade_endereco ;
}

final  class pexcluirunidadeendereco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

