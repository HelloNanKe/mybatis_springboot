CREATE TABLE city
(
  id          INT UNSIGNED AUTO_INCREMENT
  COMMENT '城市编号'
    PRIMARY KEY,
  province_id INT UNSIGNED NOT NULL
  COMMENT '省份编号',
  city_name   VARCHAR(25)  NULL
  COMMENT '城市名称',
  description VARCHAR(25)  NULL
  COMMENT '描述'
)
  ENGINE = InnoDB
  CHARSET = utf8;


INSERT INTO springbootdb.city (id, province_id, city_name, description) VALUES (1, 1, '温岭市', 'BYSocket 的家在温岭。');