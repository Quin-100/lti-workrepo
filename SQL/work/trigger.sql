create or replace trigger trig_insert_product 
before insert or update or delete 
on product
begin
if inserting then 
dbms_output.put_line('product added');
else if updating then
dbms_output.put_line('product updated');
else
dbms_output.put_line('product deleted');
end if;
end if;
end;
/