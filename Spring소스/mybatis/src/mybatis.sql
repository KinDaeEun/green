
create table member4 (
id varchar2(20) primary key,
email varchar2(30),
password varchar2(100),
name varchar2(30),
fileName varchar2(50),
del char(1) default 'n',
regdate date
);

create table memberphoto (
num number(10) primary key,
id varchar2(20) references member4(id),
fileName varchar2(50)
);
create sequence memberphoto_seq;

--시퀀스를 자동으로 1씩 증가시키는 함수
create FUNCTION get_seq
RETURN NUMBER 
IS
BEGIN
 RETURN memberphoto_seq.nextval;
END;
/
select * from memberphoto;
select * from dept;