# Multiple Table Queries

Joining multiple tables

```sql
SELECT TableA.*, TableB.*, TableC.*, TableD.*
FROM TableA
    JOIN TableB
        ON TableB.aID = TableA.aID
    JOIN TableC
        ON TableC.cID = TableB.cID
    JOIN TableD
        ON TableD.dID = TableA.dID
WHERE DATE(TableC.date)=date(now())
```
