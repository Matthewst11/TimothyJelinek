create database Test

CREATE DATABASE JakesDealerShip
ON  PRIMARY
( NAME = N'Jakes_Data', FILENAME = N'C:\JakesDealership\Jakes_Data.mdf' , SIZE = 209920KB , MAXSIZE = UNLIMITED, FILEGROWTH =16384KB )
 LOG ON
( NAME = N'Jakes_Log', FILENAME = N'C:\JakesDealership\Jakes_log.ldf' , SIZE = 768KB , MAXSIZE = UNLIMITED, FILEGROWTH = 10%)
GO

Use Test
Go
CREATE TABLE SalesTable (
       Invoice_Num varchar(13) PRIMARY KEY NOT NULL,
       SalesID varchar(13) NOT NULL,
       CustomerID varchar(13) NOT NULL,
       VIN_Num char(17) NULL );

DROP DATABASE Test