create or replace view emp_v1(���,�̸�,����,�Ի���,�޿�)
as select empno,ename,job,hiredate,sal deptno from emp where 
deptno = 20 with check option;
insert into emp_v1 values(1112,'����','����',sysdate,2000,20);
select* from emp_v1;

create or replace view emp_dept_v1 as select empno ���,ename �̸�,dname �μ��� from emp e ,dept d where e.deptno = d.deptno;
select * from emp_dept_v1;
drop view emp_dept_v1;

create view emp_sum as select deptno,sum(sal) sum_sal from emp group by deptno;
select * from emp_sum;

create view manager_work as select w.ename ���,m.ename ������ from emp w,emp m where w.mgr = m.empno;
select * from manager_work;




create view emp_v1 as select empno,ename,job,sal from emp;
create or replace view emp_v1 as select empno,ename,job,sal,hiredate from emp with read only;
create view emp_man1(������,�޿�,�����ڸ�) as select w.ename,w.sal,m.ename from emp w, emp m where w.mgr = m.empno;
create view emp_dept as select dname,sum(sal) sum_sal,max(sal) max_sal,min(sal) min_sal from emp e, dept d where e.deptno=d.deptno
group by dname;

--in_line �� from select���� ����Ͽ� ���̺� ���
select avg(sal) from (select * from emp where deptno=20);

select ename,deptno,sal from emp e where sal> (select avg(sal) from emp where e.deptno = deptno);

select ename,e.deptno,sal,avg_sal from emp e,(select deptno,round(avg(sal)) avg_sal from emp group by deptno) a
where e.deptno = a.deptno and sal>avg_sal;
select deptno,round(avg(sal)) avg_sal from emp group by deptno;

--rownum�� ���̺�� ���� �����Ѵ� ����
select rownum,ename,hiredate from emp;
select rownum,ename,hiredate from emp where rownum<=5;
--���̺�� ���� �����͸� �����ϴ� ������ �פ����� ������ �ٸ� �� ����

select rownum, a.* from
(select rownum rn,ename,hiredate from emp order by hiredate)a
where rownum<=5;


create view emp_view as select empno,ename,job,deptno from emp;
select * from emp_view;

select * from emp_view where deptno = 10;

create view sal_top5_view as select * from (select * from emp order by sal desc) where rownum<=3;
select * from sal_top5_view;


select * from(select empno,ename,sal,rank() over (order by sal desc) rank from emp) where rank between 6 and 10;

--�μ��� �޿� ū ��
select empno,ename,sal,deptno,rank() over(partition by deptno order by sal desc) rank from emp;



create view dname_ename_vu as select dname,ename from emp e,dept d where d.deptno = e.deptno;
select * from dname_ename_vu;

create view worker_manager_vu as select w.ename worker, m.ename manager from emp w, emp m where w.mgr = m.empno;
select * from worker_manager_vu;

select empno,ename,hiredate from emp order by hiredate desc;

select * from(select empno,ename,hiredate from emp order by hiredate desc) where rownum<=5;

select * from(select empno,ename,hiredate,rank() over( order by hiredate desc)rank from emp) where rank between 6 and 10;
drop table buseo;


