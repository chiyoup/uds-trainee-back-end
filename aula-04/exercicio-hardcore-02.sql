CREATE TABLE pessoa(
	id INT(6) NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    id_postagem INT(6) NOT NULL,
    
    PRIMARY KEY(id),
    FOREIGN KEY(id_postagem) REFERENCES postagem(id)
);

CREATE TABLE gostei(
	id INT(6) NOT NULL AUTO_INCREMENT,
    gostou BOOLEAN,
    
    PRIMARY KEY(id)
);

CREATE TABLE comentario(
	id INT(6) NOT NULL AUTO_INCREMENT,
    campo_texto VARCHAR(255),
    
    PRIMARY KEY(id)
);

CREATE TABLE compartilhamento(
	id INT(6) NOT NULL AUTO_INCREMENT,
    compartilhou BOOLEAN,
    
    PRIMARY KEY(id)
);

CREATE TABLE postagem(
	id INT(6) NOT NULL AUTO_INCREMENT,
    id_comentario INT(6) NOT NULL,
    id_gostei INT(6) NOT NULL,
    id_compartilhamento INT(6) NOT NULL,
    conteudo VARCHAR(255) NOT NULL,
    
    PRIMARY KEY(id),
    FOREIGN KEY(id_comentario) REFERENCES comentario(id),
    FOREIGN KEY(id_gostei) REFERENCES gostei(id),
    FOREIGN KEY(id_compartilhamento) REFERENCES compartilhamento(id)
);

INSERT INTO gostei(gostou)
VALUES(true);

INSERT INTO compartilhamento(compartilhou)
VALUES(true);

INSERT INTO comentario(campo_texto)
VALUES('VAMOS PARA O HEXAAAA');

INSERT INTO postagem(id_comentario, id_gostei, id_compartilhamento, conteudo)
VALUES(1,1,1, 'GOOOOL DO DEUMAR');

INSERT INTO pessoa(nome, id_postagem)
VALUES('NEUMAR', 1);
