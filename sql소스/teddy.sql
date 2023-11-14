create FUNCTION get_seq
RETURN NUMBER 
IS
BEGIN
 RETURN design_img_seq.nextval;
END;

commit;
drop function get_seq;
select * from car;