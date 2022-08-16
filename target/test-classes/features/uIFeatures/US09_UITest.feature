Feature: US_09         Staff (Personel),
  hasta bilgilerini görebilmeli, düzenleyebilmeli ve silememelidir.

  Scenario: Staff (Personel)hasta bilgilerini görebilmeli

    Given "medunna.com" sayfasina gidilir
    When  Sing in segmesinden Staff olarak baglanilir
    Then  My Pages sekmesine tiklanip
    And   In Patient e tiklanir
    And   Gidilen sayfada Hasta bilgilerinin Görünür oldugu nu test eder


    Scenario: Kullanici tüm hasta bilgilerini test edebilmeli

      Given "medunna.com" sayfasina gidilir
      When  Sing in segmesinden Staff olarak baglanilir
      Then  My Pages sekmesine tiklanip
      And   4- In Patient e tiklanir
      And   Gidilen sayfada bir Patient in edit kismina tiklanir
      And   id, firstname, lastname, birthdate, email, phone, gender, blood group,address, description, user, country and state/city bilgiler güncellenir ve kaydedilir
      And   Save tiklanarak yapilan degisiklikler kaydedilir
      And   Kayit dan sonra gelen sayfada degisikliklerin kaydedilip kaydedilmedigi test edilir
