package bg.pragmatic.myfirsttestautomation;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFrontEnd {
	WebDriver driver;
	
	@Before
	public void openUp(){
		driver = new FirefoxDriver();
		driver.get("http://www.opencart.com/");
	}

	@Test
	public void test() {
		WebElement element = driver.findElement(By.xpath("//div[@id='menu']//li[@id='feature']/a"));
		element.click();
		element.isDisplayed();
		
	}
	@After
	public void tearDown(){
		driver.quit();
	}

}
