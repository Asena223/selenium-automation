package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrendyolLogin {
    //GÜVENLİK SEBEBİ İLE MAİL VE ŞİFRE BİLGİLERİMİ KEYDETMEDİM. DOĞRU GİRİNCE ÇALIŞIYOR
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();

        WebElement tikla=driver.findElement(new By.ByCssSelector("#gender-popup-modal > div > div > div.modal-close > svg"));
        tikla.click();

        WebElement girisYap=driver.findElement(By.xpath("//*[@id=\"account-navigation-container\"]/div/div[1]/div[1]/p"));
        girisYap.click();

        WebElement uyeOl=driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[2]/div/button[2]/span"));
        uyeOl.click();

        WebElement mailGir=driver.findElement(new By.ByCssSelector("#register-email"));
        mailGir.sendKeys("");

        WebElement sifreGir=driver.findElement(By.xpath("//*[@id=\"register-password-input\"]"));
        sifreGir.sendKeys("");

        WebElement gender=driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/div[3]/div/button[1]/span"));
        gender.click();

        String beklenenMesaj="Bu e-posta adresi kullanılamaz. Lütfen başka bir e-posta adresi deneyiniz.";
        WebElement gelenMesaj=driver.findElement(By.xpath("//*[@id=\"error-box-wrapper\"]/span[2]"));
        if (beklenenMesaj.contentEquals(gelenMesaj.getText())){
            WebElement uyeGiris=driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[2]/div/button[1]/span"));
            uyeGiris.click();
        }

    }
}
