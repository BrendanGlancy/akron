create table SUMMER_SCHOOL_RENTALS(
    PROPERTY_ID decimal(10, 0) primary key,
    OFFICE_NUM decimal(10, 0),
    ADDRESS varchar(100),
    SQR_FT smallint,
    FLOORS tinyint,
    WEEKLY_RENT smallint,
    OWNER_NUM char(5)
);

INSERT INTO SUMMER_SCHOOL_RENTALS VALUES(
    '13',
    '1',
    '5867 Goodwin Ave',
    '1650',
    '1',
    '400',
    'CO103'
);

DROP TABLE IF EXISTS SUMMER_SCHOOL_RENTALS;
SHOW TABLES;
