package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHatırlatma1 {
    public static void main(String[] args) {
        //GÜVENLİK SEBEBİ İLE MAİL VE ŞİFRE BİLGİLERİMİ KEYDETMEDİM. DOĞRU GİRİNCE ÇALIŞIYOR
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://giris.turkiye.gov.tr/Giris/");

        WebElement tcElement=driver.findElement(new By.ByCssSelector("//div/input[@id='tridField']"));
        tcElement.sendKeys("XYZ");
    }
}
