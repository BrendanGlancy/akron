-- The OFFICE table: OFFICE_NUM, OFFICE_NAME, ADDRESS, AREA, CITY, STATE, ZIP_CODE
-- The OWNER table: OWNER_NUM, LAST_NAME, FIRST_NAME, ADDRESS, CITY, STATE, ZIP_CODE
-- The PROPERTY table: PROPERTY_ID, OFFICE_NUM, ADDRESS, SQR_FT, BDRMS, FLOORS, MONTHLY_RENT, OWNER_NUM. The PROPERTY_ID is an integer unique for each property
-- RESIDENTS TABLE: RESIDENTS_ID, FIRST_NAME, LAST_NAME, PROPERTY_ID
-- SERVICE_REQUEST TABLE: SERVICE_ID, PROPERTY_ID, CATEGORY_NUMBER, OFFICE_ID, DESCRIPTION, STATUS, EST_HOURS, SPENT_HOURS, NEXT_SERVICE_DATE
-- SERVICE_CATEGORY TABLE: CATEGORY_NUM, CATEGORY_DESCRIPTION

-- For every property, list the management office number, address, monthly rent, owner number, owner first name and owner last name.
-- Join the PROPERTY table with the OWNER table to get the owner's first and last name.
SELECT PROPERTY.OFFICE_NUM, PROPERTY.ADDRESS, PROPERTY.MONTHLY_RENT, PROPERTY.OWNER_NUM, OWNER.FIRST_NAME, OWNER.LAST_NAME
FROM OWNER JOIN PROPERTY ON OWNER.OWNER_NUM = PROPERTY.OWNER_NUM

-- For every completed or open service request, list the property ID, description, and status.
-- Join the SERVICE_REQUEST table with the PROPERTY table to get the property ID.
SELECT SERVICE_REQUEST.PROPERTY_ID, SERVICE_REQUEST.DESCRIPTION, SERVICE_REQUEST.STATUS FROM SERVICE_REQUEST JOIN PROPERTY ON SERVICE_REQUEST.PROPERTY_ID = PROPERTY.PROPERTY_ID

-- For every service request for janitorial work, list the property ID, management office number address, estimated hours, spent hours, owner number, and owner last name.
-- Join the SERVICE_REQUEST table with the OWNER table to get the owner first and last name. PROPERTY_ID is a field in SERVICE_REQUEST
SELECT SERVICE_REQUEST.PROPERTY_ID, PROPERTY.OFFICE_NUM, PROPERTY.ADDRESS, SERVICE_REQUEST.EST_HOURS, SERVICE_REQUEST.SPENT_HOURS, OWNER.OWNER_NUM, OWNER.LAST_NAME
FROM SERVICE_REQUEST JOIN PROPERTY ON SERVICE_REQUEST.PROPERTY_ID = PROPERTY.PROPERTY_ID JOIN OWNER ON PROPERTY.OWNER_NUM = OWNER.OWNER_NUM

-- List the first and last name of all the owners who own a two bedroom property.
-- Use the IN operator
-- BDRMS is the number of bedrooms
SELECT OWNER.FIRST_NAME, OWNER.LAST_NAME FROM OWNER JOIN PROPERTY ON OWNER.OWNER_NUM = PROPERTY.OWNER_NUM WHERE BDRMS = 2

-- Repeat the previous query, but this time use the EXISTS operator
-- BDRMS is the number of bedrooms
SELECT OWNER.FIRST_NAME, OWNER.LAST_NAME FROM OWNER JOIN PROPERTY ON OWNER.OWNER_NUM = PROPERTY.OWNER_NUM WHERE EXISTS (SELECT * FROM PROPERTY WHERE OWNER.OWNER_NUM = PROPERTY.OWNER_NUM AND BDRMS = 2)

-- List the property IDs of any pair of properties that have the same number of bedrooms. The first property ID listed should be the major sort key and the second property ID should be the minor sort key
-- BDRMS is the number of bedrooms, should be the same for both properties
SELECT P1.PROPERTY_ID, P2.PROPERTY_ID, P1.BDRMS FROM PROPERTY P1 INNER JOIN PROPERTY P2 ON P1.BDRMS = P2.BDRMS order by P1.PROPERTY_ID, P2.PROPERTY_ID asc

-- List the square footage, owner last name and owner first name for each property managed by the StayWell-Columbia City office
-- Join the PROPERTY table with the OWNER table to get the owner first and last name.
-- Join the OFFICE table to get the area which is Columbia City
SELECT PROPERTY.SQR_FT, OWNER.OWNER_NUM, OWNER.LAST_NAME, OWNER.FIRST_NAME FROM PROPERTY JOIN OWNER ON PROPERTY.OWNER_NUM = OWNER.OWNER_NUM JOIN OFFICE ON PROPERTY.OFFICE_NUM = OFFICE.OFFICE_NUM WHERE OFFICE.AREA = 'Columbia City'

-- Repeat the previous query, but this time only include properties with 3 bedrooms
SELECT PROPERTY.SQR_FT, OWNER.OWNER_NUM, OWNER.LAST_NAME, OWNER.FIRST_NAME FROM PROPERTY JOIN OWNER ON PROPERTY.OWNER_NUM = OWNER.OWNER_NUM JOIN OFFICE ON PROPERTY.OFFICE_NUM = OFFICE.OFFICE_NUM WHERE OFFICE.AREA = 'Columbia City' AND BDRMS = 3

-- List the office number, address, and monthly rent for properties whose owners live in Washington State and own a 2 bedroom property
-- Join the OWNER table to get the owner's state
-- Join the PROPERTY table to get the property's office number and address
SELECT PROPERTY.OFFICE_NUM, PROPERTY.ADDRESS, PROPERTY.MONTHLY_RENT FROM OWNER JOIN PROPERTY ON OWNER.OWNER_NUM = PROPERTY.OWNER_NUM WHERE OWNER.STATE = 'WA' OR BDRMS = 2

-- Repeat the previous query, use the AND operator
SELECT PROPERTY.OFFICE_NUM, PROPERTY.ADDRESS, PROPERTY.MONTHLY_RENT FROM OWNER JOIN PROPERTY ON OWNER.OWNER_NUM = PROPERTY.OWNER_NUM WHERE OWNER.STATE = 'WA' AND BDRMS = 2

-- List the office number, address, and monthly rent for properties whose owners live in Washington State but do not own a 2 bedroom property
-- Join the OWNER table to get the owner's state
-- Join the PROPERTY table to get the property's office number and address
SELECT PROPERTY.OFFICE_NUM, PROPERTY.ADDRESS, PROPERTY.MONTHLY_RENT FROM OWNER JOIN PROPERTY ON OWNER.OWNER_NUM = PROPERTY.OWNER_NUM WHERE OWNER.STATE = 'WA' AND BDRMS != 2

-- Find the service ID and property ID for each service request whose estimated hours is greater than the number of estimated hours of any service request with category number 5
SELECT SERVICE_ID, PROPERTY_ID
  FROM SERVICE_REQUEST
 WHERE EST_HOURS > ANY (SELECT EST_HOURS FROM SERVICE_REQUEST WHERE CATEGORY_NUMBER = 5)

-- Find the service ID and property ID for each service request whose estimated hours is greater than the number of estimated hours of all service request with category number is 5
SELECT SERVICE_ID, PROPERTY_ID
  FROM SERVICE_REQUEST
 WHERE EST_HOURS > ALL (SELECT EST_HOURS FROM SERVICE_REQUEST WHERE CATEGORY_NUMBER = 5)

-- List the address, square footage, owner number, service ID, number of estimated hours, and number of spent hours for each service request on which the category number is 4.
-- Join the SERVICE_REQUEST table with the PROPERTY table to get the property address.
SELECT PROPERTY.ADDRESS, PROPERTY.SQR_FT, PROPERTY.OWNER_NUM,
       SERVICE_REQUEST.SERVICE_ID, SERVICE_REQUEST.EST_HOURS, SERVICE_REQUEST.SPENT_HOURS
 FROM PROPERTY, SERVICE_REQUEST
WHERE PROPERTY.PROPERTY_ID = SERVICE_REQUEST.PROPERTY_ID
   AND SERVICE_REQUEST.CATEGORY_NUMBER = 4

-- Repeat the previous query, return all results even if SERVICE_ID or EST_HOURS or SPENT_HOURS returns a NULL value
SELECT PROPERTY.ADDRESS, PROPERTY.SQR_FT, PROPERTY.OWNER_NUM, SERVICE_REQUEST.SERVICE_ID, SERVICE_REQUEST.EST_HOURS, SERVICE_REQUEST.SPENT_HOURS
  FROM PROPERTY
    LEFT JOIN SERVICE_REQUEST ON PROPERTY.PROPERTY_ID = SERVICE_REQUEST.PROPERTY_ID
   AND SERVICE_REQUEST.CATEGORY_NUMBER = 4
