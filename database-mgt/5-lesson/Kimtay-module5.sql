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
SELECT INVOICE_NUM, INVOICE_DATE, INVOICES.CUST_ID, FIRST_NAME, LAST_NAME
	FROM CUSTOMER JOIN INVOICES ON CUSTOMER.CUST_ID = INVOICES.CUST_ID

-- For each invoice placed on November 15, 2021, list the number along with the ID, FIRST_NAME and LAST_NAME of the customer which the invoice was created.
-- Join the CUSTOMER table to the INVOICES table to get the customer ID and the invoice number
-- Date is in the format YYYY-MM-DD
SELECT INVOICE_NUM, CUSTOMER.CUST_ID, FIRST_NAME, LAST_NAME
	FROM CUSTOMER JOIN INVOICES ON CUSTOMER.CUST_ID = INVOICES.CUST_ID
	WHERE INVOICE_DATE = '2021-11-15'

-- For each invoice, list the invoice number, invoice date, ITEM_ID, quantity ordered, and quoted price for each invoice line that makes up the invoice
-- Join the INVOICE_LINE table to the INVOICES table to get the invoice number and the invoice number
-- Join the ITEM table to the INVOICE_LINE table to get the item ID and the invoice number
SELECT INVOICES.INVOICE_NUM, INVOICE_DATE, INVOICE_LINE.ITEM_ID, QUANTITY, QUOTED_PRICE
	FROM INVOICE_LINE JOIN INVOICES ON INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM JOIN ITEM ON INVOICE_LINE.ID = ITEM.ITEM_ID

-- Use the IN operator to find the ID, FIRST_NAME, LAST_NAME of each customer for which an invoice was created on November 15, 2021
-- Join the CUSTOMER table to the INVOICES table to get the customer ID and the invoice number
-- Date is in the format YYYY-MM-DD
SELECT CUSTOMER.CUST_ID, FIRST_NAME, LAST_NAME
	FROM CUSTOMER JOIN INVOICES ON CUSTOMER.CUST_ID = INVOICES.CUST_ID
	WHERE INVOICE_DATE = '2021-11-15'

-- Repeat the last query, but this time use the EXISTS operator
-- Join the CUSTOMER table to the INVOICES table to get the customer ID and the invoice number
-- Date is in the format YYYY-MM-DD
SELECT CUSTOMER.CUST_ID, FIRST_NAME, LAST_NAME
	FROM CUSTOMER JOIN INVOICES ON CUSTOMER.CUST_ID = INVOICES.CUST_ID
	WHERE EXISTS (SELECT *
	FROM INVOICE_LINE
	WHERE INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM) AND INVOICE_DATE = '2021-11-15'

-- Find the ID, FIRST_NAME and LAST_NAME of each customer for which an invoice was NOT created on November 15, 2021
-- Join the CUSTOMER table to the INVOICES table to get the customer ID and the invoice number
-- Date is in the format YYYY-MM-DD
SELECT CUSTOMER.CUST_ID, FIRST_NAME, LAST_NAME
	FROM CUSTOMER JOIN INVOICES ON CUSTOMER.CUST_ID = INVOICES.CUST_ID
	WHERE EXISTS (SELECT *
	FROM INVOICE_LINE
	WHERE INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM) AND INVOICE_DATE != '2021-11-15'

-- For each invoice, list the invoice number, invoice date, ITEM_ID, description, and category for each invoice line that makes up the invoice
-- Join the INVOICE_LINE table to the INVOICES table to get the invoice number and the invoice number
SELECT INVOICES.INVOICE_NUM, INVOICE_DATE, INVOICE_LINE.ITEM_ID, DESCRIPTION, CATEGORY
	FROM INVOICE_LINE JOIN INVOICES ON INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM JOIN ITEM ON INVOICE_LINE.ITEM_ID = ITEM.ITEM_ID

-- Repeat the last query, but this time order the rows by category and then by invoice number.
-- Join the INVOICE_LINE table to the INVOICES table to get the invoice number and the invoice number
SELECT INVOICES.INVOICE_NUM, INVOICE_DATE, INVOICE_LINE.ITEM_ID, DESCRIPTION, CATEGORY
	FROM INVOICE_LINE JOIN INVOICES ON INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM JOIN ITEM ON INVOICE_LINE.ITEM_ID = ITEM.ITEM_ID ORDER BY CATEGORY, INVOICES.INVOICE_NUM

-- Use a subquery to find the sales rep ID, FIRST_NAME and LAST_NAME of each sales rep who represents at least one customer with a credit limit of $500. List each sales rep only once in the results
-- Join the CUSTOMER table to the SALES_REP table to get the customer ID and the sales rep ID
-- if a sales rep has multiple customers with credit limits of $500, only list them once
SELECT DISTINCT SALES_REP.REP_ID, SALES_REP.FIRST_NAME, SALES_REP.LAST_NAME
	FROM SALES_REP JOIN CUSTOMER ON SALES_REP.REP_ID = CUSTOMER.REP_ID
	WHERE CREDIT_LIMIT = 500 AND EXISTS (SELECT *
	FROM CUSTOMER
	WHERE CUSTOMER.REP_ID = SALES_REP.REP_ID AND CREDIT_LIMIT = 500) ORDER BY SALES_REP.REP_ID

-- Repeat the last query without a subquery
-- Join the CUSTOMER table to the SALES_REP table to get the customer ID and the sales rep ID
SELECT DISTINCT SALES_REP.REP_ID, SALES_REP.FIRST_NAME, SALES_REP.LAST_NAME
	FROM SALES_REP JOIN CUSTOMER ON SALES_REP.REP_ID = CUSTOMER.REP_ID
	WHERE CREDIT_LIMIT = 500

-- Find the ID, FIRST_NAME and LAST_NAME of each customer that currently has an invoice on file for "Wild Bird Food (25 lb).
-- Join the CUSTOMER table to the INVOICES table to get the customer ID and the invoice number
-- Wild Bird Food (25 lb) is the description of the item
SELECT CUSTOMER.CUST_ID, FIRST_NAME, LAST_NAME
	FROM CUSTOMER JOIN INVOICES ON CUSTOMER.CUST_ID = INVOICES.CUST_ID JOIN INVOICE_LINE ON INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM JOIN ITEM ON INVOICE_LINE.ITEM_ID = ITEM.ITEM_ID
	WHERE DESCRIPTION = 'Wild Bird Food (25 lb)'

-- List the item ID, description, and category for each PAIR of items that are in the same category
-- Order the results by category
-- Return only the first 6 rows, where the category = BRD, CAT, FSH
-- What I had to do
SELECT ITEM_ID, DESCRIPTION, CATEGORY
	FROM ITEM
	WHERE CATEGORY IN (SELECT CATEGORY
	FROM ITEM GROUP BY CATEGORY HAVING COUNT(*) > 1) ORDER BY CATEGORY LIMIT 6

-- The correct answer
SELECT CATEGORY, ITEM_ID, DESCRIPTION
	FROM ITEM
	WHERE EXISTS (SELECT COUNT(*)
	FROM ITEM I
	WHERE I.CATEGORY = ITEM.CATEGORY
                      GROUP BY CATEGORY
                      HAVING COUNT(*) = 2)
ORDER BY CATEGORY

-- List the invoice number and invoice date for each invoice created for the customer James Gonzalez
-- Join the CUSTOMER table to the INVOICES table to get the customer ID and the invoice number
-- James Gonzalez is the FIRST_NAME and LAST_NAME of the customer
SELECT INVOICES.INVOICE_NUM, INVOICE_DATE
	FROM CUSTOMER JOIN INVOICES ON CUSTOMER.CUST_ID = INVOICES.CUST_ID
	WHERE FIRST_NAME = 'James' AND LAST_NAME = 'Gonzalez'

-- List the invoice number and invoice date for each invoice that constains an invoice line for a 'Wild Bird Food (25 lb)'
-- Join the INVOICE_LINE table to the INVOICES table to get the invoice number and the invoice number
-- Wild Bird Food (25 lb) is the description of the item
SELECT INVOICES.INVOICE_NUM, INVOICE_DATE
	FROM INVOICES JOIN INVOICE_LINE ON INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM JOIN ITEM ON INVOICE_LINE.ITEM_ID = ITEM.ITEM_ID
	WHERE DESCRIPTION = 'Wild Bird Food (25 lb)'

-- List the invoice number and invoice date for each invoice that either was created for James Gonzalez or that contains an invoice line for Wild Bird Food (25 lb)
-- Join the CUSTOMER table to the INVOICES table to get the customer ID and the invoice number
-- James Gonzalez is the FIRST_NAME and LAST_NAME of the customer
-- Wild Bird Food (25 lb) is the description of the item
SELECT INVOICES.INVOICE_NUM, INVOICE_DATE
	FROM CUSTOMER JOIN INVOICES ON CUSTOMER.CUST_ID = INVOICES.CUST_ID JOIN INVOICE_LINE ON INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM JOIN ITEM ON INVOICE_LINE.ITEM_ID = ITEM.ITEM_ID
	WHERE FIRST_NAME = 'James' AND LAST_NAME = 'Gonzalez' OR DESCRIPTION = 'Wild Bird Food (25 lb)'


-- For some reason this is the same prompt as the previous one.
-- This time only return one row where the INVOICE_NUM = 14233
SELECT INVOICES.INVOICE_NUM, INVOICE_DATE
	FROM CUSTOMER JOIN INVOICES ON CUSTOMER.CUST_ID = INVOICES.CUST_ID JOIN INVOICE_LINE ON INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM JOIN ITEM ON INVOICE_LINE.ITEM_ID = ITEM.ITEM_ID
	WHERE FIRST_NAME = 'James' AND LAST_NAME = 'Gonzalez' AND DESCRIPTION = 'Wild Bird Food (25 lb)'

-- List the invoice number and invoice date for each invoice that was created for James Gonzalez but does not contain an invoice line for Wild Bird Food (25 lb)
-- Join the CUSTOMER table to the INVOICES table to get the customer ID and the invoice number
-- James Gonzalez is the FIRST_NAME and LAST_NAME of the customer
-- Wild Bird Food (25 lb) is the description of the item
SELECT INVOICES.INVOICE_NUM, INVOICE_DATE
	FROM CUSTOMER JOIN INVOICES ON CUSTOMER.CUST_ID = INVOICES.CUST_ID JOIN INVOICE_LINE ON INVOICE_LINE.INVOICE_NUM = INVOICES.INVOICE_NUM JOIN ITEM ON INVOICE_LINE.ITEM_ID = ITEM.ITEM_ID
	WHERE FIRST_NAME = 'James' AND LAST_NAME = 'Gonzalez' AND NOT DESCRIPTION = 'Wild Bird Food (25 lb)'

-- List the item ID, description, unit price, and category for each item that has a unit price greater than the unit price of every item in the category CAT. Use the ALL operator in your query
-- unit price is the price of the item
-- category is the category of the item
SELECT ITEM_ID, DESCRIPTION, PRICE, CATEGORY
	FROM ITEM
	WHERE PRICE > ALL (SELECT PRICE
	FROM ITEM
	WHERE CATEGORY = 'CAT')


SELECT ITEM.ITEM_ID, ITEM.DESCRIPTION, ITEM.PRICE, ITEM.CATEGORY
	FROM ITEM
	WHERE ITEM.PRICE > ALL (SELECT PRICE
	FROM ITEM
	WHERE CATEGORY = 'CAT')

-- Repeat the above query but this time use the ANY operator
SELECT ITEM_ID, DESCRIPTION, PRICE, CATEGORY
	FROM ITEM
	WHERE PRICE > ANY (SELECT PRICE
	FROM ITEM
	WHERE CATEGORY = 'CAT')

-- Select every item, list the item ID, description, on hand, invoice number and quantity
-- Join the ITEM table and INVOICE_LINE table to get the item ID, description, on hand, invoice number and quantity
-- Must make sure to specify which table the columns are from
SELECT ITEM.ITEM_ID, ITEM.DESCRIPTION, ITEM.ON_HAND, INVOICE_LINE.INVOICE_NUM, INVOICE_LINE.QUANTITY
	FROM ITEM LEFT JOIN INVOICE_LINE ON (INVOICE_LINE.ITEM_ID = ITEM.ITEM_ID)

-- For each sales rep, list the ID, first name and last name for the customer, Along with the sales rep first name and sales rep last name. All sales reps should be included in the results.
-- Join the CUSTOMER table to the SALES_REP table to get the customer ID and the sales rep ID
-- The sales rep ID is the customer rep ID
SELECT SALES_REP.REP_ID, SALES_REP.FIRST_NAME AS REP_FIRST, SALES_REP.LAST_NAME AS REP_LAST, CUST_ID, CUSTOMER.FIRST_NAME AS CUSTOMER_FIRST, CUSTOMER.LAST_NAME AS CUSTOMER_LAST
	FROM SALES_REP JOIN CUSTOMER ON SALES_REP.REP_ID = CUSTOMER.REP_ID ORDER BY REP_ID
