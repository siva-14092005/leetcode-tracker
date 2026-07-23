# Write your MySQL query statement below
select m.unique_id , e.name from employees e
left join employeeuni m 
on  m.id = e.id