select * from tab; -- scott�� ������ table
desc dept;  
desc emp;
select empno, ename, hiredate from emp;
select * from emp;
select empno, ename, job, sal from emp where sal > 2000;
SELECT * from emp where ename = 'SCOTT';
-- 1. scott  ������ table
select * from tab;
-- 2. salgrade table�Ǳ���
desc salgrade;
-- emp table�� �̿�
-- 3. ���, �̸�, ����, �Ի���
select empno, ename, job,hiredate from emp;
-- 4. �޿��� 2500 ������ ���� �̸�, ����, �Ի���, �޿�
select ename,job,hiredate,sal from emp where sal <= 2500;
-- 5. �޿��� 3000�� ����� ���, �̸�, ����, �޿�
select empno, ename, job,sal from emp where sal = 3000;
-- 6. ALLEN�� �̸�, �Ի���, �޿�, �μ��ڵ�
select ename,hiredate,sal,deptno from emp where ename='ALLEN';
-- 7. �μ��ڵ尡 20�� ������ ��� �÷�
select * from emp where deptno=20;
-- 8. �޿��� 1600�̸��� ������ ���, �̸�, �޿�, ����
select empno,ename,sal,job from emp where sal < 1600;
-- 9. ������ SALESMAN�� ������ ��� ����
select * from emp where job='SALESMAN';
-- 10. deptno�� 20�� �ƴ� ������ ��� ����
select * from emp where deptno != 20;
-- 82�� 1�� 1�� ���Ŀ� �Ի��� ���
select * from emp where hiredate >= '82/01/01';

select * from emp where deptno != 20;
select * from emp where not deptno = 20;
select * from emp where deptno=20 and sal < 2000;
select * from emp where deptno=20 or sal < 2000;

-- ���, �̸�, ����,�Ի���, �޿�, �μ��ڵ� 
-- ���� �μ��ڵ尡 20�̰� ������ MANAGER
select empno, ename, job,hiredate,sal,deptno from emp 
 where deptno=20 and job='MANAGER';


select ename, sal, sal*12, sal + 100 from emp;
select ename,sal,comm,hiredate from emp where comm=null;
select ename,sal,comm,hiredate from emp where comm is null;
select ename,sal,comm,hiredate from emp where comm is not null;
select ename,sal,comm,sal+comm from emp;
select ename,sal,comm,sal+nvl(comm,0),sal+nvl(comm,100) from emp;
select sal,nvl(comm,0) comm from emp;
--                         null? ������   nulló��
select ename,sal,comm,nvl2(comm,sal+comm,sal) from emp;
select ename,sal,comm,coalesce(sal+comm,sal) from emp;

select ename as "�̸�", job "����", sal �޿�, 
 hiredate "�Ի� ��" from emp;
 
-- 1. ���,�̸�, �޿�, comm comm�� null�� �ƴ� ���
select empno,ename,sal,comm from emp where comm is not null;
-- 2. ���, �̸�, �޿� comm,job�� comm�� null�� �ƴϰų� ������ MANAGER�� ���
select empno,ename,sal,comm,job from emp 
 where comm is not null or job = 'MANAGER';
-- 3. �̸�, ����,�޿�,����(=(�޿�+comm)*12,comm�� null�̸� 0����) ���� ��Ī
select ename,job,sal,(sal+nvl(comm,0))*12 ���� from emp;
-- 4. �̸�,�Ի���,�޿�,comm,job comm�� null�̰ų� ������ ANALYST�� ���
select ename,hiredate,sal,job,comm from emp where comm is null
 or job='ANALYST';
-- 5. �̸�,�޿�,�Ի���,�μ��ڵ� 10���̰� �޿��� 2500�̻��� ���
select ename,sal,hiredate,deptno from emp where
  deptno=10 and sal >= 2500;
-- 6. �̸�,�޿�,comm, �޿�+comm ��¥ �޿�  ��Ī���� ���(comm�� null�̸� 0)
select ename,sal,nvl(comm,0),sal+nvl(comm,0) "��¥ �޿�" 
from emp;
-- 7. emp table ����
desc emp;
-- 8. �̸�, �޿�, �Ի��� �޿��� 2000�̻��̰� 3000������ ���
select ename,sal,hiredate from emp where sal >= 2000 and
 sal <= 3000;
-- oracle���� concat�Լ� 2���� ����
select ename||'('||job||')' ���� from emp;

select ename||'('||empno||')'  from emp;

select ename||' is a '||job from emp;
-- distinct �ߺ��� ��� 1ȸ�� ���
select distinct deptno from emp;


--                     ename                �޿�*12
-- 1. ename�� salary�� ��KING: 1 Year salary = 60000
select ename||': 1 Year salary = '||sal*12  from emp;
-- 2. xxx�� ������ xxx�̰� �޿��� xxx�̴�
select ename||'�� ������ '||job||'�̰� �޿��� '||sal||'�̴�'
  from emp;
-- 3. xxx(�Ի���) ���� �޿��� 2500�̻��� �����
select ename||'('||hiredate||')' from emp where sal>=2500;
-- 4. job�� ����
select distinct job from emp;
-- 5. �̸�, �޿�, ����(=(sal+comm)*12�ε� comm�� null�̸� 0) ��Ī
select ename,sal,(sal+nvl(comm,0))*12 ���� from emp;
-- 6. xxx�� �Ի����� xx/xx/xx�̰� ������ xxx�̴� ���� comm�� null�ƴ� ���
select ename||'�� �Ի����� '||hiredate||'�̰� ������ '||job||
'�̴�' from emp where comm is not null;









select rowNum ,a.* from(select * from emp order by sal desc)a where rowNum between 2 and 20;

select* from(select rowNum rn, a.* from (select * from emp order by sal desc)a) where rn between 1 and 20;



