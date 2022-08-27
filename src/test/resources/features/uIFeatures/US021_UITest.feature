Feature : US021_Staff hastalar icin randevulari gorur

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
    And Kullanici sayfayi kapatir



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
    Then Status acilir penceresine tiklanar
    And menude UNAPPROVED, PENDING veya CANCELLED opsiyonlarinin aktif oldugunu test eder
    And Kullanici sayfayi kapatir


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
    Then Appoinmenti duzenlemek icin edit butonuna tiklar
    And Anamnesis, Treatment veya Diagnosis bolumlerinin bos birakildigini test eder
    And Kullanici sayfayi kapatir

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
    Then Appoinmenti duzenlemek icin edit butonuna tiklar
    And Hasta icin bir doktor secebilecgini test eder
    And Kullanici sayfayi kapatir