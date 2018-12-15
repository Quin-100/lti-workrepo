set serveroutput on
declare
v_deptid number:= &d_id;

cursor c1 is 
select * from employees 
where department_id=v_deptid;

clrec c1%rowtype;

begin
open c1;
loop
fetch c1 into clrec;
dbms_output.put_line(clrec.first_name);

dbms_output.put_line(clrec.salary);


dbms_output.put_line(c1%rowcount);

exit when c1%notfound;

end loop;
end;
/