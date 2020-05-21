package FirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		Faker fake = new Faker();

		driver.get("https://google.com");
		waitPlease(2);
		driver.findElement(By.name("q")).click();
		waitPlease(2);
		String name = fake.artist().name();
		driver.findElement(By.name("q")).sendKeys(name, Keys.ENTER);
		waitPlease(10);

		driver.close();

	}

	public static void waitPlease(int num) {
		try {
			Thread.sleep(num * 1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}