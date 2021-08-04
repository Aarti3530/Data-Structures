SELECT IFNULL((SELECT DISTINCT Salary from Employee
ORDER BY Salary desc limit 1,1),NULL) as SecondHighestSalary;
