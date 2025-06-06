create table loginquilino (
login varchar(50),
senha varchar(50)
REFERENCES

)




CREATE TABLE Inquilinos (
    id_inquilino SERIAL PRIMARY KEY,
    nome_completo VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) UNIQUE NOT NULL,
    rg VARCHAR(20),
    data_nascimento DATE,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(100),
    profissao VARCHAR(50),
    renda_mensal DECIMAL(10,2),
    estado_civil VARCHAR(20),
    data_cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    ativo BOOLEAN DEFAULT TRUE
);

CREATE TABLE Donos (
    id_dono SERIAL PRIMARY KEY,
    nome_completo VARCHAR(100) NOT NULL,
    cpf_cnpj VARCHAR(18) UNIQUE NOT NULL,
    rg_ie VARCHAR(20),
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(100),
    endereco VARCHAR(200),
    banco VARCHAR(50),
    agencia VARCHAR(10),
    conta VARCHAR(20),
    tipo_conta VARCHAR(20),
    data_cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    ativo BOOLEAN DEFAULT TRUE
);

CREATE TABLE Propriedades (
    id_propriedade SERIAL PRIMARY KEY,
    id_dono INT NOT NULL,
    endereco VARCHAR(200) NOT NULL,
    tipo_imovel VARCHAR(50),
    valor_aluguel DECIMAL(10,2),
    area DECIMAL(10,2),
    quartos INT,
    banheiros INT,
    vagas_garagem INT,
    data_cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    disponivel BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (id_dono) REFERENCES Donos(id_dono)
);

CREATE TABLE Contratos (
    id_contrato SERIAL PRIMARY KEY,
    id_inquilino INT NOT NULL,
    id_propriedade INT NOT NULL,
    data_inicio DATE NOT NULL,
    data_fim DATE,
    valor_aluguel DECIMAL(10,2) NOT NULL,
    dia_vencimento INT NOT NULL,
    ativo BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (id_inquilino) REFERENCES Inquilinos(id_inquilino),
    FOREIGN KEY (id_propriedade) REFERENCES Propriedades(id_propriedade)
);





