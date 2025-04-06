import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscartiposervidor extends GXProcedure
{
   public pbuscartiposervidor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscartiposervidor.class ), "" );
   }

   public pbuscartiposervidor( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( short aP0 )
   {
      pbuscartiposervidor.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( short aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( short aP0 ,
                             String[] aP1 )
   {
      pbuscartiposervidor.this.AV8pes_id = aP0;
      pbuscartiposervidor.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV9TipoServidor = "" ;
      AV10GXLvl2 = (byte)(0) ;
      /* Using cursor P00162 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV8pes_id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7pes_id = P00162_A7pes_id[0] ;
         A26se_matricula = P00162_A26se_matricula[0] ;
         AV10GXLvl2 = (byte)(1) ;
         AV9TipoServidor = "EFETIVO" ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV10GXLvl2 == 0 )
      {
         /* Using cursor P00163 */
         pr_default.execute(1, new Object[] {Short.valueOf(AV8pes_id)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A7pes_id = P00163_A7pes_id[0] ;
            A32st_data_admissao = P00163_A32st_data_admissao[0] ;
            AV9TipoServidor = "TEMPORARIO" ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pbuscartiposervidor.this.AV9TipoServidor;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9TipoServidor = "" ;
      P00162_A7pes_id = new short[1] ;
      P00162_A26se_matricula = new String[] {""} ;
      A26se_matricula = "" ;
      P00163_A7pes_id = new short[1] ;
      P00163_A32st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      A32st_data_admissao = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new pbuscartiposervidor__default(),
         new Object[] {
             new Object[] {
            P00162_A7pes_id, P00162_A26se_matricula
            }
            , new Object[] {
            P00163_A7pes_id, P00163_A32st_data_admissao
            }
         }
      );
      /* GeneXus formulas. */
   }

   private byte AV10GXLvl2 ;
   private short AV8pes_id ;
   private short A7pes_id ;
   private java.util.Date A32st_data_admissao ;
   private String AV9TipoServidor ;
   private String A26se_matricula ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P00162_A7pes_id ;
   private String[] P00162_A26se_matricula ;
   private short[] P00163_A7pes_id ;
   private java.util.Date[] P00163_A32st_data_admissao ;
}

final  class pbuscartiposervidor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00162", "SELECT pes_id, se_matricula FROM servidor_efetivo WHERE pes_id = ? ORDER BY pes_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00163", "SELECT pes_id, st_data_admissao FROM servidor_temporario WHERE pes_id = ? ORDER BY pes_id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
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
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

