package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubLogin {
    public static void main(String[] args) {
        //GÜVENLİK SEBEBİ İLE MAİL VE ŞİFRE BİLGİLERİMİ KEYDETMEDİM. DOĞRU GİRİNCE ÇALIŞIYOR
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://github.com/");
        driver.manage().window().maximize();

        WebElement signIn=driver.findElement(new By.ByCssSelector("body > div.logged-out.env-production.page-responsive.header-overlay.home-campaign > div.position-relative.js-header-wrapper > header > div > div.HeaderMenu--logged-out.p-responsive.height-fit.position-lg-relative.d-lg-flex.flex-column.flex-auto.pt-7.pb-4.top-0 > div > div > div.position-relative.mr-lg-3.d-lg-inline-block > a"));
        signIn.click();

        //nedenini anlamadım ama email ve şifreyi girmiyor.
        WebElement emailInput=driver.findElement(new By.ByCssSelector("input#login_field"));
        emailInput.sendKeys("");

        WebElement passwordInput=driver.findElement(By.id("#password"));
        passwordInput.sendKeys("");
    }
}
