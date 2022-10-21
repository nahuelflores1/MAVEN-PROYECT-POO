create database instituto;
use instituto;
create table ALUMNO(
						nombre varchar(30),
                        apellido varchar(30),
                        promedio int (50) ,
						legajo int,
						primary key (legajo)
);
select * from ALUMNO;

insert into ALUMNO values('baied', 'julian', 5, '9')





