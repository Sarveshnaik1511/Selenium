package udemyCource;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basicAutomation.Browser;

public class AddMultipleProductsToCart {

	@Test
	public void addProductsToCart() {
		WebDriver driver = Browser.launchBrowser("https://rahulshettyacademy.com/seleniumPractise/#/");

		// these are all the vaggies that we want to add to the card
		String[] veggies = { "Brocolli", "Cucumber", "Brinjal", "Onion" };

		
		int k = 0;

		List<WebElement> items = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < items.size(); i++) {

			// Brocolli - 1 kg ..... This is the whole text we have into the website
			// we will split the value and store it in array of string

			String[] productList = items.get(i).getText().split("-");
			String realProductName = productList[0].trim(); // as main value will be in the 0th index, we will use it
															// and trim method will remove back and forward space

			// convert veggies array to ArrayList for easy access
			// check whether the product list you extracted has veggies you wanted or not

			List itemsNeeded = Arrays.asList(veggies);
			

				if (itemsNeeded.contains(realProductName)) {
					
					// we want to stop the execution once we get all the veggies we wantes
					// so we declare one variable names k and started incrementing it once the condition gets satisfies
					// so as many times it gets into this loop, its value will increase

					k++;
					driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
					
					// here, if the value of k and size of veggies equal, that means we got our all vaggies into the cars
					// so we are breaking the loops
					if (k == itemsNeeded.size()) {
						break;
					}

				}

			}

		}
	}

