import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcriarendereco extends GXProcedure
{
   public pcriarendereco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcriarendereco.class ), "" );
   }

   public pcriarendereco( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( SdtsdtEndereco aP0 ,
                                                                        short[] aP1 )
   {
      pcriarendereco.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( SdtsdtEndereco aP0 ,
                        short[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( SdtsdtEndereco aP0 ,
                             short[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      pcriarendereco.this.AV9DadosEndereco = aP0;
      pcriarendereco.this.aP1 = aP1;
      pcriarendereco.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10endereco.setgxTv_Sdtendereco_End_tipo_logradouro( AV9DadosEndereco.getgxTv_SdtsdtEndereco_End_tipo_logradouro() );
      AV10endereco.setgxTv_Sdtendereco_End_logradouro( AV9DadosEndereco.getgxTv_SdtsdtEndereco_End_logradouro() );
      AV10endereco.setgxTv_Sdtendereco_End_numero( AV9DadosEndereco.getgxTv_SdtsdtEndereco_End_numero() );
      AV10endereco.setgxTv_Sdtendereco_End_bairro( AV9DadosEndereco.getgxTv_SdtsdtEndereco_End_bairro() );
      AV10endereco.setgxTv_Sdtendereco_Cid_id( AV9DadosEndereco.getgxTv_SdtsdtEndereco_Cid_id() );
      AV10endereco.Save();
      if ( AV10endereco.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pcriarendereco");
         AV12RetornoPK = AV10endereco.getgxTv_Sdtendereco_End_id() ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pcriarendereco");
      }
      AV8Messages = AV10endereco.GetMessages() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pcriarendereco.this.AV12RetornoPK;
      this.aP2[0] = pcriarendereco.this.AV8Messages;
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
      AV10endereco = new Sdtendereco(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new pcriarendereco__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV12RetornoPK ;
   private short Gx_err ;
   private Sdtendereco AV10endereco ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private SdtsdtEndereco AV9DadosEndereco ;
}

final  class pcriarendereco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

