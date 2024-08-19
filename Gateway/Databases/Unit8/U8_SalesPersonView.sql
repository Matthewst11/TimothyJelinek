-- Potential Solution, but I did not like it
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
-- Step #1
SELECT pp.FirstName, 
	pp.LastName
FROM Person.Person As pp, Sales.SalesPerson As ss
WHERE ss.BusinessEntityID = pp.BusinessEntityID

-- OR

SELECT pp.FirstName, 
	pp.LastName
FROM Person.Person As pp
JOIN Sales.SalesPerson As ss
ON ss.BusinessEntityID = pp.BusinessEntityID

-- Step #2
SELECT pp.FirstName, 
	pp.LastName,
	SUM(ss.SalesYTD) As TotalSales
FROM Person.Person pp, Sales.SalesPerson ss
WHERE ss.BusinessEntityID = pp.BusinessEntityID
GROUP BY pp.FirstName, pp.LastName;

-- OR

SELECT pp.FirstName, 
	pp.LastName,
	SUM(ss.SalesYTD) As TotalSales
FROM Person.Person pp
JOIN Sales.SalesPerson As ss
ON ss.BusinessEntityID = pp.BusinessEntityID
GROUP BY pp.FirstName, pp.LastName;

-- Step #3

SELECT st.Name As Territory,
	pp.FirstName, 
	pp.LastName,
	sc.CustomerID,
	SUM(ss.SalesYTD) As TotalSales
FROM Person.Person pp, Sales.SalesPerson ss, Sales.Customer sc, Sales.SalesTerritory st
WHERE ss.BusinessEntityID = pp.BusinessEntityID
AND ss.TerritoryID = sc.TerritoryID
AND st.TerritoryID = sc.TerritoryID
GROUP BY st.Name, pp.LastName, pp.FirstName, sc.CustomerID;

-- Revised Query

SELECT st.Name As Territory,
	pp.FirstName + ' ' + IsNull(pp.MiddleName, '') + ' ' + pp.LastName As 'Full Name',
	FORMAT(SUM(ss.SalesYTD), 'C') As TotalSales
FROM Person.Person As pp, Sales.SalesPerson As ss, Sales.SalesTerritory As st
WHERE ss.BusinessEntityID = pp.BusinessEntityID
AND ss.TerritoryID = st.TerritoryID
GROUP BY st.Name, pp.LastName, pp.MiddleName, pp.FirstName;
