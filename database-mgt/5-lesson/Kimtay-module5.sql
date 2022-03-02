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

-- For each invoice, list the number and invoice date along with the CUST_ID, FIRST_NAME and LAST_NAME of the customer for which the invoice was created
-- Join the CUSTOMER table to the INVOICES table to get the customer ID and the invoice number
SELECT INVOICE_NUM, INVOICE_DATE, INVOICES.CUST_ID, FIRST_NAME, LAST_NAME FROM CUSTOMER JOIN INVOICES ON CUSTOMER.CUST_ID = INVOICES.CUST_ID

-- For each invoice placed on November 15, 2021, list the number along with the ID, FIRST_NAME and LAST_NAME of the customer which the invoice was created.
-- Join the CUSTOMER table to the INVOICES table to get the customer ID and the invoice number
-- Date is in the format YYYY-MM-DD
SELECT INVOICE_NUM, CUSTOMER.CUST_ID, FIRST_NAME, LAST_NAME FROM CUSTOMER JOIN INVOICES ON CUSTOMER.CUST_ID = INVOICES.CUST_ID WHERE INVOICE_DATE = '2021-11-15'

-- For each invoice, list the invoice number, invoice date, ITEM_ID, quantity ordered, and quoted price for each invoice line that makes up the invoice
-- Join the INVOICE_LINE table to the INVOICES table to get the invoice number and the invoice number
-- Join the ITEM table to the INVOICE_LINE table to get the item ID and the invoice number
SELECT INVOICES.INVOICE_NUM, INVOICE_DATE, INVOICE_LINE.ITEM_ID, QUANTITY, QUOTED_PRICE FROM INVOICE_LINE JOIN INVOICES ON INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM JOIN ITEM ON INVOICE_LINE.ID = ITEM.ITEM_ID

-- Use the IN operator to find the ID, FIRST_NAME, LAST_NAME of each customer for which an invoice was created on November 15, 2021
-- Join the CUSTOMER table to the INVOICES table to get the customer ID and the invoice number
-- Date is in the format YYYY-MM-DD
SELECT CUSTOMER.CUST_ID, FIRST_NAME, LAST_NAME FROM CUSTOMER JOIN INVOICES ON CUSTOMER.CUST_ID = INVOICES.CUST_ID WHERE INVOICE_DATE = '2021-11-15'

-- Repeat the last query, but this time use the EXISTS operator
-- Join the CUSTOMER table to the INVOICES table to get the customer ID and the invoice number
-- Date is in the format YYYY-MM-DD
SELECT CUSTOMER.CUST_ID, FIRST_NAME, LAST_NAME FROM CUSTOMER JOIN INVOICES ON CUSTOMER.CUST_ID = INVOICES.CUST_ID WHERE EXISTS (SELECT * FROM INVOICE_LINE WHERE INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM) AND INVOICE_DATE = '2021-11-15'

-- Find the ID, FIRST_NAME and LAST_NAME of each customer for which an invoice was NOT created on November 15, 2021
-- Join the CUSTOMER table to the INVOICES table to get the customer ID and the invoice number
-- Date is in the format YYYY-MM-DD
SELECT CUSTOMER.CUST_ID, FIRST_NAME, LAST_NAME FROM CUSTOMER JOIN INVOICES ON CUSTOMER.CUST_ID = INVOICES.CUST_ID WHERE EXISTS (SELECT * FROM INVOICE_LINE WHERE INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM) AND INVOICE_DATE != '2021-11-15'

-- For each invoice, list the invoice number, invoice date, ITEM_ID, description, and category for each invoice line that makes up the invoice
-- Join the INVOICE_LINE table to the INVOICES table to get the invoice number and the invoice number
SELECT INVOICES.INVOICE_NUM, INVOICE_DATE, INVOICE_LINE.ITEM_ID, DESCRIPTION, CATEGORY FROM INVOICE_LINE JOIN INVOICES ON INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM JOIN ITEM ON INVOICE_LINE.ITEM_ID = ITEM.ITEM_ID

-- Repeat the last query, but this time order the rows by category and then by invoice number.
-- Join the INVOICE_LINE table to the INVOICES table to get the invoice number and the invoice number
SELECT INVOICES.INVOICE_NUM, INVOICE_DATE, INVOICE_LINE.ITEM_ID, DESCRIPTION, CATEGORY FROM INVOICE_LINE JOIN INVOICES ON INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM JOIN ITEM ON INVOICE_LINE.ITEM_ID = ITEM.ITEM_ID ORDER BY CATEGORY, INVOICES.INVOICE_NUM

-- Use a subquery to find the sales rep ID, FIRST_NAME and LAST_NAME of each sales rep who represents at least one customer with a credit limit of $500. List each sales rep only once in the results
-- Join the CUSTOMER table to the SALES_REP table to get the customer ID and the sales rep ID
-- if a sales rep has multiple customers with credit limits of $500, only list them once
SELECT DISTINCT SALES_REP.REP_ID, SALES_REP.FIRST_NAME, SALES_REP.LAST_NAME FROM SALES_REP JOIN CUSTOMER ON SALES_REP.REP_ID = CUSTOMER.REP_ID WHERE CREDIT_LIMIT = 500 AND EXISTS (SELECT * FROM CUSTOMER WHERE CUSTOMER.REP_ID = SALES_REP.REP_ID AND CREDIT_LIMIT = 500) ORDER BY SALES_REP.REP_ID

-- Repeat the last query without a subquery
-- Join the CUSTOMER table to the SALES_REP table to get the customer ID and the sales rep ID
SELECT DISTINCT SALES_REP.REP_ID, SALES_REP.FIRST_NAME, SALES_REP.LAST_NAME FROM SALES_REP JOIN CUSTOMER ON SALES_REP.REP_ID = CUSTOMER.REP_ID WHERE CREDIT_LIMIT = 500

-- Find the ID, FIRST_NAME and LAST_NAME of each customer that currently has an invoice on file for "Wild Bird Food (25 lb).
-- Join the CUSTOMER table to the INVOICES table to get the customer ID and the invoice number
-- Wild Bird Food (25 lb) is the description of the item
SELECT CUSTOMER.CUST_ID, FIRST_NAME, LAST_NAME FROM CUSTOMER JOIN INVOICES ON CUSTOMER.CUST_ID = INVOICES.CUST_ID JOIN INVOICE_LINE ON INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM JOIN ITEM ON INVOICE_LINE.ITEM_ID = ITEM.ITEM_ID WHERE DESCRIPTION = 'Wild Bird Food (25 lb)'

-- List the ITEM_ID, description, and category for each pair of items that are in the same category. Order the output by category.
SELECT CATEGORY, ITEM_ID, DESCRIPTION FROM ITEM WHERE EXISTS (SELECT * FROM ITEM WHERE ITEM.CATEGORY = ITEM.CATEGORY) ORDER BY CATEGORY
