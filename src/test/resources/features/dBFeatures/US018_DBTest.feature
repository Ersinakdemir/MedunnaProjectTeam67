Feature:
Scenario Outline: Validate a physician using DB

Given MKT user creates a connection with db
And MKT user sends the query to db and gets the user data with ssn number "<ssn>"
Then MKT validates db registrant data  "<ssn>"

Examples: test data
|ssn|
|397-51-2256|
