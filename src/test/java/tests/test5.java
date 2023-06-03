package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/checkbox");

        String homeCheckBoxCssValue="label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement homeCheckBox=driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        homeCheckBox.click();

        homeCheckBox=driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));//tekrar ekleme nedenimiz dom değiştiği için bulmakta sorun yaşadı. önce bulacak sonra işlem yapacak
        String homeCheckBoxClassName=homeCheckBox.getAttribute("class");
        if (homeCheckBoxClassName.equals("rct-icon rct-icon-check")){
            System.out.println("Checkbox is checked!");
        }else {
            System.out.println("Checkbox is unchecked!");
        }
    }
}
