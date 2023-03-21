CREATE DATABASE `library` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

-- library.books definition

CREATE TABLE `books` (
  `isbn` bigint NOT NULL,
  `title` varchar(100) DEFAULT NULL,
  `theme` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO library.books
(isbn, title, theme)
VALUES(9781491995792, 'Deep Learning Cookbook', 'Machine Learning');
INSERT INTO library.books
(isbn, title, theme)
VALUES(9781449357351, 'Python Cookbook, 3rd Edition', 'Programming');
INSERT INTO library.books
(isbn, title, theme)
VALUES(9781491975336, 'bash Cookbook, 2nd Edition', 'Scripting');
INSERT INTO library.books
(isbn, title, theme)
VALUES(9781492040682, 'R Cookbook, 2nd Edition', 'Data analysis');
INSERT INTO library.books
(isbn, title, theme)
VALUES(9781449319434, 'Regular Expressions Cookbook, 2nd Edition', 'Programming');
