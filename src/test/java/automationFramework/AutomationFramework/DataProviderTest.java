package automationFramework.AutomationFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.BaseClass;

public class DataProviderTest extends BaseClass{
	
	
  public DataProviderTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


  @DataProvider(name="Authentication")
  public Object[][] credentials() {
    return new Object[][] {{ "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
  }
  
  
  @Test(dataProvider="Authentication")
	  public void test(String sUsername, String sPassword) {

	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	      driver.get("https://www.store.demoqa.com");

	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();

	      // Argument passed will be used here as String Variable

	      driver.findElement(By.id("log")).sendKeys(sUsername);

	      driver.findElement(By.id("pwd")).sendKeys(sPassword);

	      driver.findElement(By.id("login")).click();

	      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

	      driver.quit();

	  }

	  
  }

