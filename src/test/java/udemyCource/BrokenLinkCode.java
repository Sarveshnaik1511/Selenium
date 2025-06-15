package udemyCource;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import basicAutomation.Browser;

public class BrokenLinkCode {

    @Test
    public void automateBrokenLink() throws IOException, URISyntaxException {
        WebDriver driver = Browser.launchBrowser("https://rahulshettyacademy.com/AutomationPractice/#/");

        // A broken link is a hyperlink that doesn't work or leads to an error page.
        // We'll retrieve the link and check its status code.
        // If the response code is in the 200s, it’s working.
        // If it’s 400 or above, it’s broken.

        String link = driver.findElement(By.xpath("//a[text()='SoapUI']")).getDomAttribute("href");
        System.out.println(link);

        // Convert the link to a URI, then to a URL, and open a connection
        HttpURLConnection conn = (HttpURLConnection) new URI(link).toURL().openConnection();

        // We use "HEAD" because we only want to fetch the status, not the full content
        conn.setRequestMethod("HEAD");
        conn.connect();

        // Get the response status code
        int responseCode = conn.getResponseCode();
        System.out.println(responseCode);

        // This allows us to verify the link's status without actually clicking on it
    }

    @Test
    public void getAllLinksAndValidate() throws MalformedURLException, IOException, URISyntaxException {
        WebDriver driver = Browser.launchBrowser("https://rahulshettyacademy.com/AutomationPractice/#/");
        List<WebElement> allItems = driver.findElements(By.xpath("//li[@class='gf-li']//a"));

        // Get the current base URL
        // Useful if href values are relative (like "/contact")
        String baseUrl = driver.getCurrentUrl();
        SoftAssert sf = new SoftAssert();

        for (int i = 0; i < allItems.size(); i++) {
            String link = allItems.get(i).getDomAttribute("href");

            // If the link is relative, resolve it against the base URL
            if (link != null && !link.contains("http")) {
                link = new URI(baseUrl).resolve(link).toString();
            }

            if (link != null) {
                HttpURLConnection conn = (HttpURLConnection) new URI(link).toURL().openConnection();
                conn.setRequestMethod("HEAD");
                conn.connect();
                int responseCode = conn.getResponseCode();
                System.out.println(responseCode);

                if (responseCode >= 400) {
                    System.out.println("The link with text \"" + allItems.get(i).getText() + "\" is broken with code " + responseCode);
                    sf.assertTrue(false, "Broken link: " + link);
                }
            } else {
                System.out.println("Null or invalid href found for element with text: " + allItems.get(i).getText());
            }
        }
        sf.assertAll(); // Collect and assert all broken link validations
    }
}
