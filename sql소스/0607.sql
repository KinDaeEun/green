select empno, ename, hiredate, job, sal from emp where hiredate like ('81%');
select empno, ename, hiredate, job, sal from emp where hiredate like('81%') and job !='MANAGER';
select empno, ename, hiredate, job, sal from emp order by sal desc, hiredate;
select empno, ename from emp where ename like('__N%');
select empno, ename, sal*12 연봉 from emp where sal*12 >35000;

select ename,initcap(ename), upper(ename), lower(ename) from emp;
select * from emp where lower(job) = 'salesman';
--oracle concat 두개만 가능해서 주로 ||로 사용
select concat(ename,sal)from emp;
--ename에서 2번째 부터 3글자
select ename, substr(ename,2,3),substr(ename,-4,3) from emp;
select ename, length(ename) from emp;
--무조건 from table명 형식
--dual은 dummy을 지칭하는 의미 없는 한건 데이터를 가졌음
select length('oracle'), length('오라클') from dual;
--lengthb 차지하는 바이트
select lengthb('oracle'), lengthb('오라클') from dual;
select substr('oracle',2,3), substr('오라클',2,3) from dual;
--substrb 바이트 길이
select substrb('oracle',1,3), substrb('오라클',1,3) from dual;

--2월에 입사한 사람
select ename, hiredate from emp where hiredate like '%02%'; -- 02일에 입사한 사람도 포함될수 있음
select ename, hiredate from emp where substr(hiredate, 4,2) = 02;


select * from emp where substr(hiredate, 1,2) = 83;
select * from emp where substr(ename, -1,1) = 'E';
--            L자가 있는 위치            처음부터 찾아서 첫번째 L 위치     처음부터 찾아서 두번째 L 위치 
select ename, instr(ename,'L') e_null, instr(ename,'L',1,1) e_ll, instr(ename,'L',1,2) e_l2,
--4번째부터 찾아서 첫번째 L 위치   4번째부터 찾아서 두번째 L 위치 
instr(ename,'L',4,1) e_4l, instr(ename,'L',4,2) e_42 from emp;

--           8자리 확보 빈칸 *로 체움  (lpad 왼쪽, rpad 오른쪽)
select ename, lpad(ename, 8,'*'), lpad(ename, 8,'@') from emp;
select ename, rpad(ename, 8,'*'),rpad(ename, 8,'@') from emp;

--                 왼쪽의 M지움       오른쪽의 N지움
select ename, job, ltrim(job,'M'), rtrim(job,'N') from emp;
--양쪽 S지움
select ename, trim('S' from ename) from emp;
--                              두번째칸의 내용을 3번째 칸으로 변환
select ename,sal,translate(sal,'012345','영일이삼사오') from emp;
--                              두번재칸의 단어를 3번째 간의 단어로 변환
select ename, job, replace(job,'MAN','PERSON') from emp;

select nvl(comm,0) from emp;
select ename ,lower(ename),upper(ename), initcap(ename) from emp;
select ename ,job, substr(job,2,3) from emp;
select ename, length(ename) from emp order by 2 ;
select ename,sal,lpad(sal,6,'*') from emp ;
select ename,sal,hiredate from emp where substr(hiredate,-2,2) = 09;
select ename, job,replace(job,'MAN','PERSON') from emp;
select ename,sal, rtrim(sal, '0') from emp;


select 10,-10, abs(-10) from dual;
select ename, sal/3, round(sal/3), round(sal/3,1), round(sal/3,2),
--      십의 자리        백의 자리
round(sal/3,-1),round(sal/3,-2) from emp;
--절사,버림
select ename, sal/3,trunc(sal/3),trunc(sal/3,1),trunc(sal/3,2),trunc(sal/3,-1),trunc(sal/3,-2) from emp;
--양수에서는 trunc와 floor의 결과가 같다
select ename, sal/-3,round(sal/3), trunc(sal/3),ceil(sal/3),floor(sal/3) from emp;
select ename, sal/3,round(-sal/3), trunc(-sal/3),ceil(-sal/3),floor(-sal/3) from emp;

--mod 나머저
select mod(10,3), mod(7,3) from dual;
--power 거듭제곱
select power(2,3), power(3,4) from dual;
--sqal 제곱근
select sqrt(2) from dual;
select chr(65) from dual;


select ename,sal/7,round(sal/7),round(sal/7,1), round(sal/7,-2) from emp;
select ename,-sal/7, trunc(-sal/7),trunc(-sal/7,2), trunc(-sal/7,-1) from emp;
select ename,sal/7,round(sal/7),trunc(sal/7),ceil(sal/7),floor(sal/7) from emp where job in('MANAGER','CLERK');
select ename,-sal/7,round(-sal/7),trunc(-sal/7), ceil(-sal/7),floor(-sal/7) from emp where deptno = 20 order by ename desc;


select sysdate from dual;
select sysdate, sysdate - 1 어제, sysdate+1 내일 from dual;

select ename, hiredate, round(sysdate-hiredate) 근무일,round((sysdate-hiredate)/7) 근무주 ,
--        근무를 몇 개월 했는지 구함 
round(months_between (sysdate,hiredate)) 근무달 from emp;
--add_months 몇 달 뒤
select ename,hiredate,add_months(hiredate,2) from emp;
--다음주 월요일 부터 출근
select ename,hiredate,next_day(hiredate,'월') from emp;


select ename,hiredate ,round((sysdate - hiredate)) "근무일 수" from emp where sal between 1000 and 3000;
select ename, hiredate, round(months_between(sysdate, hiredate)) 근무월 from emp where job in('MANAGER', 'SALESMAN');
select ename, hiredate, round(months_between(sysdate,hiredate)) 근무월 ,sal*round(months_between(sysdate,hiredate)) 총급여 from emp;
select ename, hiredate, add_months(hiredate,3), next_day(hiredate,'금') from emp;

--to_char 날자를 문자열로 변환, to_date 문자를 날자로 변환
select ename,hiredate,to_char(hiredate,'(DY)YYYY/mm/dd hh:mi:ss'),
to_char(hiredate,'(DAY)YYYY/mm/dd (am)hh:mi:ss') from emp;
select sysdate - to_date('1990/01/05','YYYY/mm/dd') from dual;
--rr 50미만 금세기 즉 20 붙이다, 50이상 전세기 즉 19
select sysdate - to_date('90/01/05','rr/mm/dd') from dual;

select ename, to_char(hiredate,'YYYY"년" mm"월" dd"일"') 입사일 from emp;
select ename,sal, to_char(sal,'999,999.9'), to_char(sal,'L9,999') from emp;
select to_number('77') +33 from dual;


select sysdate - to_date('2004/01/05','YYYY/mm//dd') from dual;
select ename, to_char(hiredate,'YYYY-mm-dd(DAY)') from emp where job in('ANALYST','MANAGER');
select ename, to_char(hiredate, '(DAY)YY/mm/dd (am)hh:mi:ss') 입사일, job from emp where sal between 1000 and 3000 and job in('CLERK','SALESMAN');
select ename, to_char(sal,'99,999.9'),deptno from emp where comm is not null order by deptno, sal desc;
select ename,sal,to_char(sal,'L99,999'),to_char((sal+nvl(comm,0))*12,'99,999') 연봉,deptno from emp where deptno in(101,30) order by sal desc;





