create database notasQuinto;
use notasQuinto;
create table alumnoPOO(
						dni int,
						nombre varchar(30),
						apellido varchar(30),
						email varchar (50) ,
						primary key (dni)
);
create table nota (
				id int auto_increment,
				dni int,
				trimestre int,
				valor int,
				motivo varchar(100),
				primary key (id),
				foreign key(dni) references alumnoPOO(dni)
);
create database instituto;
use instituto;
create table alumno(
						legajo int,
						nombre varchar(30),
						apellido varchar(30),
						promedio int (50) ,
						primary key (legajo)
);
