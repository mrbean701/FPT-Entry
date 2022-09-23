DROP DATABASE IF EXISTS Rudy;

CREATE DATABASE IF NOT EXISTS Rudy;
USE Rudy;

-- CREATE TABLE IF NOT EXISTS `Thing`(
-- 	idThing				INT AUTO_INCREMENT PRIMARY KEY,
--     `serial`			VARCHAR(50) NOT NULL
-- );

CREATE TABLE IF NOT EXISTS `Video`(
	id					INT AUTO_INCREMENT PRIMARY KEY,
    `name`				NVARCHAR(100) NOT NULL,
    createDate			DATE DEFAULT (NOW()),
    `serial`			VARCHAR(50) NOT NULL
--     idThing				INT,
--     FOREIGN KEY (idThing) REFERENCES `Thing`(idThing)
);

CREATE TABLE IF NOT EXISTS `BookOnTape`(
	id					INT AUTO_INCREMENT PRIMARY KEY,
    `name`				NVARCHAR(100),
    createDate			DATE DEFAULT (NOW()),
    `serial`			VARCHAR(50) NOT NULL
-- 	idThing				INT NOT NULL,
--     FOREIGN KEY (idThing) REFERENCES `Thing`(idThing)
);

CREATE TABLE IF NOT EXISTS `Furniture`(
	id					INT AUTO_INCREMENT PRIMARY KEY,
    `name`				NVARCHAR(100),
    createDate			DATE DEFAULT (NOW()),
    `serial`			VARCHAR(50) NOT NULL
-- 	idThing				INT NOT NULL,
--     FOREIGN KEY (idThing) REFERENCES `Thing`(idThing)
);

-- INSERT INTO `Thing`(`serial`) VALUES 	("s1"),
-- 										("s2"),
-- 										("s3"),
-- 										("s4"),
-- 										("s5"),
-- 										("s6"),
-- 										("s7"),
-- 										("s8");


INSERT INTO `Video`(`name`,`serial`) VALUES ("vid1","s12345"),
											("vid2","s2534534"),
                                            ("vid3","s35345345");
                                            
INSERT INTO `BookOnTape`(`name`,`serial`) VALUES ("book1","s45345345"),
											("book2","s5534534");
                                            
INSERT INTO `Furniture`(`name`, `serial`) VALUES ("fur1","s653445"),
											("fur2","s7345"),
                                            ("fur3","s85345"),
                                            ("fur4","s953453");
                                            

--                                             
-- SELECT t.idThing, v.`name`, b.`name`, f.`name` FROM `Thing` t
--  INNER JOIN `Video` v ON t.idThing = v.idThing
--  INNER JOIN `BookOnTape` b ON t.idThing = b.idThing 
--  INNER JOIN `Furniture` f ON t.idThing = f.idThing
--  WHERE t.idThing = 1;



SELECT * FROM Video
UNION
SELECT * FROM BookOnTape
UNION
SELECT * FROM Furniture
;


SELECT v.id, v.`name`, v.createDate, v.`serial` FROM  `Video` v  WHERE v.`serial` = ?
UNION
SELECT b.id, b.`name`, b.createDate, b.`serial` FROM  `BookOnTape` b WHERE b.`serial` = ?
UNION
SELECT f.id, f.`name`, f.createDate, f.`serial` FROM  `Furniture` f  WHERE f.`serial` = ?;
