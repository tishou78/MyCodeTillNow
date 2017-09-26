package bg.pragmatic.myfirsttestautomation;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript2 {
	WebDriver driver;
	@Before
	public void openUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://shop.pragmatic.bg/admin");
	}
	@After
	public void tearDown(){
	 driver.quit();
	}
	@Test
	public void loginFail(){
		WebElement usernameInput = driver.findElement(By.name("username"));
		usernameInput.sendKeys("sezam");
		WebElement passwordInput = driver.findElement(By.name("password"));
		passwordInput.sendKeys("otvorise");
		driver.findElement(By.cssSelector("a.button")).click();
			
		
		
		
		WebElement message = driver.findElement(By.cssSelector("div.warning"));
		String width = message.getText();
		Assert.assertEquals("No match for Username and/or Password.",width);
		
		
	}



}
