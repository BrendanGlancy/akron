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

Create table NONCAT (
  ITEM_ID char(4) primary key,
  DESCRIPTION char(30),
  ON_HAND int,
  CATEGORY char(3),
  PRICE decimal(5,2)
);

-- Insert into the NONCAT table the item ID, description, on hand, category, and price for each item in the ITEM table
-- for each item that is not in the category CAT.
Insert into NONCAT (ITEM_ID, DESCRIPTION, ON_HAND, CATEGORY, PRICE)
Select ITEM_ID, DESCRIPTION, ON_HAND, CATEGORY, PRICE from ITEM where CATEGORY <> 'CAT';

-- In the NONCAT table, change the DESCRIPTION of the item ID DT12 to Dog Toy Gift Bonanza
Update NONCAT set DESCRIPTION = 'Dog Toy Gift Bonanza' where ITEM_ID = 'DT12';

-- In the NONCAT table, increase the price of each item in category BRD by 5% (Multiply each price by 1.05)
Update NONCAT set PRICE = PRICE * 1.05 where CATEGORY = 'BRD';

-- Add the following item to the NONCAT table:
-- ITEM_ID: FF17, DESCRIPTION: Premium Fish Food, ON_HAND: 10, CATEGORY: FSH, PRICE: 11.95
Insert into NONCAT (ITEM_ID, DESCRIPTION, ON_HAND, CATEGORY, PRICE)
Values ('FF17', 'Premium Fish Food', 10, 'FSH', 11.95);

-- Delete every item in the NONCAT table for which the category is HOR
Delete from NONCAT where CATEGORY = 'HOR';

-- In the NONCAT table, change the category from item UF39 to null
Update NONCAT set CATEGORY = null where ITEM_ID = 'UF39';

-- Add a column named ON_HAND_VALUE to the NONCAT table, The on-hand-value is a seven digit number with two decimal places it represents ON_HAND * PRICE. Then set all values of ON_HAND_VALUE to ON_HAND_PRICE
-- ON_HAND_VALUE needs to contain the value of ON_HAND * PRICE
ALTER TABLE NONCAT ADD ON_HAND_VALUE decimal(7,2);
-- insert the value of ON_HAND * PRICE into the ON_HAND_VALUE column
Update NONCAT set ON_HAND_VALUE = ON_HAND * PRICE;

-- in the NONCAT table, increase the length of the DESCRIPTION column to 40 char
ALTER TABLE NONCAT MODIFY DESCRIPTION char(40);

-- Remove the NONCAT table
Drop table NONCAT;
