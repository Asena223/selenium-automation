package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeTest2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();

        //uzun uğraş sonucu oldu. genelde cssSelector ve xpath vs onların kodunu alıp yapmaya çalıştım olmayınca alternatif yoldan ilerledim:))
        String beklenenTitle="Müzik";
        WebElement tablardanAc=driver.findElement(new By.ByLinkText(beklenenTitle));
        tablardanAc.click();
    }
}
