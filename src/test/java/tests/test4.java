package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://twitter.com/twitteradınıekleee");

        WebElement searchElement=driver.findElement(new By.ByCssSelector("input[placeholder=\"Twitter'da Ara\"]"));
        searchElement.sendKeys("hataylifilozof");
        searchElement.submit();
    }
}
