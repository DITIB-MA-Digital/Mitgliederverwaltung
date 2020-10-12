CREATE SCHEMA IF NOT EXISTS `mitgliederverwaltung`;

use `mitgliederverwaltung`;

CREATE TABLE `mitgliederverwaltung`.`users` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `mitgliederverwaltung`.`members` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `member_id` INT(11),
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `birth_day` DATE NOT NULL,
  `street` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `postal_code` INT(5) NOT NULL,
  `is_approved` BOOLEAN NOT NULL DEFAULT 0,
  `member_since` DATE NOT NULL,
  PRIMARY KEY (`id`));