package Test0002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class seleniumTest3 {
	public static void main(String[] args) {

		/*
		 * In this sample test, we will automate the following test scenarios:
		 * Invoke Chrome Browser Open URL: https://www.google.co.in/ Get Page Title name
		 * and Title length Print Page Title and Title length on the Eclipse Console Get
		 * page URL and verify whether it is the desired page or not Get page Source and
		 * Page Source length Print page Length on Eclipse Console. Close the Browser
		 * For our test purpose, we are using the home page of "Google" search engine. 
		 * We will create our test case step by step to give you a complete
		 * understanding on how to use Browser Commands in WebDriver
		 */

		// System Property for Gecko Driver
		System.setProperty("webdriver.gecko.driver", "D:\\GeckoDriver\\geckodriver.exe");

		// Initialize Gecko Driver using Desired Capabilities Class
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);

		// Launch Website
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

		// Fetch the text "This is sample text." and print it on console
		// Use the class name of the div to locate it and then fetch text using
		// getText() method
		String sampleText = driver.findElement(By.className("col-md-12")).getText();
		System.out.println(sampleText);

		// Use the linkText locator method to find the link and perform click using
		// click() method
		driver.findElement(By.linkText("This is a link")).click();

		// Click on the textbox and send value
		driver.findElement(By.id("fname")).sendKeys("JavaTpoint");

		// Clear the text written in the textbox
		driver.findElement(By.id("fname")).clear();

		// Click on the Submit button using click() command
		driver.findElement(By.id("idOfButton")).click();

		// Locate the radio button by id and check it using click() function
		driver.findElement(By.id("male")).click();

		// Locate the checkbox by cssSelector and check it using click() function
		driver.findElement(By.cssSelector("input.Automation")).click();

		// Use Select class for selecting value from dropdown
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Automation Testing");

		// Close the Browser
		driver.close();

	}

}
