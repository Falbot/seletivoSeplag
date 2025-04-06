import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class patualizarendereco extends GXProcedure
{
   public patualizarendereco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( patualizarendereco.class ), "" );
   }

   public patualizarendereco( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( SdtsdtListaEndereco aP0 )
   {
      patualizarendereco.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( SdtsdtListaEndereco aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( SdtsdtListaEndereco aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      patualizarendereco.this.AV8ListaEndereco = aP0;
      patualizarendereco.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10endereco.Load(AV8ListaEndereco.getgxTv_SdtsdtListaEndereco_End_id());
      AV10endereco.setgxTv_Sdtendereco_End_tipo_logradouro( ((GXutil.strcmp(AV8ListaEndereco.getgxTv_SdtsdtListaEndereco_End_tipo_logradouro(), "")!=0) ? AV8ListaEndereco.getgxTv_SdtsdtListaEndereco_End_tipo_logradouro() : AV10endereco.getgxTv_Sdtendereco_End_tipo_logradouro()) );
      AV10endereco.setgxTv_Sdtendereco_End_logradouro( ((GXutil.strcmp(AV8ListaEndereco.getgxTv_SdtsdtListaEndereco_End_logradouro(), "")!=0) ? AV8ListaEndereco.getgxTv_SdtsdtListaEndereco_End_logradouro() : AV10endereco.getgxTv_Sdtendereco_End_logradouro()) );
      AV10endereco.setgxTv_Sdtendereco_End_numero( ((AV8ListaEndereco.getgxTv_SdtsdtListaEndereco_End_numero()!=0) ? AV8ListaEndereco.getgxTv_SdtsdtListaEndereco_End_numero() : AV10endereco.getgxTv_Sdtendereco_End_numero()) );
      AV10endereco.setgxTv_Sdtendereco_End_bairro( ((GXutil.strcmp(AV8ListaEndereco.getgxTv_SdtsdtListaEndereco_End_bairro(), "")!=0) ? AV8ListaEndereco.getgxTv_SdtsdtListaEndereco_End_bairro() : AV10endereco.getgxTv_Sdtendereco_End_bairro()) );
      AV10endereco.setgxTv_Sdtendereco_Cid_id( ((AV8ListaEndereco.getgxTv_SdtsdtListaEndereco_Cid_id()!=0) ? AV8ListaEndereco.getgxTv_SdtsdtListaEndereco_Cid_id() : AV10endereco.getgxTv_Sdtendereco_Cid_id()) );
      if ( AV10endereco.Update() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "patualizarendereco");
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "patualizarendereco");
      }
      AV9Messages = AV10endereco.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = patualizarendereco.this.AV9Messages;
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
      AV10endereco = new Sdtendereco(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new patualizarendereco__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private SdtsdtListaEndereco AV8ListaEndereco ;
   private Sdtendereco AV10endereco ;
}

final  class patualizarendereco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

