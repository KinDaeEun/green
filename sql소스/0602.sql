select * from tab; -- scott가 소유한 table
desc dept;  
desc emp;
select empno, ename, hiredate from emp;
select * from emp;
select empno, ename, job, sal from emp where sal > 2000;
SELECT * from emp where ename = 'SCOTT';
-- 1. scott  소유의 table
select * from tab;
-- 2. salgrade table의구조
desc salgrade;
-- emp table을 이용
-- 3. 사번, 이름, 업무, 입사일
select empno, ename, job,hiredate from emp;
-- 4. 급여가 2500 이하의 직원 이름, 업무, 입사일, 급여
select ename,job,hiredate,sal from emp where sal <= 2500;
-- 5. 급여가 3000인 사람의 사번, 이름, 업무, 급여
select empno, ename, job,sal from emp where sal = 3000;
-- 6. ALLEN의 이름, 입사일, 급여, 부서코드
select ename,hiredate,sal,deptno from emp where ename='ALLEN';
-- 7. 부서코드가 20인 직원의 모든 컬럼
select * from emp where deptno=20;
-- 8. 급여가 1600미만의 직원의 사번, 이름, 급여, 업무
select empno,ename,sal,job from emp where sal < 1600;
-- 9. 업무가 SALESMAN인 직원의 모든 정보
select * from emp where job='SALESMAN';
-- 10. deptno가 20이 아닌 직원의 모든 정보
select * from emp where deptno != 20;
-- 82년 1월 1일 이후에 입사한 사람
select * from emp where hiredate >= '82/01/01';

select * from emp where deptno != 20;
select * from emp where not deptno = 20;
select * from emp where deptno=20 and sal < 2000;
select * from emp where deptno=20 or sal < 2000;

-- 사번, 이름, 업무,입사일, 급여, 부서코드 
-- 조건 부서코드가 20이고 업무가 MANAGER
select empno, ename, job,hiredate,sal,deptno from emp 
 where deptno=20 and job='MANAGER';


select ename, sal, sal*12, sal + 100 from emp;
select ename,sal,comm,hiredate from emp where comm=null;
select ename,sal,comm,hiredate from emp where comm is null;
select ename,sal,comm,hiredate from emp where comm is not null;
select ename,sal,comm,sal+comm from emp;
select ename,sal,comm,sal+nvl(comm,0),sal+nvl(comm,100) from emp;
select sal,nvl(comm,0) comm from emp;
--                         null? 값있음   null처리
select ename,sal,comm,nvl2(comm,sal+comm,sal) from emp;
select ename,sal,comm,coalesce(sal+comm,sal) from emp;

select ename as "이름", job "업무", sal 급여, 
 hiredate "입사 일" from emp;
 
-- 1. 사번,이름, 급여, comm comm이 null이 아닌 경우
select empno,ename,sal,comm from emp where comm is not null;
-- 2. 사번, 이름, 급여 comm,job이 comm이 null이 아니거나 업무가 MANAGER인 경우
select empno,ename,sal,comm,job from emp 
 where comm is not null or job = 'MANAGER';
-- 3. 이름, 업무,급여,연봉(=(급여+comm)*12,comm이 null이면 0으로) 연봉 별칭
select ename,job,sal,(sal+nvl(comm,0))*12 연봉 from emp;
-- 4. 이름,입사일,급여,comm,job comm이 null이거나 업무가 ANALYST인 사람
select ename,hiredate,sal,job,comm from emp where comm is null
 or job='ANALYST';
-- 5. 이름,급여,입사일,부서코드 10번이고 급여가 2500이상인 사람
select ename,sal,hiredate,deptno from emp where
  deptno=10 and sal >= 2500;
-- 6. 이름,급여,comm, 급여+comm 진짜 급여  별칭으로 출력(comm이 null이면 0)
select ename,sal,nvl(comm,0),sal+nvl(comm,0) "찐짜 급여" 
from emp;
-- 7. emp table 구조
desc emp;
-- 8. 이름, 급여, 입사일 급여가 2000이상이고 3000이하인 사람
select ename,sal,hiredate from emp where sal >= 2000 and
 sal <= 3000;
-- oracle에서 concat함수 2개만 가능
select ename||'('||job||')' 직원 from emp;

select ename||'('||empno||')'  from emp;

select ename||' is a '||job from emp;
-- distinct 중복된 경우 1회만 출력
select distinct deptno from emp;


--                     ename                급여*12
-- 1. ename과 salary을 “KING: 1 Year salary = 60000
select ename||': 1 Year salary = '||sal*12  from emp;
-- 2. xxx의 업무는 xxx이고 급여는 xxx이다
select ename||'의 업무는 '||job||'이고 급여는 '||sal||'이다'
  from emp;
-- 3. xxx(입사일) 조건 급여가 2500이사인 사람만
select ename||'('||hiredate||')' from emp where sal>=2500;
-- 4. job의 종류
select distinct job from emp;
-- 5. 이름, 급여, 연봉(=(sal+comm)*12인데 comm이 null이면 0) 별칭
select ename,sal,(sal+nvl(comm,0))*12 연봉 from emp;
-- 6. xxx의 입사일은 xx/xx/xx이고 업무는 xxx이다 조건 comm이 null아닌 경우
select ename||'의 입사일은 '||hiredate||'이고 업무는 '||job||
'이다' from emp where comm is not null;









select rowNum ,a.* from(select * from emp order by sal desc)a where rowNum between 2 and 20;

select* from(select rowNum rn, a.* from (select * from emp order by sal desc)a) where rn between 1 and 20;



