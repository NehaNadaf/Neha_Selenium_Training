package day1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a//b[text()='Admin']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='systemUser[employeeName][empName]']")).sendKeys("Mukesh Otwani");
		driver.findElement(By.xpath("//input[@name='systemUser[userName]']")).sendKeys("NehaNadaf");
		driver.findElement(By.xpath("//input[@name='systemUser[password]']")).sendKeys("Minity@37");
		driver.findElement(By.xpath("//input[@name='systemUser[confirmPassword]']")).sendKeys("Minity@37");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='btnSave']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("NehaNadaf");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Minity@37");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");

		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a//b[text()='Admin']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='btnDelete']")).click();


	}
}
