package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement kabulEtButtonElementi;

    @FindBy(xpath = "//*[@id='Rating-Review']")
    public WebElement reklamIframeElementi;

    @FindBy(xpath = "//div[@id='onetrust-banner-sdk']")
    public WebElement allertReklamElementi;
//******************************************************

    @FindBy(xpath = "//img[@src='https://cdn.dsmcdn.com/web/logo/ty-web.svg']")
    public WebElement trendyolLogoElemet;

    @FindBy(xpath = "//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']")
    public WebElement aramaKutusuElemet;


    @FindBy(xpath = "//p[text()='Giriş Yap']")
    public WebElement girisyapLinkElement;

    @FindBy(xpath = "//p[text()='Favorilerim']")
    public WebElement favorilerimElemet;

    @FindBy(xpath = "//p[text()='Sepetim']")
    public WebElement sepetimElemet;

//***************************************************

    @FindBy(xpath = "//span[text()='Sana Özel']")
    public WebElement sendeAlLinkElement;

    @FindBy(xpath = "//span[text()='Kurumsal']")
    public WebElement kurumsalElement;
    @FindBy(xpath = "//span[text()='Kodlar & Hizmetler']")
    public WebElement kodlarVeHizmetlerElemet;
    @FindBy(xpath = "//span[text()='Apple']")
    public WebElement appleElement;

    @FindBy(xpath = "//span[text()='Philips']")
    public WebElement phlipsElement;

    @FindBy(xpath = "//span[text()='Nike']")
    public WebElement nikeElement;

    @FindBy(xpath = "//span[text()='Samsung']")
    public WebElement samsungElement;

    @FindBy(xpath = "//span[text()='Vestel']")
    public WebElement vestelElement;

    @FindBy(xpath = "//i[@class='i-arrow-right']")
    public WebElement sagYonKaydirButton;

    //*******************************************************
    @FindBy(xpath = "//span[text()='Öne Çıkanlar']")
    public WebElement oneCikanlarElement;

    @FindBy(xpath = "//span[text()='Yıldızlı Ürünler']")
    public WebElement yildizliUrunlerElement;

    @FindBy(xpath = "//span[text()='Çok Satan Ürünler']")
    public WebElement cokSatanlarElement;

    //******************************************
    @FindBy(xpath = "//h4[text()='Trendyol']")
    public WebElement trendyolLinkWebElement;

    @FindBy(xpath = "//a[text()='Biz Kimiz']")
    public WebElement bizKimizLinkWebElement;

    @FindBy(xpath = "//h2[text()='Who we are']")
    public WebElement bizKimizSayfaLinkWebElement;

    @FindBy(xpath = "//a[text()='Kariyer']")
    public WebElement kariyerLinkWebElement;
    @FindBy(xpath = "//span[text()='Business Info']")
    public WebElement kariyerSayfaLinkWebElement;

    @FindBy(xpath = "//a[text()='İletişim']")
    public WebElement iletisimLinkWebElement;
    @FindBy(xpath = "//h4[text()='İletişim']")
    public WebElement iletisimSayfaLinkWebElement;
    @FindBy(xpath = "(//a[@target='_blank'])[1]")
    public WebElement trendyoldaSatisYapLinkWebElement;
    @FindBy(xpath = "//div[text()=' Satıcı Paneli ']")
    public WebElement trendyolSaticiPaneliSayfaLinkWebElement;

//*******************About Us**************************************************

    @FindBy(xpath = "//h4[text()='About us']")
    public WebElement aboutUsLinkWebElement;

    @FindBy(xpath = "//h2[text()='Who we are']")
    public WebElement aboutUsSayfaLinkWebElement;

    @FindBy(xpath = "//a[text()='Who we are']")
    public WebElement whoWeAreLinkWebElement;

    @FindBy(xpath = "//span[text()='Business Info']")
    public WebElement whoWeAreSayfaLinkWebElement;

    @FindBy(xpath = "//a[text()='Careers']")
    public WebElement careersLinkWebElement;

    @FindBy(xpath = "//a[text()='Join us']")
    public WebElement careersSayfaLinkWebElement;

    @FindBy(xpath = "//a[text()='Contact us']")
    public WebElement contactUsLinkWebElement;

    @FindBy(xpath = "//a[text()='Live Chat - TR']")
    public WebElement contactUsSayfaLinkWebElement;


    @FindBy(xpath = "//*[@id='Combined-Shape']")
    public WebElement reklamKapatElement;
//************************************************************

    /*











     */


}
