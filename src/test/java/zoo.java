import java.time.Duration;
import java.util.List;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class zoo {
	
	WebDriver driver =Base.getdriver();;
	
	@FindBy(xpath= "//table[contains(@id,'cust')]//td[1]")
	List<WebElement>CompaniesCol;
	
	@FindBy(xpath="//table[contains(@id,'cust')]//td[2]")
	List<WebElement>ContactsCol;
	
	@FindBy(xpath= "//table[contains(@id,'cust')]//tr")
	List<WebElement>Rows;
	
	zoo()
	{
		
		PageFactory.initElements(Base.getdriver(),this);
	}
	
	

	@Test
	
	public void m1() {
			
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
		System.out.println("No alert is present");
		}

		
	for(int i=0; i<Rows.size();i++)
	{
		
	if (CompaniesCol.get(i).getText().contains("Amazon"))
	{
		System.out.println("Contact name is " +ContactsCol.get(i).getText());
		break;
	}
	
		
	}
	//driver.close();
	}
	
	
	

}
