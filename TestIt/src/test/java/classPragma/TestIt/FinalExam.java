package classPragma.TestIt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;




public class FinalExam {
	public WebDriver driver;
	
	@Before
	public void openUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://shop.pragmatic.bg/admin");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("parola");
		driver.findElement(By.linkText("Login")).click();
	}
	
	@After
	public void tearDown(){
		
		driver.quit();
	}
	@Test
	public void Test(){
		driver.findElement(By.cssSelector("#catalog>a")).click();
		driver.findElement(By.linkText("Products")).click();
		WebElement enterName = driver.findElement(By.name("filter_name"));
		enterName.clear();
		enterName.sendKeys("tisho");
		driver.findElement(By.xpath("//table[@class='list']//tr[@class='filter']/td[8]/a")).click();
		if(driver.findElements(By.xpath("//table[@class='list']//tr[2]/td[3]")).size()!=0){
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='list']/tbody/tr[2]"));
        for (WebElement curRow : allRows) {
            // Dealing with columns in the table
            List<WebElement> allColumns = curRow.findElements(By.tagName("td"));
            for (WebElement curColumn : allColumns) {
                if (curColumn.getText().equals("tisho")) {
                	
                    curRow.findElement(By.name("selected[]")).click();
                    driver.findElement(By.linkText("Delete")).click();

                    try {
                        // Get the Alert
                        Alert alert = driver.switchTo().alert();

                        // Click OK button, by calling accept() method of
                        // Alert Class
                        alert.accept();

                        // Verify product is deleted
                        String actualMessage = driver.findElement(By.className("success")).getText();
                        Assert.assertEquals("The message is not as expected",
                                "Success: You have modified products!", actualMessage);
                        break;

                    } catch (NoAlertPresentException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
		}
	}
}
		/*driver.findElement(By.cssSelector("#catalog>a")).click();
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.name("filter_name")).sendKeys("tisho");

		
		
		drive.findElements(By.xpath("//table[@class='list']//tr[2]/td[3]"));
		for(WebElement findEl: findElements){
		   if(findEl.getText().equals(name) ){
			   driver.findElement(By.name("selected[]")).click();
			   driver.findElement(By.cssSelector("//div[@class='buttons']/a[3]")).click();
		**/
	
	//driver.findElement(By.cssSelector("a.button")).click();
	//WebElement insertBut = driver.findElement(By.linkText("Insert"));
	//WebElement saveBut = driver.findElement(By.linkText("Save"));
	

    

