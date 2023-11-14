select ename,hiredate from emp where deptno = (select deptno from emp where ename = 'BLAKE');
select empno,ename,sal from emp where sal>=(select avg(sal) from emp) order by sal desc;
select deptno,empno, ename,sal from emp where deptno in (select deptno from emp where ename like ('%T%'));
select deptno, ename,job,sal from emp where deptno = (select deptno from dept where loc = 'DALLAS');
select ename,sal from emp where mgr = (select empno from emp where ename = 'KING');
select deptno,ename,job from emp where deptno = (select deptno from dept where dname = 'SALES');
select * from emp where sal>(select min(sal) from emp where deptno = 30);
select ename,job from emp where deptno = 10 and job in(select job from emp where deptno = 30);
select * from emp where (job,sal) in (select job ,sal from emp where ename = 'FORD') and ename != 'FORD';

select ename,job,deptno,sal from emp where job = (select job from emp where ename = 'JONES') 
or sal>(select sal from emp where ename = 'FORD') order by job ,sal desc;
select ename,job,sal from emp where sal in (select sal from emp where ename in('SCOTT','WARD')) and ename not in('SCOTT','WARD');
select ename,job from emp where job in (select job from emp where deptno = (select deptno from dept where loc = 'CHICAGO'));
select deptno,ename,sal from emp e where sal> (select avg(sal) from emp where e.deptno = deptno);
select deptno,ename,sal from emp e where sal<all(select avg(sal) from emp where e.deptno = deptno);
select job,ename,empno,deptno from emp m where empno in (select mgr from emp where mgr = m.empno);
--select job,ename,empno,deptno from emp where empno in (select mgr from emp );
select job,ename,job,deptno from emp where empno not in(select mgr from emp where mgr is not null);


create table emp_test(
empid varchar2(5) primary key,
firstname varchar2(10),
lastname varchar2(10),
salary number(7)
);
desc emp_test;
drop table emp_test;

create table MY_DATA1(
ID number(4) primary key,
NAME varchar2(10),
USERID varchar2(30),
SALARY number(10,2)
);
desc MY_DATA1;
drop table MY_DATA1;

create table emp1 as select * from emp;
select * from emp;
drop table emp1;

create table emp01(
EMPNO number(4),
ENAME varchar2(20),
SAL number(7,2)
);
desc emp01;
drop table emp01;

create table DEPT01(
DEPTNO NUMBER(2),
DNAME VARCHAR(14),
LOC VARCHAR(13)
);
desc dept01;
drop table dept01;

create table EMP04 as select empno,ename,sal from emp;
select * from emp04;
drop table emp04;

create table emp05 as select * from emp where deptno = 10;
select * from emp05;
drop table emp05;

create table emp06 as select * from emp where 1=0;
select * from emp06;
drop table emp06;

create table emp01 as select * from emp where sal between 1000 and 3000;
select * from emp01;
drop table emp01;

create table emp02 as select empno,ename,job,sal from emp;
select * from emp02;
drop table emp02;

create table emp03 as select empno,ename,job,sal,hiredate from emp where 0=1;
select * from emp03;
drop table emp03;

create table emp01 as select ename,sal,job,dname from emp e,dept d where e.deptno = d.deptno;
select * from emp01;
drop table emp01;

--                                   별칭 있어서 에러 안 나
create table emp02 as select w.ename 사원,m.ename 관리자 from emp w, emp m where w.mgr = m.empno; 
select * from emp02;
drop table emp02;

create table emp03(사원명,급여,업무,부서명) as select ename,sal,job,dname from emp e,dept d where e.deptno = d.deptno;
select * from emp03;
drop table emp03;

create table emp01 as select empno,ename,sal from emp where 1=0;
desc emp01;
select * from emp01;
alter table emp01 add(addr varchar(30));
alter table emp01 add(job varchar(20));
alter table emp01 modify(addr varchar2(60));
alter table emp01 modify(job varchar(30));
alter table emp01 drop(addr);
--데이터 그데로 있고 , 쓰지 못 함
alter table emp01 set unused column job;
alter table emp01 drop unused columns;
alter table emp01 drop(empno);
drop table emp01;

create table dept01 as select * from dept where 1=0;
desc dept01;
select * from dept01;
alter table dept01 add(dmgr varchar(20));
alter table dept01 modify(dmgr number);
alter table dept01 set unused column dmgr;
alter table dept01 drop unused columns;
drop table dept01;

create table emp01 as select * from emp where 1=0;
rename emp01 to sawon;
alter table sawon rename to emp01;
drop table emp01;

create table dept02 as select * from dept;
alter table dept02 rename to buseo;
drop table buseo;


create table juso(
no number(3) primary key,
name varchar2(10) ,
addr varchar2(20),
email varchar2(5)
);
select * from juso;
desc juso;
alter table juso add(phone varchar2(10) );
alter table juso modify(email varchar2(20));
alter table juso drop(addr);
drop table juso;

create table emp_demo as select * from emp;
select * from emp_demo;
drop table emp_demo;

create table emp_dept as select empno,ename,job,dname,loc from emp e, dept d where e.deptno = d.deptno;
select * from emp_dept;
drop table emp_dept;


create table emp_grade as select empno,ename,job,sal,comm,grade from emp,salgrade where sal between losal and hisal order by grade desc;
select * from emp_grade;
alter table emp_grade modify(sal number(12,4));
desc emp_grade;
drop table emp_grade;






