package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuruTest_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");

        String expectedTitle="Welcome: Mercury Tours";
        String reelTitle=driver.getTitle();

        if (reelTitle.contentEquals(expectedTitle)){ //equals' ta da passed oldu
            System.out.println("Test 1 passed");
        }
        else {
            System.out.println("Test 2 failed");
        }
    }
}
