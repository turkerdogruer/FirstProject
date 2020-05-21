package Test0002;

import java.util.List;

import org.junit.Test;

import org.junit.Before;

import org.junit.After;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumTest5 {

	WebDriver driver = new FirefoxDriver();
	private String baseUrl = "http://docs.seleniumhq.org/docs/03_webdriver.jsp#introducing-the-selenium-webdriver-api-by-example";

	@Test
	public void findElements() {
		driver.get(baseUrl);

		try {
			List<WebElement> elements = driver.findElements(By.id("by-id"));
			System.out.println("number of elements: " + elements.size());

			for (WebElement ele : elements) {
				System.out.println(ele.getTagName());

				System.out.println("get the text for web element with id='by-id' ");
				System.out.println("------------------------------------------------------------");
				System.out.println(ele.getText());
				System.out.println("------------------------------------------------------------");
				System.out.println(ele.getAttribute("id"));
				System.out.println(ele.getCssValue("font-size"));

			}
		}

		finally {
			// driver.close();
			driver.quit();
		}

	}

}
