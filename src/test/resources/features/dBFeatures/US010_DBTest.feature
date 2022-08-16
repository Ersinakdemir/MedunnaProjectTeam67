Feature: US010 Doktor (Physician) randevular

  @US010DB
  Scenario:Doktor (Physician) randevulari
    Given  Database ile Connection kurulur
    Given  Table tablosundan selectRow satirlari getirilir
    Then   Kullanici bilgilerine ulasirlir ve kaydedilir
    Then   Appointments tablosunun column sutununun columnData icerdigi dogrulanir