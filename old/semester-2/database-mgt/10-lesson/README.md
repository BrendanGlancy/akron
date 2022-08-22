# ER Diagrams and Database Design Language DBDL

An ER diagram depicts entities (tables) and lines to represent the relationships between the tables.

ERM - entity-relationship model

## Database schema
- A database schema is a blueprint or architecture of how our data will look.
- It doesn't hold data itself, but instead describes the shape of the data and how it might relate to other tables or models. An entry in our database will be an instance of the database schema. It will contain all of the properties described in the schema.


## Ideal requirements for schema integration
- Overlap preservation
  - Each of the overlapping elements specified in the input mapping is also in a database schema relation.
- Extended overlap preservation
  - Source-specific elements that are associated with a source's overlapping elements are passed through to the database schema.
- Normalization
  - Independent entities and relationships in the source data should not be grouped together in the same relation in the database schema. In particular, source specific schema elements should not be grouped with overlapping schema elements, if the grouping co-locates independent entities or relationships
- Minimality
  - If any element of the database schema are dropped then the database schema is not ideal.


## Example of two schema integrations

Suppose we want to mediate schema to integrate two travel databases, Go-travel and Ok-flight.

`Go-Travel` has two relations:

```
Go-flight(flight-number, time, meal(yes/no))
Go-price(flight-number, date, price)
```

`Ok-flight` has just one relation:

```
Ok-flight(flight-number, date, time, price, nonstop(yes/no))
```

The overlapping information in Go-travel's and Ok-flight's schemas could be represented in a mediated schema.

`Flight(flight-number, date, time, price)`

### Relationships
- `One-to-one` relationships associate one record in one table with a single record in the other table.
- `One-to-many` relationships associate one record in one table with many records in the other table.
- `Many-to-many` relationships occurs when multiple records in a table are associated with multiple records in another table.

Do the exercise on ERM
