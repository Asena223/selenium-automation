package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test10_DynamicClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/buttons");
        //dynamic elementlerin web sayfası her yenilendiğinde id değerleri değişir.
        WebElement dynamicClickButton=driver.findElement(By.xpath("//div/button[starts-with (text(),'Click Me')]"));
        dynamicClickButton.click();
        String message=dynamicClickButton.getText();
        System.out.println(message);
    }
}
