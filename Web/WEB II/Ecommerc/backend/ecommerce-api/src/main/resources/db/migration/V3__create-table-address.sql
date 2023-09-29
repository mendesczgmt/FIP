CREATE TABLE address (
    id UUID primary key,
    logradouro varchar(100) not null unique,
    bairro varchar(100) not null unique,
    cidade varchar(100) not null unique,
    uf varchar(100) not null
);