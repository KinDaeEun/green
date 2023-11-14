create sequence dept_seq;
select * from dept01;
insert into dept01 values(dept_seq.nextval,'a3','b3');

select dept_seq.currval,dept_seq.nextval from dual;
drop sequence dept_seq;

create sequence emp_seq start with 1 increment by 1 maxvalue 100000;
drop table emp01;
create table emp01(
empno number(4) primary key,
ename varchar2(10),
hiredate date);

insert into emp01 values(emp_seq.nextval,'JULIA',sysdate);
select * from emp01;
drop sequence emp_seq;

create sequence test_seq start with 1 increment by 1 maxvalue 999999;
drop sequence test_seq;

create table dept_example(
deptno number(4) primary key,
dname varchar2(15),
loc varchar(15));
 
drop table dept_example;
drop sequence dept_example_seq;
create sequence dept_example_seq start with 1 increment by 1 maxvalue 3;

insert into dept_example values(dept_example_seq.nextval,'a','b');
insert into dept_example values(dept_example_seq.nextval,'a','b');
insert into dept_example values(dept_example_seq.nextval,'a','b');
insert into dept_example values(4,'e','r');
select * from dept_example;



create index idx_emp01_ename on emp01(ename);
drop index idx_emp01_ename;

--µ¿ÀÇ¾î
create synonym e for emp;
select * from e;
drop synonym e;


create user kim identified by kim;
grant create session to kim;
revoke create session from kim;
grant select on emp to kim;
grant select on dept to kim;
revoke select on emp from kim;
revoke select on dept from kim;

grant connect,resource to kim;

drop table emp04;
select * from dept;

drop table emp;
drop table dept;
select * from emp;
select * from dept;


