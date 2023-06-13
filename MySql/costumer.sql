CREATE TABLE
    customers (
        id INT NOT NULL AUTO_INCREMENT,
        first_name VARCHAR(50) NOT NULL,
        last_name VARCHAR(50) NOT NULL,
        email VARCHAR(50) NOT NULL,
        PRIMARY KEY (id),
        UNIQUE KEY email_unique (email)
    ) ENGINE = InnoDB;

-- kalau email sama akan error

INSERT INTO
    customers (first_name, last_name, email)
VALUES (
        'John',
        'Doe',
        'john@gmail.com'
    ), (
        'Jane',
        'Doe',
        'jane@gmail.com'
    ), (
        'John',
        'Smith',
        'john007@gmail.com'
    );

SHOW TABLES;

DESCRIBE customers;

SELECT * FROM customers;