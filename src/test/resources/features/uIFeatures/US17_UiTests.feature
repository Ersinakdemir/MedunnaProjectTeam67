Feature: Test items(öğe) Oluştur / Güncelle / Sil

  @234
  Scenario: Admin test öğelerini görüntüleyebilir

    Given "medunna.com" sayfasina gidilir
    And  Sing in segmesinden Admin olarak baglanilir
    And  Items &Title  sekmesine tiklanip
    And  Test - Items a tiklanir
    Then Gidilen sayfada Testitemslarin görüntülendigi test edilir


    Scenario: Admin, "test items; Name, Description, price Default min value, Default max value ve
    created date (Gün/Ay/Yıl) oluşturabilir ve güncelleyebilir..

      Given "medunna.com" sayfasina gidilir
      And  Sing in segmesinden Admin olarak baglanilir
      And  Items &Title  sekmesine tiklanip
      And  Test - Items a tiklanir
      And  Gidilen sayfada Testitemslardan birinin Edit'e tiklanir
      And  Item bilgileri degistirilerek
      And  Save tiklanarak yeni bir Item olusturulur kaydedilir
      Then Kayit dan sonra gelen sayfada Basariyla kaydedildi.yazisinin görünür olgugu test edilir


    Scenario: Admin test öğelerini silebilir.

      Given "medunna.com" sayfasina gidilir
      And  Sing in segmesinden Admin olarak baglanilir
      And  Items &Title  sekmesine tiklanip
      And  Test - Items a tiklanir
      And  Gidilen sayfada Testitemslardan birinde Delete'e tiklanir
      Then Itemin basariyla silindigi mesajinin görüntülendigi test ediniz


    Scenario: Admin yeni test öğeleri oluşturabilirGiven "medunna.com" sayfasina gidilir
      And  Sing in segmesinden Admin olarak baglanilir
      And  Items &Title  sekmesine tiklanip
      And  Test - Items a tiklanir
      And  Gidilen sayfada Creat a new  test  item a tiklanir
      And  Acilan sayfadaki box lar doldurulur
      And  Save tiklanarak yeni bir Item olusturulur kaydedilir
      Then Kayit dan sonra gelen sayfada Basariyla kaydedildi.yazisinin görünür olgugu test edilir