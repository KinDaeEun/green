create table dept02 as select * from dept;
select * from dept02;
insert into dept02 values(99,'������','�뱸');
update dept02 set dname = 'ȸ���' where deptno = 99;
delete from dept02 where deptno = 99;


create table my_data(
id number(4) primary key,
name varchar2(10),
userid varchar2(30),
salary number(10,2));
desc my_data;
select * from my_data;

insert into my_data values(1,'Scott','sscott',10000);
insert into my_data values(2,'Ford','fford',13000);
insert into my_data values(3,'Patel','ppatel',33000);
insert into my_data values(4,'Report','rreport',23500);
insert into my_data values(5,'Good','ggood',44450);

update my_data set salary = 65000 where id = 3;
delete from my_data where name = 'Ford';
update my_data set salary = 15000 where salary<15000;
drop table my_data;


create table sawon(
s_no number(4) constraint sawon_no primary key,
s_name varchar2(20) not null,
s_hiredate date constraint sawon_h not null);
drop table sawon;


CREATE TABLE EMP02( 
EMPNO NUMBER(4) NOT NULL, 
ENAME VARCHAR2(10) NOT NULL, 
JOB VARCHAR2(9),
DEPTNO NUMBER(2)
);
select * from emp02;
INSERT INTO EMP02
VALUES(1111, 'KING', 'SALESMAN', 10);

create table deptuk(
deptno number(2) unique,
dname varchar2(14),
lov varchar2(140));
insert into deptuk values(10,'���','����');
insert into deptuk values(20,'���','����');
select * from deptuk;

create table sawon(
s_no number(4) primary key,
s_name varchar2(20) not null,
s_hiredate date constraint sawon_h not null,
s_email varchar2(20) unique);

insert into sawon values(1111,'����',sysdate,'k1@k.com');
insert into sawon values(2222,'����',sysdate,'k1@k.com');

CREATE TABLE EMP03( 
EMPNO NUMBER(4) UNIQUE,
ENAME VARCHAR2(10) NOT NULL, 
JOB VARCHAR2(9),
DEPTNO NUMBER(2)
);
INSERT INTO EMP03 VALUES(null, 'ALLEN', 'SALESMAN', 30);
INSERT INTO EMP03 VALUES(null, 'JONES', 'MANAGER', 20);
select * from emp03;

CREATE TABLE EMP04( 
EMPNO NUMBER(4) CONSTRAINT EMP04_EMPNO_UK UNIQUE,
ENAME VARCHAR2(10) CONSTRAINT EMP04_ENAME_NN NOT NULL, 
JOB VARCHAR2(9),
DEPTNO NUMBER(2)
);
SELECT TABLE_NAME, CONSTRAINT_NAME FROM USER_CONSTRAINTS WHERE TABLE_NAME IN('EMP04');

--table����
create table buseo(
deptno number(4) primary key,
dname varchar2(20),
loc varchar2(20));
create table sawon(
empno number(4) primary key,
ename varchar2(20),
deptno number(2) references buseo (deptno));
select * from sawon;

insert into buseo values(10,'���','����');
insert into sawon values(1111,'����',10);
insert into sawon values(2222,'����',null);
select * from buseo;
select* from sawon;

--�ڽ� ������ �θ� ���� �Ҽ� ����, on delete cascade ���� �θ� ������ �� �ڽı��� ����
create table dept01(
deptno number(2) primary key,
dname varchar2(20),
loc varchar2(20));

create table emp01(
empno number(4) primary key,
ename varchar2(20),
sal number(4),
deptno number(2) references dept01(deptno) on delete cascade);

insert into dept01 values(10,'ȫ��','û��');
insert into dept01 values(20,'�','����');
insert into emp01 values(2222,'����',1000,10);
insert into emp01 values(3333,'����',1000,10);

drop table dept01;
drop table emp01;

--check ���� ���� �� �´� ������ insert �ȵ�
drop table emp02;
create table emp02(
empno number(4) primary key,
ename varchar2(20),
sal number(5) check (sal>1000));
insert into emp02 values(1111,'����',2000);
insert into emp02 values(2222,'������',700);

--pk�ΰ� ���� �� 
create table emp04(
empno number(4),
ename varchar2(20),
sal number(5),
primary key(empno,ename));
select * from emp04;
select * from boarde;
--�θ��� pk �ΰ� ������
create table boarde(
no number(5) primary key,
content varchar2(100),
empno number(4),
ename varchar2(20),
foreign key(empno) references emp04(empno));
drop table boarde;

--fk���߿� �߰� ���� ����
--create table board(
--no number(5) primary key,
--content varchar2(100),
--empno number(4),
--ename varchar2(20)
--);
--alter table board add foreign key(empno,ename) references emp04 (empno,ename);

drop table emp01;
create table emp01(
empno number(4),
ename varchar2(20));

alter table emp01 add primary key (empno);


select * from dept01;
--�������� ����
alter table dept01 drop constraint SYS_C007044;
insert into dept01 values(10,'�λ�','�Ⱦ�');


alter table emp02 drop primary key;


select * from emp03;
alter table emp03 drop constraint SYS_C007025;
insert into emp03 values(7499,'a','b',30);


create table customers(
cno varchar(5) primary key,
cname varchar2(10),
addres varchar2(50),
email varchar2(20),
phone varchar(20));
drop table customers;
drop table orders;
create table orders(
orderno varchar2(10) primary key,
orderdate varchar2(8),
address varchar2(60),
phone varchar2(20),
status varchar2(5),
cno varchar2(5),
foreign key(cno) references customers(cno));

create table products(
pno varchar2(5) primary key,
pname varchar2(8),
cost number(8),
stock number(6));

create table orderdetail(
orderno varchar2(10),
pno varchar2(5),
qty number(6),
cost number(8),
primary key(orderno,pno),
foreign key(pno) references products(pno),
foreign key (orderno) references orders(orderno));



