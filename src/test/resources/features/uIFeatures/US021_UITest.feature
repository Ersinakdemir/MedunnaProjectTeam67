Feature:US021_Staff hastalar icin randevulari gorur

  @US021TC01
  Scenario: TC01 Staff sadece randevulari guncelleyebilir

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
    Then Appointment duzenleme sayfasinda oldugunu test eder
    Then Appointmenti duzenlemek icin edit butonuna basar
    And Kullanici sayfayi kapatir


  @US021TC02
  Scenario: TC02 Staff hasta durumunu (status) "UNAPPROVED, PENDING veya CANCELLED yapabilmeli ancak "COMPLETED" yapamamali

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
    And Appointmenti duzenlemek icin edit butonuna basar
    Then Status acilir penceresine tiklanir
    And menude UNAPPROVED, PENDING veya CANCELLED opsiyonlarinin aktif oldugunu test eder
    Then menude COMPLETED opsiyonunun aktif olmadigini test eder
    And Kullanici sayfayi kapatir

  @US021TC03
  Scenario: TC03 Staff "Anamnesis (Hastalik gecmisi), Treatment (Tedavi) veya Diagnosis (Teshis) kisimlarina girmemeli

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
    Then Appointmenti duzenlemek icin edit butonuna basar
    And Anamnesis, Treatment veya Diagnosis bolumlerine girilemedigini test eder
    And Kullanici sayfayi kapatir

  @US021TC04
  Scenario: TC04 Staff Hasta icin gerekli doktoru secebilmeli ve randevu olusturabilmeli

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
    Then Appointmenti duzenlemek icin edit butonuna basar
    And Hasta icin bir doktor secer
    Then save butonu basar ve doktor secilebildigini test eder
    And Kullanici sayfayi kapatir

