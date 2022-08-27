Feature: US028_Ulkeler ve eyaletler db testi

  @DbEklenenUlke
  Scenario:TC09_Eklenen ulke icin db testi
    Given Kullanici DB ye baglanir
    And Kullanici DB den ulkeler tablosunu alir
    Then Kullanici gelen tablodan ulkenin eklendigini test eder

  @DbulkeEkle
  Scenario: TC010_Ulke ekleme db testi
    Given Kullanici DB ye baglanir
    And Kullanici DB den ulkeler tablosunu yeni bir ulke creat eder
    Then Kullanici gelen tablodan ulkenin eklendigini test eder

  @DbEklenenEyalet
  Scenario:TC11_Eklenen eyalet icin db testi
    Given Kullanici DB ye baglanir
    And Kullanici DB den eyalet tablosunu alir
    Then Kullanici gelen tablodan eyalet eklendigini test eder

  @DbEyaletEkle
  Scenario: TC012_Eyalet ekleme db testi
    Given Kullanici DB ye baglanir
    And Kullanici DB den eyalet tablosunu yeni bir ulke creat eder
    Then Kullanici gelen tablodan eyaletin eklendigini test eder