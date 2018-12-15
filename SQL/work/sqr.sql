set serveroutput on
set verify off

create or replace function sqr(a in out number)
return number
as


begin

a := a * a;

return a;

end;
/