package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import page.HomePage;
import page.MethodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class TrendyolStepDefinitions {

Actions actions =new Actions(Driver.getDriver());
HomePage homePage=new HomePage();
MethodPage methodPage=new MethodPage();

    @Given("Kullanici {string}  adresine gider")
    public void kullaniciAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("TrendyolUrl"));
    }
    @Then("Cookeis'leri kabul eder")
    public void cookeisLeriKabulEder() {

    }
    @Then("Reklamlari geçer")
    public void reklamlariGeçer() {
        actions.moveToElement(homePage.kabulEtButtonElementi).click().perform();
    }
    @Then("Sayfa başlığında {string} kelimesinin içerdiğini test eder")
    public void sayfa_başlığında_kelimesinin_içerdiğini_test_eder(String expextedkelime) {
     String actualTitle=   Driver.getDriver().getTitle();
     assertTrue(actualTitle.contains(expextedkelime));

    }
    @Then("Sayfayi kapatır")
    public void sayfayi_kapatır() {

       // Driver.closeDriver();
        Driver.quitDriver();
    }
    //*********************************************************************
    @Then("Trendyol  gorulur oldugunu dogrular")
    public void trendyol_gorulur_oldugunu_dogrular() {
        assertTrue(homePage.trendyolLogoElemet.isDisplayed());

    }
    @Then("Arama kutusu   gorulur oldugunu dogrular")
    public void arama_kutusu_gorulur_oldugunu_dogrular() {
        assertTrue(homePage.aramaKutusuElemet.isDisplayed());
    }
    @Then("Giris yap Link  gorulur oldugunu dogrular")
    public void giris_yap_link_gorulur_oldugunu_dogrular() {
        assertTrue(homePage.girisyapLinkElement.isDisplayed());
    }
    @Then("Favorilerim  gorulur oldugunu dogrular")
    public void favorilerim_gorulur_oldugunu_dogrular() {
        assertTrue(homePage.favorilerimElemet.isDisplayed());
    }
    @Then("Sepetim    gorulur oldugunu dogrular")
    public void sepetim_gorulur_oldugunu_dogrular() {
        assertTrue(homePage.sepetimElemet.isDisplayed());
    }


    @Then("Sende Al  gorulur oldugunu dogrular")
    public void sende_al_gorulur_oldugunu_dogrular() {
        assertTrue(homePage.sendeAlLinkElement.isDisplayed());
    }
    @Then("Kurumsal gorulur oldugunu dogrular")
    public void kurumsal_gorulur_oldugunu_dogrular() {
        assertTrue(homePage.kurumsalElement.isDisplayed());
    }
    @Then("Kodlar ve hizmetler gorulur oldugunu dogrular")
    public void kodlar_ve_hizmetler_gorulur_oldugunu_dogrular() {
        assertTrue(homePage.kodlarVeHizmetlerElemet.isDisplayed());
    }
    @Then("Apple    gorulur oldugunu dogrular")
    public void apple_gorulur_oldugunu_dogrular() {
        assertTrue(homePage.appleElement.isDisplayed());
    }
    @Then("Phlips   gorulur oldugunu dogrular")
    public void phlips_gorulur_oldugunu_dogrular() {
        assertTrue(homePage.phlipsElement.isDisplayed());
    }
    @Then("Nike     gorulur oldugunu dogrular")
    public void nike_gorulur_oldugunu_dogrular() {
        assertTrue(homePage.nikeElement.isDisplayed());
    }
    @Then("Samsung  gorulur oldugunu dogrular")
    public void samsung_gorulur_oldugunu_dogrular() {
        assertTrue(homePage.samsungElement.isDisplayed());
    }
    @Then("Vestel   gorulur oldugunu dogrular")
    public void vestel_gorulur_oldugunu_dogrular() {
        assertTrue(homePage.vestelElement.isDisplayed());
    }

    @Then("One cikanlar Bolum  gorulur oldugunu dogrular")
    public void one_cikanlar_bolum_gorulur_oldugunu_dogrular() {
        assertTrue(homePage.oneCikanlarElement.isDisplayed());
    }
    @Then("Cok Satan urunler   gorulur oldugunu dogrular")
    public void cok_satan_urunler_gorulur_oldugunu_dogrular() {
       ;assertTrue(homePage.trendyolLogoElemet.isDisplayed());
    }
    @Then("Yildizli Urunler    gorulur oldugunu dogrular")
    public void yildizli_urunler_gorulur_oldugunu_dogrular() {
        assertTrue(homePage.yildizliUrunlerElement.isDisplayed());
    }

    @Then("Saga kaydir")
    public void saga_kaydir() {
        actions.moveToElement(homePage.sagYonKaydirButton).click().perform();
    }

    @Then("sayfayi bir sayfa kaydir")
    public void sayfayiBirSayfaKaydir() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    //***************************************************************************
    @Then("Sayfayi en alta indirir")
    public void sayfayi_en_alta_indirir() {
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(2);
    }
    @Then("Trendyol linkinin göründüğünü doğrular")
    public void trendyol_linkinin_göründüğünü_doğrular() {
    assertTrue(homePage.trendyolLinkWebElement.isDisplayed());


    }
    @Then("Trenyol Linkine click yapinca sayfa basina gider ve dogrular")
    public void trenyol_linkine_click_yapinca_sayfa_basina_gider_ve_dogrular() {
        homePage.trendyolLinkWebElement.click();
        assertTrue(homePage.trendyolLogoElemet.isDisplayed());
    }
    @Then("Biz kimiz linkine click yapar ve ilgigli sayfaya gidildigini dogrular")
    public void biz_kimiz_linkine_click_yapar_ve_ilgigli_sayfaya_gidildigini_dogrular() {
            homePage.bizKimizLinkWebElement.click();
            assertTrue(homePage.bizKimizSayfaLinkWebElement.isDisplayed());
    }
    @Then("Ana sayfaya geri döner")
    public void ana_sayfaya_geri_döner() {
        Driver.getDriver().navigate().back();
    }
    String ilkSayfaHanleDegeri;
    @Then("Kariyer linkine click yapar ve ilgigli sayfaya gidildigini dogrular")
    public void kariyer_linkine_click_yapar_ve_ilgigli_sayfaya_gidildigini_dogrular() {
homePage.kariyerLinkWebElement.click();
assertTrue(homePage.kariyerSayfaLinkWebElement.isDisplayed());
  ilkSayfaHanleDegeri=  Driver.getDriver().getWindowHandle();

    }
    @Then("Trendyol'da Satış Yap click yapar ve ilgigli sayfaya gidildigini dogrular")
    public void trendyol_da_satış_yap_click_yapar_ve_ilgigli_sayfaya_gidildigini_dogrular() {
    homePage.trendyoldaSatisYapLinkWebElement.click();
    ReusableMethods.bekle(1);
   Set<String>tumHandleDegerleri= Driver.getDriver().getWindowHandles();
   String ikinciSayfaHandleDegeri = "";
        for (String handle : tumHandleDegerleri
             ) {
            if (handle.equals(ilkSayfaHanleDegeri)){

            }else {
                ikinciSayfaHandleDegeri=handle;
            }

            }
        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);
        assertTrue(homePage.trendyolSaticiPaneliSayfaLinkWebElement.isDisplayed());
    }
//*********************************************************************
    @Then("About as  sayfasına gidildiğini doğrular")
    public void about_as_sayfasına_gidildiğini_doğrular() {
        homePage.aboutUsLinkWebElement.click();
        ReusableMethods.bekle(1);
        assertTrue(homePage.aboutUsSayfaLinkWebElement.isDisplayed());
    }
    @Then("Who we are sayfasına gidildiğini doğrular")
    public void who_we_are_sayfasına_gidildiğini_doğrular() {
        homePage.whoWeAreLinkWebElement.click();
        ReusableMethods.bekle(1);
        assertTrue(homePage.whoWeAreSayfaLinkWebElement.isDisplayed());

    }
    @Then("Careers sayfasına gidildiğini doğrular")
    public void careers_sayfasına_gidildiğini_doğrular() {
        homePage.careersLinkWebElement.click();
        ReusableMethods.bekle(1);
        assertTrue(homePage.careersSayfaLinkWebElement.isDisplayed());

    }
    @Then("Contact us sayfasına gidildiğini doğrular")
    public void contact_us_sayfasına_gidildiğini_doğrular() {
        homePage.contactUsLinkWebElement.click();
        ReusableMethods.bekle(1);
        assertTrue(homePage.contactUsSayfaLinkWebElement.isDisplayed());

    }


    @And("Reklam kapatir")
    public void reklamKapatir() {
        actions.moveToElement(homePage.reklamKapatElement).click().perform();
    }
}
