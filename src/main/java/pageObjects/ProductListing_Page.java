package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.LogClass;

public class ProductListing_Page extends BaseClass {
	private static WebElement element;

    public ProductListing_Page(WebDriver driver){

    	super(driver);

    	} 

     public static class Product_1{

    	 public static WebElement txt_Price(){

        	 element = null;

           	try{

           		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[2]/form/div[1]/p[1]/span[2]"));

           		LogClass.info("Product Price is found for Product 1");

           	}catch (Exception e){

           		LogClass.error("Product 1 Sales Price is not found");

           		throw(e);

           		}

           	return element;

            }

         public static WebElement img_Product(){

        	 element = null;

          	try{

          		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[1]/a"));

          		LogClass.info("Product Image is found for Product 1");

          	}catch (Exception e){

          		LogClass.error("Product 1 Image is not found");

          		throw(e);

          		}

          	return element;

            }

         public static WebElement txt_Name() throws Exception{

            element = null;

         	try{

         		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[2]/h2"));

         		LogClass.info("Product Name is found for Product 1");

         	}catch (Exception e){

         		LogClass.error("Product 1 Name is not found");

         		throw(e);

         		}

         	return element;

            }

         public static WebElement btn_AddToCart(){

        	  element = null;

           	try{

           		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[2]/form/div[2]/div[1]/span/input"));

           		LogClass.info("Add to Cart button is found for Product 1");

           	}catch (Exception e){

           		LogClass.error("Product 1 Add to Cart button is not found");

           		throw(e);

           		}

           	return element;

         	}

         }

	public static class Product_2{

		 public static WebElement txt_Price(){

	    	 element = null;

	       	try{

	       		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[4]/div[2]/form/div[1]/p[1]/span[2]"));

	       		LogClass.info("Product Price is found for Product 2");

	       	}catch (Exception e){

	       		LogClass.error("Product 2 Sales Price is not found");

	       		throw(e);

	       		}

	       	return element;

	        }

	     public static WebElement img_Product(){

	    	 element = null;

	      	try{

	      		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[4]/div[1]/a"));

	      		LogClass.info("Product Image is found for Product 2");

	      	}catch (Exception e){

	      		LogClass.error("Product 2 Image is not found");

	      		throw(e);

	      		}

	      	return element;

	        }

	     public static WebElement txt_Name() throws Exception{

	        element = null;

	     	try{

	     		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[2]/h2"));

	     		LogClass.info("Product Name is found for Product 2");

	     	}catch (Exception e){

	     		LogClass.error("Product 2 Name is not found");

	     		throw(e);

	     		}

	     	return element;

	        }

	     public static WebElement btn_AddToCart(){

	    	  element = null;

	       	try{

	       		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[4]/div[2]/form/div[2]/div[1]/span/input"));

	       		LogClass.info("Add to Cart button is found for Product 2");

	       	}catch (Exception e){

	       		LogClass.error("Product 2 Add to Cart button is not found");

	       		throw(e);

	       		}

	       	return element;

	     	}

	     }

	public static class PopUpAddToCart{

		 public static WebElement btn_GoToCart(){

	   	 element = null;

	      	try{

	      		element= driver.findElement(By.xpath(".//*[@id='fancy_notification_content']/a[1]"));

	      		LogClass.info("Go to Cart button is found on the Cart Pop Up window");

	      	}catch (Exception e){

	      		LogClass.info("Go to Cart button is not found on the Cart Pop Up window");

	      		throw(e);

	      		}

	      	return element;

	       }

		 public static WebElement btn_ContShopping(){

		   	 element = null;

		      	try{

		      		element= driver.findElement(By.xpath(".//*[@id='fancy_notification_content']/a[2]"));

		      		LogClass.info("Continue Shopping button is found on Cart Pop Up window");

		      	}catch (Exception e){

		      		LogClass.info("Continue Shopping button is not found on Cart Pop Up window");

		      		throw(e);

		      		}

		      	return element;

		       }

		}

}
