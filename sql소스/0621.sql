use sakila;
show tables;
select * from actor;
select * from address;
use world;
show tables;
select * from city;
show databases;
create database test default character set utf8
collate utf8_general_ci;
use test;
create table dept(deptno int primary key, 
dname varchar(20),loc varchar(20));
create table emp(empno int primary key,
ename varchar(20), job varchar(20),
mgr int, hiredate date, sal float(7,2),
comm float(7,2),deptno int references dept(deptno));
create table salgrade(grade int,losal float(7,2),hisal float(7,2));
insert into dept values(10,'?šŒê³„í?','?„œ?š¸');
insert into dept values(20,'?—°êµ¬ì†Œ','?¸ì²?');
insert into dept values(30,'?˜?—…??','??? „');
insert into dept values(40,'?š´?˜??','ë¶??‚°');
select * from dept;

insert into salgrade values(1,700,1200);
insert into salgrade values(2,1201,1400);
insert into salgrade values(3,1401,2000);
insert into salgrade values(4,2001,3000);
insert into salgrade values(5,3001,9000);
select * from salgrade;
load data infile 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads/emp.txt'
into table emp character set euckr;
select * from emp;
use mysql;


show columns from user;

create user 'kim'@'%' identified by 'kim';
create user 'lee'@'localhost' identified by 'lee';
grant all on *.* to kim;
grant all on *.* to 'lee'@'localhost';

use test;
select * from emp where ename = "SCOTT";
select * from emp;
select * from dept;


select empno,ename,sal from emp where sal between 1000 and 3000;
select ename,sal,sal*12 ?—°ë´? from emp order by ?—°ë´? desc;
select ename from emp where ename like'%T__';
-- 5ëª? ê±´ë„ˆ?›°ê³? 5ëª? ê°–ê³ ?˜´
select ename,sal from emp order by sal desc limit 5,5;

select ename,sal, if(sal>2000,'good','poor') from emp;
select ename,deptno,if(deptno=10,'?šŒê³„í?',if(deptno = 20,'?—°êµ¬ì†Œ','?˜?—…??')) ë¶??„œëª? from emp;
select ename,sal,comm, sal+ifnull(comm,0) from emp;

select sha('a');

use test;
select empno,ename,sal deptno from emp where sal between 1500 and 2500;
select ename,sal,(sal+ifnull(comm,0))*12 ?—°ë´? from emp order by ?—°ë´? desc;
select ename,sal,deptno,if(deptno=10,'?šŒê³?',if(deptno = 20,'?—°êµ¬ì†Œ','?˜?—…'))ë¶??„œëª? from emp order by ë¶??„œëª?, sal desc;
select ename,job,hiredate from emp where job in('MANAGER','SALESMAN') order by hiredate limit 5;
select ename,job,hiredate from emp order by hiredate limit 5,5;

select count(*) / sum(sal) from emp ;
select * from emp;





