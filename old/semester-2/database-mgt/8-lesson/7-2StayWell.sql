-- The OFFICE table: OFFICE_NUM, OFFICE_NAME, ADDRESS, AREA, CITY, STATE, ZIP_CODE
-- The OWNER table: OWNER_NUM, LAST_NAME, FIRST_NAME, ADDRESS, CITY, STATE, ZIP_CODE
-- The PROPERTY table: PROPERTY_ID, OFFICE_NUM, ADDRESS, SQR_FT, BDRMS, FLOORS, MONTHLY_RENT, OWNER_NUM. The PROPERTY_ID is an integer unique for each property
-- RESIDENTS TABLE: RESIDENTS_ID, FIRST_NAME, LAST_NAME, PROPERTY_ID
-- SERVICE_REQUEST TABLE: SERVICE_ID, PROPERTY_ID, CATEGORY_NUMBER, OFFICE_ID, DESCRIPTION, STATUS, EST_HOURS, SPENT_HOURS, NEXT_SERVICE_DATE
-- SERVICE_CATEGORY TABLE: CATEGORY_NUM, CATEGORY_DESCRIPTION

-- Task 1:
-- Create a view named SMALL_PROPERTY.
-- It consists of the property ID, office number, bedrooms, floor, monthly rent, and owner number for every property whose square footage is less than 1,250 square feet.
CREATE VIEW SMALL_PROPERTY AS
SELECT PROPERTY_ID, OFFICE_NUM, BDRMS, FLOORS, MONTHLY_RENT, OWNER_NUM
FROM PROPERTY
WHERE SQR_FT < 1250;

-- Task 2:
-- Write and execute the command to retrieve the office number, property ID, and monthly rent for every property in the SMALL_PROPERTY view with a monthly rent of $1150 or more.
SELECT OFFICE_NUM, PROPERTY_ID, MONTHLY_RENT
FROM SMALL_PROPERTY
WHERE MONTHLY_RENT >= 1150;

-- Task 3:
-- Without using the SMALL_PROPERTY view, retrieve the office number, property ID, and monthly rent for every property whose square footage is less than 1250 square feet and monthly rent of $1150 or less
SELECT OFFICE_NUM, PROPERTY_ID, MONTHLY_RENT
FROM PROPERTY
WHERE SQR_FT < 1250 AND MONTHLY_RENT <= 1150;

-- Task 4:
-- Create a view named PROPERTY_OWNERS. It consists of the property ID, office number, square footage, bedrooms, floors, monthly rent, and owner’s last name for every property in which the number of bedrooms is three.
-- Join the PROPERTY and OWNER tables on the PROPERTY.OWNER_NUM field.
CREATE VIEW PROPERTY_OWNERS AS
SELECT PROPERTY.PROPERTY_ID, PROPERTY.OFFICE_NUM, PROPERTY.SQR_FT, PROPERTY.BDRMS, PROPERTY.FLOORS, PROPERTY.MONTHLY_RENT, OWNER.LAST_NAME
FROM PROPERTY
INNER JOIN OWNER ON PROPERTY.OWNER_NUM = OWNER.OWNER_NUM
WHERE PROPERTY.BDRMS = 3;

-- Task 5:
-- Write and execute the command to retrieve all information for a property for every property in the PROPERTY_OWNERS view with a monthly rent of less than $1675.
-- Use the PROPERTY_OWNERS view.
SELECT PROPERTY_ID, OFFICE_NUM, SQR_FT, BDRMS, FLOORS, MONTHLY_RENT, LAST_NAME
FROM PROPERTY_OWNERS
WHERE MONTHLY_RENT < 1675 AND BDRMS = 3;

-- Task 6:
SELECT PROPERTY.PROPERTY_ID, PROPERTY.OFFICE_NUM, PROPERTY.SQR_FT, PROPERTY.BDRMS, PROPERTY.FLOORS, PROPERTY.MONTHLY_RENT, OWNER.LAST_NAME
FROM PROPERTY
INNER JOIN OWNER ON PROPERTY.OWNER_NUM = OWNER.OWNER_NUM
WHERE PROPERTY.MONTHLY_RENT < 1675 AND PROPERTY.BDRMS = 3;

-- Task 7:
-- Create a view named MONTHLY_RENTS. It consists of three columns: the first is the number of bedrooms, the second is the average square feet, and the third is the average monthly rent for all properties in the PROPERTY table that have that number of bedrooms. Use BEDROOMS, AVG_SQUARE_FEET, and AVG_MONTHLY_RENT as the column names. Group and order the rows by number of bedrooms.
CREATE VIEW MONTHLY_RENTS AS
SELECT BDRMS AS BEDROOMS, AVG(SQR_FT) AS AVG_SQUARE_FEET, AVG(MONTHLY_RENT) AS AVG_MONTHLY_RENT
FROM PROPERTY
GROUP BY BDRMS
ORDER BY BDRMS;

-- Task 8:
-- Write and execute the command to retrieve the average square footage and average monthly rent for each property for which the average monthly rent is greater than $1,400.
-- Use the MONTHLY_RENTS view.
SELECT AVG_SQUARE_FEET, AVG_MONTHLY_RENT
FROM MONTHLY_RENTS
WHERE AVG_MONTHLY_RENT > 1400;

-- Task 9:
--  Without using the MONTHLY_RENTS VIEW, write and execute the command to retrieve the average square footage and average monthly rent for each property for which the average monthly rent is less than $1,400.
SELECT AVG(SQR_FT) AS AVG_SQUARE_FEET, AVG(MONTHLY_RENT) AS AVG_MONTHLY_RENT
FROM PROPERTY
WHERE MONTHLY_RENT < 1400;  -- This is the same as the MONTHLY_RENTS view

-- Task 10:
-- User Oliver must be able to retrieve data from the PROPERTY table.
-- create a user named Oliver to access the PROPERTY table.
GRANT SELECT ON PROPERTY TO Oliver;

-- Task 11:
-- Users Crandall and Perez must be able to add new owners and properties to the database.
-- Users must be able to access PROPERTY and OWNER tables.
GRANT INSERT ON PROPERTY, OWNER TO Crandall AND Perez;

-- Task 12:
-- Users Johnson and Klein must be able to change the monthlyr rent of any property.
GRANT UPDATE ON PROPERTY TO Johnson AND Klein;

-- Task 13:
--  All users must be able to retrieve the office number, monthly rent, and owner number for every property.
GRANT SELECT ON PROPERTY TO ALL;


-- Task 14:
GRANT INSERT, DELETE ON SERVICE_CATEGORY TO KLEIN

-- Task 15:
GRANT INDEX ON SERVICE_REQUEST TO ADAMS

-- Task 17:
GRANT SELECT ON PROPERTY TO KLEIN

-- Task 18:
REVOKE ALL ON PROPERTY FROM ADAMS

-- Task 19:
-- Create an index named OWNER_INDEX1 on the STATE column in the OWNER table.
CREATE INDEX OWNER_INDEX1 ON OWNER (STATE);

-- Task 20:
-- Create an index named OWNER_INDEX2 on the LAST_NAME column in the OWNER table.
CREATE INDEX OWNER_INDEX2 ON OWNER (LAST_NAME);

-- Task 21:
-- Create an index named OWNER_INDEX3 on the STATE and CITY columns in the OWNER table. List the states in descending order.
CREATE INDEX OWNER_INDEX3 ON OWNER (STATE DESC, CITY);

-- Task 22:
-- Delete the OWNER_INDEX3 from the OWNER table.
DROP INDEX OWNER_INDEX3 ON OWNER;

-- Task 23:
-- List every column in the PROPERTY table and its associated data type.
-- show field type null key default extra
SHOW FIELDS FROM PROPERTY;

-- Task 24:
-- List every table that contains a column named OWNER_NUM. The output table should display one column named TABLE_NAME.
-- Return columns
SELECT TABLE_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE COLUMN_NAME = 'OWNER_NUM';

-- Task 25:
-- : Add the OWNER_NUM column as a foreign key in the PROPERTY table.
ALTER TABLE PROPERTY ADD CONSTRAINT FOREIGN KEY (OWNER_NUM) REFERENCES OWNER (OWNER_NUM);
