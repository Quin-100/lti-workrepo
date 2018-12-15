set serveroutput on
set verify off

create or replace procedure disp_records(did number)
as

emprec employees%rowtype;

dname number;
begin

--select department_name into dname 
--from departments where department_id = 80;

select * into emprec
from employees where department_id = did;


exception
when no_data_found then dbms_output.put_line('No data found');

when value_error then dbms_output.put_line('dname not a no.');

when too_many_rows then dbms_output.put_line('not possible w/o cursor');
end;
/