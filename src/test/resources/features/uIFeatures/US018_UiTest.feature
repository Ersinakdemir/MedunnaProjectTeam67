@US018
Feature: US_018 Create new Physicians /Update existing Physicians /View and Delete Physicians by admin/Do the validation with API


  Scenario Outline: Admin can choose/search an existing registered person by SSN id
    Given AD navigate to Medduna Home Page
    When AD Click on Account DropDownMenu button
    When AD Click on Sign in
    Then AD Click on Username input box.
    Then AD Enter Valid "<username>" Username
    Then AD Click on Password input box.
    Then AD Enter Valid "<password>" Password
    Then AD Click on Sign in button
    And AD click on Item&Titles DropDownMenu and select Physician
    And AD click on new physician button
    And AD click on Use Search checkbox.
    And AD Click on SSN text box
    And AD Enter the "<Ssn>" number and click search user button
    And AD Verify that User found with search SSN message is displayed

    Examples:
      | Ssn         | username    | password     |
      | 123-12-1233 | AdminMurat44 | 123qscaA... |


  @TC_01802
  Scenario Outline: Admin can view all Physicians' info populated on view portal
    Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter Valid "<username>" Username
    Then C Click on Password input box.
    Then C Enter Valid "<password>" Password
    Then C Click on Sign in button
    And click on Item&Titles DropDownMenu and select Physician
    And Verify that Physicians' info  is visible
    And click on View Button


    Examples:
      | username    | password        |
      | AdminMurat44 | 123qscaA... |

  @TC_01803
  Scenario Outline: Admin can edit existing Physicians' info using new data/Speciality/Picture/ExamFee
    Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter Valid "<username>" Username
    Then C Click on Password input box.
    Then C Enter Valid "<password>" Password
    Then C Click on Sign in button
    And click on Item&Titles DropDownMenu and select Physician
    And click Edit Button
    And should provide speciality as Nuclear Medicine
    And Admin can provide a profile picture of the doctor
    And Admin should provide the "<examFee>" of the doctor
    And click on Save Button
    And Verify that A phyisician is updated message is displayed

    Examples:
      | username    | password        | examFee |
      | AdminMurat44 | 123qscaA... | 450     |

  @TC_01804
  Scenario Outline: Admin can delete existing Physicians
    Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter Valid "<username>" Username
    Then C Click on Password input box.
    Then C Enter Valid "<password>" Password
    Then C Click on Sign in button
    And click on Item&Titles DropDownMenu and select Physician
    And Verify that Physicians' info  is visible
    And click on Delete Button
    And  Verify Confirm delete operation message is displayed

    Examples:
      | username    | password        |
      | admincemile | AdminCemile123! |

  @TC_01805
  Scenario Outline: Admin should choose the doctor among existing users
    Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter Valid "<username>" Username
    Then C Click on Password input box.
    Then C Enter Valid "<password>" Password
    Then C Click on Sign in button
    And click on Item&Titles DropDownMenu and select Physician
    And Verify that Physicians Page Header is visible

    Examples:
      | username    | password        |
      | admincemile | AdminCemile123! |





