@US003
Feature: Registration sayfasında güçlü şifre girilmeli ve "Password strength" seviyeleri görülebilmelidir.

  @US003_@TC001,@TC002,@TC003,@TC004,@TC005
  Scenario Outline:
    Given AD User navigates to Medunna home page
    And AD User clicks on human icon
    And AD User clicks on Register button
    And AD User provides the new password "<password>"
    Then AD User validates the password strength "<strength>"

    Examples: test data
      | password | strength |
      | qwertyU  | 2        |
      | asdfgh1  | 2        |
      | zxcvbn@  | 2        |
      | 123456a  | 2        |
      | ABCDEFg  | 2        |
      | ?&!.$%a  | 2        |
      | ?&!.$%B  | 2        |
      | ?&!.$%7  | 2        |
      | qwertyU! | 4        |
      | 1234Ab!  | 5        |
      | abcDE1@  | 5        |


