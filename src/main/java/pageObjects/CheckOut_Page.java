package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.LogClass;

public class CheckOut_Page extends BaseClass{

	private static WebElement element;

	public static String sProductName;

	public static String sProductPrice;

 public CheckOut_Page(WebDriver driver){

	super(driver);

	}

 public static WebElement txt_ProductPrice(){

	 element = null;

   	try{

   		element= driver.findElement(By.xpath(".//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[4]"));

   		LogClass.info("Product Price for purchased product is found on the Check Out Page");

   	}catch (Exception e){

   		LogClass.error("Price for purchased product on Check Out page is not found");

   		throw(e);

   		}

   	return element;

    }

 public static WebElement txt_ProductName(){

	 element = null;

   	try{

   		element= driver.findElement(By.xpath(".//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[2]/a"));

   		LogClass.info("Product Name for purchased product is found on the Check Out Page");

   	}catch (Exception e){

   		LogClass.error("Price for purchased product on Check Out page is not found");

   		throw(e);

   		}

   	return element;

    }

 public static WebElement btn_Continue(){

	 element = null;

   	try{

   		element= driver.findElement(By.xpath(".//*[@id='checkout_page_container']/div[1]/a/span"));

   		LogClass.info("Continue button is found on the Check Out Page");

   	}catch (Exception e){

   		LogClass.error("Continue button on Check Out page is not found");

   		throw(e);

   		}

   	return element;

    }

}
