import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dplistarpessoas extends GXProcedure
{
   public dplistarpessoas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dplistarpessoas.class ), "" );
   }

   public dplistarpessoas( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<SdtsdtListaPessoas_sdtListaPessoasItem> executeUdp( long aP0 ,
                                                                               long aP1 )
   {
      dplistarpessoas.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<SdtsdtListaPessoas_sdtListaPessoasItem>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        GXBaseCollection<SdtsdtListaPessoas_sdtListaPessoasItem>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             GXBaseCollection<SdtsdtListaPessoas_sdtListaPessoasItem>[] aP2 )
   {
      dplistarpessoas.this.AV6PageNumber = aP0;
      dplistarpessoas.this.AV5PageSize = aP1;
      dplistarpessoas.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXPagingFrom2 = (int)((AV6PageNumber-1)*AV5PageSize) ;
      GXPagingTo2 = (int)(AV5PageSize) ;
      /* Using cursor P00032 */
      pr_default.execute(0, new Object[] {Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7pes_id = P00032_A7pes_id[0] ;
         A8pes_nome = P00032_A8pes_nome[0] ;
         A9pes_data_nascimento = P00032_A9pes_data_nascimento[0] ;
         A10pes_sexo = P00032_A10pes_sexo[0] ;
         A11pes_mae = P00032_A11pes_mae[0] ;
         A12pes_pai = P00032_A12pes_pai[0] ;
         Gxm1sdtlistapessoas = (SdtsdtListaPessoas_sdtListaPessoasItem)new SdtsdtListaPessoas_sdtListaPessoasItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtlistapessoas, 0);
         Gxm1sdtlistapessoas.setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_id( A7pes_id );
         Gxm1sdtlistapessoas.setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_nome( A8pes_nome );
         Gxm1sdtlistapessoas.setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_data_nascimento( localUtil.format( A9pes_data_nascimento, "99/99/9999") );
         Gxm1sdtlistapessoas.setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_sexo( A10pes_sexo );
         Gxm1sdtlistapessoas.setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_mae( A11pes_mae );
         Gxm1sdtlistapessoas.setgxTv_SdtsdtListaPessoas_sdtListaPessoasItem_Pes_pai( A12pes_pai );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dplistarpessoas.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<SdtsdtListaPessoas_sdtListaPessoasItem>(SdtsdtListaPessoas_sdtListaPessoasItem.class, "sdtListaPessoasItem", "SeletivoSEPLAG", remoteHandle);
      scmdbuf = "" ;
      P00032_A7pes_id = new short[1] ;
      P00032_A8pes_nome = new String[] {""} ;
      P00032_A9pes_data_nascimento = new java.util.Date[] {GXutil.nullDate()} ;
      P00032_A10pes_sexo = new String[] {""} ;
      P00032_A11pes_mae = new String[] {""} ;
      P00032_A12pes_pai = new String[] {""} ;
      A8pes_nome = "" ;
      A9pes_data_nascimento = GXutil.nullDate() ;
      A10pes_sexo = "" ;
      A11pes_mae = "" ;
      A12pes_pai = "" ;
      Gxm1sdtlistapessoas = new SdtsdtListaPessoas_sdtListaPessoasItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new dplistarpessoas__default(),
         new Object[] {
             new Object[] {
            P00032_A7pes_id, P00032_A8pes_nome, P00032_A9pes_data_nascimento, P00032_A10pes_sexo, P00032_A11pes_mae, P00032_A12pes_pai
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A7pes_id ;
   private short Gx_err ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private long AV6PageNumber ;
   private long AV5PageSize ;
   private String scmdbuf ;
   private java.util.Date A9pes_data_nascimento ;
   private String A8pes_nome ;
   private String A10pes_sexo ;
   private String A11pes_mae ;
   private String A12pes_pai ;
   private GXBaseCollection<SdtsdtListaPessoas_sdtListaPessoasItem>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P00032_A7pes_id ;
   private String[] P00032_A8pes_nome ;
   private java.util.Date[] P00032_A9pes_data_nascimento ;
   private String[] P00032_A10pes_sexo ;
   private String[] P00032_A11pes_mae ;
   private String[] P00032_A12pes_pai ;
   private GXBaseCollection<SdtsdtListaPessoas_sdtListaPessoasItem> Gxm2rootcol ;
   private SdtsdtListaPessoas_sdtListaPessoasItem Gxm1sdtlistapessoas ;
}

final  class dplistarpessoas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00032", "SELECT pes_id, pes_nome, pes_data_nascimento, pes_sexo, pes_mae, pes_pai FROM pessoa ORDER BY pes_id  OFFSET ? LIMIT CASE WHEN ? > 0 THEN ? ELSE 1e9 END",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
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

