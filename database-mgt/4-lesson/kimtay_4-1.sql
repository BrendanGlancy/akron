-- Write your query below and then click "Run Query" to execute it. To save multiple queries, click the "+" icon above. Tables in the database:
-- CUSTOMER, INVOICES, INOVOICE_LINE, ITEM, SALES_REP
-- List the item id description, and price for all items
SELECT item_id, description, price from ITEM;

-- List all rows and columns from the INVOICES table
SELECT * from INVOICES;

-- List the first name, last name, and credit limit of customers with credit limit of 1000 or more
SELECT FIRST_NAME, LAST_NAME, CREDIT_LIMIT from CUSTOMER where CREDIT_LIMIT >= 1000;

-- List the invoice number for each order placed by customer number 125 on 2021-11-15
SELECT INVOICE_NUM from INVOICES where CUST_ID = 125 and INVOICE_DATE = '2021-11-15';

-- List the CUST_ID, FIRST_NAME, and LAST_NAME of each customer represented by sREP_ID 10 or 15
SELECT CUST_ID, FIRST_NAME, LAST_NAME from CUSTOMER where REP_ID = 10 or REP_ID = 15;

-- List the item ID and description for each item not in category HOR
SELECT ITEM_ID, DESCRIPTION from ITEM where CATEGORY != 'HOR';

-- List the ITEM_ID, DESCRIPTION, and ON_HAND for each items that has between 10 and 30 on hand
SELECT ITEM_ID, DESCRIPTION, ON_HAND from ITEM where ON_HAND >= 10 and ON_HAND <= 30;

-- List the ITEM_ID, DESCRIPTION, and ON_HAND * PRICE for each item in the CATEGORY CAT
-- ON_HAND * PRICE is On hand value, assign this to a column named ON_HAND_VALUE
SELECT ITEM_ID, DESCRIPTION, ON_HAND * PRICE as ON_HAND_VALUE from ITEM where CATEGORY = 'CAT';

-- List the ITEM_ID, DESCRIPTION, and ON_HAND * PRICE as ON_HAND_VALUE for each item where ON_HAND_VALUE is at least 1500
SELECT ITEM_ID, DESCRIPTION, ON_HAND * PRICE as ON_HAND_VALUE from ITEM where ON_HAND_VALUE >= 1500;

-- Use the IN operator to list ITEM_ID, DESCRIPTION of each item in the CATEGORY FSH or BRD
SELECT ITEM_ID, DESCRIPTION from ITEM where CATEGORY IN ('FSH', 'BRD');

-- Find the ID, FIRST_NAME, and LAST_NAME of each customer whose first name begins with the letter 'S'
SELECT CUST_ID, FIRST_NAME, LAST_NAME from CUSTOMER where FIRST_NAME LIKE 'S%';

-- List all details about all items, order the output by DESCRIPTION
SELECT * from ITEM order by DESCRIPTION;

-- List all details about all items, Order the output by ITEM_ID within LOCATION.
-- That is order the output by LOCATION and then by ITEM_ID
SELECT * from ITEM order by LOCATION, ITEM_ID;

-- How many customers have balances taht are more than their credit limit
SELECT COUNT(*) from CUSTOMER where BALANCE > CREDIT_LIMIT;

-- Find the total number of the balances for all customers represented by REP_ID 10, with balances that are less than their credit limits
SELECT SUM(BALANCE) from CUSTOMER where REP_ID = 10 and BALANCE < CREDIT_LIMIT;

-- List the ITEM_ID, DESCRIPTION, and ON_HAND * PRICE as ON_HAND_VALUE of each item whose number of units on hand is more than the average number of units on hand for all items.
-- Average number of units on hand is the sum of all on hand values divided by the number of items
SELECT ITEM_ID, DESCRIPTION, ON_HAND * PRICE as ON_HAND_VALUE from ITEM where ON_HAND > (SELECT SUM(ON_HAND) / COUNT(*) from ITEM);

-- What is the price of the least expensive item in the database
SELECT MIN(PRICE) from ITEM;

-- What is the ITEM_ID, DESCRIPTION, and price of the least expensive item in the database
SELECT ITEM_ID, DESCRIPTION, PRICE from ITEM where PRICE = (SELECT MIN(PRICE) from ITEM);

-- List the REP_ID adn the corresponding sum of the balances, as BALANCE, of all customers for each sales rep. Order and group the results by sales rep ID
SELECT REP_ID, SUM(BALANCE) as BALANCE from CUSTOMER group by REP_ID;


-- List the sum of the balances of all customers for each sales rep.
-- Balance should be the sum of the balance of all customers for each sales rep.
-- Restrict the results to sales reps where the sum is more than 150
-- The results should display the REP_ID and BALANCE column headers, order by sales REP_ID
select REP_ID, sum ( BALANCE ) as BALANCE from CUSTOMER Group By REP_ID Having sum(BALANCE) > 150 order By REP_ID;

-- List the ITEM_ID, DESCRIPTION, and CATEGORY of all items that are in the DOG or CAT CATEGORY
-- Must contain the word Small in the description
SELECT ITEM_ID, DESCRIPTION, CATEGORY from ITEM where CATEGORY IN ('DOG', 'CAT') and DESCRIPTION LIKE '%Small%';

-- Kimtay Pet supplies is thinking about discounting the price of all items by 10%
-- List the ITEM_ID, DESCRIPTION, and PRICE of all items, and DISCOUNTED_PRICE for all items
-- DISCOUNTED_PRICE is the price of the item after the discount, DISCOUNTED_PRICE = PRICE - (PRICE * 10%)
-- DISCOUNTED_PRICE should be a column named DISCOUNTED_PRICE
SELECT ITEM_ID, DESCRIPTION, PRICE, PRICE - PRICE * .1 as DISCOUNTED_PRICE from ITEM;
