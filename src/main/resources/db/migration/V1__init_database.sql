DROP TABLE IF EXISTS order_header cascade;

CREATE TABLE order_header
(
    id       BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    customer VARCHAR(255)
) engine = InnoDB;