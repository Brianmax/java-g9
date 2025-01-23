CREATE TABLE IF NOT EXISTS estudiantes (
    estudiante_id SERIAL PRIMARY KEY,
    nombre VARCHAR(20),
    apellido VARCHAR(20),
    email VARCHAR(30)
);

CREATE TABLE IF NOT EXISTS profesores (
    profesor_id SERIAL PRIMARY KEY,
    nombre VARCHAR(20),
    apellido VARCHAR(20),
    email VARCHAR(30),
    telefono VARCHAR(10),
    salario FLOAT
);

CREATE TABLE IF NOT EXISTS cursos (
    curso_id SERIAL PRIMARY KEY,
    nombre VARCHAR(20),
    descripcion VARCHAR(255),
    profesor_id_fk INTEGER,
    FOREIGN KEY(profesor_id_fk) REFERENCES profesores(profesor_id)
);

CREATE TABLE IF NOT EXISTS matricula(
    matricula_id PRIMARY KEY,
    fecha DATE, 
    costo FLOAT,
    estudiante_id_fk INTEGER,
    curso_id_fk INTEGER
    FOREIGN KEY(estudiante_id_fk) REFERENCES estudiantes(estudiante_id),
    FOREIGN KEY(curso_id_fk) REFERENCES cursos(curso_id)
);

CREATE TABLE IF NOT EXISTS notas (
    nota_id SERIAL PRIMARY KEY,
    valora_nota INTEGER,
    curso_id_fk INTEGER,
    estudiante_id_fk INTEGER,
    FOREIGN KEY(curso_id_fk) REFERENCES cursos(curso_id),
    FOREIGN KEY(estudiante_id_fk) REFERENCES estudiantes(estudiante_id)
);


-- modificando la tabla de estudiantes --> email

ALTER TABLE estudiantes ALTER COLUMN email TYPE VARCHAR(50);

-- modificar la tabla de profesores --> telefono

ALTER TABLE profesores ALTER COLUMN telefono TYPE VARCHAR(12);

-- modificando la tabla de profesores --> email

ALTER TABLE profesores ALTER COLUMN email TYPE VARCHAR(50);

-- modificando la tabla de cursos --> nombre

ALTER TABLE cursos ALTER COLUMN nombre TYPE VARCHAR(50);

-- modificando la tabla de cursos --> descripcion

ALTER TABLE cursos ALTER COLUMN descripcion TYPE TEXT;

