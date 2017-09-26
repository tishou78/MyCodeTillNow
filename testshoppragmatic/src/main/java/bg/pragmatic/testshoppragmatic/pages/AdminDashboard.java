package bg.pragmatic.testshoppragmatic.pages;



import org.junit.Assert;

import bg.pragmatic.testshoppragmatic.utils.Browser;

public class AdminDashboard {

	public static void verifyTitle(String expectedTitle) {
		String actualTitle = Browser.driver.getTitle();
		Assert.assertEquals("sdafasdf", expectedTitle, actualTitle);
		
	}

}
