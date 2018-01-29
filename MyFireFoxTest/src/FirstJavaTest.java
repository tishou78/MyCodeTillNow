import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstJavaTest {
	WebDriver driver;

	@Before public void setUp() {
		driver = //we will update this part with each section driver.get("http://pragmatic.bg/automation/"); }

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test public void testExample1() { // We will put examples in here } @Test public void testExample2() { // We will put examples in here } }
	}