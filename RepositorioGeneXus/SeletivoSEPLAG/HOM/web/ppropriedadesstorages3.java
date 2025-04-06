import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppropriedadesstorages3 extends GXProcedure
{
   public ppropriedadesstorages3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppropriedadesstorages3.class ), "" );
   }

   public ppropriedadesstorages3( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.genexus.util.GXProperties executeUdp( )
   {
      ppropriedadesstorages3.this.aP0 = new com.genexus.util.GXProperties[] {new com.genexus.util.GXProperties()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( com.genexus.util.GXProperties[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( com.genexus.util.GXProperties[] aP0 )
   {
      ppropriedadesstorages3.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Properties = (com.genexus.util.GXProperties)new com.genexus.util.GXProperties();
      AV8Properties.set("STORAGE_PROVIDER_ACCESSKEYID", "teste1");
      AV8Properties.set("STORAGE_PROVIDER_SECRETACCESSKEY", "12345678");
      AV8Properties.set("BUCKET_NAME", "seletivo");
      AV8Properties.set("FOLDER_NAME", "pessoa");
      AV8Properties.set("STORAGE_ENDPOINT", "custom");
      AV8Properties.set("STORAGE_PROVIDER_DEFAULT_ACL", "Default");
      AV8Properties.set("STORAGE_PROVIDER_DEFAULT_EXPIRATION", "1440");
      AV8Properties.set("STORAGE_CUSTOM_ENDPOINT", "http://localhost:9001");
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppropriedadesstorages3.this.AV8Properties;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Properties = new com.genexus.util.GXProperties();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private com.genexus.util.GXProperties[] aP0 ;
   private com.genexus.util.GXProperties AV8Properties ;
}

