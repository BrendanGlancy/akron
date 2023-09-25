-- Tables OFFICE, OWNER, PROPERTY, RESIDENTS, SERVICE_REQUEST, SERVICE_CATEGORY
-- OFFICE TABLE: OFFICE_NUM, OFFICE_NAME, ADDRESS, AREA, CITY, STATE, ZIP_CODE
-- OWNER TABLE: OWNER_NUM, LAST_NAME, FIRST_NAME, ADDRESS, CITY, STATE, ZIP_CODE
-- PROPERTY TABLE: PROPERTY_ID, OFFFICE_NUM, ADDRESS, SQR_FT, BDRMS, FLOORS, MONTHLY_RENT, OWNER_NUM
-- RESIDENTS TABLE: RESIDENTS_ID, FIRST_NAME, LAST_NAME, PROPERTY_ID
-- SERVICE_REQUEST TABLE: SERVICE_ID, PROPERTY_ID, CATEGORY_NUMBER, OFFICE_ID, DESCRIPTION, STATUS, EST_HOURS, SPENT_HOURS, NEXT_SERVICE_DATE
-- SERVICE_CATEGORY TABLE: CATEGORY_NUM, CATEGORY_DESCRIPTION

-- List the owner number, LAST_NAME, and FIRST_NAME of every property owner
SELECT OWNER_NUM, LAST_NAME, FIRST_NAME FROM OWNER;

-- List the complete PROPERTY table
SELECT * FROM PROPERTY;

-- List the last name and first name of every owner who lives in Seattle
SELECT LAST_NAME, FIRST_NAME FROM OWNER WHERE CITY = 'Seattle';

-- List the last name and first name of every owner who doesn't live in Seattle
SELECT LAST_NAME, FIRST_NAME FROM OWNER WHERE CITY != 'Seattle';

-- List the OFFICE_NUM as the LOCATION_NUMBER and PROPERTY_ID as the UNIT_NUMBER for every property whose SQR_FT is equal to or less than 1400
SELECT OFFICE_NUM as LOCATION_NUMBER, PROPERTY_ID as UNIT_NUMBER FROM PROPERTY WHERE SQR_FT <= 1400;

-- List the office number and address for every property with three bedrooms
SELECT OFFICE_NUM, ADDRESS FROM PROPERTY WHERE BDRMS = 3;

-- List the property for every property with two bedrooms that is managed by the StayWell-Georgetown office
SELECT PROPERTY_ID FROM PROPERTY WHERE BDRMS = 2 AND OFFICE_NUM = 2;

-- List the property ID for every property with a monthly rent between 1350 and 1750
SELECT PROPERTY_ID FROM PROPERTY WHERE MONTHLY_RENT BETWEEN 1350 AND 1750;

-- List the property ID for every property managed by the staywell-georgetown office (office number 1), whose montly rent is less than 1500
SELECT PROPERTY_ID FROM PROPERTY WHERE OFFICE_NUM = 1 AND MONTHLY_RENT < 1500;

-- Labor is billed at the rate of 35 per hour, list the property ID, category number, estimated hours, and estimated labor cost for every service request
-- To obtain estimated labor cost, multiply the estimated hours by 35, use the column name ESTIMATED_COST for the estimated labor cost
SELECT PROPERTY_ID, CATEGORY_NUMBER, EST_HOURS, EST_HOURS * 35 as ESTIMATED_COST FROM SERVICE_REQUEST;

-- List the owner numerb and last name for all owners who live in Nevada (NV), Oregon (OR), or Idaho (ID)
SELECT OWNER_NUM, LAST_NAME FROM OWNER WHERE STATE IN ('NV', 'OR', 'ID');

-- List the office number, property ID, sqr_FT, and monthly rent for all properties, Sort the results by monthly within the sqr_FT
SELECT OFFICE_NUM, PROPERTY_ID, SQR_FT, MONTHLY_RENT FROM PROPERTY ORDER BY SQR_FT;

-- How many three-bedroom properties are managed by each office. Use OFFICE_NUM and COUNT(*) as the column headers
SELECT OFFICE_NUM, COUNT(*) FROM PROPERTY WHERE BDRMS = 3 GROUP BY OFFICE_NUM;

-- Calculate the total value of the monthly rent for all properties, Display this value in a column called TOTAL_VALUE
SELECT SUM(MONTHLY_RENT) as TOTAL_VALUE FROM PROPERTY;

-- Write a query using a WHERE clause to find all service request with the word heating anywhere in the description field.
SELECT * FROM SERVICE_REQUEST WHERE DESCRIPTION LIKE '%heating%';
