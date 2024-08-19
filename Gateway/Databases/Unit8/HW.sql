CREATE VIEW vw_StudentGrade
	AS SELECT s.StudentID, StudentLastName, StudentFirstName, CourseID, Grade
	FROM Student s, Roster r
	
SELECT * FROM vw_StudentGrade

ALTER VIEW vw_StudentGrade
	AS SELECT s.StudentID, StudentLastName, StudentFirstName, r.CourseID, Grade, CourseName
	FROM Student s, Roster r, Course c

	SELECT * FROM vw_StudentGrade

CREATE VIEW vw_InstructorDepartment
WITH SCHEMABINDING
	AS SELECT i.InstructorID, i.InstructorLastName, i.InstructorFirstName, d.DepartmentName
	FROM dbo.Instructor i, dbo.Department d

select * from vw_InstructorDepartment

CREATE UNIQUE CLUSTERED INDEX IX_DepartmentInstructor
ON vw_InstructorDepartment(DepartmentName, InstructorID)

CREATE VIEW vw_CourseLookup
	AS SELECT CourseID, CourseName, CourseCredit, DepartmentName
	FROM Department d, Course c
	WHERE CourseID LIKE '107%'

UPDATE vw_CourseLookup
SET CourseCredit = 1
WHERE CourseID = 107185

select * from vw_CourseLookup

CREATE VIEW vw_InstructorClass WITH ENCRYPTION
AS SELECT i.InstructorLastName, i.InstructorFirstName, c.BeginDate, c.EndDate, c.Location
FROM Instructor i, Class c
WHERE c.EndDate >= '2011' AND c.EndDate < '2012'

select * from vw_InstructorClass

use AdventureWorks2017
Go
CREATE VIEW vw_Sales_PersonSales
AS SELECT pp.FirstName, 
	pp.LastName, 
	sc.CustomerID,
	SUM(ss.SalesYTD) TotalSales 
FROM Sales.SalesPerson ss 
JOIN Sales.Customer As sc 
ON ss.TerritoryID = sc.TerritoryID 
JOIN Person.Person As pp 
ON ss.BusinessEntityID = pp.BusinessEntityID 
GROUP BY pp.FirstName, pp.LastName, sc.CustomerID; 
GO
select * from vw_Sales_PersonSales

ALTER VIEW vw_Sales_PersonSales
WITH ENCRYPTION, SCHEMABINDING
AS SELECT pp.FirstName, 
	pp.LastName, 
	sc.CustomerID,
	SUM(ss.SalesYTD) TotalSales 
FROM Sales.SalesPerson ss 
JOIN Sales.Customer As sc 
ON ss.TerritoryID = sc.TerritoryID 
JOIN Person.Person As pp 
ON ss.BusinessEntityID = pp.BusinessEntityID 
GROUP BY pp.FirstName, pp.LastName, sc.CustomerID; 

DROP VIEW vw_Sales_PersonSales