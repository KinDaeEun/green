create user project identified by k1234;
grant dba to project;

p_price- discount/100* p_price

select * from product order by (p_price - (discount/100 * p_price));
drop table buylist;
drop table cart;
drop table buy;
drop table review;
drop table love;
drop table account;
drop table member;
drop table product;

create user teddy identified by 1234;
grant dba to project;
 
--ȸ��
create table member (
mno number(20) primary key,
id varchar2(20),
password varchar2(20),
name varchar2(20),
tel varchar2(20),
gender varchar2(10),
addr varchar2(20),
addr_detail varchar2(50),
reg_date date,
profile varchar2(30),
m_del char(1) default 'n');
--member�� ������
create sequence member_seq start with 1 increment by 1 maxvalue 999999; 

--��ǰ
create table product (
pno number(20) primary key,
pname varchar2(20),
p_price number(10),
p_country varchar2(20),
p_tel varchar2(20),
p_detail_img varchar2(30),
p_detail_content varchar2(1000),
discount number(2),
p_kind varchar2(20),
p_del char(1) default 'n');
--product�� ������
create sequence product_seq start with 1 increment by 1 maxvalue 999999; 

--���ǰ
create table love (
pno number(20),
mno number(20),
l_del char(1) default 'n',
primary key (pno,mno),
foreign key(mno) references member(mno),
foreign key(pno) references product(pno));

--��ٱ���
create table cart (
pno number(20),
mno number(20),
c_count number(20), 
c_del char(1) default 'n',
primary key (pno,mno),
foreign key(mno) references member(mno),
foreign key(pno) references product(pno));


--����
create table review(
rno number(20) primary key,
star_rate number(1),
r_content varchar2(50),
r_date date,
r_del char(1) default 'n',
mno number(20),
pno number(20),
foreign key(mno) references member(mno),
foreign key(pno) references product(pno));
--review�� ������ 
create sequence review_seq start with 1 increment by 1 maxvalue 999999; 


--������
create table account (
ano number(20) primary key,
a_content varchar2(4000),
a_title varchar2(20),
a_date date,
a_del char(1) default 'n',
mno number(20),
foreign key(mno) references member(mno));
--account�� ������
create sequence account_seq start with 1 increment by 1 maxvalue 999999; 


--����
create table buy(
bno number(20) primary key,
b_date date,
b_addr varchar2(20),
b_tel varchar2(20),
b_reveiver varchar2(20),
mno number(20),
foreign key(mno) references member(mno));
--buy�� ������
create sequence buy_seq start with 1 increment by 1 maxvalue 999999; 


--���ų���
create table buylist (
pno number(20),
bno number(20),
b_count number(20),
primary key (pno,bno),
foreign key(pno) references product(pno),
foreign key(bno) references buy(bno));











































