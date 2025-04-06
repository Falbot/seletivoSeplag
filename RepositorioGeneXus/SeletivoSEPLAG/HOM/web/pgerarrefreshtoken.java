import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgerarrefreshtoken extends GXProcedure
{
   public pgerarrefreshtoken( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgerarrefreshtoken.class ), "" );
   }

   public pgerarrefreshtoken( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              String[] aP1 )
   {
      pgerarrefreshtoken.this.aP2 = new boolean[] {false};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        boolean[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             boolean[] aP2 )
   {
      pgerarrefreshtoken.this.AV10Token = aP0;
      pgerarrefreshtoken.this.aP1 = aP1;
      pgerarrefreshtoken.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Success = false ;
      AV9RefreshToken = "" ;
      AV24Properties.fromJSonString(AV15JWTCreator.getpayload(AV10Token), null);
      AV16Usuario = AV24Properties.get("usuario") ;
      AV14PrivateClaims.setclaim("usuario", AV16Usuario);
      AV11JWTOptions.addregisteredclaim("jti", "MinhaChaveJWTSegura123");
      AV18SymmetricKey = "2d6db091d7512345030d0d52d375ea6838b7cb2dd9fc9d5ddf7811038a544b1c" ;
      AV11JWTOptions.setsecret(AV18SymmetricKey);
      AV12isValid = AV15JWTCreator.doverifyjustsignature(AV10Token, "HS256", AV11JWTOptions) ;
      if ( AV15JWTCreator.haserror() )
      {
         System.out.println( "Error on creation: Code: "+AV15JWTCreator.geterrorcode()+" Description: "+AV15JWTCreator.geterrordescription() );
      }
      else
      {
         System.out.println( "Correctly verified. Result: "+GXutil.booltostr( AV12isValid) );
         if ( AV12isValid )
         {
            AV20JWTOptionsNew.addcustomtimevalidationclaim("exp", AV19DateUtil.currentplusseconds(300), "0");
            AV20JWTOptionsNew.addregisteredclaim("jti", "MinhaChaveJWTSegura123");
            AV20JWTOptionsNew.setsecret(AV18SymmetricKey);
            AV9RefreshToken = AV21JWTCreatorNew.docreate("HS256", AV14PrivateClaims, AV20JWTOptionsNew) ;
            AV8Success = true ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pgerarrefreshtoken.this.AV9RefreshToken;
      this.aP2[0] = pgerarrefreshtoken.this.AV8Success;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9RefreshToken = "" ;
      AV24Properties = new com.genexus.util.GXProperties();
      AV15JWTCreator = new com.securityapi.genexusjwt.SdtJWTCreator(remoteHandle, context);
      AV16Usuario = "" ;
      AV14PrivateClaims = new com.securityapi.genexusjwt.SdtPrivateClaims(remoteHandle, context);
      AV11JWTOptions = new com.securityapi.genexusjwt.SdtJWTOptions(remoteHandle, context);
      AV18SymmetricKey = "" ;
      AV20JWTOptionsNew = new com.securityapi.genexusjwt.SdtJWTOptions(remoteHandle, context);
      AV19DateUtil = new com.securityapi.genexusjwt.deprecated.SdtDateUtil(remoteHandle, context);
      AV21JWTCreatorNew = new com.securityapi.genexusjwt.SdtJWTCreator(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private boolean AV8Success ;
   private boolean AV12isValid ;
   private String AV10Token ;
   private String AV9RefreshToken ;
   private String AV16Usuario ;
   private String AV18SymmetricKey ;
   private com.securityapi.genexusjwt.SdtJWTCreator AV15JWTCreator ;
   private com.securityapi.genexusjwt.SdtJWTCreator AV21JWTCreatorNew ;
   private com.securityapi.genexusjwt.deprecated.SdtDateUtil AV19DateUtil ;
   private boolean[] aP2 ;
   private String[] aP1 ;
   private com.genexus.util.GXProperties AV24Properties ;
   private com.securityapi.genexusjwt.SdtJWTOptions AV11JWTOptions ;
   private com.securityapi.genexusjwt.SdtJWTOptions AV20JWTOptionsNew ;
   private com.securityapi.genexusjwt.SdtPrivateClaims AV14PrivateClaims ;
}

