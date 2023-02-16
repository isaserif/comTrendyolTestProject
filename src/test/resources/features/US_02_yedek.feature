
Feature: US02 Ana sayfaya gidildiğnde çeşitli başlıkları, ögeleri görebilmeli

  Scenario Outline: TC01 Linklerin gorunur oldugunu dogrular
    Given Kullanici "TrendyolUrl"  adresine gider
    Then Cookeis'leri kabul eder
    Then Reklamlari geçer
    Then "<Linklerin>" gorulur oldugunu dogrular
    Examples:
      | Linklerin      |
      | Trendyol       |
      | Arama kutusu   |
      | Giris yap Link |
      | Favorilerim    |
      | Sepetim        |


  Scenario Outline:TC02 Linklerin gorunur oldugunu dogrular

    Given Kullanici "TrendyolUrl"  adresine gider
    Then Cookeis'leri kabul eder
    Then Reklamlari geçer
    Then "<Markalarin>" gorulur oldugunu dogrular
    Examples:
      | Markalarin          |
      | Sende Al            |
      | Kurumsal            |
      | Kodlar ve hizmetler |
      | Apple               |
      | Phlips              |
      | Nike                |
      | Samsung             |
      | Vestel              |

  Scenario Outline:TC03 Linklerin gorunur oldugunu dogrular
    Given Kullanici "TrendyolUrl"  adresine gider
    Then Cookeis'leri kabul eder
    Then Reklamlari geçer
    Then "<TrendUrunlerListesi>" gorulur oldugunu dogrular
    Examples:
      | TrendUrunlerListesi |
      | One cikanlar Bolum  |
      | Cok Satan urunler   |
      | Yildizli Urunler    |
