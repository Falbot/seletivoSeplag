import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgerartoken extends GXProcedure
{
   public pgerartoken( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgerartoken.class ), "" );
   }

   public pgerartoken( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              String aP1 ,
                              String[] aP2 )
   {
      pgerartoken.this.aP3 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 ,
                        boolean[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 ,
                             boolean[] aP3 )
   {
      pgerartoken.this.AV22Usuario = aP0;
      pgerartoken.this.AV24Senha = aP1;
      pgerartoken.this.aP2 = aP2;
      pgerartoken.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV26Success = false ;
      AV16Token = "" ;
      if ( ( GXutil.strcmp(AV22Usuario, "seletivo@seplag.mt.gov.br") == 0 ) && ( GXutil.strcmp(AV24Senha, "@seletivo123") == 0 ) )
      {
         AV13SymmetricKey = "2d6db091d7512345030d0d52d375ea6838b7cb2dd9fc9d5ddf7811038a544b1c" ;
         AV14JWTOptions.addcustomtimevalidationclaim("exp", AV21DateUtil.currentplusseconds(300), "0");
         AV14JWTOptions.addregisteredclaim("jti", "MinhaChaveJWTSegura123");
         AV14JWTOptions.setsecret(AV13SymmetricKey);
         AV15PrivateClaims.setclaim("usuario", AV22Usuario);
         AV16Token = AV20JWTCreator.docreate("HS256", AV15PrivateClaims, AV14JWTOptions) ;
         if ( AV20JWTCreator.haserror() )
         {
            System.out.println( "Error on creation: Code: "+AV20JWTCreator.geterrorcode()+" Description: "+AV20JWTCreator.geterrordescription() );
         }
         else
         {
            AV26Success = true ;
            System.out.println( "Correctly generated" );
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pgerartoken.this.AV16Token;
      this.aP3[0] = pgerartoken.this.AV26Success;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Token = "" ;
      AV13SymmetricKey = "" ;
      AV14JWTOptions = new com.securityapi.genexusjwt.SdtJWTOptions(remoteHandle, context);
      AV21DateUtil = new com.securityapi.genexusjwt.deprecated.SdtDateUtil(remoteHandle, context);
      AV15PrivateClaims = new com.securityapi.genexusjwt.SdtPrivateClaims(remoteHandle, context);
      AV20JWTCreator = new com.securityapi.genexusjwt.SdtJWTCreator(remoteHandle, context);
      /* GeneXus formulas. */
   }

   private boolean AV26Success ;
   private String AV16Token ;
   private String AV22Usuario ;
   private String AV24Senha ;
   private String AV13SymmetricKey ;
   private com.securityapi.genexusjwt.deprecated.SdtDateUtil AV21DateUtil ;
   private com.securityapi.genexusjwt.SdtJWTCreator AV20JWTCreator ;
   private boolean[] aP3 ;
   private String[] aP2 ;
   private com.securityapi.genexusjwt.SdtPrivateClaims AV15PrivateClaims ;
   private com.securityapi.genexusjwt.SdtJWTOptions AV14JWTOptions ;
}

