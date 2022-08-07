@US003
Feature: Registration sayfasında güçlü şifre girilmeli ve "Password strength" seviyeleri görülebilmelidir.


  Scenario Outline:
    Given FY User navigates to Medunna home page
    And FY User clicks on human icon
    And FY User clicks on Register button

    Examples: test data
      | password | strength |
      | qwertyU  | 2        |
      | asdfgh1  | 2        |
      | zxcvbn@  | 2        |
      | zxcvbn?  | 2        |
      | 123456a  | 2        |
      | ABCDEFg  | 2        |
      | ?&!.$%a  | 2        |
      | ?&!.$%B  | 2        |
      | ?&!.$%7  | 2        |
      | 1234Ab!  | 5        |
      | abcDE1@  | 5        |