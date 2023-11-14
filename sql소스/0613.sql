select max(sal),min(sal),sum(sal),round(avg(sal)) from emp;
select deptno ,count(*) from emp  group by deptno;
select deptno ,count(*) from emp  group by deptno having count(*)>=3;
select dname,
sum(decode(job,'CLERK',sal)) "CLERK",
sum(decode(job,'MANAGER',sal)) "MANAGER",
sum(decode(job,'PRESIDENT',sal)) "PRESIDENT",
sum(decode(job,'ANALYST',sal)) "ANALYST",
sum(decode(job,'SALESMAN',sal)) "SALESMAN",
sum(sal)
from dept,emp where emp.deptno = dept.deptno group by dname;

select e1.ename, count(e2.ename)+1 ��� from emp e1 ,emp e2 where e1.sal<e2.sal(+) group by e1.ename order by 2;


select deptno,job,sum(sal) from emp group by rollup(deptno, job) order by deptno,job;
select deptno,job,sum(sal) from emp group by cube(deptno, job) order by deptno,job;

select max(sal) from emp ;
select ename,sal from emp where sal=(select max(sal) from emp);
select ename, sal from emp where sal>=(select avg(sal) from emp);

select ename,sal, hiredate from emp where hiredate=(select min(hiredate) from emp);
select ename,job,sal from emp where sal<(select avg(sal) from emp);
select dname, ename,job,sal from emp,dept where emp.deptno = dept.deptno and dname = 'SALES' ;
select ename,job,sal from emp where deptno = (select deptno from dept where dname = 'SALES'); --������ ��� ����
select ename,job,hiredate,sal from emp where sal= (select min(sal) from emp);
select ename,job,sal,sal*12 ���� from emp where sal>(select avg(sal) from emp);
select ename,job,sal,dname from emp e, dept d where e.deptno = d.deptno and sal=(select max(sal) from emp);
select ename,job from emp where job = (select job from emp where empno = 7369) and sal>(select sal from emp where empno = 7876);

select empno,ename,sal from emp where sal>(select sal from emp where ename = 'BLAKE');
select empno,ename,hiredate from emp where hiredate>(select hiredate from emp where ename = 'MILLER');
select empno,ename,sal from emp where sal>(select avg(sal) from emp);
select empno,ename,sal from emp where deptno = (select deptno from emp where ename = 'CLARK') and sal>=(select sal from emp where empno = 7698);

select ename,deptno from emp where deptno=(select deptno from emp where ename = 'SCOTT');
select * from emp where job = (select job from emp where ename = 'SCOTT');
select ename,sal from emp where sal>(select sal from emp where ename = 'SCOTT');
select ename,d.deptno from emp e,dept d where e.deptno = d.deptno and loc=(select loc from dept where loc = 'DALLAS');
--select ename, d.deptno from emp e,dept d where e.deptno = d.deptno and loc = 'DALLAS';
select ename,sal from emp e,dept d where e.deptno = d.deptno and dname = (select dname from dept where dname = 'SALES');
select ename,sal from emp where mgr = (select empno from emp where ename = 'KING');
--select w.ename,w.sal from emp w,emp m where w.mgr = m.empno and m.ename = 'KING';

--�� �μ��� �ְ� �޿�
select empno,ename,sal, deptno from emp where sal in(select max(sal) from emp group by deptno);
select empno,ename,sal, deptno from emp where sal = any(select max(sal) from emp group by deptno);
select empno,ename,sal, deptno from emp where sal = some(select max(sal) from emp group by deptno);


select deptno,min(sal) from emp group by deptno having min(sal)>(select min(sal) from emp where deptno = 20);
select empno,ename,sal from emp where sal >(select avg(sal) from emp) order by sal desc,empno; 

select ename,sal,job from emp where sal>(select min(sal) from emp where job = 'SALESMAN') and job != 'SALESMAN';

--�޿� ����� ���� ���� ��պ���ū �޿��� ���� ����
select ename,sal from emp where sal> any(select avg(sal) from emp group by deptno);
-- 10/20/30 3���μ� ��� ��� ���� ū �޿��� ���� ���
select ename,sal from emp where sal> all(select avg(sal) from emp group by deptno);
--��� �޿��� ���� ū �μ��� ��ձ޿����� ���� �޴� ���
select ename,sal from emp where sal> (select sum(avg(sal)) from emp group by deptno);

select ename,sal,job from emp where sal> (select max(sal) from emp where job = 'SALESMAN');


select empno,job,deptno from emp where (job,deptno) in(select job,deptno from emp where empno in(7369,7499)) and empno not in(7369,7499);
select empno,job,deptno from emp where job in(select job from emp where empno in(7369,7499)) and deptno in(select deptno from emp where empno in(7369,7499));

--ȸ�� ��ձ޿� ���� ���� �޴� ���
select * from emp where sal>(select avg(sal) from emp);
--�ڱ� �μ� ��պ��� �޿��� ���� �޴� ���
select * from emp e1 where sal>(select avg(sal) from emp e2 where e1.deptno = e2.deptno);

--�������� ���,�̸�,�޿�
select empno,ename,sal from emp e where exists(select empno from emp where e.empno = mgr);
select empno,ename,sal from emp where empno in(select mgr from emp);
 
select ename,hiredate from emp where deptno = (select deptno from emp where ename = 'BLAKE');
select empno,ename,sal from emp where sal>(select avg(sal) from emp) order by sal desc;
select empno,ename,sal ,deptno from emp where deptno = (select deptno from emp where ename like('%T%'));

select ename,job sal from emp,dept where emp.deptno = dept.deptno and loc = 'DALLAS';
select w.ename,w.sal from emp w,emp m where w.mgr = m.empno and m.ename = 'KING';




