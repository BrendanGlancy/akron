-- The OFFICE table: OFFICE_NUM, OFFICE_NAME, ADDRESS, AREA, CITY, STATE, ZIP_CODE
-- The OWNER table: OWNER_NUM, LAST_NAME, FIRST_NAME, ADDRESS, CITY, STATE, ZIP_CODE
-- The PROPERTY table: PROPERTY_ID, OFFICE_NUM, ADDRESS, SQR_FT, BDRMS, FLOORS, MONTHLY_RENT, OWNER_NUM. The PROPERTY_ID is an integer unique for each property
-- RESIDENTS TABLE: RESIDENTS_ID, FIRST_NAME, LAST_NAME, PROPERTY_ID
-- SERVICE_REQUEST TABLE: SERVICE_ID, PROPERTY_ID, CATEGORY_NUMBER, OFFICE_ID, DESCRIPTION, STATUS, EST_HOURS, SPENT_HOURS, NEXT_SERVICE_DATE
-- SERVICE_CATEGORY TABLE: CATEGORY_NUM, CATEGORY_DESCRIPTION

-- Create a LARGE_PROPERTY table that contains:
-- OFFICE_NUM (decimal(2,0) primary), ADDRESS (char(25), primary), BDRMS (decimal(2,0)), FLOORS (decimal(2,0)), MONTHLY_RENT (decimal(6, 2)), MONTHLY_RENT (decimal(5,2)), OWNER_NUM (char(5))
Create table LARGE_PROPERTY (
  OFFICE_NUM decimal(2,0),
  ADDRESS char(25),
  BDRMS decimal(2,0),
  FLOORS decimal(2,0),
  MONTHLY_RENT decimal(6, 2),
  OWNER_NUM char(5),
  PRIMARY KEY(OFFICE_NUM, ADDRESS)
);

-- Insert into LARGE_PROPERTY table the office number, address, bdrms, floors, monthly and owner number from the PROPERTY table to get the property
-- Insert only those values where SQR_FT is greater than 1500
Insert into LARGE_PROPERTY (OFFICE_NUM, ADDRESS, BDRMS, FLOORS, MONTHLY_RENT, OWNER_NUM)
Select PROPERTY.OFFICE_NUM, PROPERTY.ADDRESS, PROPERTY.BDRMS, PROPERTY.FLOORS, PROPERTY.MONTHLY_RENT, PROPERTY.OWNER_NUM FROM PROPERTY WHERE SQR_FT > 1500

-- increase the monthly rent for each large property by $150
Update LARGE_PROPERTY SET MONTHLY_RENT = MONTHLY_RENT + 150

-- decrease the monthly rent for each large prpoerty whose monthly rent is more than 1750 by 1%
-- only update those values where the monthly rent is greater than 1750
Update LARGE_PROPERTY SET MONTHLY_RENT = MONTHLY_RENT - (MONTHLY_RENT * 0.01) WHERE MONTHLY_RENT > 1750

-- Insert a row into the LARGE_PROPERTY table for a new property
-- the office number is 1, the address is 2643 Lugsi Dr., the bdrms is 3, the floors is 2, the monthly rent is 775, and the owner number is 'MA111'
Insert into LARGE_PROPERTY (OFFICE_NUM, ADDRESS, BDRMS, FLOORS, MONTHLY_RENT, OWNER_NUM)
Values (1, '2643 Lugsi Dr.', 3, 2, 775, 'MA111')

-- Delete all the properties in the LARGE_PROPERTY table for which the owner number is BU106
Delete from LARGE_PROPERTY WHERE OWNER_NUM = 'BU106'

-- The property managed by the Columbia City with the address "105 North Illinois Rd." is in the process of being remodeled and the number of bedrooms is unknown. Change the bedrooms values in the LARGE_PROPERTY table to null
Update LARGE_PROPERTY SET BDRMS = null WHERE ADDRESS = '105 North Illinois Rd.'

-- Add to the LARGE_PROPERTY table a new character column named OCCUPIED that is one character in length.
-- (This column indicates whether the property is currently occupied) Set the value for the OCCUPIED column to all rows to Y
Alter TABLE LARGE_PROPERTY ADD OCCUPIED char(1)


