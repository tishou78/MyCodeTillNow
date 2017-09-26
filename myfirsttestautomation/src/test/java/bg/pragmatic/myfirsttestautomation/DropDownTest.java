package bg.pragmatic.myfirsttestautomation;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownTest {
	private static WebDriver driver;
	
	@BeforeClass
	public static void openUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://shop.pragmatic.bg/admin");
	}

	@AfterClass
	public static void tearDown(){
		driver.quit();
	}

	@Test
	public void test() {
		WebElement usernameInp = driver.findElement(By.name("username"));
		usernameInp.sendKeys("admin");
		WebElement passwordInp = driver.findElement(By.name("password"));
		passwordInp.sendKeys("parola");
		driver.findElement(By.cssSelector("a.button")).click();
	}	
	@Test
	public void test2(){
	
		Select buttonSel = new Select(driver.findElement(By.id("range")));
		
		assertFalse(buttonSel.isMultiple());
		assertEquals(4, buttonSel.getOptions().size());
		List<String> exp_options = Arrays.asList(new String[]{"Today", "This Week", "This Month","This Year"});
    	List<String> act_options = new ArrayList<String>();
    	for (WebElement option : buttonSel.getOptions())
    		act_options.add(option.getText());
		assertArrayEquals(exp_options.toArray(), act_options.toArray());	
		
	}
	
	
	
}
