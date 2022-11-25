package Report;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumScript4 {
WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://ineuron-courses.vercel.app/signup");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @AfterClass
    public void teardown() {
        driver.quit();
    }
    @Parameters("browsers")
    @Test

public void display() {


        WebElement stateDropdown = driver.findElement(By.id("state"));
        Select state = new Select(stateDropdown);

        List<WebElement> allValues = state.getOptions();
        for(WebElement ele:allValues) {
            System.out.println(ele.getText());
            String st=ele.getText();
            if(st.contains("Rajasthan"))
            {
                System.out.println("Found the required result");
                System.out.println(ele.getText());
                break;
            }

        }
        state.selectByVisibleText("Rajasthan");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/form/div/a")).click();
        driver.findElement(By.linkText("New user? Signup")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("signup"));

   }
}
