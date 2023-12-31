drop table board1;
create table board1 ( 
 num number primary key, -- key 
 writer varchar2(20) not null, -- 작성자 
 subject varchar2(50) not null, -- 제목 
 content varchar2(500) not null, -- 본문 
 readcount number default 0, -- 읽은 횟수 
 password varchar2(12) not null, -- 암호 
 ref number not null, -- 답변글끼리 그룹 
 re_step number not null, -- ref내의 순서 
 re_level number not null, -- 들여쓰기 
 reg_date date not null, -- 작성일 
 del char(1) default 'n'
);
select * from board1;
update board1 set ref = num;
update board1 set readcount = 100 where num = 1;
select nvl(max(num),0) +1 from board1;
delete from board1 where num = 10;
select * from (select rowNum rn,a.* from 
(select* from board1 order by ref desc, re_step)a) where rn between 11 and 20;

delete from board1;

select * from board1;