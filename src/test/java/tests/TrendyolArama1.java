package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TrendyolArama1 {
    //GÜVENLİK SEBEBİ İLE MAİL VE ŞİFRE BİLGİLERİMİ KEYDETMEDİM. DOĞRU GİRİNCE ÇALIŞIYOR
    public static void main(String[] args) throws InterruptedException {
        //burada bildirimleri devre dışı bırakabilmek adına bir chrome anahtarı ekledim. bu options' u da ChromeDriver constructor' a ekledim
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();

        WebElement kapatReklam = driver.findElement(new By.ByCssSelector("#gender-popup-modal > div > div > div.modal-close"));
        kapatReklam.click();
//çerezleri açan tabı kapatmak için yazdım fakat çerezleri iptal için de bir kod bloğu var.
//        WebElement kapatAlt=driver.findElement(new By.ByCssSelector("button#onetrust-accept-btn-handler"));
//        kapatAlt.click();


        WebElement girisYap=driver.findElement(new By.ByCssSelector("#account-navigation-container > div > div.account-nav-item.user-login-container > div.link.account-user > p"));
        girisYap.click();


        WebElement emailGiris=driver.findElement(By.id("login-email"));
        emailGiris.sendKeys("");

        WebElement sifreGiris=driver.findElement(By.id("login-password-input"));
        sifreGiris.sendKeys("");

        WebElement gonder=driver.findElement(new By.ByCssSelector("#login-register > div.lr-container > div.q-layout.login > form > button"));
        gonder.click();

        Thread.sleep(5000);

        WebElement arama=driver.findElement(new By.ByCssSelector("#sfx-discovery-search-suggestions > div > div > input"));
        arama.sendKeys("akıllı bileklik");

        WebElement aramaTikla=driver.findElement(new By.ByCssSelector("#sfx-discovery-search-suggestions > div > div > i"));
        aramaTikla.click();

        WebElement markaFiltre=driver.findElement(new By.ByCssSelector("#sticky-aggregations > div > div:nth-child(2) > div:nth-child(2) > input"));
        markaFiltre.sendKeys("Huawei");
        WebElement isaretleMarka=driver.findElement(new By.ByCssSelector("#sticky-aggregations > div > div:nth-child(2) > div.fltrs > div > div > div > div > a > div.chckbox"));
        isaretleMarka.click();

//        sayfa kaydırmak için kullanılan bir bloktur ama yavaş yavaş ilerletmiyor scrollBy değerine göre birden ilerletiyor
//        JavascriptExecutor j = (JavascriptExecutor) driver;
//        j.executeScript("window.scrollBy(0,5000)");



    }
}
