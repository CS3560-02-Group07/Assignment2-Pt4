CREATE DATABASE `cs3560_shippingsubsystem`;

CREATE TABLE `carrier` (
  `Carrier_ID` int NOT NULL,
  `Carrier_Name` varchar(45) NOT NULL,
  `Carrier_Phone` varchar(45) NOT NULL,
  `Carrier_Email` varchar(45) NOT NULL,
  PRIMARY KEY (`Carrier_ID`)
);

CREATE TABLE `productitems` (
  `Product_ID` int NOT NULL,
  `Product_Name` varchar(45) NOT NULL,
  `Product Type` varchar(45) NOT NULL,
  `Product_Price` double(8,2) NOT NULL,
  `Product_Quantity` int NOT NULL,
  `Product_Description` varchar(150) DEFAULT NULL,
  `Manufacturter` varchar(45) NOT NULL,
  `Supplier` varchar(45) NOT NULL,
  PRIMARY KEY (`Product_ID`)
);

INSERT INTO carrier Values ('600001', 'SPS', '111-111-1111', 'sps-cs@sps.com'),
							('600002', 'UniEX', '222-222-2222', 'express-cs@union.com');

INSERT INTO productitems Values ('100001', '32 oz Big Mouth', 'water bottle', '29.99', '200', 'Stainless steel, insulated, refillable, reusable 32 oz water bottle.', 'Aqua Flask', 'Hydration Inc.'), 
								('100002', 'ePhone 20', 'smartphone', '999.99', '100', 'ePhone 20 is forged in titanium and features the groundbreaking O42 Pro chip, USB C, and the most powerful ePhone camera system ever.', 'Orange', 'Orange');