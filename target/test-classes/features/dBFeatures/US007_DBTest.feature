@DBAppointmentTest @E2E
Feature: DB Appointment test

  Scenario: db validation
    Given ADuser creates a connection with DB
    Given ADuser gets the "id" from "appointment" table
      # Select * from appointment
    And ADuser verify "appointment" table   "id" column contains "184275"
      # And verify "appointment" table "start_date" column contains "2022-01-16 00:00:00"
    Then ADuser close DB connection

