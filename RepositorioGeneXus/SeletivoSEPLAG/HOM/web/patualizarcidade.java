import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class patualizarcidade extends GXProcedure
{
   public patualizarcidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( patualizarcidade.class ), "" );
   }

   public patualizarcidade( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( SdtsdtListaCidade aP0 )
   {
      patualizarcidade.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( SdtsdtListaCidade aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( SdtsdtListaCidade aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      patualizarcidade.this.AV9ListaCidade = aP0;
      patualizarcidade.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10cidade.Load(AV9ListaCidade.getgxTv_SdtsdtListaCidade_Cid_id());
      AV10cidade.setgxTv_Sdtcidade_Cid_nome( ((GXutil.strcmp(AV9ListaCidade.getgxTv_SdtsdtListaCidade_Cid_nome(), "")!=0) ? AV9ListaCidade.getgxTv_SdtsdtListaCidade_Cid_nome() : AV10cidade.getgxTv_Sdtcidade_Cid_nome()) );
      AV10cidade.setgxTv_Sdtcidade_Cid_uf( ((GXutil.strcmp(AV9ListaCidade.getgxTv_SdtsdtListaCidade_Cid_uf(), "")!=0) ? AV9ListaCidade.getgxTv_SdtsdtListaCidade_Cid_uf() : AV10cidade.getgxTv_Sdtcidade_Cid_uf()) );
      if ( AV10cidade.Update() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "patualizarcidade");
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "patualizarcidade");
      }
      AV8Messages = AV10cidade.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = patualizarcidade.this.AV8Messages;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new patualizarcidade__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private SdtsdtListaCidade AV9ListaCidade ;
   private Sdtcidade AV10cidade ;
}

final  class patualizarcidade__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

