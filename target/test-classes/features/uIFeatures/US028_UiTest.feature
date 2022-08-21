
Feature: Admin olarak; Country oluşturma / Okuma ve Silme
  @US028_uitest
  Scenario: Kullanıcı yeni bir ülke oluşturabilir
    Given Kullanici  Medunna sayfasina gider
    Then Kullanici  giris simgesini tiklar
    And Kullanici  acilan menuden sign in i tiklar
    And Kullanici  Kullanici ismini girer
    And Kullanici  Kullanici sifresini girer
    And Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir
