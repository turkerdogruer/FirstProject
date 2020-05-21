package FirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class asa {
	public static void main(String[] args) {
		String url = ("https://images.search.yahoo.com/");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		driver.findElement(By.id("yschsp")).sendKeys("Be Happy Ahmet");
		driver.findElement(By.className("ygbt")).click();
	}
}