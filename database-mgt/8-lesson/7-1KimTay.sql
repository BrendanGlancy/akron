-- CUSTOMER table contains the following columns:
-- CUST_ID, FIRST_NAME, LAST_NAME, ADDRESS, CITY, STATE, POSTAL, PHONE, EMAIL, BALANCE, CREDIT_LIMIT, REP_ID

-- INVOICES table contains the following columns:
-- INVOICE_NUM, INVOICE_DATE, CUST_ID

-- INVOICE_LINE table contains the following columns:
-- INVOICE_NUM, ITEM_ID, QUANTITY, QUOTED_PRICE

-- ITEM table contains the following columns:
-- ITEM_ID, DESCRIPTION, ON_HAND, CATEGORY, LOCATION, PRICE

-- SALES_REP table contains the following columns:
-- REP_ID, FIRST_NAME, LAST_NAME, ADDRESS, CITY, STATE, POSTAL, CELL_PHONE, COMMISSION, RATE

-- Create a NONCAT table with the following columns:
-- ITEM_ID (char (4) primary key), DESCRIPTION (char (30)), ON_HAND (int), CATEGORY (char (3)),  PRICE (decimal (5,2))

-- Create a VIEW named MAJOR_CUSTOMER. It consists of the customer ID, first name, last name, balance, credit limit, and rep ID for every customer whose credit limit is $500 or less
Create VIEW MAJOR_CUSTOMER AS
SELECT CUST_ID, FIRST_NAME, LAST_NAME, BALANCE, CREDIT_LIMIT, REP_ID
FROM CUSTOMER
WHERE CREDIT_LIMIT <= 500;

-- Write and execute the comamand to retrieve the customer ID, first name, last name of each customer in the MAJOR_CUSTOMER VIEW with a balance that exceeds the credit limit
SELECT CUST_ID, FIRST_NAME, LAST_NAME FROM MAJOR_CUSTOMER
WHERE BALANCE > CREDIT_LIMIT;

-- Without using the MAJOR_CUSTOMER VIEW, write and execute the command to retrieve the customer ID, first name, last name of each customer in the CUSTOMER table for every customer whose credit limit is $500 or less
SELECT CUST_ID, FIRST_NAME, LAST_NAME FROM CUSTOMER
WHERE CREDIT_LIMIT <= 500;

-- Create a VIEW named ITEM_INVOICE. It consists of the item ID, description, price, invoice number, invoice date, quantity, and quoted price for all invoice lines currently on file.
-- Join the ITEM table with the INVOICES table using the ITEM_ID column.
-- Join the INVOICE_LINE table with the INVOICES table using the INVOICE_NUM column.
Create VIEW ITEM_INVOICE AS
SELECT ITEM.ITEM_ID, ITEM.DESCRIPTION, ITEM.PRICE, INVOICES.INVOICE_NUM, INVOICES.INVOICE_DATE, INVOICE_LINE.QUANTITY, INVOICE_LINE.QUOTED_PRICE
FROM ITEM
JOIN INVOICE_LINE ON ITEM.ITEM_ID = INVOICE_LINE.ITEM_ID
JOIN INVOICES ON INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM;

-- write and execute the command to retrieve the item ID, description, invoice number, and quotes price for all invoices in the ITEM_INVOICE VIEW for items with a quoted price that exceeds $100
SELECT ITEM_ID, DESCRIPTION, INVOICE_NUM, QUOTED_PRICE FROM ITEM_INVOICE
WHERE QUOTED_PRICE > 100;

-- repeat the previous query without using the ITEM_INVOICE VIEW
-- quoted_price > 100
SELECT ITEM.ITEM_ID, ITEM.DESCRIPTION, ITEM.PRICE, INVOICES.INVOICE_NUM, INVOICES.INVOICE_DATE, INVOICE_LINE.QUANTITY, INVOICE_LINE.QUOTED_PRICE
FROM ITEM
JOIN INVOICE_LINE ON ITEM.ITEM_ID = INVOICE_LINE.ITEM_ID
JOIN INVOICES ON INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM
WHERE QUOTED_PRICE > 100;

-- Create a view named INVOICE_TOTAL. It consists of the invoice number and invoice total for each invoice currently on file. (The invoice total is the sum of the number of units ordered multiplied by the quoted price on each invoice line for each invoice.) Sort the rows by invoice number. Use TOTAL_AMOUNT as the name for the invoice total.
Create VIEW INVOICE_TOTAL AS
SELECT INVOICES.INVOICE_NUM, SUM(INVOICE_LINE.QUANTITY * INVOICE_LINE.QUOTED_PRICE) AS TOTAL_AMOUNT
FROM INVOICE_LINE
JOIN INVOICES ON INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM
GROUP BY INVOICES.INVOICE_NUM;

--  Using the INVOICE_TOTAL VIEW write and execute the command to retrieve the invoice number and invoice total for only those orders totaling more than $250.
SELECT INVOICE_NUM, TOTAL_AMOUNT FROM INVOICE_TOTAL
WHERE TOTAL_AMOUNT > 250;

-- Repeat the previous query without using the INVOICE_TOTAL VIEW
SELECT INVOICES.INVOICE_NUM, SUM(INVOICE_LINE.QUANTITY * INVOICE_LINE.QUOTED_PRICE) AS TOTAL_AMOUNT FROM INVOICE_LINE
JOIN INVOICES ON INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM
GROUP BY INVOICES.INVOICE_NUM having TOTAL_AMOUNT > 250;

-- List all the tables contained within the system catalog, but only display the first 10 records with a TABLE_TYPE of SYSTEM VIEW
SELECT * FROM INFORMATION_SCHEMA.TABLES
WHERE TABLE_TYPE = 'SYSTEM VIEW'
LIMIT 10;

-- List all the columns contained within the system catalog, but only display the first 11 records that are in the KimTay TABLE_SCHEMA
SELECT * FROM INFORMATION_SCHEMA.COLUMNS
WHERE TABLE_SCHEMA = 'KimTay'
LIMIT 11;

-- List all the views contained within the system catalog, but only display the first 12 records.
-- Dont return any null values
SELECT * FROM INFORMATION_SCHEMA.VIEWS
LIMIT 12;


-- Write the command to display only tables within the system catalog that are of the type BASE TABLE. Display only the following columns: TABLE_SCHEMA, TABLE_NAME, TABLE_TYPE.
SELECT TABLE_SCHEMA, TABLE_NAME, TABLE_TYPE FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'KimTay' AND TABLE_TYPE = 'BASE TABLE';

-- Create an index named ITEM_INDEX1 on the ITEM_ID column in the INVOICE_LINE table.
CREATE INDEX ITEM_INDEX1 ON INVOICE_LINE (ITEM_ID);

-- Create an index named ITEM_INDEX2 on the CATEGORY column in the ITEM table.
CREATE INDEX ITEM_INDEX2 ON ITEM (CATEGORY);

-- Create an index named ITEM_INDEX3 on the CATEGORY and LOCATION columns in the ITEM table.
CREATE INDEX ITEM_INDEX3 ON ITEM (CATEGORY, LOCATION);

-- Create an index named ITEM_INDEX4 on the CATEGORY and LOCATION columns in the ITEM table. List categories in descending order.
ALTER TABLE ITEM ADD INDEX ITEM_INDEX4 (CATEGORY DESC, LOCATION);

-- Delete the index ITEM_INDEX3 from the ITEM table.
DROP INDEX ITEM_INDEX3 ON ITEM;

-- List every table that you have created thus far. Display the TABLE_SCHEMA and TABLE_NAME columns.
SELECT TABLE_SCHEMA, TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
WHERE TABLE_SCHEMA="KimTay";

-- List every column in the ITEM table and its associated data type.
SELECT COLUMN_NAME, DATA_TYPE FROM INFORMATION_SCHEMA.COLUMNS
WHERE TABLE_NAME = 'ITEM';

-- Alter the INVOICE_LINE table by adding the INVOICE_NUM column as a foreign key referencing the INVOICE_NUM column in the INVOICES table.
ALTER TABLE INVOICE_LINE ADD CONSTRAINT INVOICE_LINE_ibfk_1 FOREIGN KEY (INVOICE_NUM) REFERENCES INVOICES (INVOICE_NUM);

-- Alter the table back to its original state.
ALTER TABLE INVOICE_LINE DROP CONSTRAINT FK_INVOICE_LINE_INVOICE_NUM;
