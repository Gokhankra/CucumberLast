package code.stepsDefinitions;

import code.utils.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;


public class hoverover {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/hovers");

        WebElement user2=driver.findElement(By.xpath("(//div[@class='figure'])[2]"));
        WebElement user3=driver.findElement(By.xpath("(//div[@class='figure'])[3]"));

        WebElement user2name= driver.findElement(By.xpath("//*[text()='name: user2']"));

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertFalse(user2name.isDisplayed(),"it is not displayed");
        if (user2name.isDisplayed()){
            System.out.println("it is displayed");
        }else{
            System.out.println("user2name is not displayed");
        }
        Thread.sleep(2000);
        Actions actions=new Actions(driver);
        actions.clickAndHold(user2).perform();
        Assert.assertTrue(user2name.isDisplayed());
        actions.click(user3).build().perform();


    }
}
