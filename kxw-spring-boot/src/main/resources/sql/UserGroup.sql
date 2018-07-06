-- auto Generated on 2018-07-06 14:37:33 
-- DROP TABLE IF EXISTS `user_group`; 
CREATE TABLE user_group (
  `id`    INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT
  COMMENT 'id',
  `name`  VARCHAR(64)          NOT NULL DEFAULT ''
  COMMENT 'name',
  `group` VARCHAR(64)          NOT NULL DEFAULT ''
  COMMENT 'group',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = UTF8
  COMMENT 'user_group';
