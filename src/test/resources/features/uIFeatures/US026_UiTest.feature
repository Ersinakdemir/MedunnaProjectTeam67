@US026


Feature: US026 İletisim Mesaji (Contact messages)

  Background: Anasayfa giris
    Given Hasta Medunna url Anasayfasina gider

  @US026TC001
  Scenario: TC001 Herhangi bir kullanici, bilgi almak icin "Contact portal" uzerinden istek gonderebilmeli

    Then  User Contact a Tıklar
    And   User Contact Sayfasini dogrular
    And   User Message Box a ilerler
    And   User Zorunlu alan Name bilgisi girer
    And   User Zorunlu alan Mail bilgisi girer
    And   User Zorunlu alan Subject bilgisi girer
    And   User Isterse Message bilgisi girebilir
    And   User Send e Tıklar ve message gonderir
    Then  User Your message has been received yazisini dogrulamali
