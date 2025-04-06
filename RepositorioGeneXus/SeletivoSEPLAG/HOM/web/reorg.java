import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.util.*;

public final  class reorg extends GXProcedure
{
   public reorg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( reorg.class ), "" );
   }

   public reorg( int remoteHandle ,
                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      SetCreateDataBase( ) ;
      DBConnectionManager.StartCreateDataBase( ) ;
      CreateDataBase( ) ;
      if ( previousCheck() )
      {
         executeReorganization( ) ;
      }
   }

   private void CreateDataBase( )
   {
      DS = DBConnection.getDataStore( "Default", remoteHandle) ;
      ErrCode = DS.connectDontShowErrors() ;
      DataBaseName = DS.getDatabasename() ;
      DBURLName = DS.getJdbcdriverurl() ;
      if ( ErrCode != 0 )
      {
         DS.setDatabasename( "postgres" );
         ErrCode = DS.connect() ;
         if ( ErrCode == 0 )
         {
            try
            {
               GXReorganization.addMsg( localUtil.getMessages().getMessage("GXM_dbcrea")+ " " +DataBaseName );
               cmdBuffer = "CREATE DATABASE " + "\"" + DataBaseName + "\"" ;
               ExecuteDirectSQL.execute(context, remoteHandle, "DEFAULT", cmdBuffer) ;
               Count = (byte)(1) ;
            }
            catch ( Exception ex )
            {
               ErrCode = (short)(1) ;
               ErrMsg = DS.getErrDescription() ;
               GXReorganization.addMsg( ErrMsg );
            }
            ErrCode = DS.disconnect() ;
            DS.setJdbcdriverurl( DBURLName );
            ErrCode = DS.connectDontShowErrors() ;
            while ( ( ErrCode != 0 ) && ( Count > 0 ) && ( Count < 30 ) )
            {
               Res = GXutil.sleep( 1) ;
               if ( Count == 29 )
               {
                  ErrCode = DS.connect() ;
               }
               else
               {
                  ErrCode = DS.connectDontShowErrors() ;
               }
               Count = (byte)(Count+1) ;
            }
         }
         if ( ErrCode != 0 )
         {
            ErrMsg = DS.getErrDescription() ;
            GXReorganization.addMsg( ErrMsg );
            ErrCode = (short)(1) ;
         }
      }
      DBConnectionManager.EndCreateDataBase( ) ;
   }

   private void FirstActions( )
   {
      /* Load data into tables. */
   }

   public void Createunidade_endereco( ) throws SQLException
   {
      String cmdBufferCreate = "";
      String cmdBuffer = "";
      /* Indices for table unidade_endereco */
      try
      {
         cmdBufferCreate = " CREATE TABLE unidade_endereco (unid_id smallint NOT NULL , end_id smallint NOT NULL , PRIMARY KEY(unid_id, end_id))  ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " DROP TABLE unidade_endereco CASCADE ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
            try
            {
               cmdBuffer = " DROP VIEW unidade_endereco CASCADE ";
               ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
            }
            catch(SQLException sqlex2)
            {
               try
               {
                  cmdBuffer = " DROP FUNCTION unidade_endereco CASCADE ";
                  ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
               }
               catch(SQLException sqlex3)
               {
               }
            }
         }
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      try
      {
         cmdBuffer = " CREATE INDEX IUNIDADE_ENDERECO1 ON unidade_endereco (end_id ) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         cmdBuffer = " DROP INDEX IUNIDADE_ENDERECO1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         cmdBuffer = " CREATE INDEX IUNIDADE_ENDERECO1 ON unidade_endereco (end_id ) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   public void Createservidor_temporario( ) throws SQLException
   {
      String cmdBufferCreate = "";
      String cmdBuffer = "";
      /* Indices for table servidor_temporario */
      try
      {
         cmdBufferCreate = " CREATE TABLE servidor_temporario (pes_id smallint NOT NULL , st_data_admissao date NOT NULL , st_data_demissao date NOT NULL , PRIMARY KEY(pes_id, st_data_admissao)) ";
         cmdBufferCreate += "   ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " DROP TABLE servidor_temporario CASCADE ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
            try
            {
               cmdBuffer = " DROP VIEW servidor_temporario CASCADE ";
               ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
            }
            catch(SQLException sqlex2)
            {
               try
               {
                  cmdBuffer = " DROP FUNCTION servidor_temporario CASCADE ";
                  ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
               }
               catch(SQLException sqlex3)
               {
               }
            }
         }
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
   }

   public void Createservidor_efetivo( ) throws SQLException
   {
      String cmdBufferCreate = "";
      String cmdBuffer = "";
      /* Indices for table servidor_efetivo */
      try
      {
         cmdBufferCreate = " CREATE TABLE servidor_efetivo (pes_id smallint NOT NULL , se_matricula VARCHAR(20) NOT NULL , PRIMARY KEY(pes_id, se_matricula))  ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " DROP TABLE servidor_efetivo CASCADE ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
            try
            {
               cmdBuffer = " DROP VIEW servidor_efetivo CASCADE ";
               ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
            }
            catch(SQLException sqlex2)
            {
               try
               {
                  cmdBuffer = " DROP FUNCTION servidor_efetivo CASCADE ";
                  ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
               }
               catch(SQLException sqlex3)
               {
               }
            }
         }
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      try
      {
         cmdBuffer = " CREATE UNIQUE INDEX USERVIDOR_EFETIVO ON servidor_efetivo (se_matricula ) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         cmdBuffer = " DROP INDEX USERVIDOR_EFETIVO ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         cmdBuffer = " CREATE UNIQUE INDEX USERVIDOR_EFETIVO ON servidor_efetivo (se_matricula ) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   public void Createpessoa_endereco( ) throws SQLException
   {
      String cmdBufferCreate = "";
      String cmdBuffer = "";
      /* Indices for table pessoa_endereco */
      try
      {
         cmdBufferCreate = " CREATE TABLE pessoa_endereco (pes_id smallint NOT NULL , end_id smallint NOT NULL , PRIMARY KEY(pes_id, end_id))  ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " DROP TABLE pessoa_endereco CASCADE ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
            try
            {
               cmdBuffer = " DROP VIEW pessoa_endereco CASCADE ";
               ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
            }
            catch(SQLException sqlex2)
            {
               try
               {
                  cmdBuffer = " DROP FUNCTION pessoa_endereco CASCADE ";
                  ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
               }
               catch(SQLException sqlex3)
               {
               }
            }
         }
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      try
      {
         cmdBuffer = " CREATE INDEX IPESSOA_ENDERECO1 ON pessoa_endereco (end_id ) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         cmdBuffer = " DROP INDEX IPESSOA_ENDERECO1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         cmdBuffer = " CREATE INDEX IPESSOA_ENDERECO1 ON pessoa_endereco (end_id ) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   public void Createlotacao( ) throws SQLException
   {
      String cmdBufferCreate = "";
      String cmdBuffer = "";
      /* Indices for table lotacao */
      try
      {
         cmdBuffer = " CREATE SEQUENCE lot_id MINVALUE 1 INCREMENT 1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         cmdBuffer = " DROP SEQUENCE lot_id CASCADE ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         cmdBuffer = " CREATE SEQUENCE lot_id MINVALUE 1 INCREMENT 1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      try
      {
         cmdBufferCreate = " CREATE TABLE lotacao (lot_id smallint NOT NULL DEFAULT nextval('lot_id'), pes_id smallint NOT NULL , unid_id smallint NOT NULL , lot_data_lotacao date NOT NULL , ";
         cmdBufferCreate += "  lot_data_remocao date NOT NULL , lot_portaria VARCHAR(100) NOT NULL , PRIMARY KEY(lot_id))  ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " DROP TABLE lotacao CASCADE ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
            try
            {
               cmdBuffer = " DROP VIEW lotacao CASCADE ";
               ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
            }
            catch(SQLException sqlex2)
            {
               try
               {
                  cmdBuffer = " DROP FUNCTION lotacao CASCADE ";
                  ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
               }
               catch(SQLException sqlex3)
               {
               }
            }
         }
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      try
      {
         cmdBuffer = " CREATE INDEX ILOTACAO1 ON lotacao (unid_id ) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         cmdBuffer = " DROP INDEX ILOTACAO1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         cmdBuffer = " CREATE INDEX ILOTACAO1 ON lotacao (unid_id ) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      try
      {
         cmdBuffer = " CREATE INDEX ILOTACAO2 ON lotacao (pes_id ) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         cmdBuffer = " DROP INDEX ILOTACAO2 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         cmdBuffer = " CREATE INDEX ILOTACAO2 ON lotacao (pes_id ) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   public void Createfoto_pessoa( ) throws SQLException
   {
      String cmdBufferCreate = "";
      String cmdBuffer = "";
      /* Indices for table foto_pessoa */
      try
      {
         cmdBuffer = " CREATE SEQUENCE fp_id MINVALUE 1 INCREMENT 1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         cmdBuffer = " DROP SEQUENCE fp_id CASCADE ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         cmdBuffer = " CREATE SEQUENCE fp_id MINVALUE 1 INCREMENT 1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      try
      {
         cmdBufferCreate = " CREATE TABLE foto_pessoa (fp_id smallint NOT NULL DEFAULT nextval('fp_id'), pes_id smallint NOT NULL , fp_data date NOT NULL , fp_bucket VARCHAR(50) NOT NULL , fp_hash ";
         cmdBufferCreate += "  VARCHAR(50) NOT NULL , PRIMARY KEY(fp_id))  ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " DROP TABLE foto_pessoa CASCADE ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
            try
            {
               cmdBuffer = " DROP VIEW foto_pessoa CASCADE ";
               ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
            }
            catch(SQLException sqlex2)
            {
               try
               {
                  cmdBuffer = " DROP FUNCTION foto_pessoa CASCADE ";
                  ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
               }
               catch(SQLException sqlex3)
               {
               }
            }
         }
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      try
      {
         cmdBuffer = " CREATE INDEX IFOTO_PESSOA1 ON foto_pessoa (pes_id ) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         cmdBuffer = " DROP INDEX IFOTO_PESSOA1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         cmdBuffer = " CREATE INDEX IFOTO_PESSOA1 ON foto_pessoa (pes_id ) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   public void Createendereco( ) throws SQLException
   {
      String cmdBufferCreate = "";
      String cmdBuffer = "";
      /* Indices for table endereco */
      try
      {
         cmdBuffer = " CREATE SEQUENCE end_id MINVALUE 1 INCREMENT 1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         cmdBuffer = " DROP SEQUENCE end_id CASCADE ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         cmdBuffer = " CREATE SEQUENCE end_id MINVALUE 1 INCREMENT 1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      try
      {
         cmdBufferCreate = " CREATE TABLE endereco (end_id smallint NOT NULL DEFAULT nextval('end_id'), end_tipo_logradouro VARCHAR(50) NOT NULL , end_logradouro VARCHAR(200) NOT NULL , end_numero ";
         cmdBufferCreate += "  bigint NOT NULL , end_bairro VARCHAR(100) NOT NULL , cid_id smallint NOT NULL , PRIMARY KEY(end_id))  ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " DROP TABLE endereco CASCADE ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
            try
            {
               cmdBuffer = " DROP VIEW endereco CASCADE ";
               ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
            }
            catch(SQLException sqlex2)
            {
               try
               {
                  cmdBuffer = " DROP FUNCTION endereco CASCADE ";
                  ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
               }
               catch(SQLException sqlex3)
               {
               }
            }
         }
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      try
      {
         cmdBuffer = " CREATE INDEX IENDERECO1 ON endereco (cid_id ) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         cmdBuffer = " DROP INDEX IENDERECO1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         cmdBuffer = " CREATE INDEX IENDERECO1 ON endereco (cid_id ) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   public void Createpessoa( ) throws SQLException
   {
      String cmdBufferCreate = "";
      String cmdBuffer = "";
      /* Indices for table pessoa */
      try
      {
         cmdBuffer = " CREATE SEQUENCE pes_id MINVALUE 1 INCREMENT 1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         cmdBuffer = " DROP SEQUENCE pes_id CASCADE ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         cmdBuffer = " CREATE SEQUENCE pes_id MINVALUE 1 INCREMENT 1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      try
      {
         cmdBufferCreate = " CREATE TABLE pessoa (pes_id smallint NOT NULL DEFAULT nextval('pes_id'), pes_nome VARCHAR(200) NOT NULL , pes_data_nascimento date NOT NULL , pes_sexo VARCHAR(9) ";
         cmdBufferCreate += "  NOT NULL , pes_mae VARCHAR(200) NOT NULL , pes_pai VARCHAR(200) NOT NULL , PRIMARY KEY(pes_id))  ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " DROP TABLE pessoa CASCADE ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
            try
            {
               cmdBuffer = " DROP VIEW pessoa CASCADE ";
               ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
            }
            catch(SQLException sqlex2)
            {
               try
               {
                  cmdBuffer = " DROP FUNCTION pessoa CASCADE ";
                  ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
               }
               catch(SQLException sqlex3)
               {
               }
            }
         }
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
   }

   public void Createunidade( ) throws SQLException
   {
      String cmdBufferCreate = "";
      String cmdBuffer = "";
      /* Indices for table unidade */
      try
      {
         cmdBuffer = " CREATE SEQUENCE unid_id MINVALUE 1 INCREMENT 1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         cmdBuffer = " DROP SEQUENCE unid_id CASCADE ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         cmdBuffer = " CREATE SEQUENCE unid_id MINVALUE 1 INCREMENT 1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      try
      {
         cmdBufferCreate = " CREATE TABLE unidade (unid_id smallint NOT NULL DEFAULT nextval('unid_id'), unid_nome VARCHAR(200) NOT NULL , unid_sigla VARCHAR(20) NOT NULL , PRIMARY KEY(unid_id)) ";
         cmdBufferCreate += "   ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " DROP TABLE unidade CASCADE ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
            try
            {
               cmdBuffer = " DROP VIEW unidade CASCADE ";
               ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
            }
            catch(SQLException sqlex2)
            {
               try
               {
                  cmdBuffer = " DROP FUNCTION unidade CASCADE ";
                  ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
               }
               catch(SQLException sqlex3)
               {
               }
            }
         }
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
   }

   public void Createcidade( ) throws SQLException
   {
      String cmdBufferCreate = "";
      String cmdBuffer = "";
      /* Indices for table cidade */
      try
      {
         cmdBuffer = " CREATE SEQUENCE cid_id MINVALUE 1 INCREMENT 1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         cmdBuffer = " DROP SEQUENCE cid_id CASCADE ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         cmdBuffer = " CREATE SEQUENCE cid_id MINVALUE 1 INCREMENT 1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      try
      {
         cmdBufferCreate = " CREATE TABLE cidade (cid_id smallint NOT NULL DEFAULT nextval('cid_id'), cid_nome VARCHAR(200) NOT NULL , cid_uf CHAR(2) NOT NULL , PRIMARY KEY(cid_id))  ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " DROP TABLE cidade CASCADE ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
            try
            {
               cmdBuffer = " DROP VIEW cidade CASCADE ";
               ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
            }
            catch(SQLException sqlex2)
            {
               try
               {
                  cmdBuffer = " DROP FUNCTION cidade CASCADE ";
                  ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
               }
               catch(SQLException sqlex3)
               {
               }
            }
         }
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
   }

   public void RIenderecocidade( ) throws SQLException
   {
      String cmdBuffer;
      try
      {
         cmdBuffer = " ALTER TABLE endereco ADD CONSTRAINT IENDERECO1 FOREIGN KEY (cid_id) REFERENCES cidade (cid_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " ALTER TABLE endereco DROP CONSTRAINT IENDERECO1 ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
         }
         cmdBuffer = " ALTER TABLE endereco ADD CONSTRAINT IENDERECO1 FOREIGN KEY (cid_id) REFERENCES cidade (cid_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   public void RIfoto_pessoapessoa( ) throws SQLException
   {
      String cmdBuffer;
      try
      {
         cmdBuffer = " ALTER TABLE foto_pessoa ADD CONSTRAINT IFOTO_PESSOA1 FOREIGN KEY (pes_id) REFERENCES pessoa (pes_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " ALTER TABLE foto_pessoa DROP CONSTRAINT IFOTO_PESSOA1 ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
         }
         cmdBuffer = " ALTER TABLE foto_pessoa ADD CONSTRAINT IFOTO_PESSOA1 FOREIGN KEY (pes_id) REFERENCES pessoa (pes_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   public void RIlotacaopessoa( ) throws SQLException
   {
      String cmdBuffer;
      try
      {
         cmdBuffer = " ALTER TABLE lotacao ADD CONSTRAINT ILOTACAO2 FOREIGN KEY (pes_id) REFERENCES pessoa (pes_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " ALTER TABLE lotacao DROP CONSTRAINT ILOTACAO2 ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
         }
         cmdBuffer = " ALTER TABLE lotacao ADD CONSTRAINT ILOTACAO2 FOREIGN KEY (pes_id) REFERENCES pessoa (pes_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   public void RIlotacaounidade( ) throws SQLException
   {
      String cmdBuffer;
      try
      {
         cmdBuffer = " ALTER TABLE lotacao ADD CONSTRAINT ILOTACAO1 FOREIGN KEY (unid_id) REFERENCES unidade (unid_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " ALTER TABLE lotacao DROP CONSTRAINT ILOTACAO1 ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
         }
         cmdBuffer = " ALTER TABLE lotacao ADD CONSTRAINT ILOTACAO1 FOREIGN KEY (unid_id) REFERENCES unidade (unid_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   public void RIpessoa_enderecopessoa( ) throws SQLException
   {
      String cmdBuffer;
      try
      {
         cmdBuffer = " ALTER TABLE pessoa_endereco ADD CONSTRAINT IPESSOA_ENDERECO2 FOREIGN KEY (pes_id) REFERENCES pessoa (pes_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " ALTER TABLE pessoa_endereco DROP CONSTRAINT IPESSOA_ENDERECO2 ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
         }
         cmdBuffer = " ALTER TABLE pessoa_endereco ADD CONSTRAINT IPESSOA_ENDERECO2 FOREIGN KEY (pes_id) REFERENCES pessoa (pes_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   public void RIpessoa_enderecoendereco( ) throws SQLException
   {
      String cmdBuffer;
      try
      {
         cmdBuffer = " ALTER TABLE pessoa_endereco ADD CONSTRAINT IPESSOA_ENDERECO1 FOREIGN KEY (end_id) REFERENCES endereco (end_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " ALTER TABLE pessoa_endereco DROP CONSTRAINT IPESSOA_ENDERECO1 ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
         }
         cmdBuffer = " ALTER TABLE pessoa_endereco ADD CONSTRAINT IPESSOA_ENDERECO1 FOREIGN KEY (end_id) REFERENCES endereco (end_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   public void RIservidor_efetivopessoa( ) throws SQLException
   {
      String cmdBuffer;
      try
      {
         cmdBuffer = " ALTER TABLE servidor_efetivo ADD CONSTRAINT ISERVIDOR_EFETIVO1 FOREIGN KEY (pes_id) REFERENCES pessoa (pes_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " ALTER TABLE servidor_efetivo DROP CONSTRAINT ISERVIDOR_EFETIVO1 ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
         }
         cmdBuffer = " ALTER TABLE servidor_efetivo ADD CONSTRAINT ISERVIDOR_EFETIVO1 FOREIGN KEY (pes_id) REFERENCES pessoa (pes_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   public void RIservidor_temporariopessoa( ) throws SQLException
   {
      String cmdBuffer;
      try
      {
         cmdBuffer = " ALTER TABLE servidor_temporario ADD CONSTRAINT ISERVIDOR_TEMPORARIO1 FOREIGN KEY (pes_id) REFERENCES pessoa (pes_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " ALTER TABLE servidor_temporario DROP CONSTRAINT ISERVIDOR_TEMPORARIO1 ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
         }
         cmdBuffer = " ALTER TABLE servidor_temporario ADD CONSTRAINT ISERVIDOR_TEMPORARIO1 FOREIGN KEY (pes_id) REFERENCES pessoa (pes_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   public void RIunidade_enderecounidade( ) throws SQLException
   {
      String cmdBuffer;
      try
      {
         cmdBuffer = " ALTER TABLE unidade_endereco ADD CONSTRAINT IUNIDADE_ENDERECO2 FOREIGN KEY (unid_id) REFERENCES unidade (unid_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " ALTER TABLE unidade_endereco DROP CONSTRAINT IUNIDADE_ENDERECO2 ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
         }
         cmdBuffer = " ALTER TABLE unidade_endereco ADD CONSTRAINT IUNIDADE_ENDERECO2 FOREIGN KEY (unid_id) REFERENCES unidade (unid_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   public void RIunidade_enderecoendereco( ) throws SQLException
   {
      String cmdBuffer;
      try
      {
         cmdBuffer = " ALTER TABLE unidade_endereco ADD CONSTRAINT IUNIDADE_ENDERECO1 FOREIGN KEY (end_id) REFERENCES endereco (end_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " ALTER TABLE unidade_endereco DROP CONSTRAINT IUNIDADE_ENDERECO1 ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
         }
         cmdBuffer = " ALTER TABLE unidade_endereco ADD CONSTRAINT IUNIDADE_ENDERECO1 FOREIGN KEY (end_id) REFERENCES endereco (end_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   private void tablesCount( )
   {
   }

   private boolean previousCheck( )
   {
      if ( ! GXReorganization.mustRunCheck( ) )
      {
         return true ;
      }
      sSchemaVar = context.getUserId( "Server", remoteHandle, pr_default) ;
      return true ;
   }

   private void executeOnlyTablesReorganization( )
   {
      callSubmit( "Createunidade_endereco" ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"unidade_endereco",""}) ,  1 , new Object[]{ });
      callSubmit( "Createservidor_temporario" ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"servidor_temporario",""}) ,  2 , new Object[]{ });
      callSubmit( "Createservidor_efetivo" ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"servidor_efetivo",""}) ,  3 , new Object[]{ });
      callSubmit( "Createpessoa_endereco" ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"pessoa_endereco",""}) ,  4 , new Object[]{ });
      callSubmit( "Createlotacao" ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"lotacao",""}) ,  5 , new Object[]{ });
      callSubmit( "Createfoto_pessoa" ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"foto_pessoa",""}) ,  6 , new Object[]{ });
      callSubmit( "Createendereco" ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"endereco",""}) ,  7 , new Object[]{ });
      callSubmit( "Createpessoa" ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"pessoa",""}) ,  8 , new Object[]{ });
      callSubmit( "Createunidade" ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"unidade",""}) ,  9 , new Object[]{ });
      callSubmit( "Createcidade" ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"cidade",""}) ,  10 , new Object[]{ });
   }

   private void executeOnlyRisReorganization( )
   {
      callSubmit( "RIenderecocidade" ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IENDERECO1"}) ,  11 , new Object[]{ });
      callSubmit( "RIfoto_pessoapessoa" ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IFOTO_PESSOA1"}) ,  12 , new Object[]{ });
      callSubmit( "RIlotacaopessoa" ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ILOTACAO2"}) ,  13 , new Object[]{ });
      callSubmit( "RIlotacaounidade" ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ILOTACAO1"}) ,  14 , new Object[]{ });
      callSubmit( "RIpessoa_enderecopessoa" ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IPESSOA_ENDERECO2"}) ,  15 , new Object[]{ });
      callSubmit( "RIpessoa_enderecoendereco" ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IPESSOA_ENDERECO1"}) ,  16 , new Object[]{ });
      callSubmit( "RIservidor_efetivopessoa" ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ISERVIDOR_EFETIVO1"}) ,  17 , new Object[]{ });
      callSubmit( "RIservidor_temporariopessoa" ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ISERVIDOR_TEMPORARIO1"}) ,  18 , new Object[]{ });
      callSubmit( "RIunidade_enderecounidade" ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IUNIDADE_ENDERECO2"}) ,  19 , new Object[]{ });
      callSubmit( "RIunidade_enderecoendereco" ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IUNIDADE_ENDERECO1"}) ,  20 , new Object[]{ });
   }

   private void executeTablesReorganization( )
   {
      executeOnlyTablesReorganization( ) ;
      executeOnlyRisReorganization( ) ;
      ReorgSubmitThreadPool.startProcess();
   }

   private void setPrecedence( )
   {
      setPrecedencetables( ) ;
      setPrecedenceris( ) ;
   }

   private void setPrecedencetables( )
   {
      GXReorganization.addMsg( 1 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"unidade_endereco",""}) );
      ReorgSubmitThreadPool.addBlock( "Createunidade_endereco" );
      ReorgSubmitThreadPool.addPrecedence( "Createunidade_endereco" ,  "Createunidade" );
      ReorgSubmitThreadPool.addPrecedence( "Createunidade_endereco" ,  "Createendereco" );
      GXReorganization.addMsg( 2 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"servidor_temporario",""}) );
      ReorgSubmitThreadPool.addBlock( "Createservidor_temporario" );
      ReorgSubmitThreadPool.addPrecedence( "Createservidor_temporario" ,  "Createpessoa" );
      GXReorganization.addMsg( 3 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"servidor_efetivo",""}) );
      ReorgSubmitThreadPool.addBlock( "Createservidor_efetivo" );
      ReorgSubmitThreadPool.addPrecedence( "Createservidor_efetivo" ,  "Createpessoa" );
      GXReorganization.addMsg( 4 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"pessoa_endereco",""}) );
      ReorgSubmitThreadPool.addBlock( "Createpessoa_endereco" );
      ReorgSubmitThreadPool.addPrecedence( "Createpessoa_endereco" ,  "Createpessoa" );
      ReorgSubmitThreadPool.addPrecedence( "Createpessoa_endereco" ,  "Createendereco" );
      GXReorganization.addMsg( 5 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"lotacao",""}) );
      ReorgSubmitThreadPool.addBlock( "Createlotacao" );
      ReorgSubmitThreadPool.addPrecedence( "Createlotacao" ,  "Createpessoa" );
      ReorgSubmitThreadPool.addPrecedence( "Createlotacao" ,  "Createunidade" );
      GXReorganization.addMsg( 6 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"foto_pessoa",""}) );
      ReorgSubmitThreadPool.addBlock( "Createfoto_pessoa" );
      ReorgSubmitThreadPool.addPrecedence( "Createfoto_pessoa" ,  "Createpessoa" );
      GXReorganization.addMsg( 7 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"endereco",""}) );
      ReorgSubmitThreadPool.addBlock( "Createendereco" );
      ReorgSubmitThreadPool.addPrecedence( "Createendereco" ,  "Createcidade" );
      GXReorganization.addMsg( 8 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"pessoa",""}) );
      ReorgSubmitThreadPool.addBlock( "Createpessoa" );
      GXReorganization.addMsg( 9 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"unidade",""}) );
      ReorgSubmitThreadPool.addBlock( "Createunidade" );
      GXReorganization.addMsg( 10 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"cidade",""}) );
      ReorgSubmitThreadPool.addBlock( "Createcidade" );
   }

   private void setPrecedenceris( )
   {
      GXReorganization.addMsg( 11 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IENDERECO1"}) );
      ReorgSubmitThreadPool.addBlock( "RIenderecocidade" );
      ReorgSubmitThreadPool.addPrecedence( "RIenderecocidade" ,  "Createendereco" );
      ReorgSubmitThreadPool.addPrecedence( "RIenderecocidade" ,  "Createcidade" );
      GXReorganization.addMsg( 12 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IFOTO_PESSOA1"}) );
      ReorgSubmitThreadPool.addBlock( "RIfoto_pessoapessoa" );
      ReorgSubmitThreadPool.addPrecedence( "RIfoto_pessoapessoa" ,  "Createfoto_pessoa" );
      ReorgSubmitThreadPool.addPrecedence( "RIfoto_pessoapessoa" ,  "Createpessoa" );
      GXReorganization.addMsg( 13 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ILOTACAO2"}) );
      ReorgSubmitThreadPool.addBlock( "RIlotacaopessoa" );
      ReorgSubmitThreadPool.addPrecedence( "RIlotacaopessoa" ,  "Createlotacao" );
      ReorgSubmitThreadPool.addPrecedence( "RIlotacaopessoa" ,  "Createpessoa" );
      GXReorganization.addMsg( 14 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ILOTACAO1"}) );
      ReorgSubmitThreadPool.addBlock( "RIlotacaounidade" );
      ReorgSubmitThreadPool.addPrecedence( "RIlotacaounidade" ,  "Createlotacao" );
      ReorgSubmitThreadPool.addPrecedence( "RIlotacaounidade" ,  "Createunidade" );
      GXReorganization.addMsg( 15 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IPESSOA_ENDERECO2"}) );
      ReorgSubmitThreadPool.addBlock( "RIpessoa_enderecopessoa" );
      ReorgSubmitThreadPool.addPrecedence( "RIpessoa_enderecopessoa" ,  "Createpessoa_endereco" );
      ReorgSubmitThreadPool.addPrecedence( "RIpessoa_enderecopessoa" ,  "Createpessoa" );
      GXReorganization.addMsg( 16 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IPESSOA_ENDERECO1"}) );
      ReorgSubmitThreadPool.addBlock( "RIpessoa_enderecoendereco" );
      ReorgSubmitThreadPool.addPrecedence( "RIpessoa_enderecoendereco" ,  "Createpessoa_endereco" );
      ReorgSubmitThreadPool.addPrecedence( "RIpessoa_enderecoendereco" ,  "Createendereco" );
      GXReorganization.addMsg( 17 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ISERVIDOR_EFETIVO1"}) );
      ReorgSubmitThreadPool.addBlock( "RIservidor_efetivopessoa" );
      ReorgSubmitThreadPool.addPrecedence( "RIservidor_efetivopessoa" ,  "Createservidor_efetivo" );
      ReorgSubmitThreadPool.addPrecedence( "RIservidor_efetivopessoa" ,  "Createpessoa" );
      GXReorganization.addMsg( 18 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ISERVIDOR_TEMPORARIO1"}) );
      ReorgSubmitThreadPool.addBlock( "RIservidor_temporariopessoa" );
      ReorgSubmitThreadPool.addPrecedence( "RIservidor_temporariopessoa" ,  "Createservidor_temporario" );
      ReorgSubmitThreadPool.addPrecedence( "RIservidor_temporariopessoa" ,  "Createpessoa" );
      GXReorganization.addMsg( 19 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IUNIDADE_ENDERECO2"}) );
      ReorgSubmitThreadPool.addBlock( "RIunidade_enderecounidade" );
      ReorgSubmitThreadPool.addPrecedence( "RIunidade_enderecounidade" ,  "Createunidade_endereco" );
      ReorgSubmitThreadPool.addPrecedence( "RIunidade_enderecounidade" ,  "Createunidade" );
      GXReorganization.addMsg( 20 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IUNIDADE_ENDERECO1"}) );
      ReorgSubmitThreadPool.addBlock( "RIunidade_enderecoendereco" );
      ReorgSubmitThreadPool.addPrecedence( "RIunidade_enderecoendereco" ,  "Createunidade_endereco" );
      ReorgSubmitThreadPool.addPrecedence( "RIunidade_enderecoendereco" ,  "Createendereco" );
   }

   private void executeReorganization( )
   {
      if ( ErrCode == 0 )
      {
         tablesCount( ) ;
         if ( ! GXReorganization.getRecordCount( ) )
         {
            FirstActions( ) ;
            setPrecedence( ) ;
            executeTablesReorganization( ) ;
         }
      }
   }

   public void UtilsCleanup( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void submitReorg( int submitId ,
                            Object [] submitParms ) throws SQLException
   {
      UserInformation submitUI = Application.getConnectionManager().createUserInformation(Namespace.getNamespace(context.getNAME_SPACE()));
      switch ( submitId )
      {
            case 1 :
               GXReorganization.replaceMsg( 1 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"unidade_endereco",""})+" STARTED" );
               Createunidade_endereco( ) ;
               GXReorganization.replaceMsg( 1 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"unidade_endereco",""})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 2 :
               GXReorganization.replaceMsg( 2 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"servidor_temporario",""})+" STARTED" );
               Createservidor_temporario( ) ;
               GXReorganization.replaceMsg( 2 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"servidor_temporario",""})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 3 :
               GXReorganization.replaceMsg( 3 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"servidor_efetivo",""})+" STARTED" );
               Createservidor_efetivo( ) ;
               GXReorganization.replaceMsg( 3 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"servidor_efetivo",""})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 4 :
               GXReorganization.replaceMsg( 4 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"pessoa_endereco",""})+" STARTED" );
               Createpessoa_endereco( ) ;
               GXReorganization.replaceMsg( 4 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"pessoa_endereco",""})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 5 :
               GXReorganization.replaceMsg( 5 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"lotacao",""})+" STARTED" );
               Createlotacao( ) ;
               GXReorganization.replaceMsg( 5 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"lotacao",""})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 6 :
               GXReorganization.replaceMsg( 6 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"foto_pessoa",""})+" STARTED" );
               Createfoto_pessoa( ) ;
               GXReorganization.replaceMsg( 6 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"foto_pessoa",""})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 7 :
               GXReorganization.replaceMsg( 7 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"endereco",""})+" STARTED" );
               Createendereco( ) ;
               GXReorganization.replaceMsg( 7 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"endereco",""})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 8 :
               GXReorganization.replaceMsg( 8 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"pessoa",""})+" STARTED" );
               Createpessoa( ) ;
               GXReorganization.replaceMsg( 8 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"pessoa",""})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 9 :
               GXReorganization.replaceMsg( 9 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"unidade",""})+" STARTED" );
               Createunidade( ) ;
               GXReorganization.replaceMsg( 9 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"unidade",""})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 10 :
               GXReorganization.replaceMsg( 10 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"cidade",""})+" STARTED" );
               Createcidade( ) ;
               GXReorganization.replaceMsg( 10 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"cidade",""})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 11 :
               GXReorganization.replaceMsg( 11 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IENDERECO1"})+" STARTED" );
               RIenderecocidade( ) ;
               GXReorganization.replaceMsg( 11 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IENDERECO1"})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 12 :
               GXReorganization.replaceMsg( 12 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IFOTO_PESSOA1"})+" STARTED" );
               RIfoto_pessoapessoa( ) ;
               GXReorganization.replaceMsg( 12 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IFOTO_PESSOA1"})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 13 :
               GXReorganization.replaceMsg( 13 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ILOTACAO2"})+" STARTED" );
               RIlotacaopessoa( ) ;
               GXReorganization.replaceMsg( 13 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ILOTACAO2"})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 14 :
               GXReorganization.replaceMsg( 14 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ILOTACAO1"})+" STARTED" );
               RIlotacaounidade( ) ;
               GXReorganization.replaceMsg( 14 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ILOTACAO1"})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 15 :
               GXReorganization.replaceMsg( 15 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IPESSOA_ENDERECO2"})+" STARTED" );
               RIpessoa_enderecopessoa( ) ;
               GXReorganization.replaceMsg( 15 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IPESSOA_ENDERECO2"})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 16 :
               GXReorganization.replaceMsg( 16 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IPESSOA_ENDERECO1"})+" STARTED" );
               RIpessoa_enderecoendereco( ) ;
               GXReorganization.replaceMsg( 16 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IPESSOA_ENDERECO1"})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 17 :
               GXReorganization.replaceMsg( 17 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ISERVIDOR_EFETIVO1"})+" STARTED" );
               RIservidor_efetivopessoa( ) ;
               GXReorganization.replaceMsg( 17 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ISERVIDOR_EFETIVO1"})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 18 :
               GXReorganization.replaceMsg( 18 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ISERVIDOR_TEMPORARIO1"})+" STARTED" );
               RIservidor_temporariopessoa( ) ;
               GXReorganization.replaceMsg( 18 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ISERVIDOR_TEMPORARIO1"})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 19 :
               GXReorganization.replaceMsg( 19 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IUNIDADE_ENDERECO2"})+" STARTED" );
               RIunidade_enderecounidade( ) ;
               GXReorganization.replaceMsg( 19 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IUNIDADE_ENDERECO2"})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 20 :
               GXReorganization.replaceMsg( 20 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IUNIDADE_ENDERECO1"})+" STARTED" );
               RIunidade_enderecoendereco( ) ;
               GXReorganization.replaceMsg( 20 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"IUNIDADE_ENDERECO1"})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
      }
   }

   public void initialize( )
   {
      ErrMsg = "" ;
      DataBaseName = "" ;
      DBURLName = "" ;
      sSchemaVar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new reorg__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   protected byte Count ;
   protected byte Res ;
   protected short ErrCode ;
   protected String ErrMsg ;
   protected String DataBaseName ;
   protected String DBURLName ;
   protected String cmdBuffer ;
   protected String sSchemaVar ;
   protected com.genexus.db.DBConnection DS ;
   protected IDataStoreProvider pr_default ;
}

final  class reorg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

