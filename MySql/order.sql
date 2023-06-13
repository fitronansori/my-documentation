CREATE TABLE
    orders (
        id INT NOT NULL AUTO_INCREMENT,
        total INT NOT NULL,
        order_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
        PRIMARY KEY (id)
    );

INSERT INTO orders (total) VALUES (50000);

SELECT *
FROM orders
    JOIN orders_detail ON orders.id = orders_detail.id_order
    JOIN products ON orders_detail.id_product = products.id;

SELECT * FROM orders;

DESCRIBE orders;