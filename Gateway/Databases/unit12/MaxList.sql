USE AdventureWorks2017
Go
WHILE (SELECT AVG(ListPrice) FROM Product) < 500
BEGIN 
	UPDATE Product 
		SET ListPrice = ListPrice * 2

		IF (SELECT MAX(ListPrice) FROM Product) > 5000
			BREAK
		ELSE
			CONTINUE
END
GO

SELECT AVG(ListPrice) As "Abg Price", Max(ListPrice) As "Max Price"
FROM Product
Go