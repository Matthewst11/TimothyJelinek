CREATE DATABASE Video

Use Video
Go
CREATE TABLE Member(	MemberID	NUMERIC(10) PRIMARY KEY NOT NULL,	LastName	VARCHAR(25) NOT NULL,	FirstName	VARCHAR(25),	Address		VARCHAR(100),	City		VARCHAR(30),	Phone		VARCHAR(15),	JoinDate	DATE NOT NULL,);Use Video
Go
CREATE TABLE Title(	TitleID	    NUMERIC(10) PRIMARY KEY NOT NULL,	Title	    VARCHAR(60) NOT NULL,	Description	VARCHAR(400) NOT NULL,	Rating		VARCHAR(4),	Category	VARCHAR(20),	ReleaseDate	DATE,	);Use Video
Go
CREATE TABLE TitleCopy(	CopyID	    NUMERIC(10) PRIMARY KEY NOT NULL,	TitleID     NUMERIC(10) NOT NULL UNIQUE,	Status      VARCHAR(15) NOT NULL,	);Use Video
Go
CREATE TABLE Rental(	BookDate	DATE PRIMARY KEY NOT NULL,	MemberID	NUMERIC(10) NOT NULL,	CopyID      NUMERIC(10) NOT NULL,	ActRetDate  DATE,	ExpRetDate  DATE,	TitleID     NUMERIC(10),	);Use Video
Go
CREATE TABLE Reservation(	ResDate     DATE PRIMARY KEY NOT NULL,	MemberID    NUMERIC(10) NOT NULL UNIQUE,	TitleID     NUMERIC(10) NOT NULL,	);EXEC sp_help MemberEXEC sp_help TitleEXEC sp_help TitleCopyEXEC sp_help RentalEXEC sp_help Reservation