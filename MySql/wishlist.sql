CREATE TABLE
    wishlist (
        id INT NOT NULL AUTO_INCREMENT,
        id_product VARCHAR(50) NOT NULL,
        description TEXT,
        PRIMARY KEY (id),
        CONSTRAINT fk_wishlist_product FOREIGN KEY (id_product) REFERENCES products (id)
    ) ENGINE = InnoDB;

INSERT INTO
    wishlist (id_product, description)
VALUES ('P0001', "Makanan Kesukaan");

ALTER TABLE wishlist DROP FOREIGN KEY fk_wishlist_product;

ALTER TABLE wishlist
ADD
    CONSTRAINT fk_wishlist_product FOREIGN KEY (id_product) REFERENCES products (id) ON DELETE CASCADE ON UPDATE CASCADE;

-- mksud dari ON DELETE CASCADE ON UPDATE CASCADE adalah ketika data di tabel products dihapus atau diupdate, maka data di tabel wishlist juga akan terhapus atau terupdate

INSERT INTO
    wishlist (id_product, description)
VALUES ('P0017', 'Makanan Kesukaan');

DELETE FROM products WHERE id = 'P0017';

-- ketika data di tabel products dihapus, maka data di tabel wishlist juga akan terhapus

SELECT *
FROM wishlist
    JOIN products ON wishlist.id_product = products.id;

SELECT
    wishlist.id,
    wishlist.id_product,
    wishlist.description,
    products.name,
    products.price
FROM wishlist
    JOIN products ON wishlist.id_product = products.id;

SELECT
    w.id AS id_wishlist,
    w.id_product AS id_product,
    w.description,
    p.name AS name_product,
    p.price AS price_product
FROM wishlist AS w
    JOIN products AS p ON w.id_product = p.id;

ALTER TABLE wishlist ADD COLUMN id_customer INT;

ALTER TABLE wishlist
ADD
    CONSTRAINT fk_wishlist_customer FOREIGN KEY (id_customer) REFERENCES customers (id) ON DELETE CASCADE ON UPDATE CASCADE;

UPDATE wishlist SET id_customer = 2 WHERE id = 2;

SELECT
    c.email,
    p.id,
    p.name,
    p.price,
    w.description
FROM wishlist AS w
    JOIN products AS p ON w.id_product = p.id
    JOIN customers AS c ON w.id_customer = c.id;

SHOW TABLES;

DESCRIBE wishlist;

SELECT * FROM wishlist;

SELECT * FROM customers;

SHOW CREATE TABLE wishlist;