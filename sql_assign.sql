use test;

CREATE TABLE Item (
    item_id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    weight varchar(255),
    price DECIMAL(10, 2) NOT NULL
);
INSERT INTO Item (item_id, name, description, weight, price) VALUES
(1, 'Apple', 'A fresh, juicy red apple.', '150g', 0.5),
(2, 'Banana', 'A ripe, sweet banana.', '120g', 0.3),
(3, 'Carrot', 'A crunchy, organic carrot.', '200g',  0.4),
(4, 'Steak', 'A tender, grass-fed beef steak.', '500g', 15.0),
(5, 'Salmon Fillet', 'A fresh, wild-caught salmon fillet.', '300g', 12.0),
(6, 'Broccoli', 'A head of organic broccoli.', '250g',  1.2),
(7, 'Almonds', 'A pack of raw, unsalted almonds.', '100g', 3.0),
(8, 'Yogurt', 'A cup of creamy, Greek yogurt', '200g', 1.5),
(9, 'Whole Wheat Bread', 'A loaf of freshly baked whole wheat bread.', '400g',  2.5),
(10, 'Cheddar Cheese', 'A block of aged cheddar cheese.', '250g',  5.0);


CREATE TABLE Customer (
    customer_id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age int(30),
    email VARCHAR(255) NOT NULL UNIQUE);
INSERT INTO Customer (customer_id, name, age, email) VALUES
(1, 'Alice Johnson', '28','alice.johnson@gmail.com'),
(2, 'Bob Smith', '35','bob.smith@gmail.com'),
(3, 'Charlie Brown', '22','charlie.brown@gmail.com'),
(4, 'Daisy Millern', '30','daisy.miller@gmail.com'),
(5, 'Edward Davis', '40','edward.davis@gmail.com'),
(6, 'Fiona Green', '27','fiona.green@gmail.com'),
(7, 'George White', '33','george.white@gmail.com'),
(8, 'Hannah Lewis', '26','hannah.lewis@gmail.com'),
(9, 'Ian Clark', '29','ian.clark@gmail.com'),
(10, 'Jessica Young', '32','jessica.young@gmail.com');

CREATE TABLE OrderTable (
    order_id INT PRIMARY KEY,
    customer_id INT,
    item_id INT,
    quantity INT NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    order_date DATE NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES Customer(customer_id),
    FOREIGN KEY (item_id) REFERENCES Item(item_id)
);
INSERT INTO OrderTable (order_id, customer_id, item_id, quantity, amount, order_date) VALUES
(1, 1, 3, 2, 0.8, '2024-01-05'),
(2, 1, 5, 1, 12.0, '2024-01-10'),
(3, 1, 7, 3, 9.0, '2024-01-20'),
(4, 2, 2, 4, 1.2, '2024-02-01'),
(5, 2, 4, 2, 30.0, '2024-02-14'),
(6, 2, 9, 1, 2.5, '2024-02-20'),
(7, 1, 3, 2, 2.5, '2024-03-05'),
(8, 1, 5, 1, 12.0, '2024-03-15'),
(9, 1, 7, 3, 9.0, '2024-03-28'),
(10, 1, 7, 3, 9.0, '2024-01-15'),
(6, 2, 9, 1, 2.5, '2024-02-05'),
(7, 1, 3, 2, 0.8, '2024-01-25'),
(8, 1, 5, 1, 12.0, '2024-02-18'),
(9, 1, 7, 3, 9.0, '2024-03-10'),
(10, 9, 2, 2, 0.6, '2024-03-25');

select * from item;
select * from Customer;

SELECT item_id, SUM(quantity) AS total_quantity
FROM OrderTable
GROUP BY item_id
ORDER BY total_quantity DESC
LIMIT 1;



SELECT customer_id, COUNT(order_id) AS total_orders
FROM OrderTable
WHERE MONTH(order_date) = 7 AND YEAR(order_date) = 2023
GROUP BY customer_id
ORDER BY total_orders DESC
LIMIT 1;

SELECT COUNT(order_id) AS total_orders
FROM OrderTable
WHERE MONTH(order_date) = 7 AND YEAR(order_date) = 2023;
