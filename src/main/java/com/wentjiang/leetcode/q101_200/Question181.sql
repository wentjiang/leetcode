# method 1 use join
select a.Name as 'Employee' from
    Employee a join Employee b on a.ManagerId = b.Id
where a.Salary > b.Salary

# method 2
select a.Name as 'Employee' from
    Employee as a, Employee as b
where a.ManagerId = b.Id and a.Salary > b.Salary