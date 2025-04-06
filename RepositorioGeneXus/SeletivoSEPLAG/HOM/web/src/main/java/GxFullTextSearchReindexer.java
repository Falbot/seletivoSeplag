import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class GxFullTextSearchReindexer
{
   public static int Reindex( int remoteHandle )
   {
      GxSilentTrnSdt obj;
      IGxSilentTrn trn;
      boolean result;
      obj = new Sdtcidade(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new Sdtunidade(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new Sdtpessoa(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new Sdtendereco(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new Sdtlotacao(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new Sdtservidor_temporario(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new Sdtunidade_endereco(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new Sdtfoto_pessoa(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new Sdtservidor_efetivo(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new Sdtpessoa_endereco(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      return 1 ;
   }

}

