@US004
Feature: US004 Login page should accessible only with valid credentials

  Scenario: TC01 There should be a valid username and password validating the success message to login
    Given The User goes to Medunna URL
    Then  The user navigates the sign in the page
    Then   The user clicks on the sign-in button
    And The user fills the Username box
    And The user fills the Password box
    And   The user clicks on the sign-in button below the page
    Then  The user verifies sign-in is done successfully

  Scenario Outline:TC02 There should be a valid username and password validating the success message to login (Negative Scenario)
    Given The User goes to Medunna URL
    Then  The user navigates the sign in the page
    Then   The user clicks on the sign-in button
    And  The user fills the "<Username>" with a wrong data
    And The user fills the "<Password>" box
    And The user clicks on the sign-in button below the page
    Then The user verifies sign-in isn't done successfull

    Examples:
      |  Username    | Password |
      |AdminMurat4   |123qscaA...|
      |StaffMurat4   |123qscaA...|
      |PhysicinMurat4|123qscaA...|

  Scenario: TC03 There should be a "Remember me" option where user can always use their existing credentials
    Given The User goes to Medunna URL
    Then  The user navigates the sign in the page
    Then   The user clicks on the sign-in button
    And The user fills the Username box
    And The user fills the Password box
    Then The user tests that the remember me button can be clicked

  Scenario: TC04 There should be an option to update password if it is  forgotten ' Did you forget your password'
    Given The User goes to Medunna URL
    Then  The user navigates the sign in the page
    Then   The user clicks on the sign-in button
    Then The user verifies that the phrase of the "Did you forget your password?"  exists

  Scenario: TC05 There should be an option to navigate to registration page if not registered yet
    Given The User goes to Medunna URL
    Then  The user navigates the sign in the page
    Then   The user clicks on the sign-in button
    Then The user verifies that the phrase of the "You don't have an account yet? Register a new account" exists

  Scenario: TC06 There should be an option to cancel login
    Given The User goes to Medunna URL
    Then  The user navigates the sign in the page
    Then   The user clicks on the sign-in button
    Then The user verifies that "cancel" button exists on the page
