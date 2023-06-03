package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaykarTest_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://baykartech.com/tr/");
        driver.manage().window().maximize();

        WebElement kariyerElement = driver.findElement(new By.ByCssSelector("#navbarHeaderNav > div > a:nth-child(4)"));
        kariyerElement.click();

        WebElement acikPozisyonlarElement = driver.findElement(new By.ByCssSelector("body > div.wrapper > a > button"));
        acikPozisyonlarElement.click();

        WebElement birimAraElement = driver.findElement(new By.ByCssSelector("input#myInput2"));
        birimAraElement.sendKeys("Yapay Zeka Yazılım Teknolojileri");

        WebElement checkBox = driver.findElement(new By.ByCssSelector("#\\35 1"));
        checkBox.click();

        String benim_istediğim_Alan = "Yapay Zeka Yazılım Mühendisi";
        WebElement işİlaniAra = driver.findElement(new By.ByCssSelector("#myInput"));
        işİlaniAra.sendKeys(benim_istediğim_Alan);

        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"myUL\"]"));
        for (int i = 0; i < elements.size(); i++) {
            System.out.println("İlan İçerikleri:" +elements.get(i).getText());
        }
    }
}
