set serveroutput on;
set verify off;
declare 

v_firstname varchar2(30);
v_salary number(10,2);
v_empid number(4) := &eid;
BEGIN 
select first_name,salary
into v_firstname,v_salary
from employees
where employee_id=v_empid;

dbms_output.put_line('Name '||v_firstname);
dbms_output.put_line('Salary '||v_salary);
dbms_output.put_line('Name Host '||:name);
EXCEPTION

when no_data_found then 
dbms_output.put_line('no data found');


when others then 
dbms_output.put_line('some exception');
END;

/