CREATE DATABASE AdvancedDB
 
USE AdvancedDB
Go

CREATE TABLE Student(	StudentID	    Int PRIMARY KEY NOT NULL,	StudentLastName   VARCHAR(25) NOT NULL,	StudentFirstName      VARCHAR(20) NOT NULL,	StudentAddress	 VARCHAR(30),	StudentCity VARCHAR(15),	StudentState CHAR(2),	StudentZip VARCHAR(9),	StudentPhone VARCHAR(12),	StudentDOB DATE NOT NULL,	);CREATE TABLE Department(	DepartmentID INT PRIMARY KEY NOT NULL,	DepartmentName VARCHAR(30) NOT NULL,	);	CREATE TABLE Instructor(	InstructorID INT PRIMARY KEY NOT NULL,	InstructorLastName VARCHAR(40) NOT NULL,	InstructorFirstName VARCHAR(20) NOT NULL,	InstructorPhone VARCHAR(12),	InstructorDepartmentID int NOT NULL FOREIGN KEY REFERENCES Department(DepartmentID),	);INSERT DepartmentVALUES(1, 'BUSINESS INFORMATION TECH'),(2, 'MARKETING'),(3, 'ACCOUNTING'),(4, 'ELECTRONICS'),(5, 'INDUSTRIAL')INSERT InstructorVALUES(432, 'SMITH', 'BOB', '262-692-8999', 1),(433, 'JONES', 'BETTY', '262-692-8799', 1),(434, 'FAVRE', 'JANE', '262-692-7999', 2),(442, 'GREEN', 'TOM', '262-692-8889', 2),(532, 'EDWARDS', 'TONY', '262-692-4499', 3),(742, 'BROWN', 'BUTCH', '262-692-5499', 4),(772, 'CRASH', 'KATHY', '262-692-4479', 5),(3432, 'WILLIAMS', 'SUE', '262-692-8759', 4)INSERT StudentVALUES(123, 'JONES', 'TOM', '1400 SOUTH 27TH ST', 'MILWAUKEE', 'WI', 53227, '414-645-8244', '1977-04-24'),(124, 'MARSHALL', 'CHRIS', '9400 SOUTH 87 ST', 'MILWAUKEE', 'WI', 53229, '414-647-8544', '1981-01-24'),(135, 'ADAMS', 'GEORGE', '3400 SOUTH 5 ST', 'MILWAUKEE', 'WI', 53227, '414-282-8644', '1965-11-20'),(143, 'FLINSTONE', 'ALICE', '1840 SOUTH 57 ST', 'MILWAUKEE', 'WI', 53237, '414-645-8365', '1975-09-07'),(153, 'BIDDELL', 'SAM', '2340 SOUTH 67 ST', 'MILWAUKEE', 'WI', 53227, '414-645-8244', '1979-12-14')Select StudentID, StudentLastName, StudentFirstName
From STUDENT
ORDER BY StudentLastName

Select instructorID, InstructorLastName, InstructorFirstName, InstructorDepartmentID
From Instructor
ORDER BY InstructorDepartmentID

Select DepartmentID, DepartmentName
From Department
ORDER BY DepartmentName

UPDATE StudentSET StudentPhone = '414-888-1234'WHERE StudentID = 123SELECT *FROM StudentWHERE StudentID = 123UPDATE StudentSET StudentCity = 'Cudahy'WHERE StudentZip = 53227SELECT *FROM StudentWHERE StudentCity = 'Cudahy'UPDATE InstructorSET InstructorDepartmentID = 2WHERE InstructorID = 742SELECT *FROM InstructorWHERE InstructorID = 742SELECT *FROM InstructorWHERE InstructorDepartmentID = 1 OR InstructorDepartmentID = 3 OR InstructorDepartmentID = 5SELECT * From StudentDELETE FROM StudentWhere StudentID = 135SELECT * From StudentWhere StudentID = 135Select * from departmentDELETE DepartmentWhere DepartmentID = 4DELETE InstructorWHERE InstructorID = 3432