set serveroutput on
set verify off

begin 
select first_name,salary 
into :name,:v_sal
from employees
where employee_id=:id;
dbms_output.put_line(:name);
dbms_output.put_line(:v_sal);
:name := 'Amit';
dbms_output.put_line('Next Name '||:name);
end;
/ 