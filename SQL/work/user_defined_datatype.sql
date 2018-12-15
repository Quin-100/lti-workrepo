set serveroutput on
set verify off

declare 
emprec employees%rowtype;
deptrec departments%rowtype;
type booktype
is record
(
  bookid number(5),
  bookname varchar2(20),
  bookprice number(5,2),
  dol Date
);
bookrec booktype;
type empname is varray(5) of varchar2(30);
type empname1 is varray(5) of varchar2(30);
empnamee empname := empname('a','b','c','d','f');
empnamee1 empname1 := empname1();

begin 
select*into emprec 
from employees
where employee_id=100;


select * into deptrec
from departments
where department_id=(select department_id 
from employees where employee_id=100);

bookrec.bookid := 1000;
bookrec.bookname := 'The Inception';
bookrec.dol := '06-Dec-2018';
bookrec.bookprice := 20.06;

for i in 1..5
loop
empnamee1.extend();
empnamee1 := &name;
end loop;


dbms_output.put_line('Name :'||''||emprec.first_name||''||emprec.last_name) ;

dbms_output.put_line('Department Name :'||''||deptrec.department_name);

dbms_output.put_line('Book Id :'||''||bookrec.bookid);
dbms_output.put_line('Book Name :'||''||bookrec.bookname);
dbms_output.put_line('Book Dol :'||''||bookrec.dol);
dbms_output.put_line('Book Price :'||''||bookrec.bookprice);


for j in reverse 1..empnamee1.count
loop
dbms_output.put_line(empnamee1(j));
end loop;

end;


/