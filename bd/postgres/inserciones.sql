
-- insertando estudiantes
insert into estudiantes (nombre, apellido, email) values('george', 'maxi', 'gmaxi@gmail.com');

insert into estudiantes (nombre, apellido, email) values('jose', 'ramirez', 'jramirez@gmail.com');

insert into estudiantes (nombre, apellido, email) values('julio', 'llerena', 'jllerena@gmail.com');


-- insertando profesores

insert into profesores (nombre, apellido, email, telefono, salario) 
values ('paul', 'rodriguez', 'prodriguez@gmail.com', '99999999', 3200);

insert into profesores (nombre, apellido, email, telefono, salario) 
values ('josue', 'vargas', 'jvargas@gmail.com', '99999999', 3500);

select * from profesores;

-- insertando cursos

insert into cursos (nombre, descripcion, profesor_id_fk) values ('programacion 1', 'es un curso muy bueno', 2);

select * from cursos;

insert into cursos (nombre, descripcion, profesor_id_fk) values ('programacion 1', 'es un curso muy bueno', 4);

-- insertar matriculas





