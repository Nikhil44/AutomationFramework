package utility;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {
	public static WebDriver driver = null;
	private static Logger Log = LogManager.getLogger(LogClass.class.getName()); 
	
	public static WebDriver OpenBrowser(int iTestCaseRow) throws Exception{

		String sBrowserName;

		try{

		sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Browser);

		if(sBrowserName.equals("chrome")){
			WebDriverManager.chromedriver().browserVersion("115.0.5790.102 ").setup();
			//WebDriverManager.chromedriver().create();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			//options.addArguments("--remote-allow-origins=*");

			 driver = new ChromeDriver(options);
			//driver = new ChromeDriver();

			Log.info("New driver instantiated");
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		    Log.info("Implicit wait applied on the driver for 10 seconds");

		    driver.get(Constant.URL);

		    Log.info("Web application launched successfully");

			}

		}catch (Exception e){

			Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());

		}

		return driver;

	}

	public static String getTestCaseName(String sTestCase)throws Exception{

		String value = sTestCase;

		try{

			int posi = value.indexOf("@");

			value = value.substring(0, posi);

			posi = value.lastIndexOf(".");	

			value = value.substring(posi + 1);

			return value;

				}catch (Exception e){

			Log.error("Class Utils | Method getTestCaseName | Exception desc : "+e.getMessage());

			throw (e);

					}

			}

	 public static void mouseHoverAction(WebElement mainElement, String subElement){

		 Actions action = new Actions(driver);

         action.moveToElement(mainElement).perform();

         if(subElement.equals("Accessories")){

        	 action.moveToElement(driver.findElement(By.linkText("Accessories")));

        	 Log.info("Accessories link is found under Product Category");

         }

         if(subElement.equals("iMacs")){

        	 action.moveToElement(driver.findElement(By.linkText("iMacs")));

        	 Log.info("iMacs link is found under Product Category");

         }

         if(subElement.equals("iPads")){

        	 action.moveToElement(driver.findElement(By.linkText("iPads")));

        	 Log.info("iPads link is found under Product Category");

         }

         if(subElement.equals("iPhones")){

        	 action.moveToElement(driver.findElement(By.linkText("iPhones")));

        	 Log.info("iPhones link is found under Product Category");

         }

         action.click();

         action.perform();

         Log.info("Click action is performed on the selected Product Type");

	 }

	 public static void waitForElement(WebElement element){

		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

	     wait.until(ExpectedConditions.elementToBeClickable(element));

	 	}

	 public static void takeScreenshot(String sTestCaseName) throws Exception{

			try{

				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				FileUtils.copyFile(scrFile, new File(Constant.Path_ScreenShot + sTestCaseName +".jpg"));	

			} catch (Exception e){

				Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "+e.getMessage());

				throw new Exception();

			}

		}
	 public static void ScrollBy(int hPixels,int vPixels) throws Exception {
		 try {
       	 JavascriptExecutor js = (JavascriptExecutor)driver;
       	 js.executeScript("window.scrollBy("+hPixels+","+vPixels+")");
	 }catch(Exception e){
			Log.error("Class Utils | Method ScrollBy | Exception occured while scrolling : "+e.getMessage());
			throw new Exception();
	 }
	 }

	

}