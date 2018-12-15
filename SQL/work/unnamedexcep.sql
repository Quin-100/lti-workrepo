set serveroutput on
set verify off

create or replace procedure disp_records
as

exp1 exception;
pragma exception_init(exp1,-2292);

begin
 delete departments where department_id = 80;

exception
when exp1 then 
dbms_output.put_line('exp1 is handled');


end;
/