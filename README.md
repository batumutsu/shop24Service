# shop24Service
BK CHALLENGE 2 SHOP24SERVICE
CREATE TABLES USING BELOW SCRIPTS IN MYSQL

#script to create order table
create table `order_details` (
  `row_no` int not null primary key auto_increment,
  `order_id` decimal not null,
  `client_id` decimal not null,
  `drink_id` decimal not null,
  `cargo_id` decimal not null,
  `drink_price` decimal not null,
  `is_paid` bit not null,
  `is_complete` bit not null,
  `insert_date` datetime not null,
  `completed_date` datetime
);

#script to create cargo table
create table `cargo_details` (
  `cargo_id` int not null primary key auto_increment,
  `cargo_name` decimal not null,
  `cargo_location` decimal not null,
  `is_active` bit not null,
  `insert_date` datetime not null
);

#script to create client table
create table `client_details` (
  `client_id` int not null primary key auto_increment,
  `client_name` varchar(250) not null,
  `client_mob_no` decimal not null,
  `client_email` varchar(250) not null,
  `client_location` decimal not null,
  `client_type` decimal not null,
  `insert_date` datetime not null
);

#script to create drinks table
create table `drinks_details` (
  `drink_id` int not null primary key auto_increment,
  `drink_name` varchar(250) not null,
  `drink_price` decimal not null,
  `is_in_stock` bit not null,
  `insert_date` datetime not null
);
