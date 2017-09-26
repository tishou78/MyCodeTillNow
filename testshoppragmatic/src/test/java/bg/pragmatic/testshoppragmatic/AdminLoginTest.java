package bg.pragmatic.testshoppragmatic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bg.pragmatic.testshoppragmatic.pages.AdminDashboard;
import bg.pragmatic.testshoppragmatic.pages.AdminLogin;
import bg.pragmatic.testshoppragmatic.utils.AdminUseButton;
import bg.pragmatic.testshoppragmatic.utils.Browser;

public class AdminLoginTest {

	@Before
	public void setup(){
		Browser.init();
	}
	@Test
	public void successfulLogin(){
		AdminLogin.open();
		AdminLogin.login("admin","parola");
		
		AdminDashboard.verifyTitle("Dashboard");
	}
	@Test
	public void unsuccessfulLogin(){
		AdminLogin.open();
		AdminLogin.login("blabal", "123456");
		AdminLogin.verifyValidationMessage("No match for Username and/or Password.");
	}
	@Test
	public void buttonRnge(){
		AdminLogin.open();
		AdminLogin.login("admin","parola");
		AdminUseButton.showTitleBut();
		
	}
	@After
	public void tearDown(){
		Browser.quit();
	}
}
