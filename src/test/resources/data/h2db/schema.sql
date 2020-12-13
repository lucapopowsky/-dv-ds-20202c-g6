DROP IF EXIST  `prendas`;
CREATE TABLE `prendas` (
  `prd_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `prd_descripcion` varchar(255) DEFAULT NULL,
  `prd_precio_base` decimal(19,2) DEFAULT NULL,
  `prd_tipo_prenda` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`prd_id`)
) 