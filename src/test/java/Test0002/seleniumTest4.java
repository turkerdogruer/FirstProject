package Test0002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class seleniumTest4 {

	public static void main(String[] args) {

		// System Property for Gecko Driver
		System.setProperty("webdriver.gecko.driver", "D:\\GeckoDriver\\geckodriver.exe");

		// Initialize Gecko Driver using Desired Capabilities Class
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);

		// Launch Website
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

		// Click on the Link Text using click() command
		driver.findElement(By.linkText("This is a Link")).click();

		// Go back to Home Page
		driver.navigate().back();

		// Go forward to Registration page
		driver.navigate().forward();

		// Go back to Home page
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

		// Refresh browser
		driver.navigate().refresh();

		// Closing browser
		driver.close();
	}
}
