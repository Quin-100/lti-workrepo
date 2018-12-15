set serveroutput on
set verify off

create or replace procedure stud_remarks(stud_marks number)
as

exp1 exception;
pragma exception_init(exp1,-20003);

begin
 if (stud_marks < 65) then 
	raise exp1;
 else        
	dbms_output.put_line('Student Passed. ');
  	
 end if;
exception
when exp1 then 
raise_application_error('-20003','Student Failed');
end;
/