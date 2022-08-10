
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