CREATE DATABASE SHIPSYS;
USE SHIPSYS;

CREATE TABLE IF NOT EXISTS Customer (
	customerID INT,
    f_name VARCHAR (15),
    l_name VARCHAR (15),
    phoneNumber INT,
    emailAddress VARCHAR(30),
    PRIMARY KEY (customerID)
);

SELECT * FROM Customer;

CREATE TABLE IF NOT EXISTS CustomerAddress (
	addressID INT,
    customerID INT,
    street VARCHAR(20),
    city VARCHAR(20),
    state CHAR(2),
    zipcode INT,
    country VARCHAR(15),
    FOREIGN KEY (customerID)
		REFERENCES Customer (customerID),
	PRIMARY KEY (addressID)
);

SELECT * FROM CustomerAddress;

CREATE TABLE IF NOT EXISTS Manufacturer (
	manufacturerID INT,
    manufacturerName VARCHAR(20),
    PRIMARY KEY (manufacturerID)
);

CREATE TABLE IF NOT EXISTS ShippingMethod (
	shipID INT,
    shipMethod VARCHAR(15),
    PRIMARY KEY (shipID)
);

SELECT * FROM ShippingMethod;

CREATE TABLE IF NOT EXISTS Sale (
	orderNumber INT,
    customerID INT,
    shipID INT,
    saleDate DATE,
    saleTime TIME,
    tax FLOAT(5,2),
    shippingCost INT,
    itemTotal FLOAT(5,2),
    FOREIGN KEY (customerID)
		REFERENCES Customer (customerID),
	PRIMARY KEY (orderNumber),
    FOREIGN KEY (shipID)
		REFERENCES ShippingMethod (shipID)
);

CREATE TABLE IF NOT EXISTS ProductItem (
	itemID INT,
    itemName VARCHAR (50),
    itemType VARCHAR (30),
    itemDescription VARCHAR (50),
    manufacturerID INT,
    itemStatus VARCHAR (15),
    PRIMARY KEY (itemID),
    FOREIGN KEY (manufacturerID)
		REFERENCES Manufacturer (manufacturerID)
);

CREATE TABLE IF NOT EXISTS SaleLineItem (
	orderNumber INT,
    itemID INT,
    quantity INT,
    FOREIGN KEY (orderNumber)
		REFERENCES Sale (orderNumber),
	FOREIGN KEY (itemID)
		REFERENCES ProductItem (itemID),
	PRIMARY KEY (orderNumber, itemID)
);

CREATE TABLE IF NOT EXISTS Package (
	packageID INT,
    orderNumber INT,
    trackingNumber INT,
    size INT,
    weight INT,
	PRIMARY KEY (packageID),
    FOREIGN KEY (orderNumber)
		REFERENCES Sale (orderNumber)
);

CREATE TABLE IF NOT EXISTS PickupLocation (
	warehouseID INT,
    manufacturerID INT,
    PRIMARY KEY (warehouseID),
    street VARCHAR(20),
    city VARCHAR(20),
    state CHAR(2),
    zipcode INT,
    country VARCHAR(15),
    FOREIGN KEY (manufacturerID)
		REFERENCES Manufacturer (manufacturerID)
);

SELECT * FROM PickupLocation;