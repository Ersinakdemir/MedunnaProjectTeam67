Feature: Appointment Api Test

  @ApiAppointment @E2E
  Scenario: Appointment Api Testing

    Given AD user set path params
    Given AD user enter expected data FirstName LastName SSN Email Phone Date
    And AD user send request and get response
    Then AD user save API data to file
    And AD user verify  API data