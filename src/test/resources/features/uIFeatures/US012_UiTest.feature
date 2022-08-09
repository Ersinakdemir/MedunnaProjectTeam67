@US012
Feature: US012 Physician (Doktor) test isteyebilmeli
  Scenario: Doktorun hasta icin test isteyebilmeli
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