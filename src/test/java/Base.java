import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	private static ThreadLocal<WebDriver> thdriver;
	private static WebDriver driver;

	private Base()

	{

	}

	public static WebDriver getdriver() {
		if (driver == null) {
			thdriver = new ThreadLocal<WebDriver>();
			driver = thdriver.get();
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			System.out.println("Thread id is " + Thread.currentThread().getId());
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		}
		return driver;
	}

	@Test

	public void testCalender() {
		SelectDate("June", "2026", "2");
	}

	public void SelectDate(String ExpMonth, String ExpYear, String ExpDate) {
		Base obj = new Base();
		driver = obj.getdriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.xpath("//*[@id='datepicker1']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7000));
		wait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy((By.xpath("//div[@class='ui-datepicker-title']"))));
			

		String month = null;
		String year = null;
		String dates;

		System.out.println("month is " + month + "year is " + year);

		do {
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			dates = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			month = dates.split(" ")[0].trim();
			year = dates.split(" ")[1].trim();

		} while (!(month.equals(ExpMonth) && year.equals(ExpYear)));

		driver.findElement(By.linkText(ExpDate)).click();
		System.out.println("The date is " + dates);
	}

	
}