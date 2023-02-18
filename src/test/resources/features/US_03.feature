
Feature: US03 Ana sayfaya gidildiğnde En Alt kısmında , ögeleri görebilmeli, click yapılınca

  Scenario: TC01 Trendyol linkinin altindaki linklerin click yapildigni ve ilgili sayafa gidildigi dogrular
    Given Kullanici "TrendyolUrl"  adresine gider
    Then Cookeis'leri kabul eder
    Then Reklamlari geçer
    Then Sayfayi en alta indirir
    Then Trendyol linkinin göründüğünü doğrular
    Then Trenyol Linkine click yapinca sayfa basina gider ve dogrular
    Then Sayfayi en alta indirir
    Then Biz kimiz linkine click yapar ve ilgigli sayfaya gidildigini dogrular
    Then Ana sayfaya geri döner
    Then Sayfayi en alta indirir
    Then Kariyer linkine click yapar ve ilgigli sayfaya gidildigini dogrular
    Then Ana sayfaya geri döner
    Then Sayfayi en alta indirir
    Then Trendyol'da Satış Yap click yapar ve ilgigli sayfaya gidildigini dogrular
    And Sayfayi kapatır

  Scenario: About us Linki ve altindaki linklerin click yapildigini ve ilgili sayfaya gidildigini dogrular
    Given Kullanici "TrendyolUrl"  adresine gider
    Then Cookeis'leri kabul eder
    Then Reklamlari geçer
    Then Sayfayi en alta indirir
    Then About as  sayfasına gidildiğini doğrular
    Then Ana sayfaya geri döner
    And Reklam kapatir
    Then Sayfayi en alta indirir
    Then Who we are sayfasına gidildiğini doğrular
    Then Ana sayfaya geri döner
    And Reklam kapatir
    Then Sayfayi en alta indirir
    Then Careers sayfasına gidildiğini doğrular
    Then Ana sayfaya geri döner
    And Reklam kapatir
    Then Sayfayi en alta indirir
    Then Contact us sayfasına gidildiğini doğrular
    And Sayfayi kapatır


  Scenario: TC04 Yardim Linki ve altındaki linklerin click yapildigini ve ilgili sayfaya gidildigini dogrular
    Given Kullanici "TrendyolUrl"  adresine gider
    Then Cookeis'leri kabul eder
    Then Reklamlari geçer
    Then Sayfayi en alta indirir
    Then Yardım sayfasına gidildiğini doğrular
    Then Ana sayfaya geri döner
    And Reklam kapatir
    Then Sayfayi en alta indirir
    Then Sıkça Sorulan Sorular sayfasına gidildiğini doğrular
    Then Ana sayfaya geri döner
    And Reklam kapatir
    Then Sayfayi en alta indirir
    Then Nasıl İade Edebilirim sayfasına gidildiğini doğrular
    Then Ana sayfaya geri döner
    And Reklam kapatir
    Then Sayfayi en alta indirir
    Then İşlem Rehberi sayfasına gidildiğini doğrular
    Then Sayfayi kapatır

    Scenario: TC03 Kampanyalar baslıgı altında trendyol frsatlari linkinin click yapildigini ve ilgili sayfaya gidildigini dogrular
    Given Kullanici "TrendyolUrl"  adresine gider
    Then Cookeis'leri kabul eder
    Then Reklamlari geçer
    Then Sayfayi en alta indirir
    Then Trendyol Fırsatları sayfasına gidildiğini doğrular
    Then Sayfayi kapatır