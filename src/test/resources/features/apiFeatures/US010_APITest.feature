
Feature: US_010_appointmentsList

  @US_10API
  Scenario: TC001 Appointments listesi
    Given Doktor  GET request gonderir appointments icin
    When  Doktor status codu 200 ile yanit alir dogrular
    Then  Doktor kendi ID ile mevcut Appointments'lari dogrular




