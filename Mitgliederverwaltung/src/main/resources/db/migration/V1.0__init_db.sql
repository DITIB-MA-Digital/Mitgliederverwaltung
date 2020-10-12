CREATE SCHEMA if not exist `mitgliederverwaltung`;

use mitgliederverwaltung;

CREATE TABLE `mitgliederverwaltung`.`users` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));