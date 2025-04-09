
# Seletivo SEPLAG - API REST em GeneXus

Este projeto foi desenvolvido para o teste prático do processo seletivo da SEPLAG-MT (02/2025), com base em requisitos de autenticação, autorização, integração com MinIO, PostgreSQL, Docker e exposição de APIs REST geradas por GeneXus.

---

## 📌 Dados de Inscrição
Processo Seletivo Simplificado 02/2025/SEPLAG
Analista de TI – Perfil Junior, Pleno e Sênior
- **Nome:** Andrei Falbot Mendes  
- **Email:** falbot@gmail.com  
- **Inscrição:** 9612  
- **Função/Perfil:** DESENVOLVEDOR GENEXUS SENIOR
---

## 🚀 Tecnologias Utilizadas

- GeneXus 18u8 (gerador Java)
- SQL Server 14.0.1000.169 (Banco de dados da base de conhecimento)
- Tomcat 10.1.39
- JDK 21.0.6
- PostgreSQL 17
- MinIO (S3 compatível)
- Docker & Docker Compose
- Swagger UI
- JWT (Authorization: Bearer)

---

## 🧩 Estrutura do Projeto

```
.
├── ArquivosParaDockerizacao/       # Inclui os arquivos para inicialização dos containers em docker
├── MassaTestes/                    # Inclui arquivos json para testes
├── RepositorioGeneXus/             # Inclui pasta KB com o projeto GeneXus
│   ├── docker-compose.yml
│   ├── popularTabelas.sql
│   └── ROOT.war
│       ├── index.htm                   # Swagger UI customizado com JWT
│       ├── api-unificada.yaml
│       └── static/                     # Todos os arquivos .yaml das APIs
│           ├── autenticacao.yaml
│           ├── crud_cidade.yaml
│           ├── crud_endereco.yaml
│           ├── crud_foto_pessoa.yaml
│           ├── crud_lotacao.yaml
│           ├── crud_pessoa.yaml
│           ├── crud_servidor.yaml
│           └── crud_unidade.yaml
```

---

## ⚙️ Como Executar a Solução

> Pré-requisitos: Docker e Docker Compose instalados

1. Clone este repositório:
```bash
git clone https://github.com/Falbot/seletivoSeplag.git
cd seletivoSeplag
```

2. Suba os containers:
```bash
docker compose up -d --build
```
> O banco de dados é criado e populado automaticamente no primeiro start com `popularTabelas.sql`.
> 
> Todos os 142 municípios de Mato Grosso.
> 
> Algumas Unidades fictícias.
> 
> A entrada de dados do tipo data, será no padrão **dd/mm/aaaa**.

3. Acesse os serviços:

| Serviço                     | URL                                                                              |
|-----------------------------|----------------------------------------------------------------------------------|
| Link do projeto (Swagger)   | [http://localhost:8080](http://localhost:8080)                                   |
| MinIO Console               | [http://localhost:8083](http://localhost:8083) (user: minioadmin / minioadmin)   |
| Link Retorno Imagens MinIO  | [http://host.docker.internal:9001](http://host.docker.internal:9001)             |
| PostgreSQL                  | localhost:5432 (user: postgres / root)                                           |

---
## 📘 Swagger UI

O Swagger já está pronto com todas as APIs disponíveis em:

📎 [http://localhost:8080](http://localhost:8080)

Você poderá:
- Testar os endpoints
- Colar o JWT no botão **Authorize** e autenticar as rotas
---
## 🔐 Autenticação

### Obtenção do Token
Faça uma requisição `POST` para:
```
POST http://localhost:8080/autenticacao/Token
```

#### Abaixo, usuário autorizado a realizar a requisição com sucesso:
```json
{
  "Usuario": "seletivo@seplag.mt.gov.br",
  "Senha": "@seletivo123"
}
```

#### Resposta esperada:
```json
{
  "Success": true,
  "Token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9..."
}
```

> O token expira em 5 minutos e pode ser renovado via endpoint `/autenticacao/RefreshToken`.

---

## 🧪 Massa de Testes

Na pasta `MassaTestes`, existem arquivos `json` com informações fictícias para trabalhar com alguns endpoints:

- Token autenticação `(autenticacaoToken.json)`
- Criação de servidor efetivo `(ServidorEfetivoX.json)`
- Criação de servidor temporário `(ServidorTemporarioX.json)`
- Upload de imagem para MinIO `(FotoPessoa1.json)`


---

### ✅ Requisitos Específicos Atendidos

| Requisito | Descrição | Endpoint |
|----------|------------|----------|
| 1 | CRUD para **Servidor Efetivo**, **Servidor Temporário**, **Unidade** e **Lotação** | `POST/GET/PUT/DELETE` em:<br> [`/servidor/Create_ServidorEfetivo`](http://localhost:8080/servidor/Create_ServidorEfetivo)<br>[`/servidor/Create_ServidorTemporario`](http://localhost:8080/servidor/Create_ServidorTemporario)<br>[`/unidade/Create`](http://localhost:8080/unidade/Create)<br>[`/lotacao/Create`](http://localhost:8080/lotacao/Create) |
| 2 | Consultar **servidores efetivos por unidade** (`unid_id`) | [`/servidor/Read_GetByKey_ServidorEfetivoPorUnidade`](http://localhost:8080/servidor/Read_GetByKey_ServidorEfetivoPorUnidade) |
| 3 | Retornar **Nome, Idade, Unidade de Lotação e Fotografia** do servidor | Incluído na resposta de:<br>[`servidor/Read_GetByKey_ServidorEfetivoPorUnidade`](http://localhost:8080/servidor/Read_GetByKey_ServidorEfetivoPorUnidade) |
| 4 | Consultar **endereço funcional** a partir de parte do nome do servidor efetivo | [`servidor/Read_GetByName_EnderecoFuncional`](http://localhost:8080/servidor/Read_GetByName_EnderecoFuncional) |
| 5 | **Upload de imagens** para o MinIO | Espera-se imagem em base64 em lista<br>[`foto_pessoa/Create`](http://localhost:8080/foto_pessoa/Create)<br> [`foto_pessoa/Update`](http://localhost:8080/foto_pessoa/Update)<br> [`servidor/Create_ServidorEfetivo`](http://localhost:8080/servidor/Create_ServidorEfetivo)<br> [`servidor/Create_ServidorTemporario`](http://localhost:8080/servidor/Create_ServidorTemporario) |
| 6 | **Recuperação de imagem** via link temporário com expiração de 5 min | [`foto_pessoa/Read_GetByKey`](http://localhost:8080/foto_pessoa/Read_GetByKey)<br> [`foto_pessoa/Read_GetList`](http://localhost:8080/foto_pessoa/Read_GetList)<br> [`servidor/Read_GetByKey_ServidorEfetivoPorUnidade`](http://localhost:8080/servidor/Read_GetByKey_ServidorEfetivoPorUnidade)<br> [`servidor/Read_GetList_Servidor`](http://localhost:8080/servidor/Read_GetList_Servidor)<br> [`servidor/Read_GetByKey`](http://localhost:8080/servidor/Read_GetByKey) |

---

## 🛑 Restrições de CORS

A aplicação não permite chamadas de domínios diferentes ao hospedado.  
Esta verificação foi implementada conforme exigido no edital.

---

## 📚 API Objects e Endpoints

🔐 autenticacao
| Método | Rota                                                   | Descrição            |
|--------|--------------------------------------------------------|----------------------|
| POST   | [`autenticacao/Token`](http://localhost:8080/autenticacao/Token) | Gerar um novo token |
| POST   | [`autenticacao/RefreshToken`](http://localhost:8080/autenticacao/RefreshToken) | Receber um novo token atualizado |
##

🏙️ crud_cidade
| Método | Rota                                                   | Descrição            |
|--------|--------------------------------------------------------|----------------------|
| POST   | [`cidade/Create`](http://localhost:8080/cidade/Create) | Criar uma nova cidade |
| GET    | [`cidade/Read_GetByKey`](http://localhost:8080/cidade/Read_GetByKey) | Dados de uma cidade consultado pela chave |
| GET    | [`cidade/Read_GetList`](http://localhost:8080/cidade/Read_GetList) | Lista paginada de cidades |
| PUT    | [`cidade/Update`](http://localhost:8080/cidade/Update) | Atualiza dados de uma cidade |
| DELETE | [`cidade/Delete`](http://localhost:8080/cidade/Delete) | Apaga uma cidade |
##

🏠 crud_endereco
| Método | Rota                                                   | Descrição            |
|--------|--------------------------------------------------------|----------------------|
| POST   | [`endereco/Create`](http://localhost:8080/endereco/Create) | Criar um novo endereco |
| GET    | [`endereco/Read_GetByKey`](http://localhost:8080/endereco/Read_GetByKey) | Dados de um endereco consultado pela chave |
| GET    | [`endereco/Read_GetList`](http://localhost:8080/endereco/Read_GetList) | Lista paginada de enderecos |
| PUT    | [`endereco/Update`](http://localhost:8080/endereco/Update) | Atualiza dados de um endereco |
| DELETE | [`endereco/Delete`](http://localhost:8080/endereco/Delete) | Apaga um endereco |
##

🖼️ crud_foto_pessoa
| Método | Rota                                                   | Descrição            |
|--------|--------------------------------------------------------|----------------------|
| POST   | [`foto_pessoa/Create`](http://localhost:8080/foto_pessoa/Create) | Criar uma nova foto de pessoa |
| GET    | [`foto_pessoa/Read_GetByKey`](http://localhost:8080/foto_pessoa/Read_GetByKey) | Dados de foto de pessoa consultado pela chave (pes_id) |
| GET    | [`foto_pessoa/Read_GetList`](http://localhost:8080/foto_pessoa/Read_GetList) | Lista paginada de foto de pessoas |
| PUT    | [`foto_pessoa/Update`](http://localhost:8080/foto_pessoa/Update) | Atualiza foto de pessoa |
| DELETE | [`foto_pessoa/Delete`](http://localhost:8080/foto_pessoa/Delete) | Apaga foto de pessoa |
##

👥 crud_lotacao
| Método | Rota                                                   | Descrição            |
|--------|--------------------------------------------------------|----------------------|
| POST   | [`lotacao/Create`](http://localhost:8080/lotacao/Create) | Criar uma nova lotação |
| GET    | [`lotacao/Read_GetByKey`](http://localhost:8080/lotacao/Read_GetByKey) | Dados de uma lotação consultado pela chave |
| GET    | [`lotacao/Read_GetList`](http://localhost:8080/lotacao/Read_GetList) | Lista paginada de lotações |
| PUT    | [`lotacao/Update`](http://localhost:8080/lotacao/Update) | Atualiza dados de uma lotação |
| DELETE | [`lotacao/Delete`](http://localhost:8080/lotacao/Delete) | Apaga uma lotação |
##

👤 crud_pessoa
| Método | Rota                                                   | Descrição            |
|--------|--------------------------------------------------------|----------------------|
| POST   | [`pessoa/Create`](http://localhost:8080/pessoa/Create) | Criar uma nova pessoa |
| GET    | [`pessoa/Read_GetByKey`](http://localhost:8080/pessoa/Read_GetByKey) | Dados de uma pessoa consultado pela chave |
| GET    | [`pessoa/Read_GetList`](http://localhost:8080/pessoa/Read_GetList) | Lista paginada de pessoas |
| PUT    | [`pessoa/Update`](http://localhost:8080/pessoa/Update) | Atualiza dados de uma pessoa |
| DELETE | [`pessoa/Delete`](http://localhost:8080/pessoa/Delete) | Apaga uma pessoa |
| DELETE | [`pessoa/Delete_Endereco`](http://localhost:8080/pessoa/Delete_Endereco) | Apaga endereço de uma pessoa |
##

🧑‍💼 crud_servidor
| Método | Rota                                                   | Descrição            |
|--------|--------------------------------------------------------|----------------------|
| POST   | [`servidor/Create_ServidorEfetivo`](http://localhost:8080/servidor/Create_ServidorEfetivo) | Criar um novo servidor efetivo |
| POST   | [`servidor/Create_ServidorTemporario`](http://localhost:8080/servidor/Create_ServidorTemporario) | Criar um novo servidor temporário |
| GET    | [`servidor/Read_GetByKey_ServidorEfetivoPorUnidade`](http://localhost:8080/servidor/Read_GetByKey_ServidorEfetivoPorUnidade) | Lista paginada de servidores efetivos consultado pela chave de unidade (uni_id) |
| GET    | [`servidor/Read_GetByName_EnderecoFuncional`](http://localhost:8080/servidor/Read_GetByName_EnderecoFuncional) | Lista paginada de endereço de lotação de servidores efetivos consultado por nome de pessoa |
| GET    | [`servidor/Read_GetList_Servidor`](http://localhost:8080/servidor/Read_GetList_Servidor) | Lista paginada de servidores |
| GET    | [`servidor/Read_GetByKey`](http://localhost:8080/servidor/Read_GetByKey) | Dados de um servidor consultado pela chave (pes_id)|
| PUT    | [`servidor/Update_DemissaoServidorTemporario`](http://localhost:8080/servidor/Update_DemissaoServidorTemporario) | Atualiza data de demissão de um servidor temporário |
##

🏢 crud_unidade
| Método | Rota                                                   | Descrição            |
|--------|--------------------------------------------------------|----------------------|
| POST   | [`unidade/Create`](http://localhost:8080/unidade/Create) | Criar uma nova unidade |
| GET    | [`unidade/Read_GetByKey`](http://localhost:8080/unidade/Read_GetByKey) | Dados de uma unidade consultado pela chave |
| GET    | [`unidade/Read_GetList`](http://localhost:8080/unidade/Read_GetList) | Lista paginada de unidades |
| PUT    | [`unidade/Update`](http://localhost:8080/unidade/Update) | Atualiza dados de uma unidade |
| DELETE | [`unidade/Delete`](http://localhost:8080/unidade/Delete) | Apaga uma unidade |
| DELETE | [`unidade/Delete_Endereco`](http://localhost:8080/unidade/Delete_Endereco) | Apaga endereço de uma unidade |

---

## 📞 Contato

Caso tenha dúvidas ou precise de mais informações, estou à disposição.

**Candidato - Andrei Falbot**  
📩 falbot@gmail.com