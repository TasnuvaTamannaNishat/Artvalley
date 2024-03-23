use ProjectDB



CREATE TABLE gallery(
g_id int IDENTITY(1,1) NOT NULL PRIMARY KEY,
g_name varchar (50) NOT NULL,
g_type varchar (50) NOT NULL,
aid int foreign key references adlogin(aid)
);
select * from gallery
select getdate()
select*from exhibition

create table artworkk
(
pid int identity (1,1) primary key not null,
pname varchar (50) not null,
duration varchar (50) not null,
height int not null,
width int not null,
price int not null,
issue_date date not null,
e_id int not null foreign key references exhibition(e_id),
e_name varchar(50) not null,
aname varchar (50) not null,
aid int not null foreign key references artists(Artist_id),
images image not null,
approve varchar(20) NULL DEFAULT 'false',
sold varchar(20) NULL DEFAULT 'false'
)


create table artists (
Artist_id int  identity (1,1) primary key not null,
Artist_Name varchar (40) not null,
Artist_Phone int not null,
Artist_email varchar (50) not null,
Artist_Credit_card int not null
)
select * from artists


select * from artworkk
create table customer
(
cid int identity(1,1) primary key not null,
cname varchar(50) not null,
cmobile varchar(50) not null,
pid int not null foreign key references artworkk(pid)
);
select * from customer



create table adlogin (
aid int identity(1,1) primary key not null,
aname varchar (50),
apassword int
)
insert into adlogin(aname,apassword)
values ('nishat',1234);
insert into adlogin(aname,apassword)
values ('noholi',2345);
insert into adlogin(aname,apassword)
values ('roza',3456);
select * from adlogin ;

create table atlogin
(
arid int identity(1,1) not null,
arname varchar (50),
arpassword int,
armail varchar (50)
)

select * from atlogin ;

create table clogin
(
crid int identity(1,1) not null,
crname varchar (50),
crpassword int,
crmail varchar (50)
)

select*from clogin ; 

CREATE TABLE exhibition(
e_id int IDENTITY(1,1) NOT NULL PRIMARY KEY,
e_name varchar (50) NOT NULL,
startdate date NOT NULL,
end_date date NOT NULL,
g_id int foreign key references gallery(g_id)

);
select * from exhibition

select DATEDIFF(DD left,end_date,GETDATE())from exhibition;


select getdate()
