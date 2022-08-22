CREATE TABLE REP (
    REP_ID char(2) PRIMARY KEY,
    FIRST_NAME varchar(20),
    LAST_NAME varchar(20),
    ADDRESS varchar(20),
    CITY varchar(15),
    STATE char(2),
    POSTAL char(5),
    CELL_PHONE char(12),
    COMMISSION decimal(7,2),
    RATE decimal(3,2)
);

INSERT INTO REP (REP_ID, FIRST_NAME, LAST_NAME, ADDRESS, CITY, STATE, POSTAL, CELL_PHONE, COMMISSION, RATE)
Values (35, 'Kiser', 'Fred', '427 Billing Dr.', 'Cody', 'WY', '82414', '307-555-6309', 0.00, 0.05);

Select * from REP;
Drop table REP;

SHOW TABLES;
