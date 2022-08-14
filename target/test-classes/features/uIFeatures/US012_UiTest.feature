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

    @TC004
  Scenario: TC004 Test içeriğinde "Glucose" testi oldugu test edilir
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
    And Acilan listede  Creatinine testinin bulundugunu kontrol eder
    And  Listede Creatinine testinin secilebilirligini test eder

  @TC005
  Scenario: TC005 Test içeriğinde "Glucose" testi oldugu test edilir
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
    And Acilan listede   Sodium testinin bulundugunu kontrol eder
    And  Listede Sodium testinin secilebilirligini test eder

  @TC006
  Scenario: TC006 Test içeriğinde "Glucose" testi oldugu test edilir
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
    And Acilan listede  Total protein testinin bulundugunu kontrol eder
    And  Listede Total protein testinin secilebilirligini test eder

  @TC007
  Scenario: TC007 Test içeriğinde "Glucose" testi oldugu test edilir
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
    And Acilan listede  Albumin testinin bulundugunu kontrol eder
    And  Listede Albumin testinin secilebilirligini test eder

  @TC008
  Scenario: TC008 Test içeriğinde "Glucose" testi oldugu test edilir
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
    And Acilan listede  Hemoglobin testinin bulundugunu kontrol eder
    And  Listede Hemoglobin testinin secilebilirligini test eder

  @TC009
  Scenario: TC009 Test içeriğinde "Glucose" testi oldugu test edilir
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
    And Acilan listede  Potassium testinin bulundugunu kontrol eder
    And  Listede Potassium testinin secilebilirligini test eder
