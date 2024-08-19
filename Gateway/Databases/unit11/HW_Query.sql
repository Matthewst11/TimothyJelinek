CREATE DATABASE IndexDB

Use IndexDB
Go
CREATE TABLE Employees
(
	EmployeeNumber INT NOT NULL,
	LastName NVARCHAR(20) NOT NULL,
	FirstName NVARCHAR(20) NOT NULL,
	Username NCHAR(8),
	DateHired DATE,
	HourlySalary MONEY,
	);

Use IndexDB
GO
CREATE TABLE Rooms
(
	RoomID INT NOT NULL,
	RoomNumber NVARCHAR(10),
	LocationCode NVARCHAR(50) DEFAULT N'Siler Sprng',
	RoomType NVARCHAR(20) DEFAULT N'Bedroom',
	BedType NVARCHAR(20) DEFAULT N'Queen',
	Rate MONEY DEFAULT 75.85,
	Available BIT DEFAULT 0,
	);

Use IndexDB
Go
INSERT INTO Employees
VALUES (62480, 'Bond', 'James', 'jbond', '2022-04-04', 28.02)


Use IndexDB
Go
CREATE INDEX IX_Employees ON Employees(EmployeeNumber)

EXEC sp_helpindex Employees

Use IndexDB
Go
INSERT INTO Employees
VALUES(35844, 'Monay', 'Gertrude', 'Gmonay', '2006-06-22', 14.36)

Use IndexDB
Go
DROP INDEX Employees.IX_Employees

Use IndexDB
Go
CREATE CLUSTERED INDEX IX_Employees_Clustered ON Employees(EmployeeNumber)

Use IndexDB
Go
ALTER TABLE Employees
ADD CONSTRAINT PK_EmployeeNumber
PRIMARY KEY (EmployeeNumber)

Use IndexDB
Go
DROP INDEX Employees.IX_Employees_Clustered

Use IndexDB
Go
ALTER TABLE Employees
DROP CONSTRAINT PK_EmployeeNumber

Use IndexDB
Go
EXEC sp_helpindex Employees

Use IndexDB
Go
ALTER TABLE Employees
ADD CONSTRAINT PK_EmployeeNumber
PRIMARY KEY (EmployeeNumber)

EXEC sp_helpindex Employees

Use IndexDB
Go
CREATE CLUSTERED INDEX IX_Employees_Clustered ON Employees(EmployeeNumber)

Use IndexDB
Go
INSERT INTO Rooms (RoomID, RoomNumber, LocationCode, BedType, Rate, Available)
VALUES (1, 105, 'SLSP', 'King', 85.75, 1), 
	   (2, 106, 'SLSP', 'Queen', 75.85, 1);

Use IndexDB
Go
CREATE UNIQUE NONCLUSTERED INDEX IX_Rooms_NCU ON Rooms(RoomNumber)

Use IndexDB
Go
INSERT INTO Rooms (RoomID, RoomNumber, LocationCode, BedType, Rate, Available)
VALUES (3, 105, 'SLSP', 'King', 95.00, 1);

Use IndexDB
Go
DROP INDEX Rooms.IX_Rooms_NCU