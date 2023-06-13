use belajar_mysql;

SELECT * FROM products ORDER BY price LIMIT 5;

SELECT
    id,
    CASE category
        WHEN 'Makanan' THEN 'Enak'
        WHEN 'Minuman' THEN 'Segar'
        ELSE 'Tidak diketahui'
    END AS category
FROM products;

SELECT
    id,
    price,
    IF (
        price <= 15000,
        'Murah',
        IF (
            price <= 20000,
            'Mahal',
            'Sangat Mahal'
        )
    ) AS price_category
FROM products;

SELECT COUNT(id), category
FROM products
GROUP BY category
HAVING COUNT(id) > 5;

SELECT COUNT(id), category FROM products GROUP BY category;

SELECT MAX(price), category FROM products GROUP BY category;

SELECT MIN(price), category FROM products GROUP BY category;

SELECT AVG(price), category FROM products GROUP BY category;

SELECT SUM(price), category FROM products GROUP BY category;

ALTER TABLE products
ADD
    CONSTRAINT price_check CHECK (price >= 1000);

INSERT INTO
    products (
        id,
        name,
        category,
        price,
        quantity
    )
VALUES (
        'P0016',
        'Indomie',
        'Makanan',
        2500,
        100
    );

ALTER TABLE products ADD FULLTEXT product_search (name, description);

SELECT *
FROM products
WHERE
    name LIKE '%ayam%'
    AND description LIKE '%Ayam%';

SELECT *
FROM products
WHERE
    MATCH (name, description) AGAINST ('ayam' IN NATURAL LANGUAGE MODE);

SELECT *
FROM products
WHERE
    MATCH (name, description) AGAINST ('+ayam -bakso' IN BOOLEAN MODE);

SELECT *
FROM products
WHERE
    MATCH (name, description) AGAINST (
        'bakso'
        WITH QUERY EXPANSION
    );

INSERT INTO
    products (
        id,
        name,
        category,
        price,
        quantity
    )
VALUES (
        'P0017',
        'Bakso',
        'Makanan',
        10000,
        100
    );

ALTER TABLE products DROP category;

ALTER TABLE products ADD COLUMN id_category VARCHAR(10) NOT NULL;

DESCRIBE products;

SELECT * FROM products;

ALTER TABLE products
ADD COLUMN id_category
SELECT
    id,
    name,
    price,
    quantity
FROM products
WHERE quantity = 0;

SHOW tables;

SHOW CREATE TABLE products;