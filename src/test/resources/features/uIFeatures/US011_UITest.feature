@US011


Feature: US011 "My Appointments" Physician (Doctor) tarafından düzenlenebilmeli


  Background:

    Given Doktor Medunna url Anasayfasina gider
    Then  Doktor Dopdown menüyü Tıklar
    And   Doktor Signs in Butonuna Tıklar
    And   Doktor Username ve Password girer ve Sİng in Butona Tıklar
    And   Doctor başarılı giriş yaptığını dogrular
    And   Doktor MYPAGES ve Appointments ButtonaTıklar
    Then  Doktor MyAppointments sayfasinda oldugunu dogrular



  Scenario: TC001 "My Appointments" Physician (Doctor) tarafindan duzenlenebilmeli
    And  Doktor id, start and end date, Status, physician and patient  gorunurlugunu dogrular
    And  Doktor sayfayi kapatır.

    Scenario: TC002 Doktor zorunlu alanlari bos birakmamali mutlak doldurmalidir.

    And  Doctor Edit buttona Tiklar
    And  Doctor Create or Edit an Appointment sayfasinda oldugunu dogrular
    And  Doktor gerekli Anamnesis, Treatment ve Diagnosis alanlari bos birakilamaz dogrular
    And  Doktor sayfayi kapatır.

      Scenario: TC003 Doktor gerekli alanlari doldurmadan kayit yapabilir.

    And  Doctor Edit buttona Tiklar
    And  Doctor Create or Edit an Appointment sayfasinda oldugunu dogrular
    And  Doktor prescription ve description boş bir sekilde birakir ve dogrular
    And  Doktor gerekli Anamnesis, Treatment ve Diagnosis alanlarına giris yapar ve dogrular
    And  Doktor sayfayi kapatır.

        Scenario: TC004 Doktor gerekli alanlari secip kayit yapabilmelidir.

    And  Doctor Edit buttona Tiklar
    And  Doctor Create or Edit an Appointment sayfasinda oldugunu dogrular
    And  Doktor Statusu PENDING secer ve dogrular
    And  Doktor gerekli Anamnesis, Treatment ve Diagnosis alanlarına giris yapar ve dogrular
    And  Doktor sayfayi kapatır.



  Scenario: TC005 Doktor gerekli alanlari secip kayit yapabilmelidir.

    And  Doctor Edit buttona Tiklar
    And  Doctor Create or Edit an Appointment sayfasinda oldugunu dogrular
    And  Doktor Statusu CANCELLED secer ve dogrular
    And  Doktor gerekli Anamnesis, Treatment ve Diagnosis alanlarına giris yapar ve dogrular
    And  Doktor sayfayi kapatır.




  Scenario: TC006 Doktor gerekli alanlari secip kayit yapabilmelidir.

    And  Doctor Edit buttona Tiklar
    And  Doctor Create or Edit an Appointment sayfasinda oldugunu dogrular
    And  Doktor Statusu COMPLETED secer ve dogrular
    And  Doktor gerekli Anamnesis, Treatment ve Diagnosis alanlarına giris yapar ve dogrular
    And  Doktor sayfayi kapatır.
