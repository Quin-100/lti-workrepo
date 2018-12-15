create or replace trigger protrigger
before delete or update 
on product
for each row
begin
insert into product_tracker
values
(
:old.pid,
:old.p_rate,
:new.p_rate,
sysdate,
'friday_bazar'
);
end;
/

create or replace trigger protrigger1
after delete or update 
on product
for each row
begin
dbms_output.put_line('product...deleted');
end;
/
