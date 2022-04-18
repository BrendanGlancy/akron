-- Use Sql statements to create the following database and use it for the subsequent queries.
-- Create a database named "Test2"
CREATE DATABASE Test2;
use Test2;

-- Create the following tables:
-- SAILORS (SailorID: char(5), FirstName varchar(30), LastName varchar(30),Gender char(1), Age numeric(3))
-- BOATS (BoatID: char(5), BoatName varchar(30), Color: char(15))
-- RESERVATIONS (SailorID: char(5), BoatID: char(5), ReserveDate: date, Deposit: numeric(9, 2))

Create table SAILORS (
  SailorID char(5),
  FirstName varchar(30),
  LastName varchar(30),
  Gender char(1),
  Age numeric(3)
);

-- create the BOATS table
Create table BOATS (
  BoatID char(5),
  BoatName varchar(30),
  Color char(15)
);

-- create the RESERVATIONS table
Create table RESERVATIONS (
  SailorID char(5),
  BoatID char(5),
  ReserveDate date,
  Deposit numeric(9, 2)
);

-- Insert the following values into the SAILORS table:
-- (SL101, Greg, Rusedski, M, 41)
-- (SL102, Monica, Johnson, F, 23)
-- (SL103, Ronald, Clark, M, 44)
insert into SAILORS values ('SL101', 'Greg', 'Rusedski', 'M', 41);
insert into SAILORS values ('SL102', 'Monica', 'Johnson', 'F', 23);
insert into SAILORS values ('SL103', 'Ronald', 'Clark', 'M', 44);

-- Insert the following values into the BOATS table:
-- (BT400, The Akron Cruiser, Blue)
-- (BT356, , Give and Take, Blue)
-- (BT211, Fair Play, Green)
insert into BOATS values ('BT400', 'The Akron Cruiser', 'Blue');
insert into BOATS values ('BT356', 'Give and Take', 'Blue');
insert into BOATS values ('BT211', 'Fair Play', 'Green');

-- Insert the following values into the RESERVATIONS table:
-- SL102, BT400, '2020-01-23', 2000.00
-- SL102, BT211, '2020-03-10', 1000.00
-- SL103, BT400, '2020-04-15', 500.00
insert into RESERVATIONS values ('SL102', 'BT400', '2020-01-23', 2000.00);
insert into RESERVATIONS values ('SL102', 'BT211', '2020-03-10', 1000.00);
insert into RESERVATIONS values ('SL103', 'BT400', '2020-04-15', 500.00);

-- Show the following tables: SAILORS, BOATS, RESERVATIONS
select * from SAILORS;
select * from BOATS;
select * from RESERVATIONS;

-- 1. List the First names, last names, and ages of sailors who are either over 40 years old or have their last names beginning with 'J'.
Select FirstName, LastName, Age from SAILORS where Age > 40 or LastName like 'J%';

-- 2. Find how many blue boats have been reserved.
SELECT COUNT(*) FROM RESERVATIONS INNER JOIN BOATS ON RESERVATIONS.BoatID = BOATS.BoatID WHERE BOATS.Color = 'Blue';

-- 3. Show the first name and last name of the sailor who deposited more than the average deposite for all boat reservations.
Select FirstName, LastName from SAILORS where SailorID in (Select SailorID from RESERVATIONS where Deposit > (Select avg(Deposit) from RESERVATIONS));

-- 4. What is the color of the boat that has not yet been reserved?
Select Color from BOATS where BoatID not in (Select BoatID from RESERVATIONS);

-- 5. List the first names and last names of every sailor regardless of whether they reserved a boat or not and include the reservation date and deposit for the boat reservations.
Select FirstName, LastName, ReserveDate, Deposit from SAILORS left join RESERVATIONS on SAILORS.SailorID = RESERVATIONS.SailorID;

-- 6. Show the first name and last name of the sailor who reserved both blue and green boats.
SELECT DISTINCT S.FirstName, S.LastName
FROM SAILORS S, BOATS B1, RESERVATIONS R1, RESERVATIONS R2, BOATS B2
Where S.SailorID = R1.SailorID
And R1.BoatID = B1.BoatID
AND S.SailorID = R2.SailorID
AND R2.BoatID = B2.BoatID
AND B1.Color = 'Blue'
AND B2.Color = 'Green';



-- 7. Find the names of the boats that were either reserved between 01/23/2020 and 03/10/2020 or reserved by the sailor named Ronald Clark.
-- Check for Ronald Clark not his sailor id
SELECT DISTINCT B.BoatName
FROM BOATS B, RESERVATIONS R, SAILORS S
WHERE B.BoatID = R.BoatID
AND S.SailorID = R.SailorID
OR S.FirstName = 'Ronald'
AND R.ReserveDate BETWEEN '2020-01-23' AND '2020-03-10';



-- 8.Assuming all sailors are supposed to pay an additional 20% on deposits for boat reservations,
-- list the first names and last names of all the sailors who have reserved boats.
-- Also include the boat names and the current deposit
-- (deposit plus the 20% increase on the deposit) each sailor is supposed to pay.
SELECT DISTINCT S.FirstName, S.LastName, B.BoatName, R.Deposit + R.Deposit * 0.2 as TotalDeposit
FROM SAILORS S, BOATS B, RESERVATIONS R
WHERE S.SailorID = R.SailorID
AND B.BoatID = R.BoatID;



-- 9. Create a table named MaleSailors based on the SAILORS table schema
Create table MaleSailors (
  SailorID char(5),
  FirstName varchar(30),
  LastName varchar(30),
  Gender char(1),
  Age numeric(3)
);

-- 10. Insert all the male sailors into the MaleSailors table by retrieving the records from the Sailors table
Insert into MaleSailors (SailorID, FirstName, LastName, Gender, Age)
Select SailorID, FirstName, LastName, Gender, Age From SAILORS where Gender = 'M';

-- 11. Change Greg Rusedski age to 42 in the MaleSailors table.
Update MaleSailors set Age = 42 where FirstName = "Greg";

-- 12. Add a height field to the MaleSailors table use the char(4) to accept nulls
alter table MaleSailors add height char(4);

-- 13. Create a view named FemaleSailors to include the female sailors from the SAILORS table
Create View FemaleSailors as
Select * from SAILORS where Gender = "F";
