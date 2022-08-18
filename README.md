# API de Estacionamento

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/>
  <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white"/>
  <img src="http://img.shields.io/static/v1?label=TESTES&message=%3E100&color=GREEN&style=for-the-badge"/>
   <img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=RED&style=for-the-badge"/>
   
</p>

- Status do Projeto: 🔧 Em Desenvolvimento

Um parágrafo da descrição do projeto vai aqui

### ⚙️ Funcionalidades

A API de Estacionamento possuí as seguintes funcinalidades:

- Cadastro de estabelecimentos.
- Cadastro de veículos.
- Controle de entrada e saída de veículos.

### 📚 Documentação

Coloque aqui o link de acesso a documentação do projeto junto ao link de redirecionamento dela, caso não tenha um link on live, explique como acessala após fazer uma copia do projeto, com passo a passo

```
Coloque aqui exemplos
```

### 📝Topicos

- [Começando](#-começando)

- [Como rodar](#%EF%B8%8F-como-rodar)

- [Desenvolvimento](#-desenvolvimento)

- [Autores](#%EF%B8%8F-autores)

## 🚀 Começando

Primeiramente é preciso clonar o projeto na sua máquina, para isso, abra o git em algum terminal e rode o seguinte comando:
```
$ git clone https://github.com/henrique-leme/backend-test-java.git
```

### 📋 Pré-requisitos

Para rodar e instalar o projeto é preciso ter instalado
- Java 8
- Postgres
- Insomnia ou Postman
- Git 
- IDE de sua escolha ( recomendo Intellij ou VS Code )

### 🔧 Instalação

Tendo os requisitos acima você ira abrir o projeto na sua IDE.

- No caso do VS Code, é recomendado que você tenha o ambiente Java configurado, recomendo seguir os passos no vídeo do link abaixo até os 5:20 minutos de vídeo, após isso podera abrir o projeto no VS Code normalmente

(https://www.youtube.com/watch?v=K2OD-3NBE6s&ab_channel=HélioKamakawa) 

- Para abrir o projeto no Intellij, 

### 🔌Iniciando/Configurando banco de dados

Para rodar o projeto propriamente, é preciso configurar o banco de dados de acordo com o seu ambiente, para isso vá até o arquivo **application.properties** e altere as seguintes linhas:

```
# Aqui você ira criar um banco de dados postgre com o nome (api_estacionamento)
spring.datasource.url=jdbc:postgresql://localhost:5432/api_estacionamento

# coloque nesta linha seu usuario do banco de dados no local de (seu_nome_de_usuario) ou utilize um com o nome padrão do projeto (postgres)
spring.datasource.username=seu_nome_de_usuario

# coloque nesta linha a sua senha do banco de dados ou utilize a padrão do projeto (postgres)
spring.datasource.password=sua_senha 
```

## ⚙️ Como rodar

Explique aqui como rodar a aplicaçao, coloque tambem um passo a passo para facilitar o entendimento e para que tudo ocorra bem.

```
Coloque aqui exemplos
```

**PS: clone o próprio projeto e verfique se o passo a passo funciona**

### 🛠 Como rodar os testes

Explique como executar os testes automatizados para este sistema.

### 🔩 Analise os testes de ponta a ponta

Explique como esses testes funcionam e porquê eles existem.

```
Coloque aqui exemplos
```

## 📦 Desenvolvimento

Adicione aqui notas sobre como implantar o software em um sistema ativo

### 🛠️ Construído com

Para o desenvolvimento deste projeto, foram utilizadas as seguintes ferramentas

- [Intellij IDEA](https://www.jetbrains.com/pt-br/idea/) - O ambiente de desenvolvimento
- [Maven](https://maven.apache.org/) - Gerente de Dependência
- [Spring Boot](https://spring.io/projects/spring-boot) - Framework utilizado
- [PostgreSQL](https://www.postgresql.org) - Banco de dados utilizado

### 📌 Versão

Coloque aqui uma breve explicaçao das versoes do projeto e de como elas são lançadas/funcionam

## ✒️ Autores

Abaixo os autores do projeto, Henrique que desenvolveu e Rodrigo que instruiu  ao desenvolvimento dando feedbacks para melhorias do mesmo.
- **Henrique Leme de Brito** - _Desenvolvedor_ - [Git-Hub](https://github.com/henrique-leme)
- **Rodrigo Rodrigues** - _Project Leader_ 

