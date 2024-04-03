DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios(
	id int(11) NOT NULL AUTO_INCREMENT,
	nombre varchar(80) NOT NULL,
	apellido varchar(80) NOT NULL,
	fecha_nacimiento DATETIME NULL,
	PRIMARY KEY (id)
);

-- Agregar una nueva columna a la tabla
ALTER TABLE usuarios ADD COLUMN telefono varchar(45) NULL;

-- Modificar la columna ya creada
ALTER TABLE usuarios MODIFY COLUMN telefono varchar(30) NULL;

INSERT INTO usuarios(nombre, apellido, fecha_nacimiento, telefono)
VALUES('Sebastián','Laos','2005-01-29','123456712');

INSERT INTO usuarios(nombre, apellido, fecha_nacimiento, telefono)
VALUES('Victor','Laos','2005-01-29','123456712');

SELECT * FROM usuarios;

--DELETE FROM usuarios WHERE id = '1'

UPDATE usuarios
SET nombre = 'Matias',
apellido = 'Delgado'
WHERE id = '1';

SELECT * FROM usuarios WHERE nombre = 'Sebastián' AND apellido = 'Laos';
SELECT COUNT(*) FROM usuarios WHERE nombre = 'Sebastián' OR apellido = 'Laos';

SELECT * FROM usuarios WHERE nombre LIKE 'Seb%'

DROP TABLE IF EXISTS publicaciones;

CREATE TABLE publicaciones(
	id int(11) NOT NULL AUTO_INCREMENT,
	usuario_id int(11) NOT NULL,
	titulo varchar(150) NOT NULL,
	texto TEXT NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

INSERT INTO publicaciones(usuario_id, titulo, texto)
VALUES('1','Prueba','Está publicacion es de prueba'),
('2','Prueba2','Está es la segunda publicacion de prueba');