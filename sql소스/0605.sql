desc emp;
select * from emp;
select distinct deptno from emp;
select ename||'('||job||')' from emp;
select deptno||loc from dept;
select job||'('||sal||')' from emp;
select ename, sal,sal*12 "연 봉" from emp;
select ename||'의 업무는'||job||'이고 급여는'||sal||'만원입니다' from emp;

select ename, sal from emp where sal between 2000 and 3000;
select ename, sal from emp where sal >= 2000 and sal<=3000; --위에랑 결과 같음

select ename, sal from emp where sal not between 2000 and 3000;
select ename, sal from emp where sal < 2000 or sal>3000; --위에랑 결과 같음

select ename,deptno from emp where deptno = 10 or deptno = 20;
select ename,deptno from emp where deptno in (10,20); --위에랑 결과 같음

select ename,deptno from emp where deptno != 10 and deptno != 20;
select ename,deptno from emp where deptno not in (10,20); --위에랑 결과 같음

select ename,job,sal from emp where sal between 1500 and 2800;
select ename from emp where ename between 'C' and 'D' or ename between 'S' and'T';
select ename from emp where ename between 'A' and 'C';

select * from emp;
select ename, job, hiredate from emp where hiredate between '81/01/01' and '81/12/31';
select ename ,sal from emp where sal not between 1500 and 3000;
select ename, sal, hiredate from emp where hiredate not between '81/01/01' and '81/12/31';
select ename,job,sal,(sal+comm)*12 "연 봉" from emp where comm is not null and sal between 1000 and 3000;
select ename, job from emp where job in('MANAGER', 'SALESMAN');
select ename, sal,deptno from emp where sal between 2000 and 3000 and deptno in (10,20);
select ename , sal, job from emp where sal between 1500 and 3000 or job in('CLERK','ANAGER');

--%는 아무 글자나 갯스 제한 없음
select ename, sal, hiredate from emp where hiredate between '81/01/01' and '81/12/31';
select ename, sal, hiredate from emp where hiredate like '81%'; --위에랑 결과 같음
select ename from emp where ename between 'C' and 'D' or ename between 'S' and'T';
select ename from emp where ename like 'C%' or ename like 'S%'; --위에랑 결과 같음
--  like 검색                          뒷글자N               A포함
select ename from emp where ename like '%N' or ename like '%A%';
--                                이름중에 연속 LL             이름중에 LL있는 사람 (연속아니라도 포함)   
select ename from emp where ename like '%LL%' or ename like '%A%A%';
-- _는 아무글자나 한자 (이름 두번째 글자가 A인 사람)
select ename from emp where ename like '_A%';

update emp set ename = 'SMI%TH' where ename = 'SMITH';
select ename from emp where ename like '%\%%' escape '\';
select ename from emp where ename like '%4%%' escape '4';--위에랑 결과 같음
select ename, job from emp where job not in('SALESMAN','MANAGER');


select ename, hiredate from emp where hiredate like '81%';
select ename from emp where ename like '__R%';
select ename from emp where ename like '%K_';
select ename from emp where ename like '%\%%' escape '\';
select ename from emp where ename not like '%E%';
select ename,job,hiredate from emp where hiredate like '81%' and job ='MANAGER';
select ename,job,deptno from emp where deptno not in(10,30);
select ename, sal, hiredate from emp where hiredate like '81%' and sal between 1800 and 2500;
select ename from emp where ename like '%R%R%';
select ename, job, mgr from emp where mgr is null;

--대표이사면서 급여가 1500넘는 사람 또는 업무가 SALESMAN
select ename,job,sal from emp where job = 'SALESMAN' OR JOB = 'PRESIDENT' and sal > 1500; 
--SALESMAN 또는 대표이사중에서 급여가 1500넘는 사람
select ename,job,sal from emp where (job = 'SALESMAN' OR JOB = 'PRESIDENT') and sal >1500;

--asc 오름차순 desc 내림차순
select ename, sal,deptno from emp order by sal ;
select ename, sal,deptno from emp order by sal desc;
--숫자는 순서이고 1부터
select ename, sal,deptno from emp order by 1;
select ename,sal,sal*12 연봉 from emp order by 연봉;
--order by 앞에 컬럼이 같을 때 뒤 컬럼으로 비교
select ename, sal,deptno from emp order by deptno, sal desc;
select ename, sal,deptno from emp order by deptno desc, sal ;

select comm from emp;

select ename,job,sal,hiredate from emp order by hiredate;
select ename,job,deptno ,sal from emp where comm is null order by deptno, sal desc;
select ename,sal,(sal+nvl(comm,0))*12 연봉 from emp order by 연봉 desc;
select ename, job,sal  from emp where job in ('MANAGER','CLERK') order by job, sal desc;
select ename,job,deptno,sal from emp order by job desc ,deptno,sal;
select ename, job ,hiredate from emp where hiredate like '81%' order by job desc, hiredate;
select ename ,job from emp where ename like('A%') or ename like('S%') order by job,ename;
select ename, sal, deptno from emp where sal between 1000 and 3000 order by deptno desc, sal desc;


select empno,ename,job,sal from emp where sal>=3000;
select ename ,deptno from emp where empno = 7788;
select ename,job,hiredate from emp where hiredate between '1981/2/20' and '1981/5/1' order by hiredate;
select * from emp where deptno in(10,20) order by ename;
select ename employyee, sal "Monthly Salary" ,deptno from emp where sal>=1500 and deptno in(10,30);

select * from emp where hiredate like ('82%');


select * from emp where comm is not null;
select ename,sal,comm from emp where comm>sal*1.1;
select * from emp where job in('CLERK','ANALYST') and sal not in(1000,3000,5000);
select * from emp where ename like('%L%L%') and deptno  = 30 or mgr = 7782;





