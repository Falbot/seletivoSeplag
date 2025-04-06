import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcriarcidade extends GXProcedure
{
   public pcriarcidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcriarcidade.class ), "" );
   }

   public pcriarcidade( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( SdtsdtCidade aP0 )
   {
      pcriarcidade.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( SdtsdtCidade aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( SdtsdtCidade aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      pcriarcidade.this.AV9DadosCidade = aP0;
      pcriarcidade.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV10cidade.setgxTv_Sdtcidade_Cid_nome( AV9DadosCidade.getgxTv_SdtsdtCidade_Cid_nome() );
      AV10cidade.setgxTv_Sdtcidade_Cid_uf( AV9DadosCidade.getgxTv_SdtsdtCidade_Cid_uf() );
      AV10cidade.Save();
      if ( AV10cidade.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pcriarcidade");
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pcriarcidade");
      }
      AV8Messages = AV10cidade.GetMessages() ;
      ((com.genexus.SdtMessages_Message)AV8Messages.elementAt(-1+1)).setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV10cidade.getgxTv_Sdtcidade_Cid_id(), 4, 0)) );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pcriarcidade.this.AV8Messages;
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
      AV10cidade = new Sdtcidade(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new pcriarcidade__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private Sdtcidade AV10cidade ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private SdtsdtCidade AV9DadosCidade ;
}

final  class pcriarcidade__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

