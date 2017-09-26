package bg.pragmatic.testshoppragmatic.utils;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminUseButton {

	static WebDriver driver;

	public AdminUseButton() {

		super();

	}

	public static void showTitleBut() {

		Select buttonSel = new Select(driver.findElement(By.cssSelector("a.top")));

		List<String> exp_options = Arrays.asList(new String[] { "Today", "This Week", "This Month", "This Year" });
		List<String> act_options = new ArrayList<String>();
		for (WebElement option : buttonSel.getOptions())
			act_options.add(option.getText());
	        Object[] array = act_options.toArray();
	        Assert.assertEquals("everything is ok", exp_options, array);
	        
	}

}
