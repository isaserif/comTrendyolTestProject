@wip
Feature: US02 Ana sayfaya gidildiğnde çeşitli başlıkları, ögeleri görebilmeli

  Scenario: TC01 Linklerin gorunur oldugunu dogrular
    Given Kullanici "TrendyolUrl"  adresine gider
    Then Cookeis'leri kabul eder
    Then Reklamlari geçer
    Then Trendyol  gorulur oldugunu dogrular
    Then Arama kutusu   gorulur oldugunu dogrular
    Then Giris yap Link  gorulur oldugunu dogrular
    Then Favorilerim  gorulur oldugunu dogrular
    Then  Sepetim    gorulur oldugunu dogrular
    And Sayfayi kapatır

  Scenario:TC02 Marka Linklerinin gorulur oldugunu dogrular
    Given Kullanici "TrendyolUrl"  adresine gider
    Then Cookeis'leri kabul eder
    Then Reklamlari geçer
    Then Sende Al  gorulur oldugunu dogrular
    Then Kurumsal gorulur oldugunu dogrular
    Then Kodlar ve hizmetler gorulur oldugunu dogrular
    Then Apple    gorulur oldugunu dogrular
    Then Phlips   gorulur oldugunu dogrular
    Then Saga kaydir
    Then Samsung  gorulur oldugunu dogrular
    Then Nike     gorulur oldugunu dogrular
    Then Vestel   gorulur oldugunu dogrular
    And Sayfayi kapatır

  Scenario:TC03 Linklerin gorunur oldugunu dogrular
    Given Kullanici "TrendyolUrl"  adresine gider
    Then Cookeis'leri kabul eder
    Then Reklamlari geçer
    Then sayfayi bir sayfa kaydir
    Then One cikanlar Bolum  gorulur oldugunu dogrular
    Then sayfayi bir sayfa kaydir
    Then Cok Satan urunler   gorulur oldugunu dogrular
    Then sayfayi bir sayfa kaydir
    Then Yildizli Urunler    gorulur oldugunu dogrular
And Sayfayi kapatır