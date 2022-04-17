CREATE TABLE IF NOT EXISTS product (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    description VARCHAR(255),
    product_status VARCHAR(20),
    creation_date timestamp,
    last_modified_date timestamp
) engine = InnoDB;