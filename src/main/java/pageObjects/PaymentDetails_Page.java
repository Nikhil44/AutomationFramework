package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.LogClass;

public class PaymentDetails_Page extends BaseClass {

		private static WebElement element;

	 public PaymentDetails_Page(WebDriver driver){

   	     super(driver);

   	    }

	 public static WebElement txt_Email(){

    	 element = null;

       	try{

       		element= driver.findElement(By.id("wpsc_checkout_form_9"));

       		LogClass.info("Email text box on Payment Details page is found.");

       	}catch (Exception e){

       		LogClass.error("Email text box on Payment Details page is not found");

       		throw(e);

       		}

       	return element;

        }

	 public static WebElement txt_FirstName(){

    	 element = null;

       	try{

       		element= driver.findElement(By.id("wpsc_checkout_form_2"));

       		LogClass.info("First Name text box on Payment Details page is found.");

       	}catch (Exception e){

       		LogClass.error("First Name text box on Payment Details page is not found");

       		throw(e);

       		}

       	return element;

        }

	 public static WebElement txt_LastName(){

    	 element = null;

       	try{

       		element= driver.findElement(By.id("wpsc_checkout_form_3"));

       		LogClass.info("Last Name text box on Payment Details page is found.");

       	}catch (Exception e){

       		LogClass.error("Last Name text box on Payment Details page is not found");

       		throw(e);

       		}

       	return element;

        }

	 public static WebElement txt_Address(){

    	 element = null;

       	try{

       		element= driver.findElement(By.id("wpsc_checkout_form_4"));

       		LogClass.info("Address text box on Payment Details page is found.");

       	}catch (Exception e){

       		LogClass.error("Address text box on Payment Details page is not found");

       		throw(e);

       		}

       	return element;

        }

	 public static WebElement txt_City(){

    	 element = null;

       	try{

       		element= driver.findElement(By.id("wpsc_checkout_form_5"));

       		LogClass.info("City text box on Payment Details page is found.");

       	}catch (Exception e){

       		LogClass.error("City text box on Payment Details page is not found");

       		throw(e);

       		}

       	return element;

        }

	 public static void drpdwn_Country(String sCountry){

    	 element = null;

       	try{

       		//Select element= new Select(driver.findElement(By.id("wpsc_checkout_form_7")));
       		LogClass.info("Country dropdown on Payment Details page is found.");

       		//element.selectByVisibleText(sCountry);

       	}catch (Exception e){

       		LogClass.error("Country dropdown on Payment Details page is not found");

       		throw(e);

       		}

        }

	 public static WebElement txt_Phone(){

    	 element = null;

       	try{

       		element= driver.findElement(By.id("wpsc_checkout_form_18"));

       		LogClass.info("Phone text box on Payment Details page is found.");

       	}catch (Exception e){

       		LogClass.error("Phone text box on Payment Details page is not found");

       		throw(e);

       		}

       	return element;

        }

	 public static WebElement chkbx_SameAsBillingAdd(){

    	 element = null;

       	try{

       		element= driver.findElement(By.id("shippingSameBilling"));

       		LogClass.info("Same as Billing address check box on Payment Details page is found.");

       	}catch (Exception e){

       		LogClass.error("Same as Billing address check box on Payment Details page is not found");

       		throw(e);

       		}

       	return element;

        }

	 public static WebElement btn_Purchase(){

    	 element = null;

       	try{

       		element= driver.findElement(By.xpath(".//*[@id='wpsc_shopping_cart_container']/form/div[4]/div/div/span/input"));

       		LogClass.info("Purchase button on Payment Details page is found.");

       	}catch (Exception e){

       		LogClass.error("Purchase button on Personal Details page is not found");

       		throw(e);

       		}

       	return element;

        }
}
