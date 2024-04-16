import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class foo   {

	WebDriver driver;
	
	
	@Test
	
	public void m1()
	{
		driver= Base.getdriver();
		driver.get("https://www.browserstack.com/");
		System.out.println("I am in foo method and the thread id is " + Thread.currentThread().getId());
	}
	
		
}
