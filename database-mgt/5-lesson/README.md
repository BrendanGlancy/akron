# Notes

First went over test 1 practical

Idc about getting all of these
```sql
Select Boat WHERE color='Blue'
Select Sailor WHERE age>40
Select Boat WHERE Reservation between 01-23-2019 AND 03-10-2019
Select Reservation where bid='BT356' GIVING B1
Join B1, Sailor where b1.Sid = Sailor.Sid giving B2

Select Boat WHERE color='Blue' GIVING C1
Join C1, Reservation where C1.bid = Reservation.Sid giving C2
Join C2, Sailor where C2.sid = Sailor.sid giving C3
Project C3 over sname giving Ans5

Select Boat where bname = "Fair Play" giving D1
Join D1, Reservation where D1.bid = Reservation.Bid

Select Boat where Color='Blue' OR Color='Pink' giving E1
Join E1, Reservation where E1.bid = Reservation.Bid giving E2
Join E2, Sailor where E2.side = Sailor.sid giving E3
Project E3 over (sid, sname) Giving Ans7
```
