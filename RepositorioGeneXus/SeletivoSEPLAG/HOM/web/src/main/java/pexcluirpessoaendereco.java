import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexcluirpessoaendereco extends GXProcedure
{
   public pexcluirpessoaendereco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexcluirpessoaendereco.class ), "" );
   }

   public pexcluirpessoaendereco( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( short aP0 ,
                                                                        short aP1 )
   {
      pexcluirpessoaendereco.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
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
      pexcluirpessoaendereco.this.AV9pes_id = aP0;
      pexcluirpessoaendereco.this.AV10end_id = aP1;
      pexcluirpessoaendereco.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV12pessoa_endereco.Load(AV9pes_id, AV10end_id);
      AV12pessoa_endereco.Delete();
      if ( AV12pessoa_endereco.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pexcluirpessoaendereco");
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pexcluirpessoaendereco");
      }
      AV11Messages = AV12pessoa_endereco.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pexcluirpessoaendereco.this.AV11Messages;
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
      AV12pessoa_endereco = new Sdtpessoa_endereco(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new pexcluirpessoaendereco__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private short AV9pes_id ;
   private short AV10end_id ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV11Messages ;
   private Sdtpessoa_endereco AV12pessoa_endereco ;
}

final  class pexcluirpessoaendereco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

