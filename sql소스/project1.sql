select * from product where pno in( select pno from
		review group by pno having avg(star)>3 and pno in (select pno from
		product where p_del='n') );
        
        
        select nvl(avg(star),0) from review where r_del='n' group by pno having avg(star)>3
		and pno in(select pno from product where p_del='n');
        
        
        
        select pno,avg(star) from review where r_del='n' group by pno order by pno;
        select * from review order by pno;
        insert into review values(review_seq.nextval,'존나 맛있다',sysdate,'n','24301',2,'최고',1);
        update review set r_del='n' where rno = 81;
        delete from eventlist where pno=1 and eno = 1;
        commit;
        select * from product where pno in(select pno from eventlist where eno=1);
        select nvl(avg(star),0) from review where r_del='n' group by pno having avg(star)>3
		and pno in(select pno from product where p_del='n');
        
        select * from product where pno in( select pno from
		review group by pno having avg(star)>3 and pno in (select pno from
		product where p_del='n'));
        
        
       select p.*, bl.b_count buy_count from product p, buylist bl, buy b
		where p.pno = bl.pno and bl.bno = b.bno and b.id = '1';
        
        
         select b.*, p.*, bl.b_count buy_count from product p, buylist bl, buy b
		where p.pno = bl.pno and bl.bno = b.bno and b.id = '1';
        
        
    