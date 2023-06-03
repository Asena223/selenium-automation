package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test9_RightClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/buttons");

        WebElement rightClickButton=driver.findElement(By.id("rightClickBtn"));
        Actions action=new Actions(driver);
        action.contextClick(rightClickButton).perform();

        WebElement rightClickMessage=driver.findElement(By.id("rightClickMessage"));
        String rightMessage= rightClickMessage.getText();
        System.out.println(rightMessage);
    }
}
