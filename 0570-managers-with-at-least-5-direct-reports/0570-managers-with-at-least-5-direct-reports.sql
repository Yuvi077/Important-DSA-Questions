# Write your MySQL query statement below
select e.name
From Employee e 
join Employee f
on e.id=f.managerId
Group BY e.id,e.name
Having count(f.id)>=5


