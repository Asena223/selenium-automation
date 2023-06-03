package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();//site açıldıktan sonra ekrana sığdır

        WebElement nameElement=driver.findElement(By.id("currentAddress"));
        //nameElement.click();
        nameElement.sendKeys("HATAY ANTAKYA guru guru MAHALLESİ guru SOKAK NO guru");
    }
}
