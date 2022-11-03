/*
	DML (Data Manipulation Language) CRUD operations
	CREATE - Add records to an existing table
	READ - Retrieve and look at records from an existing table
	UPDATE - Change/alter values of records in an existing table
	DELETE - Remove records from an existing table
*/
-- CREATE
INSERT INTO school VALUES (default, 'Frederickson Community College');
INSERT INTO school VALUES (default, 'Whitakers University');

INSERT INTO student(id, full_name, gpa, school_id) VALUES(default, 'Tory Vasquez', 3.0, 1);
INSERT INTO student(id, full_name, gpa, school_id) VALUES(default, 'Jacob Jacobson', 2.5, 1);
INSERT INTO student(id, full_name, gpa, school_id) VALUES(default, 'Freddie Warner', 4.0, 1);
INSERT INTO student(id, full_name, gpa, school_id) VALUES(default, 'Wilma Jenkins', 4.0, 2);
INSERT INTO student(id, full_name, gpa, school_id) VALUES(default, 'Dina Larson', 1.0, 2);
INSERT INTO student(id, full_name, gpa, school_id) VALUES(default, 'Jerry Jackson', 2.5, 2);

/*
	The asterisk (*) acts as a wildcard. When used in select
	statements, you will retrieve all columns from a table.
*/
-- READ
--SELECT * FROM student;
--SELECT * FROM school;

/*
	Update statements may include a 'WHERE' clause that can identify
	specific values to retrieve from a table based on the value of
	that record's column.

	The 'RETURNING' clause can be used to SELECT data from the table
	immediately after performing the UPDATE operation.
*/
-- UPDATE
--UPDATE student SET gpa = 2.5 WHERE student.id = 6;
--UPDATE student SET gpa = 4.0 RETURNING *;

/*
	WHERE clauses can be appended to DELETE statements as well to remove
	specific records.
	
	Without the WHERE clause DELETE will remove all records from a table.
*/
-- DELETE
--DELETE FROM student WHERE id = 1;
--DELETE FROM student;