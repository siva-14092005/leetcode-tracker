select id,
case 
when mod(id,2)=0 then lag(student) over()
when mod(id,2)<>0 then ifnull(lead(student) over(),student)
end as student 
from Seat
