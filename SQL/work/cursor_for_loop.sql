set serveroutput on
set verify off

declare

cursor c1 is
select salary from employees
where department_id = 80 order by salary desc;

type sal_arr is varray(100) of number;
sal_list sal_arr := sal_arr();

counter number;
ctr number := 0;

begin
--open c1;

--if (c1%found)
--then
--counter := c1%rowcount;

for i in c1
loop
ctr := ctr + 1;
sal_list.extend();
--fetch c1 into sal_list(i);
sal_list(ctr) := i.salary;
end loop;

for j in 1..sal_list.count
loop
dbms_output.put_line(sal_list(j));
end loop;
/*else
dbms_output.put_line('Cursor does not have any data');
end if;*/

--dbms_output.put_line(counter);
dbms_output.put_line(sal_list.count);
end; 
/