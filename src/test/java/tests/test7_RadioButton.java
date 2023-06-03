package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test7_RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        ///////
        WebElement yesRadioButtonLabel = driver.findElement(new By.ByCssSelector("label[for=\"yesRadio\"]"));
        boolean isEnabled = yesRadioButtonLabel.isEnabled();
        if (isEnabled) {
            yesRadioButtonLabel.click();
            System.out.println("Clicked yesRadio button");
        }
        ///////radio butonlarda label ile button id lerini karıştırma label tıklayınca getirmez. radio button tıklayınca getirir.
        WebElement yesRadioButton=driver.findElement(By.id("yesRadio"));
        boolean isSelected=yesRadioButton.isSelected();
        if (isSelected){
            System.out.println("Radio button is selected");
        }
        ///////
        WebElement output=driver.findElement(new By.ByCssSelector(".mt-3"));
        String outputElement=output.getText();
        System.out.println(outputElement);

        ///////no buttonun tıklanıp tıklanmadığını belirler. isenabled tıklanır mı false geldi yani tıklanamaz.
        WebElement noRadioButton=driver.findElement(By.id("noRadio"));
        boolean isEnabled1=noRadioButton.isEnabled();
        System.out.println(isEnabled1);

    }
}
