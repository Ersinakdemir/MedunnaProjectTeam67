Feature: Test items Oluştur / Güncelle / Sil
  @testitemsGet
  Scenario: Admin test ögelerini Api ile görüntüleye bilir
    Given Ad kulanici test items icin get riquest olusturur
    And Ad kullanici test items icin validation yapar


  Scenario: Admin test items olusturabilmeli

    Given kullanici test items icin post request yapar
    Then kullanici test items icin post request validation yapar
