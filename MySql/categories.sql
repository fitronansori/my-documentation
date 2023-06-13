CREATE TABLE
    category (
        id VARCHAR(10) NOT NULL,
        name VARCHAR(50) NOT NULL,
        PRIMARY KEY (id)
    ) ENGINE = InnoDB;

SELECT * FROM products;

-- Tambahkan FOREIGN KEY ke tabel products yang merujuk ke tabel category

ALTER TABLE products ADD COLUMN id_category VARCHAR(10);

-- Tambahkan CONSTRAINT FOREIGN KEY ke tabel products yang merujuk ke tabel category

ALTER TABLE products
ADD
    CONSTRAINT fk_products_category FOREIGN KEY (id_category) REFERENCES category (id);

INSERT INTO category (id, name)
VALUES ('C001', 'Makanan'), ('C002', 'Minuman'), ('C003', 'Lain-lain');

UPDATE products
SET id_category = 'C001'
WHERE
    id IN (
        'P0001',
        'P0002',
        'P0003',
        'P0004',
        'P0005',
        'P0006',
        'P0013',
        'P0014',
        'P0015',
        'P0016'
    );

UPDATE products
SET id_category = 'C002'
WHERE
    id IN (
        'P0007',
        'P0008',
        'P0009',
        'P0012'
    );

UPDATE products
SET id_category = 'C003'
WHERE id IN ('P0010', 'P0011');

SELECT
    products.id,
    products.name AS 'nama makanan',
    category.name AS 'Category'
FROM products
    JOIN category ON category.id = products.id_category;

SELECT * FROM products;

SELECT * FROM category;

DESCRIBE products;

DESCRIBE category;

SHOW CREATE TABLE products;