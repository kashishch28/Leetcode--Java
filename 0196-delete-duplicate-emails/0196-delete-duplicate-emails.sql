# Write your MySQL query statement below
# delete the email with larger id number by self join 

delete p1 from Person p1
join Person p2 on 
p1.email = p2.email and p1.id>p2.id;