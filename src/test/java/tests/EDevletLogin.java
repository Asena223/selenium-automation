package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EDevletLogin {
    //GÜVENLİK SEBEBİ İLE MAİL VE ŞİFRE BİLGİLERİMİ KEYDETMEDİM. DOĞRU GİRİNCE ÇALIŞIYOR
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://giris.turkiye.gov.tr/Giris/");
        driver.manage().window().maximize();

        WebElement tcNoInput = driver.findElement(new By.ByCssSelector("input#tridField"));
        tcNoInput.sendKeys("");

        WebElement passwordInput = driver.findElement(new By.ByCssSelector("input#egpField"));
        passwordInput.sendKeys("");


        WebElement loginButton = driver.findElement(new By.ByCssSelector("#loginForm > div.formSubmitRow > input.submitButton"));
        loginButton.click();

        Thread.sleep(2000);

        WebElement closeTab = driver.findElement(new By.ByCssSelector("body > div.mfp-wrap.mfp-close-btn-in.mfp-auto-cursor.mfp-fade.mfp-ready > div > div.mfp-content > div > div > div.anket-right-section > div > div > a"));
        closeTab.click();

        WebElement searchText = driver.findElement(By.id("searchField"));
        searchText.sendKeys("Çalışma Hayatım");


    }
}
