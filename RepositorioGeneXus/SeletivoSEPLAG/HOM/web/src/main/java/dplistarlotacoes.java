import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dplistarlotacoes extends GXProcedure
{
   public dplistarlotacoes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dplistarlotacoes.class ), "" );
   }

   public dplistarlotacoes( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<SdtsdtListaLotacoes_sdtListaLotacoesItem> executeUdp( long aP0 ,
                                                                                 long aP1 )
   {
      dplistarlotacoes.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<SdtsdtListaLotacoes_sdtListaLotacoesItem>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        GXBaseCollection<SdtsdtListaLotacoes_sdtListaLotacoesItem>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             GXBaseCollection<SdtsdtListaLotacoes_sdtListaLotacoesItem>[] aP2 )
   {
      dplistarlotacoes.this.AV5PageNumber = aP0;
      dplistarlotacoes.this.AV6PageSize = aP1;
      dplistarlotacoes.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      GXPagingFrom2 = (int)((AV5PageNumber-1)*AV6PageSize) ;
      GXPagingTo2 = (int)(AV6PageSize) ;
      /* Using cursor P00072 */
      pr_default.execute(0, new Object[] {Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A22lot_id = P00072_A22lot_id[0] ;
         A7pes_id = P00072_A7pes_id[0] ;
         A8pes_nome = P00072_A8pes_nome[0] ;
         A4unid_id = P00072_A4unid_id[0] ;
         A5unid_nome = P00072_A5unid_nome[0] ;
         A6unid_sigla = P00072_A6unid_sigla[0] ;
         A23lot_data_lotacao = P00072_A23lot_data_lotacao[0] ;
         A24lot_data_remocao = P00072_A24lot_data_remocao[0] ;
         A25lot_portaria = P00072_A25lot_portaria[0] ;
         A8pes_nome = P00072_A8pes_nome[0] ;
         A5unid_nome = P00072_A5unid_nome[0] ;
         A6unid_sigla = P00072_A6unid_sigla[0] ;
         Gxm1sdtlistalotacoes = (SdtsdtListaLotacoes_sdtListaLotacoesItem)new SdtsdtListaLotacoes_sdtListaLotacoesItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtlistalotacoes, 0);
         Gxm1sdtlistalotacoes.setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_id( A22lot_id );
         Gxm1sdtlistalotacoes.setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_id( A7pes_id );
         Gxm1sdtlistalotacoes.setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Pes_nome( A8pes_nome );
         Gxm1sdtlistalotacoes.setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_id( A4unid_id );
         Gxm1sdtlistalotacoes.setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_nome( A5unid_nome );
         Gxm1sdtlistalotacoes.setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Unid_sigla( A6unid_sigla );
         Gxm1sdtlistalotacoes.setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_lotacao( A23lot_data_lotacao );
         Gxm1sdtlistalotacoes.setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_data_remocao( A24lot_data_remocao );
         Gxm1sdtlistalotacoes.setgxTv_SdtsdtListaLotacoes_sdtListaLotacoesItem_Lot_portaria( A25lot_portaria );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dplistarlotacoes.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<SdtsdtListaLotacoes_sdtListaLotacoesItem>(SdtsdtListaLotacoes_sdtListaLotacoesItem.class, "sdtListaLotacoesItem", "SeletivoSEPLAG", remoteHandle);
      P00072_A22lot_id = new short[1] ;
      P00072_A7pes_id = new short[1] ;
      P00072_A8pes_nome = new String[] {""} ;
      P00072_A4unid_id = new short[1] ;
      P00072_A5unid_nome = new String[] {""} ;
      P00072_A6unid_sigla = new String[] {""} ;
      P00072_A23lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      P00072_A24lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      P00072_A25lot_portaria = new String[] {""} ;
      A8pes_nome = "" ;
      A5unid_nome = "" ;
      A6unid_sigla = "" ;
      A23lot_data_lotacao = GXutil.nullDate() ;
      A24lot_data_remocao = GXutil.nullDate() ;
      A25lot_portaria = "" ;
      Gxm1sdtlistalotacoes = new SdtsdtListaLotacoes_sdtListaLotacoesItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new dplistarlotacoes__default(),
         new Object[] {
             new Object[] {
            P00072_A22lot_id, P00072_A7pes_id, P00072_A8pes_nome, P00072_A4unid_id, P00072_A5unid_nome, P00072_A6unid_sigla, P00072_A23lot_data_lotacao, P00072_A24lot_data_remocao, P00072_A25lot_portaria
            }
         }
      );
      /* GeneXus formulas. */
   }

   private short A22lot_id ;
   private short A7pes_id ;
   private short A4unid_id ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private long AV5PageNumber ;
   private long AV6PageSize ;
   private java.util.Date A23lot_data_lotacao ;
   private java.util.Date A24lot_data_remocao ;
   private String A8pes_nome ;
   private String A5unid_nome ;
   private String A6unid_sigla ;
   private String A25lot_portaria ;
   private GXBaseCollection<SdtsdtListaLotacoes_sdtListaLotacoesItem>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P00072_A22lot_id ;
   private short[] P00072_A7pes_id ;
   private String[] P00072_A8pes_nome ;
   private short[] P00072_A4unid_id ;
   private String[] P00072_A5unid_nome ;
   private String[] P00072_A6unid_sigla ;
   private java.util.Date[] P00072_A23lot_data_lotacao ;
   private java.util.Date[] P00072_A24lot_data_remocao ;
   private String[] P00072_A25lot_portaria ;
   private GXBaseCollection<SdtsdtListaLotacoes_sdtListaLotacoesItem> Gxm2rootcol ;
   private SdtsdtListaLotacoes_sdtListaLotacoesItem Gxm1sdtlistalotacoes ;
}

final  class dplistarlotacoes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00072", "SELECT T1.lot_id, T1.pes_id, T2.pes_nome, T1.unid_id, T3.unid_nome, T3.unid_sigla, T1.lot_data_lotacao, T1.lot_data_remocao, T1.lot_portaria FROM ((lotacao T1 INNER JOIN pessoa T2 ON T2.pes_id = T1.pes_id) INNER JOIN unidade T3 ON T3.unid_id = T1.unid_id) ORDER BY T1.lot_id  OFFSET ? LIMIT CASE WHEN ? > 0 THEN ? ELSE 1e9 END",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

