package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeTest1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        WebElement oturumAcelement=driver.findElement(new By.ByCssSelector("#buttons > ytd-button-renderer > yt-button-shape > a > yt-touch-feedback-shape > div > div.yt-spec-touch-feedback-shape__fill"));
        oturumAcelement.click();

        String expectedNumber="kayıtlı olduğunuz telefon numarası ıgiriniz";
        String enteredNumber="herhangi bir sayısını yanlış girip deneyiniz";

        //login olmak için tüm yolları denedim fakat kabul etmedi. sanırım baykarda olduğu gibi burada da izin verilmiyor
        WebElement telWithLogin=driver.findElement(By.id("identifierId"));
        telWithLogin.sendKeys(enteredNumber);
        if (expectedNumber.contentEquals(enteredNumber)){
            WebElement submitElement=driver.findElement(By.xpath("//div[@class=\"VfPpkd-RLmnJb\"]"));
            submitElement.click();
        }
        else {
            System.out.println("You login false telephone number");
        }
    }
}
