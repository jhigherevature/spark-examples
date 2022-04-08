-- CRUD operations

-- CREATE
INSERT INTO school VALUES (default, 'Frederickson Community College');
INSERT INTO school VALUES (default, 'Whitakers University');

INSERT INTO student(id, full_name, gpa, school_id) VALUES(default, 'Tory Vasquez', 3.0, 1);
INSERT INTO student(id, full_name, gpa, school_id) VALUES(default, 'Jacob Jacobson', 2.5, 1);
INSERT INTO student(id, full_name, gpa, school_id) VALUES(default, 'Freddie Warner', 4.0, 1);
INSERT INTO student(id, full_name, gpa, school_id) VALUES(default, 'Wilma Jenkins', 4.0, 2);
INSERT INTO student(id, full_name, gpa, school_id) VALUES(default, 'Dina Larson', 1.0, 2);
INSERT INTO student(id, full_name, gpa, school_id) VALUES(default, 'Jerry Jackson', 2.5, 2);

-- READ
SELECT * FROM student;
SELECT * FROM school;

-- UPDATE
UPDATE student SET gpa = 4.0 RETURNING *;

-- DELETE
DELETE FROM student WHERE id = 1;
