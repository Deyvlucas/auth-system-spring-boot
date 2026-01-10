📌 Auth System – Spring Boot + Docker
📖 Descrição

Estou desenvolvendo esse projeto de estudo com foco em boas práticas de backend, simulando um cenário real de mercado.
O sistema consiste em uma API REST de autenticação, com cadastro e login de usuários, utilizando Spring Boot, PostgreSQL e Docker.

Meu objetivo principal é aprender a estruturação correta de um projeto, desde a fase de planejamento, infraestrutura e versionamento, até o desenvolvimento do código.

🛠️ Tecnologias Utilizadas

Java 17

Spring Boot

Spring Web

Spring Data JPA

PostgreSQL

Docker

Docker Compose

Maven

Arquitetura do Projeto

auth-system/
├── backend/ # API Spring Boot
├── docker/ # Infraestrutura (Docker Compose)
└── README.md

Funcionalidades (Esta em fase de desenvolvimento)

Cadastro de usuários

Login de usuários

Persistência em banco de dados

Senhas criptografadas

API REST

Como executar o projeto

# Build do backend

cd backend
mvn clean package -DskipTests

# Subir os containers

cd ../docker
docker compose up --build

A API estará disponível em:

http://localhost:8080

👨‍💻 Autor
Deyvson Lucas
Desenvolvedor em formação – Backend Java
