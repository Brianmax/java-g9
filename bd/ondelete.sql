-- on delete set null

CREATE TABLE IF NOT EXISTS profesor(
	profesor_id SERIAL PRIMARY KEY,
	nombre VARCHAR(20),
	apellido VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS curso(
	curso_id SERIAL PRIMARY KEY,
	nombre VARCHAR(50),

	profesor_id INTEGER,

	FOREIGN KEY(profesor_id) REFERENCES profesor(profesor_id) ON DELETE SET NULL
);

INSERT INTO profesor(nombre, apellido) VALUES('Jose', 'Canales');
INSERT INTO profesor(nombre, apellido) VALUES('Marco', 'Morales');
INSERT INTO profesor(nombre, apellido) VALUES('Fiorela', 'Rodriguez');
INSERT INTO profesor(nombre, apellido) VALUES('Fernanda', 'Alvarado');

SELECT * FROM profesor;

INSERT INTO curso(nombre, profesor_id) VALUES('programacion', 2);
INSERT INTO curso(nombre, profesor_id) VALUES('matematica', 1);
INSERT INTO curso(nombre, profesor_id) VALUES('fisica', 1);

SELECT * FROM curso;

DELETE FROM profesor WHERE profesor_id = 2;	

SELECT * FROM curso;


-- on delete cascade

CREATE TABLE IF NOT EXISTS orders(
	order_id SERIAL PRIMARY KEY,
	descripcion VARCHAR(255),
	order_date DATE NOT NULL
);

CREATE TABLE IF NOT EXISTS item_order(
	id_item SERIAL PRIMARY KEY,
	product VARCHAR(255),
	qty INTEGER,
	price FLOAT,

	order_id INTEGER,
	FOREIGN KEY(order_id) REFERENCES orders(order_id) ON DELETE CASCADE
);


INSERT INTO orders(descripcion, order_date) VALUES ('descripcion1', '12-12-2023');
INSERT INTO orders(descripcion, order_date) VALUES ('descripcion2', '12-12-2024');
INSERT INTO orders(descripcion, order_date) VALUES ('descripcion3', '12-12-2025');


SELECT * FROM orders;

INSERT INTO item_order(product, qty, price, order_id) VALUES('product1', 3, 200, 1);
INSERT INTO item_order(product, qty, price, order_id) VALUES('product2', 4, 200, 1);
INSERT INTO item_order(product, qty, price, order_id) VALUES('product3', 5, 200, 1);
INSERT INTO item_order(product, qty, price, order_id) VALUES('product4', 7, 200, 3);
INSERT INTO item_order(product, qty, price, order_id) VALUES('product5', 32, 200, 2);
INSERT INTO item_order(product, qty, price, order_id) VALUES('product6', 34, 200, 3);


SELECT * FROM item_order;


DELETE FROM orders WHERE order_id = 1;
