# Types of querying

- SQL
- QBE

## Models

- Hierarchical Model
- Network Model
- Relational Model
- OOP model

**Test is take home on friday**

# Creating Databases and tables

Example of creating a table

```sql
CREATE TABLE departments (
        id              serial,
        name            varchar(255) NOT NULL UNIQUE,
        CONSTRAINT pk_departments_id PRIMARY KEY (id)
 );
```

Example of starting a postgresql database

```sh
#!/bin/bash
BASEDIR=$(dirname $0)
createdb -U postgres db_management &&
psql -U postgres -d db_management -f "$BASEDIR/SQL10e_Module3_KIMTAY_SCRIPT_ORACLE.sql"
```

Example of putting data into a blank database

```sql
INSERT INTO CUSTOMER VALUES('125','Joey'    ,'Smith',     '17 Fourth St',      'Cody',     'WY','82414','jsmith17@example.com',    80.68 ,500.00   ,'05');
INSERT INTO CUSTOMER VALUES('182','Billy'   ,'Rufton',    '21 Simple Cir',     'Garland',  'WY','82435','billyruff@example.com',   43.13 ,750.00   ,'10');
INSERT INTO CUSTOMER VALUES('227','Sandra'  ,'Pincher',   '53 Verde Ln',       'Powell',   'WY','82440','spinch2@example.com',     156.38,500.00   ,'15');
INSERT INTO CUSTOMER VALUES('294','Samantha','Smith',     '14 Rock Ln',        'Ralston',  'WY','82440','ssmith5@example.com',     58.60 ,500.00   ,'10');
```
