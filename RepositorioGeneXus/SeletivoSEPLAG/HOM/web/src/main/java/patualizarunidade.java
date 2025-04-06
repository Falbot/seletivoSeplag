import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class patualizarunidade extends GXProcedure
{
   public patualizarunidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( patualizarunidade.class ), "" );
   }

   public patualizarunidade( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( SdtsdtListaUnidade aP0 )
   {
      patualizarunidade.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( SdtsdtListaUnidade aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( SdtsdtListaUnidade aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      patualizarunidade.this.AV9ListaUnidade = aP0;
      patualizarunidade.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV10unidade.Load(AV9ListaUnidade.getgxTv_SdtsdtListaUnidade_Unid_id());
      AV10unidade.setgxTv_Sdtunidade_Unid_nome( ((GXutil.strcmp(AV9ListaUnidade.getgxTv_SdtsdtListaUnidade_Unid_nome(), "")!=0) ? AV9ListaUnidade.getgxTv_SdtsdtListaUnidade_Unid_nome() : AV10unidade.getgxTv_Sdtunidade_Unid_nome()) );
      AV10unidade.setgxTv_Sdtunidade_Unid_sigla( ((GXutil.strcmp(AV9ListaUnidade.getgxTv_SdtsdtListaUnidade_Unid_sigla(), "")!=0) ? AV9ListaUnidade.getgxTv_SdtsdtListaUnidade_Unid_sigla() : AV10unidade.getgxTv_Sdtunidade_Unid_sigla()) );
      if ( AV10unidade.Update() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "patualizarunidade");
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "patualizarunidade");
      }
      AV8Messages = AV10unidade.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = patualizarunidade.this.AV8Messages;
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
      AV10unidade = new Sdtunidade(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new patualizarunidade__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private SdtsdtListaUnidade AV9ListaUnidade ;
   private Sdtunidade AV10unidade ;
}

final  class patualizarunidade__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

