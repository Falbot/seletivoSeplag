import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class patualizarservidortemporario extends GXProcedure
{
   public patualizarservidortemporario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( patualizarservidortemporario.class ), "" );
   }

   public patualizarservidortemporario( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( short aP0 ,
                                                                        String aP1 ,
                                                                        String aP2 )
   {
      patualizarservidortemporario.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( short aP0 ,
                        String aP1 ,
                        String aP2 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( short aP0 ,
                             String aP1 ,
                             String aP2 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      patualizarservidortemporario.this.AV8pes_id = aP0;
      patualizarservidortemporario.this.AV11DataAdmissao = aP1;
      patualizarservidortemporario.this.AV10DataDemissao = aP2;
      patualizarservidortemporario.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV14st_data_admissao = localUtil.ctod( AV11DataAdmissao, 3) ;
      AV15st_data_demissao = localUtil.ctod( AV10DataDemissao, 3) ;
      AV12servidor_temporario.Load(AV8pes_id, AV14st_data_admissao);
      AV12servidor_temporario.setgxTv_Sdtservidor_temporario_St_data_demissao( AV15st_data_demissao );
      if ( AV12servidor_temporario.Update() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "patualizarservidortemporario");
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "patualizarservidortemporario");
      }
      AV9Messages = AV12servidor_temporario.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = patualizarservidortemporario.this.AV9Messages;
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
      AV14st_data_admissao = GXutil.nullDate() ;
      AV15st_data_demissao = GXutil.nullDate() ;
      AV12servidor_temporario = new Sdtservidor_temporario(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new patualizarservidortemporario__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private short AV8pes_id ;
   private java.util.Date AV14st_data_admissao ;
   private java.util.Date AV15st_data_demissao ;
   private String AV11DataAdmissao ;
   private String AV10DataDemissao ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private Sdtservidor_temporario AV12servidor_temporario ;
}

final  class patualizarservidortemporario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

