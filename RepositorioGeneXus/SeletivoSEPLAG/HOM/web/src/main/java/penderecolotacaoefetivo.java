import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class penderecolotacaoefetivo extends GXProcedure
{
   public penderecolotacaoefetivo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( penderecolotacaoefetivo.class ), "" );
   }

   public penderecolotacaoefetivo( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem> executeUdp( String aP0 ,
                                                                                                   long aP1 ,
                                                                                                   long aP2 )
   {
      penderecolotacaoefetivo.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        long aP2 ,
                        GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             long aP2 ,
                             GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem>[] aP3 )
   {
      penderecolotacaoefetivo.this.AV14pesnome = aP0;
      penderecolotacaoefetivo.this.AV15PageNumber = aP1;
      penderecolotacaoefetivo.this.AV16PageSize = aP2;
      penderecolotacaoefetivo.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      GXPagingIdx2 = 0 ;
      GXPagingFrom2 = (int)(AV16PageSize*(AV15PageNumber-1)) ;
      GXPagingTo2 = (int)(AV16PageSize*(AV15PageNumber-1)+AV16PageSize) ;
      lV14pesnome = GXutil.concat( GXutil.rtrim( AV14pesnome), "%", "") ;
      /* Using cursor P00182 */
      pr_default.execute(0, new Object[] {lV14pesnome});
      while ( ( (pr_default.getStatus(0) != 101) ) && ( ( GXPagingTo2 == GXPagingFrom2 ) || ( GXPagingIdx2 < GXPagingTo2 ) ) )
      {
         A7pes_id = P00182_A7pes_id[0] ;
         A8pes_nome = P00182_A8pes_nome[0] ;
         if ( GXutil.strcmp(new pbuscartiposervidor(remoteHandle, context).executeUdp( A7pes_id), "EFETIVO") == 0 )
         {
            GXPagingIdx2 = (int)(GXPagingIdx2+1) ;
            if ( GXPagingIdx2 > GXPagingFrom2 )
            {
               AV10pes_id = A7pes_id ;
               AV8pes_nome = A8pes_nome ;
               /* Execute user subroutine: 'BUSCALOTACAO' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSCALOTACAO' Routine */
      returnInSub = false ;
      /* Using cursor P00183 */
      pr_default.execute(1, new Object[] {Short.valueOf(AV10pes_id)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A5unid_nome = P00183_A5unid_nome[0] ;
         A6unid_sigla = P00183_A6unid_sigla[0] ;
         A7pes_id = P00183_A7pes_id[0] ;
         A4unid_id = P00183_A4unid_id[0] ;
         A22lot_id = P00183_A22lot_id[0] ;
         A5unid_nome = P00183_A5unid_nome[0] ;
         A6unid_sigla = P00183_A6unid_sigla[0] ;
         AV12unid_id = A4unid_id ;
         /* Using cursor P00184 */
         pr_default.execute(2, new Object[] {Short.valueOf(AV12unid_id)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A13end_id = P00184_A13end_id[0] ;
            A1cid_id = P00184_A1cid_id[0] ;
            A4unid_id = P00184_A4unid_id[0] ;
            A2cid_nome = P00184_A2cid_nome[0] ;
            A3cid_uf = P00184_A3cid_uf[0] ;
            A14end_tipo_logradouro = P00184_A14end_tipo_logradouro[0] ;
            A15end_logradouro = P00184_A15end_logradouro[0] ;
            A16end_numero = P00184_A16end_numero[0] ;
            A17end_bairro = P00184_A17end_bairro[0] ;
            A1cid_id = P00184_A1cid_id[0] ;
            A14end_tipo_logradouro = P00184_A14end_tipo_logradouro[0] ;
            A15end_logradouro = P00184_A15end_logradouro[0] ;
            A16end_numero = P00184_A16end_numero[0] ;
            A17end_bairro = P00184_A17end_bairro[0] ;
            A2cid_nome = P00184_A2cid_nome[0] ;
            A3cid_uf = P00184_A3cid_uf[0] ;
            AV13EnderecoFuncional.setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_nome( A2cid_nome );
            AV13EnderecoFuncional.setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Cid_uf( A3cid_uf );
            AV13EnderecoFuncional.setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_tipo_logradouro( A14end_tipo_logradouro );
            AV13EnderecoFuncional.setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_logradouro( A15end_logradouro );
            AV13EnderecoFuncional.setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_numero( A16end_numero );
            AV13EnderecoFuncional.setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_End_bairro( A17end_bairro );
            AV13EnderecoFuncional.setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_nome( A5unid_nome );
            AV13EnderecoFuncional.setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Unid_sigla( A6unid_sigla );
            AV13EnderecoFuncional.setgxTv_SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem_Pes_nome( AV8pes_nome );
            AV9ListaEnderecoFuncional.add(AV13EnderecoFuncional, 0);
            AV13EnderecoFuncional = (SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem)new SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem(remoteHandle, context);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = penderecolotacaoefetivo.this.AV9ListaEnderecoFuncional;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9ListaEnderecoFuncional = new GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem>(SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem.class, "sdtEnderecoLotacaoEfetivoItem", "SeletivoSEPLAG", remoteHandle);
      lV14pesnome = "" ;
      P00182_A7pes_id = new short[1] ;
      P00182_A8pes_nome = new String[] {""} ;
      A8pes_nome = "" ;
      AV8pes_nome = "" ;
      P00183_A5unid_nome = new String[] {""} ;
      P00183_A6unid_sigla = new String[] {""} ;
      P00183_A7pes_id = new short[1] ;
      P00183_A4unid_id = new short[1] ;
      P00183_A22lot_id = new short[1] ;
      A5unid_nome = "" ;
      A6unid_sigla = "" ;
      P00184_A13end_id = new short[1] ;
      P00184_A1cid_id = new short[1] ;
      P00184_A4unid_id = new short[1] ;
      P00184_A2cid_nome = new String[] {""} ;
      P00184_A3cid_uf = new String[] {""} ;
      P00184_A14end_tipo_logradouro = new String[] {""} ;
      P00184_A15end_logradouro = new String[] {""} ;
      P00184_A16end_numero = new long[1] ;
      P00184_A17end_bairro = new String[] {""} ;
      A2cid_nome = "" ;
      A3cid_uf = "" ;
      A14end_tipo_logradouro = "" ;
      A15end_logradouro = "" ;
      A17end_bairro = "" ;
      AV13EnderecoFuncional = new SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new penderecolotacaoefetivo__default(),
         new Object[] {
             new Object[] {
            P00182_A7pes_id, P00182_A8pes_nome
            }
            , new Object[] {
            P00183_A5unid_nome, P00183_A6unid_sigla, P00183_A7pes_id, P00183_A4unid_id, P00183_A22lot_id
            }
            , new Object[] {
            P00184_A13end_id, P00184_A1cid_id, P00184_A4unid_id, P00184_A2cid_nome, P00184_A3cid_uf, P00184_A14end_tipo_logradouro, P00184_A15end_logradouro, P00184_A16end_numero, P00184_A17end_bairro
            }
         }
      );
      /* GeneXus formulas. */
   }

   private short A7pes_id ;
   private short AV10pes_id ;
   private short A4unid_id ;
   private short A22lot_id ;
   private short AV12unid_id ;
   private short A13end_id ;
   private short A1cid_id ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXPagingIdx2 ;
   private long AV15PageNumber ;
   private long AV16PageSize ;
   private long A16end_numero ;
   private String A3cid_uf ;
   private boolean returnInSub ;
   private String AV14pesnome ;
   private String lV14pesnome ;
   private String A8pes_nome ;
   private String AV8pes_nome ;
   private String A5unid_nome ;
   private String A6unid_sigla ;
   private String A2cid_nome ;
   private String A14end_tipo_logradouro ;
   private String A15end_logradouro ;
   private String A17end_bairro ;
   private SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem AV13EnderecoFuncional ;
   private GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P00182_A7pes_id ;
   private String[] P00182_A8pes_nome ;
   private String[] P00183_A5unid_nome ;
   private String[] P00183_A6unid_sigla ;
   private short[] P00183_A7pes_id ;
   private short[] P00183_A4unid_id ;
   private short[] P00183_A22lot_id ;
   private short[] P00184_A13end_id ;
   private short[] P00184_A1cid_id ;
   private short[] P00184_A4unid_id ;
   private String[] P00184_A2cid_nome ;
   private String[] P00184_A3cid_uf ;
   private String[] P00184_A14end_tipo_logradouro ;
   private String[] P00184_A15end_logradouro ;
   private long[] P00184_A16end_numero ;
   private String[] P00184_A17end_bairro ;
   private GXBaseCollection<SdtsdtEnderecoLotacaoEfetivo_sdtEnderecoLotacaoEfetivoItem> AV9ListaEnderecoFuncional ;
}

final  class penderecolotacaoefetivo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00182", "SELECT pes_id, pes_nome FROM pessoa WHERE pes_nome like '%' || ? || '%' ORDER BY pes_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00183", "SELECT T2.unid_nome, T2.unid_sigla, T1.pes_id, T1.unid_id, T1.lot_id FROM (lotacao T1 INNER JOIN unidade T2 ON T2.unid_id = T1.unid_id) WHERE T1.pes_id = ? ORDER BY T1.pes_id  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00184", "SELECT T1.end_id, T2.cid_id, T1.unid_id, T3.cid_nome, T3.cid_uf, T2.end_tipo_logradouro, T2.end_logradouro, T2.end_numero, T2.end_bairro FROM ((unidade_endereco T1 INNER JOIN endereco T2 ON T2.end_id = T1.end_id) INNER JOIN cidade T3 ON T3.cid_id = T2.cid_id) WHERE T1.unid_id = ? ORDER BY T1.unid_id  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((long[]) buf[7])[0] = rslt.getLong(8);
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
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

