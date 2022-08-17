@RoomApi
Feature: Room get

  Scenario: Room api testi
    Given kullanici roomlar icin get request yapar
    And  kullanici gelen room datayi serealisation yapar
    Then kullanici room datasini valide eder

  @RoomPost
  Scenario: Post request validation
    Given Kullanici Roomlar icin post request yapar
    Then kullanici post request validation yapar

  @PutRequest
  Scenario: put request roomlar icin
    Given  kullanici roomlar icin put request yapar
    Then kullanici put request validation yapar

  @DeleteRequest
  Scenario Outline: Delet request roomlar icin
    Given kullanici silinecek roomlar icin "<id>" ile delet request ister
    Then kullanici delet requesti validation yapar

    Examples:
      | id |
      |180689|
