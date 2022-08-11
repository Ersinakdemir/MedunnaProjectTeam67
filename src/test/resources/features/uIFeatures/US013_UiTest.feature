
@US013
Feature: US013 Physician (Doktor) "Test Results" işlemleri yapabilmeli

  @US13_TC001
  Scenario: TC001 Physician (Doktor) test sonuclarinin "id" numaralari gorulebilmeli
    Given Kullanici  Medunna sayfasina gider
    Then Kullanici  giris simgesini tiklar
    And Kullanici  acilan menuden sign in i tiklar
    And Kullanici  Kullanici ismini girer
    And Kullanici  Kullanici sifresini girer
    And Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir
    And Cikan sayfadan My Pages basligini tiklar
    And Kullanici My Appointments sekmesini tiklayarak rendevu sayfasina gecis yapar
    And Kullanici  Edit buttonuna tiklar
    And Kullanici acilan pencerede Show Test Results butonu tiklar
    And Cikan pencerede View Results butonu tiklanarak test sonuclari sayfasina giris yapilir
    And Testlerin "id"leri gorulebilirligi test edilir

  @US13_TC002
  Scenario: TC002 Physician (Doktor) test sonuclarinin "Name" numaralari gorulebilmeli
    Given Kullanici  Medunna sayfasina gider
    Then Kullanici  giris simgesini tiklar
    And Kullanici  acilan menuden sign in i tiklar
    And Kullanici  Kullanici ismini girer
    And Kullanici  Kullanici sifresini girer
    And Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir
    And Cikan sayfadan My Pages basligini tiklar
    And Kullanici My Appointments sekmesini tiklayarak rendevu sayfasina gecis yapar
    And Kullanici  Edit buttonuna tiklar
    And Kullanici acilan pencerede Show Test Results butonu tiklar
    And Cikan pencerede View Results butonu tiklanarak test sonuclari sayfasina giris yapilir
    And Testlerin Name leri gorulebilirligi test edilir

  @US13_TC003
  Scenario: TC002 Physician (Doktor) test sonuclarinin "Default_min_value" numaralari gorulebilmeli
    Given Kullanici  Medunna sayfasina gider
    Then Kullanici  giris simgesini tiklar
    And Kullanici  acilan menuden sign in i tiklar
    And Kullanici  Kullanici ismini girer
    And Kullanici  Kullanici sifresini girer
    And Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir
    And Cikan sayfadan My Pages basligini tiklar
    And Kullanici My Appointments sekmesini tiklayarak rendevu sayfasina gecis yapar
    And Kullanici  Edit buttonuna tiklar
    And Kullanici acilan pencerede Show Test Results butonu tiklar
    And Cikan pencerede View Results butonu tiklanarak test sonuclari sayfasina giris yapilir
    And Testlerin Default_min_value leri gorulebilirligi test edilir

  @US13_TC004
  Scenario: TC004 Physician (Doktor) test sonuclarinin "Default_max_value" numaralari gorulebilmeli
    Given Kullanici  Medunna sayfasina gider
    Then Kullanici  giris simgesini tiklar
    And Kullanici  acilan menuden sign in i tiklar
    And Kullanici  Kullanici ismini girer
    And Kullanici  Kullanici sifresini girer
    And Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir
    And Cikan sayfadan My Pages basligini tiklar
    And Kullanici My Appointments sekmesini tiklayarak rendevu sayfasina gecis yapar
    And Kullanici  Edit buttonuna tiklar
    And Kullanici acilan pencerede Show Test Results butonu tiklar
    And Cikan pencerede View Results butonu tiklanarak test sonuclari sayfasina giris yapilir
    And Testlerin Default_max_value leri gorulebilirligi test edilir

  @US13_TC005
  Scenario: TC005 Physician (Doktor) test sonuclarinin "Test" numaralari gorulebilmeli
    Given Kullanici  Medunna sayfasina gider
    Then Kullanici  giris simgesini tiklar
    And Kullanici  acilan menuden sign in i tiklar
    And Kullanici  Kullanici ismini girer
    And Kullanici  Kullanici sifresini girer
    And Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir
    And Cikan sayfadan My Pages basligini tiklar
    And Kullanici My Appointments sekmesini tiklayarak rendevu sayfasina gecis yapar
    And Kullanici  Edit buttonuna tiklar
    And Kullanici acilan pencerede Show Test Results butonu tiklar
    And Cikan pencerede View Results butonu tiklanarak test sonuclari sayfasina giris yapilir
    And Testlerin Test leri gorulebilirligi test edilir

  @US13_TC006
  Scenario: TC006 Physician (Doktor) test sonuclarinin "Description" numaralari gorulebilmeli
    Given Kullanici  Medunna sayfasina gider
    Then Kullanici  giris simgesini tiklar
    And Kullanici  acilan menuden sign in i tiklar
    And Kullanici  Kullanici ismini girer
    And Kullanici  Kullanici sifresini girer
    And Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir
    And Cikan sayfadan My Pages basligini tiklar
    And Kullanici My Appointments sekmesini tiklayarak rendevu sayfasina gecis yapar
    And Kullanici  Edit buttonuna tiklar
    And Kullanici acilan pencerede Show Test Results butonu tiklar
    And Cikan pencerede View Results butonu tiklanarak test sonuclari sayfasina giris yapilir
    And Testlerin Description leri gorulebilirligi test edilir

  @US13_TC007
  Scenario: TC007 Physician (Doktor) test sonuclarinin "Date" numaralari gorulebilmeli
    Given Kullanici  Medunna sayfasina gider
    Then Kullanici  giris simgesini tiklar
    And Kullanici  acilan menuden sign in i tiklar
    And Kullanici  Kullanici ismini girer
    And Kullanici  Kullanici sifresini girer
    And Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir
    And Cikan sayfadan My Pages basligini tiklar
    And Kullanici My Appointments sekmesini tiklayarak rendevu sayfasina gecis yapar
    And Kullanici  Edit buttonuna tiklar
    And Kullanici acilan pencerede Show Test Results butonu tiklar
    And Cikan pencerede View Results butonu tiklanarak test sonuclari sayfasina giris yapilir
    And Testlerin Date leri gorulebilirligi test edilir

  @US13_TC008
  Scenario: TC008 Doktor "Request Impatient" (hastanın yatılı tedavi görmesi) isteğinde bulunabilmeli
    Given Kullanici  Medunna sayfasina gider
    Then Kullanici  giris simgesini tiklar
    And Kullanici  acilan menuden sign in i tiklar
    And Kullanici  Kullanici ismini girer
    And Kullanici  Kullanici sifresini girer
    And Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir
    And Cikan sayfadan My Pages basligini tiklar
    And Kullanici My Appointments sekmesini tiklayarak rendevu sayfasina gecis yapar
    And Kullanici  Edit buttonuna tiklar
    And Kullanici acilan pencerede Request Inpatient butonunu tiklar
    And InPatient request already done for this appointment yazisinin gorundugu test edilir

