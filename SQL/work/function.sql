set serveroutput on
set verify off

create or replace function mm(a  number,b  number)
return number
as

 
ma number;

begin
if a>b 
then 
	ma:=a;
else 
	ma:=b;

end if;

return ma;

end;
/

create or replace function p1(a  number)
return number
as

x number; 
begin
x:= a*a;
return x;
end;
/