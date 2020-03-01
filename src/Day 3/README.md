## Day 3 Exercise (SQL & Databases)

### Before You Begin...

* If this is your first exercise, fork the root repository and clone the repo to your account with 
  ```
  git clone https://github.com/<YOUR_USERNAME>/GitCodingChallenges
  ```

* After cloning, make sure the remote is set to your account with:
  ```
  git remote -v
  ``` 
  which should return a link to the GitHub repository with your username in it

### Tasks

1. Go to https://sqliteonline.com

2.  In the file entitled `SQLite`, start the project by creating the relevant tables. 
You'll want to write SQL code to create the following:

##### Table 1: `Student`

| student_id    | full_name | major_code    |
| :---:         |   :---:   |   :---:       |
| INTEGER       |   TEXT    | INTEGER       |

##### Table 2: `Major`

| major_code    |   major_title |
| :---:         |   :---:       |
| INTEGER       |   TEXT        |

3. After the tables are created, insert 3 rows of data into both tables
(this can be mock data)
4. Perform a join on the two tables to produce a table that tells us `Student.student_id`,
`Student.full_name`, and `Major.major_title`

5. Copy all of your code and paste it into ```Day 3/Exercise.sql```. The code should start with
creating your tables, then inserting the data/records, and lastly executing your query

6. `add` this file, `commit` it, and then `push`

7. Open a pull request explaining what you've done

### SQL Guide

#### Creating/Dropping a table
* Create table      ```CREATE TABLE <Table>```
* Drop Table        ```DROP TABLE <Table>```

#### Manipulating a table
* Insert    ```INSERT INTO <Table> VALUES (<value>, <value>, ..., ,<value>)```

#### Querying
* Selecting   
    * All ```SELECT *```
    * 1 Attribute ```SELECT <Table Name>.<Attribute Name>```
    * 2+ Attributes ```SELECT <Table>.<Attribute>, <Table>.<Attribute>```
* From ```FROM <Table>```
* ON ```ON <Table>.<Attribute> = <Table>.<Attribute>```
* GROUP BY ```<Table>.<Attribute>```

#### Example

##### ***Table 1:*** `Passenger`

| passenger_id    | name | booking_number    |
| :---:         |   :---:   |   :---:       |
| INTEGER       |   TEXT    | INTEGER       |

##### ***Table 2:*** `Boarding`
| booking_number | seating | destination | class    |
| :---:         |   :---:   |   :---:       |   :---:   |
| INTEGER       |   TEXT    | TEXT       |    TEXT   |   

Sample Query:
```
SELECT Passenger.name, Boarding.*
    FROM Passenger INNER JOIN Boarding
        ON Passenger.booking_number = Boarding.booking_number
            GROUP BY Passenger.passenger_id;
```

(This query displays the passenger's name and all of their boarding information based on
a matching booking confirmation number which is unique for every passenger)

#### Result
| name  | booking_number | seating | destination | class    |
|:---:  | :---:         |   :---:   |   :---:       |   :---:   |
| TEXT  | INTEGER       |   TEXT    | TEXT       |    TEXT   |   

### Other Resources
* https://www.w3schools.com/sql/default.asp
