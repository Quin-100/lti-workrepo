CREATE OR REPLACE 
Procedure empInfo (eid number, first_name out varchar2, salary out number)
IS
BEGIN
   	SELECT first_name,salary into first_name ,salary  from employees where employee_id = eid ;	
END ;
/

