CREATE TABLE public.usuario
(
    id_usuario serial NOT NULL,
    nome VARCHAR (200) NOT NULL,
    email VARCHAR (250) NOT NULL,
    senha VARCHAR (250) NOT NULL,
    PRIMARY KEY (id_usuario)
)
