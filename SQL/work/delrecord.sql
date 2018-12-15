create or replace procedure delrecord (dno number)
is

begin
delete temp1 where department_id=dno;
dbms_output.put_line('record successfully deleted');
commit;
end;
/
create or replace procedure updaterecord (did number,sal number)
is

begin
update employees set salary=sal where department_id=did;
dbms_output.put_line('record successfully updated');
commit;
end;
/