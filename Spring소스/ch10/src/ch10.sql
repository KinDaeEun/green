drop table replyBoard; 
create table replyBoard (
rno number primary key,
bno number not null references board1(num),
replytext varchar2(500) not null,
replier varchar2(50) not null,
regdate date not null,
updatedate date not null,
del char(1) default 'n'
);


select * from board1 order by num desc;

insert into replyBoard values(1, 256,'가을','둘리',sysdate,sysdate,'n');
insert into replyBoard values(2, 231,'예비군','혁은',sysdate,sysdate,'n');
insert into replyBoard values(3, 267,'예비군','혁은',sysdate,sysdate,'n');

select * from replyBoard;