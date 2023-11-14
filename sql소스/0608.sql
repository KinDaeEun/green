select empno,ename,sal,job,
case job when 'ANALYST' then sal*1.1
         when 'CLERK' then sal*1.2
         when 'MANAGER' then sal*1.3
         when 'PRESIDENT' then sal*1.4
         when 'SALESMAN' then sal*1.5
         else sal end �޿� from emp;
         
select empno,ename,sal,job,
decode(job , 'ANALYST' , sal*1.1, 'CLERK' , sal*1.2, 'MANAGER' , sal*1.3,
'PRESIDENT' , sal*1.4, 'SALESMAN' , sal*1.5, sal ) �޿� from emp;

select ename, deptno,
case deptno when 10 then 'ȸ����'
            when 20 then '������'
            when 30 then '������'
            else '���' end �μ��� from emp;  
            
select ename, deptno, decode(deptno, 10, 'ȸ����',20,'������',30,'������','���') �μ��� from emp;


select extract (year from sysdate) from dual;
select * from emp where extract(year from hiredate) =1981;
select * from emp where extract(month from hiredate) = 02;


select sysdate "Current Date" from dual;
select empno,ename,job,sal,sal*1.15 "New Salary", sal*1.15 - sal Increase from emp;
select ename, hiredate,next_day(add_months(hiredate,6),'��') from emp;
select ename,hiredate,round( months_between(sysdate,hiredate)) "�ٹ� ����",
round( months_between(sysdate,hiredate)) * sal �޿��Ѱ� from emp;
select ename, lpad(sal,15,'*') from emp;
select ename,job,hiredate, to_char(hiredate,'DAY') from emp;
select ename, length(ename),job from emp where length(ename)>=6;
select ename, job, sal, comm, sal+nvl(comm,0) from emp;

select ename,substr(ename,2,3) from emp;
select empno,ename,hiredate from emp where extract(month from hiredate) = 12;
select empno, ename,lpad(sal,10,'*')�޿� from emp;
select empno,ename,to_char(hiredate,'YYYY-mm-dd') �Ի��� from emp;

select empno,ename,sal,case when sal between 0 and 1000 then 'E'
                            when sal between 1001 and 2000 then 'D'
                            when sal between 2001 and 3000 then 'C'
                            when sal between 3001 and 4001 then 'B'
                            else 'A' end ��� from emp;
               
               
               
            
               
               
               


