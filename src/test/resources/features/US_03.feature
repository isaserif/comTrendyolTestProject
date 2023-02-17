@wip
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

