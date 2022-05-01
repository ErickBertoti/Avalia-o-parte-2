CREATE TABLE 'Fornecedor' (
    id SERIAL
    nome varchar(150) UNIQUE
    email varchar(100) UNIQUE
    telefone varchar(60) UNIQUE

    PRIMARY KEY(id)
);