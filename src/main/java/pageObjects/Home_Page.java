package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LogClass;
import utility.Utils;

public class Home_Page extends BaseClass {
	 private static WebElement element = null;

     public Home_Page(WebDriver driver){

         	super(driver);

     }    

     public static WebElement btn_Login() throws Exception{

         try{ 
        	 Thread.sleep(2000);
        	 JavascriptExecutor js = (JavascriptExecutor)driver;
        	 js.executeScript("window.scrollBy(0,250)");
	        	 element = driver.findElement(By.xpath("//*[@id='login']"));

	        	 LogClass.info("My Login button is found on the Home Page");

         }catch (Exception e){

        	 LogClass.error("My Login button is not found on the Home Page");

        		throw(e);

        		}

        	return element;

     }

     public static WebElement lnk_LogOut() throws Exception{

         try{

	        	element = driver.findElement(By.id("submit"));

	        	LogClass.info("Log Out link is found on the Home Page");

         }catch (Exception e){

        	 LogClass.error("Log Out link is not found on the Home Page");

        		throw(e);

        		}

        	return element;

     }

     public static class TopNavigation{

     	public static class Product_Type{

     			static WebElement mainElement;

     		public static void Accessories() throws Exception{

     			try{

	        			mainElement = driver.findElement(By.linkText("Product Category"));

	        			LogClass.info("Product category link is found under Top Navigation");

	        			Utils.mouseHoverAction(mainElement, "Accessories");

     			}catch (Exception e){

     				LogClass.error("Accessories link is not found under Product Category");

     				throw(e);

     			}

                }

     		public static void iMacs() throws Exception{

     			try{

	        			mainElement = driver.findElement(By.linkText("Product Category"));

	        			LogClass.info("Product category link is found under Top Navigation");

	        			Utils.mouseHoverAction(mainElement, "iMacs");

     			}catch (Exception e){

     				LogClass.error("Accessories link is not found under Product Category");

     				throw(e);

     			}

                }

     		public static void iPads() throws Exception{

     			try{

	        			mainElement = driver.findElement(By.linkText("Product Category"));

	        			LogClass.info("Product category link is found under Top Navigation");

	        			Utils.mouseHoverAction(mainElement, "iPads");

     			}catch (Exception e){

     				LogClass.error("Accessories link is not found under Product Category");

     				throw(e);

     			}

                }

     		public static void iPhones() throws Exception{

     			try{

	        			mainElement = driver.findElement(By.linkText("Product Category"));

	        			LogClass.info("Product category link is found under Top Navigation");

	        			Utils.mouseHoverAction(mainElement, "iPhones");

     			}catch (Exception e){

     				LogClass.error("Accessories link is not found under Product Category");

     				throw(e);

     			}

                }

     	}

     }

}
