set serveroutput on
set verify off

declare 
v_eid number(5) := 100;
v_category varchar2(30) default 'international';
v_validity number(4) default 45;
v_commission constant number(5,2) := .14;
v_name varchar2(20) not null :='oracle';
v_date employees.hire_date%type;


begin
dbms_output.put_line(v_eid||v_category||v_validity ||v_commission||v_name);

end;