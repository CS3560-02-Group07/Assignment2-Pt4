CREATE DATABASE SHIPSYS;
USE SHIPSYS;

CREATE TABLE IF NOT EXISTS Customer (
	customerID INT,
    f_name VARCHAR (15),
    l_name VARCHAR (15),
    phoneNumber VARCHAR(13),
    emailAddress VARCHAR(30),
    PRIMARY KEY (customerID)
);

CREATE TABLE IF NOT EXISTS Employee (
	employeeID INT, 
	empf_name VARCHAR (15),
	empl_name VARCHAR (15),
	empPhoneNo VARCHAR (13),
	empEmailAdd VARCHAR (30),
	PRIMARY KEY (employeeID)
);

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

CREATE TABLE IF NOT EXISTS Manufacturer (
	manufacturerID INT,
    manufacturerName VARCHAR(20),
    PRIMARY KEY (manufacturerID)
);

CREATE TABLE IF NOT EXISTS ShippingMethod (
	shipID INT,
    shipMethod VARCHAR(15),
    cost INT, 
    PRIMARY KEY (shipID)
);

CREATE TABLE IF NOT EXISTS Sale (
	orderNumber INT AUTO_INCREMENT,
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
    itemDescription VARCHAR (150),
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
	packageID INT AUTO_INCREMENT,
    orderNumber INT,
    trackingNumber INT,
    size INT,
    weight INT,
	PRIMARY KEY (packageID),
    FOREIGN KEY (orderNumber)
		REFERENCES Sale (orderNumber)
);

CREATE TABLE IF NOT EXISTS PickupLocation (
	warehouseID INT AUTO_INCREMENT,
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

INSERT INTO Customer VALUES (000405, 'John', 'Benson', '123-123-1234', 'JBenson@email.com'),
							(002002, 'Ellen', 'Gray', '839-232-9381', 'EllGray@email.com'),
                            (002003, 'Randy', 'Smith', '928-849-2847', 'RandySmith@email.com'),
                            (054004, 'Amy', 'Harris', '293-200-9000', 'AmyHarris@email.com'),
                            (000505, 'Jane', 'Rhodes', '909-394-8003', 'JaRhodes@email.com'),
                            (003006, 'Adam', 'James', '838-943-3902', 'AdamJames@email.com');

INSERT INTO CustomerAddress VALUES (000840, 000405, 'Isabelle Ave', 'Eugene', 'OR', '12345', 'United States'),
									(000120, 002002, 'Riverview Ct', 'Tacoma', 'WA', '54321', 'United States'),
                                    (000021, 002003, 'Country Club St', 'Sacramento', 'CA', '24315', 'United States'),
                                    (000087, 054004, 'Random St', 'Harrisburg', 'PA', '84135', 'United States'),
                                    (000077, 000505, 'Friday Ave', 'Fargo', 'ND', '56128', 'United States'),
                                    (004701, 003006, 'Purnell St', 'Ocean City', 'MD', '79951', 'United States');

INSERT INTO ShippingMethod VALUES (0, 'Overnight/Same Day', 12.50),
									(1, '2-Day', 9.50),
                                    (2, '4-Day', 6.50),
                                    (3, '5-7 Days', 1.00);

INSERT INTO Manufacturer VALUES ('100001', 'Sports Inc.'),
								('100002', 'Orange'),
                                ('100003', 'Out-N-In'),
                                ('100004', 'Average Value'),
                                ('100005', 'Slaugher House');

INSERT INTO ProductItem VALUES ('300001', 'Aqua Flask 32 oz', 'water bottle', 'Stainless steel, insulated, refillable, reusable 32 oz water bottle.', '100001', 'available'), 
								('300002', 'ePhone 20', 'smartphone', 'ePhone 20 is forged in titanium and features the groundbreaking O42 Pro chip, USB C, and the most powerful ePhone camera system ever.', '100002', 'available'),
                                ('300003', 'PacBook Oxygen', 'laptop', 'Supercharged by the next-gen N2 chip, the redesign combines incredible performance and up to 19 hours of battery life.', '100002', 'available'),
                                ('300004', 'Breeze Michaels', 'tennis shoes', 'The Breeze Michael remakes the classic sneaker, giving you a fresh look with a familiar feel.', '100001', 'available'),
                                ('300005', 'BBQ Grill', 'cookware', 'With smoker and charcoal grill, you can experience grilled and smoked meats at the same time.', '100003', 'available');
#Ignore these
ALTER TABLE customer 
ALTER customerID SET DEFAULT 1; 
ALTER TABLE customer AUTO_INCREMENT = 1
