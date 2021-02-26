CREATE TABLE public.categorias
(
    id_categoria serial NOT NULL,
    nome_categoria VARCHAR (100) NOT NULL,
    usuario integer,
    PRIMARY KEY (id_categoria)
)
