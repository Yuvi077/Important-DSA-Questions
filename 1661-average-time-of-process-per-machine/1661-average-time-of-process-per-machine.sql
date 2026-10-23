# Write your MySQL query statement below
Select a1.machine_id,
Round (AVG(a2.timestamp - a1.timestamp),3) as processing_time
From Activity a1
join Activity a2
on a1.machine_id=a2.machine_id
And a1.process_id = a2.process_id
Where 
a1.Activity_type = 'start' and a2.Activity_type = 'end'
group by
a1.machine_id;

