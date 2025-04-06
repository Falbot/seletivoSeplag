import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcriarpessoaendereco extends GXProcedure
{
   public pcriarpessoaendereco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcriarpessoaendereco.class ), "" );
   }

   public pcriarpessoaendereco( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( SdtsdtPessoaEndereco aP0 )
   {
      pcriarpessoaendereco.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( SdtsdtPessoaEndereco aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( SdtsdtPessoaEndereco aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      pcriarpessoaendereco.this.AV9DadosPessoaEndereco = aP0;
      pcriarpessoaendereco.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV8pessoa_endereco.setgxTv_Sdtpessoa_endereco_Pes_id( AV9DadosPessoaEndereco.getgxTv_SdtsdtPessoaEndereco_Pes_id() );
      AV8pessoa_endereco.setgxTv_Sdtpessoa_endereco_End_id( AV9DadosPessoaEndereco.getgxTv_SdtsdtPessoaEndereco_End_id() );
      AV8pessoa_endereco.Save();
      if ( AV8pessoa_endereco.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pcriarpessoaendereco");
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pcriarpessoaendereco");
      }
      AV10Messages = AV8pessoa_endereco.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pcriarpessoaendereco.this.AV10Messages;
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
      AV8pessoa_endereco = new Sdtpessoa_endereco(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new pcriarpessoaendereco__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private Sdtpessoa_endereco AV8pessoa_endereco ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private SdtsdtPessoaEndereco AV9DadosPessoaEndereco ;
}

final  class pcriarpessoaendereco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

