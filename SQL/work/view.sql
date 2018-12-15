create view abc as 
select first_name,salary 
from employees
where department_id in(select department_id from departments where department_name='IT');
/

