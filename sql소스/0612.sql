create table a(val char(1) primary key);
insert into a values('A');
insert into a values('B');
insert into a values('C');
insert into a values('D');
insert into a values('E');
select * from a;

create table b(num number(1) primary key, val char(1));
insert into b values(1,'C');
insert into b values(2,'D');
insert into b values(3,'E');
insert into b values(4,'F');
insert into b values(5,'G');
select * from b;

--union 합집합, 중복된 데이터는 1회만, 자동 정열
select val from a union select val from b;
--중복된 것도 포함, 정열을 하지 않음
select val from a union all select val from b;

--교집합, 공통집합 중복된 값만 추출
select val from a intersect select val from b;

-- 차집합, 한쪽에만 있는 데이터
select val from a minus select val from b;
select val from b minus select val from a;

--집합은 두개 테이블의 출력된 데이터 갯수와 데이터형이 같아야 함
select val from a union select num,val from b;
select 0,val from a union select num,val from b;
select null,val from a union select num,val from b;

--oracle에서는 null을 큰값으로 인식
select ename, comm from emp order by comm desc;

select ename,d.deptno,dname from emp e, dept d where e.deptno = d.deptno;
select ename, job,sal,dname from emp e,dept d where e.deptno = d.deptno and loc = 'NEW YORK';
select ename,dname,loc from emp e ,dept d where e.deptno = d.deptno and comm is not null;
select ename,job,dname,loc from emp e, dept d where e.deptno = d.deptno and ename like '%L%';
select empno,ename,d.deptno,dname from emp e, dept d where e.deptno = d.deptno order by ename;
select empno,ename,sal,dname from emp e, dept d where e.deptno = d.deptno and sal>=2000 order by sal desc;
select empno,ename,job,sal,dname from emp e,dept d where e.deptno = d.deptno and job = 'MANAGER' and sal>2500 order by empno;
select empno,ename,job,sal,grade from emp e,dept d ,salgrade where e.deptno = d.deptno and sal between losal and hisal 
order by sal desc;
select w.ename,m.ename from emp w,emp m where w.mgr = m.empno;
select w.ename,m.ename,k.ename from emp w, emp m, emp k where w.mgr = m.empno and m.mgr = k.empno;
select w.ename,m.ename,k.ename from emp w, emp m, emp k where w.mgr = m.empno(+) and m.mgr = k.empno(+);

select sum(sal), max(sal),min(sal),count(*),round(avg(sal)) from emp;
select sum(sal) from emp where deptno = 10;
--group함수와 같이 사용하는 컬럼은 반드시 group by해야 한다
select deptno,sum(sal) from emp group by deptno ;
select sum(sal),avg(sal),sum(sal)/count(*) from emp;
select sum(comm),avg(comm),sum(comm)/count(comm) from emp;

select sum(sal),round(avg(sal)),count(*),max(sal), min(sal) from emp;
select deptno,sum(sal) 급여합계,count(*) from emp group by deptno order by 급여합계 desc;
select dname,sum(sal),max(sal) from emp,dept where emp.deptno = dept.deptno group by dname;
select dname,loc,sum(sal),max(sal) from emp e, dept d where e.deptno = d.deptno group by dname,loc order by dname;
select dname,sum(sal),min(sal),round(avg(sal)) from emp,dept where emp.deptno = dept.deptno and substr(hiredate,1,2) = '81'
group by dname;
select job ,max(sal),sum(sal) from emp group by job order by job;
select deptno,job,sum(sal),max(sal),count(*) from emp group by deptno,job;
select dname,job,sum(sal) ,count(*) from emp e,dept d where e.deptno = d.deptno group by dname,job order by job;


select deptno,max(sal) from emp where max(sal)>=3000 group by deptno;
select deptno,max(sal) from emp group by deptno having max(sal)>=3000;

select dname,count(*) from emp e,dept d where e.deptno = d.deptno group by dname having count(*)>=5;
select deptno,round(avg(sal)),max(sal) from emp group by deptno having max(sal)>=2900;
select job,round(avg(sal)),sum(sal) from emp group by job having round(avg(sal))>=3000;
select job,sum(sal) from emp where job !='SALESMAN' group by job having sum(sal)>=5000 order by sum(sal) desc;

select count(*),max(sal),min(sal),sum(sal) from emp;
select job ,max(sal),min(sal),sum(sal) from emp group by job;
select job,count(*) from emp group by job;
select max(sal)- min(sal) from emp; 
select to_char(hiredate,'YY') H_YEAR,count(*), min(sal),max(sal),avg(sal),sum(sal) from emp group by to_char(hiredate,'YY')
order by H_YEAR;

select deptno,
sum (decode(job,'CLERK',sal)) CLERK,
sum (decode(job,'MANAGER',sal)) MANAGER,
sum (decode(job,'PRESIDENT',sal)) PRESIDENT,
sum (decode(job,'ANALYST',sal)) ANALYST,
sum (decode(job,'SALESMAN',sal)) SALESMAN,sum(sal) 합계
from emp group by deptno order by deptno;

select sum(count(*)) Total,
sum(decode(to_char(hiredate,'YY'),80,count(*))) "1980",
sum(decode(to_char(hiredate,'YY'),81,count(*))) "1981",
sum(decode(to_char(hiredate,'YY'),82,count(*))) "1982",
sum(decode(to_char(hiredate,'YY'),83,count(*))) "1983"
from emp group by to_char(hiredate,'YY');


select distinct job, 
sum (decode(deptno,10,sal)) "Deptno 10",
sum (decode(deptno,20,sal)) "Deptno 20",
sum (decode(deptno,30,sal)) "Deptno 30",
sum(sal) Total
from emp group by job order by job; 





