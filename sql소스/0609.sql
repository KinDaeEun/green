select emp.ename, emp.job, dept.dname from emp, dept where emp.deptno = dept.deptno;
-- e��d�� ���̺� ��Ī
select e.ename, e.job, d.dname from emp e, dept d where e.deptno = d.deptno;
select ename, job, dname,d.deptno from emp e, dept d where e.deptno = d.deptno;

select * from dept;
select e.empno,e.ename,e.job,d.dname from emp e,dept d where e.deptno = d.deptno ;
select e.ename, e.job,e.sal,d.dname,d.loc from emp e, dept d where e.deptno = d.deptno order by d.dname, sal desc;
select e.ename,e.job,e.deptno, d.dname from emp e, dept d where e.deptno = d.deptno and sal between 1000 and 3000;
select ename, sal, sal*12 ����, d.dname, d.loc from emp, dept d where emp.deptno = d.deptno order by ���� desc;
select ename,job,sal, hiredate, d.dname, d.loc from emp, dept d 
where emp.deptno = d.deptno and substr(hiredate,1,2) = 81 and job = 'MANAGER';
select ename, job,sal,e.deptno, d.loc from emp e, dept d where e.deptno = d.deptno and job in('SALESMAN','MANAGER') 
order by loc, sal;
select ename,sal from emp ,dept where emp.deptno = dept.deptno and loc = 'NEW YORK';
select ename, hiredate from emp, dept where emp.deptno = dept.deptno and dname = 'ACCOUNTING';
select ename,dname from emp e,dept d where e.deptno = d.deptno and job = 'MANAGER';


select * from emp;
select * from salgrade;
select empno ename,sal,grade from emp,salgrade where sal between losal and hisal;

select empno,ename,sal,grade from emp ,salgrade where sal between losal and hisal;
select ename,job,sal,grade ,dname from emp ,salgrade,dept where emp.deptno = dept.deptno and sal between losal and hisal;
select ename,job,sal,grade,dname,loc from emp,salgrade,dept where emp.deptno = dept.deptno and sal between losal and hisal;
select ename, job,sal,grade,emp.deptno,dname from emp ,salgrade ,dept 
where emp.deptno = dept.deptno and sal between losal and hisal and job in ('MANAGER','SLESMAN');
select ename,sal,grade,e.deptno,loc from emp e, dept d,salgrade 
where sal between losal and hisal and e.deptno = d.deptno and comm is not null order by e.deptno, sal desc;
select dname,ename,hiredate,sal,grade from emp,salgrade ,dept 
where emp.deptno = dept.deptno and sal between losal and hisal and dname = 'ACCOUNTING';
select ename,job,sal,grade,hiredate, dname, loc from emp e,dept d, salgrade s where e.deptno = d.deptno and
sal between losal and hisal and substr(hiredate,1,2) = 81 and job = 'MANAGER';


--deptno 4��, ������ ���� �μ��� 1�� ����
select * from dept;
--deptno 3��
select distinct deptno from emp;
--������ ���� +ǥ��(oracle)
select ename,dname from emp e, dept d where e.deptno(+) = d.deptno;
select empno,ename, dname,loc from emp e, dept d where e.deptno(+) = d.deptno;
select ename,job,d.deptno,dname,nvl(sal,0) from emp e ,dept d where e.deptno(+) = d.deptno order by sal desc;
select ename,job,sal,dname from emp e,dept d  where e.deptno(+) = d.deptno and job in('MANAGER','CLERK');
select ename,job,sal,loc from emp e,dept d where e.deptno(+) = d.deptno and  comm is null ;
select ename,job,sal,d.deptno loc from emp e,dept d  where e.deptno(+) = d.deptno and dname = 'ACCOUNTING';
select  distinct deptno from emp;

--w���� m������
select w.ename,m.ename from emp m, emp w where w.mgr = m.empno;
select w.ename ���, w.sal,grade, m.ename ������ from  emp w, emp m, salgrade where w.mgr = m.empno and w.sal between losal and hisal ;
select w.ename,w.sal,grade,dname,m.ename from emp w,emp m,dept d,salgrade where w.deptno = d.deptno and
w.sal between losal and hisal and w.mgr = m.empno;
select w.ename||'�� �����ڴ�'||m.ename||'�̴�' from emp w, emp m where w.mgr = m.empno;
select w.ename, w.job from emp w,emp m where w.mgr = m.empno and m.ename = 'KING';
select w.ename, d.loc, w.sal,m.ename from emp w,emp m, dept d where w.deptno  = d.deptno and w.mgr = m.empno
and w.sal between 1000 and 3000;
select w.ename, w.sal, w.job, grade, dname, m.ename from emp w,emp m,dept d ,salgrade where w.mgr = m.empno and 
w.deptno = d.deptno and w.sal between losal and hisal and w.job in('MANAGER','SALESMAN') order by dname;


