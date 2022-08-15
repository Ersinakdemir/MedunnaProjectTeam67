Feature: appointement test

  @AppointementGet
  Scenario: appointement data read
    Given Kullanici appointement icin get request yapar
    And Kullanici appointement bilgileri de-serialisation eder
    Then Kullanici appointment bilgilerini valide eder
