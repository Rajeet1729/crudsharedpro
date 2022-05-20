show databases;
create database sharedpro;
use sharedpro;
create table employee (Professor_name varchar(20), 
City varchar(20), 
Birthdate int(10) NOT NULL, 
Department_id int AUTO_INCREMENT, 
PRIMARY KEY (Department_id)
); 
Select * from employee;
insert into employee(Professor_name,city,Birthdate,Department_id)
values('abahy','Agra',125,789);



