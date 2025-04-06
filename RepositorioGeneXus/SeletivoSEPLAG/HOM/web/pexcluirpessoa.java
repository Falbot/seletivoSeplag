import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexcluirpessoa extends GXProcedure
{
   public pexcluirpessoa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexcluirpessoa.class ), "" );
   }

   public pexcluirpessoa( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( short[] aP0 )
   {
      pexcluirpessoa.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( short[] aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( short[] aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      pexcluirpessoa.this.AV8pes_id = aP0[0];
      this.aP0 = aP0;
      pexcluirpessoa.this.AV9Messages = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10pessoa.Load(AV8pes_id);
      AV10pessoa.Delete();
      if ( AV10pessoa.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pexcluirpessoa");
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pexcluirpessoa");
      }
      AV9Messages = AV10pessoa.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexcluirpessoa.this.AV8pes_id;
      this.aP1[0] = pexcluirpessoa.this.AV9Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10pessoa = new Sdtpessoa(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new pexcluirpessoa__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8pes_id ;
   private short Gx_err ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private short[] aP0 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private Sdtpessoa AV10pessoa ;
}

final  class pexcluirpessoa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

