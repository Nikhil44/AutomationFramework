package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.LogClass;
import utility.Utils;


public class LogIn_Page extends BaseClass {
	private static WebElement element = null;

    public LogIn_Page(WebDriver driver){

        	super(driver);

    }     

    public static WebElement txtbx_UserName() throws Exception{

    	try{

            element = driver.findElement(By.id("userName"));

            LogClass.info("Username text box is found on the Login Page");

    	}catch (Exception e){

    		LogClass.error("UserName text box is not found on the Login Page");

       		throw(e);

       		}

       	return element;

        }

    public static WebElement txtbx_Password() throws Exception{

    	try{

        	element = driver.findElement(By.id("password"));

        	LogClass.info("Password text box is found on the Login page");

    	}catch (Exception e){

    		LogClass.error("Password text box is not found on the Login Page");

       		throw(e);

       		}

       	return element;

    }

    public static WebElement btn_LogIn() throws Exception{

    	try{
    		Utils.ScrollBy(0, 250);
        	element = driver.findElement(By.id("login"));

        	LogClass.info("Submit button is found on the Login page");

    	}catch (Exception e){

    		LogClass.error("Submit button is not found on the Login Page");

       		throw(e);

       		}

       	return element;

    }

}
