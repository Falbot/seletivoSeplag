
# Seletivo SEPLAG - API REST em GeneXus

Este projeto foi desenvolvido para o teste prático do processo seletivo da SEPLAG-MT (02/2025), com base em requisitos de autenticação, autorização, integração com MinIO, PostgreSQL, Docker e exposição de APIs REST geradas por GeneXus.

---

## 📌 Dados de Inscrição

- **Nome:** Andrei Falbot Mendes  
- **Email:** falbot@gmail.com  
- **Inscrição:** XXXXXX  

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

## 📂 Upload e Download de Imagens (MinIO)

O endpoint `/foto_pessoa/Create` permite o upload de imagens.  
O link gerado tem validade de 5 minutos e usa o domínio `http://host.docker.internal:9001`.

---

## 🧪 Massa de Testes

Na pasta `MassaTestes`, existem arquivos `json` com informações fictícias trabalhar com os endpoints:

- Token autenticação `(autenticacaoToken.json)`
- Criação de servidor efetivo `(ServidorEfetivoX.json)`
- Criação de pessoa, cidade, endereço
- Upload de imagem para MinIO
- Consulta com JWT
- Lotação e vínculo com unidade


---

## 🛑 Restrições de CORS

A aplicação não permite chamadas de domínios diferentes ao hospedado.  
Esta verificação foi implementada conforme exigido no edital.

---

## ✅ Status

✅ APIs criadas  
✅ JWT funcionando  
✅ CORS ativo  
✅ Integração com MinIO  
✅ Docker funcional  
✅ Swagger dinâmico  
✅ Pronto para validação

---

## 📞 Contato

Caso tenha dúvidas ou precise de mais informações, estou à disposição.

**Candidato - XXXXXX**  
📩 falbot@gmail.com

## 📚 API Objects e Endpoints

🏙️ crud_cidade
| Método | Rota                                                   | Descrição            |
|--------|--------------------------------------------------------|----------------------|
| POST   | [`cidade/Create`](http://localhost:8080/cidade/Create) | Cria uma nova cidade |
http://localhost:8080/cidade/Create
GET	/cidade	Lista todas as cidades
GET	/cidade/{id}	Consulta uma cidade por ID
POST	/cidade	Cria uma nova cidade
PUT	/cidade/{id}	Atualiza uma cidade existente
DELETE	/cidade/{id}	Remove uma cidade
##

🏠 crud_endereco
| Método | Rota                                                   | Descrição            |
|--------|--------------------------------------------------------|----------------------|
| POST   | [`cidade/Create`](http://localhost:8080/cidade/Create) | Cria uma nova cidade |
GET	/endereco	Lista todos os endereços
GET	/endereco/{id}	Consulta um endereço por ID
POST	/endereco	Cria um novo endereço
PUT	/endereco/{id}	Atualiza um endereço existente
DELETE	/endereco/{id}	Remove um endereço
##

🖼️ crud_foto_pessoa
| Método | Rota                                                   | Descrição            |
|--------|--------------------------------------------------------|----------------------|
| POST   | [`cidade/Create`](http://localhost:8080/cidade/Create) | Cria uma nova cidade |
GET	/foto_pessoa	Lista todas as fotos de pessoas
GET	/foto_pessoa/{id}	Consulta uma foto por ID
POST	/foto_pessoa	Adiciona uma nova foto para uma pessoa
PUT	/foto_pessoa/{id}	Atualiza uma foto existente
DELETE	/foto_pessoa/{id}	Remove uma foto
##

👥 crud_lotacao
| Método | Rota                                                   | Descrição            |
|--------|--------------------------------------------------------|----------------------|
| POST   | [`cidade/Create`](http://localhost:8080/cidade/Create) | Cria uma nova cidade |
GET	/lotacao	Lista todas as lotações
GET	/lotacao/{id}	Consulta uma lotação por ID
POST	/lotacao	Cria uma nova lotação
PUT	/lotacao/{id}	Atualiza uma lotação existente
DELETE	/lotacao/{id}	Remove uma lotação
##

👤 crud_pessoa
| Método | Rota                                                   | Descrição            |
|--------|--------------------------------------------------------|----------------------|
| POST   | [`cidade/Create`](http://localhost:8080/cidade/Create) | Cria uma nova cidade |
GET	/pessoa	Lista todas as pessoas
GET	/pessoa/{id}	Consulta uma pessoa por ID
POST	/pessoa	Cria uma nova pessoa
PUT	/pessoa/{id}	Atualiza uma pessoa existente
DELETE	/pessoa/{id}	Remove uma pessoa
##

🧑‍💼 crud_servidor
| Método | Rota                                                   | Descrição            |
|--------|--------------------------------------------------------|----------------------|
| POST   | [`cidade/Create`](http://localhost:8080/cidade/Create) | Cria uma nova cidade |
GET	/servidor	Lista todos os servidores
GET	/servidor/{id}	Consulta um servidor por ID
POST	/servidor	Cria um novo servidor
PUT	/servidor/{id}	Atualiza um servidor existente
DELETE	/servidor/{id}	Remove um servidor
##

🏢 crud_unidade
| Método | Rota                                                   | Descrição            |
|--------|--------------------------------------------------------|----------------------|
| POST   | [`cidade/Create`](http://localhost:8080/cidade/Create) | Cria uma nova cidade |
GET	/unidade	Lista todas as unidades
GET	/unidade/{id}	Consulta uma unidade por ID
POST	/unidade	Cria uma nova unidade
PUT	/unidade/{id}	Atualiza uma unidade existente
DELETE	/unidade/{id}	Remove uma unidade
