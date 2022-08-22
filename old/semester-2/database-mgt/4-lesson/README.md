# SQL Single table Queries

## Objectives
- Retrieive data from a database using SQL commands
- Use simple and compound conditions in queries
- Use BETWEEN, LIKE, and IN operators in queries
- Use computed columns in queries
- Sort data using the ORDER BY clause
- Sort data using multiple keys and in ascending and descending order
- Use aggregate functions in a query
- Use subqueries
- Group data using the GROUP BY clause
- Selecte individual groups of data using the HAVING clause
- Retrieve columns with null values

## Constructing Simple queries
- Select-From-Where statement
    - Basic form of SELECT command
- Select clause
    - Portion of the command that follows the word SELECT
    - Columns to be included in the query results
- From clause
    - Portion of the command that follows the word SELECT
    - Name of the table containing data to be queried
- Where clause
    - Conditions to be applied to data retrieved
    - Optional

## Example

```Sql
--     | Columns to be included in the query | Data will come from custom table
SELECT CUST_ID, FIRST_NAME, LAST_NAME, BALANCE FROM CUSTOMER
```

- Listing a complete table
    - Use an asterick (*)  to indicate all columns in the SELECT clause
    - The result will list all columns in the order used when table was created
    - List specific columns in SELECT clause to present columns in a different order

## Comparison Operators Used in SQL command

| Comparison operator   | Description  |
|--------------- | --------------- |
| `=`   | Equal to   |
| `>`   | Less than   |
| `<`   | Greater than   | \>
| `<=`    | Less than or equal to   | \>
| `>=`  | Greater than or equal to  |
| `<>`   | Not equal to  |

## Example of using a comparison operator

```SQL
-- returns first name, last name and balance of customers where their balance is greater than their Credit limit
Select FIRST_NAME, LAST_NAME, BALANCE, CREDIT_LIMIT From CUSTOMER
    Where BALANCE > CREDIT_LIMIT
```

## Compound Conditions
- Compound conditions
    - Connect two or more simple conditions with AND, OR, and NOT operators
- ADD operator:
    - All simple condtions must be true
- OR operator:
    - One simple conditon must be true
- NOT operator:
    - Reverses the truth of original condition

## Using the LIKE operator
- Used for pattern matching
- Used along with a wildcard symbol
    - Example: LIKE %Rock% will retrieve data with those characters
- Underscore (_) represents any single character
    - Example "T_m" for Tim or Tom or T3m

```sql
Select CUST_ID, FIRST_NAME, LAST_NAME, ADDRESS, CITY, STATE, POSTAL
    FROM CUSTOMER
        WHERE (ADDRESS LIKE %Rock%)
```
- GROUP BY is used to group data
- HAVING is used to restrict the output to certain groups
- IS NULL and IS NOT NULL are used in WHERE CLAUSE


## Better examples not included in Enoch Damsons notes

---

**Example of a subquery**

```sql
-- What is the ITEM_ID, DESCRIPTION, and price of the least expensive item in the database
SELECT ITEM_ID, DESCRIPTION, PRICE from ITEM where PRICE = (SELECT MIN(PRICE) from ITEM);
```

---

# Example of aggregate functions


| Function   | Description    |
|--------------- | --------------- |
| AVG   | Calculates the average value in a column   |
| COUNT   | Determines the number or rows in a table   |
| MAX   | Deteremines the maximum value in a column   |
| MIN   | Deteremines the minimum value in a column  |
| SUM   | Calculates the total of the values in a column  |

---

```sql
-- How many customers have balances taht are more than their credit limit
SELECT COUNT(*) from CUSTOMER where BALANCE > CREDIT_LIMIT;

-- Find the total number of the balances for all customers represented by REP_ID 10, with balances that are less than their credit limits
SELECT SUM(BALANCE) from CUSTOMER where REP_ID = 10 and BALANCE < CREDIT_LIMIT;

-- What is the price of the least expensive item in the database
SELECT MIN(PRICE) from ITEM;
```


