@US025


Feature: US025 Hasta(Patient) Yeni Randevular olusturabilmeli

  Background: Anasayfa giris
    Given Hasta Medunna url Anasayfasina gider

@US025TC001
  Scenario: TC001 Hasta(Patient) Sing in yaptiktan sonra ileri tarihli bir Randevu olustururabilmeli


    Then  Hasta Dopdown menüyü Tıklar
    And   Hasta Signs in Butonuna Tıklar
    And   Hasta Username ve Password girer ve Sİng in Butona Tıklar
    And   Hasta başarılı giriş yaptığını dogrular
    And   Hasta MYPAGES ve devaminda Make Appointment ButtonaTıklar
    And   Hasta Make an Appointment Sayfasinda oldugunu ve  gorunurlugunu dogrular
    Given Hasta First Name girer
    Then  Hasta Last Name girer
    And   Hasta SSN Bilgisini girer
    And   Hasta E mail bilgisini girer
    And   Hasta Phone bilgisini girer
    And   Hasta Appointment DateTime 5 gun sonrası icin girer
    And   Hasta Send an Appointment Request Butonunu Tiklar
    And   Hasta Randevusunun basarili bir sekilde olustunu dogrular


  @US025TC002
  Scenario: TC002 Hasta(Patient) Sing in yaptiktan sonra gecmis tarihli Randevu olusturamamali


    Then  Hasta Dopdown menüyü Tıklar
    And   Hasta Signs in Butonuna Tıklar
    And   Hasta Username ve Password girer ve Sİng in Butona Tıklar
    And   Hasta başarılı giriş yaptığını dogrular
    And   Hasta MYPAGES ve devaminda Make Appointment ButtonaTıklar
    And   Hasta Make an Appointment Sayfasinda oldugunu ve  gorunurlugunu dogrular
    Given Hasta First Name girer
    Then  Hasta Last Name girer
    And   Hasta SSN Bilgisini girer
    And   Hasta E mail bilgisini girer
    And   Hasta Phone bilgisini girer
    And   Hasta Appointment DateTime 5 gun oncesi icin girer
    And   Hasta Send an Appointment Request Butonunu Tiklar
    And   Hasta Randevusunun gecmis tarihli yapamayacagini dogrular


  @US025TC003
  Scenario: TC003 Hasta(Patient) Sing in Yapmadan Homepage üzerinden  ileri tarihli bir Randevu olustururabilmeli


    Then  Hasta Homepage de bulunan Make an Appointment Scroll butonuna Tıklar
    Given Hasta First Name girer
    Then  Hasta Last Name girer
    And   Hasta SSN Bilgisini girer
    And   Hasta E mail bilgisini girer
    And   Hasta Phone bilgisini girer
    And   Hasta Appointment DateTime 5 gun sonrası icin girer
    And   Hasta Send an Appointment Request Butonunu Tiklar
    And   Hasta Randevusunun basarili bir sekilde olustunu dogrular


  @US025TC004
  Scenario: TC004 Hasta(Patient) Sing in Yapmadan Homepage üzerinden  gecmis tarihli Randevu olusturamamali


    Then  Hasta Homepage de bulunan Make an Appointment Scroll butonuna Tıklar
    Given Hasta First Name girer
    Then  Hasta Last Name girer
    And   Hasta SSN Bilgisini girer
    And   Hasta E mail bilgisini girer
    And   Hasta Phone bilgisini girer
    And   Hasta Appointment DateTime 5 gun oncesi icin girer
    And   Hasta Send an Appointment Request Butonunu Tiklar
    And   Hasta Randevusunun gecmis tarihli yapamayacagini dogrular












