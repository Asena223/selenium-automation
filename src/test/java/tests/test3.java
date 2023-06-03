package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");
        WebElement nameElement=driver.findElement(new By.ByCssSelector("input.mr-sm-2[placeholder=\"Full Name\"]"));
        nameElement.sendKeys("Emine Asena Küçük");

        WebElement mailElement= driver.findElement(new By.ByCssSelector("input.mr-sm-2[type=\"email\"]"));
        mailElement.sendKeys("guru@gmail.com");

        WebElement currentAdressElement=driver.findElement(By.id("currentAddress"));
        currentAdressElement.sendKeys("Hatay antakya guru guru mahallesi guru sokak no guru");

        WebElement permanentAddressElement=driver.findElement(By.id("permanentAddress"));
        permanentAddressElement.sendKeys("Hatay Antakya");

        WebElement submitElement=driver.findElement(new By.ByCssSelector("button.btn"));
        submitElement.click();

        ////////Yukarıda doldurulan formdan name textini çektim
        WebElement nameText=driver.findElement(By.xpath("//div/p[@id='name']"));
        String name=nameText.getText();
        System.out.println(name);

        WebElement mailText=driver.findElement(By.xpath("//div/p[@id='email']"));
        String email=mailText.getText();
        System.out.println(email);;

        WebElement currentAddressText=driver.findElement(By.xpath("//div/p[@id='currentAddress']"));
        String currentAddress=currentAddressText.getText();
        System.out.println(currentAddress);

        WebElement permanentAddressText=driver.findElement(By.xpath("//div/p[@id='permanentAddress']"));
        String permanenetAddress=permanentAddressText.getText();
        System.out.println(permanenetAddress);


        String homeCheckBoxCssValue="label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement homeCheckBox=driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        homeCheckBox.click();
    }
}
