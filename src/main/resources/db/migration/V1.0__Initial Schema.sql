CREATE TABLE `m_product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `price` decimal(19,2) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY (`code`),
  UNIQUE KEY (`name`)
) ENGINE=InnoDB ;