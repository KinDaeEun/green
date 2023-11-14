select * from board1 order by num desc;
update board1 set readcount = 100 where num = 240;
alter table board1 modify(password varchar2(100));

select * from board1 where writer like '%'||'보검'||'%';