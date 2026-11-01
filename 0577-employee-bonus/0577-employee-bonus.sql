# Write your MySQL query statement below
Select emp.name,b.bonus
From Employee as emp
Left Join Bonus as b
on emp.empID = b.empId
Where b.bonus<1000 or b.bonus IS NULL

