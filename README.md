# shop24Service
BK CHALLENGE 2 SHOP24SERVICE

This Restful Api was developed using spring boot with mvn config and MySQL for data storage.
To run this application, you will need to create a new schema in your MySQL database or any other database 
of your choice and execute below scripts to create required tables with respective seed data in each table.

After execution of below scripts you can use any IDE of your choice to run this application and paste this url 
"http://localhost:8080/swagger-ui/index.html" in your browser, with the help of Swagger you can test out all endpoints
of this Api.

#script to create order table
CREATE TABLE `order_details` (
`row_no` int NOT NULL PRIMARY KEY AUTO_INCREMENT,
`order_id` decimal NOT NULL,
`client_id` decimal NOT NULL,
`drink_id` decimal NOT NULL,
`quantity` decimal NOT NULL,
`drink_price` decimal NOT NULL,
`cargo_id` decimal NOT NULL,
`is_paid` BIT NOT NULL,
`is_complete` BIT NOT NULL,
`insert_date`     DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
`completed_date` datetime
);

#insert seed data into table order_details
INSERT INTO `shop24schema`.`order_details` (`order_id`, `client_id`, `drink_id`, `quantity`, `drink_price`, `cargo_id`,
`is_paid`, `is_complete`, `completed_date`)
VALUES (1, 1, 1, 12, 200, 1, 1, 1, now());
INSERT INTO `shop24schema`.`order_details` (`order_id`, `client_id`, `drink_id`, `quantity`, `drink_price`, `cargo_id`,
`is_paid`, `is_complete`, `completed_date`)
VALUES (1, 1, 2, 22, 150, 1, 1, 1, now());
INSERT INTO `shop24schema`.`order_details` (`order_id`, `client_id`, `drink_id`, `quantity`, `drink_price`, `cargo_id`,
`is_paid`, `is_complete`, `completed_date`)
VALUES (2, 2, 1, 12, 200, 2, 1, 1, now());
INSERT INTO `shop24schema`.`order_details` (`order_id`, `client_id`, `drink_id`, `quantity`, `drink_price`, `cargo_id`,
`is_paid`, `is_complete`, `completed_date`)
VALUES (3, 3, 2, 12, 200, 1, 1, 1, now());
INSERT INTO `shop24schema`.`order_details` (`order_id`, `client_id`, `drink_id`, `quantity`, `drink_price`, `cargo_id`,
`is_paid`, `is_complete`, `completed_date`)
VALUES (4, 4, 4, 12, 200, 2, 1, 1, now());
INSERT INTO `shop24schema`.`order_details` (`order_id`, `client_id`, `drink_id`, `quantity`, `drink_price`, `cargo_id`,
`is_paid`, `is_complete`, `completed_date`)
VALUES (4, 4, 3, 112, 100, 3, 1, 1, now());
INSERT INTO `shop24schema`.`order_details` (`order_id`, `client_id`, `drink_id`, `quantity`, `drink_price`, `cargo_id`,
`is_paid`, `is_complete`, `completed_date`)
VALUES (5, 5, 2, 20, 250, 1, 1, 1, now());

#script to create cargo table
CREATE TABLE `cargo_details` (
`cargo_id` int NOT NULL PRIMARY KEY AUTO_INCREMENT,
`cargo_name` varchar(250) NOT NULL,
`cargo_location` decimal NOT NULL,
`is_active` BIT NOT NULL,
`insert_date`     DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);

#insert seed data into table cargo_details
INSERT INTO `shop24schema`.`cargo_details` (`cargo_name`, `cargo_location`, `is_active`) VALUES ('cargo1', '1', 1);
INSERT INTO `shop24schema`.`cargo_details` (`cargo_name`, `cargo_location`, `is_active`) VALUES ('cargo2', '2', 1);
INSERT INTO `shop24schema`.`cargo_details` (`cargo_name`, `cargo_location`, `is_active`) VALUES ('cargo3', '3', 1);
INSERT INTO `shop24schema`.`cargo_details` (`cargo_name`, `cargo_location`, `is_active`) VALUES ('cargo4', '2', 1);
INSERT INTO `shop24schema`.`cargo_details` (`cargo_name`, `cargo_location`, `is_active`) VALUES ('cargo5', '4', 1);
INSERT INTO `shop24schema`.`cargo_details` (`cargo_name`, `cargo_location`, `is_active`) VALUES ('cargo6', '3', 1);
INSERT INTO `shop24schema`.`cargo_details` (`cargo_name`, `cargo_location`, `is_active`) VALUES ('cargo7', '1', 1);

#script to create client table
CREATE TABLE `client_details` (
`client_id` int NOT NULL PRIMARY KEY AUTO_INCREMENT,
`client_name` varchar(250) NOT NULL,
`client_mob_no` decimal NOT NULL,
`client_email` varchar(250) NOT NULL,
`client_location` decimal NOT NULL,
`client_type` decimal NOT NULL,
`insert_date`     DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);

#insert seed data into table client_details
INSERT INTO `shop24schema`.`client_details` (`client_name`, `client_mob_no`, `client_email`, `client_location`, `client_type`)
VALUES ('jean', '0745213658', 'xx@nm.com', 1, 2);
INSERT INTO `shop24schema`.`client_details` (`client_name`, `client_mob_no`, `client_email`, `client_location`, `client_type`)
VALUES ('jean1', '0745213423', 'xx@nm.com', 2, 1);
INSERT INTO `shop24schema`.`client_details` (`client_name`, `client_mob_no`, `client_email`, `client_location`, `client_type`)
VALUES ('jean2', '0745213630', 'xx@nm.com', 3, 2);
INSERT INTO `shop24schema`.`client_details` (`client_name`, `client_mob_no`, `client_email`, `client_location`, `client_type`)
VALUES ('jean3', '0745213653', 'xx@nm.com', 4, 1);
INSERT INTO `shop24schema`.`client_details` (`client_name`, `client_mob_no`, `client_email`, `client_location`, `client_type`)
VALUES ('jean4', '0745213356', 'xx@nm.com', 1, 1);
INSERT INTO `shop24schema`.`client_details` (`client_name`, `client_mob_no`, `client_email`, `client_location`, `client_type`)
VALUES ('jean5', '0745213023', 'xx@nm.com', 2, 2);
INSERT INTO `shop24schema`.`client_details` (`client_name`, `client_mob_no`, `client_email`, `client_location`, `client_type`)
VALUES ('jean6', '0745213230', 'xx@nm.com', 3, 1);

#script to create drinks table
CREATE TABLE `drinks_details` (
`drink_id` int NOT NULL PRIMARY KEY AUTO_INCREMENT,
`drink_name` varchar(250) NOT NULL,
`drink_price` decimal NOT NULL,
`is_in_stock` bit NOT NULL,
`fk_cargo_id` int NOT NULL,
`quantity` decimal NOT NULL,
`insert_date`     DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);

#insert seed data into table drinks_details
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('orange', '200', 1, 1, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('citron', '200', 1, 1, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('orange', '200', 1, 2, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('citron', '200', 1, 2, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('coke', '200', 1, 3, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('sprite', '200', 1, 3, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('coffee', '200', 1, 4, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('orange', '200', 1, 4, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('coke', '200', 1, 5, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('citron', '200', 1, 5, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('orange', '200', 1, 6, 100);

#orderId sequence table holder
CREATE TABLE IF NOT EXISTS `order_id` (
`order_id` int unsigned NOT NULL,
`app_id` int NOT NULL
);

#insert seed data into table order_id
INSERT INTO `order_id` (`order_id`, `app_id`) VALUES (5000, 1);
#create procedure to retrieve and increement order_id
DELIMITER &&  
CREATE PROCEDURE getOrder_id (OUT order_id1 INTEGER)
BEGIN
SELECT order_id into order_id1 from order_id;
update order_id set order_id = order_id1 + 1;
END&&  
DELIMITER

#script to create location_mas table
CREATE TABLE IF NOT EXISTS `location_mas` (
`location_id` int NOT NULL PRIMARY KEY AUTO_INCREMENT,
`location_name` varchar(250) NOT NULL
);

#insert seed data into table location_mas
INSERT INTO `location_mas` (`location_id`, `location_name`) VALUES (1, 'Remera');
INSERT INTO `location_mas` (`location_id`, `location_name`) VALUES (2, 'Rwezamenyo');
INSERT INTO `location_mas` (`location_id`, `location_name`) VALUES (3, 'Kicukiro');
INSERT INTO `location_mas` (`location_id`, `location_name`) VALUES (4, 'Gahanga');

#script to create client_type_mas table
CREATE TABLE IF NOT EXISTS `client_type_mas` (
`client_type` int NOT NULL PRIMARY KEY AUTO_INCREMENT,
`client_type_desc` varchar(250) NOT NULL
);

#insert seed data into table client_type_mas
INSERT INTO `client_type_mas` (`client_type`, `client_type_desc`) VALUES (1, 'Retailer');
INSERT INTO `client_type_mas` (`client_type`, `client_type_desc`) VALUES (2, 'Hotel');
CREATE TABLES USING BELOW SCRIPTS IN MYSQL

#script to create order table
CREATE TABLE `order_details` (
`row_no` int NOT NULL PRIMARY KEY AUTO_INCREMENT,
`order_id` decimal NOT NULL,
`client_id` decimal NOT NULL,
`drink_id` decimal NOT NULL,
`quantity` decimal NOT NULL,
`drink_price` decimal NOT NULL,
`cargo_id` decimal NOT NULL,
`is_paid` BIT NOT NULL,
`is_complete` BIT NOT NULL,
`insert_date`     DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
`completed_date` datetime
);

#insert seed data into table order_details
INSERT INTO `shop24schema`.`order_details` (`order_id`, `client_id`, `drink_id`, `quantity`, `drink_price`, `cargo_id`,
`is_paid`, `is_complete`, `completed_date`)
VALUES (1, 1, 1, 12, 200, 1, 1, 1, now());
INSERT INTO `shop24schema`.`order_details` (`order_id`, `client_id`, `drink_id`, `quantity`, `drink_price`, `cargo_id`,
`is_paid`, `is_complete`, `completed_date`)
VALUES (1, 1, 2, 22, 150, 1, 1, 1, now());
INSERT INTO `shop24schema`.`order_details` (`order_id`, `client_id`, `drink_id`, `quantity`, `drink_price`, `cargo_id`,
`is_paid`, `is_complete`, `completed_date`)
VALUES (2, 2, 1, 12, 200, 2, 1, 1, now());
INSERT INTO `shop24schema`.`order_details` (`order_id`, `client_id`, `drink_id`, `quantity`, `drink_price`, `cargo_id`,
`is_paid`, `is_complete`, `completed_date`)
VALUES (3, 3, 2, 12, 200, 1, 1, 1, now());
INSERT INTO `shop24schema`.`order_details` (`order_id`, `client_id`, `drink_id`, `quantity`, `drink_price`, `cargo_id`,
`is_paid`, `is_complete`, `completed_date`)
VALUES (4, 4, 4, 12, 200, 2, 1, 1, now());
INSERT INTO `shop24schema`.`order_details` (`order_id`, `client_id`, `drink_id`, `quantity`, `drink_price`, `cargo_id`,
`is_paid`, `is_complete`, `completed_date`)
VALUES (4, 4, 3, 112, 100, 3, 1, 1, now());
INSERT INTO `shop24schema`.`order_details` (`order_id`, `client_id`, `drink_id`, `quantity`, `drink_price`, `cargo_id`,
`is_paid`, `is_complete`, `completed_date`)
VALUES (5, 5, 2, 20, 250, 1, 1, 1, now());

#script to create cargo table
CREATE TABLE `cargo_details` (
`cargo_id` int NOT NULL PRIMARY KEY AUTO_INCREMENT,
`cargo_name` varchar(250) NOT NULL,
`cargo_location` decimal NOT NULL,
`is_active` BIT NOT NULL,
`insert_date`     DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);

#insert seed data into table cargo_details
INSERT INTO `shop24schema`.`cargo_details` (`cargo_name`, `cargo_location`, `is_active`) VALUES ('cargo1', '1', 1);
INSERT INTO `shop24schema`.`cargo_details` (`cargo_name`, `cargo_location`, `is_active`) VALUES ('cargo2', '2', 1);
INSERT INTO `shop24schema`.`cargo_details` (`cargo_name`, `cargo_location`, `is_active`) VALUES ('cargo3', '3', 1);
INSERT INTO `shop24schema`.`cargo_details` (`cargo_name`, `cargo_location`, `is_active`) VALUES ('cargo4', '2', 1);
INSERT INTO `shop24schema`.`cargo_details` (`cargo_name`, `cargo_location`, `is_active`) VALUES ('cargo5', '4', 1);
INSERT INTO `shop24schema`.`cargo_details` (`cargo_name`, `cargo_location`, `is_active`) VALUES ('cargo6', '3', 1);
INSERT INTO `shop24schema`.`cargo_details` (`cargo_name`, `cargo_location`, `is_active`) VALUES ('cargo7', '1', 1);

#script to create client table
CREATE TABLE `client_details` (
`client_id` int NOT NULL PRIMARY KEY AUTO_INCREMENT,
`client_name` varchar(250) NOT NULL,
`client_mob_no` decimal NOT NULL,
`client_email` varchar(250) NOT NULL,
`client_location` decimal NOT NULL,
`client_type` decimal NOT NULL,
`insert_date`     DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);

#insert seed data into table client_details
INSERT INTO `shop24schema`.`client_details` (`client_name`, `client_mob_no`, `client_email`, `client_location`, `client_type`)
VALUES ('jean', '0745213658', 'xx@nm.com', 1, 2);
INSERT INTO `shop24schema`.`client_details` (`client_name`, `client_mob_no`, `client_email`, `client_location`, `client_type`)
VALUES ('jean1', '0745213423', 'xx@nm.com', 2, 1);
INSERT INTO `shop24schema`.`client_details` (`client_name`, `client_mob_no`, `client_email`, `client_location`, `client_type`)
VALUES ('jean2', '0745213630', 'xx@nm.com', 3, 2);
INSERT INTO `shop24schema`.`client_details` (`client_name`, `client_mob_no`, `client_email`, `client_location`, `client_type`)
VALUES ('jean3', '0745213653', 'xx@nm.com', 4, 1);
INSERT INTO `shop24schema`.`client_details` (`client_name`, `client_mob_no`, `client_email`, `client_location`, `client_type`)
VALUES ('jean4', '0745213356', 'xx@nm.com', 1, 1);
INSERT INTO `shop24schema`.`client_details` (`client_name`, `client_mob_no`, `client_email`, `client_location`, `client_type`)
VALUES ('jean5', '0745213023', 'xx@nm.com', 2, 2);
INSERT INTO `shop24schema`.`client_details` (`client_name`, `client_mob_no`, `client_email`, `client_location`, `client_type`)
VALUES ('jean6', '0745213230', 'xx@nm.com', 3, 1);

#script to create drinks table
CREATE TABLE `drinks_details` (
`drink_id` int NOT NULL PRIMARY KEY AUTO_INCREMENT,
`drink_name` varchar(250) NOT NULL,
`drink_price` decimal NOT NULL,
`is_in_stock` bit NOT NULL,
`fk_cargo_id` int NOT NULL,
`quantity` decimal NOT NULL,
`insert_date`     DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);

#insert seed data into table drinks_details
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('orange', '200', 1, 1, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('citron', '200', 1, 1, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('orange', '200', 1, 2, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('citron', '200', 1, 2, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('coke', '200', 1, 3, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('sprite', '200', 1, 3, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('coffee', '200', 1, 4, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('orange', '200', 1, 4, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('coke', '200', 1, 5, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('citron', '200', 1, 5, 100);
INSERT INTO `shop24schema`.`drinks_details` (`drink_name`, `drink_price`, `is_in_stock`, `fk_cargo_id`, `quantity`)
VALUES ('orange', '200', 1, 6, 100);

#orderId sequence table holder
CREATE TABLE IF NOT EXISTS `order_id` (
`order_id` int unsigned NOT NULL,
`app_id` int NOT NULL
);

#insert seed data into table order_id
INSERT INTO `order_id` (`order_id`, `app_id`) VALUES (5000, 1);
#create procedure to retrieve and increement order_id
DELIMITER &&  
CREATE PROCEDURE getOrder_id (OUT order_id1 INTEGER)
BEGIN
SELECT order_id into order_id1 from order_id;
update order_id set order_id = order_id1 + 1;
END&&  
DELIMITER

#script to create location_mas table
CREATE TABLE IF NOT EXISTS `location_mas` (
`location_id` int NOT NULL PRIMARY KEY AUTO_INCREMENT,
`location_name` varchar(250) NOT NULL
);

#insert seed data into table location_mas
INSERT INTO `location_mas` (`location_id`, `location_name`) VALUES (1, 'Remera');
INSERT INTO `location_mas` (`location_id`, `location_name`) VALUES (2, 'Rwezamenyo');
INSERT INTO `location_mas` (`location_id`, `location_name`) VALUES (3, 'Kicukiro');
INSERT INTO `location_mas` (`location_id`, `location_name`) VALUES (4, 'Gahanga');

#script to create client_type_mas table
CREATE TABLE IF NOT EXISTS `client_type_mas` (
`client_type` int NOT NULL PRIMARY KEY AUTO_INCREMENT,
`client_type_desc` varchar(250) NOT NULL
);

#insert seed data into table client_type_mas
INSERT INTO `client_type_mas` (`client_type`, `client_type_desc`) VALUES (1, 'Retailer');
INSERT INTO `client_type_mas` (`client_type`, `client_type_desc`) VALUES (2, 'Hotel');