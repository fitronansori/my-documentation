CREATE TABLE
    admin (
        id INT NOT NULL AUTO_INCREMENT,
        first_name VARCHAR(50) NOT NULL,
        last_name VARCHAR(50) NOT NULL,
        PRIMARY KEY (id)
    ) ENGINE = InnoDB;

INSERT INTO
    admin (first_name, last_name)
VALUES ('John', 'Doe'), ('Jane', 'Doe'), ('John', 'Smith');

DESCRIBE admin;

SHOW tables;

SELECT * FROM admin;