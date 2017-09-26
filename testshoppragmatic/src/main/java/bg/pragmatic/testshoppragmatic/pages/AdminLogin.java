package bg.pragmatic.testshoppragmatic.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import bg.pragmatic.testshoppragmatic.utils.Browser;

public class AdminLogin {

	public static void open() {
		Browser.driver.get("http://shop.pragmatic.bg/admin");
		
	}

	public static void login(String username, String password) {
		Browser.driver.findElement(By.name("username")).sendKeys(username);
		Browser.driver.findElement(By.name("password")).sendKeys(password);
		Browser.driver.findElement(By.linkText("Login")).click();
	}

	public static void verifyValidationMessage(String expectedValidationMessage) {
		WebElement validationMessage = Browser.driver.findElement(By.ByName.className("warning"));
		String actualValidationMessage = validationMessage.getText();
		Assert.assertEquals("the text is not the same", expectedValidationMessage, actualValidationMessage);
		
		
	}

}
