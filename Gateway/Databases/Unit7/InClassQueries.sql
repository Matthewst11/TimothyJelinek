CREATE DATABASE UNIT7Use [UNIT7]GoCREATE TABLE PayType(	PayID	INT PRIMARY KEY IDENTITY(1,1),	Code	CHAR(2));CREATE TABLE Department(	DeptID	INT PRIMARY KEY IDENTITY(1,1),	Name	VARCHAR(50));CREATE TABLE Position(	PosID	INT PRIMARY KEY IDENTITY(1,1),	Name	VARCHAR(50));CREATE TABLE Employees(	EmployeeID	INT PRIMARY KEY,	FirstName	VARCHAR(25) NOT NULL,	LastName	VARCHAR(25) NOT NULL,	Age			INT	NOT NULL,	DeptID		INT,	PosID		INT,	PayID		INT);

INSERT EmployeesVALUES(12345,'Jane','Doe',32,1,6,1),	(12121,'John','Smith',25,2,2,1),	(11221,'Peter','Pan',18,3,1,2),	(33322,'Al','Bundy',55,7,6,1),	(44556,'Clark','Kent',35,3,3,1),	(78543,'Bob','Barker',69,4,4,1),	(87658,'Lois','Lane',30,5,8,1),	(33345,'Peter','Parker',19,5,7,2),	(99899,'Bruce','Wayne',40,4,5,1),	(99009,'Forrest','Gump',45,6,6,1);

	Select * 
	From Employees

INSERT INTO DepartmentVALUES('HR'),('Facility'),('IT'),('Administration'),('News'),('Marketing'),('Customer Service');INSERT INTO PositionVALUES('Associate'),('Electrician'),('Director'),('CEO'),('VP'),('Manager'),('Photographer'),('Reporter');

Select * 
	From Department

Select * 
	From Position

UPDATE EmployeesSET Age=69,DeptID = 3OUTPUT deleted.Age, deleted.DeptID			--to see what was replacedWHERE EmployeeID=78543

Select *
From Employees
Where EmployeeID = 78543

SELECT * FROM EmployeesJOIN PayTypeON Employees.PayID=PayType.PayID

DELETE FROM Employees
WHERE EmployeeID = 33345

