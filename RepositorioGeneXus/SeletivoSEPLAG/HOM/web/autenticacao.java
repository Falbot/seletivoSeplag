import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class autenticacao extends GXProcedure
{
   public autenticacao( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( autenticacao.class ), "" );
   }

   public autenticacao( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void e11092( )
   {
      /* Token_After Routine */
      returnInSub = false ;
      System.out.println( "After pGerarToken" );
      Gx_restcode = (short)(200) ;
   }

   public void gxep_token__post( String in_AV5Usuario ,
                                 String in_AV6Senha ,
                                 String [] arr_AV12Token ,
                                 boolean [] arr_AV15Success )
   {
      this.AV5Usuario = in_AV5Usuario;
      this.AV6Senha = in_AV6Senha;
      initialize();
      initialized = (short)(1) ;
      arr_AV12Token[0] = this.AV12Token;
      arr_AV15Success[0] = this.AV15Success;
      /* Token__post Constructor */
      GXv_char1[0] = AV12Token ;
      GXv_boolean2[0] = AV15Success ;
      new pgerartoken(remoteHandle, context).execute( AV5Usuario, AV6Senha, GXv_char1, GXv_boolean2) ;
      this.AV12Token = GXv_char1[0] ;
      this.AV15Success = GXv_boolean2[0] ;
      e11092 ();
      if ( returnInSub )
      {
         arr_AV12Token[0] = this.AV12Token;
         arr_AV15Success[0] = this.AV15Success;
         return;
      }
      arr_AV12Token[0] = this.AV12Token;
      arr_AV15Success[0] = this.AV15Success;
   }

   public void gxep_refreshtoken__post( String in_AV12Token ,
                                        String [] arr_AV14RefreshToken ,
                                        boolean [] arr_AV15Success )
   {
      this.AV12Token = in_AV12Token;
      initialize();
      initialized = (short)(1) ;
      arr_AV14RefreshToken[0] = this.AV14RefreshToken;
      arr_AV15Success[0] = this.AV15Success;
      /* RefreshToken__post Constructor */
      GXv_char1[0] = AV14RefreshToken ;
      GXv_boolean2[0] = AV15Success ;
      new pgerarrefreshtoken(remoteHandle, context).execute( AV12Token, GXv_char1, GXv_boolean2) ;
      this.AV14RefreshToken = GXv_char1[0] ;
      this.AV15Success = GXv_boolean2[0] ;
      arr_AV14RefreshToken[0] = this.AV14RefreshToken;
      arr_AV15Success[0] = this.AV15Success;
   }

   public short getrestcode( )
   {
      return Gx_restcode ;
   }

   protected void cleanup( )
   {
      if ( initialized != 1 )
      {
      }
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14RefreshToken = "" ;
      GXv_char1 = new String[1] ;
      GXv_boolean2 = new boolean[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   protected short Gx_restcode ;
   protected short initialized ;
   protected short Gx_err ;
   protected String GXv_char1[] ;
   protected boolean returnInSub ;
   protected boolean AV15Success ;
   protected boolean GXv_boolean2[] ;
   protected String AV12Token ;
   protected String AV14RefreshToken ;
   protected String AV5Usuario ;
   protected String AV6Senha ;
   protected String[] arr_AV12Token ;
   protected boolean[] arr_AV15Success ;
   protected String[] arr_AV14RefreshToken ;
}

