package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ModaKaşmirTest_1 {
    //GÜVENLİK SEBEBİ İLE MAİL VE ŞİFRE BİLGİLERİMİ KEYDETMEDİM. DOĞRU GİRİNCE ÇALIŞIYOR
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.modakasmir.com/");
        driver.manage().window().maximize();

        WebElement girisAlani=driver.findElement(new By.ByCssSelector("div#headerMain div.fr.hesabim > div > div:nth-child(1) > a"));
        girisAlani.click();

        WebElement cookieAlani=driver.findElement(By.id("cookie_law_close"));
        cookieAlani.click();

        WebElement gmailAlani=driver.findElement(new By.ByCssSelector("input#ug-email"));
        gmailAlani.sendKeys("");

        WebElement passwordAlani=driver.findElement(By.id("ug-password"));
        passwordAlani.sendKeys("");

        WebElement loginButton=driver.findElement(By.id("member-login-btn"));
        loginButton.click();

        //siteye giriş yapmadan da search yapılabildiği için, login olduktan sonra bekleme süresi ekledim.
        Thread.sleep(4000); //çok uğraştım seninle pikaççu ama oldun TEBRİK KENDİME:)

        WebElement searchInput=driver.findElement(new By.ByCssSelector("input#live-search"));
        searchInput.sendKeys("Twill Eşarp");

        //listeden bir linke ait texte tıkladığımda ona ait verilere götürsün. BU ŞU ANDA OLMADI AMA DAHA SONRA OLACAKKKK
        WebElement listeElement = driver.findElement(By.xpath("//*[starts-with(@class,'box col-12 p-bottom')]"));
        List<WebElement> li_All = listeElement.findElements(By.tagName("li"));
        System.out.println(li_All.size());
        for(int i = 0; i < li_All.size(); i++){
            WebElement esarpGoster=driver.findElement(By.linkText("Su Yolu Twill Eşarp Mavi"));
            esarpGoster.click();
        }
    }
}
