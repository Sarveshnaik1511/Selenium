package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import basicAutomation.Browser;

public class KeyboardActions {

	public static void main(String[] args) {
		WebDriver driver = Browser.launchBrowser("https://demoqa.com/text-box");
		Actions actions = new Actions(driver);

		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Sarvesh Naik");

		// Keys class have multiple keys
		// Firstly we have used TAB key, To go from one input field to another
		actions.sendKeys(Keys.TAB);

		// Then we have inputed some text
		actions.sendKeys("sarvesh@dfhe");

		actions.sendKeys(Keys.TAB);

		actions.sendKeys("at post pikule dodamarg");

		// here we used keyDown method, Keydown method will hold the specified key

		actions.keyDown(Keys.CONTROL);

		// then here we have taped "A" along with control which was still holded
		// so now the text has been selected all
		actions.sendKeys("A");

		// then here we copied the selected by taping on "c"
		// we can pass capital or small, output will come same
		actions.sendKeys("c");

		// now here we have used KeyUp method to release the Control key
		actions.keyUp(Keys.CONTROL);

		// here we have went to the next field
		actions.sendKeys(Keys.TAB);

		// again taped and holded control key
		actions.keyDown(Keys.CONTROL);

		// here given V key
		// so the copied part has been pasted in tthe field
		actions.sendKeys("v");

		// releasd control key
		actions.keyUp(Keys.CONTROL);

		actions.build().perform();

	}
}
