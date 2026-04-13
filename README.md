# Sistema de Gerenciamento de Imóveis

Sistema desktop de gerenciamento de imóveis desenvolvido como projeto final da disciplina de **Paradigmas de Programação** na graduação em Engenharia da Computação (UCDB). Permite o cadastro e controle de donos de imóveis, inquilinos, propriedades e contratos de aluguel.

---

## Funcionalidades

- Cadastro, listagem e atualização de **donos de imóveis** (com dados bancários)
- Cadastro, listagem e atualização de **inquilinos** (com dados pessoais e financeiros)
- Cadastro e gerenciamento de **propriedades** vinculadas a donos
- Criação e controle de **contratos de aluguel** entre inquilinos e propriedades
- Tela de **login** com autenticação
- Interface gráfica desktop com **Java Swing**

---

## Arquitetura

O projeto segue o padrão **MVC (Model-View-Controller)**:

```
src/
├── Modelo/       # Entidades (DonoImovelM, InquilinoM, PropriedadesM, ContratoM, LoginM)
├── Controle/     # Regras de negócio e acesso ao banco
│   └── Database.java   # Conexão PostgreSQL via JDBC (padrão Singleton)
└── Visao/        # Telas Swing (cadastro, listagem, atualização, login)
```

---

## Pré-requisitos

- Java 11 ou superior
- NetBeans IDE (recomendado — projeto gerado com NetBeans)
- **PostgreSQL** instalado e rodando

---

## ⚠️ Configuração do Banco de Dados (obrigatório antes de rodar)

O sistema **não funciona sem o banco configurado**. Siga os passos abaixo:

### 1. Crie o banco de dados

No terminal do PostgreSQL (`psql`) ou no pgAdmin:

```sql
CREATE DATABASE "ProjetoFinal";
```

### 2. Execute o script de criação das tabelas

Com o banco criado, rode o arquivo `tabelas.sql` que está na raiz do projeto:

```bash
psql -U postgres -d ProjetoFinal -f tabelas.sql
```

Ou abra o arquivo no pgAdmin e execute manualmente.

### Tabelas criadas pelo script

| Tabela | Descrição |
|---|---|
| `Donos` | Proprietários com dados pessoais e bancários |
| `Inquilinos` | Inquilinos com dados pessoais e financeiros |
| `Propriedades` | Imóveis vinculados a um dono (tipo, valor, área, quartos) |
| `Contratos` | Contratos de aluguel entre inquilino e propriedade |

### 3. Verifique a configuração da conexão

A conexão está em `src/Controle/Database.java`:

```java
conn = DriverManager.getConnection(
    "jdbc:postgresql://localhost:1234/ProjetoFinal", "postgres", "1234"
);
```

> Se o seu PostgreSQL usa porta diferente (a padrão é `5432`), ou usuário/senha diferentes, edite esse trecho antes de rodar.

---

## Como rodar

```bash
git clone https://github.com/pedrogaleano15/projetoFinalParadigmas.git
```

1. Abra a pasta `ProjetoFinal` no **NetBeans**
2. Configure o banco de dados conforme instruções acima
3. Execute o projeto (`Run Project` ou `F6`)

---

## Tecnologias

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=flat&logo=postgresql&logoColor=white)

- **Interface:** Java Swing
- **Banco de dados:** PostgreSQL
- **Driver JDBC:** `postgresql-42.7.5.jar` (incluído em `src/API/`)
- **IDE:** Apache NetBeans
- **Padrões:** MVC · Singleton

---

## Conceitos aplicados

- Padrão **MVC** com separação clara entre modelo, visão e controle
- **Singleton** para gerenciamento único da conexão com o banco
- **Herança e encapsulamento** nas entidades do sistema
- **JDBC** para comunicação com o PostgreSQL
- **Chaves estrangeiras** e integridade referencial no banco
- Interface gráfica com **Java Swing**

---

## Autor

**Pedro Henrique Morais Galeano**  
Engenharia da Computação · UCDB · Campo Grande/MS  
[GitHub](https://github.com/pedrogaleano15) · [LinkedIn](www.linkedin.com/in/pedro-henrique-morais-galeano)
