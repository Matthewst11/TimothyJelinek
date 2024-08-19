USE AdventureWorks2017
Go
-- DECLARE @COUNT INT = 0;
SELECT ProductNumber,
	   Category = 
	   CASE ProductLine
		WHEN 'R' THEN 'Road'
		WHEN 'M' THEN 'Mountain'
		WHEN 'T' THEN 'Touring'
		WHEN 'S' THEN 'Other sale items'
		ELSE 'Not for sale'
	   END
FROM Product
ORDER BY ProductNumber;
GO