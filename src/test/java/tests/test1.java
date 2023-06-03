package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver"); //makinenin anlayacağı şekilde yazdık, path belirledik
        WebDriver driver=new ChromeDriver(); //driver objesi oluşturduk hangisini kullanacaksak

        driver.get("https://demoqa.com/text-box"); //belirlenen sayfa açıldı
        driver.manage().window().maximize();//web sayfası açıldıktan sonra sayfayı büyütecek

        WebElement nameElement=driver.findElement(By.id("userName"));//web element objesi oluşturduk ve
        //web elementleri genelde findElement methodu ile bulunuyor.
        nameElement.click();//tıkladık
        nameElement.sendKeys("ASENA");

    }
}
