# 🔐 Auth System – Spring Boot + Docker

## 📖 Descrição

Este projeto é um **estudo prático de backend**, desenvolvido com foco em **boas práticas, organização de código e simulação de um cenário real de mercado**.

O sistema consiste em uma **API REST de autenticação**, com funcionalidades de **cadastro e login de usuários**, utilizando **Spring Boot**, **PostgreSQL** e **Docker**.

O objetivo principal é evoluir no entendimento da **estrutura correta de um projeto profissional**, passando por:
- Planejamento
- Infraestrutura
- Versionamento
- Desenvolvimento backend

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
- **PostgreSQL**
- **Docker**
- **Docker Compose**
- **Maven**

---

## 📁 Estrutura do Projeto

```bash
auth-system/
├── backend/        # API Spring Boot
├── docker/         # Infraestrutura (Docker / Docker Compose)
└── README.md
```

## ⚙️ Funcionalidades
### 🚧 Projeto em fase de desenvolvimento
- **Cadastro de usuários**
- **Login de usuários**
- **Persistência de dados em banco PostgreSQL**
- **Criptografia de senhas**
- **API REST**

## ▶️ Como Executar o Projeto
### 1️⃣ Build do Backend
```bash
cd backend
mvn clean package -DskipTests
```
### 2️⃣ Subir os Containers com Docker
```bash
cd ../docker
docker compose up --build
```
## 🌐 Acesso à API
Após a execução, a API estará disponível em:
```bash
http://localhost:8080
```
## 👨‍💻 Autor - Deyvson Lucas
Desenvolvedor em formação – Backend Java
📌 Projeto desenvolvido para fins de estudo e evolução profissional.
