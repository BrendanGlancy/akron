-- mysql KIMTAY SCHEMA
DROP TABLE IF EXISTS SALES_REP;
CREATE TABLE SALES_REP
(
   REP_ID CHAR(2) PRIMARY KEY,
   FIRST_NAME VARCHAR(20),
   LAST_NAME VARCHAR(20),
   ADDRESS VARCHAR(20),
   CITY VARCHAR(15),
   STATE CHAR(2),
   POSTAL CHAR(5),
   CELL_PHONE CHAR(12),
   COMMISSION DECIMAL(7,2),
   RATE DECIMAL(3,2)
);


insert into sales_rep values('05','Susan','Garcia',  '42 Mountain Ln','Cody',     'WY', '82414', '307-824-1245', 12743.16,	0.04);      
insert into sales_rep values('10','Richard','Miller','87 Pikes Dr',   'Ralston',  'WY', '82440', '307-406-4321', 20872.11,	0.06);     
insert into sales_rep values('15','Donna','Smith',   '312 Oak Rd',    'Powell',	  'WY', '82440', '307-982-8401', 14912.92,	0.04);          
insert into sales_rep values('20','Daniel','Jackson','19 Lookout Dr', 'Elk Butte','WY', '82433', '307-883-9481', 0.00,     	0.04);        


DROP TABLE IF EXISTS CUSTOMER;
CREATE TABLE CUSTOMER
(
   CUST_ID CHAR(3) PRIMARY KEY,
   FIRST_NAME VARCHAR(20),
   LAST_NAME VARCHAR(20),
   ADDRESS VARCHAR(20),
   CITY VARCHAR(15),
   STATE CHAR(2),
   POSTAL CHAR(5),
   EMAIL VARCHAR(30),
   BALANCE DECIMAL(7,2),
   CREDIT_LIMIT DECIMAL (7,2),
   REP_ID CHAR(2)
);

INSERT INTO CUSTOMER VALUES('125','Joey'    ,'Smith',     '17 Fourth St',      'Cody',     'WY','82414','jsmith17@example.com',    80.68 ,500.00   ,'05');              
INSERT INTO CUSTOMER VALUES('182','Billy'   ,'Rufton',    '21 Simple Cir',     'Garland',  'WY','82435','billyruff@example.com',   43.13 ,750.00   ,'10');              
INSERT INTO CUSTOMER VALUES('227','Sandra'  ,'Pincher',   '53 Verde Ln',       'Powell',   'WY','82440','spinch2@example.com',     156.38,500.00   ,'15');              
INSERT INTO CUSTOMER VALUES('294','Samantha','Smith',     '14 Rock Ln',        'Ralston',  'WY','82440','ssmith5@example.com',     58.60 ,500.00   ,'10');              
INSERT INTO CUSTOMER VALUES('314','Tom'     ,'Rascal',    '1 Rascal Farm Rd',  'Cody',     'WY','82414','trascal3@example.com',    17.25 ,250.00   ,'15');              
INSERT INTO CUSTOMER VALUES('375','Melanie' ,'Jackson',   '42 Blackwater Way', 'Elk Butte','WY','82433','mjackson5@example.com',   252.25,250.00   ,'05');              
INSERT INTO CUSTOMER VALUES('435','James'   ,'Gonzalez',  '16 Rockway Rd',     'Wapiti',   'WY','82450','jgonzo@example.com',      230.40,1000.00  ,'15');              
INSERT INTO CUSTOMER VALUES('492','Elmer'   ,'Jackson',   '22 Jackson Farm Rd','Garland',  'WY','82435','ejackson4@example.com',   45.20 ,500.00   ,'10');              
INSERT INTO CUSTOMER VALUES('543','Angie'   ,'Hendricks', '27 Locklear Ln',    'Powell',   'WY','82440','ahendricks7@example.com', 315.00,750.00   ,'05');              
INSERT INTO CUSTOMER VALUES('616','Sally'   ,'Cruz',      '199 18th Ave',      'Ralston',  'WY','82440','scruz5@example.com',      8.33  ,500.00   ,'15');              
INSERT INTO CUSTOMER VALUES('721','Leslie'  ,'Smith',     '123 Sheepland Rd',  'Elk Butte','WY','82433','lsmith12@example.com',    166.65,1000.00  ,'10');              
INSERT INTO CUSTOMER VALUES('795','Randy'   ,'Blacksmith','75 Stream Rd',      'Cody',     'WY','82414','rblacksmith6@example.com',61.50 ,500.00   ,'05');              

DROP TABLE IF EXISTS ITEM;
CREATE TABLE ITEM
(
   ITEM_ID  CHAR(4) PRIMARY KEY,
   DESCRIPTION VARCHAR(30),
   ON_HAND NUMERIC,
   CATEGORY CHAR(3),
   LOCATION CHAR(1),
   PRICE DECIMAL(7,2)
);
                                                     
INSERT INTO ITEM VALUES('AD72','Dog Feeding Station'           ,'12','DOG','B',79.99 );
INSERT INTO ITEM VALUES('BC33','Feathers Bird Cage (12x24x18)' ,'10','BRD','B',79.99 );
INSERT INTO ITEM VALUES('CA75','Enclosed Cat Litter Station'   ,'15','CAT','C',39.99 );
INSERT INTO ITEM VALUES('DT12','Dog Toy Gift Set'              ,'27','DOG','B',39.99 );
INSERT INTO ITEM VALUES('FM23','Fly Mask with Ears'            ,'41','HOR','C',24.95 );
INSERT INTO ITEM VALUES('FS39','Folding Saddle Stand'          ,'12','HOR','C',39.99 );
INSERT INTO ITEM VALUES('FS42','Aquarium (55 Gallon)'          ,'5','FSH','A',124.99);
INSERT INTO ITEM VALUES('KH81','Wild Bird Food (25 lb)'        ,'24','BRD','C',19.99 );
INSERT INTO ITEM VALUES('LD14','Locking Small Dog Door'        ,'14','DOG','A',49.99 );
INSERT INTO ITEM VALUES('LP73','Large Pet Carrier'             ,'23','DOG','B',59.99 );
INSERT INTO ITEM VALUES('PF19','Pump & Filter Kit'             ,'5','FSH','A',74.99 );
INSERT INTO ITEM VALUES('QB92','Quilted Stable Blanket'        ,'32','HOR','C',119.99);
INSERT INTO ITEM VALUES('SP91','Small Pet Carrier'             ,'18','CAT','B',39.99 );
INSERT INTO ITEM VALUES('UF39','Underground Fence System'      ,'7','DOG','A',199.99);
INSERT INTO ITEM VALUES('WB49','Insulated Water Bucket'        ,'34','HOR','C',79.99 );
                               
DROP TABLE IF EXISTS INVOICES;
CREATE TABLE INVOICES
(
    INVOICE_NUM CHAR(5) PRIMARY KEY,
    INVOICE_DATE DATE,
    CUST_ID VARCHAR(3)
);


INSERT INTO INVOICES VALUES('14216','2021-11-15','125');      
INSERT INTO INVOICES VALUES('14219','2021-11-15','227');      
INSERT INTO INVOICES VALUES('14222','2021-11-16','294');      
INSERT INTO INVOICES VALUES('14224','2021-11-16','182');      
INSERT INTO INVOICES VALUES('14228','2021-11-18','435');      
INSERT INTO INVOICES VALUES('14231','2021-11-18','125');      
INSERT INTO INVOICES VALUES('14233','2021-11-18','435');      
INSERT INTO INVOICES VALUES('14237','2021-11-19','616');      


DROP TABLE IF EXISTS INVOICE_LINE;
CREATE TABLE INVOICE_LINE
(
   INVOICE_NUM CHAR(5),
   ITEM_ID CHAR(4),
   QUANTITY NUMERIC,
   QUOTED_PRICE DECIMAL(7,2),
   PRIMARY KEY (INVOICE_NUM, ITEM_ID)
);

INSERT INTO INVOICE_LINE VALUES('14216','CA75',3,37.99 );               
INSERT INTO INVOICE_LINE VALUES('14219','AD72',2,79.99 );               
INSERT INTO INVOICE_LINE VALUES('14219','DT12',4,39.99 );               
INSERT INTO INVOICE_LINE VALUES('14222','LD14',1,47.99 );               
INSERT INTO INVOICE_LINE VALUES('14224','KH81',4,18.99 );               
INSERT INTO INVOICE_LINE VALUES('14228','FS42',1,124.99);               
INSERT INTO INVOICE_LINE VALUES('14228','PF19',1,74.99 );               
INSERT INTO INVOICE_LINE VALUES('14231','UF39',2,189.99);               
INSERT INTO INVOICE_LINE VALUES('14233','KH81',1,19.99 );               
INSERT INTO INVOICE_LINE VALUES('14233','QB92',4,109.95);               
INSERT INTO INVOICE_LINE VALUES('14233','WB49',4,74.95 );               
INSERT INTO INVOICE_LINE VALUES('14237','LP73',3,54.95 ); 


COMMIT;                                      