# Write your MySQL query statement below
select visited_on, amount, average_amount 
from (select distinct visited_on, SUM(amount) over
 (order by visited_on range between INTERVAL 6 DAY preceding and current row) as amount,
  round(sum(amount) over (order by visited_on range between interval 6 day  preceding and current row)/7,2)
as average_amount
from Customer) as whole_totals
where datediff(visited_on, (select min(visited_on) from Customer)) >= 6;