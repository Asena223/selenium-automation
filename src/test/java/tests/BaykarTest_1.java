package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaykarTest_1 {
    //GÜVENLİK SEBEBİ İLE MAİL VE ŞİFRE BİLGİLERİMİ KEYDETMEDİM. DOĞRU GİRİNCE ÇALIŞIYOR
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://baykartech.com/tr/");
        driver.manage().window().maximize();

        WebElement tiklaGotur=driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/button/span/i"));
        tiklaGotur.click();

        WebElement kariyerElement=driver.findElement(new By.ByCssSelector("#navbarHeaderNav > div > a:nth-child(4)"));
        kariyerElement.click();

        WebElement acikPozisyonlarButton=driver.findElement(new By.ByCssSelector("body > div.wrapper > a > button"));
        acikPozisyonlarButton.click();
        Thread.sleep(2000);

        WebElement birimAraInput=driver.findElement(By.id("myInput2"));
        birimAraInput.sendKeys("Web Yazılım Teknolojileri");

        WebElement checkBoxBirim=driver.findElement(new By.ByCssSelector("#\\35 0"));
        checkBoxBirim.click();

        WebElement ilan1=driver.findElement(By.xpath("//*[@id=\"myUL\"]/li[1]/div/div[3]/button"));
        ilan1.click();

        WebElement mailLogin=driver.findElement(new By.ByCssSelector("#loginForm > div:nth-child(3) > input"));
        mailLogin.sendKeys("rnd");

        WebElement passwordLogin=driver.findElement(By.id("id_password"));
        passwordLogin.sendKeys("xyz");


        //capctha işaretleyemiyorum google gömmüş sanırım bu yüzden daha fazla ilerleyemiyorum Baykar' da Allahımmmm deli olacağum.
    }
}
