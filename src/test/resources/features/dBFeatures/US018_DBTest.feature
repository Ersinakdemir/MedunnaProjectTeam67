@TC_01807_Db
  Feature: User Validates SSN with DB
Scenario Outline: Validate a physician using DB

Given ADuser creates a connection with DB
And AD user sends the query to db and gets the user data with ssn number "<ssn>"
Then AD validates db registrant data  "<ssn>"

Examples: test data
|ssn|
|397-51-2256|
