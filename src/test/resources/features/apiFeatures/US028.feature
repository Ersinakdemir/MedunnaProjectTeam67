Feature: Ulke ve Eyalet icin api get/post request testi

  @ulkeGet
  Scenario: TC05_Ulke get api testi
    Given Kullanici ulkeler icin get request yapar
    And Kullanici gelen ulkeler datasini de-serealisation yapar
    Then Kullanici eklenen ulkeleri ulkeler datasindan valide eder

  @ulkePost
  Scenario:TC06_Ulke post api testi
    Given Kullanici eklenecek ulke icin post request yapar
    Then Kullanici post request validasyonu yapar

  @ulkeDelet
  Scenario Outline: : Delet request ulkeler icin
    Given kullanici silinecek ulke icin "<id>" ile delet request ister
    Then kullanici delet requesti validation yapar

    Examples:
      |id|
      |77109|

  @eyaletGet
  Scenario: TC07_Eyalet post api testi
    Given Kullanici eyalet icin get request yapar
    And Kullanici gelen eyalet datasini de-serealisation yapar
    Then Kullanici eklenen eyaleti eyaletler  datasindan valide eder

  @eyaletPost
  Scenario:TC08_Eyalet post api testi
    Given Kullanici eklenecek eyalet icin post request yapar
    Then Kullanici eyalet icin post request validasyonu yapar

  @eyaletDelet
  Scenario Outline: Delet request eyalet icin
    Given kullanici silinecek eyalet icin "<id>" ile delet request ister
    Then kullanici delet requesti validation yapar

    Examples:
      |id|
      |1071|