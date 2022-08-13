@RoomApi
Feature: Room get

  Scenario: Room api testi
    Given kullanici roomlar icin get request yapar
    And  kullanici gelen room datayi serealisation yapar
    Then kullanici room datasini valide eder