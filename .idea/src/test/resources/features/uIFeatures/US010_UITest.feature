@US010


Feature: US010 Doktor (Physician) randevuları


  Scenario: TC001 Doctor Appointments  listesini ve tarih listesini görünürlüğünü doğrular

 Given Doktor Medunna url Anasayfasina gider
  Then Doktor Dopdown menüyü Tıklar
  And  Doktor Signs in Butonuna Tıklar
  And  Doktor Username ve Password girer ve Sİng in Butona Tıklar
  And  Doctor başarılı giriş yaptığını dogrular
  And  Doktor MYPAGES ve Appointments ButtonaTıklar
  And  Doctor Appointments  listesini ve tarih listesini gorunurlugunu dogrular


