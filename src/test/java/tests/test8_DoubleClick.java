package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test8_DoubleClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/buttons");

        /////DOUBLE CLİCK ACTİON CLASS I İLE YAPILMAKTADIR./////
        WebElement doubleClickButton=driver.findElement(By.id("doubleClickBtn"));
        Actions action=new Actions(driver); //Actions class içinde hangi parametreyi alacağını gösteriyor zaten.
        action.doubleClick(doubleClickButton).perform();//doubleclick alacağı elementi onun Actions içinden bakıyoruz

        WebElement doubleClickButtonMessage=driver.findElement(By.id("doubleClickMessage"));
        String doubleClickMessage=doubleClickButtonMessage.getText();
        System.out.println(doubleClickMessage);

    }
}
