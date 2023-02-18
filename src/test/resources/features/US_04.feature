
@wip
Feature: "Ana sayfa en altında Sosyal medya ve mobil uygulama link, Ülke değiştir Linki
  ve Etbis barkot linkleri görünür olmalıve clik yapınca ilgili alanlara gidilebilmeli"

  Scenario: "Mobil uygulamalar basligi altindaki Apple store, linklerini tiklayabilmeli

    Given Kullanici "TrendyolUrl"  adresine gider
    Then Cookeis'leri kabul eder
    Then Reklamlari geçer
    Then Sayfayi en alta indirir
    Then Apple store mobil uygulama linkinin sayfasina yonlendirilir
    And Sayfayi kapatır

