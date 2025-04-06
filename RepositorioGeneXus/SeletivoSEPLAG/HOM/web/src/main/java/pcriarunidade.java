import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcriarunidade extends GXProcedure
{
   public pcriarunidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcriarunidade.class ), "" );
   }

   public pcriarunidade( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( SdtsdtUnidade aP0 ,
                                                                        short[] aP1 )
   {
      pcriarunidade.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( SdtsdtUnidade aP0 ,
                        short[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( SdtsdtUnidade aP0 ,
                             short[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      pcriarunidade.this.AV9DadosUnidade = aP0;
      pcriarunidade.this.aP1 = aP1;
      pcriarunidade.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV8unidade.setgxTv_Sdtunidade_Unid_nome( AV9DadosUnidade.getgxTv_SdtsdtUnidade_Unid_nome() );
      AV8unidade.setgxTv_Sdtunidade_Unid_sigla( AV9DadosUnidade.getgxTv_SdtsdtUnidade_Unid_sigla() );
      AV8unidade.Save();
      if ( AV8unidade.Success() )
      {
         AV12RetornoPK = AV8unidade.getgxTv_Sdtunidade_Unid_id() ;
         GXv_int1[0] = AV11end_id ;
         GXv_objcol_SdtMessages_Message2[0] = AV10Messages ;
         new pcriarendereco(remoteHandle, context).execute( AV9DadosUnidade.getgxTv_SdtsdtUnidade_Dadosendereco(), GXv_int1, GXv_objcol_SdtMessages_Message2) ;
         pcriarunidade.this.AV11end_id = GXv_int1[0] ;
         AV10Messages = GXv_objcol_SdtMessages_Message2[0] ;
         if ( AV11end_id > 0 )
         {
            AV13unidade_endereco.setgxTv_Sdtunidade_endereco_Unid_id( AV12RetornoPK );
            AV13unidade_endereco.setgxTv_Sdtunidade_endereco_End_id( AV11end_id );
            AV13unidade_endereco.Save();
            if ( AV13unidade_endereco.Success() )
            {
               Application.commitDataStores(context, remoteHandle, pr_default, "pcriarunidade");
            }
            else
            {
               Application.rollbackDataStores(context, remoteHandle, pr_default, "pcriarunidade");
            }
            AV10Messages = AV13unidade_endereco.GetMessages() ;
         }
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pcriarunidade");
         AV10Messages = AV8unidade.GetMessages() ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pcriarunidade.this.AV12RetornoPK;
      this.aP2[0] = pcriarunidade.this.AV10Messages;
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
      AV8unidade = new Sdtunidade(remoteHandle);
      GXv_int1 = new short[1] ;
      AV13unidade_endereco = new Sdtunidade_endereco(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new pcriarunidade__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtMessages_Message2 = new GXBaseCollection[1] ;
   }

   private short AV12RetornoPK ;
   private short AV11end_id ;
   private short GXv_int1[] ;
   private Sdtunidade AV8unidade ;
   private Sdtunidade_endereco AV13unidade_endereco ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message2[] ;
   private SdtsdtUnidade AV9DadosUnidade ;
}

final  class pcriarunidade__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

