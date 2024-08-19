Use Video 
Go
ALTER TABLE Member
ADD CONSTRAINT system_date_constraint
DEFAULT GETDATE() FOR JoinDate

USE Video
Go
ALTER TABLE Title
ADD CONSTRAINT CHK_RATING
CHECK (Rating IN ('G', 'PG', 'R', 'NC17', 'NR')
	AND Category IN ('Drama', 'Comedy', 'Action', 'Child', 'Scifi', 'Documentary'));

Use Video
Go
ALTER TABLE TitleCopy
ADD CONSTRAINT FK_TitleID
FOREIGN KEY (TitleID) REFERENCES Title(TitleID)

USE Video
Go
ALTER TABLE TitleCopy
ADD CONSTRAINT CHK_STATUS
CHECK (Status IN ('Available', 'Destroyed', 'Rented', 'Reserved'));

USE Video
GO
ALTER TABLE RENTALADD CONSTRAINT MyDate_BookDateDEFAULT GETDATE() FOR BookDate;

EXEC sp_helpindex Rental

Use Video
Go
ALTER TABLE RENTAL
ADD CONSTRAINT FK_MemberID
FOREIGN KEY (MemberID) REFERENCES Member(MemberID)

Use Video
Go
ALTER TABLE RENTAL
ADD CONSTRAINT FK_CopyID
FOREIGN KEY (CopyID) REFERENCES TitleCopy(CopyID)

USE Video
GO
ALTER TABLE RENTALADD CONSTRAINT MyDate_ExpRetDateDEFAULT DATEADD(DAY, 2, GETDATE() ) FOR ExpRetDate;

Use Video
Go
ALTER TABLE RENTAL
ADD CONSTRAINT FK_TitleIDRental
FOREIGN KEY (TitleID) REFERENCES TitleCopy(TitleID)

Use Video
Go
ALTER TABLE Reservation
ADD CONSTRAINT FK_MemberIDReservation
FOREIGN KEY (MemberID) REFERENCES Member(MemberID)

Use Video
Go
ALTER TABLE Reservation
ADD CONSTRAINT FK_TitleIDReservation
FOREIGN KEY (TitleID) REFERENCES Title(TitleID)

Use Video
Go
INSERT INTO Member
VALUES(123, 'Jones', 'Tom', '1400 South 27 St', 'Milwaukee', '414-645-8244', '2-12-2018')

Use Video
Go
INSERT INTO Title
VALUES(101, 'Harry Potter', 'A series of fantasy novels that chronicle the life of a young wizard, Harry Potter, 
and his friends Hermione Granger and Ron Weasley.', 'G', 'Scifi', '11/14/2001')

Use Video
Go
INSERT INTO Title
VALUES(101, 'Gremlins', 'A strange creature which spawns other creatures who transform into small, 
destructive, evil monsters.', 'NC12', 'Scifi', '6/8/1984')

Use Video
Go
INSERT INTO Rental
VALUES('2/10/2018', 123, 555, '2/5/2018', '2/5/2018', 101)

Use Video
Go
INSERT INTO TitleCopy
VALUES(555, 101, 'Available')

Use Video
Go
DELETE FROM TitleCopy WHERE CopyID = 555

Use Video
Go
ALTER TABLE Rental
DROP CONSTRAINT FK_CopyID;

Use Video
Go
ALTER TABLE Rental
DROP CONSTRAINT FK_TitleIDRental;