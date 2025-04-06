import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvalidarjwt extends GXProcedure
{
   public pvalidarjwt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvalidarjwt.class ), "" );
   }

   public pvalidarjwt( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 )
   {
      pvalidarjwt.this.aP1 = new boolean[] {false};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        boolean[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             boolean[] aP1 )
   {
      pvalidarjwt.this.AV8Token = aP0;
      pvalidarjwt.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Properties.fromJSonString(AV12JWTCreator.getpayload(AV8Token), null);
      AV10Usuario = AV11Properties.get("usuario") ;
      AV18JWTOptions.addregisteredclaim("jti", "MinhaChaveJWTSegura123");
      AV21SymmetricKey = "2d6db091d7512345030d0d52d375ea6838b7cb2dd9fc9d5ddf7811038a544b1c" ;
      AV18JWTOptions.setsecret(AV21SymmetricKey);
      AV9IsValid = AV12JWTCreator.doverifyjustsignature(AV8Token, "HS256", AV18JWTOptions) ;
      System.out.println( GXutil.booltostr( AV9IsValid) );
      if ( AV12JWTCreator.haserror() )
      {
         System.out.println( "Error on creation: Code: "+AV12JWTCreator.geterrorcode()+" Description: "+AV12JWTCreator.geterrordescription() );
      }
      else
      {
         System.out.println( "Correctly verified. Result: "+GXutil.booltostr( AV9IsValid) );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pvalidarjwt.this.AV9IsValid;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Properties = new com.genexus.util.GXProperties();
      AV12JWTCreator = new com.securityapi.genexusjwt.SdtJWTCreator(remoteHandle, context);
      AV10Usuario = "" ;
      AV18JWTOptions = new com.securityapi.genexusjwt.SdtJWTOptions(remoteHandle, context);
      AV21SymmetricKey = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private boolean AV9IsValid ;
   private String AV8Token ;
   private String AV10Usuario ;
   private String AV21SymmetricKey ;
   private com.securityapi.genexusjwt.SdtJWTCreator AV12JWTCreator ;
   private boolean[] aP1 ;
   private com.genexus.util.GXProperties AV11Properties ;
   private com.securityapi.genexusjwt.SdtJWTOptions AV18JWTOptions ;
}

