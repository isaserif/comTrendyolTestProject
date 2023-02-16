package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
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





    /*







    */





}
