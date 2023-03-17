package code.stepsDefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class den {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement jsclick= driver.findElement(By.xpath("//*[text()='Click for JS Alert']"));

        jsclick.click();

       Alert alert=driver.switchTo().alert();
       alert.accept();
        WebElement js2=driver.findElement(By.xpath("//*[text()='Click for JS Confirm']"));
js2.click();
        Alert alert1=driver.switchTo().alert();
        alert1.dismiss();

        WebElement js3=driver.findElement(By.xpath("//*[text()='Click for JS Prompt']"));

        js3.click();
        Alert aler3=driver.switchTo().alert();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        aler3.sendKeys("kascaslkcnklanscklasc"+ Keys.ENTER);
        aler3.accept();


    }



}





