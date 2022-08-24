@US001_YeniKayit @smoke

Feature: Yeni kayit olusturulabilinmeli


  Scenario: TC_001 Gecerli bir SSN, 3. ve 5. rakamdan sonra "-" icermeli ve 9 rakamdan olusmalidir.
    Given Kullanici Medunna Register sayfasina gider
    Then  Kullanici gecerli bir SSN girisi yapar "SSN"
    And   Kullanici gecerli bir First Name girisi yapar "firstName"
    And   Kullanici gecerli bir Last Name girisi yapar "lastName"
    And   Kullanici gecerli bir username girisi yapar "username"
    And   Kullanici gecerli bir E-Mail girisi yapar "email"
    And   Kullanici gecerli bir sifre girisi "password" ve sifre tekrari girisi yapar "password"
    And   Kullanici register butonuna tiklar
    Then  Kullanici kayit basarili yazisinin gorundugunu test dorgular
    And   Kullanici Kayit yapar
    Then  Kullanici tarayiciyi kapatir


  Scenario: TC_002 SSN bos birakilamaz
    Given Kullanici Medunna Register sayfasina gider
    Then  Kullanici ssn numarasini bos giris yapar
    And   Kullanici gecerli bir First Name girisi yapar "firstName"
    And   Kullanici gecerli bir Last Name girisi yapar "lastName"
    And   Kullanici gecerli bir username girisi yapar "username"
    And   Kullanici gecerli bir E-Mail girisi yapar "email"
    And   Kullanici gecerli bir sifre girisi "password" ve sifre tekrari girisi yapar "password"
    And   Kullanici register butonuna tiklar
    Then  Kullanici kayit basarisiz yazisinin gorundugunu dogrular
    Then  Kullanici tarayiciyi kapatir

  Scenario: TC_003 Herhangi bir karakter iceren ve bos birakilamayan gecerli bir "First Name" olmalidir
    Given Kullanici Medunna Register sayfasina gider
    Then  Kullanici gecerli bir SSN girisi yapar "SSN"
    And   Kullanici First Name kutusuna bos giris yapar
    And   Kullanici gecerli bir Last Name girisi yapar "lastName"
    And   Kullanici gecerli bir username girisi yapar "username"
    And   Kullanici gecerli bir E-Mail girisi yapar "email"
    And   Kullanici gecerli bir sifre girisi "password" ve sifre tekrari girisi yapar "password"
    And   Kullanici register butonuna tiklar
    Then  Kullanici FirstName required yazisinin gorundugunu test eder
    Then  Kullanici tarayiciyi kapatir

  Scenario: TC_004 Herhangi bir karakter iceren ve bos birakilamayan gecerli bir "Last Name" olmalidir
    Given Kullanici Medunna Register sayfasina gider
    Then  Kullanici gecerli bir SSN girisi yapar "SSN"
    And   Kullanici gecerli bir First Name girisi yapar "firstName"
    And   Kullanici Last Name kutusuna bos giris yapar
    And   Kullanici gecerli bir username girisi yapar "username"
    And   Kullanici gecerli bir E-Mail girisi yapar "email"
    And   Kullanici gecerli bir sifre girisi "password" ve sifre tekrari girisi yapar "password"
    And   Kullanici register butonuna tiklar
    Then  Kullanici LastName required yazisinin gorundugunu test eder
    Then  Kullanici tarayiciyi kapatir





















