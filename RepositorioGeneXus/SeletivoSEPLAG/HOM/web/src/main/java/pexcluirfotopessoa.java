import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexcluirfotopessoa extends GXProcedure
{
   public pexcluirfotopessoa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexcluirfotopessoa.class ), "" );
   }

   public pexcluirfotopessoa( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( short aP0 )
   {
      pexcluirfotopessoa.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
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
      pexcluirfotopessoa.this.AV11fp_id = aP0;
      pexcluirfotopessoa.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV13foto_pessoa.Load(AV11fp_id);
      AV13foto_pessoa.Delete();
      if ( AV13foto_pessoa.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pexcluirfotopessoa");
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pexcluirfotopessoa");
      }
      AV10Messages = AV13foto_pessoa.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pexcluirfotopessoa.this.AV10Messages;
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
      AV13foto_pessoa = new Sdtfoto_pessoa(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new pexcluirfotopessoa__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private short AV11fp_id ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private Sdtfoto_pessoa AV13foto_pessoa ;
}

final  class pexcluirfotopessoa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

