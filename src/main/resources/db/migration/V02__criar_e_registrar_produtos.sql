CREATE TABLE public.produtos
(
    id_produto serial NOT NULL,
    cod_produto VARCHAR (20) NOT NULL,
    descricao VARCHAR (250) NOT NULL,
    data_vencimento date,
    data_ult_compra date,
    estoque VARCHAR(30),
    categoria integer NOT NULL,
    estoque_min VARCHAR(30),
    estoque_max VARCHAR(30),
    preco_custo numeric(10,2),
    margem numeric(10,2),
    preco numeric(10,2),
    preco_promocao numeric(10,2),
    fornecedor integer,
    usuario integer,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (categoria)
        REFERENCES public.categorias (id_categoria) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)
WITH (
    OIDS = FALSE
);

ALTER TABLE public.produtos
    OWNER to postgres;
    