use Education
Go
alter table Student
Add constraint CHK_StudentState Check (StudentState = 'WI')

Use Education
exec sp_help Student

ALTER table Student
drop constraint CHK_StudentState

Use Education
Go
Update Student 
set StudentState = 'IL',
where StudentState = 'WI'