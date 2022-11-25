package day5TesTNG;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumGridDemo2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("osVersion", "16");
     	capabilities.setCapability("deviceName", "iPhone 14");
     	
		URL url =null;
		try {
			url=new URL("https://nehasn_fTEOls:drcqUrTp1ewwLMArjty4@hub-cloud.browserstack.com/wd/hub");
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		driver=new RemoteWebDriver(url,capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void validCredentials()
	{
		//        WebDriver driver=new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//b[text()='Admin']")).isDisplayed(), true);
		//Assert.assertEquals(driver.getCurrentUrl().contains("dashboard"), true);
	}
	

}

