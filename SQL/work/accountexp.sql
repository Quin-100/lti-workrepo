set serveroutput on
set verify off

create or replace procedure account(acc_id number,balance in out number,amount number)
as

exp1 exception;
pragma exception_init(exp1,-20003);

begin
 if (balance < amount) then 
	raise exp1;
 else
	balance:=balance-amount;
        dbms_output.put_line(balance);
	dbms_output.put_line('Transaction Success. ');
  	
 end if;
exception
when exp1 then 
raise_application_error('-20003','balance below limit');
--dbms_output.put_line('no is negative');
end;
/