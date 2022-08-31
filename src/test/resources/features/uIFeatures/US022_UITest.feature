Feature:US022_Hasta Test Sonuclari

  @US022TC01
  Scenario: TC01 Staff hastanin SSN id ile arama yapabilir ve test sonuclarini gorebilir

    Given Kullanici medunna ana sayfasina gider
    And Kullanici insan resmine tiklar
    And Kullanici sign in e tiklar
    And Kullanici staff olarak username girer
    And Kullanici password kutusuna password girer
    And Kullanici sign in butonuna tiklar
    And MyPages dropdrowna tiklar
    And Search Patient tiklar
    And Patient SSN kismina patient SSN girer
    And Patient bilgilerinin gorulebildigini test eder
    And Show appointments butonuna tiklar
    Then Show tests butonuna tiklar
    Then View Results butonuna tiklar
    And Test sonuclari sayfasinda oldugunu test eder
    And Kullanici sayfayi kapatir

  @US022TC02
  Scenario: TC02 Staff "ID, Date, Result, description, Created date,... " gibi sonuc bilgilerini gorebilmeli ve guncelleyebilmeli

    Given Kullanici medunna ana sayfasina gider
    And Kullanici insan resmine tiklar
    And Kullanici sign in e tiklar
    And Kullanici staff olarak username girer
    And Kullanici password kutusuna password girer
    And Kullanici sign in butonuna tiklar
    And MyPages dropdrowna tiklar
    And Search Patient tiklar
    And Patient SSN kismina patient SSN girer
    And Show appointments butonuna tiklar
    Then Show tests butonuna tiklar
    Then View Results butonuna tiklar
    And secilen test icin edit butonuna tiklar
    And Test sonucunun duzenlenebilecgini test eder
    And Kullanici sayfayi kapatir