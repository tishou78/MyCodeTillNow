package QAtests.ManualTesting;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.TestCase;

public class ShareLaneTest extends TestCase {
	WebDriver driver;
	WebElement element;
	
   @Before
	protected void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get("http://main.sharelane.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
   @Test
   public void testSL(){
	   element.findElement(By.cssSelector("a>b"));
	   element.click();
	   assertEquals("Not equallity", "ShareLane-your test application", driver.getTitle());
	   
	   
   }
   
   @After
	protected void tearDown() throws Exception {
		driver.quit();
	}

}
