select empno, ename, hiredate, job, sal from emp where hiredate like ('81%');
select empno, ename, hiredate, job, sal from emp where hiredate like('81%') and job !='MANAGER';
select empno, ename, hiredate, job, sal from emp order by sal desc, hiredate;
select empno, ename from emp where ename like('__N%');
select empno, ename, sal*12 ���� from emp where sal*12 >35000;

select ename,initcap(ename), upper(ename), lower(ename) from emp;
select * from emp where lower(job) = 'salesman';
--oracle concat �ΰ��� �����ؼ� �ַ� ||�� ���
select concat(ename,sal)from emp;
--ename���� 2��° ���� 3����
select ename, substr(ename,2,3),substr(ename,-4,3) from emp;
select ename, length(ename) from emp;
--������ from table�� ����
--dual�� dummy�� ��Ī�ϴ� �ǹ� ���� �Ѱ� �����͸� ������
select length('oracle'), length('����Ŭ') from dual;
--lengthb �����ϴ� ����Ʈ
select lengthb('oracle'), lengthb('����Ŭ') from dual;
select substr('oracle',2,3), substr('����Ŭ',2,3) from dual;
--substrb ����Ʈ ����
select substrb('oracle',1,3), substrb('����Ŭ',1,3) from dual;

--2���� �Ի��� ���
select ename, hiredate from emp where hiredate like '%02%'; -- 02�Ͽ� �Ի��� ����� ���Եɼ� ����
select ename, hiredate from emp where substr(hiredate, 4,2) = 02;


select * from emp where substr(hiredate, 1,2) = 83;
select * from emp where substr(ename, -1,1) = 'E';
--            L�ڰ� �ִ� ��ġ            ó������ ã�Ƽ� ù��° L ��ġ     ó������ ã�Ƽ� �ι�° L ��ġ 
select ename, instr(ename,'L') e_null, instr(ename,'L',1,1) e_ll, instr(ename,'L',1,2) e_l2,
--4��°���� ã�Ƽ� ù��° L ��ġ   4��°���� ã�Ƽ� �ι�° L ��ġ 
instr(ename,'L',4,1) e_4l, instr(ename,'L',4,2) e_42 from emp;

--           8�ڸ� Ȯ�� ��ĭ *�� ü��  (lpad ����, rpad ������)
select ename, lpad(ename, 8,'*'), lpad(ename, 8,'@') from emp;
select ename, rpad(ename, 8,'*'),rpad(ename, 8,'@') from emp;

--                 ������ M����       �������� N����
select ename, job, ltrim(job,'M'), rtrim(job,'N') from emp;
--���� S����
select ename, trim('S' from ename) from emp;
--                              �ι�°ĭ�� ������ 3��° ĭ���� ��ȯ
select ename,sal,translate(sal,'012345','�����̻���') from emp;
--                              �ι���ĭ�� �ܾ 3��° ���� �ܾ�� ��ȯ
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
--      ���� �ڸ�        ���� �ڸ�
round(sal/3,-1),round(sal/3,-2) from emp;
--����,����
select ename, sal/3,trunc(sal/3),trunc(sal/3,1),trunc(sal/3,2),trunc(sal/3,-1),trunc(sal/3,-2) from emp;
--��������� trunc�� floor�� ����� ����
select ename, sal/-3,round(sal/3), trunc(sal/3),ceil(sal/3),floor(sal/3) from emp;
select ename, sal/3,round(-sal/3), trunc(-sal/3),ceil(-sal/3),floor(-sal/3) from emp;

--mod ������
select mod(10,3), mod(7,3) from dual;
--power �ŵ�����
select power(2,3), power(3,4) from dual;
--sqal ������
select sqrt(2) from dual;
select chr(65) from dual;


select ename,sal/7,round(sal/7),round(sal/7,1), round(sal/7,-2) from emp;
select ename,-sal/7, trunc(-sal/7),trunc(-sal/7,2), trunc(-sal/7,-1) from emp;
select ename,sal/7,round(sal/7),trunc(sal/7),ceil(sal/7),floor(sal/7) from emp where job in('MANAGER','CLERK');
select ename,-sal/7,round(-sal/7),trunc(-sal/7), ceil(-sal/7),floor(-sal/7) from emp where deptno = 20 order by ename desc;


select sysdate from dual;
select sysdate, sysdate - 1 ����, sysdate+1 ���� from dual;

select ename, hiredate, round(sysdate-hiredate) �ٹ���,round((sysdate-hiredate)/7) �ٹ��� ,
--        �ٹ��� �� ���� �ߴ��� ���� 
round(months_between (sysdate,hiredate)) �ٹ��� from emp;
--add_months �� �� ��
select ename,hiredate,add_months(hiredate,2) from emp;
--������ ������ ���� ���
select ename,hiredate,next_day(hiredate,'��') from emp;


select ename,hiredate ,round((sysdate - hiredate)) "�ٹ��� ��" from emp where sal between 1000 and 3000;
select ename, hiredate, round(months_between(sysdate, hiredate)) �ٹ��� from emp where job in('MANAGER', 'SALESMAN');
select ename, hiredate, round(months_between(sysdate,hiredate)) �ٹ��� ,sal*round(months_between(sysdate,hiredate)) �ѱ޿� from emp;
select ename, hiredate, add_months(hiredate,3), next_day(hiredate,'��') from emp;

--to_char ���ڸ� ���ڿ��� ��ȯ, to_date ���ڸ� ���ڷ� ��ȯ
select ename,hiredate,to_char(hiredate,'(DY)YYYY/mm/dd hh:mi:ss'),
to_char(hiredate,'(DAY)YYYY/mm/dd (am)hh:mi:ss') from emp;
select sysdate - to_date('1990/01/05','YYYY/mm/dd') from dual;
--rr 50�̸� �ݼ��� �� 20 ���̴�, 50�̻� ������ �� 19
select sysdate - to_date('90/01/05','rr/mm/dd') from dual;

select ename, to_char(hiredate,'YYYY"��" mm"��" dd"��"') �Ի��� from emp;
select ename,sal, to_char(sal,'999,999.9'), to_char(sal,'L9,999') from emp;
select to_number('77') +33 from dual;


select sysdate - to_date('2004/01/05','YYYY/mm//dd') from dual;
select ename, to_char(hiredate,'YYYY-mm-dd(DAY)') from emp where job in('ANALYST','MANAGER');
select ename, to_char(hiredate, '(DAY)YY/mm/dd (am)hh:mi:ss') �Ի���, job from emp where sal between 1000 and 3000 and job in('CLERK','SALESMAN');
select ename, to_char(sal,'99,999.9'),deptno from emp where comm is not null order by deptno, sal desc;
select ename,sal,to_char(sal,'L99,999'),to_char((sal+nvl(comm,0))*12,'99,999') ����,deptno from emp where deptno in(101,30) order by sal desc;





