CREATE TABLE product (
                         id BIGINT PRIMARY KEY AUTO_INCREMENT,
                         name VARCHAR(255) NOT NULL,
                         description TEXT,
                         price DOUBLE NOT NULL,
                         quantity INT NOT NULL
);
