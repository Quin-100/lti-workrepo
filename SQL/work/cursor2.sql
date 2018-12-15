set serveroutput on
declare

cursor c1 is 
select d.department_name,c.country_name from departments d 
inner join locations l on d.location_id = l.location_id
inner join countries c on l.country_id = c.country_id;

clrec c1%rowtype;

begin
open c1;
loop
fetch c1 into clrec;
dbms_output.put_line(clrec.department_name);

dbms_output.put_line(clrec.country_name);



exit when c1%notfound;

end loop;
dbms_output.put_line(c1%rowcount);

end;
/