set serveroutput on
set verify off
declare
    y number := &no1;
    k number := &no2;
    z number;
begin
    --z := p1(y);
    z:=mm(y,k);
    dbms_output.put_line('Max : '||z);
end;
/