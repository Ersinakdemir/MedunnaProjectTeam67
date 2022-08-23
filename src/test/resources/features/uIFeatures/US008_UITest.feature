
Feature: US08 Kullanıcı giriş yaptığında Password sekmesi düzenlenebilir olmalıdır.

  Scenario: TC001 "New password confirmation" onaylanabilmelidir.
    Given Kullanici Medunna url'sine gider
    Then Kullanici sayfasina gider
    And Kullanici password degistirme sayfasina gider
    And Kullanici CurrentPassword bolumune mevcut passwordunu girer
    And Kullanici New password bolumune yeni passwordunu girer
    And Kullanici New password confirmation bolumune girdigi yeni passwordunu girer
    And Kullanici Save butonuna tiklar Password changed! yazisini gorur
    And Kullanici sayfasindan cikar
    And Kullanici passwordunu onceki passwordu ile degistirir
    And Kullanici sayfasindan cikar ve sayfayi kapatir


  Scenario: TC002 Daha güçlü şifre için en az 1 küçük harf olmalı ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
    Given Kullanici Medunna url'sine gider
    Then Kullanici sayfasina gider
    And Kullanici password degistirme sayfasina gider
    And Kullanici CurrentPassword bolumune mevcut passwordunu girer
    And Kullanici New password bolumune kucuk harf caracteri icermeyen en az yedi carakterli yeni passwordunu girer
    And Kullanici New password bolumunde girdigi passworduna bir tane kucuk harf caracteri ekler ve Password strength seviyesinin degistigini gorur
    And Kullanici sayfasindan cikar ve sayfayi kapatir


  Scenario: TC003 Daha güçlü şifre için en az 1 buyuk harf olmalı ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
    Given Kullanici Medunna url'sine gider
    Then Kullanici sayfasina gider
    And Kullanici password degistirme sayfasina gider
    And Kullanici CurrentPassword bolumune mevcut passwordunu girer
    And Kullanici New password bolumune buyuk harf caracteri icermeyen en az yedi carakterli yeni passwordunu girer
    And Kullanici New password bolumunde girdigi passworduna bir tane buyuk harf caracteri ekler ve Password strength seviyesinin degistigini gorur
    And Kullanici sayfasindan cikar ve sayfayi kapatir



  Scenario: TC004 Daha güçlü şifre icin en az 1 rakam içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
    Given Kullanici Medunna url'sine gider
    Then Kullanici sayfasina gider
    And Kullanici password degistirme sayfasina gider
    And Kullanici CurrentPassword bolumune mevcut passwordunu girer
    And Kullanici New password bolumune rakam caracteri icermeyen en az yedi carakterli yeni passwordunu girer
    And Kullanici New password bolumunde girdigi passworduna bir tane rakam caracteri ekler ve Password strength seviyesinin degistigini gorur
    And Kullanici sayfasindan cikar ve sayfayi kapatir




  Scenario: TC005 Daha güçlü şifre icin en az 1 özel karakter içermeli ve"Password strength:" seviyesinin değiştiği görülebilmelidir.
    Given Kullanici Medunna url'sine gider
    Then Kullanici sayfasina gider
    And Kullanici password degistirme sayfasina gider
    And Kullanici CurrentPassword bolumune mevcut passwordunu girer
    And Kullanici New password bolumune özel carakter icermeyen en az yedi carakterli yeni passwordunu girer
    And Kullanici New password bolumunde girdigi passworduna bir tane ozel caracteri ekler ve Password strength seviyesinin degistigini gorur
    And Kullanici sayfasindan cikar ve sayfayi kapatir




  Scenario: TC006 Güçlü bir parola için şifre en az 7 karakterden oluşmalıdır.
    Given Kullanici Medunna url'sine gider
    Then Kullanici sayfasina gider
    And Kullanici password degistirme sayfasina gider
    And Kullanici CurrentPassword bolumune mevcut passwordunu girer
    And Kullanici New password bolumune  yeni passwordunun alti caracterini girer
    And Kullanici New password bolumunde girdigi passwordunun yedinci caracteri ekler ve Password strength seviyesinin degistigini gorur
    And Kullanici sayfasindan cikar ve sayfayi kapatir




  Scenario: TC007 Eski şifre kullanılmamalıdır
    Given Kullanici Medunna url'sine gider
    Then Kullanici sayfasina gider
    And Kullanici password degistirme sayfasina gider
    And Kullanici CurrentPassword bolumune mevcut passwordunu girer
    And Kullanici New password bolumune yeni passwordunu girer
    And Kullanici New password confirmation bolumune girdigi yeni passwordunu girer
    And Kullanici Save butonuna tiklar Password changed! yazisini gorur
    And Kullanici sayfasindan cikar
    And Kullanici kullanici giris sayfasina gider
    And Kullanici gecerli username ve bir onceki pasword ile giris yapamadigini gorur
    And Kullanici passwordunu onceki passwordu ile degistirir
    And Kullanici sayfasindan cikar ve sayfayi kapatir



