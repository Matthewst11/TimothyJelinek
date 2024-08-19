--Check if the ViewsDB exists,
--If not, create it
IF NOT EXISTS(SELECT * FROM sys.databases
WHERE name = 'Education')
  CREATE DATABASE Education;
GO

USE Education;
GO


CREATE TABLE Student
(	StudentID 			INT	PRIMARY KEY,
	StudentLastName 	VARCHAR(25)	NOT NULL,
	StudentFirstName	VARCHAR(20)	NOT NULL,
	StudentAddress		VARCHAR(30),
	StudentCity			VARCHAR(15),
	StudentState		CHAR(2),
	StudentZip			VARCHAR(9),
	StudentPhone		VARCHAR(12),
	StudentDOB			DATE NOT NULL
);
GO  

CREATE TABLE Department
(	DepartmentID		INT	PRIMARY KEY,
	DepartmentName		VARCHAR(30)	NOT NULL
);
GO 

CREATE TABLE Instructor
(	InstructorID		INT PRIMARY KEY,
	InstructorLastName 	VARCHAR(40) NOT NULL,
	InstructorFirstName	VARCHAR(20)	NOT NULL,
	InstructorPhone		VARCHAR(12),
	DepartmentID		INT REFERENCES Department(DepartmentID) NOT NULL
);
GO
  

CREATE TABLE Course
  (CourseID		VARCHAR(7) PRIMARY KEY,
   CourseName	VARCHAR(25) NOT NULL,
   CourseCredit	INT,
   DepartmentID	INT REFERENCES Department(DepartmentID)
);
GO

CREATE TABLE Class
(	CourseID		VARCHAR(7) REFERENCES Course(CourseID),
	Section			VARCHAR(3),
	[Time]			VARCHAR(10),
	BeginDate		DATE,
	EndDate			DATE,
	[Location]		VARCHAR(4),
	InstructorID	INT  REFERENCES Instructor(InstructorID),
	Semester		VARCHAR(6)
);
GO

CREATE TABLE Roster
  (RosterID		INT PRIMARY KEY IDENTITY,
   StudentID	INT REFERENCES Student(StudentID),
   CourseID		VARCHAR(7) REFERENCES Course(CourseID),
   Section		VARCHAR(3),
   Grade		VARCHAR(1),
);
GO   
   

INSERT INTO Department
 VALUES
 (001, 'BUSINESS INFORMATION TECH'),
 (002, 'MARKETING'),
 (003, 'ACCOUNTING'),
 (004, 'ELECTRONICS'),
 (005, 'INDUSTRIAL');
GO

 INSERT INTO Instructor
  VALUES
  (000432,'SMITH', 'BOB','262-692-8999',001),
  (000433,'JONES', 'BETTY','262-692-8799',001),
  (000442,'GREEN', 'TOM','262-692-8889',002),
  (000434,'FAVRE', 'JANE','262-692-7999',002),
  (000532,'EDWARDS', 'TONY','262-692-4499',003),
  (000742,'BROWN', 'BUTCH','262-692-5499',004),
  (003432,'WILLIAMS', 'SUE','262-692-8759',004),
  (000772,'CRASH', 'KATHY','262-692-4479',005);
GO
  
  
INSERT INTO Student 
  VALUES
  (000123, 'JONES', 'TOM', '1400 SOUTH 27 ST', 'MILWAUKEE', 'WI','53227','414-645-8244', '04/24/1977'),
  (000143, 'FLINSTONE', 'ALICE', '1840 SOUTH 57 ST', 'MILWAUKEE', 'WI','53237','414-645-8364', '09/07/75'),
  (000153, 'BIDDELL', 'SAM', '2340 SOUTH 67 ST', 'MILWAUKEE', 'WI','53227','414-645-8244', '12/14/79'),
  (000135, 'ADAMS', 'GEORGE', '3400 SOUTH 5 ST', 'MILWAUKEE', 'WI','53227','414-282-8644', '11/20/65'),
  (000124, 'MARSHALL', 'CHRIS', '9400 SOUTH 87 ST', 'MILWAUKEE', 'WI','53229','414-647-8544', '01/24/81');
GO


INSERT INTO Course
  VALUES
  ('107114','INTRODUCTION TO SQL 2016',3,001),
  ('107185','INTRODUCTION TO UNIX',3,001),
  ('605195','CISCO 1',3,004),
  ('104111','ACCOUNTING 1',3,003),
  ('104112','ACCOUNTING 2',3,003),
  ('105111','MARKETING 1',3,002),
  ('105112','MARKETING 2',3,002);
GO

INSERT INTO Class
  VALUES
  ('107114','001','18:0022:00','08/15/2011','12/15/2011','I119',432,201102),
  ('107185','002','18:0022:00','01/15/2011','04/15/2011','I120',433,201102),
  ('107114','002','18:0022:00','08/15/2012','12/15/2012','I119',434,201102),
  ('104111','001','18:0022:00','08/15/2012','12/15/2012','B202',532,201102),
  ('104112','001','18:0022:00','08/15/2011','12/15/2011','B203',742,201102),
  ('105112','001','18:0022:00','05/15/2017','08/15/2017','B240',772,201102),
  ('605195','001','18:0022:00','08/15/2017','12/15/2017','S103',742,201102),
  ('605195','002','18:0022:00','01/15/2018','04/15/2018','S104',432,201102);
GO
  

INSERT INTO Roster
  VALUES
  (123,'107114','001','B'),
  (123,'107114','001','A'),
  (135,'605195','001','C'),
  (135,'107114','001','B'),
  (143,'105111','001','D'),
  (153,'107114','001','A'),
  (143,'104112','001','D'),
  (124,'104112','001','A');
GO

--Show all content from all tables
SELECT * FROM Student
SELECT * FROM Instructor
SELECT * FROM Department
SELECT * FROM Class
SELECT * FROM Course
SELECT * FROM Roster

--Drop all tables
--DROP TABLE Class
--DROP TABLE Instructor
--DROP TABLE Roster
--DROP TABLE Student
--DROP TABLE Course
--DROP TABLE Department


-- HOMEWORK
USE Education
GO

CREATE PROCEDURE sp_InsertClass
	@pcid VARCHAR(7),
  @psection VARCHAR(3),
  @ptime VARCHAR(10),
  @pbegindate DATE,
  @penddate DATE,
  @plocation VARCHAR(4),
  @piid INT,
  @psemester VARCHAR(6) = "201302"
AS
INSERT INTO dbo.class (CourseID, Section, Time, BeginDate, EndDate, Location, InstructorID, Semester)
VALUES(@pcid, @psection, @ptime, @pbegindate, @penddate, @plocation, @piid, @psemester);

GO

USE Education
GO

EXEC sp_InsertClass '107114', '001', '18000000', '20130905', '20131212', 'L208', 772
GO

select * from Class

USE Education
GO

ALTER PROCEDURE sp_InsertClass

  @pcid VARCHAR(7),
  @psection VARCHAR(3),
  @ptime VARCHAR(10),
  @pbegindate DATE,
  @penddate DATE,
  @plocation VARCHAR(4),
  @piid INT,
  @psemester VARCHAR(6) = "201302"
AS
BEGIN
    DECLARE @Error INT;

    INSERT INTO dbo.Class (CourseID, Section, Time, BeginDate, EndDate, Location, InstructorID, Semester)
    VALUES(@pcid, @psection, @ptime, @pbegindate, @penddate, @plocation, @piid, @psemester);

    SET @Error = @@ERROR;

    IF @Error = 0
	PRINT 'New Class Section Added';
    ELSE
	BEGIN
	IF @Error = 547 -- FK violation
	    PRINT 'Sorry you violated a FK integrity check on either Course ID or Instructor ID'
	ELSE -- something unknown happened
	    PRINT 'Unknown error occurred.';
	END
END

GO

USE Education
GO

EXEC sp_InsertClass '107114', '001', '18000000', '20130905', '20131212', 'L208', 772
GO

select * from Class

USE Education
GO

EXEC sp_InsertClass '107114', '001', '18000000', '20130905', '20131212', 'L208', 779

USE Education
GO

EXEC sp_InsertClass '001', '18:0000:00', 20130905, '20131212', 'L208', 772

CREATE PROCEDURE sp_InsertInstructor

  (@pinstructorid int,
  @pinstructorlastname varchar(40),
  @pinstructorfirstname varchar(20),
  @pinstructorphone varchar(12),
  @pdepartmentid int)
AS
BEGIN
    DECLARE @Error INT;

    INSERT INTO dbo.Instructor(InstructorID, InstructorLastName, InstructorFirstName, InstructorPhone, DepartmentID)
    VALUES(@pinstructorid, @pinstructorlastname, @pinstructorfirstname, @pinstructorphone, @pdepartmentid);

    SET @Error = @@ERROR;

    IF @Error = 0
	PRINT 'New Instructor Added';
    ELSE
	BEGIN
	IF @Error = 547 -- FK violation
	    PRINT 'Sorry you violated a FK integrity check on either Course ID or Instructor ID'
	ELSE -- something unknown happened
	    PRINT 'Unknown error occurred.';
	END
END

GO

USE Education
GO

EXEC sp_InsertInstructor '723', 'HUR', 'CHRISTIAN', '262-619-6388', '3'

select * from Instructor

CREATE PROCEDURE sp_UpdateInstructorNumber
 (@pinstructorphone varchar(12),
  @pinstructorid int)
AS
BEGIN
    DECLARE @Error INT;

    INSERT INTO dbo.Instructor(InstructorPhone, InstructorID)
    VALUES(@pinstructorphone, @pinstructorid);
	END
	BEGIN
            UPDATE Instructor
            SET    InstructorPhone = @pinstructorphone
            WHERE  InstructorID = @pinstructorid
        END

    SET @Error = @@ERROR;

    IF @Error = 0
	PRINT 'New Instructor Added';
    ELSE
	BEGIN
	IF @Error = 547 -- FK violation
	    PRINT 'Sorry you violated a FK integrity check on either Course ID or Instructor ID'
	ELSE -- something unknown happened
	    PRINT 'Unknown error occurred.';
	END
	GO
	
	
	EXEC sp_UpdateInstructorNumber '262-619-6280', '723'
	
	
	select * from Instructor