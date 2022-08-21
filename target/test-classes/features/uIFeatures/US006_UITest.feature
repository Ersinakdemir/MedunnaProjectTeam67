Feature:US006_TC_01_Kullanici Bilgileri

  @006TC01
  Scenario: TC01 Kullanici bilgileri "firstName, lastname and email" girerken doldurulan kullanici bilgileri olmalidir

    Given Kullanici medunna ana sayfasina gider
    And Kullanici insan resmine tiklar
    Then Kullanici sign in e tiklar
    And Kullanici username kutusuna username girer
    Then Kullanici password kutusuna password girer
    Then Kullanici sign in butonuna tiklar
    Then Kullanici sag ust kosedeki kullanici ismine tiklar
    And Kullanici settings butonuna tiklar
    And firstname kutusunda kayit olurken girdigi firstname olmali
    And lastname kutusunda kayit olurken girdigi lastname olmali
    And email kutusunda kayit olurken girdigi email olmali
    And Kullanici sayfayi kapatir

  @006TC02
  Scenario: TC02 "Firstname, Lastname ve Email" guncelleme secenegi olmalidir
    Given Kullanici medunna ana sayfasina gider
    And Kullanici insan resmine tiklar
    And Kullanici sign in e tiklar
    And Kullanici username kutusuna username girer
    And Kullanici password kutusuna password girer
    Then Kullanici sign in butonuna tiklar
    Then Kullanici sag ust kosedeki kullanici ismine tiklar
    And Kullanici settings butonuna tiklar
    And firstname kutusuna yeni firstname girer
    And lastname kutusuna yeni lastname girer
    And email kutusuna yeni email girer
    And kullanici save butanuna basarak degisiklikleri kaydeder
    And Kullanici ilk kayit bilgilerini girerek tekar save yapar
    And Kullanici sayfayi kapatir


