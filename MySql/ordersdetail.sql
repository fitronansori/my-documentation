CREATE TABLE
    orders_detail (
        id_product VARCHAR(10) NOT NULL,
        id_order INT NOT NULL,
        price INT NOT NULL,
        quantity INT NOT NULL,
        PRIMARY KEY (id_product, id_order)
    ) ENGINE = InnoDB;

DROP TABLE orders_detail;

ALTER TABLE orders_detail
ADD
    CONSTRAINT fk_orders_detail_product FOREIGN KEY (id_product) REFERENCES products (id);

ALTER TABLE orders_detail
ADD
    CONSTRAINT fk_orders_detail_orders FOREIGN KEY (id_order) REFERENCES orders (id);

INSERT INTO
    orders_detail (
        id_product,
        id_order,
        price,
        quantity
    )
VALUES ('P0001', 1, 10000, 2), ('P0002', 1, 20000, 1), ('P0003', 1, 20000, 1);

INSERT INTO
    orders_detail (
        id_product,
        id_order,
        price,
        quantity
    )
VALUES ('P0001', 2, 10000, 2), ('P0002', 2, 20000, 1), ('P0003', 2, 20000, 1);

DESCRIBE orders_detail;

SELECT * FROM orders_detail;

SHOW CREATE TABLE orders_detail;