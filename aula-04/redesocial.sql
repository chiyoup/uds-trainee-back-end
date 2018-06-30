
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `redesocial` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `redesocial` ;

-- -----------------------------------------------------
-- Table `redesocial`.`pessoas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `redesocial`.`pessoas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `postagens_id` INT NOT NULL,
  `postagens_comentarios_id` INT NOT NULL,
  `postagens_likes_id` INT NOT NULL,
  `postagens_compartilhamentos_id` INT NOT NULL,
  PRIMARY KEY (`id`, `postagens_id`, `postagens_comentarios_id`, `postagens_likes_id`, `postagens_compartilhamentos_id`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `redesocial`.`likes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `redesocial`.`likes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `redesocial`.`comentarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `redesocial`.`comentarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `redesocial`.`compartilhamentos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `redesocial`.`compartilhamentos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `redesocial`.`postagens`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `redesocial`.`postagens` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `comentarios_id` INT NOT NULL,
  `likes_id` INT NOT NULL,
  `compartilhamentos_id` INT NOT NULL,
  `comentarios_id1` INT NOT NULL,
  `likes_id1` INT NOT NULL,
  `compartilhamentos_id1` INT NOT NULL,
  PRIMARY KEY (`id`, `comentarios_id`, `likes_id`, `compartilhamentos_id`),
  INDEX `fk_postagens_comentarios1_idx` (`comentarios_id1` ASC),
  INDEX `fk_postagens_likes1_idx` (`likes_id1` ASC),
  INDEX `fk_postagens_compartilhamentos1_idx` (`compartilhamentos_id1` ASC),
  CONSTRAINT `fk_postagens_comentarios1`
    FOREIGN KEY (`comentarios_id1`)
    REFERENCES `redesocial`.`comentarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_postagens_likes1`
    FOREIGN KEY (`likes_id1`)
    REFERENCES `redesocial`.`likes` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_postagens_compartilhamentos1`
    FOREIGN KEY (`compartilhamentos_id1`)
    REFERENCES `redesocial`.`compartilhamentos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `redesocial`.`pessoas_has_postagens`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `redesocial`.`pessoas_has_postagens` (
  `pessoas_id` INT NOT NULL,
  `pessoas_postagens_id` INT NOT NULL,
  `pessoas_postagens_comentarios_id` INT NOT NULL,
  `pessoas_postagens_likes_id` INT NOT NULL,
  `pessoas_postagens_compartilhamentos_id` INT NOT NULL,
  `postagens_id` INT NOT NULL,
  `postagens_comentarios_id` INT NOT NULL,
  `postagens_likes_id` INT NOT NULL,
  `postagens_compartilhamentos_id` INT NOT NULL,
  PRIMARY KEY (`pessoas_id`, `pessoas_postagens_id`, `pessoas_postagens_comentarios_id`, `pessoas_postagens_likes_id`, `pessoas_postagens_compartilhamentos_id`, `postagens_id`, `postagens_comentarios_id`, `postagens_likes_id`, `postagens_compartilhamentos_id`),
  INDEX `fk_pessoas_has_postagens_postagens1_idx` (`postagens_id` ASC, `postagens_comentarios_id` ASC, `postagens_likes_id` ASC, `postagens_compartilhamentos_id` ASC),
  INDEX `fk_pessoas_has_postagens_pessoas_idx` (`pessoas_id` ASC, `pessoas_postagens_id` ASC, `pessoas_postagens_comentarios_id` ASC, `pessoas_postagens_likes_id` ASC, `pessoas_postagens_compartilhamentos_id` ASC),
  CONSTRAINT `fk_pessoas_has_postagens_pessoas`
    FOREIGN KEY (`pessoas_id` , `pessoas_postagens_id` , `pessoas_postagens_comentarios_id` , `pessoas_postagens_likes_id` , `pessoas_postagens_compartilhamentos_id`)
    REFERENCES `redesocial`.`pessoas` (`id` , `postagens_id` , `postagens_comentarios_id` , `postagens_likes_id` , `postagens_compartilhamentos_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pessoas_has_postagens_postagens1`
    FOREIGN KEY (`postagens_id` , `postagens_comentarios_id` , `postagens_likes_id` , `postagens_compartilhamentos_id`)
    REFERENCES `redesocial`.`postagens` (`id` , `comentarios_id` , `likes_id` , `compartilhamentos_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
