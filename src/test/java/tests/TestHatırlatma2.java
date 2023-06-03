package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHatırlatma2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://miktadozturk.medium.com/yaz%C4%B1l%C4%B1m-test-m%C3%BChendisleri-i%CC%87%C3%A7in-7-chrome-uzant%C4%B1s%C4%B1-extensions-e44c43679e75");

        WebElement elementSearch=driver.findElement(new By.ByCssSelector("#b269"));
        String isim=elementSearch.getText();
        System.out.println(isim);

    }
}
