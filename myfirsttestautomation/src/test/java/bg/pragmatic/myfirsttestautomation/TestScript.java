package bg.pragmatic.myfirsttestautomation;




import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
	WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown(){
		driver.quit();
	}

	@Test
	public void testOne() {
		driver.get("http://shop.pragmatic.bg/admin");
		WebElement usernameInput = driver.findElement(By.name("username"));
		usernameInput.sendKeys("admin");
		WebElement passwordInput = driver.findElement(By.name("password"));
		passwordInput.sendKeys("parola");
		driver.findElement(By.cssSelector("a.button")).click();
		String parentWindowId = driver.getWindowHandle();
		assertEquals(parentWindowId,driver.getWindowHandle());
    }

}
