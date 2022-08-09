@US012
Feature: US012 Physician (Doktor) test isteyebilmeli

  Scenario: TC001 Doktorun hasta icin test isteyebilmeli
    Given Kullanici  Medunna sayfasina gider
    Then Kullanici  giris simgesini tiklar
    And Kullanici  acilan menuden sign in i tiklar
    And Kullanici  Kullanici ismini girer
    And Kullanici  Kullanici sifresini girer
    And Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir
    And Cikan sayfadan My Pages basligini tiklar
    And Kullanici My Appointments sekmesini tiklayarak rendevu sayfasina gecis yapar
    And Kullanici  Edit buttonuna tiklar
    And  Kullanici Acilan pencerede Request A Test butonu tiklayarak test istenilebliriligi test eder

  @TC002
  Scenario: TC002 Test içeriğinde "Glucose" testi oldugu test edilir
    Given Kullanici  Medunna sayfasina gider
    Then Kullanici  giris simgesini tiklar
    And Kullanici  acilan menuden sign in i tiklar
    And Kullanici  Kullanici ismini girer
    And Kullanici  Kullanici sifresini girer
    And Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir
    And Cikan sayfadan My Pages basligini tiklar
    And Kullanici My Appointments sekmesini tiklayarak rendevu sayfasina gecis yapar
    And Kullanici  Edit buttonuna tiklar
    And  Kullanici Acilan pencerede Request A Test butonu tiklar
    And Acilan listede  Glucose testinin bulundugunu kontrol eder
    And  Listede Glucose testinin secilebilirligini test eder

  @TC003
  Scenario: TC003 Test içeriğinde "Glucose" testi oldugu test edilir
    Given Kullanici  Medunna sayfasina gider
    Then Kullanici  giris simgesini tiklar
    And Kullanici  acilan menuden sign in i tiklar
    And Kullanici  Kullanici ismini girer
    And Kullanici  Kullanici sifresini girer
    And Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir
    And Cikan sayfadan My Pages basligini tiklar
    And Kullanici My Appointments sekmesini tiklayarak rendevu sayfasina gecis yapar
    And Kullanici  Edit buttonuna tiklar
    And  Kullanici Acilan pencerede Request A Test butonu tiklar
    And Acilan listede  Urea testinin bulundugunu kontrol eder
    And  Listede Urea testinin secilebilirligini test eder
