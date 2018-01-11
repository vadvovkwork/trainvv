package litecart;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MyFirstTest {

	private WebDriver driver;
	private WebDriverWait wait;
	
	@BeforeMethod
	public void start (){
		//System.setProperty("java.home", "C:\\Program Files\\Java\\jdk1.8.0_121");
		//driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\workspace\\tools\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// System.setProperty("webdriver.firefox.marionette","C:\\workspace\\tools\\geckodriver.exe");
		 //WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
	}
	
	@Test
	public void myFirstTest(){
		//driver.navigate().to("http://www.google.com");
		   String baseUrl = "https://chlist.sitechco.ru/project/12309/checklist";
	        //String baseUrl = "https://chlist.sitechco.ru/project/12326/checklist";
	      
	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);
		
		//driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("webdriver");
		driver.findElement(By.name("btnG")).click();
		
		//wait.until(titleIs("webdriver - Пои�?к в Google"));
	}
	
	@AfterMethod
	public void stop(){
		driver.quit();
		driver = null;
	}
	
}
