
Feature:US01 Kullanıcı Trendyol Anasayfaya gidebilmeli

  Scenario: TC01 Ana sayfaya gidildiğini doğrular

    Given Kullanici "TrendyolUrl"  adresine gider
    Then Cookeis'leri kabul eder
    Then Reklamlari geçer
    Then Sayfa başlığında "Trendyol" kelimesinin içerdiğini test eder
    And Sayfayi kapatır
