Use AdventureWorks2017
Go

CREATE TABLE MyCompanies (
	id_num INT IDENTITY(100, 5) PRIMARY KEY,
	company_name VARCHAR(100)
);

INSERT INTO MyCompanies
VALUES ('A Bike Store'),
	   ('Advanced Bike Components'),
	   ('Aerobic Exercise Company'),
	   ('Associated Bikes'),
	   ('Exemplary Cycles'),
	   ('Metropolitan Sports Suppy'),
	   ('Modular Cycle Systems'),
	   ('Progressive Sports');
GO

SELECT company_name, id_num
FROM MyCompanies 
WHERE UPPER(company_name) LIKE '%BIKE%';
GO