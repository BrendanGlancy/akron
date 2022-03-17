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


