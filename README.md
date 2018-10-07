# readQueryFromSQL
This code let you read sql query from sql file using key-value pair in Java Program.

## Getting Started
If your java program need SQL query then you can keep your all query in a seperate sql file rather than writing it with your code.It will make your code look less messy.

## Instruction
Keep your query in a sql file as in ```db.sql``` file.Format is  query name as key followed by a space followed by query. If your query has more than one line add ```"\"``` at the end of line and start with the rest of query from next line. make sure there are no spaces or any character after ```"\"``` in case for multi line query.
method ```getQuery``` takes one input paramter queryname and return the corresponding query stored in sql file.

