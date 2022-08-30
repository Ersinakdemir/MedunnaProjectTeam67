@US027

Feature:US027 Messages by Admin Validate with API

  Background:The user goes to Medunna URL and the messages
    Given The User goes to Medunna URL
    Then The user navigates the sign in the page
    And The user clicks on the sign-in button
    And The user fills the Username box
    And The user fills the Password box
    And The user clicks on the sign-in button below the page
    And The user clicks on the temsAndTitles that consist of the dropdown
    And The user clicks on the messages in the dropdown

  Scenario:TC_001 Admin can go to messages portal and view all messages, their authors and emails
    Then The user verifies that the messages portal consist of all messages, their authors and emails

  Scenario:TC_002 Admin can create a messages
    And The user clicks on the create a new message
    And The user fills the Name box
    And The user fills the Email box
    And The user fills the Subject box
    And The user fills the Message box
    And The user clicks on the save button
    Then The user verifies that the message has been created

  Scenario:TC_003 Admin can update a message
    And The user clicks on the ID
    And The user clicks on the Edit box
    And The user clicks on the Name box
    And The user fills the Email box for update
    And The user fills the Subject box for update
    And The user fills the Message box for update
    And The user clicks on the save button for update
    Then The user verifies that the message has been updated

  Scenario:TC_004 Admin can delete a message
    And The user clicks on the ID
    And The user clicks on the Delete button
    And The user clicks on the second Delete button
    Then The user verifies that the message has been deleted














