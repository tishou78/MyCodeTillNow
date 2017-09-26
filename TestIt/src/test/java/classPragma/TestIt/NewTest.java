package classPragma.TestIt;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NewTest {
	WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://shop.pragmatic.bg/admin");
	
		
		WebElement userField = driver.findElement(By.name("username"));
		userField.sendKeys("admin");
		
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("parola");
		
		WebElement loginButton = driver.findElement(By.linkText("Login"));
		loginButton.click();
	}

	@After
	public void tearDown(){
		driver.quit();
	}

	@Test
	public void test() {
		Assert.assertEquals("Dashboard",driver.getTitle());
		driver.findElement(By.cssSelector("a.top")).click();
		driver.findElement(By.cssSelector("#catalog > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)")).click();

		driver.findElement(By.linkText("#catalog > ul:nth-child(2) > li:nth-child(4) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")).click();
		Assert.assertEquals("Attrbutes", driver.getTitle());
		
	}

}
