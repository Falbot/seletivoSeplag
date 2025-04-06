import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class patualizarpessoa extends GXProcedure
{
   public patualizarpessoa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( patualizarpessoa.class ), "" );
   }

   public patualizarpessoa( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( SdtsdtListaPessoa aP0 )
   {
      patualizarpessoa.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( SdtsdtListaPessoa aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( SdtsdtListaPessoa aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      patualizarpessoa.this.AV9ListaPessoa = aP0;
      patualizarpessoa.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10pessoa.Load(AV9ListaPessoa.getgxTv_SdtsdtListaPessoa_Pes_id());
      AV10pessoa.setgxTv_Sdtpessoa_Pes_nome( ((GXutil.strcmp(AV9ListaPessoa.getgxTv_SdtsdtListaPessoa_Pes_nome(), "")!=0) ? AV9ListaPessoa.getgxTv_SdtsdtListaPessoa_Pes_nome() : AV10pessoa.getgxTv_Sdtpessoa_Pes_nome()) );
      AV10pessoa.setgxTv_Sdtpessoa_Pes_data_nascimento( ((GXutil.strcmp(AV9ListaPessoa.getgxTv_SdtsdtListaPessoa_Pes_data_nascimento(), "")!=0) ? localUtil.ctod( AV9ListaPessoa.getgxTv_SdtsdtListaPessoa_Pes_data_nascimento(), 3) : AV10pessoa.getgxTv_Sdtpessoa_Pes_data_nascimento()) );
      AV10pessoa.setgxTv_Sdtpessoa_Pes_sexo( ((GXutil.strcmp(AV9ListaPessoa.getgxTv_SdtsdtListaPessoa_Pes_sexo(), "")!=0) ? AV9ListaPessoa.getgxTv_SdtsdtListaPessoa_Pes_sexo() : AV10pessoa.getgxTv_Sdtpessoa_Pes_sexo()) );
      AV10pessoa.setgxTv_Sdtpessoa_Pes_mae( ((GXutil.strcmp(AV9ListaPessoa.getgxTv_SdtsdtListaPessoa_Pes_mae(), "")!=0) ? AV9ListaPessoa.getgxTv_SdtsdtListaPessoa_Pes_mae() : AV10pessoa.getgxTv_Sdtpessoa_Pes_mae()) );
      AV10pessoa.setgxTv_Sdtpessoa_Pes_pai( ((GXutil.strcmp(AV9ListaPessoa.getgxTv_SdtsdtListaPessoa_Pes_pai(), "")!=0) ? AV9ListaPessoa.getgxTv_SdtsdtListaPessoa_Pes_pai() : AV10pessoa.getgxTv_Sdtpessoa_Pes_pai()) );
      if ( AV10pessoa.Update() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "patualizarpessoa");
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "patualizarpessoa");
      }
      AV8Messages = AV10pessoa.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = patualizarpessoa.this.AV8Messages;
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
      AV10pessoa = new Sdtpessoa(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new patualizarpessoa__default(),
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
   private SdtsdtListaPessoa AV9ListaPessoa ;
   private Sdtpessoa AV10pessoa ;
}

final  class patualizarpessoa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

