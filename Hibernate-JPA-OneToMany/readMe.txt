 create database hibernateAssociations;
use hibernateAssociations;
CREATE TABLE `teacher` (
  `teacherId` int NOT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`teacherId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `course` (
  `courseId` int NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `TEACHER_ID` int DEFAULT NULL,
  PRIMARY KEY (`courseId`),
  KEY `FKc70fxf69u1fnbcab6wd15fwi1` (`TEACHER_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

SELECT * FROM hibernateassociations.course;
SELECT * FROM hibernateassociations.teacher;
insert into TEACHER values(1, 'Doe', 'Jane');

insert into COURSE values(1,'Java 101',1);
insert into COURSE values(2,'SQL 101',1);
insert into COURSE values(3,'JPA 101',1);


What's a One-to-Many relationship?

As its name implies, it's a relationship that links one entity to many other entities.

In our example, this would be a Teacher and their Courses. A teacher can give multiple courses, but a course is given by only one teacher (that's the Many-to-One perspective - many courses to one teacher).

Another example could be on social media - a photo can have many comments, but each of those comments belongs to that one photo.