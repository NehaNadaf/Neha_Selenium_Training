package Report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginAutomation_1 {

	ChromeDriver driver;
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterClass
	public void teardown() {
		//driver.quit();
	}
	@Test
	//ChromeDriver driver= new ChromeDriver();
	//driver.get("https://ineuron-courses.vercel.app/login");
	public void login() {

		WebElement username=driver.findElement(By.name("email1"));
		username.sendKeys("SapientTraining@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("Abcd@1234");
		driver.findElement(By.className("submit-btn")).click();
		Assert.assertTrue(username.isDisplayed());

	}

}
