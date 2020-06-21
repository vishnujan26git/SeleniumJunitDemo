package test.junit.automation.SeleniumWithJunit;

import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	WebDriver driver;
	String title;

	@BeforeEach
	public void setUp() {
		WebDriverManager.getInstance(CHROME).setup();
		driver = new ChromeDriver();
	}

	@AfterEach
	public void tearDown() {
		driver.quit();
	}

}
