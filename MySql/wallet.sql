CREATE TABLE
    wallet (
        id INT NOT NULL AUTO_INCREMENT,
        id_customer INT NOT NULL,
        balance INT NOT NULL DEFAULT 0,
        PRIMARY KEY (id),
        UNIQUE KEY fk_id_customer_unique (id_customer),
        CONSTRAINT fk_wallet_customer FOREIGN KEY (id_customer) REFERENCES customers (id)
    ) ENGINE = InnoDB;

INSERT INTO
    wallet (id_customer, balance)
VALUES (1, 100000), (2, 200000), (3, 300000);

SELECT
    CONCAT(c.first_name, ' ', c.last_name) AS customer_name,
    wallet.balance
FROM wallet
    JOIN customers AS c ON wallet.id_customer = c.id;

SHOW TABLES;

DESCRIBE wallet;

SELECT * FROM wallet;

SELECT * FROM customers;

SHOW CREATE TABLE wallet;