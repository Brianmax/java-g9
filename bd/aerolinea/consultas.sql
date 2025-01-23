SELECT * FROM aerolineas;

SELECT * FROM aviones WHERE capacidad >= 200;

SELECT * FROM aviones WHERE capacidad >= 200 AND peso >= 150;

-- actualizando el avion con el id 5
UPDATE aviones SET capacidad=220 WHERE id_avion = 5;

-- verificando la actualizacion
SELECT * FROM aviones WHERE id_avion=5;


-- todos los aviones que tengan un peso mayor a 
-- 170 deben de tener una capacidad de solo 150

UPDATE aviones SET capacidad = 150 WHERE peso >= 170;

SELECT * FROM aviones WHERE peso>=170;

-- eliminar uno o mas registros

DELETE FROM aviones WHERE id_avion = 1;


-- aerolineas con sus respectivos aviones

SELECT * FROM aerolineas a
INNER JOIN 
aviones av ON a.id_aerolinea = av.id_aerolinea_fk;

SELECT a.id_aerolinea, a.nombre, av.modelo, av.id_aerolinea_fk FROM aerolineas a
INNER JOIN 
aviones av ON a.id_aerolinea = av.id_aerolinea_fk;


-- seleccionar los aviones con sus respectivos vuelos

SELECT * FROM aviones a INNER JOIN vuelos v ON a.id_avion = v.id_avion_fk;

-- traer todas las aerolineas incluso las que no tengan aviones

INSERT INTO aerolineas(nombre) VALUES ('LATAM AIRLINES');

SELECT a.id_aerolinea, a.nombre, av.id_aerolinea_fk, av.modelo 
FROM aerolineas a LEFT JOIN aviones av
ON a.id_aerolinea = av.id_aerolinea_fk;


-- seleccionar los aviones con sus respectivos vuelos incluso los
-- aviones que no tengan un vuelo asignado

SELECT * FROM aviones a LEFT JOIN vuelos v ON a.id_avion = v.id_avion_fk;


-- seleccionar las aerolineas que no tienen ningun avion a su cargo

SELECT * 
FROM aerolineas a LEFT JOIN aviones av 
ON a.id_aerolinea = av.id_aerolinea_fk
WHERE id_aerolinea_fk IS NULL;


-- seleccionar los aviones que no tengan un vuelos asignado. Usando joins


-- seleccionar los pasajeros con sus boletos y sus respectivos vuelos


SELECT *
FROM pasajeros p INNER JOIN boletos b
ON p.id_pasajero = b.id_pasajero_fk
INNER JOIN vuelos v ON b.id_vuelo_fk = v.id_vuelo;

-- ON DELETE

-- intentamos eliminar el pasajero con el id 3
-- no se puede ya que tiene boletos que dependen de el
DELETE FROM pasajeros WHERE id_pasajero = 3;

-- eliminamos todos los boletos que le pertenecen al pasajero con el id 3

DELETE FROM boletos WHERE id_pasajero_fk = 3;





-- create tables
-- insert tables
-- where
-- join