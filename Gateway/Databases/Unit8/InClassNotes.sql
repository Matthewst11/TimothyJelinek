USE Video
Go

CREATE VIEW VwDisplayVideos AS
	SELECT * FROM Member;

CREATE VIEW VwDisplayVideos
WITH SCHEMABINDING
AS
	SELECT * FROM Member;

SELECT * FROM VwDisplayVideos
ORDER BY MemberID

ALTER VIEW VwDisplayVideos AS
	SELECT * FROM Member;

CREATE UNIQUE CLUSTERED INDEX Movies
ON VwDisplayVideos(LastName)
