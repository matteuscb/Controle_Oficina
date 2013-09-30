CREATE TABLE caixa(
  cai_id serial primary key,
  cai_valor numeric(9,2) NOT NULL,
  cai_data date NOT NULL,
  cai_cliente character varying(200) NOT NULL,
  cai_tipo character(1) NOT NULL,
  cai_pago char(4)
);