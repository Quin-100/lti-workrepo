declare
amount number:=&amount;
acc_id number:=101;
bala number:=&balance;

begin
account(acc_id,bala,amount);

dbms_output.put_line('Current balance is : '||bala);

end;
/