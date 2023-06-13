CREATE TABLE
    sellers (
        id INT NOT NULL AUTO_INCREMENT,
        first_name VARCHAR(50) NOT NULL,
        last_name VARCHAR(50) NOT NULL,
        email VARCHAR(50) NOT NULL,
        PRIMARY KEY (id),
        UNIQUE KEY email_unique (email),
        INDEX name_index (last_name, first_name)
    ) ENGINE = InnoDB;

ALTER TABLE sellers
ADD INDEX name2 (last_name),
ADD INDEX name1 (first_name);

INSERT INTO
    sellers (first_name, last_name, email)
VALUES (
        'John',
        'Doe',
        'jonh@gmail.com'
    );

-- add 20 value to seller with firstname lastname dan email

INSERT INTO
    sellers (first_name, last_name, email)
VALUES (
        'Budi',
        'Ismawan',
        'budi007@gmail.com'
    ), (
        'Azkia',
        'Sururi',
        'kia007@gmail.com'
    ), (
        'Nara',
        'Husnina',
        'nara007@gmail.com'
    ), (
        'Fitron',
        'Ansori',
        'fitron007@gmail.com'
    ), (
        'Ardhan',
        'Alfiyan',
        'ardhan007@gmail.com'
    );

SELECT *
FROM sellers
WHERE
    first_name = 'Nara'
    AND last_name = 'Husnina';

ALTER TABLE sellers DROP INDEX name2;

SHOW TABLES;

DESCRIBE sellers;

SELECT * FROM sellers;

SHOW CREATE TABLE sellers;