INSERT INTO cozinha (nome) VALUES ('Tailandesa');
INSERT INTO cozinha (nome) VALUES ('Indiana');

INSERT INTO restaurante (nome, taxa_frete, cozinha_id) VALUES ('Thai Gourmet', 10, 1);
INSERT INTO restaurante (nome, taxa_frete, cozinha_id) VALUES ('Thai Delivery', 9.50, 1);
INSERT INTO restaurante (nome, taxa_frete, cozinha_id) VALUES ('Tuk Tuk Comida Indiana', 15, 2);

INSERT INTO estado (nome) VALUES ('Minas Gerais');
INSERT INTO estado (nome) VALUES ('S�o Paulo');
INSERT INTO estado (nome) VALUES ('Cear�');

INSERT INTO cidade (nome, estado_id) VALUES ('Uberl�ndia', 1);
INSERT INTO cidade (nome, estado_id) VALUES ('Belo Horizonte', 1);
INSERT INTO cidade (nome, estado_id) VALUES ('S�o Paulo', 2);
INSERT INTO cidade (nome, estado_id) VALUES ('Campinas', 2);
INSERT INTO cidade (nome, estado_id) VALUES ('Fortaleza', 3);

INSERT INTO forma_pagamento (descricao) VALUES ('Cart�o de cr�dito');
INSERT INTO forma_pagamento (descricao) VALUES ('Cart�o de d�bito');
INSERT INTO forma_pagamento (descricao) VALUES ('Dinheiro');

INSERT INTO permissao (nome, descricao) VALUES ('CONSULTAR_COZINHAS', 'Permite consultar cozinhas');
INSERT INTO permissao (nome, descricao) VALUES ('EDITAR_COZINHAS', 'Permite editar cozinhas');