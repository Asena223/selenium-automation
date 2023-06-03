package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationLevel {
    public static void main(String[] args) {
        //burada bildirimleri devre dışı bırakabilmek adına bir chrome anahtarı ekledim.
        // bu options' u da ChromeDriver constructor' a ekledim ve sonucunda artık siteye gittiğinde o sitedeki bildirimleri göstermemektedir.
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.trendyol.com/");
    }
}
