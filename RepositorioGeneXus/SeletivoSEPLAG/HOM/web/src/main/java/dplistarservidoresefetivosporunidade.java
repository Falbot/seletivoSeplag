import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dplistarservidoresefetivosporunidade extends GXProcedure
{
   public dplistarservidoresefetivosporunidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dplistarservidoresefetivosporunidade.class ), "" );
   }

   public dplistarservidoresefetivosporunidade( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem> executeUdp( short aP0 ,
                                                                                         long aP1 ,
                                                                                         long aP2 )
   {
      dplistarservidoresefetivosporunidade.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( short aP0 ,
                        long aP1 ,
                        long aP2 ,
                        GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( short aP0 ,
                             long aP1 ,
                             long aP2 ,
                             GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem>[] aP3 )
   {
      dplistarservidoresefetivosporunidade.this.AV5unid_id = aP0;
      dplistarservidoresefetivosporunidade.this.AV6PageNumber = aP1;
      dplistarservidoresefetivosporunidade.this.AV7PageSize = aP2;
      dplistarservidoresefetivosporunidade.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      GXPagingIdx2 = 0 ;
      GXPagingFrom2 = (int)((AV6PageNumber-1)*AV7PageSize) ;
      GXPagingTo2 = (int)((AV6PageNumber-1)*AV7PageSize+AV7PageSize) ;
      /* Using cursor P00092 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV5unid_id)});
      while ( ( (pr_default.getStatus(0) != 101) ) && ( ( GXPagingTo2 == GXPagingFrom2 ) || ( GXPagingIdx2 < GXPagingTo2 ) ) )
      {
         A7pes_id = P00092_A7pes_id[0] ;
         A4unid_id = P00092_A4unid_id[0] ;
         A8pes_nome = P00092_A8pes_nome[0] ;
         A5unid_nome = P00092_A5unid_nome[0] ;
         A6unid_sigla = P00092_A6unid_sigla[0] ;
         A9pes_data_nascimento = P00092_A9pes_data_nascimento[0] ;
         A22lot_id = P00092_A22lot_id[0] ;
         A8pes_nome = P00092_A8pes_nome[0] ;
         A9pes_data_nascimento = P00092_A9pes_data_nascimento[0] ;
         A5unid_nome = P00092_A5unid_nome[0] ;
         A6unid_sigla = P00092_A6unid_sigla[0] ;
         if ( GXutil.strcmp(new pbuscartiposervidor(remoteHandle, context).executeUdp( A7pes_id), "EFETIVO") == 0 )
         {
            GXt_dtime1 = GXutil.resetTime( A9pes_data_nascimento );
            A34pes_idade = (short)(GXutil.age( GXt_dtime1, GXutil.now( ))) ;
            GXPagingIdx2 = (int)(GXPagingIdx2+1) ;
            if ( GXPagingIdx2 > GXPagingFrom2 )
            {
               Gxm1sdtefetivoporunidade = (SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem)new SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem(remoteHandle, context);
               Gxm2rootcol.add(Gxm1sdtefetivoporunidade, 0);
               Gxm1sdtefetivoporunidade.setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_nome( A8pes_nome );
               Gxm1sdtefetivoporunidade.setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Pes_idade( A34pes_idade );
               Gxm1sdtefetivoporunidade.setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_nome( A5unid_nome );
               Gxm1sdtefetivoporunidade.setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Unid_sigla( A6unid_sigla );
               GXt_objcol_SdtsdtURLFoto2 = new GXBaseCollection<SdtsdtURLFoto>() ;
               GXv_objcol_SdtsdtURLFoto3[0] = GXt_objcol_SdtsdtURLFoto2 ;
               new pbuscarfotopessoa(remoteHandle, context).execute( A7pes_id, GXv_objcol_SdtsdtURLFoto3) ;
               GXt_objcol_SdtsdtURLFoto2 = GXv_objcol_SdtsdtURLFoto3[0] ;
               Gxm1sdtefetivoporunidade.setgxTv_SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem_Foto( GXt_objcol_SdtsdtURLFoto2 );
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = dplistarservidoresefetivosporunidade.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem>(SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem.class, "sdtEfetivoPorUnidadeItem", "SeletivoSEPLAG", remoteHandle);
      P00092_A7pes_id = new short[1] ;
      P00092_A4unid_id = new short[1] ;
      P00092_A8pes_nome = new String[] {""} ;
      P00092_A5unid_nome = new String[] {""} ;
      P00092_A6unid_sigla = new String[] {""} ;
      P00092_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      P00092_A22lot_id = new short[1] ;
      A8pes_nome = "" ;
      A5unid_nome = "" ;
      A6unid_sigla = "" ;
      A9pes_data_nascimento = GXutil.nullDate() ;
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      Gxm1sdtefetivoporunidade = new SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem(remoteHandle, context);
      GXt_objcol_SdtsdtURLFoto2 = new GXBaseCollection<SdtsdtURLFoto>(SdtsdtURLFoto.class, "sdtURLFoto", "SeletivoSEPLAG", remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new dplistarservidoresefetivosporunidade__default(),
         new Object[] {
             new Object[] {
            P00092_A7pes_id, P00092_A4unid_id, P00092_A8pes_nome, P00092_A5unid_nome, P00092_A6unid_sigla, P00092_A9pes_data_nascimento, P00092_A22lot_id
            }
         }
      );
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtsdtURLFoto3 = new GXBaseCollection[1] ;
   }

   private short AV5unid_id ;
   private short A7pes_id ;
   private short A4unid_id ;
   private short A22lot_id ;
   private short A34pes_idade ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXPagingIdx2 ;
   private long AV6PageNumber ;
   private long AV7PageSize ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date A9pes_data_nascimento ;
   private String A8pes_nome ;
   private String A5unid_nome ;
   private String A6unid_sigla ;
   private GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P00092_A7pes_id ;
   private short[] P00092_A4unid_id ;
   private String[] P00092_A8pes_nome ;
   private String[] P00092_A5unid_nome ;
   private String[] P00092_A6unid_sigla ;
   private java.util.Date[] P00092_A9pes_data_nascimento ;
   private short[] P00092_A22lot_id ;
   private GXBaseCollection<SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem> Gxm2rootcol ;
   private GXBaseCollection<SdtsdtURLFoto> GXt_objcol_SdtsdtURLFoto2 ;
   private GXBaseCollection<SdtsdtURLFoto> GXv_objcol_SdtsdtURLFoto3[] ;
   private SdtsdtEfetivoPorUnidade_sdtEfetivoPorUnidadeItem Gxm1sdtefetivoporunidade ;
}

final  class dplistarservidoresefetivosporunidade__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00092", "SELECT T1.pes_id, T1.unid_id, T2.pes_nome, T3.unid_nome, T3.unid_sigla, T2.pes_data_nascimento, T1.lot_id FROM ((lotacao T1 INNER JOIN pessoa T2 ON T2.pes_id = T1.pes_id) INNER JOIN unidade T3 ON T3.unid_id = T1.unid_id) WHERE T1.unid_id = ? ORDER BY T1.lot_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

