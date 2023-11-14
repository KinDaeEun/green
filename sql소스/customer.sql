create table customer(
id varchar2(20) primary key,
pass varchar2(20),
name varchar2(20),
email varchar2(20),
reg_date date
);
select* from customer;  

drop table customer;