CREATE SEQUENCE cid_id MINVALUE 1 INCREMENT 1;
CREATE TABLE cidade (
  cid_id   SMALLINT    NOT NULL    DEFAULT Nextval('cid_id'),
  cid_nome VARCHAR(200)    NOT NULL,
  cid_uf   CHAR(2)    NOT NULL,
     PRIMARY KEY ( cid_id ));

CREATE SEQUENCE unid_id MINVALUE 1 INCREMENT 1;
CREATE TABLE unidade (
  unid_id    SMALLINT    NOT NULL    DEFAULT Nextval('unid_id'),
  unid_nome  VARCHAR(200)    NOT NULL,
  unid_sigla VARCHAR(20)    NOT NULL,
     PRIMARY KEY ( unid_id ));	 

CREATE SEQUENCE pes_id MINVALUE 1 INCREMENT 1;
CREATE TABLE pessoa (
  pes_id              SMALLINT    NOT NULL    DEFAULT Nextval('pes_id'),
  pes_nome            VARCHAR(200)    NOT NULL,
  pes_data_nascimento DATE    NOT NULL,
  pes_sexo            VARCHAR(9)    NOT NULL,
  pes_mae             VARCHAR(200)    NOT NULL,
  pes_pai             VARCHAR(200)    NOT NULL,
     PRIMARY KEY ( pes_id ));

CREATE SEQUENCE end_id MINVALUE 1 INCREMENT 1;
CREATE TABLE endereco (
  end_id              SMALLINT    NOT NULL    DEFAULT Nextval('end_id'),
  end_tipo_logradouro VARCHAR(50)    NOT NULL,
  end_logradouro      VARCHAR(200)    NOT NULL,
  end_numero          BIGINT    NOT NULL,
  end_bairro          VARCHAR(100)    NOT NULL,
  cid_id              SMALLINT    NOT NULL,
     PRIMARY KEY ( end_id ));
CREATE INDEX IENDERECO1 ON endereco (
      cid_id);

CREATE SEQUENCE fp_id MINVALUE 1 INCREMENT 1;
CREATE TABLE foto_pessoa (
  fp_id     SMALLINT    NOT NULL    DEFAULT Nextval('fp_id'),
  pes_id    SMALLINT    NOT NULL,
  fp_data   DATE    NOT NULL,
  fp_bucket VARCHAR(50)    NOT NULL,
  fp_hash   VARCHAR(50)    NOT NULL,
     PRIMARY KEY ( fp_id ));
CREATE INDEX IFOTO_PESSOA1 ON foto_pessoa (
      pes_id);
ALTER TABLE foto_pessoa
 ADD CONSTRAINT IFOTO_PESSOA1 FOREIGN KEY ( pes_id ) REFERENCES pessoa(pes_id);

CREATE SEQUENCE lot_id MINVALUE 1 INCREMENT 1;
CREATE TABLE lotacao (
  lot_id           SMALLINT    NOT NULL    DEFAULT Nextval('lot_id'),
  pes_id           SMALLINT    NOT NULL,
  unid_id          SMALLINT    NOT NULL,
  lot_data_lotacao DATE    NOT NULL,
  lot_data_remocao DATE    NOT NULL,
  lot_portaria     VARCHAR(100)    NOT NULL,
     PRIMARY KEY ( lot_id ));
CREATE INDEX ILOTACAO1 ON lotacao (
      unid_id);
CREATE INDEX ILOTACAO2 ON lotacao (
      pes_id);
ALTER TABLE lotacao
 ADD CONSTRAINT ILOTACAO2 FOREIGN KEY ( pes_id ) REFERENCES pessoa(pes_id);
ALTER TABLE lotacao
 ADD CONSTRAINT ILOTACAO1 FOREIGN KEY ( unid_id ) REFERENCES unidade(unid_id);

CREATE TABLE pessoa_endereco (
  pes_id SMALLINT    NOT NULL,
  end_id SMALLINT    NOT NULL,
     PRIMARY KEY ( pes_id,end_id ));
CREATE INDEX IPESSOA_ENDERECO1 ON pessoa_endereco (
      end_id);
ALTER TABLE pessoa_endereco
 ADD CONSTRAINT IPESSOA_ENDERECO2 FOREIGN KEY ( pes_id ) REFERENCES pessoa(pes_id);
ALTER TABLE pessoa_endereco
 ADD CONSTRAINT IPESSOA_ENDERECO1 FOREIGN KEY ( end_id ) REFERENCES endereco(end_id);

CREATE TABLE servidor_efetivo (
  pes_id       SMALLINT    NOT NULL,
  se_matricula VARCHAR(20)    NOT NULL,
     PRIMARY KEY ( pes_id,se_matricula ));
CREATE UNIQUE INDEX USERVIDOR_EFETIVO ON servidor_efetivo (
      se_matricula);
ALTER TABLE servidor_efetivo
 ADD CONSTRAINT ISERVIDOR_EFETIVO1 FOREIGN KEY ( pes_id ) REFERENCES pessoa(pes_id);
 
 CREATE TABLE servidor_temporario (
  pes_id           SMALLINT    NOT NULL,
  st_data_admissao DATE    NOT NULL,
  st_data_demissao DATE    NOT NULL,
     PRIMARY KEY ( pes_id,st_data_admissao ));
ALTER TABLE servidor_temporario
 ADD CONSTRAINT ISERVIDOR_TEMPORARIO1 FOREIGN KEY ( pes_id ) REFERENCES pessoa(pes_id);

CREATE TABLE unidade_endereco (
  unid_id SMALLINT    NOT NULL,
  end_id  SMALLINT    NOT NULL,
     PRIMARY KEY ( unid_id,end_id ));
CREATE INDEX IUNIDADE_ENDERECO1 ON unidade_endereco (
      end_id);
ALTER TABLE unidade_endereco
 ADD CONSTRAINT IUNIDADE_ENDERECO2 FOREIGN KEY ( unid_id ) REFERENCES unidade(unid_id);
ALTER TABLE unidade_endereco
 ADD CONSTRAINT IUNIDADE_ENDERECO1 FOREIGN KEY ( end_id ) REFERENCES endereco(end_id);

-- Inserts para tabela cidade (sem cid_id, autogerado)
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Acorizal', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Água Boa', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Alta Floresta', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Alto Araguaia', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Alto Boa Vista', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Alto Garças', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Alto Paraguai', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Alto Taquari', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Apiacás', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Araguaiana', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Araguainha', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Araputanga', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Arenápolis', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Aripuanã', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Barão de Melgaço', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Barra do Bugres', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Barra do Garças', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Boa Esperança do Norte', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Bom Jesus do Araguaia', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Brasnorte', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Cáceres', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Campinápolis', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Campo Novo do Parecis', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Campo Verde', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Campos de Júlio', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Canabrava do Norte', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Canarana', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Carlinda', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Castanheira', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Chapada dos Guimarães', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Cláudia', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Cocalinho', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Colíder', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Colniza', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Comodoro', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Confresa', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Conquista D''Oeste', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Cotriguaçu', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Cuiabá', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Curvelândia', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Denise', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Diamantino', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Dom Aquino', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Feliz Natal', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Figueirópolis D''Oeste', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Gaúcha do Norte', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('General Carneiro', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Glória D''Oeste', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Guarantã do Norte', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Guiratinga', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Indiavaí', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Ipiranga do Norte', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Itanhangá', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Itaúba', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Itiquira', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Jaciara', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Jangada', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Jauru', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Juara', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Juína', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Juruena', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Juscimeira', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Lambari D''Oeste', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Lucas do Rio Verde', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Luciara', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Vila Bela da Santíssima Trindade', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Marcelândia', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Matupá', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Mirassol d''Oeste', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nobres', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nortelândia', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nossa Senhora do Livramento', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nova Bandeirantes', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nova Nazaré', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nova Lacerda', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nova Santa Helena', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nova Brasilândia', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nova Canaã do Norte', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nova Mutum', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nova Olímpia', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nova Ubiratã', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nova Xavantina', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Novo Mundo', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Novo Horizonte do Norte', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Novo São Joaquim', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Paranaíta', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Paranatinga', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Novo Santo Antônio', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Pedra Preta', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Peixoto de Azevedo', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Planalto da Serra', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Poconé', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Pontal do Araguaia', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Ponte Branca', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Pontes e Lacerda', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Porto Alegre do Norte', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Porto dos Gaúchos', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Porto Esperidião', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Porto Estrela', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Poxoréu', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Primavera do Leste', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Querência', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('São José dos Quatro Marcos', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Reserva do Cabaçal', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Ribeirão Cascalheira', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Ribeirãozinho', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Rio Branco', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Santa Carmem', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Santo Afonso', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('São José do Povo', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('São José do Rio Claro', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('São José do Xingu', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('São Pedro da Cipa', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Rondolândia', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Rondonópolis', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Rosário Oeste', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Santa Cruz do Xingu', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Salto do Céu', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Santa Rita do Trivelato', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Santa Terezinha', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Santo Antônio do Leste', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Santo Antônio de Leverger', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('São Félix do Araguaia', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Sapezal', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Serra Nova Dourada', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Sinop', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Sorriso', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Tabaporã', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Tangará da Serra', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Tapurah', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Terra Nova do Norte', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Tesouro', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Torixoréu', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('União do Sul', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Vale de São Domingos', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Várzea Grande', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Vera', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Vila Rica', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nova Guarita', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nova Marilândia', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nova Maringá', 'MT');
INSERT INTO cidade (cid_nome, cid_uf) VALUES ('Nova Monte Verde', 'MT');

INSERT INTO endereco (end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id) VALUES ('RUA', 'C ESQUINA COM RUA F', 1, 'CENTRO POLÍTICO ADMINISTRATIVO', 39);

INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gabinete do Secretário de Estado de Meio Ambiente', 'GSMA');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gabinete do Secretário Adjunto Executivo de Meio Ambiente', 'GSAE');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Unidade de Assessoria', 'UAS');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gabinete de Direção', 'GD');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Ouvidoria Setorial do Meio Ambiente', 'OSMA');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Unidade de Programas e Projetos Estratégicos', 'UPPE');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Unidade Estratégica de Transparência e Geoinformação', 'UETG');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Núcleo de Inteligência e Operações Conjuntas', 'NIOC');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Unidade de Programas e Projetos Internacionais', 'UPPI');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Unidade Setorial de Correição', 'UNISECO');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Unidade Setorial de Controle Interno', 'UNISECI');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Núcleo de Gestão Estratégica para Resultados', 'NGER');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Comissão de Ética', 'CE');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gabinete do Secretário Adjunto de Gestão Ambiental', 'GSAGA');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gabinete do Secretário Adjunto de Licenciamento Ambiental e Recursos Hídricos', 'GSALARH');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gabinete do Secretário Adjunto de Administração Sistêmica', 'GSAAS');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Superintendência de Tecnologia da Informação', 'STI');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Infraestrutura de Tecnologia da Informação', 'CITI');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência de Atendimento e Suporte Técnico em Tecnologia da Informação', 'GATI');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Sistemas de Tecnologia da Informação', 'CSTI');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Planejamento, Qualidade e Segurança da Informação em Tecnologia da Informação', 'CPQSI');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Superintendência de Gestão da Desconcentração e Descentralização', 'SGDD');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Desconcentração e Descentralização', 'CODD');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Superintendência de Gestão de Processos Administrativos e Autos de Infração', 'SGPA');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Processos Administrativos e Autos de Infração', 'CPA');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Conciliação Ambiental', 'CCA');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência de Monitoramento de Termos de Conciliação Ambiental', 'GMTCA');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Superintendência de Regularização e Monitoramento Ambiental', 'SRMA');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Geoprocessamento e Monitoramento Ambiental', 'CGMA');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Cadastro e Regularização Ambiental Rural', 'CCRA');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência de Monitoramento da Regularização Ambiental Rural', 'GMRA');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência de Tipologia Vegetal', 'GTV');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Agricultura e Pecuária Extensiva e Semiextensiva', 'CAPEX');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Superintendência de Mudanças Climáticas e Biodiversidade', 'SUBIO');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Superintendência de Fiscalização', 'SUF');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Mudanças Climáticas e REDD+', 'CMCR');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Conservação e Restauração de Ecossistemas', 'CCRE');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Fauna e Recursos Pesqueiros', 'CFRP');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência de Fauna Silvestre', 'GFAU');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Unidades de Conservação', 'CUCO');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência de Compensação Ambiental e Regularização Fundiária', 'GCARF');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência do Parque Estadual Massairo Okamura', 'GPQMO');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência do Parque Estadual Mãe Bonifácia', 'GPQMB');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência do Parque Estadual Zé Bolo Flô', 'GPQZB');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência do Parque Estadual Águas Quentes', 'GPQAQ');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Fiscalização de Empreendimentos', 'CFE');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Fiscalização de Flora', 'CFFL');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência de Planejamento de Fiscalização e Combate ao Desmatamento', 'GPFCD');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Fiscalização de Fauna', 'CFFA');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Bens e Produtos Retidos', 'CBPR');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Superintendência de Educação Ambiental e Atendimento ao Cidadão', 'SUEAC');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Atendimento ao Cidadão', 'CATE');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Superintendência de Infraestrutura, Mineração, Indústria e Serviços', 'SUIMIS');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Infraestrutura', 'CINF');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência de Gestão de Resíduos Sólidos', 'GGRS');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Indústria', 'CIND');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Mineração', 'CMIN');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Atividades de Pecuária Intensiva, Irrigação e Aquicultura', 'CAPIA');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Empreendimentos Energéticos', 'CEE');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Serviços', 'CSER');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Licenciamento de Atividades de Baixo Impacto', 'CLABI');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Licenciamento com Estudos de Impactos Ambientais', 'CLEIA');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Superintendência de Recursos Hídricos', 'SURH');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Ordenamento Hídrico', 'COH');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência de Fomento e Apoio a Comitês de Bacia Hidrográfica', 'GFAC');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Controle de Recursos Hídricos', 'CCRH');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência de Outorga', 'GOUT');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência de Águas Subterrâneas', 'GASUB');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência de Segurança de Barragens', 'GSB');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Monitoramento da Água e do Ar', 'CMAA');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência de Laboratório', 'GLAB');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Superintendência de Gestão Florestal', 'SUGF');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Recursos Florestais', 'CRF');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência de Monitoramento de Projetos de Exploração Florestal', 'GMPEF');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Reflorestamento e Autorização de Queima Controlada', 'CRAQC');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Coordenadoria de Créditos de Recursos Florestais', 'CCRF');
INSERT INTO unidade (unid_nome, unid_sigla) VALUES ('Gerência de Controle de Recursos Florestais', 'GCRF');
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (1, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (2, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (3, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (4, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (5, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (6, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (7, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (8, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (9, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (10, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (11, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (12, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (13, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (14, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (15, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (16, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (17, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (18, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (19, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (20, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (21, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (22, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (23, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (24, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (25, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (26, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (27, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (28, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (29, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (30, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (31, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (32, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (33, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (34, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (35, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (36, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (37, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (38, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (39, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (40, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (41, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (42, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (43, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (44, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (45, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (46, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (47, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (48, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (49, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (50, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (51, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (52, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (53, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (54, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (55, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (56, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (57, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (58, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (59, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (60, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (61, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (62, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (63, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (64, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (65, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (66, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (67, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (68, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (69, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (70, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (71, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (72, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (73, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (74, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (75, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (76, 1);
INSERT INTO unidade_endereco (unid_id, end_id) VALUES (77, 1);