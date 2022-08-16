Feature :US_014	Physician (Doctor) "Edit Inpatient"(Yatili Tedavi) islemleri yapabilmeli


  Scenario :US_014_TC_01_ "Doktor""ID, start and end dates, description, created date  appointment id, status, room and patient"" bilgilerini görüntülüyebilmeli ve günceleyebilmeli"

    Given Kullanici Medunna ana sayfasina giris yapar
    Then Kullanici dropdowna tiklar
    And Kullanici sign in e tiklar
    And Kullanici gecerli bir username girer
    And Kullanici gecerli bir password girer
    And Kullanici sign in e tiklar
    Then Kullanici MY PAGES sayfasına tiklar
    Then Kullanici My Inpatients tiklar
    And Kullanici ID, start and end dates, description, created date,appointment id, status, room and patient bilgilerinin goruntulenebilir oldugunu test eder

  Scenario:US_014_TC_02_ "Status" doktor tarafindan "UNAPPROVED, DISCHARGED, STILL STAYING veya CANCELLED" olarak güncellenebilmeli

    Given Kullanici Medunna ana sayfasina giris yapar
    Then Kullanici dropdowna tiklar
    And Kullanici sign in e tiklar
    And Kullanici gecerli bir username girer
    And Kullanici gecerli bir password girer
    And Kullanici sign in e tiklar
    Then Kullanici MY PAGES sayfasına tiklar
    Then Kullanici My Inpatients'e tiklar
    Then Kullanici Edit butonuna tiklar
    Then Kullanici acilan sayfadan status bolumunden "UNAPPROVED" olarak secip kaydeder
    And Kullanici acilan sayfadan status bolumunden "UNAPPROVED" olarak guncellenebilir oldugunu test eder
    Then Kullanici acilan sayfadan status bolumunden "DISCHARGED" olarak secip kaydeder
    And Kullanici acilan sayfadan status bolumunden "DISCHARGED" olarak guncellenebilir oldugunu test eder
    Then Kullanici acilan sayfadan status bolumunden "STILL STAYING" olarak secip kaydeder
    And Kullanici acilan sayfadan status bolumunden "STILL STAYING" olarak guncellenebilir oldugunu test eder
    Then Kullanici acilan sayfadan status bolumunden "CANCELLED" olarak olarak secip kaydeder
    And Kullanici acilan sayfadan status bolumunden "CANCELLED" olarak guncellenebilir oldugunu test eder

  Scenario :US_014_TC_03_ Doktor rezerve edilmis odayi guncelleyebilmeli
    Given Kullanici Medunna ana sayfasina giris yapar
    Then Kullanici dropdowna tiklar
    And Kullanici sign in e tiklar
    And Kullanici gecerli bir username girer
    And Kullanici gecerli bir password girer
    And Kullanici sign in e tiklar
    Then Kullanici Medunna ana sayfasina giris yapar
    Then Kullanici My Inpatients'e tiklar
    Then Kullanici Edit butonuna tiklar
    Then Kullanici acilan sayfadan Room bolumunden oda secip kaydeder
    And Kullanici acilan sayfadan Room bolumunun guncellenebilir oldugunu test eder