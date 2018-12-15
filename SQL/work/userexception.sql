set serveroutput on
set verify off

create or replace procedure disp_records(a number)
as

exp1 exception;

begin
 if (a < 1) then 
	raise exp1;	
 end if;
exception
when exp1 then 
--raise_application_error('-20001','no is negative');
dbms_output.put_line('no is negative');


end;
/