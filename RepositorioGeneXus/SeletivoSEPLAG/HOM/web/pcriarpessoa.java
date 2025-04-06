import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcriarpessoa extends GXProcedure
{
   public pcriarpessoa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcriarpessoa.class ), "" );
   }

   public pcriarpessoa( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( SdtsdtPessoa aP0 ,
                                                                        short[] aP1 )
   {
      pcriarpessoa.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( SdtsdtPessoa aP0 ,
                        short[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( SdtsdtPessoa aP0 ,
                             short[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      pcriarpessoa.this.AV14DadosPessoa = aP0;
      pcriarpessoa.this.aP1 = aP1;
      pcriarpessoa.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17RetornoPK = (short)(0) ;
      AV8pessoa.setgxTv_Sdtpessoa_Pes_nome( AV14DadosPessoa.getgxTv_SdtsdtPessoa_Pes_nome() );
      AV8pessoa.setgxTv_Sdtpessoa_Pes_data_nascimento( localUtil.ctod( AV14DadosPessoa.getgxTv_SdtsdtPessoa_Pes_data_nascimento(), 3) );
      AV8pessoa.setgxTv_Sdtpessoa_Pes_sexo( AV14DadosPessoa.getgxTv_SdtsdtPessoa_Pes_sexo() );
      AV8pessoa.setgxTv_Sdtpessoa_Pes_mae( AV14DadosPessoa.getgxTv_SdtsdtPessoa_Pes_mae() );
      AV8pessoa.setgxTv_Sdtpessoa_Pes_pai( AV14DadosPessoa.getgxTv_SdtsdtPessoa_Pes_pai() );
      AV8pessoa.Save();
      if ( AV8pessoa.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pcriarpessoa");
         AV17RetornoPK = AV8pessoa.getgxTv_Sdtpessoa_Pes_id() ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pcriarpessoa");
      }
      AV15Messages = AV8pessoa.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pcriarpessoa.this.AV17RetornoPK;
      this.aP2[0] = pcriarpessoa.this.AV15Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV8pessoa = new Sdtpessoa(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new pcriarpessoa__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV17RetornoPK ;
   private short Gx_err ;
   private Sdtpessoa AV8pessoa ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV15Messages ;
   private SdtsdtPessoa AV14DadosPessoa ;
}

final  class pcriarpessoa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

