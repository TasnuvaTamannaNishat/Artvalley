create database ProjectDB;
 Use ProjectDB;
CREATE TABLE exhibition(
e_id int IDENTITY(1,1) NOT NULL PRIMARY KEY,
e_name varchar (50) NOT NULL,
startdate date NOT NULL,
end_date date NOT NULL,
g_id int foreign key references gallery(g_id),
g_name varchar(50) not null
);
select * from exhibition
select DATEDIFF(DD left,end_date,GETDATE())from exhibition;
CREATE TABLE gallery(
g_id int IDENTITY(1,1) NOT NULL PRIMARY KEY,
g_name varchar (50) NOT NULL,
g_type varchar (50) NOT NULL,
);
select getdate()
select*from exhibition
select * from gallery

create table artwork
(
pid int identity (1,1) not null,
pname varchar (50) not null,
duration varchar (50) not null,
height int not null,
width int not null,
price int not null,
issue_date date not null,
e_name varchar(50) not null,
aname varchar (50) not null,
aid int not null,
images image not null
)
