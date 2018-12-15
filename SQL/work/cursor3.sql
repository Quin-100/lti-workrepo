set serveroutput on
declare

cursor c1 is 
select distinct a.first_name 
from employees a,employees b where a.manager_id=b.employee_id order by first_name;

clrec c1%rowtype;

begin
open c1;
loop
fetch c1 into clrec;
exit when c1%notfound;
dbms_output.put_line(clrec.first_name);

end loop;
dbms_output.put_line(c1%rowcount);

end;
/