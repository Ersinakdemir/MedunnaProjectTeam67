@US025


Feature: US025 Hasta(Patient) Yeni Randevular olusturabilmeli

@US025TC001
  Scenario: TC001 Hasta(Patient) Sing in yaptiktan sonra Randevu olusturur

    Given Hasta Medunna url Anasayfasina gider
    Then  Hasta Dopdown menüyü Tıklar
    And   Hasta Signs in Butonuna Tıklar
    And   Hasta Username ve Password girer ve Sİng in Butona Tıklar
    And   Hasta başarılı giriş yaptığını dogrular
    And   Hasta MYPAGES ve devaminda Make Appointment ButtonaTıklar
    And   Hasta Make an Appointment Sayfasinda oldugunu ve  gorunurlugunu dogrular
    And   Hasta Make an Appointment Sayfasinda oldugunu ve  gorunurlugunu dogrular

    Given Hasta First Name girer
    Then  Hasta Last Name girer
    And   Hasta SSN Bilgisini girer
    And   Hasta E mail bilgisini girer
    And   Hasta Phone bilgisini girer
    And   Hasta Appointment DateTime 5 gun sonrası icin girer
    And   Hasta Send an Appointment Request Butonunu Tiklar
    And   Hasta Randevusunun basarili bir sekilde olustunu dogrular










