create or replace 
procedure addrec(dno number,dname varchar2)
is


begin 

insert into departments values(dno,dname,null,null);

dbms_output.put_line('record added to dept');

end;
/