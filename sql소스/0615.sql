select * from dept;
insert into dept(deptno,dname,loc) values(50,'È«º¸','½ÅÃÌ');
insert into dept values(60,'ÀÎ»ç','¸¶Æ÷');

insert into emp values(111,user,'¿¬±¸¿ø',7839,sysdate,4700,null,10);
select * from emp;

create table dept01 as select * from dept where deptno in(10,20);
select * from dept01;
insert into dept01 select * from dept where deptno in(30,40);
insert into dept01 select * from dept where deptno in(50,60);

create table sam01 (
empno number(4),
ename varchar2(10),
job varchar2(9),
sal number(7,2)
);
desc sam01;
select * from sam01;
insert into sam01 (empno,ename,job,sal) values(1000,'APPLE','POLICE',10000);
insert into sam01 (empno,ename,job,sal) values(1010,'BANANA','NURSE',15000);
insert into sam01 values(1020,'ORANGE','DOCTOR',25000);
insert into sam01 values(1030,'VERY',null,25000);
insert into sam01 (empno,ename,sal) values(1040,'CAT',2000);
insert into sam01 select empno,ename,job,sal from emp where deptno = 10;
delete from sam01 where empno = 1020 and job is null;

insert into dept values (&deptno,'&dname','&l');
select * from dept;

select empno,&a,&b from emp;

select &a,&b from emp;
select * from emp where job = '&job';
select * from emp where sal>&&s;
define s;
undefine s;

accept a prompt '°ªÀ» ÀÔ·ÂÇÏ¼¼¿ä';
select * from emp where sal >&a;


select * from sam01;
update sam01 set sal = 3000 where empno = 1000;
update sam01 set sal = 2700, job = 'È«º¸' where empno = 1010;

create table emp01 as select * from emp;
select * from emp01;
update emp01 set hiredate = sysdate where deptno = 20;
update emp01 set sal = sal*1.1 where deptno = 10;
update emp01 set hiredate = sysdate, sal = 3200 where job = 'MANAGER';
update emp01 set sal = sal-500 where deptno = 30;

select * from sam01;
update sam01 set sal = sal - 500 where empno in(1020,1000,1030);

select * from emp01;
update emp01 set sal = (select sal from emp01 where empno = 7521),hiredate = (select hiredate from emp01 where ename = 'JONES') 
where empno = 7369;

select * from dept01;
update dept01 set loc = (select loc from dept01 where deptno = 40) where deptno = 20;

select * from emp01;
update emp01 set job = (select job from emp01 where empno = 7844), hiredate = (select hiredate from emp01 where ename = 'WARD')
where ename = 'BLAKE';

alter table emp01 add(dname varchar2(20));
update emp01 e set dname= (select dname from dept where e.deptno = deptno);

create table sam02 as select ename,sal,hiredate,deptno from emp;
select * from sam02;

update sam02 set sal = sal+1000 where  deptno= (select deptno from dept where loc = 'DALLAS');



drop table emp01;
create table emp01 as select * from emp;
select * from emp01;
delete from emp01 where empno = 7499;
delete from emp01 where substr(hiredate,1,2) = 83;
delete from emp01 where deptno = 30;
delete from emp01 where deptno=(select deptno from dept where dname = 'DALLAS');
delete from emp01 where mgr=(select empno from emp where ename = 'KING');
delete from emp01 where mgr is null;

select * from dept;
insert into emp values(1112,'Ã¶¼ö','È«º¸',7369,sysdate,3000,100,71);


commit;
select * from dept;
delete from dept where deptno in(52,60);
rollback;

select* from emp;

select deptno, sum(sal),avg(sal),count(*) from emp group by deptno ;

select dname,loc,job,max(sal),min(sal) from emp e,dept d where e.deptno = d.deptno group by dname,loc,job order by dname,job;

select  to_char(hiredate,'YY') H_YEAR,count(*),min(sal),max(sal),avg(sal),sum(sal) from emp group by to_char(hiredate,'YY') order by H_YEAR ;
create table emp1(
empno number(4) primary key,
ename varchar2(20),
job varchar2(20),
mgr number(7,2),
hiredate date,
sal number(7,2),
comm number(7,2),
deptno number(2));
drop table ;
create table dept1(
deptno number(2) primary key,
dname varchar2(20),
loc varchar2(20));
