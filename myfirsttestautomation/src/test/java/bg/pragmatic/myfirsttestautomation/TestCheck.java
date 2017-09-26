package bg.pragmatic.myfirsttestautomation;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class TestCheck {
	WebDriver driver;

	
	@Before
	public void openUp(){
		driver = new FirefoxDriver();
		driver.get("https://dl.dropboxusercontent.com/u/55228056/Config.html");}
	@After
	public void tearDown(){
		driver.quit();
	}

	@Test
	public void test() {
		WebElement kopche = driver.findElement(By.name("airbags"));
		WebElement kvadrat = driver.findElement(By.name("parksensor"));
		Actions builder = new Actions(driver);
		builder.click(kopche);
		builder.click(kvadrat);
		builder.perform();
		assertTrue(kopche.isSelected());
		assertTrue(kvadrat.isSelected());

	}

}
