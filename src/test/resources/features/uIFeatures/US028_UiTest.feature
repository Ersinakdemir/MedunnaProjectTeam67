
Feature: Admin olarak; Country/Stat/City oluşturma / Okuma ve Silme

  @US028_uitest_Country_Pozitif
  Scenario: TC01_Kullanıcı gecerli bir tarihle yeni bir ülke oluşturabilir
    Given Kullanici  Medunna sayfasina gider
    When Kullanici  giris simgesini tiklar
    And Kullanici  acilan menuden sign in i tiklar
    And Kullanici  Kullanici ismini girer
    And Kullanici  Kullanici sifresini girer
    And Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir
    And Items&Titles botonunu tiklar
    And Acilan menuden Countries secenegini tiklar
    And Acilan pencereden Create or edit a Country butonuna tiklar
    And isim textbox una eklenecek ulkenin ismini girer
    And Gecerli bir tarih girer
    Then Save tusuna basarak ulkenin eklendigini test eder

  @US028_uitest_Country_Negativ
  Scenario: TC02_Kullanıcı gecersiz bir tarihle yeni bir ülke olusturamaz
    Given Kullanici  Medunna sayfasina gider
    When Kullanici  giris simgesini tiklar
    And Kullanici  acilan menuden sign in i tiklar
    And Kullanici  Kullanici ismini girer
    And Kullanici  Kullanici sifresini girer
    And Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir
    And Items&Titles botonunu tiklar
    And Acilan menuden Countries secenegini tiklar
    And Acilan pencereden Create or edit a Country butonuna tiklar
    And isim textbox una eklenecek ulkenin ismini girer
    And Gecersiz bir tarih girer
    Then Save tusuna basarak ulkenin eklenmedigini test eder

  @US028_uitest_States/Cities_pozitif
  Scenario: TC03_Kullanıcı gecerli bir tarihle yeni bir States/Cities olusuturur
    Given Kullanici  Medunna sayfasina gider
    When Kullanici  giris simgesini tiklar
    And Kullanici  acilan menuden sign in i tiklar
    And Kullanici  Kullanici ismini girer
    And Kullanici  Kullanici sifresini girer
    And Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir
    And Items&Titles botonunu tiklar
    And Acilan menuden States-Cities secenegini tiklar
    And Acilan pencereden Create or edit a State-City butonuna tiklar
    And Isim textbox una eklenecek eyaletin ismini girer
    And Eyaletin eklenecegi ulkeyi secer
    And Gecerli bir tarih girer
    Then Save tusuna basarak eyaletin eklendigini test eder

  @US028_uitest_States/Cities_negatif
  Scenario: TC04_Kullanıcı gecersiz bir tarihle yeni bir States/Cities olusturamaz
    Given Kullanici  Medunna sayfasina gider
    When Kullanici  giris simgesini tiklar
    And Kullanici  acilan menuden sign in i tiklar
    And Kullanici  Kullanici ismini girer
    And Kullanici  Kullanici sifresini girer
    And Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir
    And Items&Titles botonunu tiklar
    And Acilan menuden States-Cities secenegini tiklar
    And Acilan pencereden Create or edit a State-City butonuna tiklar
    And Isim textbox una eklenecek eyaletin ismini girer
    And Eyaletin eklenecegi ulkeyi secer
    And Gecersiz bir tarih girer
    Then Save tusuna basarak eyaletin eklenmedigini test eder